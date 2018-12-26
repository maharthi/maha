package test.customer_group;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sales.customerGroupPage.Customer_group_Page;

import test.baseclass.BaseClass;
import screenshot.TakeScreenShoot;

public class Customer_Group_Add_Edit extends BaseClass {
	@Test(priority=50)
	public void Verify_Customer_Group_sub_menu_option() throws InterruptedException{
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.Verify_Customer_Group_sub_menu_option_method(driver);
        
	}
	
	@Test(priority=51)
	public void Verify_click_on_breadcrumb_Home(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_click_on_breadcrumb_Home_method(driver);
	}
	
	@Test(priority=52)
	public void Verify_insert_contents(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_insert_contents_method(driver);
	}
	
	@Test(priority=53)
	public void Insert_Customer_Group(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_Customer_Group_method(driver);
	}
	
	@Test(priority=54)
	public void Insert_multipleCustomer_Group(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
         obj.Insert_MultipleCustomer_Group_method(driver);
	}
	
	@Test(priority=55)
	public void Insert_Customer_Group_without_entering_mandatory_fields(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_Customer_Group_without_entering_mandatory_fields_method(driver);
	}
	
	@Test(priority=56)
	public void Verify_Cancel_button_Customer_Group_Insert_page(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Cancel_button_Customer_Group_Insert_page_method(driver);
	}
	
	@Test(priority=57)
	public void Verify_Edit_in_Customer_Group_page(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Edit_in_Customer_Group_page_method(driver);
	}
	
	@Test(priority=58)
	public void Verify_Cancel_in_Customer_Group_Edit_page(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Cancel_in_Customer_Group_Edit_page_method(driver);
	}
	
	@Test(priority=59)
	public void Insert_in_Customer_Group_without_entering_Customer_Group_Name(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_in_Customer_Group_without_entering_Customer_Group_Name_method(driver);
	}
	
	@Test(priority=60)
	public void Insert_Customer_Group_Name_less_than_3_greater_than_32_characters(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_Customer_Group_Name_less_than_3_greater_than_32_characters_method(driver);
	}
	
	@Test(priority=62)
	public void Insert_Customer_Group_Name_with_invalid_name(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_Customer_Group_Name_with_invalid_name_method(driver);
	}
	
	@Test(priority=63)
	public void Insert_Customer_Group_Name_with_duplicate_name(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Insert_Customer_Group_Name_with_duplicate_name_method(driver);
	}
	
	@Test(priority=64)
	public void Verify_Delete_in_Customer_Group(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Delete_in_Customer_Group_method(driver);
	}
	
	@Test(priority=65)
	public void Delete_multiple_Customer_group(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Delete_multiple_Customer_group_method(driver);
	}
	
	@Test(priority=66)
	public void Edit_Customer_Group_with_valid_input(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Edit_Customer_Group_with_valid_input_method(driver);
	}
	
	@Test(priority=67)
	public void Verify_Set_default_button(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Set_default_button_method(driver);
	}
	
	@Test(priority=68)
	public void Verify_Set_default_button_for_multiple_selection(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Set_default_button_for_multiple_selection_method(driver);
	}
	
	@Test(priority=69)
	public void Verify_Set_default_button_for_no_selection(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Set_default_button_for_no_selection_method(driver);
	}
	/*
	@Test(priority=70)
	public void Verify_next_page_button_and_next_page_button(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_next_page_button_and_next_page_button_method(driver);
	}
	
	@Test(priority=71)
	public void Verify_Go_to_last_and_first_page() {
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_Go_to_last_and_first_page_method(driver);
	}
	
	@Test(priority=72)
	public void Verify_first_and_second_page(){
		Customer_group_Page obj= PageFactory.initElements(driver, Customer_group_Page.class);
        obj.Verify_first_and_second_page_method(driver);
	}*/
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) 
       {
	   if(ITestResult.FAILURE==result.getStatus() ) {
	   String methodName = result.getName().toString().trim();  
	  // Customer_group_Page Customer_Group = PageFactory.initElements(driver,Customer_group_Page .class);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   TakeScreenShoot.TakeScreenshot(methodName);	   
      }
   }
}
