package com.orders_page;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Orders_Page extends BaseClass
{
	@FindBy(xpath = "//a[text()='Sales']")
	WebElement Sales;
	
	@FindBy(xpath="(//a[text()='Orders'])[1]")
	WebElement order;
	
	@FindBy(xpath="//a[text()='Insert']")
	WebElement Insert;
	
	@FindBy(xpath="//a[text()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath=" (//input[@class=\"ui-autocomplete-input\"])[1] ")
	WebElement Customer ;
	
	
	//It'll be default if it requires change change by index or visible text
	@FindBy(xpath="//select[@id=\"customer_group_id\"]")
	WebElement SelectCustomerGroup ;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@name=\"telephone\"]")
	WebElement Telephone;
	
	@FindBy(xpath="//a[text()='Payment Details']")
	WebElement Payment;
	
	@FindBy(xpath="//select[@name=\"payment_address\"]")
	WebElement ChooseAddress;
	
	
	@FindBy(xpath="//input[@name=\"payment_firstname\"]")
	WebElement PayFirstname ;
	
	
	@FindBy(xpath="//input[@name=\"payment_lasttname\"]")
	WebElement PayLastName;
	
	@FindBy(xpath="//input[@name=\"payment_company\" ]")
	WebElement Company;
	
	@FindBy(xpath="//input[@name=\"payment_address_1\" ]")
	WebElement PayAddress;
	
	@FindBy(xpath="//input[@name=\"payment_address_2\" ]")
	WebElement PayAddress1;
	
	
	@FindBy(xpath="//input[@name=\"payment_city\"]")
	WebElement PayPostal;
	
	@FindBy(xpath="//select[@name=\"payment_country_id\"]")
	WebElement PayContry;
	
	@FindBy(xpath="//select[@name=\"payment_zone_id\"]")
	WebElement PayRegion;
	
	@FindBy(xpath="//a[text()='Installation Details']")
	WebElement InstalltionDetails;
	
	@FindBy(xpath="//select[@name=\"shipping_address\"]")
	WebElement ShippingAddress;
	
	@FindBy(xpath="//input[@name=\"shipping_firstname\"]")
	WebElement ShippingFirstname;
	
	@FindBy(xpath="//input[@name=\"shipping_lastname\"]")
	WebElement Shippinglastname;
	
	@FindBy(xpath="//input[@name=\"shipping_company\"]")
	WebElement ShippingCompany;
	
	@FindBy(xpath="//input[@name=\"shipping_address_1\"]")
	WebElement Shipping_Address1;
	
	@FindBy(xpath="//input[@name=\"shipping_address_2\"]")
	WebElement Shipping_Address2;
	
	
	@FindBy(xpath="//input[@name=\"shipping_city\"]")
	WebElement ShippingCity;
	
	@FindBy(xpath="//input[@name=\"shipping_postcode\"]")
	WebElement ShippingPostal;
	
	@FindBy(xpath="//select[@name=\"shipping_country_id\"]")
	WebElement ShippingCountry;
	
	@FindBy(xpath="//select[@name=\"shipping_zone_id\"]")
	WebElement ShippingRegion;
	
	@FindBy(xpath="//a[text()='Products']")
	WebElement AdddProduct;
	
	@FindBy(xpath="(//input[@class=\"ui-autocomplete-input\"])[2]")
	WebElement ChooseProduct;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home;
	
	
	@FindBy(xpath=".//*[@id='content']/div[2]/div[1]/h1")
	WebElement DashBoard;
	
	@FindBy(xpath="//div[text()='Warning: Not a registered Customer. First Name, Last Name and E-Mail should match!']")
	WebElement Warning;
	
	//@FindBy(xpath="//li[@class=\"ui-menu-item\"]")
	//WebElement AutoSelection;
	
	@FindBy(xpath = "//li[@class='ui-menu-item']")
	public List<WebElement> AutoSelection;
	
	@FindBy(xpath = "//a[@class=\"ui-corner-all\"]")
	public List<WebElement> AutoProduct;
	
	@FindBy(xpath="(//a[@class=\"ui-corner-all\"])[2]")
	WebElement Autoproduct1;
	
	
	
	@FindBy(xpath="(//select)[9]")
	WebElement Subscription;
	
	
	@FindBy(xpath="//a[@id=\"button-product\"]")
	WebElement Addproduct;
	
	@FindBy(xpath="//div[@class=\"success\"]")
	WebElement Successfulltotal;
	
	
	@FindBy(xpath="//a[text()='Totals']")
	WebElement Totals;
	
	@FindBy(xpath="//select[@name=\"shipping\"]")
	WebElement InstallationCharges;
	
	@FindBy(xpath="//select[@name=\"payment\"]")
	WebElement PaymentMethod;
	
	@FindBy(xpath="//select[@name=\"order_status_id\"]")
	WebElement OrderStatus;
	
	@FindBy(xpath="//a[@id=\"button-update\"]")
	WebElement UpdateTotals;
	
	@FindBy(xpath="(//div[@class=\"success\"])[2]")
	WebElement AddedPackageSuccesfully;
	
	@FindBy(xpath="//td[text()='Fax:']")
	WebElement Fax1;
	
	@FindBy(xpath="//a[text()='Print Invoice']")
	WebElement PrintInvoice;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//div[text()='Warning: Please select Order(s) to print Invoice!']")
	WebElement InvoiceErrorMessage;
	
	//To Check Order Options are present and Home Button Clicking working properly
	public void Select_Order()
	{
	SoftAssert sAssert = new SoftAssert();
	Actions act=new Actions(driver);
	act.moveToElement(Sales).perform();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	act.click(order).build().perform();
	Insert.click();
	Assert.assertEquals(true, Fax1.isDisplayed());
	Cancel.click();
	Assert.assertEquals(true, PrintInvoice.isDisplayed());
	Insert.click();
	Home.click();
	Assert.assertEquals(true, DashBoard.isDisplayed());
	sAssert.assertAll();
		
	}
	
	@FindBy(xpath="(//li[@class='ui-menu-item'])[23]")
    WebElement chooseproduct ;	
	
	
	//Successfully added subscription and package 
	public void Successfull_Select_Order()
	{
	SoftAssert sAssert = new SoftAssert();
	Actions act=new Actions(driver);
	act.moveToElement(Sales).perform();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	act.click(order).build().perform();
	Insert.click();
	Customer.sendKeys(read.getsheetnumber(31, 3, 1));
	AutoSelection.get(0).click();
	Payment.click();
	new Select(ChooseAddress).selectByIndex(1);
	InstalltionDetails.click();
	new Select(ShippingAddress).selectByIndex(1);
	AdddProduct.click();
	ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	chooseproduct.click();
	//AutoProduct.get(1);
	//Autoproduct1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	new Select(Subscription).selectByIndex(1);
	Addproduct.click();
	
	boolean alert = false ;
	if(alert==true)
	{
	Alert aler = driver.switchTo().alert();
	aler.accept();
	}
	
	Assert.assertEquals(true, Successfulltotal.isDisplayed());
	Totals.click();
	
	new Select(InstallationCharges).selectByIndex(1);
	new Select(PaymentMethod).selectByIndex(2);
	new Select(OrderStatus).selectByIndex(3);
	//UpdateTotals.click();
	Submit.click();
	Assert.assertEquals(true, AddedPackageSuccesfully.isDisplayed());
	sAssert.assertAll(); 
	}
	
	
	//Successfully added subscription and package in pre rental mode
	public void PreRental_Select_Order()
	{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 3, 1));
		AutoSelection.get(0).click();
		Payment.click();
		new Select(ChooseAddress).selectByIndex(1);
		InstalltionDetails.click();
		new Select(ShippingAddress).selectByIndex(1);
		AdddProduct.click();
		ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
		chooseproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(Subscription).selectByIndex(1);
		Addproduct.click();
		boolean alert = false;
		if(alert==true)
		{
		Alert aler = driver.switchTo().alert();
		aler.accept();
		}
		Assert.assertEquals(true, Successfulltotal.isDisplayed());
		Totals.click();
		new Select(InstallationCharges).selectByIndex(1);
		new Select(PaymentMethod).selectByIndex(2);
		new Select(OrderStatus).selectByIndex(3);
		//UpdateTotals.click();
		Submit.click();
		Assert.assertEquals(true, AddedPackageSuccesfully.isDisplayed());
		sAssert.assertAll();
	}
	
	
	//Wrongly added address and with subscription and package 
	@FindBy(xpath="//div[text()='Warning: Please check the form carefully for errors!']")
	WebElement ErrorMessage;
	
		public void UnSuccessfull_Select_Order()
		{ 
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 3, 1));
		AutoSelection.get(0).click();
		Payment.click();
		new Select(ChooseAddress).selectByIndex(1);
		InstalltionDetails.click();
		//new Select(ShippingAddress).selectByIndex(1);
		AdddProduct.click();
		ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
		chooseproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(Subscription).selectByIndex(1);
		Addproduct.click();
		boolean alert = false;
		if(alert==true)
		{
		Alert aler = driver.switchTo().alert();
		aler.accept();
		}
		//Assert.assertEquals(true, Successfulltotal.isDisplayed());
		Totals.click();
		Submit.click();
		Assert.assertEquals(true, ErrorMessage.isDisplayed());
		sAssert.assertAll();
		}
		
		@FindBy(xpath="//div[text()='Warning: Not a registered Customer. First Name, Last Name and E-Mail should match!']")
		WebElement Pageform;
		
		//InValid Customer and select(Special Character)
		public void InvalidOrder()
		{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 2, 1));
		Submit.click();
		Assert.assertEquals(true, Pageform.isDisplayed());
		sAssert.assertAll();
		}
		
		//Without Selecting address in Installation and Payment mode 
		
		@FindBy(xpath="//span[text()='First Name must be between 1 and 32 characters!']")
		WebElement ErrorFname;
		
		@FindBy(xpath="//div[text()='Warning: Please check the form carefully for errors!']")
		WebElement PageError;
		
		public void WithOutSelectingPayment()
		{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 3, 1));
		AutoSelection.get(0).click();
		Payment.click();
		//new Select(ChooseAddress).selectByIndex(1);
		InstalltionDetails.click();
		new Select(ShippingAddress).selectByIndex(1);
		AdddProduct.click();
		ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
		chooseproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(Subscription).selectByIndex(1);
		Addproduct.click();
		boolean alert = false;
		if(alert==true)
		{
		Alert aler = driver.switchTo().alert();
		aler.accept();
		}
		Totals.click();
		Submit.click();
		Assert.assertEquals(true, ErrorMessage.isDisplayed());
		sAssert.assertAll();
		}
		
		
		public void WithOutInstalltion()
		{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 3, 1));
		AutoSelection.get(0).click();
		Payment.click();
		new Select(ChooseAddress).selectByIndex(1);
		InstalltionDetails.click();
		//new Select(ShippingAddress).selectByIndex(1);
		AdddProduct.click();
		ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
		chooseproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(Subscription).selectByIndex(1);
		Addproduct.click();
		boolean alert = false;
		if(alert==true)
		{
		Alert aler = driver.switchTo().alert();
		aler.accept();
		}
		Totals.click();
		Submit.click();
		Assert.assertEquals(true, ErrorMessage.isDisplayed());
		sAssert.assertAll();
		}
		
		public void WithOutInstalltionPayment()
		{
		SoftAssert sAssert = new SoftAssert();
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		Insert.click();
		Customer.sendKeys(read.getsheetnumber(31, 3, 1));
		AutoSelection.get(0).click();
		Payment.click();
		InstalltionDetails.click();
		AdddProduct.click();
		ChooseProduct.sendKeys(read.getsheetnumber(31, 3, 2));
		chooseproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(Subscription).selectByIndex(1);
		Addproduct.click();
		boolean alert = false;
		if(alert==true)
		{
		Alert aler = driver.switchTo().alert();
		aler.accept();
		}
		Submit.click();
		Assert.assertEquals(true, ErrorMessage.isDisplayed());
		sAssert.assertAll();
		}
		
		//Invoice without selecting Orders
		public void Print_InVoice()
		{
		Actions act=new Actions(driver);
		act.moveToElement(Sales).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act.click(order).build().perform();
		PrintInvoice.click();
		Assert.assertEquals("Warning: Please select Order(s) to print Invoice!" ,InvoiceErrorMessage.getText(),"InVoice Assertion failed ");
		
		}
		
		@FindBy(xpath="html/body/div[1]/table[3]/tbody/tr[1]/td[4]/b")
		WebElement InVoiceTotal;
		
		@FindBy(xpath="(//input[@class='case'])[1]")
		WebElement SelectCheckbox;
		
		@FindBy(xpath=".//*[@id='checkAll']")
		WebElement SelectCheckboxAll;

		
		//InVoice for SIngle Order
		public void Print_InVoice_Single() {
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			SelectCheckbox.click();
			PrintInvoice.click();
			Assert.assertEquals(true, InVoiceTotal.isDisplayed());
			driver.navigate().back();
		}
		
		//InVoice for all Orders
		public void Print_InVoice_All() {
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			SelectCheckboxAll.click();
			PrintInvoice.click();
			Assert.assertEquals(true, InVoiceTotal.isDisplayed());
			driver.navigate().back();
		}
		
		//To View the Orders and elements
		
		@FindBy(xpath="(//a[text()='View'])[1]")
		WebElement View;
		
		@FindBy(xpath="//a[text()='Print Pdf']")
		WebElement Pdf;
		
		@FindBy(xpath=".//*[@id='tab-order']/table/tbody/tr[12]/td[1]")
		WebElement DateModified;
		
		@FindBy(xpath="//a[text()='Order Details']")
		WebElement Order_Status;
		
		@FindBy(xpath="//a[text()='Payment Details']")
		WebElement Payment_Details;
		
		@FindBy(xpath=".//*[@id='tab-payment']/table/tbody/tr[9]/td[1]")
		WebElement PaymentMethod1;
		
		@FindBy(xpath="//a[text()='Installation Details']")
		WebElement Installtion_Details;
		
		@FindBy(xpath=".//*[@id='tab-shipping']/table/tbody/tr[9]/td[1]")
		WebElement InstalltionCharges;
		
		@FindBy(xpath="//a[text()='Products']")
		WebElement ProductsSelection;
		
		@FindBy(xpath=".//*[@id='tab-product']/table/thead/tr/td[4]")
		WebElement PaymentTotal;
		
		@FindBy(xpath="//a[text()='History']")
		WebElement History;
		
		@FindBy(xpath="//textarea[@name=\"comment\"]")
		WebElement Comment;
		
		@FindBy(xpath="//a[text()='Add History']")
		WebElement AddComment;
		
		@FindBy(xpath="//div[text()='Success: You have modified orders!']")
        WebElement ModifiedOrders;		
		
		
		@FindBy(xpath="html/body/div/table[3]/tbody/tr[4]/td[1]/b")
		WebElement WindowTotal;
		
		
		//TO View all Orders
		public void ViewOrders() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			Assert.assertEquals(true, Pdf.isDisplayed());
			Order_Status.click();
			Assert.assertEquals(true, DateModified.isDisplayed());
			Payment_Details.click();
			Assert.assertEquals(true, PaymentMethod1.isDisplayed());
			Installtion_Details.click();
			Assert.assertEquals(true, InstalltionCharges.isDisplayed());
			ProductsSelection.click();
			Assert.assertEquals(true, PaymentTotal.isDisplayed());
			History.click();
			Assert.assertEquals(true, Comment.isDisplayed());
			Comment.sendKeys("Hellooooo Your payment is Succecceded");
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,400)");
			AddComment.click();
			je.executeScript("scroll(0,-400)");
			Assert.assertEquals("Success: You have modified orders!" ,ModifiedOrders.getText(),"ViewOrders Assertion failed ");
			sAssert.assertAll();
			//PrintInvoice.click();
		
			//Assert.assertEquals(true, PrintInvoice.isDisplayed());
			//Set handles = driver.getWindowHandles();
			//int count=handles.size();
			//System.out.println(count);
			//for (String handle1 : driver.getWindowHandles()) {
	       // 	System.out.println(handle1);
	       // 	driver.switchTo().window(handle1);
	       // 	Assert.assertEquals(true, WindowTotal.isDisplayed());
	        	//driver.close();
 
	        	}
		
		
		//To Check Valid and InValid Orders
		
		@FindBy(xpath="(//a[text()='Search'])[2]")
		WebElement Search;
		
		@FindBy(xpath="//input[@name='filter_order_id']")
		WebElement SearchID;
		
		@FindBy(xpath="//input[@class=\"ui-autocomplete-input\" ]")
		WebElement SearchName;
		
		@FindBy(xpath="//select[@name='filter_operator_id']")
		WebElement SerachOpertor;
		
		@FindBy(xpath="//select[@name=\"filter_order_status_id\"]")
		WebElement SearchStatus;
		
		@FindBy(xpath="//input[@name='filter_total']")
		WebElement SearchPrice;
		
		@FindBy(xpath="(//input[@class=\"date hasDatepicker\"])[1]")
		WebElement SearchDate;
		
		@FindBy(xpath="//a[text()='1']")
		WebElement SelectDate;
		
		@FindBy(xpath="//a[text()='1']")
		WebElement SelectDate1;
		
		@FindBy(xpath="//a[text()='1']")
		WebElement SelectDate2;
		
		@FindBy(xpath="(//input[@class=\"date hasDatepicker\"])[2]")
		WebElement SearchModifiedDate;
		
		@FindBy(xpath="//td[text()='No results!']")
		WebElement NoResults;
		
		@FindBy(xpath="//span[text()='Prev']")
		WebElement PreviousMonth;
		
		ExcelReader read = new ExcelReader();
		
		
		//TO Check Valid Orders
		public void SearchOrders() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
	        Search.click();	
	        Assert.assertEquals(true, PrintInvoice.isDisplayed());
	        SearchID.sendKeys(String.valueOf(read.getsheetnumber1(31, 1, 0)));
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        SearchID.clear();
	        SearchName.sendKeys(read.getsheetnumber(31, 1, 1));
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        SearchName.clear();
	        new Select(SerachOpertor).selectByIndex(1);
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        new Select(SerachOpertor).selectByIndex(0);
	        new Select(SearchStatus).selectByIndex(4);
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        new Select(SearchStatus).selectByIndex(0);
	        SearchPrice.sendKeys(String.valueOf(read.getsheetnumber1(31, 1, 2)));
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        SearchPrice.clear();
	        SearchDate.click();
	        PreviousMonth.click();
	        SelectDate.click();
	        Search.click();
	        Assert.assertEquals(true, View.isDisplayed());
	        sAssert.assertAll();
	        SearchDate.clear();
	        SearchModifiedDate.click();
	        SelectDate.click();
	        Search.click();
	        SearchModifiedDate.clear();
	        sAssert.assertAll();
		}
		
		
		//To Check Invalid Orders
		public void InValidSearchOrders() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
	        
	        SearchID.sendKeys(String.valueOf(read.getsheetnumber1(31, 2, 0)));
	        Search.click();
	        Assert.assertEquals(true, NoResults.isDisplayed());
	        SearchID.clear();
	        SearchName.sendKeys(read.getsheetnumber(31, 2, 1));
	        Search.click();
	        Assert.assertEquals(true, NoResults.isDisplayed());
	        SearchName.clear();
	        new Select(SearchStatus).selectByIndex(5);
	        Search.click();
	        Assert.assertEquals(true, NoResults.isDisplayed());
	        new Select(SearchStatus).selectByIndex(0);
	        SearchPrice.sendKeys(String.valueOf(read.getsheetnumber1(31, 2, 2)));
	        Search.click();
	        Assert.assertEquals(true, NoResults.isDisplayed());
	        SearchPrice.clear();
	        SearchDate.click();
	        SelectDate2.click();
	        Search.click();
	        Assert.assertEquals(true, NoResults.isDisplayed());
	        SearchDate.clear();
	        SearchModifiedDate.click();
	        SelectDate2.click();
	        Search.click();
	        SearchModifiedDate.clear();
	        sAssert.assertAll();
		}
		
		//Page Validation tests 
		@FindBy(xpath="//a[text()='>']")
		WebElement Forward;
		
		@FindBy(xpath="//a[text()='<']")
		WebElement Backward;
		
		@FindBy(xpath="//a[text()='>|']")
		WebElement LastPage;
		
		@FindBy(xpath="//a[text()='|<']")
		WebElement FirstPage;
		
		@FindBy(xpath="//a[text()='1']")
		WebElement OnePage;
		
		@FindBy(xpath="//a[text()='2']")
		WebElement SecondPage;
		
	
		//To Validate Page Navigation by > < keys
		public void PageValidation() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			Forward.click();
			Assert.assertEquals(true, Backward.isDisplayed());
			je.executeScript("scroll(0,800)");
			Backward.click();
			je.executeScript("scroll(0,800)");
			Assert.assertEquals(true, Forward.isDisplayed());
			je.executeScript("scroll(0,-800)");
			sAssert.assertAll();
		}
		
		
		//To Validate Page Navigation by >> << keys
		public void LastFirstPageValidation() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			LastPage.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Assert.assertEquals(true, Backward.isDisplayed());
			je.executeScript("scroll(0,800)");
			FirstPage.click();
			je.executeScript("scroll(0,800)");
			Assert.assertEquals(true, LastPage.isDisplayed());
			je.executeScript("scroll(0,-800)");
			sAssert.assertAll();
			
		}
		
		//To Validate Page Navigation by numeric  keys
		public void IntegerPageValidation() {
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			JavascriptExecutor je =(JavascriptExecutor) driver;
			je.executeScript("scroll(0,800)");
			SecondPage.click();
			Assert.assertEquals(true, OnePage.isDisplayed());
			je.executeScript("scroll(0,800)");
			OnePage.click();
			Assert.assertEquals(true, SecondPage.isDisplayed());
			je.executeScript("scroll(0,-800)");
			sAssert.assertAll();
			
		}
		
		
		//To Validate PrintPDf/InVoice ,Customer pages ,Store pages
		@FindBy(xpath="//a[text()='Print Pdf']")
		WebElement PrintPDF;
		
		@FindBy(linkText="http://42.104.126.159/sms/upload/")
		WebElement StoreURL;
		
		@FindBy(xpath=".//*[@id='tab-order']/table/tbody/tr[5]/td[2]/a")
		WebElement CustomerURL;
		
		@FindBy(linkText="Package10")
		WebElement PackageURL;
				
		@FindBy(xpath=".//*[@id='print']")
		WebElement PrintIcon;
		
		@FindBy(xpath="//a[text()='Cancel']")
		WebElement Cancelview;
		
		public void ValidatePdf() {
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			PrintPDF.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Assert.assertEquals(true, PrintIcon.isDisplayed());
			driver.navigate().back();
			Assert.assertEquals(true, PrintPDF.isDisplayed());
			
		}
		
			public void ValidateStoreurl()
			{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			StoreURL.click();
			String Storetitle=driver.getTitle();
			Assert.assertEquals("ByDesign" , Storetitle,"Store URL Asserations");
    		}
			
			public void ValidateCustomerurl()
			{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CustomerURL.click();
			String url=driver.getTitle();
			Assert.assertEquals("Customer" , url,"Customer URL Asserations");
			
    		}
			
			public void ValidatePackageurl()
			{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			AdddProduct.click();
			Assert.assertEquals(true, PackageURL.isDisplayed());
			//PackageURL.click();
			
    		}
		
			public void CancelView()
			{
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			View.click();
			Cancelview.click();
			Assert.assertEquals(true, PrintInvoice.isDisplayed());
						
    		}
			
			//For ScreenShot for respected tabs 
			
			
			
			//Take screenshot of respective tab
			public void Screenshot_single(String Method) {
				JavascriptExecutor je =(JavascriptExecutor) driver;
				je.executeScript("scroll(0,-400)");
				TakeScreenShoot.TakeScreenshot(Method);
			}
			
			//Take screenshot of respective tab
			public void Screenshot_single1(String Method) {
				TakeScreenShoot.TakeScreenshot(Method);
			}


			//To Take screenshot for all respective tabs
			public void Screenshot_of_All_Tab(String Method)
			{	
				boolean alert = true;
				if(alert==true)
				{
				Alert aler = driver.switchTo().alert();
				aler.accept();
				}
				 TakeScreenShoot.TakeScreenshot(Method);
				 Payment.click();
				 TakeScreenShoot.TakeScreenshot(Method);
				 InstalltionDetails.click();
				 TakeScreenShoot.TakeScreenshot(Method);
				 AdddProduct.click();
				 TakeScreenShoot.TakeScreenshot(Method);
				 Totals.click();
				 TakeScreenShoot.TakeScreenshot(Method);
				 
			}

			
			//USE CASE FOR ORDER INSERTION
			
			 @FindBy(xpath="(//a[@class='top'])[10]")
			    WebElement StoreFont;
			
			 @FindBy(xpath="//a[@class=\"ui-corner-all\"]")
				List<WebElement> Autoproduct2;
			 
			 @FindBy(xpath="//a[text()=\"product2\"]")
			 WebElement product;
			 			 
			// @FindBy(xpath="//a[text()=\"BigBoss\"]") //Want to change allways
			// WebElement Orderlist;
			 
			 @FindBy(xpath=".//*[@id='form']/table/tbody/tr[2]/td[3]")
			 WebElement Orderlist;
			 
			public void Usecase_Successfull_Select_Order()
			{
			SoftAssert sAssert = new SoftAssert();
			Actions act=new Actions(driver);
			act.moveToElement(Sales).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			act.click(order).build().perform();
			Insert.click();
			Customer.sendKeys(read.getsheetnumber(67, 3, 1));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			AutoSelection.get(0).click();
			Payment.click();
			new Select(ChooseAddress).selectByIndex(1);
			InstalltionDetails.click();
			new Select(ShippingAddress).selectByIndex(1);
			AdddProduct.click();
			ChooseProduct.sendKeys(read.getsheetnumber(67, 3, 2));
			product.click();
			WebDriverWait exp=new WebDriverWait(driver ,10);
			exp.until(ExpectedConditions.visibilityOf(Addproduct));
			
			
			new Select(Subscription).selectByIndex(1);
			Addproduct.click();
			//Alert alert = driver.switchTo().alert();
			//alert.accept();
			Assert.assertEquals(true, Successfulltotal.isDisplayed());
			Totals.click();
			new Select(InstallationCharges).selectByIndex(1);
			new Select(PaymentMethod).selectByIndex(2);
			new Select(OrderStatus).selectByIndex(3);
			//UpdateTotals.click();
			Submit.click();
			Assert.assertEquals(true, AddedPackageSuccesfully.isDisplayed());
			Assert.assertEquals(true, Orderlist.isDisplayed());
			Assert.assertEquals("BigBoss Shetty", Orderlist.getText());
			
			sAssert.assertAll();
			StoreFont.click();
			child();
			parent();
			}
			
			
			
			
			
}
