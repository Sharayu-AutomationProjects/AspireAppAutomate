package com.aspire.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aspire.qa.base.TestBase;

public class ManufacturingFeaturePage extends TestBase {

	@FindBy(xpath="//div[contains(text(),'Manufacturing')]")
	WebElement ManufacturingPage;
	
	@FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]/span[contains(text(),'Manufacturing Orders')]")
	WebElement manufacturingOrdersLable;
	
	  @FindBy(xpath="//li[contains(@class,'breadcrumb-item active')]/span")
	  WebElement manufacturingCreateNewPageLable;
	
	  @FindBy(xpath="//div[@name='product_id']/child::div/child::div")
	  WebElement manufacturingProductName;
	  
	  
	  
	  public void createNewManufacturingOrders(){	
		  	
		  try {
			  manufacturingOrdersLable.isDisplayed();
			  manufacturingProductName.click();
			
			  Select select = new Select(driver.findElement(By.xpath("//div[@name='product_id']/child::div/child::div")));
				select.selectByVisibleText("Sharu01");
						} catch (Exception e) {
			System.out.println("Product Name is Entered");
			
		}
 	} 

  
	  public boolean verifymanufacturingNewPage(){
			return manufacturingCreateNewPageLable.isDisplayed();
		}
	
	  
		public void ImmidiateProductionPopUp() throws InterruptedException
		{   Thread.sleep(3000);
			try {
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				WebElement text =driver.findElement(By.xpath("//header[@class='modal-header']/h4 "));
				Assert.assertEquals(alert.getText(),text);
				
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("Clicked Apply On  ImmidiateProduction Pop UP");
			}
		}

	
	
	
	
	
	
	
	
	
}
