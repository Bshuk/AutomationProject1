package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.SignUpPage;

public class SignUpPageTest1 extends TestBase{
	
	SignUpPage signupPage;
	
	public SignUpPageTest1() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		signupPage= new SignUpPage();
	}
	
	@Test(priority =1)
	public void SignUpPageTitle() {
		String title =signupPage.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	@Test(priority=2)
	    public void newSignup() {
		String text= signupPage.NewSignUp();
		Assert.assertEquals(text, "New User Signup!");	
	}
	@Test(priority=3)
	public void NewuserInfo() {
		signupPage.UserSignup(prop.getProperty("name"), prop.getProperty("Newemail"));
	}
	
	@Test(priority=4)
	public void DateofBirth() {
		signupPage.DOB();
	}
	
	@Test(priority=5)
	public void DetailpageTitle() {
		boolean Title = signupPage.DetailsPageInfo();
		Assert.assertTrue(Title);
	}
	@Test(priority=6)
	public void CreatePassword() {
		signupPage.password(prop.getProperty("Password"));
	}	
	@Test(priority=7)
	public void Addressdeatils1() {
		signupPage.Addressinfo1(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Company"), prop.getProperty("Address1"), prop.getProperty("Address2"));
	}
	@Test(priority=8)
	public void Addressdeatils2() {
		signupPage.Addressinfo2(prop.getProperty("State"), prop.getProperty("CITY"), prop.getProperty("ZiP"), prop.getProperty("MobNum"));
	}
	@Test(priority=9)
	public void accountCreated() {
		boolean Acccreated = signupPage.AccountCreatedVisible();
		Assert.assertTrue(Acccreated);
	}
	@Test(priority=10)
	public void Userlogged() {
		String proceed =signupPage.Continue();
		System.out.println(proceed);
		Assert.assertEquals(proceed, "Bhupesh Shukla");
	}
	@Test(priority=11)
	public void Accountdelete() {
		boolean delete = signupPage.AccountDelete();
		Assert.assertTrue(delete);
	}
	@Test(priority=12)
    public void Restart() {
	signupPage.continueAgain();
	}
     @AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}
