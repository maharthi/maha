 package com.broadcaster_group;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Broadcaster_Page  extends BaseClass
{
	@FindBy(xpath = "//*[@id='catalog']/a")
	WebElement Catalog;

	@FindBy(linkText ="Broadcaster Group")
	WebElement BroadcasterGroup;
	
	@FindBy(linkText ="Insert")
	WebElement Insert;
	
	@FindBy(name="name")
	WebElement BroadcasterName;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="telephone")
	WebElement Mobile;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="postcode")
	WebElement Postcode;
	
	@FindBy(linkText ="Channels")
	WebElement ChannelTab;
	
	@FindBy(linkText ="Add Channel")
	WebElement Add_Channel_Button;
	
	@FindBy(name="product_detail[0][name]")
	WebElement Channel_Text_Field1;
	
	@FindBy(name="product_detail[1][name]")
	WebElement Channel_Text_Field2;
	
	@FindBy(linkText ="Submit")
	WebElement Submit;
	
	@FindBy(xpath = "//a[text()='General']")
	WebElement GeneralTab;
	
	// To find Edit link(For -Positive data) of particular Broadcaster Name, We have to change the value in- text()= 'change value' 
	@FindBy(xpath = "(//td[text()='Dhoom5']//following::a[text()='Edit'])[1]")
	WebElement Broacaster_Search_Edit;
	
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement SuccesfulEdit5;

	 // To find Edit link(For -Invalid,duplicate) of particular Broadcaster Name, We have to change the value in- text()= 'change value' 
    @FindBy(xpath = "(//td[text()='Zoom3']//following::a[text()='Edit'])[1]")	
    WebElement Broacaster_Search_Edit1;
    
    @FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement UnSuccesfulEdit5;
	
	//Broadcaster added successfully
	@FindBy(xpath = "//div[text()='Success: You have added a Broadcaster Group successfully!']")
	WebElement Broadcaster_Added_Successfull;
		
	//Warning if Broadcaster not added
	@FindBy(xpath = ".//*[@id='content']/div[2]']")
	WebElement Broadcaster_notAdded_Warning;
		
	//Broadcaster edited successfully
	@FindBy(xpath = "//div[text()='Success: You have modified Broadcaster!']")
	WebElement Broadcaster_Edited_Successfully;
	
 /*	@FindBy(xpath = "//*[@id='content']/div[2]")
	WebElement Broadcaster_Edited_Successfully;*/
				
	//warning message while editing	
	@FindBy(xpath = "//*[@id='content']/div[2]")
	WebElement Warning_Msg;
	
	//warning message for braodcaster name
	@FindBy(xpath = "//*[@id= 'tab-general']/table/tbody/tr[1]/td[2]/span") 
	WebElement Broadcaster_Name_Msg;
	
	//warning message for email
	@FindBy(xpath = "//*[@id='tab-general']/table/tbody/tr[2]/td[2]/span")
	WebElement Email_Msg;
	
	//warning message for Mobile
	@FindBy(xpath = "//*[@id='tab-general']/table/tbody/tr[3]/td[2]/span")
	WebElement Mobile_Msg;
	
	//warning message for City
	@FindBy(xpath = "//*[@id='tab-general']/table/tbody/tr[4]/td[2]/span")
	WebElement City_Msg;
	
	//warning message for Passcode
	@FindBy(xpath = "//*[@id='tab-general']/table/tbody/tr[5]/td[2]/span")
	WebElement Passcode_Msg;
	
	//warning message for adding channel
	@FindBy(xpath = "//*[@id='tab-channels']/span")
	WebElement For_Add_Channel_Msg;
	
	//warning message for adding duplicate channel
	@FindBy(xpath = "//*[@id='details-row0']/tr/td[1]/span")
	WebElement For_Duplicate_Channel_Msg;
	
	@FindBy(xpath = "//*[@id='dashboard']/a")
	WebElement Dashboard;
	
	@FindBy(xpath = ".//*[@id='tab-general']/table/tbody/tr[7]/td[2]/select")
	WebElement State;
	
	//Getting button elements
	@FindBy(className ="button")
	List<WebElement> All_elements;
	
	ExcelReader read = new ExcelReader();	
	BaseClass Base = new BaseClass();
	TakeScreenShoot ScrnShot = new TakeScreenShoot();
	
	
	//To get the Broadcaster Group created successfully message		
		public String Broadcaster_Created_Successfully()
		{
			return Broadcaster_Added_Successfull.getText();
		}
		
		
	// To create Broadcaster
	public void Create_BroadcasterGroup()
	{
		Catalog.click();
		BroadcasterGroup.click();
		Insert.click();
		BroadcasterName.sendKeys(read.getsheetnumber(5, 1, 0));
		Email.sendKeys(read.getsheetnumber(5, 1, 1));
		Mobile.sendKeys(String.valueOf(read.getsheetnumber2(5, 1, 2)));
		City.sendKeys(read.getsheetnumber(5, 1, 3));
		Postcode.sendKeys(String.valueOf(read.getsheetnumber1(5, 1, 4)));
		new Select(State).selectByVisibleText("Karnataka");
		ChannelTab.click();
		Add_Channel_Button.click();
		Channel_Text_Field1.sendKeys(read.getsheetnumber(5, 1, 5));
		Add_Channel_Button.click();
		Channel_Text_Field2.sendKeys(read.getsheetnumber(5, 2, 5));
		Submit.click();
		Assert.assertEquals("Success: You have added a Broadcaster Group successfully!", Broadcaster_Created_Successfully(), "Broadcaster Creation Assertion Failed");
		
	}
	
	//Takes screenshot for all tabs			
	public void Screenshot_of_All_Tab(String Method){	
		TakeScreenShoot.TakeScreenshot(Method);
		ChannelTab.click();			
		TakeScreenShoot.TakeScreenshot(Method);	
	}
	
	//Take screenshot of respective tab
	public void Screenshot_single(String Method) {
		TakeScreenShoot.TakeScreenshot(Method);
	}
	
	// Validation for Successfully Edit
	public String Broadcaster_Edited_Successfully() 
	{
		return Broadcaster_Edited_Successfully.getText();
	}
	
	// Warning for Edit
	public String Warning_Msg_On_Edit()
	{
		return Warning_Msg.getText();
	}
	
	 //to get all the button in the page
	public List<WebElement> getAllData() {
        return All_elements;
	}
	
	
	// To Edit Broadcaster
	public void Edit_Broadcaster() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dashboard.click();
		Catalog.click();
		//Thread.sleep(1000);
		BroadcasterGroup.click();
		//Broacaster_Search_Edit.click();
		SuccesfulEdit5.click();
		BroadcasterName.clear();
		BroadcasterName.sendKeys(read.getsheetnumber(6, 1, 0));
		Email.clear();
		Email.sendKeys(read.getsheetnumber(6, 1, 1));
		Mobile.clear();
		Mobile.sendKeys(String.valueOf(read.getsheetnumber2(6, 1, 2)));
		City.clear();
		City.sendKeys(read.getsheetnumber(6, 1, 3));
		Postcode.clear();
		Postcode.sendKeys(String.valueOf(read.getsheetnumber1(6, 1, 4)));
		ChannelTab.click();
		//Add_Channel_Button.click();
		Channel_Text_Field1.clear();
		Channel_Text_Field1.sendKeys(read.getsheetnumber(6, 1, 5));
		//Add_Channel_Button.click();
		Channel_Text_Field2.clear();
		Channel_Text_Field2.sendKeys(read.getsheetnumber(6, 2, 5));
		Submit.click();
		Assert.assertEquals("Success: You have modified Broadcaster!", Broadcaster_Edited_Successfully(), "Broadcaster Editing Assertion Failed");
	}
	
	//Warning Msg for Broadcaster name
	public String Broadcaster_Name_Assertion()
	{	
		return Broadcaster_Name_Msg.getText();	
	}
	
	//Warning Msg for Email
	public String Email_Assertion()
	{
		return Email_Msg.getText();	
	}
	
	//Warning Msg for Mobile
	public String Mobile_no_Assertion()
	{
		return Mobile_Msg.getText();
	}
	
	//Warning Msg for City
	public String City_Assertion()
	{
		return City_Msg.getText();
	}
	
	//Warning Msg for Passcode
	public String Passcode_Assertion()
	{
		return Passcode_Msg.getText();
	}
	
	//Warning Msg for adding channel
	public String Add_Channel_Assertion()
	{
		return For_Add_Channel_Msg.getText(); 
	}
	
	
	//Validation of Broadcaster creation without entering mandatory data
		public void Broadcaster_Create_Without_mandatory_data()
		{
			//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			SoftAssert sAssert = new SoftAssert();
			Dashboard.click();
			Catalog.click();
			BroadcasterGroup.click();
			Insert.click();
			Submit.click();
			sAssert.assertEquals("Warning: Please check the form carefully for errors!", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
		    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Broadcaster name is mandatory!" ,"Broadcaster Name Assertion Failed");
		    sAssert.assertEquals(Email_Assertion(), "Duplicate E-Mail address!" ,"Email Assertion Failed");
		    sAssert.assertEquals(Mobile_no_Assertion(), "Please input valid Mobile number!" ,"Moblie No Assertion Failed");
		    sAssert.assertEquals(City_Assertion(), "Broadcaster city must be between 3 and 64 characters!" ,"City Assertion Failed");
		    sAssert.assertEquals(Passcode_Assertion(), "Postcode is mandatory!, Accepts only 0-9!" ,"Passcode Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertEquals(Add_Channel_Assertion(), "Add the channel!" ,"Add Channel Assertion Failed");
		    sAssert.assertAll();
		}
	
		
		//Validation of Broadcaster creation with invalid input
		public void Broadcaster_Create_With_invalid_data() {
			SoftAssert sAssert = new SoftAssert();
			Dashboard.click();
			Catalog.click();
			BroadcasterGroup.click();
			Insert.click();
			BroadcasterName.sendKeys(read.getsheetnumber(5, 3, 0));
			Email.sendKeys(read.getsheetnumber(5, 3, 1));
			Mobile.sendKeys(String.valueOf(read.getsheetnumber2(5, 3, 2)));
			City.sendKeys(read.getsheetnumber(5, 3, 3));
			Postcode.sendKeys(String.valueOf(read.getsheetnumber1(5, 3, 4)));
			ChannelTab.click();
			Add_Channel_Button.click();
			Channel_Text_Field1.sendKeys(read.getsheetnumber(5, 3, 5));
			Add_Channel_Button.click();
			Channel_Text_Field2.sendKeys(read.getsheetnumber(5, 4, 5));
			Submit.click();
			sAssert.assertEquals("Warning: Please check form carefully for errors", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
		    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Broadcaster Name must be between 3 and 64 characters!" ,"Broadcaster Name Assertion Failed");
		    sAssert.assertEquals(Email_Assertion(), "E-Mail id is mandatory!" ,"Email Assertion Failed");
		    sAssert.assertEquals(Mobile_no_Assertion(), "Please input valid Mobile number!!" ,"Moblie No Assertion Failed");
		    sAssert.assertEquals(City_Assertion(), "Broadcaster city must be between 3 and 64 characters!" ,"City Assertion Failed");
		    sAssert.assertEquals(Passcode_Assertion(), "Length should be 6!" ,"Access_Criteria Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertAll();
		}
	
		//Warning message for adding duplicate channel
		public String Duplicate_Channel_Assertion()
		{
			return For_Duplicate_Channel_Msg.getText();
		}
		
		//Validation of Broadcaster_creation with duplicate data
		public void Broadcaster_create_with_duplicate_data() {
			SoftAssert sAssert = new SoftAssert();
			Dashboard.click();
			Catalog.click();
			BroadcasterGroup.click();
			Insert.click();
			BroadcasterName.sendKeys(read.getsheetnumber(5, 5, 0));
			Email.sendKeys(read.getsheetnumber(5, 5, 1));
			Mobile.sendKeys(String.valueOf(read.getsheetnumber2(5, 5, 2)));
			City.sendKeys(read.getsheetnumber(5, 5, 3));
			Postcode.sendKeys(String.valueOf(read.getsheetnumber1(5, 5, 4)));
			ChannelTab.click();
			Add_Channel_Button.click();
			Channel_Text_Field1.sendKeys(read.getsheetnumber(5, 5, 5));
			Add_Channel_Button.click();
			Channel_Text_Field2.sendKeys(read.getsheetnumber(5, 6, 5));
			Submit.click();
			sAssert.assertEquals("Warning: Please check form carefully for errors", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
		    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Warning: Duplicate broadcaster name trying add!" ,"Broadcaster Name Assertion Failed");
		    sAssert.assertEquals(Email_Assertion(), "Duplicate E-Mail address!" ,"Email Assertion Failed");
		    sAssert.assertEquals(Mobile_no_Assertion(), "Duplicate Mobile Number" ,"Mobile No Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertEquals(Duplicate_Channel_Assertion(), "Duplicate Product!" ,"Add Channel Assertion Failed");
		    sAssert.assertAll();
		}
		
		
		//Validation of Broadcaster edit without entering mandatory data
		public void Broadcaster_Edit_Without_mandatory_data() throws InterruptedException
		{
			SoftAssert sAssert = new SoftAssert();
			Catalog.click();
			Thread.sleep(1000);
			BroadcasterGroup.click();
			//Broacaster_Search_Edit1.click();
			SuccesfulEdit5.click();
			BroadcasterName.clear();
			Email.clear();
			Mobile.clear();
			City.clear();
			Postcode.clear();
			ChannelTab.click();
			Channel_Text_Field1.clear();
			Channel_Text_Field2.clear();
			Submit.click();
		    sAssert.assertEquals("Warning: Please check form carefully for errors", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
		    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Broadcaster name is mandatory!" ,"Broadcaster Name Assertion Failed");
		    sAssert.assertEquals(Email_Assertion(), "Please input valid E-Mail address!" ,"Email Assertion Failed");
		    sAssert.assertEquals(Mobile_no_Assertion(), "Please input valid Mobile number!" ,"Moblie No Assertion Failed");
		    sAssert.assertEquals(City_Assertion(), "Broadcaster city must be between 3 and 64 characters!" ,"City Assertion Failed");
		    sAssert.assertEquals(Passcode_Assertion(), "Postcode is mandatory!, Accepts only 0-9!" ,"Passcode Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertAll();
			
		}
	
		//Validation of Broadcaster edit by entering invalid data
		public void Broadcaster_Edit_With_invalid_data() throws InterruptedException
		{
			SoftAssert sAssert = new SoftAssert();
			Dashboard.click();
			Catalog.click();
			Thread.sleep(1000);
			BroadcasterGroup.click();
			SuccesfulEdit5.click();
			//Broacaster_Search_Edit1.click();
			BroadcasterName.clear();
			BroadcasterName.sendKeys(read.getsheetnumber(6, 3, 0));
			Email.clear();
			Email.sendKeys(read.getsheetnumber(6, 3, 1));
			Mobile.clear();
			Mobile.sendKeys(String.valueOf(read.getsheetnumber2(6, 3, 2)));
			City.clear();
			City.sendKeys(read.getsheetnumber(6, 3, 3));
			Postcode.clear();
			Postcode.sendKeys(String.valueOf(read.getsheetnumber1(6, 3, 4)));
			ChannelTab.click();
			Channel_Text_Field1.clear();
			Channel_Text_Field1.sendKeys(read.getsheetnumber(6, 3, 5));
			Channel_Text_Field2.clear();
			Channel_Text_Field2.sendKeys(read.getsheetnumber(6, 4, 5));
			Submit.click();
			 sAssert.assertEquals("Warning: Please check form carefully for errors", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
			    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Broadcaster Name must be between 3 and 64 characters!" ,"Broadcaster Name Assertion Failed");
			    sAssert.assertEquals(Email_Assertion(), "E-Mail id is mandatory!" ,"Email Assertion Failed");
			    sAssert.assertEquals(Mobile_no_Assertion(), "Please input valid Mobile number!!" ,"Moblie No Assertion Failed");
			    sAssert.assertEquals(City_Assertion(), "Broadcaster city must be between 3 and 64 characters!" ,"City Assertion Failed");
			    sAssert.assertEquals(Passcode_Assertion(), "Length should be 6!" ,"Passcode Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertAll();		
		}
		
		
		//Validation of Broadcaster edit by entering duplicate data
		public void Broadcaster_Edit_With_duplicate_data() throws InterruptedException
		{
			SoftAssert sAssert = new SoftAssert();
			Dashboard.click();
			Catalog.click();
			Thread.sleep(1000);
			BroadcasterGroup.click();
			SuccesfulEdit5.click();
			//Broacaster_Search_Edit1.click();
			BroadcasterName.clear();
			BroadcasterName.sendKeys(read.getsheetnumber(6, 5, 0));
			Email.clear();
			Email.sendKeys(read.getsheetnumber(6, 5, 1));
			Mobile.clear();
			Mobile.sendKeys(String.valueOf(read.getsheetnumber2(6, 5, 2)));
			City.clear();
			City.sendKeys(read.getsheetnumber(6, 5, 3));
			Postcode.clear();
			Postcode.sendKeys(String.valueOf(read.getsheetnumber1(6, 5, 4)));
			ChannelTab.click();
			Channel_Text_Field1.clear();
			Channel_Text_Field1.sendKeys(read.getsheetnumber(6, 5, 5));
			Channel_Text_Field2.clear();
			Channel_Text_Field2.sendKeys(read.getsheetnumber(6, 6, 5));
			Submit.click();
			sAssert.assertEquals("Warning: Please check form carefully for errors", Warning_Msg_On_Edit(), "Broadcaster Creation Assertion Failed");
		    sAssert.assertEquals(Broadcaster_Name_Assertion(), "Warning: Duplicate broadcaster name trying add!" ,"Broadcaster Name Assertion Failed");
		    sAssert.assertEquals(Email_Assertion(), "Please input valid E-Mail address!" ,"Email Assertion Failed");
		    sAssert.assertEquals(Mobile_no_Assertion(), "Warning: Duplicate Mobile Number" ,"Mobile No Assertion Failed");
		    ChannelTab.click();
		    sAssert.assertAll();					
			
			
		}
		
		@FindBy(xpath = "//TD[@class='left'][text()='Star aab']")
		WebElement Broadcaster_name;
		
		@FindBy(linkText ="Channels")
		WebElement Channel;
		
		@FindBy(xpath="//SELECT[@id='broadcaster_group']")
		WebElement BC_group;
		
		public void UseCase_BroadcasterGroup() {
			Catalog.click();
			BroadcasterGroup.click();
			Insert.click();
			BroadcasterName.sendKeys(read.getsheetnumber(51, 1, 0));
			Email.sendKeys(read.getsheetnumber(51, 1, 1));
			Mobile.sendKeys(String.valueOf(read.getsheetnumber2(51, 1, 2)));
			City.sendKeys(read.getsheetnumber(5, 1, 3));
			Postcode.sendKeys(String.valueOf(read.getsheetnumber1(51, 1, 4)));
			ChannelTab.click();
			Add_Channel_Button.click();
			Channel_Text_Field1.sendKeys(read.getsheetnumber(51, 1, 5));
			Submit.click();
			Assert.assertEquals("Success: You have added a Broadcaster Group successfully!", Broadcaster_Created_Successfully(), "Broadcaster Creation Assertion Failed");
			Assert.assertEquals(Broadcaster_name.getText(), read.getsheetnumber(51, 1, 0), "Broadcaster name mismatch");
			Catalog.click();
			Channel.click();
			Insert.click();
			Select bSelect = new Select(BC_group);
			bSelect.selectByVisibleText(read.getsheetnumber(51, 1, 0));
		}
		
		
	}
	
	
	
	
	
	
