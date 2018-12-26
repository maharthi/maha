package com.system.userCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class UserCommands_Page {
	
		ExcelReader read = new ExcelReader();	
		BaseClass Base = new BaseClass();
		TakeScreenShoot ScreenShot = new TakeScreenShoot();
		
		// clicking on system
		@FindBy(xpath="//a[text()='System']")  
		WebElement Systemtab;
		
		// clicking on users
		@FindBy(xpath="//a[text()='Users']") 
		WebElement Usersmain;
		
		// clicking on second dropdown users
	    @FindBy(linkText = "Users") 
	    WebElement UsersSub;
	    
	    // clicking on user command permission
	    @FindBy(linkText = "User Command Permission")  
	    WebElement UserCommandPermission;
	    
	    //Getting Page title
	    @FindBy(xpath = "//*[@id='content']/div[3]/div[1]/h1")
	    WebElement UserCmd_title;
		
	    // clicking on insert button
	    @FindBy(xpath="//a[text()='Insert']")
		WebElement insert;
	    
	    // clicking on Delete button
	    @FindBy(xpath="//a[text()='Delete']") 
	   	WebElement Delete;
	    
	    // clicking on submit button
	    @FindBy(linkText ="Submit")
		WebElement Submit;
	    
	    // clicking on edit link 
	    @FindBy(linkText = "Edit")
		WebElement Edit;
	    
	    //Selecting Operator1 name
	    @FindBy(xpath = "//select[@name = 'operator_id']")
	    WebElement OperatorName1;
	    
	    //Selecting Operator1 name
	    @FindBy(xpath = "//select[@name = 'operator_id']//option[@value = '43']")
	    WebElement OperatorName2;
	    
	    //Selecting Access Permission
	    @FindBy (linkText = "Select All")
	    WebElement AccessPermission_All;
	    
	    //Selecting Access Permission
	    @FindBy (linkText = "Unselect All")
	    WebElement AccessPermission_None;
	    	    
	    // Successful validation message of user command permission
		@FindBy(xpath = "//*[@id='content']/div[2]") 
		WebElement user_command_permission;
		
		// Successful validation message of user command permission successfully
		@FindBy(xpath = "//div[text()='Success: You have modified users group!']") 
		WebElement user_command_permission_Edited_Successfull;
				
		@FindBy(xpath = "//div[text()='Success: You have deleted User Group(s) successfully!']")  
		WebElement user_command_permission_deleted_Successfull;
		
		//SelectAll user for delete
		@FindBy(xpath = "//*[@id='form']/table/thead/tr/td[1]")
		WebElement All_User_checkbox;
		
		//Cancel button
		@FindBy(linkText = "Cancel")
		WebElement Cancel;
		
		public void Clickon_UserCommand(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions action = new Actions(driver);	
		action.moveToElement(Systemtab).click().perform();
		Usersmain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='system']/ul/li[2]/a")));
		action.moveToElement(Usersmain).click().perform();
		action.moveToElement(UserCommandPermission).click().perform();
		SoftAssert sAssert = new SoftAssert();	
		sAssert.assertEquals(UserCmd_title.getText(), "User Command Permission", "User Command Permission Page title Assertion Failed");
		sAssert.assertAll();		
		}
		
		public void Insert_new_UserCmd1(WebDriver driver) {
		Clickon_UserCommand(driver);
		insert.click();
		OperatorName1.click();
		Select sel=new Select(OperatorName1);
		sel.selectByIndex(1);
		AccessPermission_All.click();
		Submit.click();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(user_command_permission.getText(), "Success: You have added an User Group successfully!", "User Command Permission Page insertion Assertion Failed");
		sAssert.assertAll();
		}
		
		public void Insert_new_UserCmd2(WebDriver driver) {
		Clickon_UserCommand(driver);
		insert.click();
		OperatorName1.click();
		Select sel=new Select(OperatorName1);
		sel.selectByIndex(2);
		AccessPermission_All.click();
		Submit.click();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(user_command_permission.getText(), "Success: You have added an User Group successfully!", "User Command Permission Page insertion Assertion Failed");
		sAssert.assertAll();
		}
		
		public void Insert_Duplicate_UserPermission(WebDriver driver) {
	    Clickon_UserCommand(driver);
	    insert.click();
	    OperatorName1.click();
	    AccessPermission_All.click();
	    Submit.click();
	    SoftAssert sAssert = new SoftAssert();	
		sAssert.assertEquals(user_command_permission.getText(), "Warning : Duplicate Operator name!", "User Command Permission duplicate Assertion Failed");
		sAssert.assertAll();
		}
		
		public void Insert_New_User_By_Cancel(WebDriver driver) {
		Clickon_UserCommand(driver);
		insert.click();
		OperatorName1.click();
		Select sel=new Select(OperatorName1);
		sel.selectByIndex(1);
		AccessPermission_All.click();
		Cancel.click();
		SoftAssert sAssert = new SoftAssert();	
		sAssert.assertEquals(UserCmd_title.getText(), "User Command Permission", "User Command Permission cancel Assertion Failed");
		sAssert.assertAll();
		}
		
		public void Edit_UserPermission_UnselectAll(WebDriver driver) {
		Clickon_UserCommand(driver);	
		Edit.click();
		AccessPermission_None.click();
		Submit.click();
		SoftAssert sAssert = new SoftAssert();	
		sAssert.assertEquals(user_command_permission.getText(), "Success: You have modified users group!", "User Command Permission Edit Assertion Failed");
		sAssert.assertAll();
		}
				
		public void Delete_without_selecting_user(WebDriver driver) {
		Clickon_UserCommand(driver);	
		Delete.click();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(user_command_permission.getText(), "Warning : Please select atleast one to process!", "User Command Permission Page delete without use select Assertion Failed");
		sAssert.assertAll();
		}
				
		public void Delete_User_By_Selecting_two(WebDriver driver) {
		Clickon_UserCommand(driver);
		All_User_checkbox.click();
		Delete.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(user_command_permission.getText(), "Success: You have deleted User Group(s) successfully!", "User Command Permission delete by selecting all user Assertion Failed");
		sAssert.assertAll();
		}
		
		//Take screenshot of respective tab
		public void Screenshot(String Method) {
		TakeScreenShoot.TakeScreenshot(Method);
		}	
}

