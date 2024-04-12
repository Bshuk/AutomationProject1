package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartQuantity;

public class CartQuantityTest13 extends TestBase{
	
	CartQuantity cartQuantity;
	
	public CartQuantityTest13() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		cartQuantity = new CartQuantity();
}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = cartQuantity.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	
	@Test(priority = 2)
	public void ProductSelection() {
		cartQuantity.SelectProduct();
	}
	@Test(priority = 3)
	public void Quantity() {
		cartQuantity.Quantityofproduct();
	}
	@Test(priority = 4)
	public void DisplayQty() {
		String Num =cartQuantity.ProductDisplay();
		Assert.assertEquals(Num, "4");
	}
	
	 @AfterTest
	  	public void Quit() {
	  		driver.quit();
	  		}
}
	
	