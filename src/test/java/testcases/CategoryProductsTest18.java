package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CategoryProducts;

public class CategoryProductsTest18 extends TestBase{
	
	CategoryProducts CategoryProducts;
	
	public CategoryProductsTest18() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initalization();
		CategoryProducts = new CategoryProducts();
}
  @Test(priority = 1)
  public void ValidateCategory() {
	  boolean View = CategoryProducts.VerifyCategory();
	  Assert.assertTrue(View);
  }
  @Test(priority = 2)
  public void WomenItem() {
	  CategoryProducts.Womens();
  }
  @Test(priority = 3)
  public void TopWomensItem() {
	 boolean Items = CategoryProducts.TopWomenProduct();
	 Assert.assertTrue(Items);
  }
  @Test(priority = 4)
  public void Titleforpage() {
	  boolean Text =CategoryProducts.Select();
	  Assert.assertTrue(Text);
  }
  @Test(priority = 5)
  public void MensProduct() {
	  boolean Menitem = CategoryProducts.Mens();
	  Assert.assertTrue(Menitem);
  }
  @Test(priority = 6)
  public void TopMensclothes() {
	  CategoryProducts.TopMensproduct();
  }
  @Test(priority = 7)
  public void Topitems() {
	 boolean NewPage = CategoryProducts.NavigatedtoPage();
	 Assert.assertTrue(NewPage);
  }
  @AfterTest
	public void Quit() {
		driver.quit();
	}
}

