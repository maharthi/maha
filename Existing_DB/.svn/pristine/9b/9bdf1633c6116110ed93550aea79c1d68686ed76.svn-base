package com.createnvod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;


public class Create_nvod extends BaseClass
{

	@FindBy(xpath="//a[text()='Catalog']")  // clicking on catalog 
	 WebElement Catalog;
	
	@FindBy(linkText ="Nvod")  // clicking on Nvod
	 WebElement Nvod1;	
 

	@FindBy(xpath="//a[text()='Insert']")   // clicking on insert button
	 WebElement insert;	
	
	@FindBy(xpath = "//a[text()='General']")
	WebElement General;
	
	@FindBy(xpath="//*[@id='option-none']/input")  // clicking on nvod name
	private WebElement text;
	
	@FindBy(linkText ="Data")// clicking on data tab
	//@FindBy(xpath="//*[@id='tabs']/a[2]")
	WebElement Data;
	
	@FindBy(xpath = "//*[@id='tab-data']/table/tbody/tr[1]/td[2]/input")    // clicking on data tab
	WebElement LCN;
	
	@FindBy(xpath = "//*[@id='tab-data']/table/tbody/tr[2]/td[2]/input")   // clicking on nvod no.
	WebElement NvodNo;
	
	@FindBy(xpath = "//*[@id='tab-data']/table/tbody/tr[3]/td[2]/input")  
	WebElement ServiceID;
	
	@FindBy(xpath ="//*[@id='tab-data']/table/tbody/tr[4]/td[2]/input")
	WebElement AccessCriteria;
	
	@FindBy(xpath ="//*[@id='tab-data']/table/tbody/tr[5]/td[2]/input")
	WebElement Price;
	
	@FindBy(xpath="//*[@id='tabs']/a[3]")
	WebElement Links;
	
	@FindBy(xpath="//*[@id='tab-links']/table/tbody/tr[1]/td[2]/input")
	WebElement Category;
	
	@FindBy(xpath="//html/body/ul[1]/li/a")
	WebElement ChPack;
	
	@FindBy(xpath="//*[@id='tabs']/a[5]")
	WebElement Option;
	
	@FindBy(xpath="//*[@id='option-add']/input")
	WebElement Subscription;
	
	@FindBy(xpath="//html/body/ul[4]/li[2]/a")
	WebElement Sub;
	
	@FindBy(xpath="//*[@id='option-value0']/tfoot/tr/td[2]/a")
	WebElement AddValue;
	
	@FindBy(xpath="//*[@id='option-value-row0']/tr/td[1]/select")
	WebElement MSelect;
			
	@FindBy(xpath="//*[@id='option-value-row0']/tr/td[2]/input")
	WebElement SubPrice;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/a[1]")  // Clicking on submit button
	WebElement Submit;
	
	//Nvod added successfully
	@FindBy(xpath = "//div[text()='Success: You have added a Product successfully!']")
	WebElement Nvod_Added_Successfull;
		
	@FindBy(name="filter_name")  // Searching Nvod_name
	WebElement NvodNameSearch;
		
	@FindBy(linkText ="Search")   // Clicking on search button
	WebElement Search;
	
	@FindBy(linkText = "Edit")   // Clicking on edit link
	WebElement Edit;
	
	
	//Warning if Nvod not added
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Nvod_notAdded_Warning;
  
	//Nvod edited successfully
	@FindBy(xpath = "//div[text()='Product updated successfully!']")
	WebElement Nvod_Edited_Successfully;
		
	//if no search results are there
	@FindBy(xpath = "//td[contains(text(),'No results!')]")
	WebElement Search_Result;
		
	//warning message while editing
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Warning_Message_OnEdit;
		
	
	//Getting button elements
	@FindBy(className ="button")
	List<WebElement> All_elements;
		
	//Nvod Name validation message
	@FindBy(xpath=".//*[@id='language1']/table/tbody/tr[2]/td[2]/span")
	WebElement Nvod_Validate_Msg;
		
	//LCN Validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[1]/td[2]/span")
	WebElement LCN_Validate_Msg;
		
	//nvod No Validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[2]/td[2]/span")
	WebElement Nvod_no_Msg;
		
	//Service ID Validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[3]/td[2]/span")
	WebElement Service_ID_Msg;
		
	//Access Criteria validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[4]/td[2]/span")
	WebElement Access_Criteria_Msg;
		
	//Price validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[5]/td[2]/span")
	WebElement Price_Msg;
		
	//Categories validation message
	@FindBy(xpath = ".//*[@id='tab-links']/table/tbody/tr[1]/td[2]/span")
	WebElement Categories_Msg;
		
	//Option validation message
	@FindBy(xpath = ".//*[@id='tab-option']/span")
	WebElement Option_Msg;
		
	//Option - sub price validation message
	@FindBy(xpath=".//*[@id='option-value0']/thead/tr/td[2]/span[2]")
	WebElement Subprice_Msg;
		 
	//Links - remove categories
	@FindBy(xpath = ".//*[@id='product-category110']/img")
	WebElement Category_remove;	
	
	
	//To get the Nvod created successfully message		
		public String Nvod_Created_Successfully() 
		{
			return Nvod_Added_Successfull.getText();
		}                           

		//To get the text of warning message
		public String Warning_On_Nvod_Edit() {
			return Warning_Message_OnEdit.getText();
		}
		
		//To get Nvod Name Validation message
		public String Nvod_Name_Assertion() {
			return Nvod_Validate_Msg.getText();
		}
		
		//To get LCN Validation message
		public String LCN_Assertion() {
			return LCN_Validate_Msg.getText();
		}
		
		//To get Nvod_no Validation message
		public String Nvod_no_Assertion() {
			return Nvod_no_Msg.getText();
		}
		
		//To get Service ID Validation message
		public String Service_ID_Assertion() {
			return Service_ID_Msg.getText();
		}
		
		//To get Access Criteria Validation message
		public String Access_Criteria_Assertion() {
			return Access_Criteria_Msg.getText();
		}
		
		//To get Price Validation message
		public String Price_Assertion() {
			return Price_Msg.getText();
		}
		
		//To get Categories Validation message
		public String Categories_Assertion() {
			return Categories_Msg.getText();	
		}
		
		//To get Option Validation message
		public String Option_Assertion() {
			return Option_Msg.getText();
		}
		
		//To get Option sub price validation message
		public String Option_Subprice_Assertion() {
			return Subprice_Msg.getText();
		}
		
		
  ExcelReader read =new ExcelReader();
  BaseClass Base = new BaseClass();
	TakeScreenShoot ScrnShot = new TakeScreenShoot();

	 public void Adding_new_nvod()
	    {
		    Catalog.click();
	    	Nvod1.click();
	    	insert.click();
	    	text.sendKeys(read.getsheetnumber(9, 1, 0));
	    	Data.click();
	    	LCN.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 1)));
			NvodNo.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 2)));
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 3)));
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 4)));
			Price.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 5)));
			Links.click();
			Category.sendKeys(read.getsheetnumber(9, 1, 6));
			ChPack.click();
			Option.click();
			Subscription.sendKeys(read.getsheetnumber(9, 0, 7));
			Sub.click();
			AddValue.click();
			new Select(MSelect).selectByVisibleText("1 day");
			SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(9, 1, 7)));
			Submit.click();
			Assert.assertEquals("Success: You have added a Product successfully!", Nvod_Created_Successfully(), "Nvod Creation Assertion Failed");
	    	
	    }
	 
	  //Takes screenshot for all tabs			
		public void Screenshot_of_All_Tab(String Method){	
			TakeScreenShoot.TakeScreenshot(Method);
			Data.click();			
			TakeScreenShoot.TakeScreenshot(Method);
			Links.click();			
			TakeScreenShoot.TakeScreenshot(Method);
			Option.click();			
			TakeScreenShoot.TakeScreenshot(Method);	
		}
	 
	
		//Take screenshot of respective tab
		public void Screenshot_single(String Method) {
			TakeScreenShoot.TakeScreenshot(Method);
		}
		
	
		public String Nvod_Edited_Successfully() 
		{
			return Nvod_Edited_Successfully.getText();
		}
		
	
		//Nvod Name from Excel - For Edit
		public void Edit_Nvod()
		{
		Catalog.click();
		Nvod1.click();
		//NvodNameSearch.sendKeys(read.getsheetnumber(5, 1, 0));
	//	Search.click();
	//	Nvod_search_Assertion();	
		Edit.click();
		//text.clear();
		//text.sendKeys(read.getsheetnumber(6, 1, 0));
		Data.click();	
		LCN.clear();
		LCN.sendKeys(String.valueOf(read.getsheetnumber1(10, 1, 1)));
		ServiceID.clear();
		ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(10, 1, 3)));
		AccessCriteria.clear();
		AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(10, 1, 4)));
		Price.clear();
		Price.sendKeys(String.valueOf(read.getsheetnumber1(10, 1, 5)));
		Links.click();
		Category.clear();
		Category.sendKeys(read.getsheetnumber(10, 1, 6));
		ChPack.click();
		Option.click();
		new Select(MSelect).selectByVisibleText("1 day");
		SubPrice.clear();
		SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(10, 1, 7)));
		Submit.click();
		Assert.assertEquals("Product updated successfully!", Nvod_Edited_Successfully(), "Nvod Editing Assertion Failed");
		}
		    

		//Assertion to check channel is available or not
		public void Nvod_search_Assertion() {
		 
		//System.out.println(getAllData().size());
		if (getAllData().size()==3 && Edit.isEnabled()==false) {
		String Expected = "No results!";	
		String Actual = Search_Result.getText();
		Assert.assertNotEquals(Actual, Expected, "Search results assertion failed");
		}
		else {
		System.out.println("Nvod found in Search");	
		}
		}
		
		
		  //to get all the button in the page
		public List<WebElement> getAllData() {
            return All_elements;
		}
		
		
		//Validation of Nvod creation without entering mandatory data
		public void Nvod_Create_Without_mandatory_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
			insert.click();
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		    sAssert.assertEquals(Nvod_Name_Assertion(), "Length should be between 3-64 characters!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "LCN Length should be less than or equal to 4!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Nvod_no_Assertion(), "Nvod No.at least 1 digit no. and less than 64 digit no.!" ,"Nvod No Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Service ID Length should be less than or equal to 5!" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Access Criteria Length should be less than or equal to 4!" ,"Access_Criteria Assertion Failed");
		    sAssert.assertEquals(Price_Assertion(), "Price must be digits!" ,"Price Assertion Failed");
		    Links.click();
		    sAssert.assertEquals(Categories_Assertion(), "Category did not match!" ,"Category Assertion Failed");
		    Option.click();
		    sAssert.assertEquals(Option_Assertion(), "Choose subscription to add options!" ,"Options Assertion Failed");
		    General.click();
		    sAssert.assertAll();
		}
		
		
		
		//Validation of nvod creation with invalid input
		public void Nvod_Create_With_invalid_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
			insert.click();
			text.sendKeys(read.getsheetnumber(9, 2, 0));
			Data.click();
			LCN.sendKeys(read.getsheetnumber(9, 2, 1));
			NvodNo.sendKeys(read.getsheetnumber(9, 2, 2));
			ServiceID.sendKeys(read.getsheetnumber(9, 2, 3));
			AccessCriteria.sendKeys(read.getsheetnumber(9, 2, 4));
			Price.sendKeys(read.getsheetnumber(9, 2, 5));
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		    sAssert.assertEquals(Nvod_Name_Assertion(), "Length should be between 3-64 characters!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "LCN must be digits!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Nvod_no_Assertion(), "Nvod No. must be digits!" ,"Nvod No Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Service ID must be digits!" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Access Criteria must be digits!" ,"Access_Criteria Assertion Failed");
		    sAssert.assertEquals(Price_Assertion(), "Price must be digits!" ,"Price Assertion Failed");
		    Links.click();
		    sAssert.assertEquals(Categories_Assertion(), "Category did not match!" ,"Category Assertion Failed");
		    Option.click();
		    sAssert.assertEquals(Option_Assertion(), "Choose subscription to add options!" ,"Options Assertion Failed");
		    General.click();
		    sAssert.assertAll();
		}
		
		
		//Validation of Nvod_creation with duplicate data
		public void Nvod_create_with_duplicate_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
			insert.click();
			text.sendKeys(read.getsheetnumber(9, 3, 0));
			Data.click();
			LCN.sendKeys(String.valueOf(read.getsheetnumber1(9, 3, 1)));
			NvodNo.sendKeys(String.valueOf(read.getsheetnumber1(9, 3, 2)));
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(9, 3, 3)));
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(9, 3, 4)));
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		    sAssert.assertEquals(Nvod_Name_Assertion(), "Duplicate Product name and Package name should not be same!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "Warning: Duplicate LCN!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Nvod_no_Assertion(), "Warning: Duplicate Nvod No !" ,"Nvod No Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Warning: Duplicate Service ID !" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Warning: Duplicate Access Criteria!" ,"Access_Criteria Assertion Failed");
		    General.click();
		    sAssert.assertAll();
		}
		
		@FindBy(xpath = "(//a[text()='Edit'])[3]")
		WebElement Edit1;
		
		//Validation of Nvod edit without entering mandatory data
		public void Nvod_Edit_Without_mandatory_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
	//		NvodNameSearch.sendKeys(read.getsheetnumber(5, 1, 0));
	//    	Search.click();
	//		Nvod_search_Assertion();	
			Edit1.click();
		//	Nvod1.clear();
			Data.click();	
			LCN.clear();
			ServiceID.clear();
			AccessCriteria.clear();
			Price.clear();
			Links.click();
			Category_remove.click();
			Option.click();
			new Select(MSelect).selectByVisibleText("1 day");
			SubPrice.clear();
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		   // sAssert.assertEquals(Nvod_Name_Assertion(), "Length should be 3-50 characters!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "LCN Length should be less than or equal to 4!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Service ID Length should be less than or equal to 5!" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Access Criteria Length should be less than or equal to 4!" ,"Access_Criteria Assertion Failed");
		    sAssert.assertEquals(Price_Assertion(), "Price must be digits!" ,"Price Assertion Failed");
		    Links.click();
		    sAssert.assertEquals(Categories_Assertion(), "Category did not match!" ,"Category Assertion Failed");
		    Option.click();
		    sAssert.assertEquals(Option_Subprice_Assertion(), "Price must be digits!" ,"Options-Sub price Assertion Failed");
		    General.click();
		    sAssert.assertAll();			
		}
		
		
		
		//Validation of Nvod edit by entering invalid data
		public void Nvod_Edit_With_invalid_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
			//NvodNameSearch.clear();
			//NvodNameSearch.sendKeys(read.getsheetnumber(5, 1, 0));
			//Search.click();
		    //Nvod_search_Assertion();	
			Edit1.click();
		//	text.clear();
			//text.sendKeys(read.getsheetnumber(6, 2, 0));
			Data.click();
			LCN.clear();
			LCN.sendKeys(read.getsheetnumber(5, 2, 1));
			ServiceID.clear();
			ServiceID.sendKeys(read.getsheetnumber(5, 2, 3));
			AccessCriteria.clear();
			AccessCriteria.sendKeys(read.getsheetnumber(5, 2, 4));
			Price.clear();
			Price.sendKeys(read.getsheetnumber(5, 2, 5));
			Option.click();
			new Select(MSelect).selectByVisibleText("1 day");
			SubPrice.clear();
			SubPrice.sendKeys(read.getsheetnumber(5, 2, 5));
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		//    sAssert.assertEquals(Nvod_Name_Assertion(), "Length should be 3-50 characters!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "LCN Length should be less than or equal to 4!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Service ID Length should be less than or equal to 5!" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Access Criteria Length should be less than or equal to 4!" ,"Access_Criteria Assertion Failed");
		    sAssert.assertEquals(Price_Assertion(), "Price must be digits!" ,"Price Assertion Failed");
		    Option.click();
		    sAssert.assertEquals(Option_Subprice_Assertion(), "Price must be digits!" ,"Options-Sub price Assertion Failed");
		    General.click();
		    sAssert.assertAll();			
		}
		
		
		//Validation of nvod edit by entering duplicate data
		public void Nvod_Edit_With_duplicate_data() {
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Nvod1.click();
			//NvodNameSearch.clear();
			//NvodNameSearch.sendKeys(read.getsheetnumber(5, 1, 0));
			//Search.click();
			//Nvod_search_Assertion();	
			Edit1.click();
			//text.clear();
		//	text.sendKeys(read.getsheetnumber(6, 3, 0));
			Data.click();
			LCN.clear();
			LCN.sendKeys(String.valueOf(read.getsheetnumber1(10, 3, 1)));
			ServiceID.clear();
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(10, 3, 3)));
			AccessCriteria.clear();
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(10, 3, 4)));
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Nvod_Edit(), "Nvod Creation Assertion Failed");
		   // sAssert.assertEquals(Nvod_Name_Assertion(), "Duplicate Product name and Package name should not be same!" ,"Nvod Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals(LCN_Assertion(), "Warning: Duplicate LCN!" ,"LCN Assertion Failed");
		    sAssert.assertEquals(Service_ID_Assertion(), "Warning: Duplicate Service ID !" ,"Service ID Assertion Failed");
		    sAssert.assertEquals(Access_Criteria_Assertion(), "Warning: Duplicate Access Criteria!" ,"Access_Criteria Assertion Failed");
		    sAssert.assertAll();			
		}
		
		   @FindBy(xpath="(//a[@class='top'])[10]")
		    WebElement StoreFont;
		    
		    @FindBy(xpath=".//*[@id='menu']/ul[1]/li/a")
		    WebElement Storepackage;
		    
		    @FindBy(xpath="//input[@name=\"search\"]")
		    WebElement Search1;
		    
		    @FindBy(xpath=".//*[@id='content']/div[6]/div[1]/div[2]/div[2]/a")
		    WebElement LinkText1;
		    
		    @FindBy(xpath="//div[@class='button-search']")
		    WebElement buttonclick;
		
		public void usecase_nvod()
	    {
			SoftAssert sAssert = new SoftAssert();
		    Catalog.click();
	    	Nvod1.click();
	    	insert.click();
	    	text.sendKeys(read.getsheetnumber(63, 1, 0));
	    	Data.click();
	    	LCN.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 1)));
			NvodNo.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 2)));
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 3)));
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 4)));
			Price.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 5)));
			Links.click();
			Category.sendKeys(read.getsheetnumber(63, 1, 6));
			ChPack.click();
			Option.click();
			Subscription.sendKeys(read.getsheetnumber(63, 0, 7));
			Sub.click();
			AddValue.click();
			new Select(MSelect).selectByVisibleText("1 month");
			SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(63, 1, 7)));
			Submit.click();
			Assert.assertEquals("Success: You have added a Product successfully!", Nvod_Created_Successfully(), "Nvod Creation Assertion Failed");
			
			StoreFont.click();
			child(); 
			Search1.sendKeys(read.getsheetnumber(63, 1, 0));
			buttonclick.click();
			Assert.assertTrue(true, LinkText1.getText());
	       // Actions act=new Actions(driver);
	       //act.click(Storepackage).perform();
	       // act.moveToElement(Storepackage).perform();
	       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       //Storepac.click();
	       //Assert.assertEquals("Basic: Rs 200.00", BasicPrice.getText(), "package Edit Assertion Failed");
	        parent();
	        sAssert.assertAll();
	    }
	 
		
		
}
