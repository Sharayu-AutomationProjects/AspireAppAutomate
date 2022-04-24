package com.aspire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.pages.HomePage;
import com.aspire.qa.pages.InventoryFeatureHomePage;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.pages.ProductsCreatePage;
import com.aspire.qa.util.TestUtil;
import com.aspire.qa.pages.updateQuantityPage;

public class UpdateQuantityPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InventoryFeatureHomePage inventFeaturePage;
	ProductsCreatePage productCreateNewPage;
	updateQuantityPage updateQuantityPage;

	public UpdateQuantityPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		testUtil = new TestUtil();
		updateQuantityPage = new updateQuantityPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventFeaturePage = homePage.clickInventoryLink();
		productCreateNewPage = inventFeaturePage.productslink();
		updateQuantityPage = productCreateNewPage.updateQuantitylink();

	}


	@Test(priority = 1)
	public void verifyClickOnCreateBtn() {
		homePage.clickOnNewCreateProductPage();
		homePage.clickCreateBtnofProductPage();
		productCreateNewPage.createNewProduct();
		homePage.clickOnSaveBtn();
		homePage.clickOnUpdateQuant();
		homePage.clickOnCreateOfUpdateQuant();
	}

	@Test(priority = 2)
	public void verifyEnterQuantity() {
		homePage.clickOnNewCreateProductPage();
		homePage.clickCreateBtnofProductPage();
		productCreateNewPage.createNewProduct();
		homePage.clickOnSaveBtn();
		homePage.clickOnUpdateQuant();
		homePage.clickOnCreateOfUpdateQuant();
		updateQuantityPage.verifyCountQuantTextField();
		homePage.clickOnSaveBtn();
	}

	@Test(priority = 3)
	public void clickOnApplicationIconMenu() {
		homePage.clickOnNewCreateProductPage();
		homePage.clickCreateBtnofProductPage();
		productCreateNewPage.createNewProduct();
		homePage.clickOnSaveBtn();
		homePage.clickOnUpdateQuant();
		homePage.clickOnCreateOfUpdateQuant();
		updateQuantityPage.verifyCountQuantTextField();
		homePage.clickOnSaveBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
