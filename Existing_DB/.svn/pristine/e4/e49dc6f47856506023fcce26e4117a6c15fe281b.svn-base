package com.channelspage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Channels_Page {
	@FindBy(xpath = "//*[@id='catalog']/a")
	WebElement Catalog;

	@FindBy(linkText ="Channels")
	WebElement Channel;
	
	//@FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div[2]/a")
	@FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div/a")
	WebElement Insert;
	
	@FindBy(xpath = "//a[text()='General']")
	WebElement General;
	 
	@FindBy(xpath = "//*[@id='option-none']/input")
	WebElement ChannelName;
	
	@FindBy(linkText ="Data")
	WebElement Data;
	
	@FindBy(xpath = "//*[@id='tab-data']/table/tbody/tr[1]/td[2]/input")
	WebElement LCN;
	
	@FindBy(xpath = "//*[@id='tab-data']/table/tbody/tr[2]/td[2]/input")
	WebElement ChannelNo;
	
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
	
	@FindBy(xpath="//a[text()='Submit']")
	WebElement Submit;
	
	@FindBy(name="filter_name")
	WebElement ChannelNameSearch;
	
	@FindBy(linkText ="Search")
	WebElement Search;
	
	@FindBy(xpath="//*[@id='content']/div[2]")
	WebElement Validation;
	 
	@FindBy(linkText = "Edit")
	WebElement Edit;
	
	//Channel added successfully
	@FindBy(xpath = "//div[text()='Success: You have added a Product successfully!']")
	WebElement Channel_Added_Successfull;
	
	//Warning if channel not added
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Channel_notAdded_Warning;
	
	//Channel edited successfully
	@FindBy(xpath = "//div[text()='Product updated successfully!']")
	WebElement Channel_Edited_Successfully;
	
	//if no search results are there
	@FindBy(xpath = "//td[contains(text(),'No results!')]")
	WebElement Search_Result;
	
	//warning message while editing
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Warning_Message_OnEdit;
	
	//Getting button elements
	@FindBy(className ="button")
	List<WebElement> All_elements;
	
	//Channel Name validation message
	@FindBy(xpath=".//*[@id='language1']/table/tbody/tr[2]/td[2]/span") 
	WebElement Channel_Validate_Msg;
	
	//LCN Validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[1]/td[2]/span")
	WebElement LCN_Validate_Msg;
	
	//Channel No Validation message
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[2]/td[2]/span")
	WebElement Channel_no_Msg;
	
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
	
	//To get the Channel created successfully message		
	public String Channel_Created_Successfully() {
		return Channel_Added_Successfull.getText();
	}
	
	//To get the text of warning message
	public String Warning_On_Channel_Edit() 
	{
		return Warning_Message_OnEdit.getText();
	}
	
	//To get Channel Name Validation message
	public String Channel_Name_Assertion()
	{
		return Channel_Validate_Msg.getText();
	}
	
	//To get LCN Validation message
	public String LCN_Assertion()
	{
		return LCN_Validate_Msg.getText();
	}
	
	//To get Channel_no Validation message
	public String Channel_no_Assertion() {
		return Channel_no_Msg.getText();
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
		
			ExcelReader read = new ExcelReader();	
			BaseClass Base = new BaseClass();
			TakeScreenShoot ScrnShot = new TakeScreenShoot();
			
			//Channel Name from Excel - For Create
			public void Create_Channel_New()
			{
			Catalog.click();
			Channel.click();
			Insert.click();
			ChannelName.sendKeys(read.getsheetnumber(3, 1, 0));
			Data.click();	
			LCN.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 1)));
			ChannelNo.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 2)));
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 3)));
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 4)));
			Price.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 5)));
			Links.click();
			Category.sendKeys(read.getsheetnumber(3, 1, 6));
			ChPack.click();
			Option.click();
			Subscription.sendKeys(read.getsheetnumber(3, 0, 7));
			Sub.click();
			AddValue.click();
			new Select(MSelect).selectByVisibleText("1 month");
			SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(3, 1, 7)));
			Submit.click();
			Assert.assertEquals("Success: You have added a Product successfully!", Channel_Created_Successfully(), "Channel Creation Assertion Failed");
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
			
			public String Channel_Edited_Successfully() 
			{
				return Channel_Edited_Successfully.getText();
			}
			
			//Channel Name from Excel - For Edit
			public void Edit_Channel()
			{
			Catalog.click();
			Channel.click();
			ChannelNameSearch.sendKeys(read.getsheetnumber(3, 1, 0));
			Search.click();
			channel_search_Assertion();	
			Edit.click();
			ChannelName.clear();
			ChannelName.sendKeys(read.getsheetnumber(4, 1, 0));
			Data.click();	
			LCN.clear();
			LCN.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 1)));
			ServiceID.clear();
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 2)));
			AccessCriteria.clear();
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 3)));
			Price.clear();
			Price.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 4)));
			Links.click();
			Category.clear();
			Category.sendKeys(read.getsheetnumber(4, 1, 6));
			ChPack.click();
			Option.click();
			new Select(MSelect).selectByVisibleText("1 month");
			SubPrice.clear();
			SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 7)));
			Submit.click();
			Assert.assertEquals("Product updated successfully!", Channel_Edited_Successfully(), "Channel Editing Assertion Failed");
			}
			
			//Assertion to check channel is available or not
			public void channel_search_Assertion() {
			 
			System.out.println(getAllData().size());
			if (getAllData().size()==3 && Edit.isEnabled()==false) {
			String Expected = "No results!";	
			String Actual = Search_Result.getText();
			Assert.assertNotEquals(Actual, Expected, "Search results assertion failed");
			}
			else {
			System.out.println("Channel found in Search");	
			}
			}
			
            //to get all the button in the page
			public List<WebElement> getAllData() {
	            return All_elements;
			}
			
			//Validation of channel creation without entering mandatory data
			public void Channel_Create_Without_mandatory_data() {
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
				Insert.click();
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Length should be between 3-64 characters!" ,"Channel Name Assertion Failed");
			    Data.click();
			    sAssert.assertEquals(LCN_Assertion(), "LCN Length should be less than or equal to 4!" ,"LCN Assertion Failed");
			    sAssert.assertEquals(Channel_no_Assertion(), "Accepts integer of max length 7" ,"Channel No Assertion Failed");
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
			
			//Validation of channel creation with invalid input
			public void Channel_Create_With_invalid_data() {
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
				Insert.click();
				ChannelName.sendKeys(read.getsheetnumber(3, 2, 0));
				Data.click();
				LCN.sendKeys(read.getsheetnumber(3, 2, 1));
				ChannelNo.sendKeys(read.getsheetnumber(3, 2, 2));
				ServiceID.sendKeys(read.getsheetnumber(3, 2, 3));
				AccessCriteria.sendKeys(read.getsheetnumber(3, 2, 4));
				Price.sendKeys(read.getsheetnumber(3, 2, 5));
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Length should be between 3-64 characters!" ,"Channel Name Assertion Failed");
			    Data.click();
			    sAssert.assertEquals(LCN_Assertion(), "LCN must be digits!" ,"LCN Assertion Failed");
			    sAssert.assertEquals(Channel_no_Assertion(), "Accepts only integers." ,"Channel No Assertion Failed");
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
			
			//Validation of channel_creation with duplicate data
			public void Channel_create_with_duplicate_data() 
			{
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
				Insert.click();
				ChannelName.sendKeys(read.getsheetnumber(3, 3, 0));
				Data.click();
				LCN.sendKeys(String.valueOf(read.getsheetnumber1(3, 3, 1)));
				ChannelNo.sendKeys(String.valueOf(read.getsheetnumber1(3, 3, 2)));
				ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(3, 3, 3)));
				AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(3, 3, 4)));
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Duplicate Product name and Package name should not be same!" ,"Channel Name Assertion Failed");
			    Data.click();
			    sAssert.assertEquals(LCN_Assertion(), "Warning: Duplicate LCN!" ,"LCN Assertion Failed");
			  //  sAssert.assertEquals(Channel_no_Assertion(), "Warning: Duplicate Channel No !" ,"Channel No Assertion Failed");
			    sAssert.assertEquals(Service_ID_Assertion(), "Warning: Duplicate Service ID !" ,"Service ID Assertion Failed");
			    sAssert.assertEquals(Access_Criteria_Assertion(), "Warning: Duplicate Access Criteria!" ,"Access_Criteria Assertion Failed");
			    General.click();
			    sAssert.assertAll();
			}
			
			//Validation of channel edit without entering mandatory data
			public void Channel_Edit_Without_mandatory_data() {
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
				ChannelNameSearch.clear();
				ChannelNameSearch.sendKeys(read.getsheetnumber(4, 1, 0));
				Search.click();
				channel_search_Assertion();	
				Edit.click();
				ChannelName.clear();
				Data.click();	
				LCN.clear();
				ServiceID.clear();
				AccessCriteria.clear();
				Price.clear();
				Links.click();
				Category_remove.click();
				Option.click();
				new Select(MSelect).selectByVisibleText("1 month");
				SubPrice.clear();
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Length should be between 3-64 characters!" ,"Channel Name Assertion Failed");
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
			
			//Validation of channel edit by entering invalid data
			public void Channel_Edit_With_invalid_data() {
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
				ChannelNameSearch.clear();
				ChannelNameSearch.sendKeys(read.getsheetnumber(4, 1, 0));
				Search.click();
				channel_search_Assertion();	
				Edit.click();
				ChannelName.clear();
				ChannelName.sendKeys(read.getsheetnumber(4, 2, 0));
				Data.click();
				LCN.clear();
				LCN.sendKeys(read.getsheetnumber(4, 2, 1));
				ServiceID.clear();
				ServiceID.sendKeys(read.getsheetnumber(4, 2, 3));
				AccessCriteria.clear();
				AccessCriteria.sendKeys(read.getsheetnumber(4, 2, 4));
				Price.clear();
				Price.sendKeys(read.getsheetnumber(4, 2, 5));
				Option.click();
				new Select(MSelect).selectByVisibleText("1 month");
				SubPrice.clear();
				SubPrice.sendKeys(read.getsheetnumber(4, 2, 5));
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Length should be between 3-64 characters!" ,"Channel Name Assertion Failed");
			    Data.click();
			    sAssert.assertEquals(LCN_Assertion(), "LCN must be digits!" ,"LCN Assertion Failed");
			    sAssert.assertEquals(Service_ID_Assertion(), "Service ID must be digits!" ,"Service ID Assertion Failed");
			    sAssert.assertEquals(Access_Criteria_Assertion(), "Access Criteria must be digits!" ,"Access_Criteria Assertion Failed");
			    sAssert.assertEquals(Price_Assertion(), "Price must be digits!" ,"Price Assertion Failed");
			    Option.click();
			    sAssert.assertEquals(Option_Subprice_Assertion(), "Price must be digits!" ,"Options-Sub price Assertion Failed");
			    General.click();
			    sAssert.assertAll();			
			}
			
			//Validation of channel edit by entering duplicate data
			public void Channel_Edit_With_duplicate_data() {
				SoftAssert sAssert = new SoftAssert();
				Catalog.click();
				Channel.click();
			//	ChannelNameSearch.clear();
			//	ChannelNameSearch.sendKeys(read.getsheetnumber(3, 1, 0));
			//	Search.click();
			//	channel_search_Assertion();	
				Edit.click();
				ChannelName.clear();
				ChannelName.sendKeys(read.getsheetnumber(4, 3, 0));
				Data.click();
				LCN.clear();
				LCN.sendKeys(String.valueOf(read.getsheetnumber1(4, 3, 1)));
				ServiceID.clear();
				ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(4, 3, 3)));
				AccessCriteria.clear();
				AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(4, 3, 4)));
				Submit.click();
				sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_Channel_Edit(), "Channel Creation Assertion Failed");
			    sAssert.assertEquals(Channel_Name_Assertion(), "Duplicate Product name and Package name should not be same!" ,"Channel Name Assertion Failed");
			    Data.click();
			    sAssert.assertEquals(LCN_Assertion(), "Warning: Duplicate LCN!" ,"LCN Assertion Failed");
			    sAssert.assertEquals(Service_ID_Assertion(), "Warning: Duplicate Service ID !" ,"Service ID Assertion Failed");
			    sAssert.assertEquals(Access_Criteria_Assertion(), "Warning: Duplicate Access Criteria!" ,"Access_Criteria Assertion Failed");
			    sAssert.assertAll();			
			}
			
			@FindBy(xpath = "//*[@id=\"form\"]/table/tbody/tr[2]/td[3]")			
			WebElement Channel_Name; 
			
			@FindBy(xpath = "//*[@id=\"form\"]/table/tbody/tr[2]/td[5]")
			WebElement Channel_no;
			
			@FindBy(xpath = "//*[@id=\"form\"]/table/tbody/tr[2]/td[6]")
			WebElement Service_ID;
			
			@FindBy(xpath = "//*[@id=\"form\"]/table/tbody/tr[2]/td[7]")
			WebElement Price_Value;
			
			@FindBy(linkText = "Store Front")
			WebElement StoreFront_Link;
			
			@FindBy(linkText = "Channel Packages")
			WebElement Ch_Packages;
			
			//Have to change category name if needed
			@FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul/li[2]/a[contains(text(),'Movies')]")
			WebElement Category_link;
			
			//Have to change channel name which is created
			@FindBy(xpath = "//div[2]//a[contains(text(),'product1')]")
		    WebElement Channel_search;
			
			//Use Case for Creation of Channel
			public void UseCase_Create_Channel(WebDriver driver) 
			{
			Catalog.click();
			Channel.click();
			Insert.click();
			ChannelName.sendKeys(read.getsheetnumber(50, 1, 0));
			Data.click();	
			LCN.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 1)));
			ChannelNo.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 2)));
			ServiceID.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 3)));
			AccessCriteria.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 4)));
			Price.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 5)));
			Links.click();
			Category.sendKeys(read.getsheetnumber(50, 1, 6));
			ChPack.click();
			Option.click();
			Subscription.sendKeys(read.getsheetnumber(50, 0, 7));
			Sub.click();
			AddValue.click();
			new Select(MSelect).selectByVisibleText("1 month");
			SubPrice.sendKeys(String.valueOf(read.getsheetnumber1(50, 1, 7)));
			Submit.click();
			Assert.assertEquals("Success: You have added a Product successfully!", Channel_Created_Successfully(), "Channel Creation Assertion Failed");
			ChannelNameSearch.sendKeys(read.getsheetnumber(50, 1, 0));
			Search.click();			
			UseCase_Channel_Assertion_Add();
			StoreFront_Link.click(); 
			BaseClass.child();
			Actions act = new Actions(driver);
			act.moveToElement(Ch_Packages).build();
			Ch_Packages.click();
			act.moveToElement(Category_link).build();
			Category_link.click();
			//Assert.assertEquals(Channel_search.getText(), read.getsheetnumber(50, 1, 0), "Failed");	
			BaseClass.parent();		
			}
						 
			public void UseCase_Channel_Assertion_Add() {
			SoftAssert sAssert = new SoftAssert();
			sAssert.assertEquals(Channel_Name.getText(), read.getsheetnumber(50, 1, 0), "Channel Name mismatch");
			sAssert.assertEquals(Channel_no.getText(), String.valueOf(read.getsheetnumber1(50, 1, 2)), "Channel No mismatch");
			sAssert.assertEquals(Service_ID.getText(), String.valueOf(read.getsheetnumber1(50, 1, 3)), "Service ID mismatch");
			int i = (int)Double.parseDouble(String.valueOf(Price_Value.getText()));
			sAssert.assertEquals(String.valueOf(i),String.valueOf(read.getsheetnumber1(50, 1, 5)), "Price_Value mismatch");
			sAssert.assertAll();
			}
			
			
}
           