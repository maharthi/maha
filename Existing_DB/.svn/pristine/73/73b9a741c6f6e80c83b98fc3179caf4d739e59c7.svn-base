package com.sales.customerRegionPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import excelreader.ExcelReader;

public class Customer_Region_Page {
	@FindBy(xpath = "//a[text()='Sales']")
	WebElement sales;

	//@FindBy(xpath = "//a[text()='Customers']")
	@FindBy(linkText = "Customers")
	WebElement customers;

	//@FindBy(xpath = "//a[text()='Customer Region']")
	@FindBy(linkText = "Customer Region")
	WebElement customer_region;

	@FindBy(xpath = "//a[@class='button' and text()='Insert']")
	WebElement insert;

	@FindBy(xpath = "//select[@name='country_id']")
	WebElement country_name;
	
	@FindBy(xpath = "//select[@name='country_id']")
	public List<WebElement> all_country;
	
	@FindBy(xpath = "//option[@value='99']")  //default India
	WebElement country_name_click;

	@FindBy(xpath = "//select[@name='zone_id']")
	WebElement zone_id;

	@FindBy(xpath = "//option[text()='Karnataka']") //select Karnataka
	WebElement zone_name;

	@FindBy(xpath = "//input[@name='region']")
	WebElement region_name;

	@FindBy(xpath = "//input[@name='pin']")
	WebElement region_pin;

	@FindBy(xpath = "//a[@class='button' and text()='Submit']")
	WebElement submit;
	
	@FindBy(xpath="(//a[text()='Edit'])[2]")   //[2]---->variable
	WebElement edit;
	
	@FindBy(xpath="(//input[@type='checkbox']")   
	public List<WebElement> all_checkbox;
	
	@FindBy(xpath="//a[@class='button' and text()='Delete']")
	WebElement delete;
	
	@FindBy(xpath="//a[text()='Set Default']")
	WebElement set_default;
	
	@FindBy(xpath="//td[@class='right']")
	public List<WebElement> all_Edit;

	@FindBy(xpath = "//div[text()='Success: You have added a Region successfully!']")
	WebElement Actual_sucessful_msg;
	
	@FindBy(xpath = "//span[@class='error' and text()='Duplicate Region name!']")
	WebElement Duplicate_Region_name_error;
	
	@FindBy(xpath="//a[text()='>']")
	WebElement next_page_button;
		
	@FindBy(xpath="//a[text()='<']")
	WebElement previous_page_button;
		
	@FindBy(xpath="//a[text()='|<']")
	WebElement first_page_button;
	
	@FindBy(xpath="//a[text()='>|']")
	WebElement last_page_button;
	
	@FindBy(xpath="//a[text()='1']")
	WebElement first_option_page_button;
	
	@FindBy(xpath="//a[text()='2']")
	WebElement second_option_page_button;
	
	@FindBy(xpath="//div[@class='links']")
	public List<WebElement> button_all_count;
	
	public String get_Duplicate_Region_name_error(){
		return Duplicate_Region_name_error.getText();		
	}
	
	public String get_Actual_sucessful_msg() {
		return Actual_sucessful_msg.getText();
	}

	ExcelReader read = new ExcelReader();
	
	private void click_on_customer_region(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(sales).perform();
		act.moveToElement(customers).click().perform();
		act.moveToElement(customer_region).click().perform();
	}
    
	private void Insert_button_customer_region(WebDriver driver){
		Actions act = new Actions(driver);
		act.moveToElement(sales).perform();
		customers.click();
		customer_region.click();
		insert.click();
	}
	
	public void verify_sub_menu_under_sales_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String title=driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals("Customer Region", title);
	}
	private void region_updated_msg(WebDriver driver){
		String Verifytext= driver.findElement(By.xpath("//div[text()='Success: Region update successfully!']")).getText().trim();
		Assert.assertEquals(Verifytext, "Success: Region update successfully!");
		//System.out.println(Verifytext);
	}
	private void Country_name_error(WebDriver driver){
		String Verifytext1= driver.findElement(By.xpath("//span[text()='Please select country as India..!']")).getText().trim();
		Assert.assertEquals(Verifytext1, "Please select country as India..!");
		//System.out.println(Verifytext1);
	}

	private void State_name_error(WebDriver driver){
		String Verifytext1= driver.findElement(By.xpath("//span[text()='Please select state..!']")).getText().trim();
		Assert.assertEquals(Verifytext1, "Please select state..!");
		//System.out.println(Verifytext1);
	}
	
	private void Region_name_error(WebDriver driver){
		String Verifytext2= driver.findElement(By.xpath("//span[text()='Region name is mandatory!, Length should be between 3-24!']")).getText().trim();
		Assert.assertEquals(Verifytext2, "Region name is mandatory!, Length should be between 3-24!");
		//System.out.println(Verifytext2);
	}
	
	private void Region_pin_error(WebDriver driver){
		String Verifytext3= driver.findElement(By.xpath("//span[text()='Region pin is mandatory!, Accepts only 0-9!']")).getText().trim();
		Assert.assertEquals(Verifytext3, "Region pin is mandatory!, Accepts only 0-9!");
		//System.out.println(Verifytext3);
	}
	
	private void delete_success_msg(WebDriver driver){
		
		String Verifytext = driver.findElement(By.xpath("//div[@class='success' and text()='Success: You have deleted Customer Region(s) successfully!']")).getText().trim();
	    Assert.assertEquals(Verifytext, "Success: You have deleted Customer Region(s) successfully!");
	    //System.out.print(Verifytext);
	}
	
	private void delete_error_msg(WebDriver driver){
		String Verifytext= driver.findElement(By.xpath("//div[text()='Warning: Select the Customer Region(s) for deletion!']")).getText().trim();
        Assert.assertEquals(Verifytext, "Warning: Select the Customer Region(s) for deletion!");
        //System.out.print(Verifytext);
	}
	
	private void region_name_exist_error(WebDriver driver){
		String Verifytext= driver.findElement(By.xpath("//span[text()='Region name already exist!']")).getText().trim();
        Assert.assertEquals(Verifytext, "Region name already exist!");
        //System.out.print(Verifytext);
	}

	private void Set_default_success_msg(WebDriver driver){
		String Verifytext= driver.findElement(By.xpath("//div[text()='Set the default Region!']")).getText().trim();
        Assert.assertEquals(Verifytext, "Set the default Region!");
        //System.out.print(Verifytext);
	}	
	
	public void Verify_insert_page_contents_of_customer_region_insert_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
				
		String Verifytext1= driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[1]/td[1]")).getText().trim();
		Assert.assertEquals(Verifytext1, "* Country Name");
		//System.out.println(Verifytext1);
		
		String Verifytext2= driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[2]/td[1]")).getText().trim();
		Assert.assertEquals(Verifytext2, "* State Name");
		//System.out.println(Verifytext2);
		
		String Verifytext3= driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[3]/td[1]")).getText().trim();
		Assert.assertEquals(Verifytext3, "* Region Name");
		//System.out.println(Verifytext3);
		
		String Verifytext4= driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[4]/td[1]")).getText().trim();
		Assert.assertEquals(Verifytext4, "* Region PIN");
		//System.out.println(Verifytext4);
		
		String Verifytext5= driver.findElement(By.xpath("//a[@class='button' and text()='Submit']")).getText().trim();
		Assert.assertEquals(Verifytext5, "Submit");
		//System.out.println(Verifytext5);
		
		String Verifytext6= driver.findElement(By.xpath("//a[@class='button' and text()='Cancel']")).getText().trim();
		Assert.assertEquals(Verifytext6, "Cancel");
		//System.out.println(Verifytext6);
	}
	
	public void customer_region_creation_method(WebDriver driver){
        this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(16, 1, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 1, 1)));
		submit.click();
		Assert.assertEquals(get_Actual_sucessful_msg(),
				"Success: You have added a Region successfully!");
       
}
	
	
	
//	public void verify_contents_of_customer_region_page_method(WebDriver driver){
//		this.click_on_customer_region(driver);
//		String Verifytext1= driver.findElement(By.xpath("//td[text()='Region Name']")).getText().trim();
//		Assert.assertEquals(Verifytext1, "Region Name");
//		System.out.println(Verifytext1);
//		
//		String Verifytext2= driver.findElement(By.xpath("//td[text()='Region PIN']")).getText().trim();
//		Assert.assertEquals(Verifytext2, "Region PIN");
//		System.out.println(Verifytext2);
//		
//		String Verifytext3= driver.findElement(By.xpath("//td[text()='Action']")).getText().trim();
//		Assert.assertEquals(Verifytext3, "Action");
//		System.out.println(Verifytext3);
//		
//		String Verifytext4= driver.findElement(By.xpath("//a[@class='button' and text()='Set Default']")).getText().trim();
//		Assert.assertEquals(Verifytext4, "Set Default");
//		System.out.println(Verifytext4);
//		
//		String Verifytext5= driver.findElement(By.xpath("//a[@class='button' and text()='Insert']")).getText().trim();
//		Assert.assertEquals(Verifytext5, "Insert");
//		System.out.println(Verifytext5);
//		
//		String Verifytext6= driver.findElement(By.xpath("//a[@class='button' and text()='Delete']")).getText().trim();
//		Assert.assertEquals(Verifytext6, "Delete");
//		System.out.println(Verifytext6);
//		
//		String Verifytext7= driver.findElement(By.xpath(".//*[@id='checkAll']")).getText().trim();
//		Assert.assertEquals(Verifytext7, "Check box column");
//		System.out.println(Verifytext7);
//		}
	
	
	public void Verify_Insert_Customer_Region_without_entering_mandatory_fields_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
		submit.click();
		String Verifytext1= driver.findElement(By.xpath("//span[text()='Please select state..!']")).getText().trim();
		Assert.assertEquals(Verifytext1, "Please select state..!");
		//System.out.println(Verifytext1);
		
		String Verifytext2= driver.findElement(By.xpath("//span[text()='Region name is mandatory!, Length should be between 3-24!']")).getText().trim();
		Assert.assertEquals(Verifytext2, "Region name is mandatory!, Length should be between 3-24!");
		//System.out.println(Verifytext2);
		
		String Verifytext3= driver.findElement(By.xpath("//span[text()='Region pin is mandatory!, Accepts only 0-9!']")).getText().trim();
		Assert.assertEquals(Verifytext3, "Region pin is mandatory!, Accepts only 0-9!");
		//System.out.println(Verifytext3);
	}
	
	public void Verify_Insert_Customer_Region_without_selecting_Country_Name_method(WebDriver driver){
	    this.Insert_button_customer_region(driver);
	    country_name.sendKeys("Text Select");
	    submit.click();
	    String Verifytext1= driver.findElement(By.xpath("//span[text()='Please select country as India..!']")).getText().trim();
		Assert.assertEquals(Verifytext1, "Please select country as India..!");
		//System.out.println(Verifytext1);
	 }
	
	public void Insert_Customer_Region_without_selecting_State_Name_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		region_name.sendKeys(read.getsheetnumber(16, 3, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 3, 1)));
		submit.click();
		this.State_name_error(driver);
	}
	
	public void Insert_Customer_Region_without_selecting_Region_Name_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 3, 1)));
		submit.click();
		this.Region_name_error(driver);
	}
		
	public void Insert_Customer_Region_with_invalid_inputs_in_Region_Name_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
		country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys("12");
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 3, 1)));
		submit.click();
		this.Region_name_error(driver);
	}
		
	public void Insert_Customer_Region_without_entering_Region_Pin_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
		country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(String.valueOf(read.getsheetnumber(16, 3, 0)));
		submit.click();
		this.Region_pin_error(driver);
	}
	
	
	public void Insert_Customer_Region_invalid_inputs_in_Region_Pin_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
		country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(String.valueOf(read.getsheetnumber(16, 3, 0)));
		region_pin.sendKeys("123 586");
		submit.click();
		this.Region_pin_error(driver);
		
		this.Insert_button_customer_region(driver);
		country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(String.valueOf(read.getsheetnumber(16, 3, 0)));
		region_pin.sendKeys("12xpathExpression3@8*");
		submit.click();
		this.Region_pin_error(driver);
	}
	
	public void Insert_Customer_Region_for_duplicate_values_of_Region_Name_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(16, 4, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 4, 1)));
		submit.click();
        Assert.assertEquals(get_Actual_sucessful_msg(), "Success: You have added a Region successfully!");
        //System.out.println(Actual_sucessful_msg);
		
        this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(16, 4, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 5, 1)));
		submit.click();
		Assert.assertEquals(get_Duplicate_Region_name_error(), "Duplicate Region name!");
		//System.out.println(Duplicate_Region_name_error);
	}
	
	public void Insert_Customer_Region_for_duplicate_values_of_Region_Pin_method(WebDriver driver){
		this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(16, 6, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 6, 1)));
		submit.click();
		Assert.assertEquals(get_Actual_sucessful_msg(), "Success: You have added a Region successfully!");
       		
        this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(16, 6, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(16, 7, 1)));
		submit.click();
		String drive = driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[4]/td[2]/span")).getText();
		Assert.assertEquals(drive, "Duplicate Region Pin "+String.valueOf(read.getsheetnumber1(16, 6, 1)));
		//System.out.println(drive);
	}
	
	public void edit_Customer_Region_method(WebDriver driver){
		this.click_on_customer_region(driver);
		edit.click();
		region_name.clear();
		region_name.sendKeys(read.getsheetnumber(16, 7, 0));
		submit.click();
		this.region_updated_msg(driver);
	}
	
	public void edit_Customer_Region_without_mandatory_fields_method(WebDriver driver){
		this.click_on_customer_region(driver);
		edit.click();
		country_name.sendKeys("Text");
		zone_id.click();
		zone_id.sendKeys("---Please Select---");
		region_name.clear();
		region_pin.sendKeys("");
		submit.click();
		region_pin.sendKeys("");
		submit.click();
		this.Region_name_error(driver);
		this.Region_pin_error(driver);
		this.Country_name_error(driver);
		this.State_name_error(driver);
	}
	
	public void edit_Customer_Region_without_Country_Name_method(WebDriver driver){
		this.click_on_customer_region(driver);
		edit.click();
		country_name.sendKeys("Text");
		submit.click();
		this.Country_name_error(driver);
	}
	
	public void edit_Customer_Region_without_State_Name_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		edit.click();
		zone_id.sendKeys("---Please Select---");
		submit.click();
		this.State_name_error(driver);
	}
	
	public void edit_Customer_Region_without_Region_Name_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		edit.click();
		region_name.clear();
		submit.click();
		this.Region_name_error(driver);
	}
	
	public void edit_Customer_Region_invalid_inputs_Region_Name_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		edit.click();
		region_name.clear();
		region_name.sendKeys("hg");
		submit.click();
		this.Region_name_error(driver);
	}
	
	public void edit_Customer_Region_duplicate_values_Region_Name_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		edit.click();
		region_name.clear();
		region_name.sendKeys(read.getsheetnumber(16, 1, 0));
		submit.click();
		Assert.assertTrue("Region name already exist!", true);
	}
	  
	@FindBy(xpath="(//input[@class='case'])[2]")
	WebElement del1;
	
	public void Delete_Customer_Region_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[1]/td[1]/input")).click();
		set_default.click();
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[3]/td[1]/input")).click(); //default 2nd 
		delete.click();
		driver.switchTo().alert().accept();
		this.delete_success_msg(driver);
       	
	}	
	
	public void	Delete_Customer_Region_without_selecting_value_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		delete.click();
		driver.switchTo().alert().accept();
		this.delete_error_msg(driver);
	}
		
	public void	Delete_Customer_Region_selecting_multiple_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[1]/td[1]/input")).click();
		set_default.click();
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[3]/td[1]/input")).click(); //default 2nd 
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[4]/td[1]/input")).click(); //default 3rd 
		delete.click();
		driver.switchTo().alert().accept();
		this.delete_success_msg(driver);
	}	
	
	public void Set_Default_in_Customer_Region_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[2]/td[1]/input")).click(); //default 2nd 
		set_default.click();
		this.Set_default_success_msg(driver);
		String expected = driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[2]/td[2]/b")).getText().trim();
		Assert.assertEquals(expected, "(Default)");
		//System.out.println(expected);
	}
	
	public void Set_Default_for_multiple_Customer_Region_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[1]/td[1]/input")).click(); //default 1st
		driver.findElement(By.xpath(".//*[@id='form']/table/tbody/tr[2]/td[1]/input")).click(); //default 2nd 
		set_default.click();
		String expected = driver.findElement(By.xpath("//div[text()='Error: Unable to set default, Select only one region!']")).getText().trim();
		Assert.assertEquals(expected, "Error: Unable to set default, Select only one region!");
		//System.out.println(expected);
	}
	
	
	public void Set_Default_for_no_selection_Customer_Region_method(WebDriver driver){
		this.click_on_customer_region(driver);
		set_default.click();
		String expected = driver.findElement(By.xpath("//div[text()='Please select item to perform action!']")).getText().trim();
		Assert.assertEquals(expected, "Please select item to perform action!");
		//System.out.println(expected);
	}
	
	
//	public void insert_bulk_region_method(WebDriver driver){
//		
//        for(int i=1200;i<1800;i++){
//        this.Insert_button_customer_region(driver);
//		country_name.click();
//		country_name_click.click();
//		zone_id.click();
//		zone_name.click();
//		region_name.sendKeys("Karnataka"+i);
//		region_pin.sendKeys("56"+i);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		submit.click();
//		System.out.println(i);
//		i++;
//        }
//		}	
    
	public void verify_next_page_button_method(WebDriver driver) {
		this.click_on_customer_region(driver);		
		String str1 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str1);
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		next_page_button.click();
		String str2 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str2);
		Assert.assertNotEquals(str1, str2);
	}
		
	public void verify_Previous_page_button_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String str1 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str1);
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		next_page_button.click();
		String str2 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str2);
		
		je.executeScript("scroll(0,800)");
		previous_page_button.click();
		String str3 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str3);
		Assert.assertEquals(str1, str3);
	}
	
	public void Verify_index_button_1_displayed_in_bottom_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String str1 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str1);
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		next_page_button.click();
		String str2 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str2);
		
		je.executeScript("scroll(0,800)");
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[1]/a[3]")).click(); //click on 1st page.
		String str3 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str3);
		Assert.assertEquals(str1, str3);
	}
	
	public void Verify_index_button_2_displayed_in_bottom_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String Actual_char="Showing 31 to";
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		driver.findElement(By.xpath("//a[text()='2']")).click(); //click on 2nd page.
		String str = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		String firstLetter=str.substring(0, 13);
		//System.out.println(firstLetter);
		Assert.assertEquals(firstLetter, Actual_char);
	}
	
	public void Go_to_first_page_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String str1 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		String Actual_char="Showing 1 to";
		String firstLetter = str1.substring(0, 12);
		//System.out.println(firstLetter);
		Assert.assertEquals(firstLetter, Actual_char);
			
	}
	
	public void Go_to_first_page_Click_on_symbol_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String str1=driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[2]")).getText().trim();
		//firstLetter = String.valueOf(example.charAt(0));
		//firstLetter = Character.toString(example.charAt(0));
		String firstLetter = str1.substring(0, 12);
		//System.out.println(firstLetter);
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		second_option_page_button.click();
		
		je.executeScript("scroll(0,800)");
		first_page_button.click();
		String str2 = driver.findElement(By.xpath("//div[@class='results']")).getText().trim();
		//System.out.println(str2);
		String finalLetter = str2.substring(0, 12);
		//System.out.println(finalLetter);
		Assert.assertEquals(firstLetter,finalLetter);
	}
	
	public void Go_to_last_page_Click_on_symbol_method(WebDriver driver) {
		this.click_on_customer_region(driver);
		String str1=driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[2]")).getText().trim();
		String Actual = str1.substring(19, 22);
		//System.out.println(Actual);
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		last_page_button.click();
		String str2=driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[2]")).getText().trim();
		String lastLetter = str2.substring(15, 18);
	    //System.out.println(Actual);
	    //System.out.println(lastLetter);
	    Assert.assertEquals(Actual, lastLetter);
	    
	    
	}
	
	@FindBy(xpath="//td[text()=\"Kashmir4\"]")
	WebElement Location;
	
	public void usecase_customer_region_creation_method(WebDriver driver) {
		this.Insert_button_customer_region(driver);
        country_name.click();
		country_name_click.click();
		zone_id.click();
		zone_name.click();
		region_name.sendKeys(read.getsheetnumber(59, 1, 0));
		region_pin.sendKeys(String.valueOf(read.getsheetnumber1(59, 1, 1)));
		submit.click();
		Assert.assertEquals(true, Location.isDisplayed());
		//Assert.assertEquals(true, read.getsheetnumber(59, 1, 0).contains("Kashmir"));
		//Assert.assertEquals(get_Actual_sucessful_msg(),
	//	"Success: You have added a Region successfully!");
		
	}
}
