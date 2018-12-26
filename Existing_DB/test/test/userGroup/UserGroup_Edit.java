package test.userGroup;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.system.userGroup.UserGroup_Page;

import test.baseclass.BaseClass;

public class UserGroup_Edit extends BaseClass{
	
@Test(priority=336)
public void Edit_UserGroup_with_Valid_data() {
UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
UserGroup.UserGroup_Edit_with_Valid_data(driver);
}

@Test(priority=337)
public void Edit_UserGroup_with_Empty_data() {
UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
UserGroup.UserGroup_Edit_with_empty_data(driver);
}
	
@Test(priority=338)
public void Edit_UserGroup_with_Invalid_data() {
UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
UserGroup.UserGroup_Edit_with_invalid_data(driver);
}

//@Test(priority=339)
//public void Edit_UserGroup_with_Duplicate_data() {
//UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
//UserGroup.UserGroup_Edit_with_duplicate_data(driver);
//}

@Test(priority=340)
public void Edit_UserGroup_by_Cancelling() {
UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
UserGroup.UserGroup_Edit_with_Cancel(driver);
}

@Test(priority=341)
public void Navigate_To_HomePage_check() {
UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
UserGroup.Navigate_To_HomePage_from_UserGroup(driver);
}

//@Test(priority=342)//Precondition - more than 30 user groups needed
//public void Pagination_Check() {
//UserGroup_Page UserGroup = PageFactory.initElements(driver,UserGroup_Page.class );
//UserGroup.Pagination_in_Usergroup(driver);
//}

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
