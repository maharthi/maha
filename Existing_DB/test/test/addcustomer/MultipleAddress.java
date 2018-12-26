package test.addcustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.customerpage1.CreateCustomer;

import test.baseclass.BaseClass;

public class MultipleAddress 
{
	public class EditCustomer extends BaseClass
	{
		
		@Test(priority=126)
		public void multipleaddresscustomer()
		{
			CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
			add.customerwithsecondaddress(driver);
		}
		
		@Test(priority=127)
		public void deleteaddresscustomer()
		{
			CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
			add.customerdeletesecondaddress(driver);
		}
		
		 @AfterMethod
		 public void TestOnFail(ITestResult result) 

		{  
		  	if(ITestResult.FAILURE==result.getStatus())
		  	{
		  	     //To take screenshot on fail of test methods
		  		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		  		 String methodName = result.getName().toString().trim();
				 //System.out.println(methodName + ":Screenshot taken");  
			     add.Screenshot_of_All_Tab(methodName);  	  		
		  }
	    }
}
}
