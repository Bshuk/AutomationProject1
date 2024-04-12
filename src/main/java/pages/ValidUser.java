package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ValidUser extends TestBase{

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement signupbtn;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement loginEmial;
	
	@FindBy(name = "password")
	WebElement loginPwd;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//b[text()='Brij']")
	WebElement Userloggedin;
	
	@FindBy(xpath = "//h2[text()='Login to your account']")
	WebElement loginHeader;
	
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	WebElement DeleterAcc;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement deleteText;
	
	public ValidUser() {
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
		public boolean UserLoggedin() {
			return Userloggedin.isDisplayed();		
		}
		
		public boolean AccountDelete() {
			DeleterAcc.click();
			return deleteText.isDisplayed();
		
	}

}