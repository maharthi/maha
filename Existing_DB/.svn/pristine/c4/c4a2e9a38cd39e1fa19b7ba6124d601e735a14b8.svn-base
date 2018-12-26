package com.ppvpage;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Create_ppv  extends BaseClass
{

	@FindBy(xpath="//a[text()='Catalog']")  // clicking on catalog 
	WebElement Catalog;
	
	@FindBy(linkText ="PPV")  // clicking on PPV
	WebElement ppvsubmenu;	
	
	@FindBy(xpath="//a[text()='Insert']")   // clicking on insert button
	WebElement insert;	
	
	@FindBy(xpath="(//td[text()='Movie6']/following::a[text()='Edit'])[1]")  // name_of_ppv_need to change manually_for_editing
	WebElement clicking_on_edit_of_one_ppv;	
	
	
	@FindBy(xpath="(//td[text()='Movie5']/following::a[text()='Edit'])[1]")  // name_of_ppv_need to change manually_for_editing
	WebElement clicking_on_edit_of_one_ppv1;	
	
	@FindBy(xpath = "//a[text()='General']")
	WebElement General;
	
	@FindBy(linkText = "Edit")   // Clicking on edit link
	WebElement Edit;
	
	@FindBy(xpath = "//a[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//*[@id='language1']/table/tbody/tr[1]/td[2]/input")  // Clicking on ppv name
	WebElement ppvname;	
	
	@FindBy(linkText ="Data")// clicking on data tab
	WebElement Data;
	
	@FindBy(xpath=".//*[@id='tab-data']/table/tbody/tr[1]/td[2]/select")  //Selecting channel name from channel drop down menu list
	WebElement Selecting_channelname;
	
	@FindBy(xpath=".//*[@id='tab-data']/table/tbody/tr[8]/td[2]/select")   //selecting disable content
	WebElement Selecting_disable;
	
	@FindBy(xpath="//select[@name='product_id']")  //Selecting channel name from channel dropdown menu list
	public List<WebElement> Selecting_channelname_all;
	
	
	@FindBy(xpath="//input[@name='price']")  // clicking on price 
	WebElement Price;
	
	@FindBy(linkText ="Duration")// clicking on duration tab
	WebElement Duration;
	
	@FindBy(linkText ="Add Duration")// clicking on add duration button
	WebElement Add_duration;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div[3]/button[1]")
	WebElement clicking_on_Now;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div[3]/button[2]")
	WebElement clicking_on_Done;
	
	@FindBy(linkText ="Submit")// clicking on submit button
	WebElement Submit;
	
	@FindBy(xpath = "//div[text()='Success: You have added a PPV successfully!']")  // Successful validation message of ppv creation
	WebElement ppv_Added_Successfull;
	
	@FindBy(xpath = "//div[text()='Success: PPV has been successfully updated !']")  // Successful validation message of ppv edited successfully
	WebElement ppv_Edited_Successfull;
	
	@FindBy(xpath="//input[@class='datetime hasDatepicker' and @name='ppv_duration[0][date_start]']")
	WebElement start_time_box;   
	
	@FindBy(xpath="//button[@class='ui-datepicker-current ui-state-default ui-priority-secondary ui-corner-all' and text()='Now']")
	WebElement start_time_now;
	
	@FindBy(xpath="//a[@style='left: 42.3729%;']")
	WebElement start_time_minute;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[3]/button[2]")
	WebElement start_time_done;
	
	@FindBy(xpath=".//*[@id='ui_tpicker_time_dp1507522121654']")
	WebElement start_time_watch;
	
	@FindBy(name="ppv_duration[0][date_start]")
	WebElement clicking_on_Date_start_tfield;

	@FindBy(xpath="//button[text()='Now']")
	WebElement clicking_on_now_start;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/dl//dd[2]//a")
	WebElement link;
	
	
	@FindBy(name="ppv_duration[0][date_end]")
	WebElement clicking_on_Date_end_tfield;
	
	@FindBy(xpath="//div/div/dl/dd[2]/a")
	WebElement link1;
	
	//*[@id='content']/div[2]/div[2]/div/div[1]/a[3]

	@FindBy(xpath="//*[@id='content']/div[2]/div[2]/div/div[1]/a[3]")
	WebElement page_navigation_link;
	
	//warning message for duplicate ppv
	@FindBy(xpath="//*[@id='language1']/table/tbody/tr[1]/td[2]/span")
	WebElement duplicate_ppv_name_msg;
	
	
	//warning message while editing
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Warning_Message_OnEdit;
	
	
	//common warning message for empty
	@FindBy(xpath = "//div[text()='Warning: Please select time duration!']")
	WebElement durarion_msg_while_empty_too;
	
	//validation message for empty ppv name while creating
	@FindBy(xpath = ".//*[@id='language1']/table/tbody/tr[1]/td[2]/span")
	WebElement validate_msg_for_Empty_ppv_name;
	
	
	//validation message for empty ppv name while creating
	@FindBy(xpath = ".//*[@id='tab-data']/table/tbody/tr[2]/td[2]/span")
	WebElement validate_msg_for_Empty_ppv_price;
	
	//warning message while inserting same event time
	@FindBy(xpath = "//div[text()='Warning: Check Duration Of ppv already created with same start/end time!']")
	WebElement Warning_Message_Onsame_event_time;
		
	//To get the ppv created successfully message		
			public String ppv_Created_Successfully() 
			{
				return ppv_Added_Successfull.getText();
			} 
	
	//To get the ppv edited successfully message		
			public String ppv_edit_Successfully() 
			{
				return ppv_Edited_Successfull.getText();
			} 
	
			//To get the text of warning message
			public String Warning_On_ppv_Edit() {
				return Warning_Message_OnEdit.getText();
			}
			
			//To get the text of empty_ppv_name
			public String Warning_On_empty_ppv_name() {
				return validate_msg_for_Empty_ppv_name.getText();
			}
			
			//To get the text of empty_ppv price
			public String Warning_On_empty_ppv_price() {
				return validate_msg_for_Empty_ppv_price.getText();
			}
			
			//common message for all empty
			public String common_message_for_all_empty() {
				return durarion_msg_while_empty_too.getText();
			}
			

			//for duplicate_ppv 
			public String duplicate_ppv_name() {
				return duplicate_ppv_name_msg.getText();
			}
				
			
			//To get the ppv edited successfully message		
			public String ppv_warnig_msg__for_same_event_time() 
			{
				return Warning_Message_Onsame_event_time.getText();
			} 
			
			
			ExcelReader read =new ExcelReader();
			BaseClass Base = new BaseClass();
		    TakeScreenShoot ScrnShot = new TakeScreenShoot();         
			
		    //Takes screenshot for all tabs			
			public void Screenshot_of_All_Tab(String Method){	
				TakeScreenShoot.TakeScreenshot(Method);
				Data.click();			
				TakeScreenShoot.TakeScreenshot(Method);
				Duration.click();			
				TakeScreenShoot.TakeScreenshot(Method);
				
			                                                }
		 
		
			//Take screenshot of respective tab
			public void Screenshot_single(String Method) {
				TakeScreenShoot.TakeScreenshot(Method);
			}
			
			
			//Just change next date number thats enough
			@FindBy(xpath="//a[text()='29']")
			WebElement DatePicker;
			
			//For Clicking on Existing time 
			@FindBy(xpath="//button[text()='Now']")
             WebElement Now;
			
			@FindBy(xpath="(//a)[174]")
			WebElement Starttime ;
			
			@FindBy(xpath="(//a)[175]")
			WebElement EndTime ;
			
			
			//Verifying the add new PPV for new PPV
		public void Adding_new_ppv() 
	    {
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	ppvname.sendKeys(read.getsheetnumber(11, 1, 0));
	    	Data.click();
	    	new Select(Selecting_channelname).selectByIndex(2);
	    		    	
	    	Price.sendKeys(String.valueOf(read.getsheetnumber1(11, 1, 1)));
			Duration.click();
			Add_duration.click();
			clicking_on_Date_start_tfield.click();
			DatePicker.click();
			Now.click();
			//clicking_on_Date_start_tfield.click();
			//clicking_on_now_start.click();
			Actions move = new Actions(driver);   //selecting start time
			move.moveToElement(link).clickAndHold();
			move.moveByOffset(10,0);
			move.release();
			move.perform();			    
            clicking_on_Done.click();			    
			clicking_on_Date_end_tfield.click();
			clicking_on_now_start.click();
			    
			Actions move1 = new Actions(driver);    //selecting end time 
			move1.moveToElement(link1).clickAndHold();
			move1.moveByOffset(40,0);
		    move1.release();
			move1.perform();
		    clicking_on_Done.click();
			Submit.click();
			Assert.assertEquals("Success: You have added a PPV successfully!", ppv_Created_Successfully(), "PPV Creation Assertion Failed");
			   
	  }
			   
			 
			 
		//No Need to change anything here , Verifying the empty ppv 
	    public void empty_new_ppv() 
	    {
		    SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	Submit.click();
	    	sAssert.assertEquals("Warning: Please select time duration!", common_message_for_all_empty(), "ppv Creation Assertion Failed");
		    sAssert.assertEquals(Warning_On_empty_ppv_name(), "Event Name is mandatory & must be greater than 3 and less than 255 characters!" ,"ppv Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals("Price is mandatory & must be digits!", Warning_On_empty_ppv_price(), "ppv Creation Assertion Failed");
		    General.click();
		    sAssert.assertAll();
			   
	  }
	  
	  //No Need to change anything in this code , Verifying Invalid Entries
	  public void invalid_new_ppv() 
	    {
		    SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	ppvname.sendKeys(read.getsheetnumber(11, 2, 0));
	    	Data.click();
	    	new Select(Selecting_channelname).selectByIndex(2);
	    	Price.sendKeys(read.getsheetnumber(11, 2, 1));
			Duration.click();
			Add_duration.click();
			clicking_on_Date_start_tfield.click();
		/*	clicking_on_now_start.click();
			Actions move = new Actions(driver);   //selecting start time
			move.moveToElement(link).clickAndHold();
			move.moveByOffset(10,0);
			move.release();
			move.perform();			    
            clicking_on_Done.click();		    
			clicking_on_Date_end_tfield.click();
			clicking_on_now_start.click();
			    
			Actions move1 = new Actions(driver);    //selecting end time 
			move1.moveToElement(link1).clickAndHold();
			move1.moveByOffset(40,0);
		    move1.release();
			move1.perform();
		    clicking_on_Done.click();*/
		    
		    DatePicker.click();
			Now.click();
			//clicking_on_Date_start_tfield.click();
			//clicking_on_now_start.click();
			Actions move = new Actions(driver);   //selecting start time
			move.moveToElement(link).clickAndHold();
			move.moveByOffset(10,0);
			move.release();
			move.perform();			    
            clicking_on_Done.click();			    
			clicking_on_Date_end_tfield.click();
			clicking_on_now_start.click();
			    
			Actions move1 = new Actions(driver);    //selecting end time 
			move1.moveToElement(link1).clickAndHold();
			move1.moveByOffset(40,0);
		    move1.release();
			move1.perform();
		    clicking_on_Done.click();
		    
			Submit.click();
	    	sAssert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_ppv_Edit(), "ppv Creation Assertion Failed");
		    sAssert.assertEquals(Warning_On_empty_ppv_name(), "Event Name is mandatory & must be greater than 3 and less than 255 characters!" ,"ppv Name Assertion Failed");
		    Data.click();
		    sAssert.assertEquals("Price is mandatory & must be digits!", Warning_On_empty_ppv_price(), "ppv Creation Assertion Failed");
		    General.click();
		    sAssert.assertAll();
			   
	  }
	    
		//Verifying the Duplicate PPV which is already existing 
	  public void duplicate_new_ppv() 
	    {
		    SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	ppvname.sendKeys(read.getsheetnumber(11, 3, 0));
	    	Data.click();
	    	new Select(Selecting_channelname).selectByIndex(2);
	    	Price.sendKeys(String.valueOf(read.getsheetnumber1(11, 3, 1)));
			Duration.click();
			Add_duration.click();
			clicking_on_Date_start_tfield.click();
			clicking_on_now_start.click();
			Actions move = new Actions(driver);   //selecting start time
			move.moveToElement(link).clickAndHold();
			move.moveByOffset(10,0);
			move.release();
			move.perform();
			    
            clicking_on_Done.click();
			    
			clicking_on_Date_end_tfield.click();
			clicking_on_now_start.click();
			    
			Actions move1 = new Actions(driver);    //selecting end time 
			move1.moveToElement(link1).clickAndHold();
			move1.moveByOffset(40,0);
		    move1.release();
			move1.perform();
		    clicking_on_Done.click();
			Submit.click();
	    	sAssert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_ppv_Edit(), "ppv Creation Assertion Failed");
		    sAssert.assertEquals(duplicate_ppv_name(), "Duplicate name!!" ,"ppv Name Assertion Failed");
		    
		    General.click();
		    sAssert.assertAll();
			   
	  }
	  
	  //Verifying Duplicate timings PPV 
	  public void duplicate_event_time_with_same_event_name() 
	    {
		    SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	ppvname.sendKeys(read.getsheetnumber(11, 1, 0));
	    	Data.click();
	    	new Select(Selecting_channelname).selectByIndex(2);
	    	Price.sendKeys(String.valueOf(read.getsheetnumber1(11, 1, 1)));
			Duration.click();
			Add_duration.click();
			clicking_on_Date_start_tfield.click();
			clicking_on_now_start.click();
			Actions move = new Actions(driver);   //selecting start time
			move.moveToElement(link).clickAndHold();
			move.moveByOffset(10,0);
			move.release();
			move.perform();
			    
            clicking_on_Done.click();
			    
			clicking_on_Date_end_tfield.click();
			clicking_on_now_start.click();
			    
			Actions move1 = new Actions(driver);    //selecting end time 
			move1.moveToElement(link1).clickAndHold();
			move1.moveByOffset(40,0);
		    move1.release();
			move1.perform();
		    clicking_on_Done.click();
			Submit.click();
	    	sAssert.assertEquals("Warning: Check Duration Of ppv already created with same start/end time!",ppv_warnig_msg__for_same_event_time(), "ppv Creation Assertion Failed");
		    sAssert.assertEquals(duplicate_ppv_name(), "Duplicate name!!" ,"ppv Name Assertion Failed");
		    General.click();
		    sAssert.assertAll();
			   
	  }
	  
	  //Verifying the Cancel button functionality 
	  public void checking_cancel_insertion_of_ppv() 
	    {
		   // SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	Cancel.click();
	    	Assert.assertEquals("Insert",insert.getText(), "ppv Cancel Assertion Failed");
	    } 
	  
	  //Verifying  the Home button functionality
	  public void checking_navigation_to_home_page() 
	    {
		   SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	        Home.click();
	        sAssert.assertEquals("Home",Home.getText(), "ppv home Assertion Failed");
	        //DashBoard assertion keep
	    } 
	  
	//Verifying  the Home button functionality from Insert page
	  public void checking_navigation_to_home_page_from_ppv_insertion() 
	    {
		    SoftAssert sAssert = new SoftAssert();	 
		    Catalog.click();
	    	ppvsubmenu.click();
	    	insert.click();
	    	Home.click();
	    	sAssert.assertEquals("Home",Home.getText(), "ppv home Assertion Failed");
	    }
	  
	  //Adding new PPV with disabled status 
	    	public void Adding_new_ppv_with_disabled_status() 
		    {
			    Catalog.click();
		    	ppvsubmenu.click();
		    	insert.click();
		    	ppvname.sendKeys(read.getsheetnumber(11, 4, 0));
		    	Data.click();
		    	new Select(Selecting_channelname).selectByVisibleText("channel test4");
		        Price.sendKeys(String.valueOf(read.getsheetnumber1(11, 4, 1)));
		        JavascriptExecutor jse = (JavascriptExecutor)driver;  //Scroll down
		        jse.executeScript("scroll(0, 400)");
		        
		        new Select(Selecting_disable).selectByVisibleText("Disabled");
		        jse.executeScript("scroll(0, -400)");  //Scroll Up
				Duration.click();
				Add_duration.click();
				clicking_on_Date_start_tfield.click();
				clicking_on_now_start.click();
				Actions move = new Actions(driver);   //selecting start time
				move.moveToElement(link).clickAndHold();
				move.moveByOffset(10,0);
				move.release();
				move.perform();
				clicking_on_Done.click();
				clicking_on_Date_end_tfield.click();
				clicking_on_now_start.click();
				Actions move1 = new Actions(driver);    //selecting end time 
				move1.moveToElement(link1).clickAndHold();
				move1.moveByOffset(40,0);
			    move1.release();
				move1.perform();
			    clicking_on_Done.click();
				Submit.click();
				Assert.assertEquals("Success: You have added a PPV successfully!", ppv_Created_Successfully(), "PPV Creation Assertion Failed");
				   
		  }
				    	
	    	//Edit already existing PPV with different price
	    	 public void edit_new_ppv_with_valid_price() 
			    {
				    Catalog.click();
			    	ppvsubmenu.click();
			    	  // For edit for every ppv we should create one web element and only those ppv will edit whose start time is future time ex: here "clicking_on_edit_of_one_ppv1" is webelment for ppv name "ppvtest12" 
			    	
			    	clicking_on_edit_of_one_ppv1.click();
			    	Data.click();
			    	Price.clear();
			        Price.sendKeys(String.valueOf(read.getsheetnumber1(12, 1, 1)));
				    Submit.click();
					Assert.assertEquals("Success: PPV has been successfully updated !", ppv_edit_Successfully(), "PPV Creation Assertion Failed");
					   
			  }        	
	    		
	    	//Edit already existing PPV with different price
	    	 public void edit_new_ppv_with_empty_price() 
			    {
	    		 SoftAssert sAssert = new SoftAssert();	
	    		    Catalog.click();
			    	ppvsubmenu.click();
			    	clicking_on_edit_of_one_ppv1.click();
			    	Data.click();
			    	Price.clear();
		            Submit.click();
		            sAssert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_ppv_Edit(), "ppv Creation Assertion Failed");
		            sAssert.assertEquals("Price is mandatory & must be digits!", Warning_On_empty_ppv_price(), "ppv Creation Assertion Failed");
			   }    
			 
	    	//Edit already existing PPV with invalid price
	    	 public void edit_new_ppv_with_invalid_price() 
			    {
	    		 SoftAssert sAssert = new SoftAssert();	
	    		    Catalog.click();
			    	ppvsubmenu.click();
			    	clicking_on_edit_of_one_ppv1.click();
			    	Data.click();
			    	Price.clear();
			    	Price.sendKeys(read.getsheetnumber(12, 2, 1));
			    	Submit.click();
		            sAssert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_ppv_Edit(), "ppv Creation Assertion Failed");
		            sAssert.assertEquals("Price is mandatory & must be digits!", Warning_On_empty_ppv_price(), "ppv Creation Assertion Failed");
			   } 
	    	 
	    	//Edit already existing PPV and Verify the cancel Button 
	    	 public void edit_new_ppv_with_cancel() 
			    {
	    		 SoftAssert sAssert = new SoftAssert();	
	    		    Catalog.click();
			    	ppvsubmenu.click();
			    	clicking_on_edit_of_one_ppv1.click();  
			    	Cancel.click();
			    	sAssert.assertEquals("Insert",insert.getText(), "ppv Cancel Assertion Failed");
			     } 
	    	 
	    	//Edit already existing PPV with different price
	    	 public void page_navigation_link() 
			    {
	    		 SoftAssert sAssert = new SoftAssert();	
	    		    Catalog.click();
			    	ppvsubmenu.click();
			    	 JavascriptExecutor jse = (JavascriptExecutor)driver;  //Scroll down
				     jse.executeScript("scroll(0, 400)");
				       
			    	page_navigation_link.click();
			        jse.executeScript("scroll(0, -400)");
			    	sAssert.assertEquals("Insert",insert.getText(), "ppv navigation Assertion Failed");
			     }     	
	    	 
	    	 
	    	 @FindBy(xpath="(//a[@class='top'])[10]")
			    WebElement StoreFont;
	    	 
	    	 @FindBy(xpath="//a[text()='PPV']")
	    	 WebElement PPV1;
	    	 
	    	 @FindBy(xpath="//a[text()=' Moviez ']")  //Movie5 Want to change allways
	    	 WebElement result;
	    	 
	    	 
	    	 
	    	 public void usecase_Adding_new_ppv() 
	 	    {
	 		    Catalog.click();
	 	    	ppvsubmenu.click();
	 	        insert.click();
	 	    	ppvname.sendKeys(read.getsheetnumber(64, 1, 0));
	 	    	Data.click();
	 	    	new Select(Selecting_channelname).selectByIndex(2);
	 	    		    	
	 	    	Price.sendKeys(String.valueOf(read.getsheetnumber1(64, 1, 1)));
	 			Duration.click();
	 			Add_duration.click();
	 			clicking_on_Date_start_tfield.click();
	 			clicking_on_now_start.click();
	 			Actions move = new Actions(driver);   //selecting start time
	 			move.moveToElement(link).clickAndHold();
	 			move.moveByOffset(20,0);
	 			move.release();
	 			move.perform();			    
	            clicking_on_Done.click();			    
	 			clicking_on_Date_end_tfield.click();
	 			clicking_on_now_start.click();
	 			    
	 			Actions move1 = new Actions(driver);    //selecting end time 
	 			move1.moveToElement(link1).clickAndHold();
	 			move1.moveByOffset(40,0);
	 		    move1.release();
	 			move1.perform();
	 		    clicking_on_Done.click();
	 			Submit.click();
	 			Assert.assertEquals("Success: You have added a PPV successfully!", ppv_Created_Successfully(), "PPV Creation Assertion Failed");
	 			
	 			StoreFont.click();
		        child();
		      
			        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			        Actions act=new Actions(driver);
			        act.moveToElement(PPV1).perform();
			       Assert.assertEquals(true, result.isDisplayed());
			       
		        parent();
		      
	 	  }
	 			   
	    	 
	    } 
	  
	  

