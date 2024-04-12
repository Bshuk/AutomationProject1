package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class InvalidUser extends TestBase{
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement signupbtn;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement loginEmial;
	
	@FindBy(name = "password")
	WebElement loginPwd;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	WebElement FailureMessage;
	
	@FindBy(xpath = "//h2[text()='Login to your account']")
	WebElement loginHeader;
   
	
	public InvalidUser() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		return driver.getTitle();
	}
	
	public void Signupclick() {
		signupbtn.click();
	}
	
	public void UserSignup(String Email, String Pwd) {
		loginEmial.sendKeys(Email);
		loginPwd.sendKeys(Pwd);
		loginBtn.click();
	}
		public boolean ValidateHeader() {
			return loginHeader.isDisplayed();
		}
	
		public boolean Failuretext() {
			return FailureMessage.isDisplayed();
		}
}
