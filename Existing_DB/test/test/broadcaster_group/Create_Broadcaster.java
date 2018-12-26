package test.broadcaster_group;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.broadcaster_group.Broadcaster_Page;
import test.baseclass.BaseClass;

public class Create_Broadcaster extends BaseClass 
{

	@Test(priority=31)
	 public void Broadcaster_Create()
	 {
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Create_BroadcasterGroup();
	  }
	 
	 @Test(priority=32)
	  public void Validate_Broadcaster_Create_Without_input() 
	 {
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_Create_Without_mandatory_data();
	  }
	 
	 @Test(priority=33)
	  public void Validate_Broadcaster_Create_With_invalid_data()
	 {
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_Create_With_invalid_data();
	 }
	
	 @Test(priority=34)
	  public void Validate_Broadcaster_create_with_duplicate_data() {
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.Broadcaster_create_with_duplicate_data();
	  }	
	 	 
	 @AfterMethod
	 public void TestOnFail(ITestResult result) 
	 {
	 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page.class);	 
	 String methodName = result.getName().toString().trim();	  	
	 int btncount = Broadcaster.getAllData().size();
	 //System.out.println(btncount);
	 
	  	if(ITestResult.FAILURE==result.getStatus() && btncount==5)
	  	{
	  		String msg = Broadcaster.Warning_Msg_On_Edit();
	  		//System.out.println(msg);
	  		
	  		if(!msg.equals("Success: You have modified Broadcaster!")) 
	  		{
	  		 Broadcaster.Screenshot_of_All_Tab(methodName);      
	  		 //System.out.println(methodName + ":Screenshot taken"); 	
	  }
  }
	  		else if(ITestResult.FAILURE==result.getStatus() ) 
	  		{
	  		 Broadcaster.Screenshot_single(methodName);	
	  		 //System.out.println(methodName + ":Screenshot taken");	
	  		}
	  		
}
}
