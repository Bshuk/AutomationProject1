package testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItem;
import pages.CartSubscribe;

public class AddItemTest12 extends TestBase{
       
	AddItem addItem;
	Actions action;
	
	public AddItemTest12() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		addItem= new AddItem();
	}
	
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = addItem.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
		public void Productbutton() {
		addItem.Productpage();
	}
	@Test(priority = 2)
	public void SelectItems() throws InterruptedException {
		addItem.SelectItem();
	}
	 @AfterTest
	  	public void Quit() {
	  		driver.quit();
	  	}
}
