package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BeforeCheckout;

public class BeforeCheckoutTest15 extends TestBase{
	
	BeforeCheckout Before;
	
	public BeforeCheckoutTest15() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
		Before = new BeforeCheckout();
	}
	
	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =Before.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	@Test(priority =2)
    public void Usersignup() {
		Before.UserSignup(prop.getProperty("name"), prop.getProperty("Newemail"));
	}
		
	@Test(priority =3)
	public void nextpage() {
		Before.password(prop.getProperty("Password"));
	}
	@Test(priority =4)
	public void Addressdeatils1() {
		Before.Addressinfo1(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Company"), prop.getProperty("Address1"), prop.getProperty("Address2"));
	}
	@Test(priority=5)
	public void Addressdeatils2() {
		Before.Addressinfo2(prop.getProperty("State"), prop.getProperty("CITY"), prop.getProperty("ZiP"), prop.getProperty("MobNum"));
	}
	@Test(priority=6)
	public void accountCreated() {
		boolean Acccreated = Before.AccountCreatedVisible();
		Assert.assertTrue(Acccreated);
	}
	@Test(priority=7)
	public void Userlogged() {
		String proceed =Before.Continue();
		System.out.println(proceed);
		Assert.assertEquals(proceed, "Bhupesh Shukla");
	}
	
	@Test(priority =8)
    public void Add() {
		boolean page = Before.AddProduct();
	    Assert.assertTrue(page);
	}
	
	@Test(priority=9)
    public void verifyaddress() {
		boolean address =Before.Verifyaddress();
		Assert.assertTrue(address);
	}
	@Test(priority=10)
	public void verifyreview() {
		boolean review =Before.ReviewOrder();
		Assert.assertTrue(review);
	}
	@Test(priority=11)
	public void Ordernote() {
		Before.Addcomment(prop.getProperty("Comment"));
	}
	@Test(priority=12)
	public void creditcard() {
		Before.Cardinfo(prop.getProperty("CCName"), prop.getProperty("CCnumber"), prop.getProperty("cvv"), prop.getProperty("expMonth"), prop.getProperty("expYear"));
	}
	@Test(priority=13)
	public void ordermsg() {
		boolean order =Before.SuccessMsg();
		Assert.assertTrue(order);
	}
	@Test(priority=14)
	public void Accdelete() {
		boolean del =Before.AccountDelete();
		Assert.assertTrue(del);
	}
	@Test(priority=15)
	public void Startagain() {
		Before.continueAgain();
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
	
}
	
