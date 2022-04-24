package com.aspire.qa.testcases;

import java.util.concurrent.TimeUnit;

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

public class ProductsCreatePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InventoryFeatureHomePage inventFeaturePage;
	ProductsCreatePage productCreateNewPage;
	
	public ProductsCreatePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		productCreateNewPage = new ProductsCreatePage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventFeaturePage = homePage.clickInventoryLink();
		productCreateNewPage = inventFeaturePage.productslink();
		homePage.clickOnNewCreateProductPage();
		
	}
	
	
	 @Test(priority=1)
	 public void verifyproductsLablePage(){
	 boolean flag =productCreateNewPage.verifyproductsLablePage();
		 Assert.assertTrue(flag); 
		 }
		
	 @Test(priority = 2)
		public void verifyproductsClickPage() {
			productCreateNewPage.verifyproductsClickPage();
		}
	 
	 
	@Test(priority=3)
	public void verifyproductsCreateNewPage(){
		Assert.assertTrue(productCreateNewPage.verifyproductsNewPage(), "products New Page is missing on the page");
	}
	
	@Test(priority=4)
	public void verifySearchField(){
		Assert.assertTrue(productCreateNewPage.verifySearchField(), "Search Field is missing on the page");
	}
	
	
	@Test(priority = 5)
	public void verifyclickOnCreateBtn() {
		homePage.clickCreateBtnofProductPage();
		
	}
		
	@Test(priority = 6)
	public void verifyNewProductCreated(){	
		homePage.clickCreateBtnofProductPage();
		productCreateNewPage.createNewProduct();
		
	}
	
	@Test(priority = 7)
	public void verifyProductCreatedIsSaved(){	
		homePage.clickCreateBtnofProductPage();
		productCreateNewPage.createNewProduct();
		homePage.clickOnSaveBtn();
			
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}


	
	
	
	
	
	
	
	
	
	
	
	