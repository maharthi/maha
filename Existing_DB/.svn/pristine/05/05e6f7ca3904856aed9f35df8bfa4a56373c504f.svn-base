package com.quick_search;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import excelreader.ExcelReader;

import test.baseclass.BaseClass;


public class quick_search_webelement extends BaseClass{
	
	
	@FindBy(xpath="//a[@class='top' and text()='Quick Search']")
	WebElement Quick_Search;

	@FindBy(xpath="(//a[text()='Search'])[1]")
	WebElement Search;
	
	@FindBy(xpath="//select[@name='filter_option']")
    WebElement filter_option;
	
	@FindBy(xpath=".//*[@id='search_box']")
	WebElement search_box;
	
	@FindBy(xpath="//a[@class='button' and text()='Get Details']")
	WebElement Get_Details;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@class='center' and text()='Customer No.']")
	WebElement Customer_No;
	
	@FindBy(xpath="//*[@class='center' and text()='Operator ID']")
	WebElement Operator_ID;
	
	@FindBy(xpath="//*[@class='center' and text()='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[@class='center' and text()='Address']")
	WebElement Address;
	
	@FindBy(xpath="//*[@class='center' and text()='Mobile']")
	WebElement Mobile;
	
	@FindBy(xpath="//*[@class='center' and text()='STBNO']")
	WebElement STBNO;
	
	@FindBy(xpath="//*[@class='center' and text()='Email']")
	WebElement Email;
	
	@FindBy(xpath="//*[@class='center' and text()='No results!']")
	WebElement No_results;
	
	@FindBy(xpath="//option[text()='Name']")
	WebElement click_name;
	
	@FindBy(xpath="//option[text()='Mobile']")
	WebElement click_mobile;
	
	@FindBy(xpath="//option[text()='STBNO']")
	WebElement click_STBNO;
	
	@FindBy(xpath="//option[text()='Address']")
	WebElement click_Address;
	
	@FindBy(xpath="//option[text()='Operator']")
	WebElement click_Operator;
	
	@FindBy(xpath="//option[text()='Passcode']")
	WebElement click_Passcode;
	
	@FindBy(xpath="//option[text()='Passcode']")
	WebElement click_Customer_No;
	
	@FindBy(xpath="//a[@class='top' and text()='Inventory']")
	WebElement Inventory;
	
	@FindBy(xpath="//a[text()='STB Details']")
	WebElement STB_Details;
	
	@FindBy(xpath=".//*[@id='form']/table/tbody/tr[1]/td[3]")
	WebElement copy_STB_No_from_inventry_stb_details;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[2]")
	WebElement search_customer_no_result;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[4]")
	WebElement search_name_result;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[7]")
	WebElement search_STB_no_result;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[6]")
	WebElement search_mobile_no_result;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[5]")
	WebElement search_address_result;
	
	@FindBy(xpath=".//*[@id='form']/table[2]/tbody/tr/td[3]")
	WebElement search_operator_result;
	
	@FindBy(xpath="//div[@class='results']")
	WebElement page_result;
	
	@FindBy(xpath=".//*[@id='content']/div[2]/div[2]/div/div[1]/a[1]")
	WebElement page_number_2;
	
	@FindBy(xpath=".//*[@id='content']/div[2]/div[2]/div/div[1]/a[3]")
	WebElement page_number_1;
	
	//sales
	
	@FindBy(xpath = "//a[text()='Sales']")
	WebElement Sales;
	
	@FindBy(xpath = "(//a[text()='Customers'])[1]")
    WebElement Customertab;
	
	@FindBy(xpath = "(//a[text()='Customers'])[2]")
	WebElement Customersel;
	
	@FindBy(xpath=".//*[@id='form']/table/tbody/tr[2]/td[2]")
	WebElement cpy_1st_customer_no;
	
	@FindBy(xpath=".//*[@id='form']/table/tbody/tr[2]/td[3]")
	WebElement cpy_1st_name;
	
	@FindBy(xpath=".//*[@id='form']/table/tbody/tr[2]/td[4]")
	WebElement cpy_1st_STB_no;
	
	@FindBy(xpath=".//*[@id='form']/table/tbody/tr[2]/td[11]/a")
	WebElement click_on_edit;

	@FindBy(xpath="//input[@type='text' and @name='telephone']")
	WebElement cpy_mobile_no;
	
	@FindBy(xpath="//input[@type='text' and @name='operator']")
	WebElement cpy_operator;
	
	@FindBy(xpath=".//*[@id='address-1']")
	WebElement click_on_address;
	
	@FindBy(xpath=".//*[@id='tab-address-1']/table/tbody/tr[3]/td[2]/input")
	WebElement cpy_address;
	
	ExcelReader read =new ExcelReader();
	
	private void sales_customer_click(WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(Sales).build().perform();
		Customertab.click();
		Customersel.click();
	}
	
	
	private void click_on_search_top(WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(Quick_Search).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Search.click();		
	}
	
	private void no_result_error_assert(){ 
		Get_Details.click();
		String str1 = No_results.getText().trim();
		System.out.println(str1);
		Assert.assertEquals(str1, "No results!");
		}
		
	public void Verify_search_criteria_drop_down_options_method(WebDriver driver){
		this.click_on_search_top(driver);
		
//		String select1 = "Customer No";
//		String select2 = "Name";
//		String select3 = "Mobile";
//		String select4 = "STBNO";
//		String select5 = "Address";
//		String select6 = "Operator";
//				
//		for(int i=1;i<6;i++){
//			Select selectt = new Select(filter_option);
//			selectt.selectByVisibleText("select"+i);
//			System.out.println("select"+i);
//		}
			
		Select select = new Select(filter_option);
		select.selectByVisibleText("Customer No");
		
		Select select_1 = new Select(filter_option);
		select_1.selectByVisibleText("Name");
		
		Select select_2 = new Select(filter_option);
		select_2.selectByVisibleText("Mobile");
		
		Select select_3 = new Select(filter_option);
		select_3.selectByVisibleText("STBNO");
		
		Select select_4 = new Select(filter_option);
		select_4.selectByVisibleText("Address");
		
		Select select_5 = new Select(filter_option);
		select_5.selectByVisibleText("Operator");
		
		Select select_6 = new Select(filter_option);
		select_6.selectByVisibleText("Passcode");
				
	}
	
	
	@FindBy(xpath="(//input[@name=\"selected[]\"])[1]")
	WebElement View;
	public void Verify_Get_details_by_selecting_search_criteria_Customer_No_and_by_giving_valid_input_method(WebDriver driver){	
		this.click_on_search_top(driver);
		search_box.sendKeys(String.valueOf(read.getsheetnumber1(35, 6, 0)));
		Get_Details.click();
		Assert.assertEquals(true,View.isDisplayed() );
	}
	
	public void Verify_Get_details_by_selecting_search_criteria_Customer_Name_and_by_giving_valid_input_method(WebDriver driver){
		this.click_on_search_top(driver);
		Select select = new Select(filter_option);
		select.selectByVisibleText("Name");
		search_box.sendKeys(read.getsheetnumber(35, 6, 1));
		Get_Details.click();
		Assert.assertEquals(true,View.isDisplayed() );
	}
	
	public void Verify_Get_details_by_selecting_search_criteria_STB_NO_and_by_giving_valid_input_method(WebDriver driver){
			
		this.click_on_search_top(driver);
		Select select = new Select(filter_option);
		select.selectByVisibleText("STBNO");
		search_box.sendKeys(read.getsheetnumber(35, 6, 3));
		Get_Details.click();
		Assert.assertEquals(true,View.isDisplayed() );
	}	
	
	public void Verify_Get_details_by_selecting_search_criteria_mobile_no_and_by_giving_valid_input_method(WebDriver driver){
						
		this.click_on_search_top(driver);
		Select select = new Select(filter_option);
		select.selectByVisibleText("Mobile");
		search_box.sendKeys(String.valueOf(read.getsheetnumber2(35, 6, 2)));
		Get_Details.click();
		Assert.assertEquals(true,View.isDisplayed() );
	}
	
	public void Verify_Get_details_by_selecting_search_criteria_address_and_by_giving_valid_input_method(WebDriver driver){
				
		this.click_on_search_top(driver);
		Select select = new Select(filter_option);
		select.selectByVisibleText("Address");
		search_box.sendKeys(read.getsheetnumber(35, 6, 4));;
		Get_Details.click();
		Assert.assertEquals(true,View.isDisplayed() );
	}
	
	public void Verify_Get_details_by_selecting_search_criteria_operator_and_by_giving_valid_input_method(WebDriver driver){
		this.click_on_search_top(driver);
		Select select = new Select(filter_option);
		select.selectByVisibleText("Operator");
		Get_Details.click();
		String str = search_operator_result.getText();
		System.out.println("output "+str);
		Assert.assertEquals(str,"1");
	}
	
	public void search_by_invalid_data_and_get_details_without_input_method(WebDriver driver){
		this.click_on_search_top(driver);
			
		Select select = new Select(filter_option);
		select.selectByVisibleText("Customer No");
		search_box.sendKeys(read.getsheetnumber(35, 1, 0));
		this.no_result_error_assert();
		
		Select select_1 = new Select(filter_option);
		select_1.selectByVisibleText("Name");
		search_box.sendKeys(read.getsheetnumber(35, 1, 1));
		this.no_result_error_assert();
		
		Select select_2 = new Select(filter_option);
		select_2.selectByVisibleText("Mobile");
		search_box.sendKeys(String.valueOf(read.getsheetnumber1(35, 1, 2)));
		this.no_result_error_assert();
		
		Select select_3 = new Select(filter_option);
		select_3.selectByVisibleText("STBNO");
		search_box.sendKeys(read.getsheetnumber(35, 1, 3));
		this.no_result_error_assert();
		
		Select select_4 = new Select(filter_option);
		select_4.selectByVisibleText("Address");
		search_box.sendKeys(read.getsheetnumber(35, 1, 4));
		this.no_result_error_assert();
		
		Select select_6 = new Select(filter_option);
		select_6.selectByVisibleText("Passcode");
		search_box.sendKeys(read.getsheetnumber(35, 1, 5));
		this.no_result_error_assert();
		
		this.click_on_search_top(driver);
		Get_Details.click(); 
		String str = driver.switchTo().alert().getText().trim();
		System.out.println(str);
		driver.switchTo().alert().accept();
		Assert.assertEquals(str,"Please enter value to search!!!");
	}
	
	//Page Validation In Search
	
	@FindBy(xpath="//a[text()='>']")
	WebElement NextPagebutton;
	
	@FindBy(xpath="//a[text()='<']")
	WebElement PreviousPagebutton;
	
	@FindBy(xpath="//a[text()='<']")
	WebElement Numeric1Pagebutton;
	
	@FindBy(xpath="//a[text()='<']")
	WebElement Numeric2Pagebutton;
	
	public void Verify_pagination_in_Search_page_method(WebDriver driver){
		this.click_on_search_top(driver);
		//search_box.sendKeys(String.valueOf(read.getsheetnumber1(18, 4, 0)));
		Select select = new Select(filter_option);
		select.selectByVisibleText("Operator");
		Get_Details.click();
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,700)");
		Assert.assertEquals(true,NextPagebutton.isDisplayed());
		NextPagebutton.click();
		je.executeScript("scroll(0,700)");
		Assert.assertEquals(true,PreviousPagebutton.isDisplayed());
		je.executeScript("scroll(0,700)");
		Numeric1Pagebutton.click();
		Assert.assertEquals(true,NextPagebutton.isDisplayed());
		
		
	}
	
	
}
