package test.broadcaster_group;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.broadcaster_group.Broadcaster_Page;
import test.baseclass.BaseClass;

public class Edit_Broadcaster extends BaseClass
{

	@Test(priority=35)
	public void Broadcaster_Edit() throws InterruptedException
	{
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Edit_Broadcaster(); 
	}
	
	@Test(priority=36)
    public void Validate_Broadcaster_Edit_Without_mandatory_data() throws InterruptedException
	{	
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_Edit_Without_mandatory_data();
	}
	
	
	@Test(priority=37)
    public void Validate_Broadcaster_Edit_With_invalid_data() throws InterruptedException
	{	
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_Edit_With_invalid_data();
	}
	  
	   @Test(priority=38)
	 public void Validate_Broadcaster_Edit_With_duplicate_data() throws InterruptedException 
	{	
		   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_Edit_With_duplicate_data();
	}
	
	   @AfterMethod
		 public void TestOnFail(ITestResult result) throws IOException
	        {  
		   String methodName = result.getName().toString().trim();  
		   Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
		   
		   int btncount = Broadcaster.getAllData().size();
		   if(ITestResult.FAILURE==result.getStatus() && btncount==7 )
		   {
	       	
	        String msg = Broadcaster.Warning_Msg_On_Edit();  
	        //System.out.println(msg);
	           
		  		if(!msg.equals("Success: You have modified Broadcaster!"))
		  		{
		  			Broadcaster.Screenshot_of_All_Tab(methodName);
		  		 }
	       }
		  	    else if(ITestResult.FAILURE==result.getStatus() ){
		  	    	Broadcaster.Screenshot_single(methodName);	    
		  	}
	

		   
	       }
}
