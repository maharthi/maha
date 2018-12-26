package test.quick_search;


import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.quick_search.quick_search_webelement;

import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class quick_search extends BaseClass {
	
	@Test(priority=150)
	public void Verify_search_criteria_drop_down_options(){
		quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_search_criteria_drop_down_options_method(driver);
	}


	@Test(priority=151)
    public void Verify_Get_details_by_selecting_search_criteria_Customer_No_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_Customer_No_and_by_giving_valid_input_method(driver);
    }

 
	@Test(priority=152)
    public void Verify_Get_details_by_selecting_search_criteria_Customer_Name_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_Customer_Name_and_by_giving_valid_input_method(driver);
    }
    
	@Test(priority=153)
    public void Verify_Get_details_by_selecting_search_criteria_STB_NO_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_STB_NO_and_by_giving_valid_input_method(driver);
    }
    
    
	@Test(priority=154)
    public void Verify_Get_details_by_selecting_search_criteria_mobile_no_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_mobile_no_and_by_giving_valid_input_method(driver);
    }
    
	@Test(priority=155)
    public void Verify_Get_details_by_selecting_search_criteria_address_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_address_and_by_giving_valid_input_method(driver);
    }
    
	@Test(priority=156)
    public void Verify_Get_details_by_selecting_search_criteria_operator_and_by_giving_valid_input(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
		obj.Verify_Get_details_by_selecting_search_criteria_operator_and_by_giving_valid_input_method(driver);
    }
	
	@Test(priority=157)
	public void search_by_invalid_data(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
        obj.search_by_invalid_data_and_get_details_without_input_method(driver);
	}
	
	@Test(priority=158)
	public void Verify_pagination_in_Search_page(){
    	quick_search_webelement obj = PageFactory.initElements(driver, quick_search_webelement.class);
        obj.Verify_pagination_in_Search_page_method(driver);
	}
    
	@AfterMethod()
	public void teardown(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		TakeScreenShoot.TakeScreenshot(result.getName().toString().trim());
		}	
	}
   
}