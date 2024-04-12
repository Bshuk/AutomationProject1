package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartQuantity extends TestBase{
	
	@FindBy(xpath = "//a[@href=\"/product_details/1\"]")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//input[@type=\"number\"]")
	WebElement Inputtab;
	
	@FindBy(name = "quantity")
	WebElement Qty;
	
	@FindBy(xpath = "//button[@type=\"button\"]")
	WebElement Btn;
	
	@FindBy(xpath ="//u[text()=\"View Cart\"]")
	WebElement View;
	
	@FindBy(xpath = "//td[@class='cart_quantity']")
	WebElement GetQuantity;
	
	public CartQuantity() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	
	public void SelectProduct() {
		ProductBtn.click();
		Inputtab.clear();
}
	public void Quantityofproduct(){
		Qty.sendKeys("4");
		Btn.click();
		View.click();
	}
	public String ProductDisplay() {
		return GetQuantity.getText();	
	}
}