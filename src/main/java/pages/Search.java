package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Search extends TestBase{
	
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
	
	
	public Search() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		 return driver.getTitle();
			}
	
	public void ProductTab() {
		ProductBtn.click();
	}
	
	public boolean NavigatedtoProduct() {
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
}