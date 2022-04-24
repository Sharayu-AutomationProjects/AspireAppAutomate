package com.aspire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.pages.HomePage;
import com.aspire.qa.pages.InventoryFeatureHomePage;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Odoo");
	}
	
	@Test(priority=2)
	public void allFeatureNames(){
			boolean flag = homePage.verifyAllFeatureNames();
			Assert.assertTrue(flag);
			boolean flag1 = homePage.verifyDiscussFeatureName();
			Assert.assertTrue(flag1);
			boolean flag2 = homePage.verifyInventoryFeatureName();
			Assert.assertTrue(flag2);
			boolean flag3 = homePage.verifyManufacturingFeatureName();
			Assert.assertTrue(flag3);
			
		}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
