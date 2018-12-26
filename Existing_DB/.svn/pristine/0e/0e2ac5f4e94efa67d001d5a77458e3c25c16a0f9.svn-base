package test.order;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.orders_page.Orders_Page;


import test.baseclass.BaseClass;

public class Create_Order extends BaseClass

{
	  @Test(priority=160)
		public void CheckOrdertab()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.Select_Order();
		}
	
	   @Test(priority=162)
		public void addvalidcustomer()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.Successfull_Select_Order();
		}
	   
	
	 @Test(priority=163)
		public void addinvalidcustomer()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.UnSuccessfull_Select_Order();
		}
	 
	 @Test(priority=164)
		public void InValidCustomer()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.InvalidOrder();
	 }
	 
	
	 @Test(priority=165)
		public void WithoutPayment()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.WithOutSelectingPayment();
	 }
	 
	 @Test(priority=168)
		public void WithoutInstalltion()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.WithOutSelectingPayment();
		}
	 
	 @Test(priority=166)
		public void WithoutInstalltionPayment1()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.WithOutInstalltionPayment();
		}
	 
	 @Test(priority=167)
		public void addvalidprerentalcustomer()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
			ord.PreRental_Select_Order();
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
	 			ord.Screenshot_of_All_Tab(methodName);
	  		    		
	  }
	}
	 
}
	 

