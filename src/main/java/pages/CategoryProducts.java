package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CategoryProducts extends TestBase{
	
	@FindBy(xpath = "//h2[text()='Category']")
	WebElement Categorysection;
	
	@FindBy(xpath = "//a[@href='#Women']")
	WebElement WmnCollections;
	
	@FindBy(xpath = "//a[text()='Dress ']")
	WebElement ProductType;
	
	@FindBy(xpath = "//h2[text()='Women - Dress Products']")
	WebElement TopProduct;
	
	@FindBy(xpath = "//a[@href='#Men']")
	WebElement MenCollections;

	@FindBy(xpath = "//a[text()='Tshirts ']")
	WebElement TshirtsCollection;
	
	@FindBy(xpath = "//h2[text()='Men - Tshirts Products']")
	WebElement TopSearch;
	
	public CategoryProducts() {
		PageFactory.initElements(driver, this);
	}
		public boolean VerifyCategory() {
			return Categorysection.isDisplayed();
		}
	
		public void Womens() {
			WmnCollections.click();
			ProductType.click();
		}
		public boolean TopWomenProduct() {
			return TopProduct.isDisplayed();
		
		}
	  public boolean Select() {
		  return TopProduct.isDisplayed();
	  }	
		public boolean Mens() {
			return Categorysection.isDisplayed();
		}
		
		public void TopMensproduct() {
			MenCollections.click();
			TshirtsCollection.click();
		}
		
		public boolean NavigatedtoPage() {
			return TopSearch.isDisplayed();
		}
	}



