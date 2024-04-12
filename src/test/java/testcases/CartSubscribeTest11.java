package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartSubscribe;

public class CartSubscribeTest11 extends TestBase{
	
	CartSubscribe Cart;
	
	public CartSubscribeTest11() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		Cart = new CartSubscribe();
	}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = Cart.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
      @Test(priority = 2)   
      public void ScrollDownFooter() {
    	  Cart.ScrolltoBottom();
      }
      @Test(priority = 3) 
      public void TextName() {
    	  boolean Text = Cart.CheckText();
    	  Assert.assertTrue(Text);
      }
      @Test(priority = 4) 
	public void EnterEmail(){
    	  Cart.EnterEmailAddress(prop.getProperty("Existemail"));
	}
      @Test(priority = 5)
      public void VerifySucessMessage() {
     	 String SuceessMsg = Cart.SucessMessage();
     	 Assert.assertEquals(SuceessMsg, "You have been successfully subscribed!");
       }
      @AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}
	
