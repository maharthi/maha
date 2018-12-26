package test.ppv;

import test.baseclass.BaseClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.ppvpage.Create_ppv;
public class PPV_Addition  extends BaseClass
{
 
@Test(priority=190)
	 public void addppv() throws AWTException
	 {
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
        ppv1.Adding_new_ppv();
       
	 }  

	@Test(priority=191)
	 public void empty_new_ppv() throws AWTException
	 {
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
       ppv1.empty_new_ppv();
      
       
	 }
	
	@Test(priority=192)
	 public void invalid_new_ppv() throws AWTException
	 {
		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
      ppv1.invalid_new_ppv(); 
	 }
     
      @Test(priority=193) 
 	 public void duplicate_new_ppv() throws AWTException
 	 {
 		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
       ppv1.duplicate_new_ppv();
      
	 }  
      
      @Test(priority=194) 
  	 public void checking_cancel_insertion_of_ppv() throws AWTException
  	 {
  		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
        ppv1.checking_cancel_insertion_of_ppv();
       
 	 }
      
      @Test(priority=195) 
   	 public void duplicate_event_time_with_same_event_name() throws AWTException
   	 {
   		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
         ppv1.duplicate_event_time_with_same_event_name();
        
  	 }
      
	
      @Test(priority=196) 
    	 public void checking_navigation_to_home_page() throws AWTException
    	 {
    		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
          ppv1.checking_navigation_to_home_page();
         
   	 }
      
      @Test(priority=197) 
 	 public void checking_navigation_to_home_page_from_ppv_insertion() throws AWTException
 	 {
 		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
       ppv1.checking_navigation_to_home_page_from_ppv_insertion();
      
	 }
	
      @Test(priority=198)
 	 public void adddisableppv() 
 	 {
 		Create_ppv ppv1 =PageFactory.initElements(driver,Create_ppv.class );
         try 
         {
			ppv1.Adding_new_ppv_with_disabled_status();
		}
         catch (Exception e) 
         {
        	 e.printStackTrace();
		}
 	 }
 	    
      
      @AfterMethod
 	 public void TestOnFail(ITestResult result) 

 	{  
 	  	if(ITestResult.FAILURE==result.getStatus())
 	  	{
 	  	     //To take screenshot on fail of test methods
 	  		Create_ppv ppv1 = PageFactory.initElements(driver,Create_ppv.class);
 	  		 
 	  		 String methodName = result.getName().toString().trim();
 			 //System.out.println(methodName + ":Screenshot taken");  
 	  		   
 			 ppv1.Screenshot_of_All_Tab(methodName);  
 			 
 	  }
 	
 }  
      
      
}
  