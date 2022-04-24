package com.aspire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aspire.qa.base.TestBase;


public class InventoryFeatureHomePage extends TestBase{

	
	@FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]")
	WebElement inventoryOverviewLable;
	
	@FindBy(xpath="//button[contains(@title,'Products')]/parent::*")
	WebElement productsTitle;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement dropDownProductsLink;
	
		
	public InventoryFeatureHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyInventoryPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyInventory(){
		return inventoryOverviewLable.isDisplayed();
	}
	
	
	 public boolean verifyInventoryProducts(){
	 	  return productsTitle.isDisplayed(); 
	 	  }
	 
	
	
	public  ProductsCreatePage productslink(){	
		try {
			dropDownProductsLink.click();
					
		} catch (Exception e) {
			System.out.println("sub Product clicked");
		}
		return new ProductsCreatePage();
		
	}
	

}
	
	
	


