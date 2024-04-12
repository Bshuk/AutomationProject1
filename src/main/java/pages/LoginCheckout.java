package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginCheckout extends TestBase{
	
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
	
	@FindBy(xpath = "//a[@data-product-id='1']")
	WebElement addproduct;
	
	@FindBy(xpath = "//a[text()=\" Cart\"]")
	WebElement Clickcart;
	
	@FindBy(xpath = "//li[text()=\"Shopping Cart\"]")
	WebElement pagedisplay;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement Checkout;
	
	@FindBy(xpath = "//h2[text()=\"Address Details\"]")
	WebElement Deliveryaddress;
	
	@FindBy(xpath = "//h2[text()=\"Review Your Order\"]")
	WebElement ReviewOrder;
	
	@FindBy(name = "message")
	WebElement comment;
	
	@FindBy(xpath ="//a[text()=\"Place Order\"]")
	WebElement Orderbtn;
	
	@FindBy(name="name_on_card")
	WebElement CardName;
	
	@FindBy(name="card_number")
	WebElement Number;
	
	@FindBy(name="cvc")
	WebElement CVC;
	
	@FindBy(name="expiry_month")
	WebElement Expmonth;
	
	@FindBy(name="expiry_year")
	WebElement ExpYear;
	
	@FindBy(id="submit")
	WebElement Proceed;
	
	@FindBy(xpath = "//p[text() = \"Congratulations! Your order has been confirmed!\"]")
	WebElement Orderplaced;
	
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	WebElement DeleterAcc;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement deleteText;
	 
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement ContinueeBtn;

    public LoginCheckout() {
		PageFactory.initElements(driver, this);
    }
    public String validateSignupPageTitle() {
		return driver.getTitle();
	}

	public void UserSignup(String Email, String Pwd) {
		signupbtn.click();
		loginEmial.sendKeys(Email);
		loginPwd.sendKeys(Pwd);
		loginBtn.click();
	}
	public boolean UserLoggedin() {
		return Userloggedin.isDisplayed();		
	}
	
	public boolean AddProduct() {
		addproduct.click();
		Clickcart.click();
		return pagedisplay.isDisplayed();
	}
	
	public boolean Verifyaddress() {
		Checkout.click();
		return Deliveryaddress.isDisplayed();
	}
	public boolean ReviewOrder() {
		return ReviewOrder.isDisplayed();
	}
	public void Addcomment(String msg) {
		comment.sendKeys(msg);
		Orderbtn.click();
	}
	public void Cardinfo(String CCName,String CCNum, String CCCVC, String Exmonth, String ExYear ) {
		CardName.sendKeys(CCName);
		Number.sendKeys(CCNum);
		CVC.sendKeys(CCCVC);
		Expmonth.sendKeys(Exmonth);
		ExpYear.sendKeys(ExYear);
		Proceed.click();	
	}
	
	public boolean SuccessMsg() {
		return Orderplaced.isDisplayed();
	}
	public boolean AccountDelete() {
		DeleterAcc.click();
		return deleteText.isDisplayed();	
	}
	public void continueAgain() {
		ContinueeBtn.click();
	}
	}
    