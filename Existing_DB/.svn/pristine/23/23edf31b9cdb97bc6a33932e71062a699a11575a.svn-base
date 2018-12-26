package test.STB_Details;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.STB_Details.STB_Details_Page;
import test.baseclass.BaseClass;

public class Search_Fields extends BaseClass
{

	@Test(priority=11)
	public void Validate_Search_Operator_Name()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Operator_Name_Field();
	}
	
	@Test(priority=12)
	public void Valid_Search_STB_No_()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.STB_No_With_Valid_Data();
	}
	
	@Test(priority=13)
	public void Invalid_Search_STB_No()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.STB_No_With_invalid_data();
	}
	
	@Test(priority=14)
	public void Validation_Paired_with_Customer_dropDown_Field()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Paired_with_Customer_dropDown_Field();
	}
	
	@Test(priority=15)
	public void Blacklisted_dropDown_Field()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Blacklisted_Field();
	}
	
	@Test(priority=16)
	public void Status_dropDown_Field()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Status_Field();
	}
	
	@Test(priority=17)
	public void Cancel()
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 STB_Details_Page STB = PageFactory.initElements(driver,STB_Details_Page.class);
		 STB.Validation_for_Cancel();
	}
	
	
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
