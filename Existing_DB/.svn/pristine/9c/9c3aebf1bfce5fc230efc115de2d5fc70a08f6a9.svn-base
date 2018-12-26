package test.users;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.system.users.Users_Page;
import test.baseclass.BaseClass;

public class Users_Add extends BaseClass {
 
@Test(priority=300)
public void Insert_Users_with_ValidData_AsTopAdmin() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_Users_valid_Data_TAdmin(driver);	
}

@Test(priority=301)
public void Insert_Users_with_ValidData_AsAdmin() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_Users_valid_Data_Admin(driver);	
}

@Test(priority=302)
public void Insert_Users_with_ValidData_Status_Disabled() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_Users_valid_Data_TAdmin_Status_Disabled(driver);	
}

@Test(priority=304)
public void Insert_Users_With_empty_data() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_User_without_data(driver);
}
	
@Test(priority=305)
public void Insert_Users_With_Invalid_data() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_User_with_invalid_data(driver);
}	
 
@Test(priority=306)
public void Insert_Users_With_Duplicate_data() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_User_with_duplicate_data(driver);
}

@Test(priority=307)
public void Insert_Users_By_Clicking_Cancel() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Insert_User_with_Cancel_button(driver);
}

@Test(priority=308)
public void Navigate_To_Home_Page_Check() {
Users_Page User = PageFactory.initElements(driver,Users_Page.class );
User.Navigation_To_HomePage_Validation(driver);
}

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
