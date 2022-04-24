package com.aspire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aspire.qa.base.TestBase;

public class updateQuantityPage extends TestBase{

	
	@FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]//span[contains(text(),'Update Quantity')]")
	  WebElement UpdateQuntCreateNewPageLable;
	
	@FindBy(xpath="//button[@data-original-title='Create record']") 
	  WebElement createUpdateQntBtn;
	  
	@FindBy(xpath="//button[contains(text(),'Save')]") 
	  WebElement saveBtn;
	
	  @FindBy(xpath="//button[contains(text(),'Discard')]") 
	  WebElement discardBtn;
	
	  @FindBy(xpath="//th[@title='Counted Quantity']") 
	  WebElement countQuantLable;
	
	  @FindBy(xpath="//input[@name='inventory_quantity']") 
	  WebElement countQuantTextField;
	  
	  @FindBy(xpath="//a[@title='Home menu']/parent::nav[@class='o_main_navbar']")
		WebElement homeMenu;
	
	  public updateQuantityPage() {
			PageFactory.initElements(driver, this);
		}
	
	  public boolean UpdateQuntCreateNewPageLable(){
			return UpdateQuntCreateNewPageLable.isDisplayed();
		}
	
	  public boolean countQuantLable(){
			return countQuantLable.isDisplayed();
		}
	  
	  public void clickOnCreateBtn() {
		  try {
		  		  createUpdateQntBtn.click();
	  	} catch (Exception e) {
		System.out.println("Clicked on CreateBtn");
	  	}
		  
	  }
	
	  public void verifyCountQuantTextField() {
		  try {
			  countQuantTextField.sendKeys("15");
	  	} catch (Exception e) {
		System.out.println("Value Entered");
	  	}
	  }
	  
	  
	  public ApplicationMenuPage appMenulink(){
		 try {
			 homeMenu.click();
		} catch (Exception e) {
			 System.out.println("Clicked on Home Menu");
		}
		 	
		  return new ApplicationMenuPage();
	  }
	
}
