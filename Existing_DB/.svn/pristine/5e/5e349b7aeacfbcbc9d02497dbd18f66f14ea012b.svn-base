package test.Settings;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.Settings.Settings_Page;

import test.baseclass.BaseClass;

public class Edit_Settings extends BaseClass
{
	@Test(priority=351)
	public void Validate_Edit_Settings()
	{
		Settings_Page data = PageFactory.initElements(driver,Settings_Page.class);
		data.Setting_with_valid_data();
	}
	
	@Test(priority=352)
	public void Empty_Settings_Value()
	{
		Settings_Page data = PageFactory.initElements(driver,Settings_Page.class);
		data.Setting_with_invalid_data();
	}
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) 
	{ 
		Settings_Page data = PageFactory.initElements(driver,Settings_Page.class);
		String methodName = result.getName().toString().trim();
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	    //To take screenshot on fail of test methods
	  		data.Screenshot_single(methodName);
	  		    		
	  }

	}
}
