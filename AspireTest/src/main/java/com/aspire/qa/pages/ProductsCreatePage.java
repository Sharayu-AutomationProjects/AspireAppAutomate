package com.aspire.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aspire.qa.base.TestBase;

public class ProductsCreatePage extends TestBase{

	
	  @FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]/span")
	  WebElement productsPageLable;
	
	  @FindBy(xpath="//button[@title='Create record']/parent::div") 
	  WebElement createBtn;
	 
	  @FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]/span")
	  WebElement productCreateNewPageLable;
	
	  @FindBy(xpath="//button[contains(text(),'Save')]") 
	  WebElement saveBtn;
	
	  @FindBy(xpath="//button[contains(text(),'Discard')]") 
	  WebElement discardBtn;
	
	  @FindBy(xpath="//span[contains(text(),'Update Quantity')]") 
	  WebElement updateQuantity;
	
	  @FindBy(xpath="//input[@name='name']") 
	  WebElement productname;
	
	  @FindBy(xpath="//select[@name='detailed_type']") 
	  WebElement productType;
	  
	  @FindBy(xpath="//label[contains(text(),'Unit of Measure') and @class]") 
	  WebElement unitOfMeasure;
	
	  @FindBy(xpath="//label[contains(text(),'Purchase UoM') and @class]") 
	  WebElement purchaseUoM;

	  @FindBy(xpath="//div[@name='list_price']") 
	  WebElement salesPrice;
	  
	  @FindBy(xpath="//div[@name='standard_price']") 
	  WebElement cost;
	
	  @FindBy(xpath="//label[contains(text(),'Product Category') and @class]") 
	  WebElement productCategory;
	
	  @FindBy(xpath="//label[contains(text(),'Internal Reference') and @class]") 
	  WebElement internalRef;
	
	  @FindBy(xpath="//input[@name='barcode' and @placeholder]") 
	  WebElement barcode;
	
	  @FindBy(xpath="//a[contains(text(),'General Information')]") 
	  WebElement generalInfoSection;
	  
	  @FindBy(xpath="//a[contains(text(),'Inventory') and @role='tab']") 
	  WebElement inventorySection;
	  
	  @FindBy(xpath="//label[contains(text(),'Routes') and @class='o_form_label']") 
	  WebElement routesLabel;
	
	  @FindBy(xpath="//label[contains(text(),'Responsible') and @class='o_form_label']") 
	  WebElement responsibleLabel;
	  
	  @FindBy(xpath="//label[contains(text(),'Weight') and @class='o_form_label']") 
	  WebElement weightLabel;
	  
	  @FindBy(xpath="//label[contains(text(),'Volume') and @class='o_form_label']") 
	  WebElement volumeLabel;
	  
	  @FindBy(xpath="//label[contains(text(),'Manuf. Lead Time') and @class='o_form_label']") 
	  WebElement manufTimeLabel;
	
	  @FindBy(xpath="//label[contains(text(),'Customer Lead Time') and @class='o_form_label']") 
	  WebElement customerTimeLabel;
	  
	  @FindBy(xpath="//label[contains(text(),'Tracking') and @xpath]") 
	  WebElement trackingLabel;
	  
	  @FindBy(xpath="//input[@title='Search for records']") 
	  WebElement searchTextField;
	  
	  @FindBy(xpath="//a[contains(text(),'Products')]")
		WebElement dropDownProductsLink;
	  
	  @FindBy(xpath="//label[contains(text(),'Can be Sold')]")
			WebElement canBeSoldCheckBox;
	
	  @FindBy(xpath="//label[contains(text(),'Can be Purchased')]")
		WebElement canBePurchasedCheckBox;
	
	  public ProductsCreatePage() {
			PageFactory.initElements(driver, this);
		}
	  
	  public void verifyproductsClickPage(){
			productsPageLable.click();
		}
	  
	   public boolean verifyproductsLablePage(){
			return productsPageLable.isDisplayed();
		}
	  public boolean verifyproductsNewPage(){
			return productCreateNewPageLable.isDisplayed();
		}
	  
	  public boolean verifyCreateButton(){
			return createBtn.isDisplayed();
		}
	  
	  public boolean verifySearchField(){
			return searchTextField.isDisplayed();
		}

	  public boolean verifyDropdownProductPage(){
			return dropDownProductsLink.isDisplayed();
		}
//--------------------------------------------------	 //
	  
	  public void clickOnCreateBtn() {try {
		  createBtn.click();
	  	} catch (Exception e) {
		System.out.println("Clicked on CreateBtn");
	  	}
		  
	  }
	  
	  	  
	  public void createNewProduct(){	
		  	
		  try {
			  canBeSoldCheckBox.click();
			  canBePurchasedCheckBox.click();
			  productname.sendKeys("Sharu01");
			  Select select = new Select(driver.findElement(By.name("detailed_type")));
				select.selectByVisibleText("Storable Product");
				salesPrice.sendKeys("75");
						} catch (Exception e) {
			System.out.println("Name is Entered");
			
		}
 		 
		} 
	  
	  
/*
 * public void createNewProduct(String title, String ftName, String sale){
 * Select select = new Select(driver.findElement(By.name("detailed_type")));
 * select.selectByVisibleText(title);
 * 
 * canBeSoldCheckBox.click(); canBePurchasedCheckBox.click();
 * productname.sendKeys(ftName); salesPrice.sendKeys(sale); saveBtn.click();
 * 
 * }
 */
	  
	
	  public  updateQuantityPage updateQuantitylink(){	
		  try {
			  updateQuantity.click();
			
		} catch (Exception e) {
			System.out.println("updateQuantity clicked");
		}
		 
		  return new updateQuantityPage();
			
		}
	 
	  
	
	
	
	
}
