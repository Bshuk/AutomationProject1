package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ScrollUpwithArrow extends TestBase{
	
	@FindBy(xpath = "//h2[text()='Subscription']")
	WebElement VerifyText;

	@FindBy(id = "scrollUp")
	WebElement Scrlup;
	
	@FindBy(xpath = "//h2[text()=\"Full-Fledged practice website for Automation Engineers\"]")
    WebElement Pagename;
	
	public ScrollUpwithArrow() {
		PageFactory.initElements(driver, this);
	}
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	
	public String SubscibeText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return VerifyText.getText();
	}
	public void Click() {
		Scrlup.click();
	}
	
	public String Mainpage() {
		return Pagename.getText();
	}
}
