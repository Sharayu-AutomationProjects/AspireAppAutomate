package com.aspire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aspire.qa.base.TestBase;

public class ApplicationMenuPage extends TestBase{
	
		
	@FindBy(xpath="//a[@title='Home menu']/parent::nav[@class='o_main_navbar']")
	WebElement homeMenu;
	
	@FindBy(xpath="//div[contains(text(),'Manufacturing')]")
	WebElement ManufacturingPage;
	
	
	public void appMenulink(){
		homeMenu.click();		
	}
	
	
	 public ManufacturingFeaturePage clickManuFaclink(){
		 try {
			 ManufacturingPage.click();
		} catch (Exception e) {
			 System.out.println("Clicked on Home Menu");
		}
		 	
		  return new ManufacturingFeaturePage();
	  }

}
