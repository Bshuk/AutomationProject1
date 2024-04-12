package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Search;
import pages.TestCase;

public class SearchTest9 extends TestBase{
	
	Search search;
	
	public SearchTest9() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initalization();
	search = new Search();

}
	@Test(priority = 1)
	public void SignUpPageTitle() {
		String title = search.validateSignupPageTitle();
		Assert.assertEquals(title, "Automation Exercise");
}
	@Test(priority = 2)
	public void Producttab() {
		search.ProductTab();
	}
	
	@Test(priority = 3)
	public void ProductPage() {
		boolean page = search.NavigatedtoProduct();
		Assert.assertTrue(page);
	}
	@Test(priority = 4)
	public void ItemName() {
		search.ProductName(prop.getProperty("item"));
	}
	@Test(priority = 5)
	public void SearcProductVisible() {
		boolean text =search.VerifytextSearchProduct();
		Assert.assertTrue(text);
}
	@Test(priority = 6)
	public void AllProductList() {
		search.AllProduct();
	}
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
