package com.aspire.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.pages.HomePage;
import com.aspire.qa.pages.InventoryFeatureHomePage;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.pages.ProductsCreatePage;
import com.aspire.qa.util.TestUtil;

public class InventoryPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InventoryFeatureHomePage inventFeaturePage;
	ProductsCreatePage productCreateNewPage;

	public InventoryPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		inventFeaturePage = new InventoryFeatureHomePage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventFeaturePage = homePage.clickInventoryLink();
	}

	@Test(priority = 1)
		public void verifyInventoryLable(){
		Assert.assertTrue(inventFeaturePage.verifyInventory(), "InventoryLable is missing on the page");
	}

	 @Test(priority=2)
	 public void verifyInventoryProducts(){
	 boolean flag =inventFeaturePage.verifyInventoryProducts();
		 Assert.assertTrue(flag); 
		 }
		
	@Test(priority = 3)
	public void clickProductsSublink() {
		homePage.clickOnNewCreateProductPage();
		}

	
	@Test(priority = 4)
	public void productCreatePage() {
		homePage.clickOnNewCreateProductPage();
		inventFeaturePage.productslink();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
