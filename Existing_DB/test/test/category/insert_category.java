package test.category;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import test.baseclass.BaseClass;
import com.category_webelement.Category_Page;

public class insert_category extends BaseClass {
	
	 @Test(priority=20)
	    public void Add_Category()
	    {
		   Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	    	obj.Insert_Categories_Method_Without_Parent();
	    } 
	 
		@Test(priority=21)
	     	public void Add_Category_With_Disabled_Status()
			{
			Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
				obj.Insert_Categories_with_Disabled_Status();
			}
	    
			@Test(priority=23)
	      public void Add_Category_With_Parent()
	    {
	    	Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	    	obj.Insert_Categories_Method_With_Parent();
	    }
	    
	    @Test(priority=24)
	    public void Special_Character_in_Column_method()
	    {
	    	Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	    	obj.Catalog_Categories_Special_Character_in_Column_Method();	    	
	    }
	    
	    @Test(priority=25)
	    public void Category_without_entering_the_Category_Name()
	    {
	    	Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	    	obj.Category_Without_Entering_the_Category_Name_Method();
	    }
			
	    @Test(priority=26)
	    public void Invalid_Category_Name()
	    {
	    	Category_Page obj=PageFactory.initElements(driver,Category_Page.class);
	    	obj.Invalid_Category_Name_method();
	    }
	
	   @Test(priority=27)
       public void Cancel_functionality()
	   {
		   Category_Page obj=PageFactory.initElements(driver,Category_Page.class);  
	   obj.Cancel_functionality_method();   
	   }
	   
	  @AfterMethod
		public void TestOnFail(ITestResult result) 

		{  
		  if(ITestResult.FAILURE==result.getStatus())
		 	{
		 	  //To take screenshot on fail of test methods
		 	  Category_Page Category=PageFactory.initElements(driver,Category_Page.class);	 	
		 	  String methodName = result.getName().toString().trim();
		      //System.out.println(methodName + ":Screenshot taken");   	  
		      Category.Screenshot_of_All_Tab(methodName);   
		 	}	
		}	
	   
	   
}
