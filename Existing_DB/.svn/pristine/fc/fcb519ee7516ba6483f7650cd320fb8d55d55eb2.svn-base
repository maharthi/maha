package test.category;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.category_webelement.Category_Page;
import test.baseclass.BaseClass;


public class edit_category extends BaseClass
{
  
	 @Test(priority=28)
	public void Edit_Functionality_of_Parent_Category()
    {
		Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	   obj.Edit_Functionality_of_Parent_Category_method();
	}
	
	 @Test(priority=29)
	public void Edit_Functionalty_of_Invalid_Category_Name()
	{
		Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
		obj.Edit_Functionalty_of_Invalid_Category_Name_method();
	} 
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) throws IOException
       {  
	   String methodName = result.getName().toString().trim();  
	   Category_Page category=PageFactory.initElements(driver,Category_Page.class);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   
	   int btncount = category.getAllData().size();
	   //System.out.println(btncount);
	   if(ITestResult.FAILURE==result.getStatus() && btncount==2 ) {
      	
       String msg = category.get_Without_Enter_Name_Warning();   
       //System.out.println(msg);
          
	  		if(!msg.equals("Success: Category has been successfully modified!")) {
	  			category.Screenshot_of_All_Tab(methodName);
	  		 }
      }
	  	    else if(ITestResult.FAILURE==result.getStatus() ){
	  	    	category.Screenshot_single(methodName);	    
	  	}
	  	
	}	  
	
}
