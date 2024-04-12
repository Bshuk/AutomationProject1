package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ValidUser;

public class ValidUserTest2 extends TestBase{
	
	ValidUser validUser;
	
	public ValidUserTest2() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		validUser= new ValidUser();
	}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = validUser.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
	public void Validatelogin() {
		validUser.Signupclick();
		boolean title = validUser.ValidateHeader();
		Assert.assertTrue(title);
	}
	@Test(priority = 3)
	public void logincredentials() {
		validUser.Signupclick(); 
		validUser.UserSignup(prop.getProperty("ValidEmail"), prop.getProperty("ValidPassword"));
		boolean userlogged = validUser.UserLoggedin();
		Assert.assertTrue(userlogged);
	}
/*	@Test(priority = 4)
	public void Accountdelete() {
		boolean delete = validUser.AccountDelete();
		Assert.assertTrue(delete);
	}*/
	
	@AfterTest
	public void Quit() {
		driver.quit();
	
	}
}