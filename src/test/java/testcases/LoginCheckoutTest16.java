package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BeforeCheckout;
import pages.LoginCheckout;

public class LoginCheckoutTest16 extends TestBase{

	LoginCheckout LogCheck;
	
	public LoginCheckoutTest16() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		LogCheck = new LoginCheckout();
	}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = LogCheck.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	
	@Test(priority = 2)
	public void logincredentials() {
		LogCheck.UserSignup(prop.getProperty("ValidEmail"), prop.getProperty("ValidPassword"));
		boolean userlogged = LogCheck.UserLoggedin();
		Assert.assertTrue(userlogged);
	}
	@Test(priority =8)
    public void Add() {
		boolean page = LogCheck.AddProduct();
	    Assert.assertTrue(page);
	}
	
	@Test(priority=9)
    public void verifyaddress() {
		boolean address =LogCheck.Verifyaddress();
		Assert.assertTrue(address);
	}
	@Test(priority=10)
	public void verifyreview() {
		boolean review =LogCheck.ReviewOrder();
		Assert.assertTrue(review);
	}
	@Test(priority=11)
	public void Ordernote() {
		LogCheck.Addcomment(prop.getProperty("Comment"));
	}
	@Test(priority=12)
	public void creditcard() {
		LogCheck.Cardinfo(prop.getProperty("CCName"), prop.getProperty("CCnumber"), prop.getProperty("cvv"), prop.getProperty("expMonth"), prop.getProperty("expYear"));
	}
	@Test(priority=13)
	public void ordermsg() {
		boolean order =LogCheck.SuccessMsg();
		Assert.assertTrue(order);
	}
/*	@Test(priority=14)
	public void Accdelete() {
		boolean del =LogCheck.AccountDelete();
		Assert.assertTrue(del);
	}
	@Test(priority=15)
	public void Startagain() {
		LogCheck.continueAgain();
	}*/
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
	
}
