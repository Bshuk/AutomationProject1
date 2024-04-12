package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BrandProduct;

public class BrandProductTest19 extends TestBase{

	BrandProduct brandProduct;
	
	public BrandProductTest19() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initalization();
		brandProduct = new BrandProduct();
	}
	
	@Test(priority = 1)
	public void ProductTab() {
		brandProduct.ClickProductBtn();
	}
	@Test(priority = 2)
	public void Brandtag() {
		boolean View = brandProduct.VerifyBrand();
		Assert.assertTrue(View);
	}
	@Test(priority = 3)
	public void Select1stBrand() {
		brandProduct.SelectBrand1();
	}
	@Test(priority = 4)
	public void Brandname() {
		boolean Firstproduct = brandProduct.BrandDisplay();
		Assert.assertTrue(Firstproduct);
	}
	@Test(priority = 5)
	public void Select2ndBrand() {
		brandProduct.SelectBrand2();
	}
	@Test(priority = 6)
	public void Brandname2() {
		boolean Secondproduct = brandProduct.BrandDisplay2();
		Assert.assertTrue(Secondproduct);
}
	@AfterTest
	public void Quit() {
		driver.quit();
	}
}