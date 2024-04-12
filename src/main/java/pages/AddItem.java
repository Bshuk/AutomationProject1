package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class AddItem extends TestBase{
	
	@FindBy(xpath = "//a[@href=\"/products\"]")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//a[@data-product-id='1']")
	WebElement Fisrtproduct;
	
	@FindBy(xpath = "//a[@data-product-id='2']")
	WebElement Secondproduct;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement Continue;
	
	@FindBy(xpath = "//a//u[text()='View Cart']")
	WebElement View;
	
	public AddItem() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	
	public void Productpage() {
		ProductBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	  	  js.executeScript("window.scrollTo(0,2000)");
	}
	public void SelectItem() throws InterruptedException {
		Thread.sleep(5000);
	    Fisrtproduct.click();
		Continue.click();
		Thread.sleep(5000);
		Secondproduct.click();
		Thread.sleep(5000);
		View.click();
		
	}
}