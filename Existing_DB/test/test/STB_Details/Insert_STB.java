package test.STB_Details;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.STB_Details.STB_Details_Page;
import test.baseclass.BaseClass;


public class Insert_STB extends BaseClass
{

 @Test(priority=1)
	public void Validate_Insert_STB_with_smartcard() throws InterruptedException
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Insert_STB_Details_with_smartcard();
	}
	
	/** @Test(priority=2)
	public void Validate_Insert_STB_Details_Without_Mandatory_Data()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		STB.Insert_STB_Without_mandatory_data();
	} 
	 
	 @Test(priority=3)
		public void Validate_Insert_STB_Details_With_SpecialCharacter()
		{
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		    STB.Insert_STB_With_invalid_data();
		    
		}
	
	@Test(priority=4)
	public void Validate_Insert_STB_Details_Less_than_actual_length()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Insert_STB_Less_than_actual_length();
	}
	 	
	@Test(priority=5)
	public void Insert_STB_Details_Greater_than_actual_length()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Insert_STB_Greater_than_actual_length();
	}
	
	@Test(priority=6)
	public void Insert_STB_Details_with_Duplicate_Data()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Insert_STB_With_Duplicate_Data();
	}
	
 	@Test(priority=7)
	public void Uploading_Valid_File()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		STB.Uploading_valid_File();
	}
	
 	 @Test(priority=8)
	 public void Uploading_InValid_File()
		{
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		  STB.Uploading_invalid_File();
		}
	**/
	 @AfterMethod
	 public void TestOnFail(ITestResult result) 
	 {
       STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);	 
	   String methodName = result.getName().toString().trim();	  	
	   int btncount = STB.getAllData().size();
	   	//System.out.println(btncount);
	 	if(ITestResult.FAILURE==result.getStatus() && btncount==5)
	  	{
	  		STB.Screenshot_single(methodName);
	  	}
	 
	 }
	 
}
