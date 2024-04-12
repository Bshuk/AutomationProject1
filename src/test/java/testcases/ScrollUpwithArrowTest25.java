package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ScrollUpwithArrow;

public class ScrollUpwithArrowTest25 extends TestBase{
	
	ScrollUpwithArrow Arrow;
	
	public ScrollUpwithArrowTest25() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
		Arrow = new ScrollUpwithArrow();
}
	@Test(priority = 0)
	public void SignUpPageTitle() {
		String title = Arrow.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 1)
    public void SrcollDown() {
		String Ar =Arrow.SubscibeText();
		System.out.println(Ar);
		Assert.assertEquals(Ar, "SUBSCRIPTION");
}
	@Test(priority = 2)
	public void ArrowClick() {
		Arrow.Click();
	}
	@Test(priority = 3)
	public void FullPageText() {
		String Scrlup = Arrow.Mainpage();
		System.out.println(Scrlup);
		Assert.assertEquals(Scrlup, "Full-Fledged practice website for Automation Engineers");	
	}
	@AfterTest
  	public void Quit() {
  		driver.quit();
  	}
}