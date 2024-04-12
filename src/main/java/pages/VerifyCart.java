package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class VerifyCart extends TestBase{
	
	@FindBy(xpath = "//a[@href=\"/products\"]")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//h2[text()='All Products']")
	WebElement ProductPage;
	
	@FindBy(id = "search_product")
	WebElement ProductName;
	
	@FindBy(id = "submit_search")
	WebElement SubBtn;
	
	@FindBy(xpath = "//h2[text()='Searched Products']")
	WebElement SearchProductTitle;
	
	@FindBy(xpath = "//div[contains(@class,'productinfo')]//p")
	List<WebElement> AllSearchProduct;
	
	@FindBy(xpath = "//a[@data-product-id='33']")
	WebElement item1;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement Continue;
	
	@FindBy(xpath = "//a[@data-product-id='35']")
	WebElement item2;
	
	@FindBy(xpath = "//u[text()=\"View Cart\"]")
	WebElement View;
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement signupbtn;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement loginEmial;
	
	@FindBy(name = "password")
	WebElement loginPwd;
	
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement Clickcart;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Soft Stretch Jeans']")
	WebElement Product1;
	
	@FindBy(xpath = "//a[text()='Regular Fit Straight Jeans']")
	WebElement Product2;
	
	public VerifyCart() {
		PageFactory.initElements(driver, this);
    }
	public boolean NavigatedtoProduct() {
		ProductBtn.click();
		return ProductPage.isDisplayed();
}

    
    public void ProductName(String itemName) {
		ProductName.sendKeys(itemName);
		SubBtn.click();	
	}
    
    	
	public boolean VerifytextSearchProduct() {
		return SearchProductTitle.isDisplayed();
	}
	public void AllProduct() {
		AllSearchProduct.listIterator();
	}
	public void Addproducttocart(){
		item1.click();
		Continue.click();
		item2.click();
		View.click();
	}
	
	public void UserSignup(String Email, String Pwd) {
		signupbtn.click();
		loginEmial.sendKeys(Email);
		loginPwd.sendKeys(Pwd);
		loginBtn.click();
	}
	
	public boolean verifyCart() {
		Clickcart.click();
		return Product1.isDisplayed();
	}
	public boolean ViewCart2() {
		return Product2.isDisplayed();
	}

}
    

