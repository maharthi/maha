package test.order;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.orders_page.Orders_Page;

import test.baseclass.BaseClass;

public class PrintPDF extends BaseClass
{
	 @Test(priority=176)
		public void PDFValidate()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		 ord.ValidatePdf();
		}
	 
	/* @Test(priority=177)
		public void StoreValidate()
		{
		 Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
		 ord.ValidateStoreurl();
		}*/
	 
	
	  @Test(priority=178)
	  public void CustomerValidate()
	  {
	   Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
	   ord.ValidateCustomerurl();
	  }
	  
	  @Test(priority=179)
	  public void Cancel()
	  {
	   Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
	   ord.CancelView();
	  }
	  
	  @Test(priority=180)
	  public void PackageUrl()
	  {
	   Orders_Page ord=PageFactory.initElements(driver,Orders_Page.class );
	   ord.ValidatePackageurl();
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
