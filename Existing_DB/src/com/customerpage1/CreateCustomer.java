 package com.customerpage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class CreateCustomer extends BaseClass
{
	@FindBy(xpath = "//a[text()='Sales']")
	WebElement Sales;
	// By Catalog=By.xpath(".//*[@id='catalog']/a");

	@FindBy(xpath = "(//a[text()='Customers'])[1]")
	public WebElement Customertab;
	
	@FindBy(xpath = "(//a[text()='Customers'])[2]")
	public WebElement Customersel;
	
	@FindBy(xpath="(//a[@class='button'])[3]")
	public WebElement Insert;
	
	@FindBy(xpath="//input[@name='operator']")
	public WebElement Operator;
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement fname ;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lname;
	
	@FindBy(xpath="//input[@name='STBNO']")
	public WebElement stbno ;
	
	@FindBy(xpath="//input[@name='SCNO']")
	public WebElement cfno ;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email ;
	
	@FindBy(xpath="//input[@name='telephone']")
	public WebElement mobile ;

	@FindBy(xpath="//input[@name='password']")
	public WebElement pwd ;
	
	@FindBy(xpath="//input[@name='confirm']")
	public WebElement confirm;
	
	@FindBy(xpath="//select[@name='newsletter']")
	public WebElement newsletter;
	
	@FindBy(xpath="//select[@name='customer_group_id']")
	public WebElement customergroup ;
	
	@FindBy(xpath="//select[@name='status']")
	public WebElement status;
	
	@FindBy(xpath="//img[@src='view/image/add.png']")
	public WebElement addAddress;
	
	@FindBy(xpath="(//input[@name])[13]")
	public WebElement Afname;
	
	@FindBy(xpath="(//input[@name])[14]")
	public WebElement Alname;
	
	@FindBy(xpath="(//input[@name])[15]")
	public WebElement Aaddress1;
	
	@FindBy(xpath="(//input[@name])[16]")
	public WebElement Aaddress2;
	
	@FindBy(xpath="//select[@name=\"address[1][country_id]\"]")
	public WebElement country;
	
	@FindBy(xpath="//select[@name=\"address[1][zone_id]\"]")
	public WebElement state;
	
	@FindBy(xpath="(//input[@name])[17]")
	public WebElement city ;
	
	@FindBy(xpath="//select[@name=\"address[1][region_id]\"]")
	public WebElement Aregion;
	
	@FindBy(xpath="(//input[@name])[18]")
	public WebElement postal;
	
	@FindBy(xpath="//input[@class=\"radio\"]")
	public WebElement defaultset;
	
	@FindBy(xpath="(//a[@class='button'])[1]")
	public WebElement submit;
	
	@FindBy(xpath="(//a[@class='button'])[2]")
	public WebElement cancel;
	
	
	@FindBy(xpath="(//a[@class='button'])[1]")
	public WebElement succesfull;
	
	@FindBy(xpath="//div[@class='success']")
    public WebElement success;
	
	@FindBy(xpath="//a[@id='address-1']")
	WebElement Address2;
	
	public String Customer_Add_Assertion() {
		return success.getText();
	}
	
	
	//Error message for empty
	
	@FindBy(xpath="(//span[text()='First Name must be between 1 and 32 characters!'])[1]")
	WebElement EmptyFname;
	
	@FindBy(xpath="(//span[text()='Last Name must be between 1 and 32 characters!'])[1]")
	WebElement EmptyLname;
	
	@FindBy(xpath="//span[text()='Length should be 14 and Alphanumeric!']")
	WebElement EmptyStbno;
	
	@FindBy(xpath="//span[text()='Should be only digits of length 12!']")
	WebElement EmptyCfno;
	
	@FindBy(xpath="//span[text()='E-Mail Address does not appear to be valid!']")
	WebElement EmptyEmail;
	
	@FindBy(xpath="//span[text()='Telephone must be of 10 digits!']")
	WebElement EmptyMobileno;
	
	@FindBy(xpath="//span[text()='Password must be between 4 and 20 characters!']")
	WebElement EmptyPwd;
	
	@FindBy(xpath="//span[text()='Password and password confirmation do not match!']")
	WebElement EmptyCPwd;
	
	@FindBy(xpath="(//span[text()='First Name must be between 1 and 32 characters!'])[2]")
	WebElement EmptyAFname;
	
	@FindBy(xpath="(//span[text()='Last Name must be between 1 and 32 characters!'])[2]")
	WebElement EmptyALname;
	
	@FindBy(xpath="//span[text()='Address 1 must be between 3 and 128 characters and only spaces are not allowed!']")
	WebElement EmptyAddress;
	
	@FindBy(xpath="//span[text()='Please select a country!']")
	WebElement Emptycountry;
	
	@FindBy(xpath="//span[text()='City must be between 2 and 128 characters!']")
	WebElement Emptycity;
	
	
	//For Invalid Data 
	@FindBy(xpath="(//span[text()='Special Characters not allowed!'])[1]")
	WebElement InvalidFname;
	
	@FindBy(xpath="(//span[text()='Special Characters not allowed!'])[2]")
	WebElement InvalidLname;
	
		
	//if it is character use thsi asseration
	@FindBy(xpath="//span[text()='Telephone must be of 10 digits & accepts only digits!']")
	WebElement InvaidMobile;
				
	//Want to pass some valid password to check this assertion
	@FindBy(xpath="//span[text()='Password and password confirmation do not match!']")
	WebElement Invaidcpwd;
	
	@FindBy(xpath="//span[text()='Please select a country!']")
	WebElement Invaidaddress;
	
	
	//For Duplicates assertion
	
	@FindBy(xpath="//span[text()='Warning: STBNO is already registered!']")
	WebElement dupstb;
	
	@FindBy(xpath="//span[text()='Warning: CFNO is already registered!']")
	WebElement dupcfno;
	
	@FindBy(xpath="//span[text()='Warning: E-Mail Address is already registered!']")
	WebElement dupemail;
			
	
	@FindBy(xpath="//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement Failed;
	
	ExcelReader read = new ExcelReader();
	public void createcustomer(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Insert.click();
		fname.sendKeys(read.getsheetnumber(14, 1, 0));
		lname.sendKeys(read.getsheetnumber(14, 1, 1));
		stbno.sendKeys(read.getsheetnumber(14, 1, 2));
		cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 3)));
		email.sendKeys(read.getsheetnumber(14, 1, 4));
		mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 5)));
		pwd.sendKeys(read.getsheetnumber(14, 1, 6));
		confirm.sendKeys(read.getsheetnumber(14, 1, 7));
		addAddress.click();
		Afname.sendKeys(read.getsheetnumber(14, 1, 0));
		Alname.sendKeys(read.getsheetnumber(14, 1, 1));
		Aaddress1.sendKeys(read.getsheetnumber(17, 1, 0));
		Aaddress2.sendKeys(read.getsheetnumber(17, 1, 1));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		Select sel1 = new Select(state);
		sel1.selectByVisibleText("Karnataka");
		city.sendKeys(read.getsheetnumber(17, 1, 2));
		Select sel2 = new Select(Aregion);
		sel2.selectByIndex(1);
		postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
		submit.click();
		sAssert.assertEquals("Success: You have added customer successfully!", Customer_Add_Assertion(), "Customer Creation Assertion Failed");
		sAssert.assertAll();
		
	}
	
	
	//To validate all fields without entering any data 
	public void emptyfields(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Insert.click();
		addAddress.click();
		submit.click();
		sAssert.assertEquals("First Name must be between 1 and 32 characters!", EmptyFname.getText(), "Firstname  Assertion Failed");
		sAssert.assertEquals("Last Name must be between 1 and 32 characters!", EmptyLname.getText(), "Lastname  Assertion Failed");
		sAssert.assertEquals("Length should be 14 and Alphanumeric!", EmptyStbno.getText(), "STB Assertion Failed");
		sAssert.assertEquals("Should be only digits of length 12!", EmptyCfno.getText(), "Cfno Assertion Failed");
		//sAssert.assertEquals("E-Mail Address does not appear to be valid!", EmptyEmail.getText(), "Email Assertion Failed");
		sAssert.assertEquals("Telephone must be of 10 digits!", EmptyMobileno.getText(), "Mobile Assertion Failed");
		sAssert.assertEquals("Password must be between 4 and 20 characters!", EmptyPwd.getText(), "Password Assertion Failed");
		//sAssert.assertEquals("Password and password confirmation do not match!", Invaidcpwd.getText(), "CPassword Assertion Failed");
		Address2.click();
		sAssert.assertEquals("First Name must be between 1 and 32 characters!", EmptyAFname.getText(), "AFirstname  Assertion Failed");
		sAssert.assertEquals("Last Name must be between 1 and 32 characters!", EmptyALname.getText(), "ALastname  Assertion Failed");
		sAssert.assertEquals("Address 1 must be between 3 and 128 characters and only spaces are not allowed!", EmptyAddress.getText(), "Address Assertion Failed");
		sAssert.assertEquals("Please select a country!", Emptycountry.getText(), "Country Assertion Failed");
		sAssert.assertEquals("City must be between 2 and 128 characters!", Emptycity.getText(), "City Assertion Failed");
		submit.click();
		sAssert.assertEquals("Warning: Please check the form carefully for errors!", Failed.getText(), "Form Assertion Failed");
		sAssert.assertAll();
	}
	
	//To Validate Invalid data 
	public void invalidfields(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Insert.click();
		fname.sendKeys(read.getsheetnumber(14, 2, 0));
		lname.sendKeys(read.getsheetnumber(14, 2, 1));
		stbno.sendKeys(read.getsheetnumber(14, 2, 2));
		cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 2, 3)));
		email.sendKeys(read.getsheetnumber(14, 2, 4));
		mobile.sendKeys(read.getsheetnumber(14, 2, 5));
		pwd.sendKeys(read.getsheetnumber(14, 2, 6));
		confirm.sendKeys(read.getsheetnumber(14, 2, 7));
		addAddress.click();
		Afname.sendKeys(read.getsheetnumber(14, 2, 0));
		Alname.sendKeys(read.getsheetnumber(14, 2, 1));
		submit.click();
		sAssert.assertEquals("Special Characters not allowed!", InvalidFname.getText(), "Firstname  Assertion Failed");
		sAssert.assertEquals("Special Characters not allowed!", InvalidLname.getText(), "Lastname  Assertion Failed");
		sAssert.assertEquals("Length should be 14 and Alphanumeric!", EmptyStbno.getText(), "STB Assertion Failed");
		sAssert.assertEquals("Should be only digits of length 12!", EmptyCfno.getText(), "Cfno Assertion Failed");
		//sAssert.assertEquals("E-Mail Address does not appear to be valid!", EmptyEmail.getText(), "Email Assertion Failed");
		sAssert.assertEquals("Telephone must be of 10 digits & accepts only digits!", InvaidMobile.getText(), "Mobile Assertion Failed");
		sAssert.assertEquals("Password must be between 4 and 20 characters!", EmptyPwd.getText(), "Password Assertion Failed");
		Address2.click();
		sAssert.assertEquals("Address 1 must be between 3 and 128 characters and only spaces are not allowed!", EmptyAddress.getText(), "Address Assertion Failed");
		sAssert.assertEquals("Please select a country!", Emptycountry.getText(), "Country Assertion Failed");
		sAssert.assertEquals("City must be between 2 and 128 characters!", Emptycity.getText(), "City Assertion Failed");
		sAssert.assertAll();
	}
	
	//To Validate Duplicate values
	public void duplicates(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Insert.click();
		fname.sendKeys(read.getsheetnumber(14, 1, 0));
		lname.sendKeys(read.getsheetnumber(14, 1, 1));
		stbno.sendKeys(read.getsheetnumber(14, 1, 2));
		cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 3)));
		email.sendKeys(read.getsheetnumber(14, 1, 4));
		mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 5)));
		pwd.sendKeys(read.getsheetnumber(14, 1, 6));
		confirm.sendKeys(read.getsheetnumber(14, 1, 7));
		addAddress.click();
		Afname.sendKeys(read.getsheetnumber(14, 1, 0));
		Alname.sendKeys(read.getsheetnumber(14, 1, 1));
		Aaddress1.sendKeys(read.getsheetnumber(17, 1, 0));
		Aaddress2.sendKeys(read.getsheetnumber(17, 1, 1));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		Select sel1 = new Select(state);
		sel1.selectByVisibleText("Karnataka");
		city.sendKeys(read.getsheetnumber(17, 1, 2));
		Select sel2 = new Select(Aregion);
		sel2.selectByIndex(1);
		postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
		submit.click();
		sAssert.assertEquals("Warning: STBNO is already registered!", dupstb.getText(), "STB Assertion Failed");
		sAssert.assertEquals("Warning: CFNO is already registered!", dupcfno.getText(), "Cfno Assertion Failed");
		//sAssert.assertEquals("Warning: E-Mail Address is already registered!", dupemail.getText(), "Email Assertion Failed");
		sAssert.assertAll();
	}
	
	//Change the Xpath for Editing Customer
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement Edit;
	
	@FindBy(xpath="//span[@id=\"address-add\"]")
	WebElement addaddress;
	
	@FindBy(xpath="//a[@id='address-1']")
	WebElement exitaddress;
	
	@FindBy(xpath="//div[text()=\"Success: You have modified customers!\"]")
	WebElement editsuccesfull;
	

	
	@FindBy(xpath="//input[@name='filter_name']")
	WebElement Searchedit;
	
	//To check Edit Functionality 1
	public void editcustomer(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Searchedit.sendKeys(read.getsheetnumber(14, 1, 0));
		Edit.click();
		submit.click();
		//sAssert.assertEquals("Add Address", addaddress.getText(), "Edit Assertion Failed");
		sAssert.assertEquals("Success: You have modified customers!", editsuccesfull.getText(), "EditSuccessfull Assertion Failed");
		sAssert.assertAll();
	}
	//To check different customer succesfully 2
	public void editcustomersuccesfull(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		Edit.click();
		submit.click();
		sAssert.assertEquals("Success: You have modified customers!", editsuccesfull.getText(), "EditSuccessfull Assertion Failed");
		sAssert.assertAll();
	}
	
	//Edit customer with valid data
	public void editvaliddata(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		CustomerName.sendKeys(read.getsheetnumber(14, 4, 0));
		SearchOperation.click();
		Edit.click();
		fname.clear();
		fname.sendKeys(read.getsheetnumber(14, 4, 0));
		lname.clear();
		lname.sendKeys(read.getsheetnumber(14, 4, 1));
		stbno.clear();
		stbno.sendKeys(read.getsheetnumber(14, 4, 2));
		cfno.clear();
		cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 4, 3)));
		email.clear();
		email.sendKeys(read.getsheetnumber(14, 4, 4));
		mobile.clear();
		mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 4, 5)));
		pwd.clear();
		pwd.sendKeys(read.getsheetnumber(14, 4, 6));
		confirm.clear();
		confirm.sendKeys(read.getsheetnumber(14, 4, 7));
		//addAddress.click();
		exitaddress.click();
		Afname.clear();
		Afname.sendKeys(read.getsheetnumber(14, 4, 0));
		Alname.clear();
		Alname.sendKeys(read.getsheetnumber(14, 4, 1));
		Aaddress1.clear();
		Aaddress1.sendKeys(read.getsheetnumber(17, 3, 0));
		Aaddress2.clear();
		Aaddress2.sendKeys(read.getsheetnumber(17, 3, 1));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		Select sel1 = new Select(state);
		sel1.selectByVisibleText("Karnataka");
		city.clear();
		city.sendKeys(read.getsheetnumber(17, 3, 2));
		Select sel2 = new Select(Aregion);
		sel2.selectByIndex(2);
		postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 3, 3)));
		submit.click();
		sAssert.assertEquals("Success: You have modified customers!", editsuccesfull.getText(), "Edit Successfull Assertion Failed");
		sAssert.assertAll();
		
	}
	
	//Edit without adding any data 
	public void editemptydata(WebDriver driver)
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.moveToElement(Customertab);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(Customersel).build().perform();
		CustomerName.sendKeys(read.getsheetnumber(14, 4, 0));
		SearchOperation.click();
		Edit.click();
		fname.clear();
		lname.clear();
		stbno.clear();
		cfno.clear();
		email.clear();
		mobile.clear();
		pwd.clear();
		confirm.clear();
		exitaddress.click();
		Afname.clear();
		Alname.clear();
		Aaddress1.clear();
		Aaddress2.clear();
		Select sel = new Select(country);
	    sel.selectByIndex(0);
		Select sel1 = new Select(state);
		sel.selectByIndex(0);
		city.clear();
		Select sel2 = new Select(Aregion);
		sel.selectByIndex(0);
		submit.click();
		sAssert.assertEquals("First Name must be between 1 and 32 characters!", EmptyFname.getText(), "Firstname  Assertion Failed");
		sAssert.assertEquals("Last Name must be between 1 and 32 characters!", EmptyLname.getText(), "Lastname  Assertion Failed");
		sAssert.assertEquals("Length should be 14 and Alphanumeric!", EmptyStbno.getText(), "STB Assertion Failed");
		sAssert.assertEquals("Should be only digits of length 12!", EmptyCfno.getText(), "Cfno Assertion Failed");
	//	sAssert.assertEquals("E-Mail Address does not appear to be valid!", EmptyEmail.getText(), "Email Assertion Failed");
		sAssert.assertEquals("Telephone must be of 10 digits!", EmptyMobileno.getText(), "Mobile Assertion Failed");
		//sAssert.assertEquals("Password must be between 4 and 20 characters!", EmptyPwd.getText(), "Password Assertion Failed");
		//sAssert.assertEquals("Password and password confirmation do not match!", Invaidcpwd.getText(), "CPassword Assertion Failed");
		exitaddress.click();
		sAssert.assertEquals("First Name must be between 1 and 32 characters!", EmptyAFname.getText(), "AFirstname  Assertion Failed");
		sAssert.assertEquals("Last Name must be between 1 and 32 characters!", EmptyALname.getText(), "ALastname  Assertion Failed");
		sAssert.assertEquals("Address 1 must be between 3 and 128 characters and only spaces are not allowed!", EmptyAddress.getText(), "Address Assertion Failed");
		sAssert.assertEquals("Please select a country!", Emptycountry.getText(), "Country Assertion Failed");
		sAssert.assertEquals("City must be between 2 and 128 characters!", Emptycity.getText(), "City Assertion Failed");
		sAssert.assertAll();
	}
	
	
	//Edit with invalid data 
		public void editinvaliddata(WebDriver driver)
		{
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			CustomerName.sendKeys(read.getsheetnumber(14, 4, 0));
			SearchOperation.click();
			Edit.click();
			fname.clear();
			lname.clear();
			stbno.clear();
			cfno.clear();
			email.clear();
			mobile.clear();
			pwd.clear();
			confirm.clear();
			fname.sendKeys(read.getsheetnumber(14, 2, 0));
			lname.sendKeys(read.getsheetnumber(14, 2, 1));
			stbno.sendKeys(read.getsheetnumber(14, 2, 2));
			cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 2, 3)));
			email.sendKeys(read.getsheetnumber(14, 2, 4));
			mobile.sendKeys(read.getsheetnumber(14, 2, 5));
			pwd.sendKeys(read.getsheetnumber(14, 2, 6));
			confirm.sendKeys(read.getsheetnumber(14, 2, 7));
			exitaddress.click();
			Afname.clear();
			Alname.clear();
			city.clear();
			Afname.sendKeys(read.getsheetnumber(14, 2, 0));
			Alname.sendKeys(read.getsheetnumber(14, 2, 1));
			
			submit.click();
			sAssert.assertAll();
			sAssert.assertEquals("Special Characters not allowed!", InvalidFname.getText(), "Firstname  Assertion Failed");
			sAssert.assertEquals("Special Characters not allowed!", InvalidLname.getText(), "Lastname  Assertion Failed");
			sAssert.assertEquals("Length should be 14 and Alphanumeric!", EmptyStbno.getText(), "STB Assertion Failed");
			sAssert.assertEquals("Should be only digits of length 12!", EmptyCfno.getText(), "Cfno Assertion Failed");
		//	sAssert.assertEquals("E-Mail Address does not appear to be valid!", EmptyEmail.getText(), "Email Assertion Failed");
			sAssert.assertEquals("Telephone must be of 10 digits & accepts only digits!", InvaidMobile.getText(), "Mobile Assertion Failed");
			sAssert.assertEquals("Password must be between 4 and 20 characters!", EmptyPwd.getText(), "Password Assertion Failed");
			exitaddress.click();
			//sAssert.assertEquals("Address 1 must be between 3 and 128 characters and only spaces are not allowed!", EmptyAddress.getText(), "Address Assertion Failed");
			//sAssert.assertEquals("Please select a country!", Emptycountry.getText(), "Country Assertion Failed");
			sAssert.assertEquals("City must be between 2 and 128 characters!", Emptycity.getText(), "City Assertion Failed");
		}
			
		
		@FindBy(xpath="//div[text()='Error: Invalid enrties']")
		WebElement InvalidEntries;
		
		
		//For Duplicate just taking allready existing customer and editing with just created customer
		
		@FindBy(xpath="(//a[text()='Edit'])[3]")
		WebElement Edi1;
		
		//To Validate Duplicate values
		public void editduplicates(WebDriver driver)
		{
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Edi1.click();
			fname.clear();
			lname.clear();
			stbno.clear();
			cfno.clear();
			email.clear();
			mobile.clear();
			pwd.clear();
			confirm.clear();
			fname.sendKeys(read.getsheetnumber(14, 1, 0));
			lname.sendKeys(read.getsheetnumber(14, 1, 1));
			stbno.sendKeys(read.getsheetnumber(14, 1, 2));
			cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 3)));
			email.sendKeys(read.getsheetnumber(14, 1, 4));
			mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 1, 5)));
			pwd.sendKeys(read.getsheetnumber(14, 1, 6));
			confirm.sendKeys(read.getsheetnumber(14, 1, 7));
			exitaddress.click();
			Afname.clear();
			Alname.clear();
			Aaddress1.clear();
			city.clear();
			Afname.sendKeys(read.getsheetnumber(14, 1, 0));
			Alname.sendKeys(read.getsheetnumber(14, 1, 1));
			Aaddress1.sendKeys(read.getsheetnumber(17, 1, 0));
			Aaddress2.sendKeys(read.getsheetnumber(17, 1, 1));
			Select sel = new Select(country);
			sel.selectByVisibleText("India");
			Select sel1 = new Select(state);
			sel1.selectByVisibleText("Karnataka");
			city.sendKeys(read.getsheetnumber(17, 1, 2));
			Select sel2 = new Select(Aregion);
			sel2.selectByIndex(1);
			postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
			submit.click();
			//sAssert.assertEquals("Error: Invalid enrties", InvalidEntries.getText(), "STB Duplicate Assertion Failed");
			
			sAssert.assertEquals("Warning: STBNO is already registered!", dupstb.getText(), "STB Assertion Failed");
			sAssert.assertEquals("Warning: CFNO is already registered!", dupcfno.getText(), "Cfno Assertion Failed");
		//	sAssert.assertEquals("Warning: E-Mail Address is already registered!", dupemail.getText(), "Email Assertion Failed");
			sAssert.assertAll();
		}
		
		//For multiple addreess
		
		@FindBy(xpath="//input[@name=\"address[2][firstname]\"]")
		WebElement Sfname;
		
		@FindBy(xpath="//input[@name=\"address[2][lastname]\"]")
		WebElement Slname;
		
		@FindBy(xpath="//input[@name=\"address[2][address_1]\" ]")
		WebElement Saddress;
		
		@FindBy(xpath="//input[@name=\"address[2][address_2]\"]")
		WebElement S1address;
		
		@FindBy(xpath="//select[@name=\"address[2][country_id]\"]")
		WebElement Scountry;
				
		@FindBy(xpath="//select[@name=\"address[2][zone_id]\"]")
		WebElement Sstate;
		
		@FindBy(xpath="//input[@name=\"address[2][city]\"]")
		WebElement Scity;
		
		@FindBy(xpath="//select[@name=\"address[2][region_id]\"]")
		WebElement Sregion;
		
		@FindBy(xpath="//input[@id=\"address[2][postcode]\"]")
		WebElement Spostal;
		
		@FindBy(xpath="//input[@class='radio']")
		WebElement Sdefault;
		
		@FindBy(xpath="//a[@id=\"address-2\"]")
		WebElement Sexitingaddress;
		
		@FindBy(xpath=".//*[@id='address-add']/img")
		WebElement Saddressclick;
		
		@FindBy(xpath=".//*[@id='address-2']/img")
		WebElement Sdelete;
		//Create customer with multiple address add data depends on new customer creation otherwise it'll fail
		public void customerwithsecondaddress(WebDriver driver)
		{
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Insert.click();
			fname.sendKeys(read.getsheetnumber(14, 7, 0));
			lname.sendKeys(read.getsheetnumber(14, 7, 1));
			stbno.sendKeys(read.getsheetnumber(14, 7, 2));
			cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 7, 3)));
			email.sendKeys(read.getsheetnumber(14, 7, 4));
			mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 7, 5)));
			pwd.sendKeys(read.getsheetnumber(14, 7, 6));
			confirm.sendKeys(read.getsheetnumber(14, 7, 7));
			
			addAddress.click();
			Afname.sendKeys(read.getsheetnumber(14, 7, 0));
			Alname.sendKeys(read.getsheetnumber(14, 7, 1));
			Aaddress1.sendKeys(read.getsheetnumber(17, 1, 1));
			Aaddress2.sendKeys(read.getsheetnumber(17, 1, 1));
			Select sel = new Select(country);
			sel.selectByVisibleText("India");
			Select sel1 = new Select(state);
			sel1.selectByVisibleText("Karnataka");
			city.sendKeys(read.getsheetnumber(17, 1, 2));
			Select sel2 = new Select(Aregion);
			sel2.selectByIndex(1);
			postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
			
			Saddressclick.click();
			//Sexitingaddress.click();
			Sfname.sendKeys(read.getsheetnumber(14, 1, 0));
			Slname.sendKeys(read.getsheetnumber(14, 1, 1));
			Saddress.sendKeys(read.getsheetnumber(17, 1, 0));
			S1address.sendKeys(read.getsheetnumber(17, 1, 1));
			Select s = new Select(Scountry);
			s.selectByVisibleText("India");
			Select s1 = new Select(Sstate);
			s1.selectByVisibleText("Karnataka");
			Scity.sendKeys(read.getsheetnumber(17, 1, 2));
			Select s2 = new Select(Sregion);
			s2.selectByIndex(1);
			Spostal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
			//JavascriptExecutor je =(JavascriptExecutor) driver;  //Scroll down
			//je.executeScript("scroll(0,400)");
			//Sdefault.click();
			//je.executeScript("scroll(0,-400)");  //Scroll up 
			submit.click();
			//sAssert.assertEquals("Success: You have modified customers!", editsuccesfull.getText(), "EditSuccessfull Assertion Failed");
			//sAssert.assertAll();
			//cancel.click();
			Assert.assertEquals("Success: You have added a new User successfully!", Customer_Add_Assertion(), "Customer Creation Assertion Failed");
			sAssert.assertAll();
		}
		
		//Delete second address in customer page add data
		public void customerdeletesecondaddress(WebDriver driver)
		{
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Insert.click();
			fname.sendKeys(read.getsheetnumber(14, 8, 0));
			lname.sendKeys(read.getsheetnumber(14, 8, 1));
			stbno.sendKeys(read.getsheetnumber(14, 8, 2));
			cfno.sendKeys(String.valueOf(read.getsheetnumber2(14, 8, 3)));
			email.sendKeys(read.getsheetnumber(14, 8, 4));
			mobile.sendKeys(String.valueOf(read.getsheetnumber2(14, 8, 5)));
			pwd.sendKeys(read.getsheetnumber(14, 8, 6));
			confirm.sendKeys(read.getsheetnumber(14, 8, 7));
			addAddress.click();
			Afname.sendKeys(read.getsheetnumber(14, 8, 0));
			Alname.sendKeys(read.getsheetnumber(14, 8, 1));
			Aaddress1.sendKeys(read.getsheetnumber(17, 1, 1));
			Aaddress2.sendKeys(read.getsheetnumber(17, 1, 1));
			Select sel = new Select(country);
			sel.selectByVisibleText("India");
			Select sel1 = new Select(state);
			sel1.selectByVisibleText("Karnataka");
			city.sendKeys(read.getsheetnumber(17, 1, 2));
			Select sel2 = new Select(Aregion);
			sel2.selectByIndex(1);
			postal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
			Saddressclick.click();
			//Sexitingaddress.click();
			Sfname.sendKeys(read.getsheetnumber(14, 8, 0));
			Slname.sendKeys(read.getsheetnumber(14, 8, 1));
			Saddress.sendKeys(read.getsheetnumber(17, 1, 0));
			S1address.sendKeys(read.getsheetnumber(17, 1, 1));
			Select s = new Select(Scountry);
			s.selectByVisibleText("India");
			Select s1 = new Select(Sstate);
			s1.selectByVisibleText("Karnataka");
			Scity.sendKeys(read.getsheetnumber(17, 1, 2));
			Select s2 = new Select(Sregion);
			s2.selectByIndex(1);
			Spostal.sendKeys(String.valueOf(read.getsheetnumber1(17, 1, 3)));
			Sdelete.click();
			//Sdefault.click();
			submit.click();
			Assert.assertEquals("Success: You have added a new User successfully!", Customer_Add_Assertion(), "Customer Creation Assertion Failed");
			//sAssert.assertEquals("Success: You have modified customers!", editsuccesfull.getText(), "EditSuccessfull Assertion Failed");
			sAssert.assertAll();
			
		}
		
		//Approving elements
		
		@FindBy(xpath="//a[text()='Approve']")
		WebElement Approval;
		
		@FindBy(xpath="//select[@name=\"filter_approved\"]")
		WebElement filter;
		
		@FindBy(xpath="//a[text()='Search']")
		WebElement serch;
		
		@FindBy(xpath="//a[text()='Search']")
		WebElement yes;
		
		@FindBy(xpath="(//td[text()='No']/following::input[@id=\"cust_check\"])[4]")
		WebElement no;
		
		@FindBy(xpath="//div[text()='Please select customer to approve!']")
		WebElement slectapporvederrormsg;
		
		//change allways number for selecting no
		@FindBy(xpath="(//input[@id=\"cust_check\"])[1]")
        WebElement checkin;		
		
		@FindBy(xpath="//div[text()='You have approved 1 accounts!']")
		WebElement Approved;
		
		@FindBy(xpath="//div[text()='You have approved 0 accounts! But Unable to send mail !']")
		WebElement NotApproved;
		
		
		
		
		//To validate Approve customer with select and without select
		public void ApporveCustomer(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			StbID.clear();
			Select sel=new Select(filter);
			sel.selectByIndex(1);
			SearchOperation.click();
			checkin.click();
			Approval.click();
			Assert.assertEquals("You have approved 0 accounts! But Unable to send mail !", NotApproved.getText(), "Approval Failed");
		
		}
		
		public void ApporveCustomer1(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			act.click(Customersel).build().perform();
			StbID.clear();
			Select sel=new Select(filter);
			sel.selectByIndex(2);
			SearchOperation.click();
			checkin.click();
			Approval.click();
			Assert.assertEquals("You have approved 1 accounts!", Approved.getText(), "Approval1 Failed");
		
		}
		
		//Without Selecting any customer try to approve
		public void Approvelfailure(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Approval.click();
			Assert.assertEquals("Please select customer to approve!" , slectapporvederrormsg.getText() ,"Select Approval Failed" );
		
		}
		
		
		//For Search operation elements
		
		
		@FindBy(xpath="//input[@name=\"filter_customer_unique_id\"]")
		WebElement CustomerNo;
		
		@FindBy(xpath="//input[@name=\"filter_name\"]")
		WebElement CustomerName;
		
		@FindBy(xpath="//input[@name=\"filter_stb\"]")
		WebElement StbID;
		
		@FindBy(xpath="//select[@name=\"filter_operator\"]")
		WebElement Oprator;
		
		@FindBy(xpath="//select[@name=\"filter_customer_group_id\"]")
		WebElement CustomerGroup;
		
		@FindBy(xpath="//select[@name=\"filter_status\"]")
		WebElement Status;
		
		
		@FindBy(xpath="//select[@name=\"filter_approved\"]")
		WebElement Appoved3;
		
		@FindBy(xpath="//select[@name=\"filter_approved\"]")
		WebElement Date;
		
		@FindBy(xpath="(//option[@value=\"\"])[17]")
		WebElement PleaseSelect;
		
		@FindBy(xpath="(//option[@value=\"0\"])[17]")
		WebElement PleaseSelectDefault;
		
		@FindBy(xpath="(//a[@class='button'])[4]")
        WebElement SearchOperation;
		
		@FindBy(xpath="//a[text()='Edit']")
		WebElement Successfullsearch;
		
		@FindBy(xpath="//td[text()='No results!']")
		WebElement NoResults;
		
		//Search test casess
		
		public void SearchwithNO(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			CustomerNo.sendKeys(String.valueOf(read.getsheetnumber2(13, 1, 0)));
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		public void SearchwithName(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			CustomerNo.clear();
			CustomerName.sendKeys(read.getsheetnumber(13, 1, 1));
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
				
		public void SearchwithSTBID(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			StbID.sendKeys(read.getsheetnumber(13, 1, 2));
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		
		public void SearchwithOperator(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Select ope=new Select(Oprator);
			ope.selectByIndex(1);
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		public void SearchwithGroup(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Select ope=new Select(CustomerGroup);
			ope.selectByIndex(1);
			//ope.selectByVisibleText("VIP");
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		
		public void SearchwithStatus(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Select  sel=new Select(Status);
			sel.selectByIndex(1);
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		public void SearchwithApproved(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
            Select sel = new Select(Appoved3);
            sel.selectByIndex(1);
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		public void SearchwithDate(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			Date.sendKeys(String.valueOf(read.getsheetnumber2(13, 1, 3)));
			SearchOperation.click();
		    Assert.assertEquals("Edit" , Successfullsearch.getText() ,"Search Failed" );
		
		}
		
		
		public void IavalidSearch(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.moveToElement(Customertab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(Customersel).build().perform();
			CustomerNo.sendKeys(String.valueOf(read.getsheetnumber2(13, 4, 0)));
			CustomerName.sendKeys(read.getsheetnumber(13, 4, 1));
			StbID.sendKeys(read.getsheetnumber(13, 4, 2));
			SearchOperation.click();
			//Date.sendKeys(read.getsheetnumber(13, 1, 3));
			Assert.assertEquals("No results!" , NoResults.getText() ,"InValidSearch Failed" );
		}
		
		//Takes screenshot for all tabs	address add		
		public void Screenshot_of_All_Tab(String Method){	
			 TakeScreenShoot.TakeScreenshot(Method);
			 exitaddress.click();	
			 TakeScreenShoot.TakeScreenshot(Method);
			 Sexitingaddress.click();
			 TakeScreenShoot.TakeScreenshot(Method);
			
		}

		//Takes screenshot for all tabs	for add custome and edit customer
				public void Screenshot_of_All_Tab1(String Method){	
					 TakeScreenShoot.TakeScreenshot(Method);
					 exitaddress.click();	
					 TakeScreenShoot.TakeScreenshot(Method);
					 				
				}
				//Takes screenshot for all tabs	for customer approve and search	
				public void Screenshot_of_All_Tab2(String Method){	
					 TakeScreenShoot.TakeScreenshot(Method);
					 
					 				
				}


				 @FindBy(xpath="(//a[@class='top'])[10]")
				    WebElement StoreFont;
				 
				 @FindBy(xpath="(//select)[5]")
				 WebElement LogintoStore;
				 
				 @FindBy(xpath=".//*[@id='welcome']/a[1]")
				 WebElement loginName;
				 
				public void usecase_createcustomer(WebDriver driver)
				{
					SoftAssert sAssert = new SoftAssert();
					Actions act=new Actions(driver);
					act.moveToElement(Sales).perform();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					act.moveToElement(Customertab);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					act.click(Customersel).build().perform();
					Insert.click();
					fname.sendKeys(read.getsheetnumber(65, 1, 0));
					lname.sendKeys(read.getsheetnumber(65, 1, 1));
					stbno.sendKeys(read.getsheetnumber(65, 1, 2));
					cfno.sendKeys(String.valueOf(read.getsheetnumber2(65, 1, 3)));
					email.sendKeys(read.getsheetnumber(65, 1, 4));
					mobile.sendKeys(String.valueOf(read.getsheetnumber2(65, 1, 5)));
					pwd.sendKeys(read.getsheetnumber(65, 1, 6));
					confirm.sendKeys(read.getsheetnumber(65, 1, 7));
					addAddress.click();
					Afname.sendKeys(read.getsheetnumber(65, 1, 0));
					Alname.sendKeys(read.getsheetnumber(65, 1, 1));
					Aaddress1.sendKeys(read.getsheetnumber(66, 1, 0));
					Aaddress2.sendKeys(read.getsheetnumber(66, 1, 1));
					Select sel = new Select(country);
					sel.selectByVisibleText("India");
					Select sel1 = new Select(state);
					sel1.selectByVisibleText("Karnataka");
					city.sendKeys(read.getsheetnumber(66, 1, 2));
					Select sel2 = new Select(Aregion);
					sel2.selectByIndex(1);
					postal.sendKeys(String.valueOf(read.getsheetnumber1(66, 1, 3)));
					submit.click();
					sAssert.assertEquals("Success: You have added a new User successfully!", Customer_Add_Assertion(), "Customer Creation Assertion Failed");
					sAssert.assertAll();
				   
					Select store =new Select(LogintoStore);
				    store.selectByVisibleText("Default");
				    			
					child();
					sAssert.assertEquals("fname.sendKeys(read.getsheetnumber(65, 1, 0))", loginName.getText(), "Customer Creation Assertion Failed");
				    parent();
				  
				
					}
				



		


		
}
