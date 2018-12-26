package test.ppv;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.createnvod.Create_nvod;

import com.ppvpage.Create_ppv;

import test.baseclass.BaseClass;

public class Edit_ppv extends BaseClass 
{


  @Test(priority=200)
    public void edit_new_ppv_with_valid_price() throws AWTException 
	{	
		
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
		ppv1.edit_new_ppv_with_valid_price();
    }
	
  
  @Test(priority=201)
  public void edit_new_ppv_with_empty_price() throws AWTException 
	{	
		
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
		ppv1.edit_new_ppv_with_empty_price();
  }
  
  
  @Test(priority=202)
  public void edit_new_ppv_with_invalid_price() throws AWTException 
	{	
		
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
		ppv1.edit_new_ppv_with_invalid_price();
  }
  
  
  
  @Test(priority=203)
  public void edit_new_ppv_with_cancel() throws AWTException 
	{	
		
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
		ppv1.edit_new_ppv_with_cancel();
  }
  
  
  @Test(priority=204)
  public void page_navigation_link() throws AWTException 
	{	
		
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
		ppv1.page_navigation_link();
  }
  
  
  @AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	     //To take screenshot on fail of test methods
	  		Create_ppv ppv1 = PageFactory.initElements(driver,Create_ppv.class);
	  		 
	  		 String methodName = result.getName().toString().trim();
			 System.out.println(methodName + ":Screenshot taken");  
	  		   
			 ppv1.Screenshot_of_All_Tab(methodName);  
			 
	  }
  
  
	  	
	}	  	
  
  
	
  
}
  
	

