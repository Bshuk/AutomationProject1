package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ContactUs;

public class ContactUsTest6 extends TestBase {
	
	ContactUs contactUs;
	
	public ContactUsTest6() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		contactUs = new ContactUs();
	}	

	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = contactUs.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
	public void ContactButton() {
		contactUs.contactBtn();
		boolean text = contactUs.GetinTouch();
		Assert.assertTrue(text);
	}
	
	@Test(priority = 3)
	public void Details() {
		contactUs.ContactInfo(prop.getProperty("name"), prop.getProperty("Newemail"), prop.getProperty("Subject"), prop.getProperty("Message"));
	
	}
	
	@Test(priority = 4)
	public void Upload() {
		contactUs.UploadFile(prop.getProperty("FileLocation"));
	}
	@Test(priority = 5)
	public void verifySucessMsg() {
		boolean SUCESS = contactUs.SucessMsg();
		Assert.assertTrue(SUCESS);
	}
	@Test(priority = 6)
	public void HomePage() {
		contactUs.Homepage();
	}
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}

