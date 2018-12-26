package test.addcustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.customerpage1.CreateCustomer;

import test.baseclass.BaseClass;

public class SearchOperation extends BaseClass
{

   @Test(priority=131)
	public void CustomerNumber()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithNO(driver);
	}

	@Test(priority=132)
	public void CustomerName()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithName(driver);
	}
	
	@Test(priority=133)
	public void STBName()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithSTBID(driver);
	}
	
	@Test(priority=134)
	public void OPerator()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithOperator(driver);
	}
	
	@Test(priority=135)
	public void ByGroup()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithGroup(driver);
	}
	
	@Test(priority=136)
	public void Status()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithStatus(driver);
	}
	
	@Test(priority=137)
	public void Approverd()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithApproved(driver);
	}

	@Test(priority=138)
	public void Date()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.SearchwithDate(driver);
	}

	
	@Test(priority=139)
	public void InvalidSearch()
	{
		CreateCustomer add=PageFactory.initElements(driver,CreateCustomer.class );
		add.IavalidSearch(driver);
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
