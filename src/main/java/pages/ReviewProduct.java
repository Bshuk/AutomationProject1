package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ReviewProduct extends TestBase{
	
	@FindBy(xpath = "//a[@href=\"/products\"]")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//h2[text()='All Products']")
	WebElement AllProductBtn;
	
	@FindBy(xpath = "//a[@href=\"/product_details/1\"]")
	WebElement FirstProductBtn;
	
	@FindBy(xpath = "//a[text()='Write Your Review']")
	WebElement ReviewComment;
	
	@FindBy(id ="name")
	WebElement Name;
	
	@FindBy(id ="email")
	WebElement EmailAddres;
	
	@FindBy(id ="review")
	WebElement ReviewMsg;
    
	@FindBy(id = "button-review")
	WebElement ClickReview;
	
	@FindBy(xpath = "//span[text()='Thank you for your review.']")
	WebElement SucessText;
	
	public ReviewProduct() {
		PageFactory.initElements(driver, this);
	}
	
	public String ProductTab() {
		ProductBtn.click();
		return AllProductBtn.getText();
	}
	
	public String ViewBtn() {
		FirstProductBtn.click();
		return ReviewComment.getText();
	}
    
	public void Details(String Nm, String EmailID, String Review) {
		Name.sendKeys(Nm);
		EmailAddres.sendKeys(EmailID);
		ReviewMsg.sendKeys(Review);
		ClickReview.click();
	}
	
	public boolean SubmitMsg() {
		return SucessText.isDisplayed();
	}
}
