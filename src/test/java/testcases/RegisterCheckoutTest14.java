package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.RegisterCheckout;

public class RegisterCheckoutTest14 extends TestBase{
	
	RegisterCheckout reg;
	
	public RegisterCheckoutTest14() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		reg = new RegisterCheckout();

}
	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =reg.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	
	@Test(priority =2)
    public void Add() {
		boolean page = reg.AddProduct();
	    Assert.assertTrue(page);
	}
	@Test(priority =3)
    public void Usersignup() {
		reg.UserSignup(prop.getProperty("name"), prop.getProperty("Newemail"));
	}
	@Test(priority =4)
	public void nextpage() {
		reg.password(prop.getProperty("Password"));
	}
	@Test(priority =5)
	public void Addressdeatils1() {
		reg.Addressinfo1(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Company"), prop.getProperty("Address1"), prop.getProperty("Address2"));
	}
	@Test(priority=6)
	public void Addressdeatils2() {
		reg.Addressinfo2(prop.getProperty("State"), prop.getProperty("CITY"), prop.getProperty("ZiP"), prop.getProperty("MobNum"));
	}
	@Test(priority=7)
	public void accountCreated() {
		boolean Acccreated = reg.AccountCreatedVisible();
		Assert.assertTrue(Acccreated);
	}
	@Test(priority=8)
	public void Userlogged() {
		String proceed =reg.Continue();
		System.out.println(proceed);
		Assert.assertEquals(proceed, "Bhupesh Shukla");
	}
	@Test(priority=9)
    public void GotoCart() throws InterruptedException {
		reg.Gotocart();
	}
	@Test(priority=10)
    public void verifyaddress() {
		boolean address =reg.Verifyaddress();
		Assert.assertTrue(address);
	}
	@Test(priority=11)
	public void verifyreview() {
		boolean review =reg.ReviewOrder();
		Assert.assertTrue(review);
	}
	@Test(priority=12)
	public void Ordernote() {
		reg.Addcomment(prop.getProperty("Comment"));
	}
	@Test(priority=13)
	public void creditcard() {
		reg.Cardinfo(prop.getProperty("CCName"), prop.getProperty("CCnumber"), prop.getProperty("cvv"), prop.getProperty("expMonth"), prop.getProperty("expYear"));
	}
	@Test(priority=14)
	public void ordermsg() {
		boolean order =reg.SuccessMsg();
		Assert.assertTrue(order);
	}
	@Test(priority=15)
	public void Accdelete() {
		boolean del =reg.AccountDelete();
		Assert.assertTrue(del);
	}
	@Test(priority=16)
	public void Startagain() {
		reg.continueAgain();
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
	
}