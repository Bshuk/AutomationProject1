package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ReviewProduct;

public class ReviewProductTest21 extends TestBase{
	
	ReviewProduct Review;
	
	public ReviewProductTest21() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		Review = new ReviewProduct();
	}
	@Test(priority = 1)
	
     public void Allproduct() {
		String product = Review.ProductTab();
		System.out.println(product);
		Assert.assertEquals(product, "ALL PRODUCTS");
	}
	@Test(priority = 2)
	
	public void ViewButton() {
		String Btn = Review.ViewBtn();
		System.out.println(Btn);
		Assert.assertEquals(Btn, "WRITE YOUR REVIEW");
	}
	
	@Test(priority = 3)
     public void Userdetails() {
		Review.Details(prop.getProperty("name"), prop.getProperty("email"), prop.getProperty("Review"));
	}
	@Test(priority = 4)
	public void SubmitReview() {
		boolean Sucessmsg = Review.SubmitMsg();
		System.out.println(Sucessmsg);
		Assert.assertTrue(Sucessmsg);
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}
