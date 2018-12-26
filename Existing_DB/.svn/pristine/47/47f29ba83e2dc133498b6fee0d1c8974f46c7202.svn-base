package test.nvod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.createnvod.Create_nvod;


import test.baseclass.BaseClass;


public class Nvodaddtion extends BaseClass
{

	@Test(priority=210)
	 public void addnvod()
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
		nvd.Adding_new_nvod();
	 }
	
	
	 @Test(priority=211)
	  public void Validate_Nvod_Create_Without_input() {
		 Create_nvod nvd = PageFactory.initElements(driver,Create_nvod.class );
		  nvd.Nvod_Create_Without_mandatory_data();
	  }
	
	 
	 @Test(priority=212)
	  public void Validate_Nvod_Create_With_invalid_data() {
		 Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
		  nvd.Nvod_Create_With_invalid_data();
	  }
		
	 
	  @Test(priority=213)
	  public void Validate_Nvod_create_with_duplicate_data() {
		  Create_nvod nvd =PageFactory.initElements(driver,Create_nvod.class );
		  nvd.Nvod_create_with_duplicate_data();
	  }	
	
	
	
@AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	     //To take screenshot on fail of test methods
	  		 Create_nvod nvd = PageFactory.initElements(driver,Create_nvod.class);
	  		 
	  		 String methodName = result.getName().toString().trim();
			// System.out.println(methodName + ":Screenshot taken");  
	  		   
			 nvd.Screenshot_of_All_Tab(methodName);  
			 
	  }
	
}  
}

	 
	 

	

