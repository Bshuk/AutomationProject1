package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ProductDetails;

public class ProductDetailsTest8 extends TestBase{

	ProductDetails Pdetails;
	
	public ProductDetailsTest8() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		Pdetails =new ProductDetails();
	}
	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =Pdetails.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");

	}
	@Test(priority = 2)
	public void NavigatetoPage() {
		String text = Pdetails.ProductTab();
		Assert.assertEquals(text, "ALL PRODUCTS");	
	}
	
	@Test(priority = 3)
	public void Viewpage() {
		boolean view = Pdetails.CheckProduct();
		Assert.assertTrue(view);
	}
	@Test(priority = 4)
    public void Productinfo() {
		Pdetails.Details();
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}

