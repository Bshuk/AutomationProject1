package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class SignUpPage extends TestBase{
	
	
	//page factory
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
	
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	WebElement DetailPage;
	
	@FindBy(xpath = "//input[@value=\"Mr\"]")
	WebElement salutation;
	
	@FindBy(id = "password")
	WebElement Passwd;
	
	@FindBy(id = "newsletter")
	WebElement NLbtn;
	
	@FindBy(id = "optin")
	WebElement OPbtn;
	
	@FindBy(id = "first_name")
	WebElement FName;

	@FindBy(id = "last_name")
	WebElement LName;
	
	@FindBy(id = "company")
	WebElement CName;
	
	@FindBy(id = "address1")
	WebElement Addressone;
	
	@FindBy(id = "address2")
	WebElement Addresstwo;
	
	@FindBy(id = "state")
	WebElement SName;
	
	@FindBy(id = "city")
	WebElement CityName;
	
	@FindBy(id = "zipcode")
	WebElement Zip;
	
	@FindBy(id = "mobile_number")
	WebElement Mobile;
	
	@FindBy(xpath = "//button[@data-qa=\"create-account\"]")
	WebElement CreateTab;
	
	@FindBy(xpath = "//b[text()='Account Created!']")
	WebElement AccCreated;
	
	@FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
	WebElement AccCreatedTab;
	
	@FindBy(xpath = "//b[text()='Bhupesh Shukla']")
	WebElement UserLogged;
	
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	WebElement DeleterAcc;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement deleteText;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement ContinueeBtn;
	
	@FindBy(id = "days")
	WebElement Day;
	
	@FindBy(id = "months")
	WebElement Month;
	
	@FindBy(id = "years")
	WebElement Year;
			
	//initialize the object
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
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
	
	public boolean DetailsPageInfo() {
		return DetailPage.isDisplayed();
	}
	
	public void password(String PassWd) {
		Passwd.sendKeys(PassWd);
	}		
	
	public void DOB() {
		Select Days = new Select(driver.findElement(By.id("days")));
		  Days.selectByVisibleText("6");
		  Select Month = new Select(driver.findElement(By.id("months")));
		  Month.selectByIndex(1);
		  Select Year = new Select(driver.findElement(By.id("years")));
		  Year.selectByVisibleText("1990");
		  NLbtn.click();
			OPbtn.click();	
	}
	public void Addressinfo1(String FirstName, String LastName, String Company, String Address1, String Address2) {
		FName.sendKeys(FirstName);
		LName.sendKeys(LastName);
		CName.sendKeys(Company);
		Addressone.sendKeys(Address1);
		Addresstwo.sendKeys(Address2);
	}
	
	public void Addressinfo2(String StateName, String Cityname, String Zipcode, String Mnum) {
		SName.sendKeys(StateName);
		CityName.sendKeys(Cityname);
		Zip.sendKeys(Zipcode);
		Mobile.sendKeys(Mnum);
		CreateTab.click();
	}
	public boolean AccountCreatedVisible() {
		return AccCreated.isDisplayed();
	}
	public String Continue() {
		AccCreatedTab.click();
		return UserLogged.getText();
	}
	public boolean AccountDelete() {
		DeleterAcc.click();
		return deleteText.isDisplayed();
		
	}
	public void continueAgain() {
		ContinueeBtn.click();
	}
	
	
	}