package com.system.users;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class Users_Page {
	
	ExcelReader read = new ExcelReader();	
	BaseClass Base = new BaseClass();
	TakeScreenShoot ScreenShot = new TakeScreenShoot();

	@FindBy(linkText = "System")
	WebElement Systemtab;
	
	@FindBy(linkText = "Users")
	WebElement Usersmain;
	
	@FindBy(xpath = "//li[2]/ul/li[1]/a[text()='Users']")
	WebElement UsersSub;
	
	@FindBy(linkText = "Insert")
	WebElement InsertBtn;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement Firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement Lastname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath = "//select[@name='user_group_id']//option[@value='1']")//For TopAdmin
	WebElement UserGroupDrpDwn_TopAdmin;
	
	@FindBy(xpath = "//select[@name='user_group_id']//option[@value='20']")//For Admin
	WebElement UserGroupDrpDwn_Admin;
		
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//select[@name='status']//option[@value='1']")
	WebElement Status_Enabled;
	
	@FindBy(xpath = "//select[@name='status']//option[@value='0']")
	WebElement Status_Disabled;
	
	@FindBy(xpath = "//select[@name='sdk_status']//option[@value='0']")
	WebElement SDKStatus_Disabled;
	
	@FindBy(xpath = "//select[@name='sdk_status']//option[@value='1']")
	WebElement SDKStatus_Enabled;
	
	@FindBy(linkText = "Submit")
	WebElement SubmitBtn;
	
	@FindBy(linkText = "Cancel")
	WebElement CancelBtn;
	
	@FindBy(xpath = "(//h1)[1]")
	WebElement UserTitle;
	
	@FindBy(xpath = "//*[@id='content']/div[2]")
	WebElement SuccessMsg;
	
	@FindBy(xpath = "//*[@id='content']/div[2]")
	WebElement WarningMsg;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[1]/td[2]/span")
	WebElement Uname_Validation;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[2]/span")
	WebElement Fname_Validation;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[3]/td[2]/span")
	WebElement Lname_Validation;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[4]/td[2]/span")
	WebElement Email_Validation;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[6]/td[2]/span")
	WebElement Pword_Validation;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[7]/td[2]/span")
	WebElement ConfirmPwd_Validation;
	
	@FindBy(xpath = "(//a[text()='Edit'])[2]")//Edit link of Second row
	WebElement Editlink;
	
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[4]")
	WebElement StatusLabel;
	
	@FindBy(linkText = "Home")
	WebElement Home_link;
	
	@FindBy(xpath ="//*[@id=\"content\"]/div[2]/div[1]/h1")
	WebElement Dash_title;
	
	@FindBy(linkText = ">")
	WebElement NextBtn;

	@FindBy(linkText = "<")
	WebElement PreviousBtn;

	@FindBy(xpath = "//*[@id='content']/div[3]/div[2]/div/div[2]")
	WebElement PaginationText;
		
	public String GetUserPagetitle() {
		return UserTitle.getText();	
	}
	
	public String GetSuccessMsgText() {
		return SuccessMsg.getText();
	}
	
	public String GetWarningMsgText() {
		return WarningMsg.getText();
	}
	
	//Clicking on Users Sub menu
	public void ClickOn_UserSub(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions act = new Actions(driver);	
	act.moveToElement(Systemtab).click().perform();
	act.moveToElement(Usersmain).click().perform();
	act.moveToElement(UsersSub).click().perform();
	SoftAssert sAssert = new SoftAssert();	
	sAssert.assertEquals(GetUserPagetitle(), "Users", "Users Page title Assertion Failed");
	sAssert.assertAll();	
	}
	
	@FindBy(xpath="//select[@name='user_group_id']")
	WebElement Admin;
	
	
	//Inserting users with Valid data and as Top Administrator
	public void Insert_Users_valid_Data_TAdmin(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 1, 0));
	Firstname.sendKeys(read.getsheetnumber(39, 1, 1));
	Lastname.sendKeys(read.getsheetnumber(39, 1, 2));
	Email.sendKeys(read.getsheetnumber(39, 1, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_TopAdmin.click();
	Password.sendKeys(read.getsheetnumber(39, 1, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(39, 1, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have added a new users!", "Users Insertion Assertion with valid data - Top Admin Failed");
	sAssert.assertAll();	
	}
	
	//Inserting users with Valid data and as Admin
	public void Insert_Users_valid_Data_Admin(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 2, 0));
	Firstname.sendKeys(read.getsheetnumber(39, 2, 1));
	Lastname.sendKeys(read.getsheetnumber(39, 2, 2));
	Email.sendKeys(read.getsheetnumber(39, 2, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_Admin.click();
	Password.sendKeys(read.getsheetnumber(39, 2, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(39, 2, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();	 
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have added a new users!", "Users Insertion Assertion with valid data - Admin Failed");
	sAssert.assertAll();
    }
	
	//Inserting users with Valid data and as Top Administrator & Status disabled
	public void Insert_Users_valid_Data_TAdmin_Status_Disabled(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 3, 0));
	Firstname.sendKeys(read.getsheetnumber(39, 3, 1));
	Lastname.sendKeys(read.getsheetnumber(39, 3, 2));
	Email.sendKeys(read.getsheetnumber(39, 3, 3));
	UserGroupDrpDwn_TopAdmin.click();
	Password.sendKeys(read.getsheetnumber(39, 3, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(39, 3, 6));
	Status_Disabled.click();
	SDKStatus_Disabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have added a new users!", "Users Insertion Assertion with valid data & Status Disabled - Top Admin Failed");
	sAssert.assertAll();	
	}
	
	//Inserting users without giving any data
	public void Insert_User_without_data(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Insertion Assertion with invalid data Failed");
	sAssert.assertEquals(Uname_Validation.getText(), "Username must be between 3 and 20 characters!", "Username invalid data validation failed");
	sAssert.assertEquals(Fname_Validation.getText(), "First Name must be between 1 and 32 characters!", "Firstname invalid data validation failed");
	sAssert.assertEquals(Lname_Validation.getText(), "Last Name must be between 1 and 32 characters!", "Lastname invalid data validation failed");
	sAssert.assertEquals(Email_Validation.getText(), "Email must be between 3 and 20 characters!", "Email invalid data validation failed");
	sAssert.assertEquals(Pword_Validation.getText(), "Password must be between 4 and 20 characters!", "Password invalid data validation failed");
	sAssert.assertAll();	
	}
	
	//Inserting users by giving invalid data
	public void Insert_User_with_invalid_data(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 4, 0));
	Firstname.sendKeys(read.getsheetnumber(39, 4, 1));
	Lastname.sendKeys(read.getsheetnumber(39, 4, 2));
	Email.sendKeys(read.getsheetnumber(39, 4, 3));
	Password.sendKeys(read.getsheetnumber(39, 4, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(39, 4, 6));
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Insertion Assertion without valid data Failed");
	sAssert.assertEquals(Uname_Validation.getText(), "Username must be between 3 and 20 characters!", "Username empty validation failed");
	sAssert.assertEquals(Fname_Validation.getText(), "First Name must be between 1 and 32 characters!", "Firstname empty validation failed");
	sAssert.assertEquals(Lname_Validation.getText(), "Last Name must be between 1 and 32 characters!", "Lastname empty validation failed");
	sAssert.assertEquals(Email_Validation.getText(), "Email must be between 3 and 20 characters!", "Email empty validation failed");
	sAssert.assertEquals(Pword_Validation.getText(), "Password must be between 4 and 20 characters!", "Password empty validation failed");
	sAssert.assertAll();	
	}
	
	//Inserting users by giving duplicate data
	public void Insert_User_with_duplicate_data(WebDriver driver) {    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 5, 0));
	Email.sendKeys(read.getsheetnumber(39, 5, 3));
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Insertion Assertion without valid data Failed");
	sAssert.assertEquals(Uname_Validation.getText(), "Username is already in exists!", "Username duplicate validation failed");
	//sAssert.assertEquals(Email_Validation.getText(), "User with Email already exists", "Email duplicate validation failed");
	sAssert.assertAll();	
	}
	
	//Inserting users by clicking cancel button
	public void Insert_User_with_Cancel_button(WebDriver driver) {
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(39, 1, 0));
	Firstname.sendKeys(read.getsheetnumber(39, 1, 1));
	Lastname.sendKeys(read.getsheetnumber(39, 1, 2));
	Email.sendKeys(read.getsheetnumber(39, 1, 3));
	UserGroupDrpDwn_TopAdmin.click();
	Password.sendKeys(read.getsheetnumber(39, 1, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(39, 1, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	CancelBtn.click();
	SoftAssert sAssert = new SoftAssert();	
	System.out.println(GetUserPagetitle());
	sAssert.assertEquals(GetUserPagetitle(), "Users", "Users Insertion Cancel Assertion Failed");
	sAssert.assertAll();	
	}
	
	//Take screenshot of respective tab
	public void Screenshot(String Method) {
	TakeScreenShoot.TakeScreenshot(Method);
	}	
	
	//Edit a user with valid data
	public void Editing_User_With_Valid_Data(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	//Username.sendKeys(read.getsheetnumber(40, 1, 0));
	Firstname.clear();
	Firstname.sendKeys(read.getsheetnumber(40, 1, 1));
	Lastname.clear();
	Lastname.sendKeys(read.getsheetnumber(40, 1, 2));
	Email.clear();
	Email.sendKeys(read.getsheetnumber(40, 1, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_Admin.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 1, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 1, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have modified users!", "Users Edit Assertion with valid data Failed");
	sAssert.assertAll();		
	}	
	
	//Editing a user by changing User group as Top Admin
	public void Editing_User_by_Changing_to_TAdmin(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	//Username.sendKeys(read.getsheetnumber(40, 2, 0));
	Firstname.clear();
	Firstname.sendKeys(read.getsheetnumber(40, 2, 1));
	Lastname.clear();
	Lastname.sendKeys(read.getsheetnumber(40, 2, 2));
	Email.clear();
	Email.sendKeys(read.getsheetnumber(40, 2, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_TopAdmin.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 2, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 2, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have modified users!", "Users Edit Assertion with valid data Failed");
	sAssert.assertAll();	
	}
	
	//Editing a user by changing User group as Admin
	public void Editing_User_by_Changing_to_Admin(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	//Username.sendKeys(read.getsheetnumber(40, 3, 0));
	Firstname.clear();
	Firstname.sendKeys(read.getsheetnumber(40, 3, 1));
	Lastname.clear();
	Lastname.sendKeys(read.getsheetnumber(40, 3, 2));
	Email.clear();
	Email.sendKeys(read.getsheetnumber(40, 3, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_Admin.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 3, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 3, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have modified users!", "Users Edit Assertion with valid data Failed");
	sAssert.assertAll();	
	}
	
	//Editing a user by changing the Status as disabled
	public void Editing_User_by_Changing_Status_Disabled(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	//Username.sendKeys(read.getsheetnumber(40, 3, 0));
	Firstname.clear();
	Firstname.sendKeys(read.getsheetnumber(40, 3, 1));
	Lastname.clear();
	Lastname.sendKeys(read.getsheetnumber(40, 3, 2));
	Email.clear();
	Email.sendKeys(read.getsheetnumber(40, 3, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_Admin.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 3, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 3, 6));
	Status_Disabled.click();
	SDKStatus_Disabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetSuccessMsgText(), "Success: You have modified users!", "Users Edit Assertion with status disabled Failed");
	sAssert.assertEquals(StatusLabel.getText(), "Disabled", "Edit user Status failed");
	sAssert.assertAll();	
	}
	
	//Editing a user with empty data
	public void Editing_User_with_empty_data(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	Firstname.clear();
	Lastname.clear();
	Email.clear();
	Password.clear();
	ConfirmPassword.clear();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Insertion Assertion without valid data Failed");
	//sAssert.assertEquals(Uname_Validation.getText(), "Username must be between 3 and 20 characters!", "Username empty validation failed");
	sAssert.assertEquals(Fname_Validation.getText(), "First Name must be between 1 and 32 characters!", "Firstname empty validation failed");
	sAssert.assertEquals(Lname_Validation.getText(), "Last Name must be between 1 and 32 characters!", "Lastname empty validation failed");
	sAssert.assertEquals(Email_Validation.getText(), "Email must be between 3 and 20 characters!", "Email empty validation failed");
	sAssert.assertAll();	
	}
	
	//Editing a user with invalid data
	public void Editing_User_with_invalid_data(WebDriver driver) {
	ClickOn_UserSub(driver);	
	Editlink.click();
	//Username.clear();
	Username.sendKeys(read.getsheetnumber(40, 4, 0));
	Firstname.clear();
	Firstname.sendKeys(read.getsheetnumber(40, 4, 1));
	Lastname.clear();
	Lastname.sendKeys(read.getsheetnumber(40, 4, 2));
	Email.clear();
	Email.sendKeys(read.getsheetnumber(40, 4, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_Admin.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 4, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 4, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Editing Assertion with invalid data Failed");
	//sAssert.assertEquals(Uname_Validation.getText(), "Username must be between 3 and 20 characters!", "Username invalid assertion failed");
	sAssert.assertEquals(Fname_Validation.getText(), "First Name must be between 1 and 32 characters!", "Firstname invalid validation failed");
	sAssert.assertEquals(Lname_Validation.getText(), "Last Name must be between 1 and 32 characters!", "Lastname invalid validation failed");
	sAssert.assertEquals(Email_Validation.getText(), "Email must be between 3 and 20 characters!", "Email invalid validation failed");
	sAssert.assertEquals(Pword_Validation.getText(), "Password must be between 4 and 20 characters!", "Password invalid validation failed");
	sAssert.assertAll();	
	}
	
	//Editing the user with duplicate data
	public void Editing_User_with_duplicate_data(WebDriver driver) {	    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Username.sendKeys(read.getsheetnumber(40, 5, 0));
	Email.sendKeys(read.getsheetnumber(40, 5, 3));
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users editing Assertion with duplicate data Failed");
	sAssert.assertEquals(Uname_Validation.getText(), "Username is already in exists!", "Username duplicate validation failed");
	//sAssert.assertEquals(Email_Validation.getText(), "User with Email already exists", "Email duplicate validation failed");
	sAssert.assertAll();	
	}
	
	//Editing user with password mismatch
	public void Editing_User_with_password_mismatch(WebDriver driver) {	    
	ClickOn_UserSub(driver);
	InsertBtn.click();
	Password.clear();
	Password.sendKeys(read.getsheetnumber(40, 6, 5));
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 6, 6));
	SubmitBtn.click();
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(GetWarningMsgText(), "Warning: Please check the form carefully for errors!", "Users Editing Assertion with invalid data Failed");
    sAssert.assertEquals(ConfirmPwd_Validation.getText(), "Password and password confirmation do not match!", "Confirm password mismatch assertion failed");
    sAssert.assertAll();
	}
	
	//Editing user by clicking the Cancel button
	public void Edit_User_with_Cancel_button(WebDriver driver) {
	ClickOn_UserSub(driver);
	InsertBtn.click();
	//Username.sendKeys(read.getsheetnumber(40, 1, 0));
	Firstname.sendKeys(read.getsheetnumber(40, 1, 1));
	Lastname.sendKeys(read.getsheetnumber(40, 1, 2));
	Email.sendKeys(read.getsheetnumber(40, 1, 3));
	Select se =new Select(Admin);
	se.selectByIndex(1);
	//UserGroupDrpDwn_TopAdmin.click();
	Password.sendKeys(read.getsheetnumber(40, 1, 5));
	ConfirmPassword.sendKeys(read.getsheetnumber(40, 1, 6));
	Status_Enabled.click();
	SDKStatus_Enabled.click();
	CancelBtn.click();
	SoftAssert sAssert = new SoftAssert();	
	//System.out.println(GetUserPagetitle());
	sAssert.assertEquals(GetUserPagetitle(), "Users", "Users edit Cancel Assertion Failed");
	sAssert.assertAll();	
	}
	
	//Navigation from user & User insert page to home page
	public void Navigation_To_HomePage_Validation(WebDriver driver) {
	ClickOn_UserSub(driver);
	InsertBtn.click();	
	Home_link.click();
	SoftAssert sAssert = new SoftAssert();	
	sAssert.assertEquals(Dash_title.getText(), "Dashboard", "Navigate from User insert to home Assertion Failed");
	ClickOn_UserSub(driver);
	Home_link.click();
	sAssert.assertEquals(Dash_title.getText(), "Dashboard", "Navigate from User page to home Assertion Failed");	
	}
	
	//Pagination for next to previous & Previous to next (Precondition more than 30 user groups needed)
	public void Pagination_in_Users(WebDriver driver) {
	ClickOn_UserSub(driver);
	JavascriptExecutor je =(JavascriptExecutor) driver;
	je.executeScript("scroll(0,800)");
	NextBtn.click();
	String PageText1 = PaginationText.getText().trim();
	String FinalText1 = PageText1.substring(0,10); 
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertEquals(FinalText1, "Showing 31","Next Page assertion failed");
	je.executeScript("scroll(0,800)");
	PreviousBtn.click();
	String PageText2 = PaginationText.getText().trim();
	String FinalText2 = PageText2.substring(0,10); 
	sAssert.assertEquals(FinalText2, "Showing 1","Previous Page assertion failed");
	}

	
}
