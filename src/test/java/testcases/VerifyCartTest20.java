package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginCheckout;
import pages.VerifyCart;

public class VerifyCartTest20 extends TestBase{
       
	VerifyCart Cart;
	
	public VerifyCartTest20() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		Cart = new VerifyCart();
	}
	
	@Test(priority = 1)
	public void ProductPage() {
		boolean page = Cart.NavigatedtoProduct();
		Assert.assertTrue(page);
	}
	@Test(priority = 2)
	public void ItemName() {
		Cart.ProductName(prop.getProperty("item"));
	}
	@Test(priority = 3)
	public void SearcProductVisible() {
		boolean text =Cart.VerifytextSearchProduct();
		Assert.assertTrue(text);
}
	@Test(priority = 4)
	public void AllProductList() {
		Cart.AllProduct();
	}

	@Test(priority = 5)
		public void Add() {
		Cart.Addproducttocart();
	}
	@Test(priority = 6)
	public void Signup() {
		Cart.UserSignup(prop.getProperty("ValidEmail"), prop.getProperty("ValidPassword"));
	}
	@Test(priority = 7)
    public void ValidateCart() {
		boolean item1 = Cart.verifyCart();
		Assert.assertTrue(item1);
	}
	@Test(priority = 8)
	public void Verifycart2() {
		boolean item2 = Cart.ViewCart2();
		Assert.assertTrue(item2);
	}
	
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}
