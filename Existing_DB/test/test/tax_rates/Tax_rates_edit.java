package test.tax_rates;

import test.baseclass.BaseClass;

import java.awt.AWTException;


import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.tax_rates.Tax_Rate_element;

import test.baseclass.BaseClass;

public class Tax_rates_edit extends BaseClass
{

	  @Test(priority=235)
	    public void edit_new_tax_rates_with_empty() throws AWTException 
		{	
			
		  Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
			tx_rates.edit_new_tax_rates_with_empty();
	    }
	

	  @Test(priority=236)
	    public void edit_new_tax_rates_with_valid() throws AWTException 
		{	
			
		  Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
			tx_rates.edit_new_tax_rates_with_valid();
	    }
	  

	  @Test(priority=237)
	    public void edit_new_tax_rates_with_invalid() throws AWTException 
		{	
			
		  Tax_Rate_element tx_rates =PageFactory.initElements(driver,Tax_Rate_element.class );
			tx_rates.edit_new_tax_rates_with_invalid();
	    }
	  
	  
	  
	  
	  
	  
}
