package test.userCommand;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.system.userCommands.UserCommands_Page;


import test.baseclass.BaseClass;

public class UserCommand_Add_Edit extends BaseClass{
  
  @Test(priority=345)
  public void Insert_New_UserCommand_Valid() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class ); 	  
  UserCmds.Insert_new_UserCmd1(driver);
  UserCmds.Insert_new_UserCmd2(driver);
  }
  
  @Test(priority=346)
  public void Delete_userPermisson_without_selecting() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class );
  UserCmds.Delete_without_selecting_user(driver);
  }
  /*
  @Test(priority=347)
  public void Insert_duplicate_UserPermissionCmd() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class ); 
  UserCmds.Insert_Duplicate_UserPermission(driver);
  }
  */
  @Test(priority=348)
  public void Insert_User_PermissionCmd_By_Cancel() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class ); 
  UserCmds.Insert_New_User_By_Cancel(driver);
  }
   
  @Test(priority=349)
  public void Edit_UserCmdPermission_UnselectAll() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class );
  UserCmds.Edit_UserPermission_UnselectAll(driver);
  }
  
  @Test(priority=350)
  public void Delete_TwoUser() {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class );
  UserCmds.Delete_User_By_Selecting_two(driver);
  }
  
  @AfterMethod
  public void TestOnFail(ITestResult result) 
  {
  UserCommands_Page UserCmds = PageFactory.initElements(driver,UserCommands_Page.class );
  String methodName = result.getName().toString().trim();
  if(ITestResult.FAILURE==result.getStatus() ) 
  	{
	  UserCmds.Screenshot(methodName);		
  	}
  }
}
