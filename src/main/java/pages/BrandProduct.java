package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BrandProduct extends TestBase{
	
	@FindBy(xpath = "//a[text()=' Products']")
	WebElement ProductBtn;
	
	@FindBy(xpath ="//h2[text()='Brands']")
	WebElement BrandBtn;
	
	@FindBy(xpath = "//a[@href=\"/brand_products/Polo\"]")
	WebElement BrandName;
	
	@FindBy(xpath = "//h2[text()='Brand - Polo Products']")
	WebElement ProductsName;
	
	@FindBy(xpath ="//a[text()='H&M']")
	WebElement BrandName2;
	
	@FindBy(xpath = "//h2[text()='Brand - H&M Products']")
	WebElement ProductsName2;
	
	public BrandProduct() {
		PageFactory.initElements(driver, this);
	}
		public void ClickProductBtn() {
			ProductBtn.click();
		}
		
		public boolean VerifyBrand() {
			return BrandBtn.isDisplayed();
	}	
		public void SelectBrand1() {
			BrandName.click();
		}
		public boolean BrandDisplay() {
			return ProductsName.isDisplayed();
		}
		public void SelectBrand2() {
			BrandName2.click();
		}
		public boolean BrandDisplay2() {
			return ProductsName2.isDisplayed();
		}
}
