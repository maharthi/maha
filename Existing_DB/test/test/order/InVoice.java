package test.order;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.orders_page.Orders_Page;

import test.baseclass.BaseClass;

public class InVoice extends BaseClass 
{
	 @Test(priority=170)
		public void InVoice_WithoutSelecting()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.Print_InVoice();
		}
	    
	 @Test(priority=171)
		public void InVoice_WithSelecctingSingle()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.Print_InVoice_Single();
		}
	 
	 @Test(priority=172)
		public void InVoice_WithSelecctingAll()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.Print_InVoice_All();
		}
	 
	 @AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  		 
		//To take screenshot on fail of test methods
	  		Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
	  		String methodName = result.getName().toString().trim();
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	    //To take screenshot on fail of test methods
	 			ord.Screenshot_single(methodName);
	  		    		
	  }
	}
}
