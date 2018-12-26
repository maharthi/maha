package test.taxclass;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.localization.Tax_Classes;
import test.baseclass.BaseClass;


public class Taxclass extends BaseClass {
	
	@Test(priority=220)
	  public void Create_Tax_Class()  {
		  Tax_Classes Class_Title_1 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_1.Create_Tax_Class();
	  }

	@Test(priority=221)
	  public void Create_Tax_Classes_Without_Mandatory()  {
		  Tax_Classes Class_Title_2 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_2.Create_Tax_Class_Without_Mandatory();
	  }
		
	/*@Test(priority=222)
	  public void Create_Tax_Class_With_Invalid()  {
		  Tax_Classes Class_Title_3 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_3.Create_Tax_Class_With_Invalid();
	  }*/
	
	@Test(priority=223)
	  public void Edit_Tax_Class()  {
		  Tax_Classes Class_Title_4 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_4.Edit_Tax_Class();
	  }
	
	@Test(priority=224)
	  public void Edit_Tax_Class_Without_Mandatory()  {
		  Tax_Classes Class_Title_5 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_5.Edit_Tax_Class_Without_Mandatory();
	  }
	/*@Test(priority=225)
	  public void Edit_Tax_Class_With_Invalid()  {
		  Tax_Classes Class_Title_6 = PageFactory.initElements(driver,Tax_Classes.class);
		  Class_Title_6.Edit_Tax_Class_With_Invalid();
	  }*/
	
	@AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	  //To take screenshot on fail of test methods
	  		Tax_Classes Tax_Class_Screenshot = PageFactory.initElements(driver,Tax_Classes.class);
	  		String methodName = result.getName().toString().trim();
			System.out.println(methodName + ":Screenshot taken");  
			Tax_Class_Screenshot.Screenshot(methodName);
	  }
   }
}
