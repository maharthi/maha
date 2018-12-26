package test.tax_rates;

import test.baseclass.BaseClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.tax_rates.Tax_Rate_element;

public class Tax_rates_main  extends BaseClass
{

	
	@Test(priority=230)
		 public void add_tax_rate() throws AWTException
		 {
		Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
	        tx_rates.Adding_new_tax_rates();
	       
		 } 

	@Test(priority=231)
	 public void Adding_new_tax_rates_with_empty() throws AWTException
	 {
	Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
       tx_rates.Adding_new_tax_rates_with_empty();
      
     }  

	
	@Test(priority=232)
	
	 public void Adding_new_tax_rates_with_invalid() throws AWTException
	 {
	 
	Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
      tx_rates.Adding_new_tax_rates_with_invalid();
     
	 }
	
	

	@AfterMethod
	 public void TestOnFail(ITestResult result) 

	{  
	  	if(ITestResult.FAILURE==result.getStatus())
	  	{
	  	  //To take screenshot on fail of test methods
	  		Tax_Rate_element Tax_rates_Screenshot = PageFactory.initElements(driver,Tax_Rate_element.class);
	  		String methodName = result.getName().toString().trim();
			System.out.println(methodName + ":Screenshot taken");  
			Tax_rates_Screenshot.Screenshot(methodName);
	  }
   }
	
	
	
}
