package test.addpackage;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.channelspage.Channels_Page;
import com.packagepage.Create_Package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import test.baseclass.BaseClass;

public class Edit_packageupdation extends BaseClass
{
	@Test(priority=240)
	public void edit_pack_inclusion()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.Edit_add_product_from_package();
	}
	
	
	@Test(priority=241)
	public void editpriceofpackage()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.Edit_price_of_package();
	}	
	
	@Test(priority=242)
	public void editinvalidpriceofpackage()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.Edit_price_of_package_invalid();
	}	
	
	@Test(priority=243)
	public void editpriceofpackagewithempty()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.Edit_price_of__package_with_emptydata();
	}	
	
	@Test(priority=244)
	public void editofpackagewithemptycateogry()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.edit_with_removing_cateogry();
	}	
	
	@Test(priority=245)
	public void editofpackagewithremovingsubscription()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.edit_with_removing_subscriptionoptionvalue();
	}
	
	/*@Test(priority=246)
	public void editofpackagewithspecificregion()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.edit_package_withspecific_region();
	}	
		
    @Test(priority=247)
	public void edit_pack_exclusion()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.Edit_remove_product_from_package();
		
	}   */
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) throws IOException
       {  
	   String methodName = result.getName().toString().trim();  
	   Create_Package pack = PageFactory.initElements(driver, Create_Package.class);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
	   
	   int btncount = pack.getAllData().size();
	   //System.out.println(btncount);
	   if(ITestResult.FAILURE==result.getStatus() && btncount==9 ) {
      	
       String msg = pack.Warning_On_Package_Edit();   
       //System.out.println(msg);
          
	  		if(!msg.equals("Success: Package has been successfully modified!")) {
	  			pack.Screenshot_of_All_Tab(methodName);
	  		 }
      }
	  	    else if(ITestResult.FAILURE==result.getStatus() ){
	  	    	pack.Screenshot_single(methodName);	    
	  	}
	  	
	}	  	
}
