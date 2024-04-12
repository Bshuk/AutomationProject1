package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LogoutUser;

public class LogoutUserTest4 extends TestBase{
		
	LogoutUser logout;
	
	public LogoutUserTest4() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		logout = new LogoutUser();
		
	}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = logout.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
	public void Validatelogin() {
		logout.Signupclick();
		boolean title = logout.ValidateHeader();
		Assert.assertTrue(title);
	}
	@Test(priority = 3)
	public void logincredentials() {
		logout.Signupclick(); 
		logout.UserSignup(prop.getProperty("ValidEmail"), prop.getProperty("ValidPassword"));
		boolean userlogged = logout.UserLoggedin();
		Assert.assertTrue(userlogged);
		logout.LogOut();
		String title =logout.validateloginpage();
		Assert.assertEquals(title, "Automation Exercise - Signup / Login");
	}
	
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
