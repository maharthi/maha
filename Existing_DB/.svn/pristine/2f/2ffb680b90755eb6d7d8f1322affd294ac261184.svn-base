package test.nvod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.channelspage.Channels_Page;
import com.createnvod.Create_nvod;
import test.baseclass.BaseClass;



public class Edit_nvod extends BaseClass 
{

	
	// All edit test cases are not executing as here are manual errors in build
	@Test(priority=214)
    public void Nvod_Edit() 
	{	
		Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
	 nvd.Edit_Nvod();
    }
	
	
	@Test(priority=215)
    public void Validate_Nvod_Edit_Without_mandatory_data() 
	 {	
		Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
	nvd.Nvod_Edit_Without_mandatory_data();
     }
	
	
	@Test(priority=216)
    public void Validate_Nvod_Edit_With_invalid_data()
	{	
		Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
	    nvd.Nvod_Edit_With_invalid_data();
    }
	
	@Test(priority=217)
    public void Validate_Nvod_Edit_With_duplicate_data()
	{	
	Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
	nvd.Nvod_Edit_With_duplicate_data();
    }
	
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) throws IOException
       {  
	   String methodName = result.getName().toString().trim();  
	   Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   
	   int btncount = nvd.getAllData().size();
	   if(ITestResult.FAILURE==result.getStatus() && btncount==7 ) {
      	
       String msg = nvd.Warning_On_Nvod_Edit();   
      // System.out.println(msg);
          
	  		if(!msg.equals("Product updated successfully!")) {
	  			nvd.Screenshot_of_All_Tab(methodName);
	  		 }
      }
	  	    else if(ITestResult.FAILURE==result.getStatus() ){
	  	        nvd.Screenshot_single(methodName);	    
	  	}
	  	
	}	  	
	
	
	
}
