package com.STB_Details;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;
import org.testng.asserts.SoftAssert;

import com.utility.ConfigReader;

public class STB_Details_Page extends BaseClass
{
	@FindBy(xpath = "//*[@id='dashboard']/a")
	WebElement Dashboard;
	
	@FindBy(xpath = "//*[@id='inventry']/a")
	WebElement Inventory;
	
	@FindBy(xpath = "//*[@id='inventry']/ul/li[1]/a")
	WebElement STB_Details;
	
	@FindBy(linkText ="Insert")
	WebElement Insert;
	
	@FindBy(name="stb")
	WebElement STB_Number;
	
	@FindBy(name="sw")
	WebElement Software_Version;
	
	@FindBy(name="hw")
	WebElement Hardware_Version;
	
	@FindBy(name="sc")
	WebElement Smart_card_Dropdown;
	
	@FindBy(xpath = "//*[@id='sc']/option[2]")
	WebElement Msg_for_smartcard;
	
	@FindBy(name="smart_card")
	WebElement Smart_card_TextField;
	
	@FindBy(linkText ="Submit")
	WebElement Submit;
	
	@FindBy(xpath="//div[text()='STB added successfully !']") //*[@id="content"]/div[4]
	WebElement Success;

	@FindBy(xpath = "//span[text()='STB No is mandatory, Length should be 14!']")
	WebElement Warning_Msg_Without_Data;
	
	@FindBy(xpath = "//span[text()='Duplicate STB No.']")
	WebElement Duplicate_warning_MSg;
	
	@FindBy(xpath = "//span[text()='S/W version is mandatory, Accepts only decimal No!']")
	WebElement Warning_Msg_For_Software_Version;
	
	@FindBy(xpath = "//span[text()='H/W version is mandatory, Accepts only decimal No!']")
	WebElement Warning_Msg_For_Hardware_Version;
	
	@FindBy(xpath = "//span[text()='Smart card no is mandatory, Length should be 16!']")
	WebElement Warning_Msg_For_SmartCard;
	
	@FindBy(xpath = "//span[text()='Duplicate smart card number!']")
	WebElement Duplicate_smartcard;
	
	@FindBy(name = "filename")
	WebElement Browse_Button;
	
	// Warning Msg for invalid file
	@FindBy(xpath = "//div[text()='Invalid file format, Only .CSV files are accepted']")
	WebElement Warning_Msg;
	
	@FindBy(xpath ="//*[@id='form']/table/thead/tr[2]/td[2]/select")
	WebElement Operator_dropdown;
	
	@FindBy(xpath = "//*[@id='content']/div[4]/div[1]/div/a[1]")
	WebElement Search_Button;
	
	@FindBy(name="selected[]")
	WebElement Check_Box;
	
	@FindBy(xpath = "//span[text()='admin']")
	WebElement admin_result;
	
	@FindBy(xpath = "//*[@id='scriptBox']")
	WebElement STB_No_Text_Field;
	
	@FindBy(className ="center")
	WebElement Invalid_input;
	
	@FindBy(xpath = "//*[@id='form']/table/thead/tr[2]/td[6]/select")
	WebElement Paired_with_Customer_dropDown;
	
	@FindBy(xpath = "//*[@id='form']/table/thead/tr[2]/td[7]/select")
	WebElement Blacklisted_DropDown;
	
	@FindBy(xpath = "//*[@id='form']/table/thead/tr[2]/td[9]/select")
	WebElement Status_DropDown;
	
	@FindBy(linkText ="Cancel")
	WebElement Cancel;
	
	@FindBy(xpath = "//*[@id='content']/div[4]/div[1]/h1")
	WebElement STB_Details_Page;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[1]")
	Boolean OEM;
	
	@FindBy(xpath = "//*[@id= 'form']/table/tbody/tr[2]/td[2]/select") 
	WebElement OEM_DropDown;
	
	//@FindBy(xpath = "//*[@id='form']/table/tbody/tr[3]/td[2]/select")
	@FindBy(xpath = "(//select)[2]")
	WebElement Model_No_DropDown;
	
	@FindBy(xpath = ".//*[@id='form']/table/tbody/tr[2]/td[2]/span")
	WebElement OEM_Warning_Msg;
	
	@FindBy(xpath = ".//*[@id='form']/table/tbody/tr[3]/td[2]/span")
	WebElement Model_No_Warning_Msg; 
	
	@FindBy(xpath = ".//*[@id='box_type']")
			WebElement STB_Type;	
	
	@FindBy(xpath = ".//*[@id='box_type']/option[2]")
	WebElement HD_Type;
	
	
	//Getting button elements
		@FindBy(className ="button")
		List<WebElement> All_elements;
	
	ExcelReader read = new ExcelReader();	
	BaseClass Base = new BaseClass();
	TakeScreenShoot ScrnShot = new TakeScreenShoot();
	
	public String Warning_Message()
	{
		return Warning_Msg_Without_Data.getText();
	}
	
	//To Insert STB with valid data & with smartcard No
	public void Insert_STB_Details_with_smartcard() throws InterruptedException
	{
		Inventory.click();
		STB_Details.click();
		Insert.click();
		STB_Number.sendKeys(read.getsheetnumber(21, 1, 0));
		Software_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 1, 1)));
		Hardware_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 1, 2)));
		new Select(STB_Type).selectByVisibleText("HD"); 
		Smart_card_Dropdown.click();
		Msg_for_smartcard.click();
		Smart_card_TextField.sendKeys(read.getsheetnumber(21, 1, 3));
		Submit.click();
		//System.out.println(Success.getText());
		Assert.assertEquals("STB added successfully !Click to download response file", Success.getText(), "STB Insertion with smartcard Assertion Failed");
		
	}
	
	    //To Insert STB with valid data & without smartcard No
		public void Insert_STB_Details_without_smartcard()
		{
			Inventory.click();
			STB_Details.click();
			Insert.click(); 
			STB_Number.sendKeys(read.getsheetnumber(21, 2, 0));
			Software_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 2, 1)));
			Hardware_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 2, 2)));
			new Select(STB_Type).selectByVisibleText("HD");
			Submit.click();
			Assert.assertEquals("STB added successfully !Click to download response file", Success.getText(), "STB Insertion without smartcard Assertion Failed");
		}
	
	
	// To Insert STB without mandatory data
	public void Insert_STB_Without_mandatory_data()
	{
		SoftAssert sAssert = new SoftAssert();
		Inventory.click();
		STB_Details.click();
		Insert.click();
		Submit.click();
		//Assert.assertEquals("STB No is mandatory, Length should be 14!", Warning_Msg_Without_Data.getText(), "STB Insertion without data Assertion Failed");
		sAssert.assertEquals(Warning_Msg_Without_Data.getText(), "STB No is mandatory, Length should be 14!" ,"STB No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Software_Version.getText(), "S/W version is mandatory, Accepts only decimal No!" ,"Software No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Hardware_Version.getText(), "H/W version is mandatory, Accepts only decimal No!" ,"Hardtware No Assertion Failed");
		//sAssert.assertEquals(Smart_Card_Assertion(), "Smart card no is mandatory, Length should be 16!" ,"Smart card Assertion Failed");
		sAssert.assertAll();
		
	}
	
 	// To Insert STB with invalid(special character) data (ERROR Existing, we can not run)
	public void Insert_STB_With_invalid_data()
	{
		SoftAssert sAssert = new SoftAssert();
		Inventory.click();
		STB_Details.click();
		Insert.click();
		STB_Number.sendKeys(read.getsheetnumber(21, 3, 0));
		Software_Version.sendKeys(read.getsheetnumber(21, 3, 1));
		Hardware_Version.sendKeys(read.getsheetnumber(21, 3, 2));
		Smart_card_Dropdown.click();
		Msg_for_smartcard.click();
		Smart_card_TextField.sendKeys(read.getsheetnumber(21, 3, 3));
		Submit.click();
		Assert.assertEquals("STB No is mandatory, Length should be 14!", Warning_Msg_Without_Data.getText() , "STB Insertion with invalid data Assertion Failed");
		sAssert.assertEquals(Warning_Msg_Without_Data.getText(), "STB No is mandatory, Length should be 14!" ,"STB No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Software_Version.getText(), "S/W version is mandatory, Accepts only decimal No!" ,"Software No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Hardware_Version.getText(), "H/W version is mandatory, Accepts only decimal No!" ,"Hardtware No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_SmartCard.getText(), "Smart card no is mandatory, Length should be 16!" ,"Smart card Assertion Failed");
		sAssert.assertAll();
		
	}
	
	// To Insert STB with invalid(less than actual length) data 
	public void Insert_STB_Less_than_actual_length()
	{
		SoftAssert sAssert = new SoftAssert();
		Inventory.click();
		STB_Details.click();
		Insert.click();
		STB_Number.sendKeys(read.getsheetnumber(21, 4, 0));
		Software_Version.sendKeys(read.getsheetnumber(21, 4, 1));
		Hardware_Version.sendKeys(read.getsheetnumber(21, 4, 2));
		Smart_card_Dropdown.click();
		Msg_for_smartcard.click();
		Smart_card_TextField.sendKeys(read.getsheetnumber(21, 4, 3));
		Submit.click();
		Assert.assertEquals("STB No is mandatory, Length should be 14!", Warning_Msg_Without_Data.getText(), "STB Insertion with invalid data Assertion Failed");
		sAssert.assertEquals(Warning_Msg_Without_Data.getText(), "STB No is mandatory, Length should be 14!" ,"STB No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Software_Version.getText(), "S/W version is mandatory, Accepts only decimal No!" ,"Software No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_Hardware_Version.getText(), "H/W version is mandatory, Accepts only decimal No!" ,"Hardtware No Assertion Failed");
		sAssert.assertEquals(Warning_Msg_For_SmartCard.getText(), "Smart card no is mandatory, Length should be 16!" ,"Smart card Assertion Failed");
		sAssert.assertAll();
		}
	
	// To Insert STB with invalid(Greater than actual length) data 
		public void Insert_STB_Greater_than_actual_length()
		{
			SoftAssert sAssert = new SoftAssert();
			Inventory.click();
			STB_Details.click();
			Insert.click();
			STB_Number.sendKeys(read.getsheetnumber(21, 5, 0));
			Software_Version.sendKeys(read.getsheetnumber(21, 5, 1));
			Hardware_Version.sendKeys(read.getsheetnumber(21, 5, 2));
			Smart_card_Dropdown.click();
			Msg_for_smartcard.click();
			Smart_card_TextField.sendKeys(read.getsheetnumber(21, 5, 3));
			Submit.click();
			//Assert.assertEquals("STB No is mandatory, Length should be 14!", Warning_Msg_Without_Data.getText(), "STB Insertion with invalid data Assertion Failed");
			sAssert.assertEquals(Warning_Msg_Without_Data.getText(), "STB No is mandatory, Length should be 14!" ,"STB No Assertion Failed");
			sAssert.assertEquals(Warning_Msg_For_SmartCard.getText(), "Smart card no is mandatory, Length should be 16!" ,"Smart card Assertion Failed");
			sAssert.assertAll();
			}
			
	
	// To Insert STB with Duplicate data
	public void Insert_STB_With_Duplicate_Data()
	{
		SoftAssert sAssert = new SoftAssert();
		Inventory.click();
		STB_Details.click();
		Insert.click();
		STB_Number.sendKeys(read.getsheetnumber(21, 6, 0));
		Software_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 6, 1)));
		Hardware_Version.sendKeys(String.valueOf(read.getsheetnumber1(21, 6, 2)));
		Smart_card_Dropdown.click();
		Msg_for_smartcard.click();
		Smart_card_TextField.sendKeys(read.getsheetnumber(21, 6, 3));
		Submit.click();
		//Assert.assertEquals("Duplicate STB No.", STB_Insert_without_mandatory_data(), "STB Insertion without data Assertion Failed");
		sAssert.assertEquals(Duplicate_warning_MSg.getText(), "Duplicate STB No." ,"STB No Assertion Failed");
		sAssert.assertEquals(Duplicate_smartcard.getText(), "Duplicate smart card number!" ,"Smart card Assertion Failed");
		sAssert.assertAll();
	}
	
	//Validation for uploading valid file
	public void Uploading_valid_File()
	{
		ConfigReader read=new ConfigReader();
		Inventory.click();
		STB_Details.click();
		Insert.click();
		Browse_Button.sendKeys(read.getUpload());
		Submit.click();
		Assert.assertEquals("STB added successfully !Click to download response file", Success.getText(), "Uploading file Assertion Failed");		
	}
	
	

	//Validation for uploading invalid file
		public void Uploading_invalid_File()
		{
			ConfigReader read=new ConfigReader();
			Inventory.click();
			STB_Details.click();
			Insert.click();
			Browse_Button.sendKeys(read.getexcelsheet());
			Submit.click();
			Assert.assertEquals("Invalid file format, Only .CSV files are accepted", Warning_Msg.getText(), "Uploading file Assertion Failed");
					
		}

		
		//Take screenshot of respective page
		public void Screenshot_single(String Method) 
		{
			TakeScreenShoot.TakeScreenshot(Method);
		}	
		
		//to get all the button in the page
		public List<WebElement> getAllData() 
		{
	        return All_elements;
		}
		
		// Validation for operator dropdwon
		public void Operator_Name_Field()
		{
			Inventory.click();
			STB_Details.click();
			new Select(Operator_dropdown).selectByVisibleText("admin"); // Change value for "_____" other operator 
			Search_Button.click();
			Check_Box.click();
			Assert.assertEquals("admin", admin_result.getText(), "Operator Name Assertion Failed");
		}
		
		// Validation for STB No field for valid
		public void STB_No_With_Valid_Data()
		{
			Inventory.click();
			STB_Details.click();
			STB_No_Text_Field.sendKeys(read.getsheetnumber(21, 1, 0));
			Search_Button.click();
			Check_Box.click();
			Assert.assertEquals("admin", admin_result.getText(), "STB No for valid data Assertion Failed");
		}
		
		// Validation for STB No field for invalid
		public void STB_No_With_invalid_data()
		{
			Inventory.click();
			STB_Details.click();
			STB_No_Text_Field.sendKeys(read.getsheetnumber(21, 4, 0));
			Search_Button.click();
			Assert.assertEquals("No results!",Invalid_input.getText(), "STB NO for invalid data Assertion Failed");
		}
		
		public void Paired_with_Customer_dropDown_Field()
		{
			Inventory.click();
			STB_Details.click();
			new Select(Paired_with_Customer_dropDown).selectByVisibleText("Yes");	// Change value for "No"
			Search_Button.click();
			Check_Box.click();
			Assert.assertEquals("admin", admin_result.getText(), "Paired with Customer Assertion Failed");
		}
		
		// Validation for Blacklisted dropdown
		public void Blacklisted_Field()
		{
			
			Inventory.click();
			STB_Details.click();
			new Select(Blacklisted_DropDown).selectByVisibleText("No");	// Change value for "No"
			Search_Button.click();
			Check_Box.click();
			Assert.assertEquals("admin", admin_result.getText(), "Blacklisted Assertion Failed");
			}
		
		// Validation for Status dropdown
		public void Status_Field()
		{
			Dashboard.click();
			Inventory.click();
			STB_Details.click();
			new Select(Status_DropDown).selectByVisibleText("Active");	// Change value for "De-active"
			Search_Button.click();
			Check_Box.click();
			Assert.assertEquals("admin", admin_result.getText(), "Status Field Assertion Failed");
		}
		
		public void Validation_for_Cancel()
		{
			Inventory.click();
			STB_Details.click();
			Insert.click();
			Cancel.click();
			Assert.assertEquals("Set Top Box Details", STB_Details_Page.getText(), "Cancel button Assertion Failed");
			
		}
		@FindBy(xpath="(//a[@class='top'])[10]")
	    WebElement StoreFont;
		
		
		//Want to change STB id allways 
		@FindBy(xpath="//td[text()=\"POWE1111122222\"]")
		WebElement STBID;
		
		public void Usecase_Insert_STB_Details_without_smartcard()
		{
			Inventory.click();
			STB_Details.click();
			Insert.click();
			STB_Number.sendKeys(read.getsheetnumber(58, 1, 0));
			Software_Version.sendKeys(String.valueOf(read.getsheetnumber1(58, 1, 1)));
			Hardware_Version.sendKeys(String.valueOf(read.getsheetnumber1(58, 1, 2)));
			Submit.click();
			//Assert.assertEquals("Success: STB's added partially !Click to download response file", Success.getText(), "STB Insertion Assertion Failed");
			Assert.assertEquals("STB added successfully !Click to download response file", Success.getText(), "STB Insertion without smartcard Assertion Failed");
			Assert.assertEquals(true,STBID.isDisplayed());
			//StoreFont.click();
			//child();
			
			//parent();
			
			}
		
		}
		

		

