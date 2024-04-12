package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartSubscribe extends TestBase{
	
	@FindBy(linkText = "Cart")
	WebElement ClickCartBtn;
	
	@FindBy(xpath = "//h2[text()='Subscription']" )
	WebElement SubscribeText;
	
	@FindBy(id = "susbscribe_email")
	WebElement InputEmail;
	
	@FindBy(id = "subscribe")
	WebElement ClickSubScribe;
	
	@FindBy(id = "success-subscribe")
	WebElement SucessMsg;
	
	public CartSubscribe() {
		PageFactory.initElements(driver, this);
	}
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	
	public void ScrolltoBottom() {
		ClickCartBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   	
	}
	   	public boolean CheckText() {
		   	return SubscribeText.isDisplayed();
			
	   	}

	public void EnterEmailAddress(String Emailaddress) {
		InputEmail.sendKeys(Emailaddress);
		ClickSubScribe.click();
	}
	public String SucessMessage() {
		return SucessMsg.getText();
	}	
}
