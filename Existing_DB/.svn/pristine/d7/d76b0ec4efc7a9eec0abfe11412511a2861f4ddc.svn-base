package test.channel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.channelspage.Channels_Page;
import test.baseclass.BaseClass;

public class Edit_channel extends BaseClass {
  
	@Test(priority=45)
    public void Channel_Edit() 
	{	
	Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	Channel.Edit_Channel();
	}
	
	@Test(priority=46)
    public void Validate_Channel_Edit_Without_mandatory_data()
	{	
	Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	Channel.Channel_Edit_Without_mandatory_data();
	}
	
	@Test(priority=47)
    public void Validate_Channel_Edit_With_invalid_data()
	{	
	Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	Channel.Channel_Edit_With_invalid_data();
	}
	
	@Test(priority=48)
    public void Validate_Channel_Edit_With_duplicate_data()
	{	
	Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	Channel.Channel_Edit_With_duplicate_data();
	}
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) throws IOException
        {  
	   String methodName = result.getName().toString().trim();  
	   Channels_Page channel = PageFactory.initElements(driver, Channels_Page.class);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   
	   int btncount = channel.getAllData().size();
	   if(ITestResult.FAILURE==result.getStatus() && btncount==7 ) 
	   {
       	
        String msg = channel.Warning_On_Channel_Edit();   
        //System.out.println(msg);
           
	  		if(!msg.equals("Product updated successfully!")) 
	  		{
	  			channel.Screenshot_of_All_Tab(methodName);
	  		}
	   }
	  	    else if(ITestResult.FAILURE==result.getStatus())
	  	    {
	  	        channel.Screenshot_single(methodName);	    
	  	    }
	  	
        }	  	
	
}

