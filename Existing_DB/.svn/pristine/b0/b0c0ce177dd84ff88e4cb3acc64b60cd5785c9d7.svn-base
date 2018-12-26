package test.addcustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.customerpage1.CreateCustomer;

import test.baseclass.BaseClass;

public class EditCustomer extends BaseClass
{
	
	@Test(priority=125)
	public void editvalidcustomer()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.editcustomer(driver);
	}
	
	@Test(priority=120)
	public void editsuccessfull()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.editcustomersuccesfull(driver);
	}
 
		
	@Test(priority=121)
	public void editempty()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.editemptydata(driver);
	}
	
	@Test(priority=122)
	public void editinvalid()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.editinvaliddata(driver);
	}
	
	@Test(priority=123)
	public void editduplicate()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.editduplicates(driver);
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
