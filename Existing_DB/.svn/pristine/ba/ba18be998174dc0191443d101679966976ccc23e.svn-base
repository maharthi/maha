package test.order;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.orders_page.Orders_Page;

import test.baseclass.BaseClass;

public class Search_Order extends BaseClass
{
	
	@Test(priority=181)
	public void SearchOrder()
	{
	 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		ord.SearchOrders();
	}
	
	@Test(priority=182)
	public void InValidSearchOrder()
	{
	 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		ord.InValidSearchOrders();
	}
	
	
	  @Test(priority=183)
	  public void ViewOrder()
	  {
	    Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
	    ord.ViewOrders();
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
		 			ord.Screenshot_single1(methodName);
		  		    		
		  }
		}

}
