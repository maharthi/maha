package test.addcustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.customerpage1.CreateCustomer;


import test.baseclass.BaseClass;

public class AddCustomer extends BaseClass
{
 
    @Test(priority=110)
	public void addvalidcustomer()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.createcustomer(driver);
	}
	
	
	@Test(priority=112)
	public void emptycustomer()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.emptyfields(driver);
	}
	
	@Test(priority=113)
	public void invalidcustomer()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.invalidfields(driver);
	}

	@Test(priority=114)
	public void duplicatecustomer()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.duplicates(driver);
	}
	
	
	
	 @AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	     //To take screenshot on fail of test methods
	  		 CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
	  		 String methodName = result.getName().toString().trim();
		     add.Screenshot_of_All_Tab1(methodName);  	  		
	  }
    }
	
}
