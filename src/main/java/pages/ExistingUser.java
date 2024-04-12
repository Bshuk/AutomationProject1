package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ExistingUser extends TestBase{
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement signupbtn;
	
	@FindBy(xpath = "//h2[text()=\"New User Signup!\"]")
	WebElement NewUserText;
	
	@FindBy(xpath="//input[@data-qa='signup-name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	WebElement email;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement clicksignup;
	
	@FindBy(xpath = "//p[text()='Email Address already exist!']")
	WebElement Logintext;
	
	public ExistingUser() {
		PageFactory.initElements(driver, this);

	}
		
		public String validateSignupPageTitle() {
			return driver.getTitle();
		}
		
		public String NewSignUp() {
			signupbtn.click();
			return NewUserText.getText();
		}
		 
		public void UserSignup(String Nm, String Email) {
			name.sendKeys(Nm);
			email.sendKeys(Email);
			clicksignup.click();
			}
	      public boolean ErrorMsg() {
	    	  return Logintext.isDisplayed();
	      }
	}
	
