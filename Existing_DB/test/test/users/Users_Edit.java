package test.users;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.system.users.Users_Page;

import test.baseclass.BaseClass;

public class Users_Edit extends BaseClass {
  
  @Test(priority=309)
  public void Users_Edit_with_Valid_Data() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_With_Valid_Data(driver);
  }

  @Test(priority=310)
  public void Users_Edit_Change_As_TopAdmin() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_by_Changing_to_TAdmin(driver);
  } 
  
  @Test(priority=311)
  public void Users_Edit_Change_As_Admin() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_by_Changing_to_Admin(driver);
  }
  
  @Test(priority=312)
  public void Users_Edit_Change_Status_Disabled() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_by_Changing_Status_Disabled(driver);
  }
  
  @Test(priority=313)
  public void Users_Edit_with_Empty_Data() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_with_empty_data(driver);
  } 
  
  @Test(priority=314)
  public void Users_Edit_with_Invalid_Data() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_with_invalid_data(driver);
  }
	
  @Test(priority=315)
  public void Users_Edit_with_Duplicate_Data() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_with_duplicate_data(driver);
  }		
	
  @Test(priority=316)
  public void Users_Edit_with_Password_Mismatch() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Editing_User_with_password_mismatch(driver);
  }
	
  @Test(priority=317)
  public void Users_Edit_with_by_Clicking_Cancel() {
  Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  Users.Edit_User_with_Cancel_button(driver);
  }
  
  //@Test(priority=318)
  //public void Pagination_on_UserPage() {
  //Users_Page Users = PageFactory.initElements(driver,Users_Page.class);
  //Users.Pagination_in_Users(driver);
  //}	
   
  @AfterMethod
  public void TestOnFail(ITestResult result) 
  {
  Users_Page User = PageFactory.initElements(driver,Users_Page.class );
  String methodName = result.getName().toString().trim();
  if(ITestResult.FAILURE==result.getStatus() ) 
  	{
  	 User.Screenshot(methodName);		
  	}
  }
	
}
