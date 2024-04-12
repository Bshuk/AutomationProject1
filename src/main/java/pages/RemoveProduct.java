package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RemoveProduct extends TestBase{
	
	@FindBy(xpath = "//a[text()=' Products']")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//a[@data-product-id='1']")
	WebElement FirtItem;
	
	@FindBy(xpath = "//a//u[text()='View Cart']")
	WebElement Viewcart;
	
	@FindBy(xpath = "//li[@class='active']")
	WebElement ShpgPage;
	
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")
	WebElement DeleteItem;
	
	@FindBy(xpath = "//span[@id='empty_cart']//b")
	WebElement EmptyCart;
	
	public RemoveProduct() {
	PageFactory.initElements(driver, this);
	}
	public String validateSignupPageTitle() {
		 return driver.getTitle();
	}
	
	public void Addproduct() throws InterruptedException {
		Thread.sleep(3000);
		ProductBtn.click();
		Thread.sleep(3000);
		FirtItem.click();
		Thread.sleep(3000);
		Viewcart.click();
	}
	public boolean ViewPage() {
		return ShpgPage.isDisplayed();
	}
	
	public void Remove() {
		DeleteItem.click();
	}
	public String Verifyproduct() {
		return EmptyCart.getText();
	}
}
