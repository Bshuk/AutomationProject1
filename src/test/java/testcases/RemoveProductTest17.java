package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartQuantity;
import pages.RemoveProduct;

public class RemoveProductTest17 extends TestBase{
	
	RemoveProduct Reemove;
	
	public RemoveProductTest17() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
		Reemove = new RemoveProduct();
}
	
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = Reemove.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
    public void SelectProduct() throws InterruptedException {
		Reemove.Addproduct();
	}
	@Test(priority = 3)
	public void VerifyPage() {
		boolean title = Reemove.ViewPage();
		Assert.assertTrue(title);
	}
	@Test(priority = 4)

	public void Delete() {
		Reemove.Remove();
	}
	
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}
	
