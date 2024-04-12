package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TestCase extends TestBase {
	
	@FindBy(linkText = "Test Cases")
	WebElement TestBtn;
	
	@FindBy(xpath = "//b[text()=\"Test Cases\"]")
	WebElement PageTitle;
	
	public TestCase() {
		PageFactory.initElements(driver, this);

	}
	
	public void TestPage() {
		TestBtn.click();
	}
	public boolean TestTitle() {
		return PageTitle.isDisplayed();
	}
	public String validateSignupPageTitle() {
		 return driver.getTitle();
			}
}
