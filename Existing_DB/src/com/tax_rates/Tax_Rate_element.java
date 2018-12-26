package com.tax_rates;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Tax_Rate_element extends BaseClass
{

	
	@FindBy(xpath="//a[text()='System']")  // clicking on system
	WebElement System;
	
	@FindBy(xpath="//a[text()='Localisation']")  // clicking on Localisation
	WebElement Localisation;
	
	@FindBy(xpath="//a[text()='Taxes']")  // clicking on Taxes
	WebElement Taxes;
	
	@FindBy(xpath="//*[@id='system']/ul/li[3]/ul/li[1]/ul/li[1]/a")
	WebElement Tax_dropdown;
	
    @FindBy(xpath="//a[text()='Tax Rates']")  // clicking on Tax rates
	WebElement Taxrates ;
    
    @FindBy(xpath="//a[text()='Insert']")   // clicking on insert button
	WebElement insert;	
	
    @FindBy(xpath="//*[@id='form']/table/tbody/tr[1]/td[2]/input")  // clicking on tax name field
    WebElement inserting_tax_name;
	
    @FindBy(xpath="//*[@id='form']/table/tbody/tr[2]/td[2]/input")  // clicking on tax rates field
    WebElement inserting_tax_rates;
	
    @FindBy(xpath="//*[@id='form']/table/tbody/tr[3]/td[2]/select")   // clicking_on_type_dropdown 
    WebElement clicking_on_type_dropdown;
    
    @FindBy(xpath="//*[@id='system']/ul/li[3]/ul/li[1]/ul/li[1]/a")
    WebElement clicking_on_tax_class_dropdown;
    
    
    @FindBy(xpath=" //*[@id='form']/table/tbody/tr[2]/td[2]/span")
    WebElement invalid_tax_rates;
    
	
    @FindBy(linkText ="Submit")// clicking on submit button
	WebElement Submit;
    
    
    @FindBy(linkText = "Edit")  // clicking on edit link 
	 WebElement Edit;
    
	@FindBy(xpath = "//div[text()='Success: Tax rate added!']")  // Successful validation message of tax rates creation
	WebElement tax_rates_Added_Successfull;
	
	//@FindBy(xpath = "//div[text()='Tax Name must be between 3 and 34 characters!']")  // empty name
	//WebElement validate_msg_for_Empty_text_name;
	
	
//	@FindBy(xpath = "//div[text()='Tax Rate required!']")  // empty rate
	//WebElement validate_msg_for_Empty_text_rates;
	
	@FindBy(xpath = "//div[text()='Success: You have deleted the selected tax rates!']")  // Successful validation message of tax rates edited successfully
	WebElement tax_rates_Edited_Successfull;
	
	
	@FindBy(xpath = ".//*[@id='form']/table/tbody/tr[1]/td[2]/span")  //validation message for empty tax name while creating
    WebElement validate_msg_for_Empty_text_name;
	
	
	@FindBy(xpath = ".//*[@id='form']/table/tbody/tr[2]/td[2]/span")  //validation message for empty tax rates while creating
	WebElement validate_msg_for_Empty_text_rates;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[2]/span") // message for invalid tax_rates
	WebElement validate_msg_for_invalid_text_rates;
	
	//To get the tax_rates name created successfully message		
	public String  tax_rates_Created_Successfully() 
	{
		return tax_rates_Added_Successfull.getText();
	} 
	
	//To get the successful validation edited successfully message		
	public String tax_rates_edit_Successfully() 
	{
		return tax_rates_Edited_Successfull.getText();
	} 
    
	//validation message for empty tax  name while creating
	public String Warning_On_empty_tax_name_name() {
		return validate_msg_for_Empty_text_name.getText();
	}
	
	//validation message for empty tax rate name while creating
		public String Warning_On_empty_tax_rate_name_name() {
			return validate_msg_for_Empty_text_rates.getText();
		}
	    
		//validation message for invalid tax rate name while creating
				public String Warning_On_invalid_tax_rate_name_name() {
					return validate_msg_for_invalid_text_rates.getText();
				}
				
				//validation message for invalid tax rate name while editing
				public String Warning_On_invalid_tax_rate_name_editing() {
					return invalid_tax_rates.getText();
				}	
		
		
				

              public void Screenshot (String Method){	
             TakeScreenShoot.TakeScreenshot(Method);
                 }
				
				

				//Read data values from excel
				ExcelReader read = new ExcelReader();	
				BaseClass Base = new BaseClass();
				TakeScreenShoot Screenshot = new TakeScreenShoot();       
		/*
	    //Takes screenshot for all tabs			
		public void Screenshot_of_All_Tab(String Method){	
			TakeScreenShoot.TakeScreenshot(Method);
			Data.click();			
			TakeScreenShoot.TakeScreenshot(Method);
			Duration.click();			
			TakeScreenShoot.TakeScreenshot(Method);
	                                                   */
	    
		public void Screenshot_single(String Method) {
			TakeScreenShoot.TakeScreenshot(Method);
		}
		
		
		public void Adding_new_tax_rates() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
		    insert.click();
		    inserting_tax_name.sendKeys(read.getsheetnumber(34, 1, 0));
		    inserting_tax_rates.sendKeys(String.valueOf(read.getsheetnumber1(34, 1, 1)));
		    new Select(clicking_on_type_dropdown).selectByVisibleText("Percentage");
		    Submit.click();
		    Assert.assertEquals("Success: Tax rate added!",tax_rates_Created_Successfully(), "tax_rates Creation Assertion Failed");
			   
	  }
			   
		public void Adding_new_tax_rates_with_empty() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
		    insert.click();
            Submit.click();
            Assert.assertEquals("Tax Name must be between 3 and 32 characters!",Warning_On_empty_tax_name_name(), "tax_rates Creation Assertion Failed");
            Assert.assertEquals("Tax Rate required!",Warning_On_empty_tax_rate_name_name(), "tax_rates Creation Assertion Failed");
	   
	    }
		
		
		public void Adding_new_tax_rates_with_invalid() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
		    insert.click();
		    inserting_tax_name.sendKeys(read.getsheetnumber(34, 2, 0));
		    inserting_tax_rates.sendKeys(read.getsheetnumber(34, 2, 1));
		    Submit.click();
		    Assert.assertEquals("Tax Name must be between 3 and 32 characters!",Warning_On_empty_tax_name_name(), "tax_rates Creation Assertion Failed");
		    Assert.assertEquals("Tax Rate should be only digits!",Warning_On_invalid_tax_rate_name_editing(), "tax_rates Creation Assertion Failed");
	  }
		
		//Tax rates from Excel - For Edit	
		
		public void edit_new_tax_rates_with_empty() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
			Edit.click();
			inserting_tax_name.click();
			inserting_tax_name.clear();
			inserting_tax_rates.click();
			inserting_tax_rates.clear();
            Submit.click();
            Assert.assertEquals("Tax Name must be between 3 and 32 characters!",Warning_On_empty_tax_name_name(), "tax_rates Creation Assertion Failed");
            Assert.assertEquals("Tax Rate required!",Warning_On_empty_tax_rate_name_name(), "tax_rates Creation Assertion Failed");
	  }
		
		
		
		public void edit_new_tax_rates_with_valid() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
			Edit.click();
			inserting_tax_name.click();
			inserting_tax_name.clear();
			inserting_tax_name.sendKeys(read.getsheetnumber(34, 1, 0));
			inserting_tax_rates.click();
			inserting_tax_rates.clear();
			inserting_tax_rates.sendKeys(String.valueOf(read.getsheetnumber1(34, 1, 1)));
            Submit.click();
            Assert.assertEquals("Success: You have deleted the selected tax rates!",tax_rates_edit_Successfully(), "tax_rates edit Assertion Failed");
           
	  }
		
		
		public void edit_new_tax_rates_with_invalid() throws AWTException
	    {
		
			WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
			element1.click();
			WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
			element2.click();
			WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
			element3.click();
			WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxrates));
			element4.click();
			Edit.click();
			inserting_tax_name.click();
			inserting_tax_name.clear();
			inserting_tax_name.sendKeys(read.getsheetnumber(34, 2, 0));
			inserting_tax_rates.click();
			inserting_tax_rates.clear();
			inserting_tax_rates.sendKeys(read.getsheetnumber(34, 2, 1));
            Submit.click();
            Assert.assertEquals("Tax Name must be between 3 and 32 characters!",Warning_On_empty_tax_name_name(), "tax_rates Creation Assertion Failed");
		    Assert.assertEquals("Tax Rate should be only digits!",Warning_On_invalid_tax_rate_name_editing(), "tax_rates Creation Assertion Failed");
           
	  }
		
		
		
	
		
		
		
	    
		
		
	    
	    
    
	
	
}
