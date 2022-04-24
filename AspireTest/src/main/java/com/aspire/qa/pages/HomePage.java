package com.aspire.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aspire.qa.base.TestBase;
import com.aspire.qa.util.TestUtil;

public class HomePage extends TestBase {
	

	
	@FindBy(xpath="//div[@class='o_home_menu_scrollable']")
	WebElement homeMenuScroll;
	
	@FindBy(xpath="//a[@title='Home menu']/parent::nav[@class='o_main_navbar']")
	WebElement homeMenu;
	
	
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	WebElement inventoryPage;
	
	@FindBy(xpath="//div[contains(text(),'Discuss')]")
	WebElement DiscussPage;
	
	@FindBy(xpath="//div[contains(text(),'Manufacturing')]")
	WebElement ManufacturingPage;
	
	@FindBy(xpath="//button[contains(@title,'Products')]/parent::*")
	WebElement productsTitle;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement dropDownProductsLink;
	
	  @FindBy(xpath="//button[@title='Create record']/parent::div") 
	  WebElement createBtn;
	  
	  @FindBy(xpath="//button[contains(text(),'Save')]") 
	  WebElement saveBtn;
	  
	  @FindBy(xpath="//button[@data-original-title='Create record']") 
	  WebElement createUpdateQntBtn;
	  
	  @FindBy(xpath="//button[@data-original-title='Create record']") 
	  WebElement createManufacturingPage;
	  
	  @FindBy(xpath="//button[@name='action_confirm']") 
	  WebElement confirmBtn;
	  
	  @FindBy(xpath="//button[@name='button_mark_done']/parent::div") 
	  WebElement markDoneBtn;
	  	
	  @FindBy(xpath="//span[contains(text(),'Update Quantity')]") 
	  WebElement updateQuantity;
	 
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyAllFeatureNames(){
		return homeMenuScroll.isDisplayed();
	}
	
	public boolean verifyDiscussFeatureName(){
		return DiscussPage.isDisplayed();
	}
	
	public boolean verifyInventoryFeatureName(){
		return inventoryPage.isDisplayed();
	}
	
	public boolean verifyManufacturingFeatureName(){
		return ManufacturingPage.isDisplayed();
	}
	
	public void verifyClickOnHomeMenu(){
		try {
			Actions action = new Actions(driver);
			action.moveToElement(homeMenu).build().perform();
			homeMenu.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("HomeMenu Clicked");
		}
		
			}
	
	public InventoryFeatureHomePage clickInventoryLink(){
		inventoryPage.click();
		return new InventoryFeatureHomePage();
	}
	
	
	public void clickOnManufacturingPage(){
		Actions action = new Actions(driver);
		action.moveToElement(ManufacturingPage).build().perform();
		ManufacturingPage.click();
		
	}
	public void clickOnNewCreateProductPage(){
		Actions action = new Actions(driver);
		productsTitle.click();
		action.moveToElement(dropDownProductsLink).build().perform();
		dropDownProductsLink.click();
		
	}
	
	public void clickCreateBtnofProductPage(){
		Actions action = new Actions(driver);
		action.moveToElement(createBtn).build().perform();
		createBtn.click();
		
	}
	
	public void clickOnSaveBtn(){
		Actions action = new Actions(driver);
		action.moveToElement(saveBtn).build().perform();
		saveBtn.click();
		
	}
	
	public void clickOnUpdateQuant(){
			Actions action = new Actions(driver);
			action.moveToElement(updateQuantity).build().perform();
			updateQuantity.click();
		
		
	}
	
	public void clickOnCreateOfUpdateQuant(){	
		try {
			Actions action = new Actions(driver);
			action.moveToElement(createUpdateQntBtn).build().perform();
			createUpdateQntBtn.click();
		} catch (Exception e) {
			System.out.println("clicked On CreateOfUpdateQuant");
		} 
	}
			
		public void clickOnCreateOfManuFact(){	
			try {
				Actions action = new Actions(driver);
				action.moveToElement(createManufacturingPage).build().perform();
				createManufacturingPage.click();
			} catch (Exception e) {
				System.out.println("clicked On CreateOf Manufacturing");
			}		
		}
	
		public void clickOnConfirmOFManuFactPage(){	
			try {
				Actions action = new Actions(driver);
				action.moveToElement(confirmBtn).build().perform();
				confirmBtn.click();
				action.moveToElement(markDoneBtn).build().perform();
				markDoneBtn.click();
			} catch (Exception e) {
				System.out.println("clicked On Confirm Button and Done Btn of Manufacturing Order Page");
			}		
		}
	
		public void confirmationPopUp() throws InterruptedException
		{   Thread.sleep(3000);
			try {
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				WebElement text =driver.findElement(By.xpath("//header[@class='modal-header']/h4 "));
				Assert.assertEquals(alert.getText(),text);
				
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("Clicked OK On Confirmation Pop UP");
			}
		}
		



		
}
