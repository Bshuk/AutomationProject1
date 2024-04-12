package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Search;
import pages.Subscription;

public class SubscriptionTest10 extends TestBase{
	
	Subscription Subscribe;
	
	public SubscriptionTest10() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		Subscribe = new Subscription();
}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = Subscribe.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
      @Test(priority = 2)   
      public void ScrollDownFooter() {
    	  Subscribe.ScrolltoBottom();
      }
      @Test(priority = 3) 
      public void TextName() {
    	  boolean Text =Subscribe.CheckText();
    	  Assert.assertTrue(Text);
      }
      @Test(priority = 4) 
	public void EnterEmail() {
		Subscribe.EnterEmailAddress(prop.getProperty("Existemail"));
	}
      @Test(priority = 5)
      public void VerifySucessMessage() {
    	 String SuceessMsg = Subscribe.SucessMessage();
    	 Assert.assertEquals(SuceessMsg, "You have been successfully subscribed!");
      }
      @AfterTest
  	public void Quit() {
  		driver.quit();
  	}
  }
