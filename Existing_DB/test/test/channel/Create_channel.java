package test.channel;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.channelspage.Channels_Page;
import test.baseclass.BaseClass;

public class Create_channel extends BaseClass {
  
	
	@Test(priority=41)
  public void Channel_Create() 
	{
	  Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	  Channel.Create_Channel_New();
	}
  
  @Test(priority=42)
  public void Validate_Channel_Create_Without_input() 
  	{
	  Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	  Channel.Channel_Create_Without_mandatory_data();
  	}
  
  @Test(priority=43)
  public void Validate_Channel_Create_With_invalid_data()
   	{
	  Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	  Channel.Channel_Create_With_invalid_data();
   	}
	
  @Test(priority=44)
  public void Validate_Channel_create_with_duplicate_data()
  	{
	  Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	  Channel.Channel_create_with_duplicate_data();
  	}	
  
  @AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	     //To take screenshot on fail of test methods
	  		 Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	  		 
	  		 String methodName = result.getName().toString().trim();
			 //System.out.println(methodName + ":Screenshot taken");  
	  		   
		     Channel.Screenshot_of_All_Tab(methodName);  	  		
	  }
    }
  }
