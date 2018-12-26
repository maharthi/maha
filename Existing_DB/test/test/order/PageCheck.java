package test.order;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.orders_page.Orders_Page;

import test.baseclass.BaseClass;

public class PageCheck extends BaseClass
{
	@Test(priority=173)
	public void SearchOrder()
	{
	 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		ord.PageValidation();
	}
	
	@Test(priority=174)
	public void SearchOrderlastfirst()
	{
	 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		ord.LastFirstPageValidation();
	}
	
	@Test(priority=175)
	public void ByNumberOrder()
	{
	 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		ord.IntegerPageValidation();
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
