package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ExistingUser;

public class ExistingUserTest5 extends TestBase {
	
	ExistingUser EUser;
	
	    public ExistingUserTest5() {
	    	super();
	    }
	    
	    @BeforeTest
		public void setUp() {
			initalization();
			EUser = new ExistingUser();
	    }
	    @Test(priority =1)
		public void SignUpPageTitle() {
			String title =EUser.validateSignupPageTitle();
			Assert.assertEquals(title, "Automation Exercise");
		}
		@Test(priority=2)
		    public void newSignup() {
			String text= EUser.NewSignUp();
			Assert.assertEquals(text, "New User Signup!");	
		}
		@Test(priority=3)
		public void NewuserInfo() {
			EUser.UserSignup(prop.getProperty("name"), prop.getProperty("Existemail"));
		}
		@Test(priority=4)
        public void FailureMsg() {
			boolean Msg = EUser.ErrorMsg();
			Assert.assertTrue(Msg);
		}
		@AfterTest
	  	public void Quit() {
	  		driver.quit();
	  	}

}
