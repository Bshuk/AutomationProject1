package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactUs extends TestBase{
	
	@FindBy(xpath = "//a[@href=\"/contact_us\"]")
	WebElement Clickcontact;
	
	@FindBy(xpath = "//h2[text()=\"Get In Touch\"]")
	WebElement MessageVisible;
	
	@FindBy(name = "name")
	WebElement ContactName;
	
	@FindBy(name = "email")
	WebElement ContactEmail;
	
	@FindBy(name = "subject")
	WebElement ContactSub;
	
	@FindBy(id = "message")
	WebElement Msg;
	
	@FindBy(name = "upload_file")
	WebElement File;
	
	@FindBy(name = "submit")
	WebElement ContactSubmit;
	
	@FindBy(xpath = "//div[text()='Success! Your details have been submitted successfully.']")
	WebElement SuccessMsg;
	
	@FindBy(linkText = "Home")
	WebElement homePage;
	
	public ContactUs() {
		PageFactory.initElements(driver, this);
	}
	 public String validateSignupPageTitle() {
	 return driver.getTitle();
		}
	 
	 public void contactBtn() {
		 Clickcontact.click();
	 }
	  public boolean GetinTouch() {
		  return MessageVisible.isDisplayed();
	  }
	  
	  public void ContactInfo(String CustName, String CustEmail, String Sub, String Message) {
		  ContactName.sendKeys(CustName);
		  ContactEmail.sendKeys(CustEmail);
		  ContactSub.sendKeys(Sub);
		  Msg.sendKeys(Message);
	  }
		  public void UploadFile(String Filelocation) {
			  File.sendKeys(Filelocation);
			  ContactSubmit.click();
		      driver.switchTo().alert().accept();
		  }
		  
		  public boolean SucessMsg() {
			  return SuccessMsg.isDisplayed();
		  }
		  
		  public void Homepage() {
			  homePage.click();
		  } 
	  }

