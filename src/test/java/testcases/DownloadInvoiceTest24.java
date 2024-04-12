package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DownloadInvoice;

public class DownloadInvoiceTest24 extends TestBase{
	
	DownloadInvoice download;
	
	public DownloadInvoiceTest24() {
		super();	
	}
	@BeforeTest
	public void setUp() {
		initalization();
		download = new DownloadInvoice();
		
	}
	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =download.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	
	@Test(priority =2)
    public void Add() {
		boolean page = download.AddProduct();
	    Assert.assertTrue(page);
	}
	@Test(priority =3)
    public void Usersignup() {
		download.UserSignup(prop.getProperty("name"), prop.getProperty("Newemail"));
	}
	@Test(priority =4)
	public void nextpage() {
		download.password(prop.getProperty("Password"));
	}
	@Test(priority =5)
	public void Addressdeatils1() {
		download.Addressinfo1(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Company"), prop.getProperty("Address1"), prop.getProperty("Address2"));
	}
	@Test(priority=6)
	public void Addressdeatils2() {
		download.Addressinfo2(prop.getProperty("State"), prop.getProperty("CITY"), prop.getProperty("ZiP"), prop.getProperty("MobNum"));
	}
	@Test(priority=7)
	public void accountCreated() {
		boolean Acccreated = download.AccountCreatedVisible();
		Assert.assertTrue(Acccreated);
	}
	@Test(priority=8)
	public void Userlogged() {
		String proceed =download.Continue();
		System.out.println(proceed);
		Assert.assertEquals(proceed, "Bhupesh Shukla");
	}
	@Test(priority=9)
    public void GotoCart() throws InterruptedException {
		download.Gotocart();
	}
	@Test(priority=10)
    public void verifyaddress() {
		boolean address =download.Verifyaddress();
		Assert.assertTrue(address);
	}
	@Test(priority=11)
	public void verifyreview() {
		boolean review =download.ReviewOrder();
		Assert.assertTrue(review);
	}
	@Test(priority=12)
	public void Ordernote() {
		download.Addcomment(prop.getProperty("Comment"));
	}
	@Test(priority=13)
	public void creditcard() {
		download.Cardinfo(prop.getProperty("CCName"), prop.getProperty("CCnumber"), prop.getProperty("cvv"), prop.getProperty("expMonth"), prop.getProperty("expYear"));
	}
	@Test(priority=14)
	public void ordermsg() {
		boolean order =download.SuccessMsg();
		Assert.assertTrue(order);
	}
	
	@Test(priority=15)
	public void invoicelocation() {
		download.Download();
	}
	@Test(priority=16)
	public void Accdelete() {
		boolean del =download.AccountDelete();
		Assert.assertTrue(del);
	}
	@Test(priority=17)
	public void Startagain() {
		download.continueAgain();
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
	
}


