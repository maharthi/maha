package com.STB_pairing;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class STB_Pairing_Page extends BaseClass
{
	@FindBy(xpath = "//*[@id='dashboard']/a")
	WebElement Dashboard;
	
	@FindBy(xpath = "//*[@id='inventry']/a")
	WebElement Inventory;
	
	@FindBy(linkText ="STB Pairing")
	WebElement STB_Pairing;
	
	@FindBy(xpath = "//*[@id='scriptBox']")
	WebElement Search_Text_Field;
	
	@FindBy(linkText ="Unpair")
	WebElement Unpair_Button;
	
	@FindBy(linkText ="Search")
	WebElement Search_Button;
	
	@FindBy(xpath = "//*[@id='form']/table/thead/tr[1]/td[1]/input")
	WebElement Main_Check_Box;
	
	@FindBy(xpath="//div[text()='User unpaired successfully!']")
	WebElement Success_Msg;
	
	@FindBy(xpath="//div[text()='Please de-activate STB before you unpair!']")
	WebElement Warning_Msg_For_activated_STB;
	
	@FindBy(xpath="//div[text()='Warning: Select the STB Pairing(s) to unpair!']")
	WebElement Warning_Msg_Without_STB;
	
	@FindBy(xpath="//*[@id='form']/table/tbody/tr[1]/td[1]/input")
	WebElement Check_Box;
	
	@FindBy(className ="center")
	WebElement Invalid_STB;
	
	@FindBy(xpath="//*[@id='form']/table/tbody/tr[2]/td[1]/input")
	WebElement Second_Check_Box;
	
	@FindBy(linkText =">|")
	WebElement Last_Page_index;
	
	@FindBy(linkText ="|<")
	WebElement First_Page_index;
	
	@FindBy(xpath = "//a[text()='<']")
	WebElement Left_Index;
	
	@FindBy(xpath = "//a[text()='>']")
	WebElement Right_Index;
	
	//@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[5]")
	@FindBy(xpath = ".//*[@id='form']/table/tbody/tr[7]/td[5]")
	WebElement Pervious_STB;
	
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
				
		// Unpairing fot Deactive box
		public void Unpairing_With_Deactivate_STB()
		{
			Inventory.click();
			STB_Pairing.click();
			Search_Text_Field.sendKeys(read.getsheetnumber(22, 1, 0));
			Search_Button.click();
			Check_Box.click();
			Unpair_Button.click();
			Assert.assertEquals("User unpaired successfully!", Success_Msg.getText(), "STB Pairing with Deactive STB Assertion Failed");	
		}
	
		// Unpairing fot Active box
		public void Unpairing_With_Activate_STB()
		{
			Inventory.click();
			STB_Pairing.click();
			Search_Text_Field.sendKeys(read.getsheetnumber(22, 2, 0));
			Search_Button.click();
			Check_Box.click();
			Unpair_Button.click();
			Assert.assertEquals("Please de-activate STB before you unpair!", Warning_Msg_For_activated_STB.getText(), "STB Pairing Active STB Assertion Failed");
		}
		
		// Unpairing with Invalid box
		public void Unpairing_With_Invalid_STB()
		{
			Dashboard.click();
			Inventory.click();
			STB_Pairing.click();
			Search_Text_Field.sendKeys(read.getsheetnumber(22, 3, 0));
			Search_Button.click();
			Assert.assertEquals("No results!", Invalid_STB.getText(), "STB Pairing for Invalid STB Assertion Failed");
		}
	
		// Unpairing without box
		public void Unpairing_Without_STB()
		{
			Inventory.click();
			STB_Pairing.click();
			Unpair_Button.click();
			Assert.assertEquals("Warning: Select the STB Pairing(s) to unpair!", Warning_Msg_Without_STB.getText(), "STB Pairing without STB Assertion Failed");
		}	

		// To verify last page index
		public void Last_Page()
		{
			Dashboard.click();
			Inventory.click();
			STB_Pairing.click();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,9000)");
			Last_Page_index.click();
			Assert.assertEquals(true, Left_Index.isDisplayed(), "Last Page Assertion Failed");
		}

		// To verify First page index
		public void First_Page()
		{
			Dashboard.click();
			Inventory.click();
			STB_Pairing.click();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,9000)");
			Last_Page_index.click();
			je.executeScript("scroll(0,900)");
			First_Page_index.click();
			Assert.assertEquals(true, Right_Index.isDisplayed(), "First Page Assertion Failed");
		}
		
		/*// For Previous STB
		 public void Previous_STB()  // It is depands on STB
		{
			Inventory.click();
			STB_Pairing.click();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,9000)");
			//Last_Page_index.click();
			Pervious_STB.click();
			Assert.assertEquals("SDA47777771010", Pervious_STB.getText(), " Previous STB Assertion Failed");
		}*/
}
