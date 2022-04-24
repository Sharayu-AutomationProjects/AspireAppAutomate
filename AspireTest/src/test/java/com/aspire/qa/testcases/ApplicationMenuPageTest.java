package com.aspire.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.pages.ApplicationMenuPage;
import com.aspire.qa.pages.HomePage;
import com.aspire.qa.pages.InventoryFeatureHomePage;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.pages.ProductsCreatePage;
import com.aspire.qa.pages.updateQuantityPage;
import com.aspire.qa.util.TestUtil;

public class ApplicationMenuPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InventoryFeatureHomePage inventFeaturePage;
	ProductsCreatePage productCreateNewPage;
	updateQuantityPage updateQuantityPage;
	ApplicationMenuPage applicationMenuPage;
	
	public ApplicationMenuPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();

		testUtil = new TestUtil();
		applicationMenuPage = new ApplicationMenuPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventFeaturePage = homePage.clickInventoryLink();
		productCreateNewPage = inventFeaturePage.productslink();
		updateQuantityPage = productCreateNewPage.updateQuantitylink();
		applicationMenuPage = updateQuantityPage.appMenulink();

	}
	
	
	@Test(priority = 1)
	public void appMenulink() {

		  homePage.verifyClickOnHomeMenu();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
