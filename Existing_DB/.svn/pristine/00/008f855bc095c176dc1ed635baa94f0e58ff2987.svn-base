 package com.packagepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;


public class Create_Package extends BaseClass
{
	

	@FindBy(xpath="//a[text()='Catalog']")
	WebElement Catalog;
	
	//@FindBy(xpath="//a[text()='Packages']")
	@FindBy(linkText ="Packages")
	WebElement Packages; 
	
	@FindBy(xpath="//a[text()='Insert']")  
	private WebElement Insert;
	
	@FindBy(xpath="//a[text()='General']")   // clicking on general tab 
	private WebElement General;
	
	//@FindBy(xpath="//input[text()='product_description[1][name]']")   // inserting package name
	@FindBy(xpath="//*[@id='language1']/table/tbody/tr[1]/td[2]/input")
	private WebElement text;
	
	//@FindBy(xpath="//*[@id='tabs']/a[2]")  //clicking on all channel tab
	@FindBy(linkText ="Add Channels")
	private WebElement AddChannels;
	
	@FindBy(xpath="//option[text()='All Channels']")  // clicking on all channels in add channel tab
	private WebElement Allchannels;
	
	@FindBy(xpath=".//*[@id='channels']/option[1]")   //selecting one and dragging down 
	private WebElement selectchannel;
	
	@FindBy(xpath=".//*[@id='channels']/option[2]")   //selecting one and dragging down 
	private WebElement selectchannel1;
	
	@FindBy(xpath=".//*[@id='channels']/option[3]")   //selecting one and dragging down 
	private WebElement selectchannel2;
	
	@FindBy(xpath=".//*[@id='channels']/option[4]")   //selecting one and dragging down 
	private WebElement selectchannel3;
	
	@FindBy(xpath=".//*[@id='channels']/option[5]")   //selecting one and dragging down 
	private WebElement selectchannel4;	
	
	@FindBy(xpath="(.//*[@id='channels']/option)")
	private WebElement lastchannel;
	
	@FindBy(id="channels") 
	private WebElement selectallchannel;
	
	//@FindBy(linkText=">>")  //inserting channel by clicking on >> link
	@FindBy(linkText =">>")
	private WebElement insertchannel;
	
	//@FindBy(xpath="//*[@id='tabs']/a[3]")  //clicking on data tab
	@FindBy(linkText ="Data")
	private WebElement datatab ;
	
	@FindBy(xpath="//*[@id='tab-data']/table/tbody/tr[1]/td[2]/input")
	private WebElement packno;
	
	@FindBy(xpath="//input[@name='price']")  // inserting price of package
	private WebElement packprice ;
	
	@FindBy(name="region")    //
	private WebElement reg ;
	
	@FindBy(xpath="//*[@id='tabs']/a[4]")   // clicking on links tab
	private WebElement links;
	
	@FindBy(xpath="//*[@id='tab-links']/table/tbody/tr[2]/td[2]/input") // inspecting of channel package in showing in textbox
	private  WebElement chncat;
	
	@FindBy(xpath="//a[text()='Channel Packages']")  // clicking on channel package  in link
	private  WebElement chnapackclk;
	
	@FindBy(xpath="//*[@id='tab-links']/table/tbody/tr[2]/td[2]/input")
	private  WebElement chnapackclk1;

	@FindBy(xpath="//*[@id='tabs']/a[6]")   // clicking on options tab 
	private  WebElement opttab;
	
	@FindBy(xpath="//*[@id='option-add']/input")   // inserting subscription
	private  WebElement optadd;
	
	@FindBy(xpath="//a[text()='Subscription']")  // clicking on subscription
	private  WebElement subsclk;
		
	@FindBy(xpath="//a[text()='Add Option Value']")
	private  WebElement addopt;
	
	@FindBy(name="product_option[0][product_option_value][0][option_value_id]")
	private  WebElement durationdrop;
	
	@FindBy(xpath="//input[@name='product_option[0][product_option_value][0][price]']")   
	private  WebElement packprc;
	
	@FindBy(xpath="//a[text()='Submit']")  // clicking on ok button
	private  WebElement clkok;
	
	@FindBy(xpath="//a[text()='Submit']")
	private  WebElement clksub;       // package created
	
	@FindBy(xpath="//div[text()='Success: You have mapped Channel(s) to a Package successfully!']")   // validation message of package creation
	WebElement  succesfull_validation;
		
	@FindBy(xpath="//*[@id='form']/table/tbody/tr[1]/td[3]/input")   // clicking on package name
	private  WebElement clkpackage_name;  
	
	@FindBy(xpath="//*[@id='form']/table/tbody/tr[1]/td[3]/input")   //entering pack name in package name field
	private  WebElement enter_pack_name;
	
	@FindBy(xpath=	"//*[@id='form']/table/tbody/tr[1]/td[8]/a")  // clicking on search button
	private  WebElement clicking_search_name;
		
	@FindBy(xpath = "//li[@class=\"ui-menu-item\"]")
	public List<WebElement> allcat;
		
	@FindBy(xpath ="//div[text()= 'Warning: Please check the form carefully for errors!']")  // warning validation message while adding duplicate package name
	public  WebElement Not_Added_Package;
		
	@FindBy(name="filter_name")    //clicking on package name
	WebElement PackageNameSearch;
	
	@FindBy(xpath ="//*[@id='form']/table/tbody/tr[1]/td[8]/a")  // clicking on search button
	WebElement Search;
	
	@FindBy(linkText = "Edit")  // clicking on edit link of created package after searching
	 WebElement Edit;
		
	@FindBy(xpath = "//div[text()='Success: Package has been successfully modified!']")  //package edited successfully
	WebElement Package_Edited_Successfully;
		
	@FindBy(xpath = "//div[text()='Warning: Please check the form carefully for errors!']")  //warning message while editing
	WebElement Warning_Message_OnEdit;
	
	@FindBy(xpath = "//td[contains(text(),'No results!')]")  //if no search results are there
	WebElement Search_Result;
	
	@FindBy(xpath = "//div[text()='Warning: Empty Package, Please add channels!']")  //warning message for empty package
	WebElement Warning_Message_emptypack;
	
	@FindBy(xpath=	"//*[@class='even']//img[@src='view/image/delete.png']")  // clicking on search button
	private  WebElement removing_cateogry_name;
	
    @FindBy(xpath=    "//*[@id='option-value-row0']/tr/td[4]/a") // clicking on remove button for removing subscription option	173	    
	private WebElement removing_subscription_value;
    
    //Getting button elements
  	@FindBy(className ="button")
  	List<WebElement> All_elements;
  	
  	//to get all the button in the page
  	public List<WebElement> getAllData() {
          return All_elements;
  	}
	
	public String package_Created_Successfully()    ////To get the Package created successfully message	
	{
		return succesfull_validation.getText();
	}
	
	public String Warning_On_duplicate_Creation()   //To get the text of warning message while adding duplicate package name
	{
		return Not_Added_Package.getText();
	}
		
	public String Warning_On_Package_Edit()   //To get the text of warning message
	{
		return Warning_Message_OnEdit.getText();
	}
	
	public String Warning_On_Package_Empty()   //To get the text of warning message
	{
		return Warning_Message_emptypack.getText();
	}
		
	public String Warning_On_Package_updation()   //To get the text of warning message
	{
		return Package_Edited_Successfully.getText();
	}
	  
    ExcelReader read =new ExcelReader();
    BaseClass Base = new BaseClass();
	TakeScreenShoot ScrnShot = new TakeScreenShoot();
    
    public void addpackage()
    {
    	Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 1, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
        //packno.sendKeys(read.getsheetnumber(7, 0, 1));
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 1, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 1, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
        links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 1, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Success: You have mapped Channel(s) to a Package successfully!", package_Created_Successfully(), "package Creation Assertion Failed");
        //clksub.click();
    }
      
    public void duplicate_packagename()
    {
    	Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 2, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	//packno.sendKeys(read.getsheetnumber(7, 0, 1));
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 2, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 2, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
        links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 2, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!", Warning_On_duplicate_Creation(), "package Creation Assertion Failed");
        //clksub.click();
    }
    	   
     public void duplicate_packagenumber()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 3, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
        //packno.sendKeys(read.getsheetnumber(7, 0, 1));
        packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 3, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 3, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
        links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 3, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package Creation Assertion Failed");
        //clksub.click();
    }
    	  
    public void empty_packagename()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	//text.sendKeys(read.getsheetnumber(7, 3, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	//packno.sendKeys(read.getsheetnumber(7, 4, 1));
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 4, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 4, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 4, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package empty Assertion Failed");
        //clksub.click();
    }
    	  
    public void empty_packagenumber()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 5, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	//packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 4, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 5, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
        links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 5, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package empty Assertion Failed");
        //clksub.click();
    }
    	   
    public void empty_packageprice()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 6, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab.click();
        packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 6, 1)));
        //packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 5, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 6, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package empty Assertion Failed");
        //clksub.click();
    }
    	    
     public void empty_packagesubsprice()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 7, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
        packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 7, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 7, 2)));
        //reg.click();
    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
        links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        //packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 6, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package empty Assertion Failed");
        //clksub.click();
    }
    	
    public void without_cateogry()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 8, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 8, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 8, 2)));
        //reg.click();
    	//links.click();
        //chnapackclk1.sendKeys("c");
        //allcat.get(2).click();
        //chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 8, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package empty Assertion Failed");
        //clksub.click();
    	}
      
    public void without_addingchannel()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 9, 0));
    	//AddChannels.click();
    	//Allchannels.click();
        //selectchannel.click(); 
    	//selectchannel1.click(); 
    	//selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
        //insertchannel.click();
    	datatab .click();
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 9, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 9, 2)));
        //reg.click();
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 9, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Empty Package, Please add channels!",Warning_On_Package_Empty(), "package empty Assertion Failed");
        //clksub.click();
    }
      
    public void invalid_packagename()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 10, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 10, 1)));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 10, 2)));
        //reg.click();
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 10, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package Creation Assertion Failed");
        //clksub.click();
    }
       
    public void invalid_packagenumber()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 11, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	packno.sendKeys(read.getsheetnumber(7, 11, 1));
        packprice.sendKeys(String.valueOf(read.getsheetnumber1(7, 11, 2)));
        //reg.click();
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 11, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package Creation Assertion Failed");
        //clksub.click();
    }
       
    public void invalid_packageprice()
    {
        Catalog.click();
    	Packages.click();
    	Insert.click();
    	text.sendKeys(read.getsheetnumber(7, 12, 0));
    	AddChannels.click();
    	Allchannels.click();
       	selectchannel.click(); 
    	selectchannel1.click(); 
    	selectchannel2.click(); 
        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
    	insertchannel.click();
    	datatab .click();
    	packno.sendKeys(String.valueOf(read.getsheetnumber1(7, 12, 1)));
        packprice.sendKeys(read.getsheetnumber(7, 12, 2));
        // reg.click();
    	links.click();
        chnapackclk1.sendKeys("c");
        allcat.get(1).click();
        chncat.click();
        opttab.click();
        optadd.sendKeys("Subscription");
        subsclk.click();
        addopt.click();
        durationdrop.sendKeys("1 month");
        packprc.sendKeys(String.valueOf(read.getsheetnumber1(7, 11, 4)));
        clkok.click();
        driver.switchTo().alert().accept();
        //clksub.click();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package Creation Assertion Failed");
        //clksub.click();
    	}
    
    public String Package_Edited_Successfully() 
	{
		return Package_Edited_Successfully.getText();
	}
    
	public void Edit_add_product_from_package()
	{
		Catalog.click();
    	Packages.click();
    	PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	AddChannels.click();
    	Allchannels.click();
    	//selectchannel.click(); 
    	//String all=Keys.chord(Keys.CONTROL ,"a");
        selectchannel1.click(); 
        selectchannel2.click(); 
        insertchannel.click();
        clkok.click();
        driver.switchTo().alert().accept();     
   }
	
	 /*public void Edit_remove_product_from_package()
	{
		Catalog.click();
    	Packages.click();
    	PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	AddChannels.click();
    	selectchannel4.click(); 
        insertchannel.click();
        clkok.click();
        driver.switchTo().alert().accept();
   }  */
	
	public void Edit_price_of_package()
	{
		//Catalog.click();
    	//Packages.click();
        //PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	datatab .click();  	
    	packprice.clear();
    	packprice.sendKeys(String.valueOf(read.getsheetnumber1(8, 1, 0)));
    	//reg.click();
    	//clksub.click();
    	clkok.click();
        driver.switchTo().alert().accept();
        Assert.assertEquals("Success: Package has been successfully modified!",Package_Edited_Successfully(), "package updation Assertion Failed");
   }
		
	public void Edit_price_of_package_invalid()
	{
		//Catalog.click();
    	//Packages.click();
        //PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	datatab .click();
    	packprice.clear();
    	packprice.sendKeys(read.getsheetnumber(8, 2, 0));
        //reg.click();
    	//clksub.click();
    	clkok.click();
        driver.switchTo().alert().accept();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package updation Assertion Failed");
   }
	
	public void Edit_price_of__package_with_emptydata()
	{
		Catalog.click();
    	Packages.click();
    	PackageNameSearch.clear();
        PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	datatab .click();
    	packprice.clear();
        //packprice.sendKeys(read.getsheetnumber(8, 2, 0));
    	//reg.click();
    	//clksub.click();
    	clkok.click();
        driver.switchTo().alert().accept();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package updation Assertion Failed");
   }
	
	public void edit_with_removing_cateogry()
	{
		Catalog.click();
    	Packages.click();
    	PackageNameSearch.clear();
        PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));
    	Search.click();
    	Edit.click();
    	links.click();
    	removing_cateogry_name.click();
        //packprice.sendKeys(read.getsheetnumber(8, 2, 0));    
    	//clksub.click();
    	clkok.click();
        driver.switchTo().alert().accept();
        Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package updation Assertion Failed");
   }
	
	public void edit_with_removing_subscriptionoptionvalue()	    {		
        Catalog.click();		
		Packages.click();		
        //PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));		
	    //Search.click();		
        Edit.click();		
	    opttab.click();		
	    removing_subscription_value.click();		
	    //packprice.sendKeys(read.getsheetnumber(8, 2, 0));					
	    //clksub.click();		
	    clkok.click();		
	    driver.switchTo().alert().accept();		
	    Assert.assertEquals("Warning: Please check the form carefully for errors!",Warning_On_duplicate_Creation(), "package updation Assertion Failed");		
	}		
	    			    		
	   /* public void edit_package_withspecific_region()		
	    {		
	    Catalog.click();		
	    Packages.click();		
	    //PackageNameSearch.sendKeys(read.getsheetnumber(7, 1, 0));		
	    //Search.click();		
	    Edit.click();		
	    datatab.click();			    		
	    //packprice.sendKeys(read.getsheetnumber(8, 2, 0));		
	    new Select(reg).selectByVisibleText("Domlur");		
	    //clksub.click();		
	    clkok.click();		
	    driver.switchTo().alert().accept();		
	    Assert.assertEquals("Success: Package has been successfully modified!",Package_Edited_Successfully(), "package updation Assertion Failed");		
	}*/
	
        //Takes screenshot for all tabs			
	    public void Screenshot_of_All_Tab(String Method)
	 {	
		TakeScreenShoot.TakeScreenshot(Method);
		AddChannels.click();
		TakeScreenShoot.TakeScreenshot(Method);
		datatab.click();			
		TakeScreenShoot.TakeScreenshot(Method);
		links.click();			
		TakeScreenShoot.TakeScreenshot(Method);
		opttab.click();			
		TakeScreenShoot.TakeScreenshot(Method);	
	}
	
	    //Take screenshot of respective tab
	    public void Screenshot_single(String Method) 
	  {
		TakeScreenShoot.TakeScreenshot(Method);
	 }	
	    
	    @FindBy(xpath="(//a[@class='top'])[10]")
	    WebElement StoreFont;
	    
	    @FindBy(xpath=".//*[@id='menu']/ul[1]/li/a")
	    WebElement Storepackage;
	    
	    @FindBy(xpath="//a[text()=' Iphonex2 ']")
	     WebElement Storepac;
	    
	    @FindBy(xpath=".//*[@id='search']/input")
	    WebElement sear;
	    
	    @FindBy(xpath="//div[@class='success']")
	    WebElement EditSuccess;
	    
	    @FindBy(xpath="//div[@class='price']")
	    WebElement BasicPrice;
	    
	    public void useaddpackage()
	    {
	    	Catalog.click();
	    	Packages.click();
	    	Insert.click();
	    	text.sendKeys(read.getsheetnumber(62, 1, 0));
	    	AddChannels.click();
	    	Allchannels.click();
	       	selectchannel.click(); 
	    	//selectchannel1.click(); 
	    	//selectchannel2.click(); 
	        //lastchannel.sendKeys("Keys.SHIFT","Keys.END");
	    	insertchannel.click();
	    	datatab .click();
	        //packno.sendKeys(read.getsheetnumber(7, 0, 1));
	    	packno.sendKeys(String.valueOf(read.getsheetnumber1(62, 1, 1)));
	        packprice.sendKeys(String.valueOf(read.getsheetnumber1(62, 1, 2)));
	        //reg.click();
	    	//packprice.sendKeys(read.getsheetnumber(7, 0, 2));
	        links.click();
	        chnapackclk1.sendKeys("c");
	        allcat.get(1).click();
	        chncat.click();
	        opttab.click();
	        optadd.sendKeys("Subscription");
	        subsclk.click();
	        addopt.click();
	        durationdrop.sendKeys("1 month");
	        packprc.sendKeys(String.valueOf(read.getsheetnumber1(62, 1, 4)));
	        clkok.click();
	        driver.switchTo().alert().accept();
	        //clksub.click();
	        Assert.assertEquals("Success: You have mapped Channel(s) to a Package successfully!", package_Created_Successfully(), "package Creation Assertion Failed");
	        StoreFont.click();
	        child();
	       // SwitchToStoreFrontWindow();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Actions act=new Actions(driver);
	        act.moveToElement(Storepackage).perform();
	       // Storepackage.click();
	        Assert.assertEquals(true, Storepac.isDisplayed());
	        parent();
	        Assert.assertEquals(true, StoreFont.isDisplayed());
	    }
	    
	    public void usecase_Editpackage()
		{
	    	
			Catalog.click();
	    	Packages.click();
	    	PackageNameSearch.sendKeys(read.getsheetnumber(62, 1, 0));
	    	Search.click();
	    	Edit.click();
	    	datatab .click();
	    	packprice.clear();
	   	    packprice.sendKeys(String.valueOf(read.getsheetnumber1(62, 2, 2))); 
	        clkok.click();
	        driver.switchTo().alert().accept();     
	        Assert.assertEquals("Success: Package has been successfully modified!", EditSuccess.getText(), "package Creation Assertion Failed");
	        StoreFont.click();
	        child();
	        //SwitchToStoreFrontWindow();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Actions act=new Actions(driver);
	       // act.click(Storepackage).perform();
	        act.moveToElement(Storepackage).perform();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Storepac.click();
	        Assert.assertEquals("Basic: Rs 200.00", BasicPrice.getText(), "package Edit Assertion Failed");
	        //SwitchToStoreFrontWindow();
	        parent();
	        Assert.assertEquals(true, StoreFont.isDisplayed());
	        
	    
	    	
	        
	      
		}
	   
	    
  }
	
	
	
	
	