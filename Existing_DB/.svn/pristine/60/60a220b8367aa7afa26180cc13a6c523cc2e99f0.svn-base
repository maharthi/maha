package com.category_webelement;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;


public class Category_Page extends BaseClass
{

	@FindBy(xpath = ".//*[@id='catalog']/a")
	WebElement Catalog;

	// By Catalog=By.xpath(".//*[@id='catalog']/a");

	@FindBy(xpath = "//a[text()='Categories']")
	public WebElement Categories;

	@FindBy(linkText = "Insert")
	public WebElement Insert;

	@FindBy(xpath = "//input[@name='category_description[1][name]' and @type='text' and @size='100']")
	public WebElement Category_Name;

	@FindBy(xpath = "//textarea[@rows='5' and @name='category_description[1][meta_description]']")
	public WebElement Meta_Tag_Description;

	@FindBy(xpath = "//textarea[@rows='5' and @name='category_description[1][meta_keyword]']")
	public WebElement Meta_Tag_Keywords;

	@FindBy(xpath = "html/body")
	public WebElement Description;

	@FindBy(xpath = "//a[text()='Data' and @style='display: inline;']")
	public WebElement Data; // Top

	@FindBy(xpath = "//input[@class='ui-autocomplete-input' and @type='text' and @name='path' and @size='100']")
	public WebElement Parent;

	@FindBy(xpath = "//li[@class='ui-menu-item']")
	public List<WebElement> allparentClick;
	
	@FindBy(xpath = "//input[@class='ui-autocomplete-input' and @name='filter']")
	public WebElement Filters;

	@FindBy(xpath = "//input[@type='checkbox' and @ name='category_store[]']")
	public WebElement Stores;

	@FindBy(xpath = "//input[@type='text' and @name='keyword' and @value='']")
	public WebElement SEO_Keyword;

	@FindBy(xpath = "//a[text()='Browse']")
	public WebElement Image;

	@FindBy(xpath = "//input[@name='top' and @value='1' and @type='checkbox']")
	public WebElement Top;

	@FindBy(xpath = "//input[@name='column' and @size='1' and @value='1' and @type='text']")
	public WebElement Columns;

	@FindBy(xpath = "//input[@name='sort_order' and @size='1' and @value='0' and @type='text']")
	public WebElement Sort_Order;

	//@FindBy(xpath = "//select[@name='status']")
	//public WebElement Status;

	//@FindBy(xpath = "//option[text()='Enabled' and @value='1' and @selected='selected']")
	//public WebElement Status_Enabled;

	//@FindBy(xpath = "//option[text()='Disabled' and @value='0']")
	//public WebElement Status_Disabled;

	@FindBy(linkText = "Design")
	public WebElement Design; // Top

	@FindBy(name = "category_layout[0][layout_id]")
	public WebElement Click_For_Default; // Top

	@FindBy(xpath = ".//*[@id='tab-design']/table/tbody/tr/td[2]/select/option[7]")
	public WebElement Default_Button;

	@FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div/a[1]")
	public WebElement Submit;

	@FindBy(xpath = "//a[text()='Edit']")
	public List<WebElement> Edit;

	@FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div/a[2]")
	public WebElement Cancel_Button;

	@FindBy(xpath = ".//*[@id='content']/div[2]")
	public WebElement Warning;

	@FindBy(xpath = ".//*[@id='language1']/table/tbody/tr[1]/td[2]/span")
	public WebElement Error_Message;
	
	//Categories Added Sucessfully
	@FindBy(xpath="//div[text()='Success: You have added a Category successfully!']")
	public WebElement Actual_Category_Added_Sucessfully;
	
	//When Category name is not entered
	@FindBy(xpath="//div[text()='Warning: Please check the form carefully for errors!']") //.//*[@id='language1']/table/tbody/tr[1]/td[2]/span
	public WebElement Without_Enter_Name_Warning;
	
	@FindBy(xpath=".//*[@id='language1']/table/tbody/tr[1]/td[2]/span")
	WebElement Warning_Msg_For_Category_Name;
	
	@FindBy(xpath=".//*[@id='content']/div[2]")
	public WebElement Actual_Category_Modified;
	
	@FindBy(xpath=".//*[@id='tab-data']/table/tbody/tr[10]/td[2]/select")
	WebElement Status;
	
	// To find Edit link(For -Positive data) of particular Category Name, We have to change the value in- text()= 'change value' 
	@FindBy(xpath = "//td[contains(text(),'Sportss7')]//following::a[text()='Edit'][1]")
	WebElement Category_Valid_Search_Edit; 

	@FindBy(xpath = "(//a[text()='Edit'])[5]")
	WebElement EditSuccesfull5; 
	
	// To find Edit link(For -Invalid,duplicate) of particular Category Name, We have to change the value in- text()= 'change value' 
	 @FindBy(xpath = "//td[contains(text(),'Dance7')]//following::a[text()='Edit'][1]")	
	 WebElement Category_Invalid_Search_Edit;
	 
	 @FindBy(xpath = "(//a[text()='Edit'])[5]")
	WebElement EditUnSuccesfull5; 
	
	//Getting button elements
	@FindBy(className ="button")
	List<WebElement> All_elements;
	
	//to get all the button in the page
	public List<WebElement> getAllData() 
	{
        return All_elements;
	}
	
	public String get_Category_Modify_Title()
	{
		return Actual_Category_Modified.getText();
	}
	
	public String get_Categories_Added_Title()
	{
		return Actual_Category_Added_Sucessfully.getText();
	}
	public String get_Without_Enter_Name_Warning(){
		return Without_Enter_Name_Warning.getText();
	}
	
	ExcelReader read = new ExcelReader();
	
	public void Insert_Categories_Method_Without_Parent()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		Category_Name.sendKeys(read.getsheetnumber(1, 1, 0)); 
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 1, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 1, 2));
		Data.click();
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 1)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2,1,2)));
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2,1,3)));
		je.executeScript("scroll(800,0)");
		Submit.click();
		Assert.assertEquals(get_Categories_Added_Title(), "Success: You have added a Category successfully!" , "Category insertion without parent failed");
	}

	public void Insert_Categories_Method_With_Parent() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		act.click(Categories).build().perform();
		Insert.click();
		Category_Name.sendKeys(read.getsheetnumber(1, 2, 0));
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 2, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 2, 2));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 1)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2,1,2)));
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2,1,3)));
		je.executeScript("scroll(800,0)");		
		Submit.click();
		Assert.assertEquals(get_Categories_Added_Title(), "Success: You have added a Category successfully!");
	}

	public void Insert_Categories_with_Disabled_Status() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		act.click(Categories).build().perform();
		Insert.click();
		Category_Name.sendKeys(read.getsheetnumber(1, 3, 0));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();	
		new Select(Status).selectByVisibleText("Disabled");
		Submit.click();
		Assert.assertEquals(get_Categories_Added_Title(), "Success: You have added a Category successfully!");
	}
	
	
	public void Catalog_Categories_Special_Character_in_Column_Method() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		Category_Name.sendKeys(read.getsheetnumber(1, 4, 0));
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 3, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 3, 2));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		//Filters.sendKeys(read.getsheetnumber(2, 1, 1));
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 1)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber(2,2,2))); //@
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 3)));
		je.executeScript("scroll(800,0)");
		Submit.click();
		Assert.assertEquals(get_Categories_Added_Title(), "Success: You have added a Category successfully!");
		
   }

	public void Category_Without_Entering_the_Category_Name_Method()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 1, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 1, 2));
		Data.click();	
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		//Filters.sendKeys(read.getsheetnumber(2, 1, 1));
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 1)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 2)));
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 3)));		
		je.executeScript("scroll(800,0)");
		Submit.click();
		Assert.assertEquals(get_Without_Enter_Name_Warning(), "Warning: Please check the form carefully for errors!");
		Assert.assertEquals(Warning_Msg_For_Category_Name.getText(), "Category Name must be between 2 to 32 characters and should not contain only spaces!", " Category Name assertion failed");
	} 

	public void Invalid_Category_Name_method()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		Category_Name.sendKeys("abc@#12");
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 1, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 1, 2));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		//Filters.sendKeys(read.getsheetnumber(2, 1, 1));
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 1)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2,1,2)));
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 3)));
		je.executeScript("scroll(800,0)");
		Submit.click();
		Assert.assertEquals(get_Without_Enter_Name_Warning(), "Warning: Please check the form carefully for errors!");
		Assert.assertEquals(Warning_Msg_For_Category_Name.getText(), "Special Characters not allowed!", " Category Name for special character assertion failed");
		}

	public void Cancel_functionality_method() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		//Category_Name.sendKeys("@123#");
		Category_Name.sendKeys(read.getsheetnumber(1, 5, 0));
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 5, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 5, 2));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 2)));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2,1,2)));
		Sort_Order.clear();
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 3)));
		je.executeScript("scroll(800,0)");
		Cancel_Button.click();
		
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		Insert.click();
		//Category_Name.sendKeys("@123#");
		Category_Name.sendKeys(read.getsheetnumber(1, 5, 0));
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 5, 1));
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 5, 2));
		Data.click();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		SEO_Keyword.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 2)));
		je.executeScript("scroll(0,800)");
		Top.click();
		Columns.clear();
		Columns.sendKeys(String.valueOf(read.getsheetnumber1(2,1,2)));
		Sort_Order.clear();                                                                                                                                                                                                                                                                                                           
		Sort_Order.sendKeys(String.valueOf(read.getsheetnumber1(2, 1, 3)));
		je.executeScript("scroll(800,0)");
		Submit.click();
		//Assert.assertEquals(get_Without_Enter_Name_Warning(), "Warning: Please check the form carefully for errors!");
		Assert.assertEquals(get_Categories_Added_Title(), "Success: You have added a Category successfully!");
	}

	public void Edit_Functionality_of_Parent_Category_method() 
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		//Category_Valid_Search_Edit.get(1).click();
		EditSuccesfull5.click();
		//Category_Valid_Search_Edit.click();
		Category_Name.clear();
		Category_Name.sendKeys(read.getsheetnumber(1, 9, 0)); // 1 8 0 need
		Meta_Tag_Description.clear();
		Meta_Tag_Description.sendKeys(read.getsheetnumber(1, 9, 1));
		Meta_Tag_Keywords.clear();
		Meta_Tag_Keywords.sendKeys(read.getsheetnumber(1, 9, 2));
		Data.click();
		Parent.clear();
		Parent.sendKeys(read.getsheetnumber(2, 1, 0));
		allparentClick.get(1).click();
		Submit.click();
//		String Error = Warning.getText();
//		System.out.println(Error + "6");
		Assert.assertEquals(get_Category_Modify_Title(),"Success: Category has been successfully modified!");
		//Assert.assertEquals(Warning_Msg_For_Category_Name.getText(), "Special Characters not allowed!", " Category Name for special character assertion failed");
	}

	public void Edit_Functionalty_of_Invalid_Category_Name_method()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Catalog).build().perform();
		Categories.click();
		EditUnSuccesfull5.click();
	//	Category_Invalid_Search_Edit.click();
		Category_Name.clear();
		Category_Name.sendKeys("1232@#AABC");
		Submit.click();
//		String Error = Warning.getText();
//		System.out.println(Error + "7");
//		String Error_Msg = Error_Message.getText();
//		System.out.println(Error_Msg);
		Assert.assertEquals(get_Without_Enter_Name_Warning(), "Warning: Please check the form carefully for errors!");
		//Assert.assertEquals(get_Category_Modify_Title(),"Success: Category has been successfully modified!");
	}
	
		public void Screenshot_of_All_Tab(String Method) 
		{
		TakeScreenShoot.TakeScreenshot(Method);
		Data.click();
		TakeScreenShoot.TakeScreenshot(Method);
		Design.click();
		TakeScreenShoot.TakeScreenshot(Method);
	}
		public void Screenshot_single(String Method) {
		TakeScreenShoot.TakeScreenshot(Method);	
		}
}
