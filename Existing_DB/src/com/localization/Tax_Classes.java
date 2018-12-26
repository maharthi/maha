package com.localization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

@SuppressWarnings("unused")
public class Tax_Classes extends BaseClass {

	@FindBy(xpath = "//*[@id='system']/a")
	WebElement System;
	
	@FindBy(xpath = "//*[@id='system']/ul/li[3]/a")
	WebElement 	Localisation;
	
	@FindBy(xpath = "//*[@id='system']/ul/li[3]/ul/li[1]/a")
	WebElement 	Taxes;
	
	@FindBy(xpath = "//*[@id='system']/ul/li[3]/ul/li[1]/ul/li[1]/a")
	WebElement 	TaxClasses;

	@FindBy(xpath = "//*[@id='system']/ul/li[3]/ul/li[1]/ul/li[2]/a")
	WebElement 	TaxRates;
	
	@FindBy(linkText = "Insert")
	WebElement 	Insert;
	
	@FindBy(xpath = "//*[@id='form']/table[1]/tbody/tr[1]/td[2]/input")
    WebElement 	TaxClassTitle;
	
	@FindBy(xpath = "//*[@id='form']/table[1]/tbody/tr[2]/td[2]/input")
    WebElement 	Description;
	
	@FindBy(xpath = "//*[@id='tax-rule']/tfoot/tr/td[2]/a")
	WebElement 	AddRule;
	
	@FindBy(xpath = "//*[@id='form']/table[1]/tbody/tr[2]/td[2]/input")
    WebElement 	TaxRate;
	
	@FindBy(xpath = "//*[@id['tax-rule-row0']/tr/td[2]/select")
    WebElement 	Basedon;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/a[1]")
	WebElement 	Submit;
	
	//Tax class added successfully message
	@FindBy(xpath = "//*[@id='content']/div[2]")
    WebElement 	Succesmessage;
	
	//Tax class title error message
	@FindBy(xpath = "//*[@id='form']/table[1]/tbody/tr[1]/td[2]/span")
    WebElement 	Taxclasstitleerrormessage;
	
	//Description error message
	@FindBy(xpath = "//*[@id='form']/table[1]/tbody/tr[2]/td[2]/span")
    WebElement  Descriptionerrormessage;
	
	//Edit link in tax classes
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[1]/td[3]/a")
	WebElement  Edit;
	
	//Modification successful message
	@FindBy(xpath = "//*[@id='content']/div[2]")
	WebElement  Modifysuccessmessage;
	
	//To get the Tax Class created successfully message		
	public String Tax_Classes_Create_Success_Message() 
	{
	return Succesmessage.getText();
	}
	
	//To get the Tax Class modified message
	public String Tax_Classes_Modify_Success_Message() 
	{
	return Modifysuccessmessage.getText();
	}
	
	//To get Tax Class Title message
	public String Tax_Class_Title_Error_Message()
	{
	return Taxclasstitleerrormessage.getText();
	}
	
	//To get Tax Class Tax Description
	public String Tax_Description_Error_Message()
	{
	return Descriptionerrormessage.getText();
	}
    
	public void Screenshot (String Method){	
	TakeScreenShoot.TakeScreenshot(Method);
	}
	
	public static void waiting1(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Read data values from excel
	ExcelReader read = new ExcelReader();	
	BaseClass Base = new BaseClass();
	TakeScreenShoot ScrnShot = new TakeScreenShoot();
	
	//Tax Class Create
	public void Create_Tax_Class() 
	{
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();	
	/*Actions act=new Actions(driver);
	act.moveToElement(System).perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	act.moveToElement(Localisation).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	act.moveToElement(Taxes).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	act.click(TaxClasses).build().perform();*/
	Insert.click();
	TaxClassTitle.click();
	TaxClassTitle.sendKeys(read.getsheetnumber(32, 1, 0));
	Description.click();
	Description.sendKeys(read.getsheetnumber(32, 1, 1));
	Submit.click();
	Assert.assertEquals("Success: You have added a new tax class!", Tax_Classes_Create_Success_Message(), "Tax Classes Creation Assertion Failed");
	}
	
	public void Create_Tax_Class_Without_Mandatory()  {
	SoftAssert sAssert = new SoftAssert();
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();
	Insert.click();
	Submit.click();
	sAssert.assertEquals("Tax Class Title must be between 3 and 32 characters!", Tax_Class_Title_Error_Message(), "Tax Class Name Assertion Failed");
	sAssert.assertEquals("Description must be between 3 and 255 characters!", Tax_Description_Error_Message() ,"Tax Class Description Assertion Failed");  
    sAssert.assertAll();
	}
    
	/*//Tax Class from Excel - For create with invalid data	
	public void Create_Tax_Class_With_Invalid()  {
	SoftAssert sAssert = new SoftAssert();
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();	
	Insert.click();
	TaxClassTitle.click();
	TaxClassTitle.clear();
	TaxClassTitle.sendKeys(read.getsheetnumber(31, 4, 0));
	Description.click();
	Description.clear();
	Description.sendKeys(read.getsheetnumber(31, 4, 1));
	Submit.click();
	sAssert.assertEquals("Tax Class Title must be between 3 and 32 characters!", Tax_Class_Title_Error_Message(), "Tax Class Name Assertion Failed");
	sAssert.assertEquals("Description must be between 3 and 255 characters!", Tax_Description_Error_Message() ,"Tax Class Description Assertion Failed");  
	sAssert.assertAll();
	}*/
	
	//Tax Class from Excel - For Edit	
	public void Edit_Tax_Class() {
	Actions act=new Actions(driver);
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();	
	Edit.click();
	TaxClassTitle.click();
	TaxClassTitle.clear();
	TaxClassTitle.sendKeys(read.getsheetnumber(32, 5, 0));
	Description.click();
	Description.clear();
	Description.sendKeys(read.getsheetnumber(32, 5, 1));
	Submit.click();
	Assert.assertEquals("Success: You have modified tax classes!", Tax_Classes_Modify_Success_Message(), "Tax Classes Edit Assertion Failed");
	}
	
	//Edit_Tax_Class_Without_Mandatory
	public void Edit_Tax_Class_Without_Mandatory() {
	SoftAssert sAssert = new SoftAssert();
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();	
	Edit.click();
	TaxClassTitle.click();
	TaxClassTitle.clear();
	Description.click();
	Description.clear();
	Submit.click();
	sAssert.assertEquals("Tax Class Title must be between 3 and 32 characters!", Tax_Class_Title_Error_Message(), "Tax Class Name Assertion Failed");
	sAssert.assertEquals("Description must be between 3 and 255 characters!", Tax_Description_Error_Message() ,"Tax Class Description Assertion Failed");  
    sAssert.assertAll();
	}

	/*//Edit_Tax_Class_With_Invalid_Data
	public void Edit_Tax_Class_With_Invalid() {
	SoftAssert sAssert = new SoftAssert();
	WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(System));
	element1.click();
	WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Localisation));
	element2.click();
	WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(Taxes));
	element3.click();
	WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(TaxClasses));
	element4.click();	
	Edit.click();
	TaxClassTitle.click();
	TaxClassTitle.clear();
	TaxClassTitle.sendKeys(read.getsheetnumber(31, 7, 0));
	Description.click();
	Description.clear();
	Description.sendKeys(read.getsheetnumber(31, 7, 1));
	Submit.click();
	sAssert.assertEquals("Tax Class Title must be between 3 and 32 characters!", Tax_Class_Title_Error_Message(), "Tax Class Name Assertion Failed");
	sAssert.assertEquals("Description must be between 3 and 255 characters!", Tax_Description_Error_Message() ,"Tax Class Description Assertion Failed");  
	sAssert.assertAll();
	}*/
}
