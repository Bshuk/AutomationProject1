package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ScrollUpwithoutArrow;

public class ScrollUpwithoutArrow26 extends TestBase{

	ScrollUpwithoutArrow ScrollUp;
	
	public ScrollUpwithoutArrow26() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		ScrollUp = new ScrollUpwithoutArrow();
	}
	
	@Test(priority = 0)
	
	public void SignUpPageTitle() {
		String title = ScrollUp.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 1)
	public void ScrollDown() {
		String Text =ScrollUp.SubsribeScroll();
		System.out.println(Text);
		Assert.assertEquals(Text, "SUBSCRIPTION");
	}
	@Test(priority = 2)

	public void ScrollUp() {
		String Top = ScrollUp.ScrollUp();
		System.out.println(Top);
		Assert.assertEquals(Top, "Full-Fledged practice website for Automation Engineers");
	}
		@AfterTest
	  	public void Quit() {
	  		driver.quit();
	  	}
		
	}
