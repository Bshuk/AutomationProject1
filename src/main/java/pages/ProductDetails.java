package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class ProductDetails extends TestBase{
	
	@FindBy(xpath = "//a[text()=' Products']")
	WebElement ProductBtn;
	
	@FindBy(xpath = "//h2[text()='All Products']")
	WebElement VerifyProduct;
	
	@FindBy(xpath = "//a[text()='View Product']")
	WebElement ViewBtn;

	@FindBy(xpath = "//h2[text()='Blue Top']")
	WebElement checkproduct;
	
	@FindBy(xpath = "//div[@class=\"product-information\"]//p")
	List<WebElement> productdetails;

   public ProductDetails() {
		PageFactory.initElements(driver, this);

   }
   public String validateSignupPageTitle() {
		return driver.getTitle();
   }
   
   public String ProductTab() {
	   ProductBtn.click();
	   return VerifyProduct.getText();
   }
   
   public boolean CheckProduct() {
	   ViewBtn.click();
	   return checkproduct.isDisplayed();
   }
   
   public void Details() {
	   ArrayList<Object>ar = new ArrayList<Object>();
       ar.add("Category: Women > Tops");
       ar.add("Availability: In Stock");
       ar.add("Condition: New");
       ar.add("Brand: Polo");

       for(int i=0;i<productdetails.size();i++)
       {
    	   System.out.println(productdetails.get(i).getText());
    	   Assert.assertEquals(productdetails.get(i).getText(), ar.get(i));
       }

       
       
   }
   }