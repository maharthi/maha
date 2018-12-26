package com.Settings;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Settings_Page extends BaseClass
{
	@FindBy(xpath = "//*[@id='dashboard']/a")
	WebElement Dashboard;
	
	@FindBy(linkText = "System")
	WebElement System;
	
	@FindBy(linkText="Settings")
	WebElement Setting;
	
	@FindBy(linkText="Edit")
	WebElement Edit;
	
	@FindBy(name = "config_name")
	WebElement Store_Name;
	
	@FindBy(name = "config_owner")
	WebElement Store_Owner; 
	
	@FindBy(xpath = "//*[@id='tab-general']/table/tbody/tr[3]/td[2]/textarea")
	WebElement Address;
	
	@FindBy(name = "config_email")
	WebElement Email;
	
	@FindBy(name = "config_telephone")
	WebElement Telephone;
	
	@FindBy(linkText ="Submit")
	WebElement Submit;
	
	@FindBy(linkText ="Cancel")
	WebElement Cancel;
	
	//Settings edited successfully
		@FindBy(xpath = "//div[text()='Success: You have modified settings!']")
		WebElement Settings_Edited_Successfully;
		
	
	//Getting button elements
			@FindBy(className ="button")
			List<WebElement> All_elements;
			
			ExcelReader read = new ExcelReader();	
			BaseClass Base = new BaseClass();
			TakeScreenShoot ScrnShot = new TakeScreenShoot();
			
			//to get all the button in the page
			public List<WebElement> getAllData() 
				{
				  return All_elements;
				}
					
			//Take screenshot of respective page
			public void Screenshot_single(String Method) 
			{
			  TakeScreenShoot.TakeScreenshot(Method);
			}	
			
			
			public void Setting_with_valid_data()
			{
				System.click();
				Setting.click();
				Edit.click();
				Store_Name.clear();				
				Store_Name.sendKeys(read.getsheetnumber(23, 1, 0));
				Store_Owner.clear();
				Store_Owner.sendKeys(read.getsheetnumber(23, 1, 1));
				Address.clear();
				Address.sendKeys(read.getsheetnumber(23, 1, 2));
				Email.clear();
				Email.sendKeys(read.getsheetnumber(23, 1, 3));
				Telephone.clear();
				Telephone.sendKeys(String.valueOf(read.getsheetnumber2(23, 1, 4)));
				Submit.click();
				Assert.assertEquals("Success: You have modified settings!", Settings_Edited_Successfully.getText(), "Broadcaster Creation Assertion Failed");
			}
			
			
			@FindBy(xpath="//div[text()='Warning: Please check the form carefully for errors!']")
			WebElement PageErrorform;
			
			@FindBy(xpath="//span[text()='Store Name must be between 3 and 32 characters!']")
			WebElement EmptyStorename;
				
			@FindBy(xpath="//span[text()='Store Owner must be between 3 and 32 characters!']")
			WebElement EmptyOwnername;
				
			@FindBy(xpath="//span[text()='Store Address must be between 10 and 120 characters!']")
			 WebElement EmptyAddress;
				
			@FindBy(xpath="//span[text()='Please an enter email id']")
			WebElement EmptyEmail ;
				
			@FindBy(xpath="//span[text()='Length should be 10 digits!']")
			WebElement EmptyPhone;
			
			@FindBy(xpath="//span[text()='E-Mail Address does not appear to be valid!']")
			WebElement InvalidEmail;
			
			public void Setting_with_invalid_data()
			{
				SoftAssert sAssert = new SoftAssert();
				System.click();
				Setting.click();
				Edit.click();
				Store_Name.clear();	
				Store_Owner.clear();
				Address.clear();
				Email.clear();
				Telephone.clear();
				Submit.click();
				Assert.assertEquals(true, PageErrorform.isDisplayed());
				Assert.assertEquals(true, EmptyStorename.isDisplayed());
				Assert.assertEquals(true, EmptyOwnername.isDisplayed());
				Assert.assertEquals(true, EmptyAddress.isDisplayed());
				Assert.assertEquals(true, EmptyEmail.isDisplayed());
				Assert.assertEquals(true, EmptyPhone.isDisplayed());
				sAssert.assertAll();
				Store_Name.clear();	
				Store_Name.sendKeys(read.getsheetnumber(23, 2, 0));
				Store_Owner.clear();
				Store_Owner.sendKeys(read.getsheetnumber(23, 2, 1));
				Address.clear();
				Address.sendKeys(read.getsheetnumber(23, 2, 2));
				Email.clear();
				Email.sendKeys(read.getsheetnumber(23, 2, 3));
				Telephone.clear();
				Telephone.sendKeys(String.valueOf(read.getsheetnumber2(23, 2, 4)));
				Submit.click();
				Assert.assertEquals(true, PageErrorform.isDisplayed());
				Assert.assertEquals(true, EmptyStorename.isDisplayed());
				Assert.assertEquals(true, EmptyOwnername.isDisplayed());
				Assert.assertEquals(true, EmptyAddress.isDisplayed());
				Assert.assertEquals(true, InvalidEmail.isDisplayed());
				Assert.assertEquals(true, EmptyPhone.isDisplayed());
				sAssert.assertAll();
				Store_Name.clear();	
				Store_Name.sendKeys(read.getsheetnumber(23, 3, 0));
				Store_Owner.clear();
				Store_Owner.sendKeys(read.getsheetnumber(23, 3, 1));
				Address.clear();
				Address.sendKeys(read.getsheetnumber(23, 3, 2));
				Email.clear();
				Email.sendKeys(read.getsheetnumber(23, 3, 3));
				Telephone.clear();
				Telephone.sendKeys(String.valueOf(read.getsheetnumber2(23, 3, 4)));
				Submit.click();
				Assert.assertEquals(true, PageErrorform.isDisplayed());
				Assert.assertEquals(true, EmptyStorename.isDisplayed());
				Assert.assertEquals(true, EmptyOwnername.isDisplayed());
				Assert.assertEquals(true, EmptyAddress.isDisplayed());
				Assert.assertEquals(true, InvalidEmail.isDisplayed());
				Assert.assertEquals(true, EmptyPhone.isDisplayed());
				sAssert.assertAll();
				
			}
			
			
	
	
	
	
}
