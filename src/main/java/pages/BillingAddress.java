package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BillingAddress extends TestBase{

	@FindBy(xpath = "//a[@data-product-id='1']")
	WebElement addproduct;
	
	@FindBy(xpath = "//a//u[text()=\"View Cart\"]")
	WebElement Clickviewcart;
	
	@FindBy(xpath = "//li[text()=\"Shopping Cart\"]")
	WebElement pagedisplay;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement Checkout;
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement signupbtn;
	
	@FindBy(name = "name")
	WebElement Uname;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement Uemail;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement SigninBtn;
	
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
	
	@FindBy(xpath = "//a[text()=\" Cart\"]")
	WebElement Clickcart;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement Checkoutagain;
	
	@FindBy(xpath = "//h3[text()=\"Your delivery address\"]")
	WebElement Deliveryadd;
	
	@FindBy(xpath = "//h3[text()=\"Your billing address\"]")
	WebElement Billtoaddress;
	
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	WebElement DeleterAcc;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement deleteText;
	 
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement ContinueeBtn;
		
	public BillingAddress() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		return driver.getTitle();
	}
	
	public void UserSignup(String Nm, String Email) {
		signupbtn.click();
		Uname.sendKeys(Nm);
		Uemail.sendKeys(Email);
		SigninBtn.click();
		}
	
	public void password(String PassWd) {
		salutation.click();
		Passwd.sendKeys(PassWd);
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
	
	public boolean AddProduct() {
		addproduct.click();
		Clickcart.click();
		return pagedisplay.isDisplayed();
	}
	
	public void Gotocart() throws InterruptedException {
		Thread.sleep(4000);
		Checkoutagain.click();		
		
	}
	public void Verifyaddress() {
		String Regaddress = "Mr. Bhupesh Shukla ,HDFCErgo, Hubtown, Koildingri, Sahara Road,Andheri(E),Mumbai Maharashtra 600096,India";
		String Deladdress = "Mr. Bhupesh Shukla ,HDFCErgo, Hubtown, Koildingri, Sahara Road,Andheri(E),Mumbai Maharashtra 600096,India";
		
		if(Regaddress.equals(Deladdress))
		{
		  System.out.println("Both address is same");
		}
		else {
			System.out.println("Both address are different");
		}
		
	}
	public void VerifyBilladdress() {
		String Regaddress = "Mr. Bhupesh Shukla ,HDFCErgo, Hubtown, Koildingri, Sahara Road,Andheri(E),Mumbai Maharashtra 600096,India";
		String billingaddress = "Mr. Bhupesh Shukla ,HDFCErgo, Hubtown, Koildingri, Sahara Road,Andheri(E),Mumbai Maharashtra 600096,India";
		if(Regaddress.equals(billingaddress))
		{
		  System.out.println("Both address is same");
		}
		else {
			System.out.println("Both address are different");
		}
	}
	public boolean AccountDelete() {
		DeleterAcc.click();
		return deleteText.isDisplayed();	
	}
	public void continueAgain() {
		ContinueeBtn.click();
	}
	
}
