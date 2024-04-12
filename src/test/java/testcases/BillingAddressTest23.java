package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BillingAddress;

public class BillingAddressTest23 extends TestBase{
	
	BillingAddress address;
	public BillingAddressTest23() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
		address = new BillingAddress();
	}

	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =address.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	@Test(priority =2)
    public void Usersignup() {
		address.UserSignup(prop.getProperty("name"), prop.getProperty("Newemail"));
	}
		
	@Test(priority =3)
	public void nextpage() {
		address.password(prop.getProperty("Password"));
	}
	@Test(priority =4)
	public void Addressdeatils1() {
		address.Addressinfo1(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Company"), prop.getProperty("Address1"), prop.getProperty("Address2"));
	}
	@Test(priority=5)
	public void Addressdeatils2() {
		address.Addressinfo2(prop.getProperty("State"), prop.getProperty("CITY"), prop.getProperty("ZiP"), prop.getProperty("MobNum"));
	}
	@Test(priority=6)
	public void accountCreated() {
		boolean Acccreated = address.AccountCreatedVisible();
		Assert.assertTrue(Acccreated);
	}
	@Test(priority=7)
	public void Userlogged() {
		String proceed =address.Continue();
		System.out.println(proceed);
		Assert.assertEquals(proceed, "Bhupesh Shukla");
	}
	
	@Test(priority =8)
    public void Add() {
		boolean page = address.AddProduct();
	    Assert.assertTrue(page);
	}
	
	@Test(priority =9)
	public void Checkout() throws InterruptedException {
		address.Gotocart();
	}
	
	@Test(priority =10)
    public void Deladdress() {
		address.Verifyaddress();
	}
	@Test(priority =11)
    public void BillAddress() {
		address.VerifyBilladdress();
	}
	@Test(priority=12)
	public void Accdelete() {
		boolean del =address.AccountDelete();
		Assert.assertTrue(del);
}
	@Test(priority=13)
	public void Startagain() {
		address.continueAgain();
		}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
	
}
	
