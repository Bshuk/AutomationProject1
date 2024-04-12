package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InvalidUser;

public class InvalidUserTest3 extends TestBase{

	InvalidUser invalidUser;
	public InvalidUserTest3(){
		super();	
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
	    invalidUser= new InvalidUser();
	}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = invalidUser.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 3)
	public void Validatelogin() {
		invalidUser.Signupclick();
		boolean title = invalidUser.ValidateHeader();
		Assert.assertTrue(title);
	}
	@Test(priority = 3)
	public void logincredentials() {
		invalidUser.UserSignup(prop.getProperty("InvalidUsername"), prop.getProperty("InvalidPasswd"));
		boolean userlogged = invalidUser.Failuretext();
		Assert.assertTrue(userlogged);
	}
	
	@AfterTest
	public void Quit() {
		driver.quit();
	
	}

	
}


