package test.userGroup;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.system.userGroup.UserGroup_Page;
import test.baseclass.BaseClass;

public class UserGroup_Add extends BaseClass{
 
  @Test(priority=331)
  public void Insert_UserGroup_with_valid_data() {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class ); 
  UserGroup.UserGroup_Creation_with_Valid_data(driver);
  }
  
  @Test(priority=332)
  public void Insert_UserGroup_with_Empty_data() {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
  UserGroup.UserGroup_Creation_with_empty_data(driver);
  }
  
  @Test(priority=333)
  public void Insert_UserGroup_with_Invalid_data() {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
  UserGroup.UserGroup_Creation_with_invalid_data(driver);
  }
  
  @Test(priority=334)
  public void Insert_UserGroup_with_Duplicate_data() {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
  UserGroup.UserGroup_Creation_with_duplicate_data(driver);
  }
	
  @Test(priority=335)
  public void Insert_UserGroup_by_Cancelling() {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
  UserGroup.UserGroup_Creation_cancel(driver);
  }
  
  @AfterMethod
  public void TestOnFail(ITestResult result) 
  {
  UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
  String methodName = result.getName().toString().trim();
  if(ITestResult.FAILURE==result.getStatus() ) 
  	{
  	 UserGroup.Screenshot(methodName);		
  	}
  }
}
