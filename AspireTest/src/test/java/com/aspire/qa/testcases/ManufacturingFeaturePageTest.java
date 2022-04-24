package com.aspire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.pages.ApplicationMenuPage;
import com.aspire.qa.pages.HomePage;
import com.aspire.qa.pages.InventoryFeatureHomePage;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.pages.ManufacturingFeaturePage;
import com.aspire.qa.pages.ProductsCreatePage;
import com.aspire.qa.pages.updateQuantityPage;
import com.aspire.qa.util.TestUtil;

public class ManufacturingFeaturePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	InventoryFeatureHomePage inventFeaturePage;
	ProductsCreatePage productCreateNewPage;
	updateQuantityPage updateQuantityPage;
	ApplicationMenuPage applicationMenuPage;
	ManufacturingFeaturePage manufacturingPage;
	
	public ManufacturingFeaturePageTest() {
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
		applicationMenuPage = updateQuantityPage.appMenulink();
		manufacturingPage =applicationMenuPage.clickManuFaclink();

	}
	
 
	 @Test(priority = 1)
		public void verifyclickOnCreateBtn() {
			homePage.clickOnCreateOfManuFact();
			
		}
	
	 @Test(priority=2)
		public void createNewManufacturingOrders(){
			manufacturingPage.createNewManufacturingOrders();
		}
	
	 @Test(priority=3)
		public void clickOnConfirmOFManuFactPage(){
			homePage.clickOnConfirmOFManuFactPage();
		}
	 
	 @Test(priority=4)
		public void clickOnConfirmPopUP() throws InterruptedException{
			homePage.confirmationPopUp();
		}
	 
	 @Test(priority=5)
		public void ImmidiateProductionPopUp() throws InterruptedException{
		 manufacturingPage.ImmidiateProductionPopUp();
		}
	 
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
