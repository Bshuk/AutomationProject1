package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RecommendedItem extends TestBase{
	
	@FindBy(xpath ="//h2[text()=\"recommended items\"]")
	WebElement RecommendText;

	@FindBy(xpath ="//a[@data-product-id=\"1\"]")
	WebElement Add;
	
	@FindBy(xpath ="//a//u[text()=\"View Cart\"]")
	WebElement View;
	
	@FindBy(xpath ="//a[text()=\"Blue Top\"]")
	WebElement productname;

	public RecommendedItem() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Recommendproduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		 return RecommendText.isDisplayed();
	}
	
	public boolean AddProduct() {
		Add.click();
		View.click();
		return productname.isDisplayed();
	}
	
}
