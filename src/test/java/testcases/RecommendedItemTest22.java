package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.RecommendedItem;
import pages.VerifyCart;

public class RecommendedItemTest22 extends TestBase{
	
	RecommendedItem item;
	
	public RecommendedItemTest22() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
		item = new RecommendedItem();
	}

    @Test(priority = 1)	
	public void ScrollDown() {
	 boolean text = item.Recommendproduct();
	 Assert.assertTrue(text);
 }
   @Test(priority= 2)
   public void SelectProduct() {
	  boolean select = item.AddProduct();
	  Assert.assertTrue(select);
   }
   @AfterTest
 	public void Quit() {
 		driver.quit();
 	}
 
}
