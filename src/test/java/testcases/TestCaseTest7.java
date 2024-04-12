package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.TestCase;

public class TestCaseTest7 extends TestBase{
	
	TestCase testCase;
	
	public TestCaseTest7() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
	testCase = new TestCase();

}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = testCase.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
	public void TestPageButton() {
		testCase.TestPage();
	}
	@Test(priority = 3)
     public void VerifyTestPage() {
		boolean title = testCase.TestTitle();
		Assert.assertTrue(title);
	}
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
