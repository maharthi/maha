package test.addpackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.packagepage.Create_Package;

import test.baseclass.BaseClass;

public class Packageaddition extends BaseClass
{
	@Test(priority=221)
	public void addpack()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.addpackage();
	}
	
	@Test(priority=222)
	public void duplicatepackname()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.duplicate_packagename();
	}
	
	@Test(priority=223)
	public void duplicatepacknumber()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.duplicate_packagenumber();
	}
		
	@Test(priority=224)
	public void emptypackagename()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.empty_packagename();
	}
	
	@Test(priority=225)
	public void emptypackagenumber()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.empty_packagenumber();
	}
	
	@Test(priority=226)
	public void emptypackageprice()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.empty_packageprice();
	}
	
	@Test(priority=227)
	public void emptypackagesubsprice()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.empty_packagesubsprice();
	}
	
	@Test(priority=228)
	public void withoutcateogry()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.without_cateogry();
	}
	
	@Test(priority=229)
	public void withoutaddingchannels()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.without_addingchannel();
	}    
	
	@Test(priority=230)
	public void invalidpackagename()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.invalid_packagename();
	}    
	
	@Test(priority=231)
	public void invalidpackagenumber()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.invalid_packagenumber();
	} 
	
	@Test(priority=232)
	public void invalidpackageprice()
	{
		Create_Package pack=PageFactory.initElements(driver,Create_Package.class );
		pack.invalid_packageprice();
	} 
	
	 @AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	    //To take screenshot on fail of test methods
	  		Create_Package pack = PageFactory.initElements(driver,Create_Package.class);
	  		 
	  		String methodName = result.getName().toString().trim();
			//System.out.println(methodName + ":Screenshot taken");  
	  		   
		     pack.Screenshot_of_All_Tab(methodName);   		
	  }
    }

}
