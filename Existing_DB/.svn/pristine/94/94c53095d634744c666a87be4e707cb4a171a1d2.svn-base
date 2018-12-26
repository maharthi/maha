package test.addcustomer;


import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.customerpage1.CreateCustomer;

import test.baseclass.BaseClass;

public class Approve extends BaseClass
{

	@Test(priority=117)
	public void Approved()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.ApporveCustomer(driver);
	}

	
	@Test(priority=115)
	public void WithoutSelectApproved()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.Approvelfailure(driver);
		
	}
	
	@Test(priority=116)
	public void Approved1()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.ApporveCustomer1(driver);
	
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
		     add.Screenshot_of_All_Tab2(methodName);  	  		
	  }
    }
	
}
