package test.STB_Pairing;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.STB_pairing.STB_Pairing_Page;
import test.baseclass.BaseClass;

public class STB_Pairing extends BaseClass
{

	@Test(priority=140)
	public void Validate_STB_Pairing_with_Deactivate_STB()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Unpairing_With_Deactivate_STB();
	}
	
	@Test(priority=141)
	public void Validate_STB_Pairing_with_Activate_STB()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Unpairing_With_Activate_STB();
	}
	
	@Test(priority=142)
	public void Validate_STB_Pairing_with_Invalid_STB()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Unpairing_With_Invalid_STB();
	}
	
	@Test(priority=143)
	public void Validate_STB_Pairing_without_STB()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Unpairing_Without_STB();
	}
	
	@Test(priority=144)
	public void Validate_Last_Page()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Last_Page();
	}
	
	@Test(priority=145)
	public void Validate_First_Page()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.First_Page();
	}
	
	/*@Test(priority=146)
	public void Validate_Previous_STB()
	{
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);
		 STB.Previous_STB();
	}
	*/
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) 
	 {
		 STB_Pairing_Page STB = PageFactory.initElements(driver,STB_Pairing_Page.class);	 
		 String methodName = result.getName().toString().trim();	  	
		 int btncount = STB.getAllData().size();
		 System.out.println(btncount);
	 
	  	if(ITestResult.FAILURE==result.getStatus() ) 
  		{
  		 STB.Screenshot_single(methodName);	
  		 System.out.println(methodName + ":Screenshot taken");	
  		}
  		
	  	
	 }
}
