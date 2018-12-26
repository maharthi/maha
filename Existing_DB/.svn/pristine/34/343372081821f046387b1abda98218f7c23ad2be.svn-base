package com.sales.customerGroupPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import excelreader.ExcelReader;
import test.baseclass.BaseClass;

public class Customer_group_Page extends BaseClass {
	    //public static WebDriver driver=null;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		@FindBy(xpath = "//a[text()='Sales']")
		WebElement sales;

		@FindBy(xpath = "//a[text()='Customers']")
		WebElement customers;
		
		@FindBy(xpath="//a[text()='Customer Groups']")
		WebElement Customer_Groups;
		
		@FindBy(xpath = "//a[@class='button' and text()='Insert']")
		WebElement insert;
		
		@FindBy(xpath = "//a[@class='button' and text()='Submit']")
		WebElement submit;
		
		@FindBy(xpath="//a[@class='button' and text()='Delete']")
		WebElement delete;
		
		@FindBy(xpath="//a[text()='Set Default']")
		WebElement set_default;
		
		@FindBy(xpath="//a[text()='Home']")
		WebElement home;
		
		@FindBy(xpath="//a[text()='Edit']")   
		public List<WebElement> edit;
			
		@FindBy(xpath=".//*[@id='form']/table/tbody/tr[1]/td[1]")   
		WebElement Customer_Group_Name_left;
		
		@FindBy(xpath=".//*[text()='Sort Order:']")   //insert
		WebElement Sort_Order_left;
		
		@FindBy(xpath=".//*[@id='checkAll']")   
		WebElement checkbox_All;
		
		@FindBy(xpath="//input[@class='case' and @type='checkbox']")   
		private List<WebElement> checkbox_one;
		
		@FindBy(xpath=".//*[text()='Description:']")
		WebElement Description_left;
		
		@FindBy(xpath="//span[text()='Customers must be approved by and administrator before they can login.']")
		WebElement Approve_New_Customers_left;
		
		@FindBy(xpath="//a[@class='button' and text()='Cancel']")
		WebElement cancel;
		
		@FindBy(xpath=".//*[@id='customer_group_name']")
		WebElement customer_group_name;
		
		@FindBy(xpath="//td[@class='left']")
		private List<WebElement> customer_group_name_all;	
		
		@FindBy(xpath="//textarea[@name='customer_group_description[1][description]']")
		WebElement description;
		
		@FindBy(xpath="//input[@value='1' and @name='approval']")
		WebElement approval_yes;
		
		@FindBy(xpath="//input[@value='0' and @name='approval']")
		WebElement approval_no;
		
		@FindBy(xpath="//input[@size='1' and @name='sort_order']")
		WebElement sort_order;
		
		@FindBy(xpath="//div[@class='success' and text()='Success: You have added a Customer Group successfully!']")
		WebElement customer_region_sucess_msg;
		
		@FindBy(xpath="//div[@class='success']")
		WebElement sucess_msg_default;
		
		@FindBy(xpath=".//*[@id='content']/div[2]")
		WebElement default_msg;
			
		@FindBy(xpath="//a[text()='>']")
		WebElement next_page_button;
			
		@FindBy(xpath="//a[text()='<']")
		WebElement previous_page_button;
			
		@FindBy(xpath="//a[text()='|<']")
		WebElement first_page_button;
		
		@FindBy(xpath="//a[text()='>|']")
		WebElement last_page_button;
		
		@FindBy(xpath="//a[text()='1']")
		WebElement first_option_page_button;
		
		@FindBy(xpath="//a[text()='2']")
		WebElement second_option_page_button;
		
		@FindBy(xpath="//div[@class='links']")
		public List<WebElement> button_all_count;
		
		//Getting button elements
		@FindBy(className ="button")
		List<WebElement> All_elements;
		
		//to get all the button in the page
		public List<WebElement> getAllData() {
	        return All_elements;
		}
		
		
		ExcelReader read = new ExcelReader();
		
		private void click_on_customer_group(WebDriver driver) {
			Actions act = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			act.moveToElement(sales).build().perform();
			act.moveToElement(customers).click().perform();
			act.moveToElement(Customer_Groups).click().perform();
		}
		
		private void insert_customer_group(WebDriver driver) {
			Actions act = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			act.moveToElement(sales).build().perform();
			act.moveToElement(customers).click().perform();
			act.moveToElement(Customer_Groups).click().perform();
			//Customer_Groups.click();
			//Thread.sleep(1000);
			insert.click();
		}
		
		private void customer_region_added_success_msg(WebDriver driver){
			String verify_str=driver.findElement(By.xpath("//div[@class='success' and text()='Success: You have added a Customer Group successfully!']")).getText().trim();
			//System.out.println(verify_str);
			Assert.assertEquals("Success: You have added a Customer Group successfully!",verify_str);
		}
		
		public void Verify_Customer_Group_sub_menu_option_method(WebDriver driver){
			this.click_on_customer_group(driver);
			String title = driver.getTitle().trim();
			//System.out.println(title);
			Assert.assertEquals("Customer Group", title);
		}
		
		public void Verify_click_on_breadcrumb_Home_method(WebDriver driver){
			this.click_on_customer_group(driver);
			home.click();
			String title=driver.getTitle().trim();
			//System.out.println(title);
			Assert.assertEquals("Dashboard",title);
		}
			
		public void Verify_insert_contents_method(WebDriver driver){
			this.insert_customer_group(driver);
			
			String verify_text1 = Customer_Group_Name_left.getText().trim();
			//System.out.println(verify_text1);
			Assert.assertEquals("* Customer Group Name:", verify_text1);
			
			String verify_text2 = Description_left.getText().trim();
			//System.out.println(verify_text2);
			Assert.assertEquals("Description:", verify_text2);
			
			String verify_text3 = Approve_New_Customers_left.getText().trim();
			//System.out.println(verify_text3);
			Assert.assertEquals("Customers must be approved by and administrator before they can login.", verify_text3);
			
			String verify_text4 = Sort_Order_left.getText().trim();
			//System.out.println(verify_text4);
			Assert.assertEquals("Sort Order:", verify_text4);
			
			String verify_text5 = submit.getText().trim();
			//System.out.println(verify_text5);
			Assert.assertEquals("Submit", verify_text5);
			
			String verify_text6 = cancel.getText().trim();
			//System.out.println(verify_text6);
	     	Assert.assertEquals("Cancel", verify_text6);
		}
		
		public void Insert_Customer_Group_method(WebDriver driver){
			this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 1, 0));
			description.sendKeys(read.getsheetnumber(15, 1, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
		    this.customer_region_added_success_msg(driver);
		}
		
		
		public void Insert_MultipleCustomer_Group_method(WebDriver driver) {
			this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 6, 0));
			description.sendKeys(read.getsheetnumber(15, 6, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
		    this.customer_region_added_success_msg(driver);
		    this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 7, 0));
			description.sendKeys(read.getsheetnumber(15, 7, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
		    this.customer_region_added_success_msg(driver);
		    this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 8, 0));
			description.sendKeys(read.getsheetnumber(15, 8, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
		    this.customer_region_added_success_msg(driver);
		}
		
		public void Insert_Customer_Group_without_entering_mandatory_fields_method(WebDriver driver){
			this.insert_customer_group(driver);
			description.sendKeys(read.getsheetnumber(15, 1, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
			String verify_str=driver.findElement(By.xpath(".//*[@id='no_error']")).getText().trim();
			//System.out.println(verify_str);
		    Assert.assertEquals("Customer group name is mandatory!", verify_str);
		 }
		
		public void Verify_Cancel_button_Customer_Group_Insert_page_method(WebDriver driver){
			this.insert_customer_group(driver);
			cancel.click();
			//Thread.sleep(1000);
			String verify_str=driver.getTitle();
			//System.out.println(verify_str);
		    Assert.assertEquals("Customer Group", verify_str);
		 }
		
		public void Verify_Edit_in_Customer_Group_page_method(WebDriver driver){
			this.click_on_customer_group(driver);
			edit.get(2).click();
			sort_order.clear();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
		    String verify_str=sucess_msg_default.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Success: You have modified customer group!",verify_str);
		}
		
		public void Verify_Cancel_in_Customer_Group_Edit_page_method(WebDriver driver){
			this.click_on_customer_group(driver);
			edit.get(2).click();
			cancel.click();
			String verify_str=driver.getTitle();
			//System.out.println(verify_str);
		    Assert.assertEquals("Customer Group", verify_str);
		}
		
		public void Insert_in_Customer_Group_without_entering_Customer_Group_Name_method(WebDriver driver){
			this.insert_customer_group(driver);
			description.sendKeys(read.getsheetnumber(15, 1, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 1, 2)));
			submit.click();
			String verify_str=driver.findElement(By.xpath(".//*[@id='no_error']")).getText().trim();
			//System.out.println(verify_str);
		    Assert.assertEquals("Customer group name is mandatory!", verify_str);
		}
		
		public void Insert_Customer_Group_Name_less_than_3_greater_than_32_characters_method(WebDriver driver){
			this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 2, 0));
			description.sendKeys(read.getsheetnumber(15, 2, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 2, 2)));
			submit.click();
			String verify_str=driver.findElement(By.xpath(".//*[@id='no_error']")).getText().trim();
			//System.out.println(verify_str);
		    Assert.assertEquals("Customer Group Name must be between 3 and 32 characters!",verify_str);
		}
		
		public void Insert_Customer_Group_Name_with_invalid_name_method(WebDriver driver){
			this.insert_customer_group(driver);
			customer_group_name.sendKeys(read.getsheetnumber(15, 3, 0));
			description.sendKeys(read.getsheetnumber(15, 3, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 3, 2)));
			submit.click();
			String verify_str=driver.findElement(By.xpath(".//*[@id='no_error']")).getText().trim();
			//System.out.println(verify_str);
		    Assert.assertEquals("Special Characters not allowed!",verify_str);
		}
		
		public void Insert_Customer_Group_Name_with_duplicate_name_method(WebDriver driver){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			this.click_on_customer_group(driver);
			String cpy_str= customer_group_name_all.get(2).getText().trim();
			//System.out.println(cpy_str);
			insert.click();
			customer_group_name.sendKeys(read.getsheetnumber(15, 6, 0));
			description.sendKeys(read.getsheetnumber(15, 4, 1));
			approval_yes.click();
			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(15, 4, 2)));
			submit.click();
			String verify_str=driver.findElement(By.xpath(".//*[@id='no_error']")).getText().trim();
			//System.out.println(verify_str);
		    Assert.assertEquals("Group already exist!",verify_str);
		}
		
		
		public void Verify_Delete_in_Customer_Group_method(WebDriver driver){
			this.click_on_customer_group(driver);
//			String cpy_str= customer_group_name_all.get(1).getText().trim();
//			System.out.println(cpy_str);
			checkbox_one.get(2).click();
			delete.click();
			driver.switchTo().alert().accept();
			String verify_str=sucess_msg_default.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Success: You have deleted Customer Group(s) successfully!",verify_str);
		}
		
//		public void Loop_Insert_Customer_Group_method(WebDriver driver){
//			this.click_on_customer_group(driver);
//			for(int i=0;i<500;i++){
//				insert.click();
//			customer_group_name.sendKeys("groups"+i);
//			description.sendKeys(read.getsheetnumber(4, 1, 1));
//			approval_yes.click();
//			sort_order.sendKeys(String.valueOf(read.getsheetnumber1(4, 1, 2)));
//			submit.click();
//			}
//		    //this.customer_region_added_success_msg(driver);
//		}
		
		
		
		public void Delete_multiple_Customer_group_method(WebDriver driver){
			this.click_on_customer_group(driver);
			checkbox_one.get(2).click();
			checkbox_one.get(4).click();
			checkbox_one.get(5).click();
			delete.click();
			driver.switchTo().alert().accept();
			String verify_str=sucess_msg_default.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Success: You have deleted Customer Group(s) successfully!",verify_str);
		}
		
		public void Edit_Customer_Group_with_valid_input_method(WebDriver driver) {
			this.click_on_customer_group(driver);
			edit.get(1).click();
			description.clear();
			description.sendKeys(read.getsheetnumber(15, 3, 1));
			submit.click();
		    String verify_str=sucess_msg_default.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Success: You have modified customer group!",verify_str);
		}
			
		public void Verify_Set_default_button_method(WebDriver driver){
			this.click_on_customer_group(driver);
			checkbox_one.get(0).click();
			set_default.click();
		    String verify_str=sucess_msg_default.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Set the default Group!",verify_str);
		}
		
		public void Verify_Set_default_button_for_multiple_selection_method(WebDriver driver){
			this.click_on_customer_group(driver);
			checkbox_one.get(0).click();
			checkbox_one.get(1).click();
			checkbox_one.get(2).click();
			checkbox_one.get(3).click();
			set_default.click();
		    String verify_str=default_msg.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Please select one Group to make it default.",verify_str);
		}
		
		public void Verify_Set_default_button_for_no_selection_method(WebDriver driver){
			this.click_on_customer_group(driver);
			set_default.click();
			String verify_str=default_msg.getText().trim();
		    //System.out.println(verify_str);
		    Assert.assertEquals("Warning: Please select a Customer Group to set as default!",verify_str);
		}
		
		public void Verify_next_page_button_and_next_page_button_method(WebDriver driver) {
			this.click_on_customer_group(driver);
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			next_page_button.click();
			String str1=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			System.out.println(str1);
			String  Actual = str1.substring(0, 10);
			//System.out.println(Actual);
			Assert.assertEquals("Showing 31", Actual);

			je.executeScript("scroll(0,800)");
			previous_page_button.click();
			String str2=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			//System.out.println(str2);
			String  Actual1 = str2.substring(0, 9);
			//System.out.println(Actual1);
			Assert.assertEquals("Showing 1", Actual1);
			}
		
		public void Verify_Go_to_last_and_first_page_method(WebDriver driver){
			this.click_on_customer_group(driver);
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			last_page_button.click();
			String str1=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			//System.out.println(str1);
			String  Actual = str1.substring(22, 25);
			//System.out.println(Actual);
			String expected = str1.substring(15, 18);
			//System.out.println(expected);
			Assert.assertEquals(expected, Actual);
			
			je.executeScript("scroll(0,800)");
			first_page_button.click();
			String str2=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			//System.out.println(str2);
			String  Actual1 = str2.substring(0, 9);
			//System.out.println(Actual1);
			Assert.assertEquals("Showing 1", Actual1);
		}
			
		public void Verify_first_and_second_page_method(WebDriver driver){
			this.click_on_customer_group(driver);
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			second_option_page_button.click();
			String str1=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			//System.out.println(str1);
			String  Actual = str1.substring(0, 10);
			//System.out.println(Actual);
			Assert.assertEquals("Showing 31", Actual);
			
			je.executeScript("scroll(0,800)");
			first_option_page_button.click();
			String str2=driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
			//System.out.println(str2);
			String  Actual1 = str2.substring(0, 9);
			//System.out.println(Actual1);
			Assert.assertEquals("Showing 1", Actual1);
		}

					
	}


