package test.customer_region;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sales.customerRegionPage.Customer_Region_Page;

import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Customer_Region_Add_Edit extends BaseClass{
	
	@Test(priority=75)
	public void verify_sub_menu_under_sales() {
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		obj.verify_sub_menu_under_sales_method(driver);
	}
	
	@Test(priority=76)
	public void Verify_contents_of_customer_region(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Verify_insert_page_contents_of_customer_region_insert_method(driver);
	}
	
	@Test(priority=77)
	public void customer_region_creation(){
	     Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.customer_region_creation_method(driver);
	}
	
	@Test(priority=78)
	public void Verify_Insert_Customer_Region_without_entering_mandatory_fields(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Verify_Insert_Customer_Region_without_entering_mandatory_fields_method(driver);
	}
	
	@Test(priority=79)
	public void Verify_Insert_Customer_Region_without_selecting_Country_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Verify_Insert_Customer_Region_without_selecting_Country_Name_method(driver);
	}
	
	@Test(priority=80)
	public void Insert_Customer_Region_without_selecting_State_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_without_selecting_State_Name_method(driver);
	}
	
	@Test(priority=81)
	public void Insert_Customer_Region_without_selecting_Region_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_without_selecting_Region_Name_method(driver);
	}
	
	@Test(priority=82)
	public void Insert_Customer_Region_with_invalid_inputs_in_Region_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_with_invalid_inputs_in_Region_Name_method(driver);
	}
		
	@Test(priority=83)
	public void Insert_Customer_Region_without_entering_Region_Pin(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_without_entering_Region_Pin_method(driver);
	}
	
	@Test(priority=84)
	public void Insert_Customer_Region_invalid_inputs_in_Region_Pin(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_invalid_inputs_in_Region_Pin_method(driver);
	}
	
	@Test(priority=85)
	public void Insert_Customer_Region_for_duplicate_values_of_Region_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_for_duplicate_values_of_Region_Name_method(driver);
	}
	
	@Test(priority=86)
	public void Insert_Customer_Region_for_duplicate_values_of_Region_Pin(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Insert_Customer_Region_for_duplicate_values_of_Region_Pin_method(driver);
	}
	
	@Test(priority=87)
	public void edit_Customer_Region() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_method(driver);
	}
	
	@Test(priority=88)
	public void edit_Customer_Region_without_mandatory_fields() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_without_mandatory_fields_method(driver);
	}
	
	@Test(priority=89)
	public void edit_Customer_Region_without_Country_Name() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_without_Country_Name_method(driver);
	}
	
	@Test(priority=90)
	public void edit_Customer_Region_without_State_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_without_State_Name_method(driver);
	}
	
	@Test(priority=91)
	public void edit_Customer_Region_without_Region_Name() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_without_Region_Name_method(driver);
	}
	
	@Test(priority=92)
	public void edit_Customer_Region_invalid_inputs_Region_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_invalid_inputs_Region_Name_method(driver);
	}
	
	@Test(priority=93)
	public void edit_Customer_Region_duplicate_values_Region_Name(){
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.edit_Customer_Region_duplicate_values_Region_Name_method(driver);
	}
	
	@Test(priority=94)
	public void Delete_Customer_Region() throws Throwable{
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
		 obj.Delete_Customer_Region_method(driver);
	}
	
	@Test(priority=95)
	public void Delete_Customer_Region_without_selecting_value() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Delete_Customer_Region_without_selecting_value_method(driver);
		
	}
	
	@Test(priority=96)
	public void Delete_Customer_Region_selecting_multiple() throws Throwable{
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Delete_Customer_Region_selecting_multiple_method(driver);
		
	}
	
	@Test(priority=97)
	public void Set_Default_in_Customer_Region() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Set_Default_in_Customer_Region_method(driver);
	}
	
	@Test(priority=98)
	public void Set_Default_for_multiple_Customer_Region() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Set_Default_for_multiple_Customer_Region_method(driver);
	}
	
	@Test(priority=99)
	public void Set_Default_for_no_selection_Customer_Region() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Set_Default_for_no_selection_Customer_Region_method(driver);
	}
	/*
	@Test(priority=100)
	public void verify_next_page_button() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.verify_next_page_button_method(driver);
	}
	
	@Test(priority=101)
	public void verify_Previous_page_button() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.verify_Previous_page_button_method(driver);
	}
		
	@Test(priority=102)
	public void Verify_index_button_1_displayed_in_bottom() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Verify_index_button_1_displayed_in_bottom_method(driver);
	}
		
	@Test(priority=103)
	public void Verify_index_button_2_displayed_in_bottom() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Verify_index_button_2_displayed_in_bottom_method(driver);
	}
	
	@Test(priority=104)
	public void Go_to_first_page() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Go_to_first_page_method(driver);
	}
	
		
	@Test(priority=105)
	public void Go_to_first_page_Click_on_symbol() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Go_to_first_page_Click_on_symbol_method(driver);
	}
	
	@Test(priority=106)
	public void Go_to_last_page_Click_on_symbol() {
		 Customer_Region_Page obj = PageFactory.initElements(driver, Customer_Region_Page.class);
	     obj.Go_to_last_page_Click_on_symbol_method(driver);
	}*/
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) throws IOException
      {
	   if(ITestResult.FAILURE==result.getStatus() ) {
	   String methodName = result.getName().toString().trim();  
	  // Customer_group_Page Customer_Group = PageFactory.initElements(driver,Customer_group_Page .class);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   TakeScreenShoot.TakeScreenshot(methodName);	   
     }
  }
}
