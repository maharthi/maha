package com.system.userGroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import excelreader.ExcelReader;
import screenshot.TakeScreenShoot;
import test.baseclass.BaseClass;

public class UserGroup_Page {
	
ExcelReader read = new ExcelReader();	
BaseClass Base = new BaseClass();
TakeScreenShoot ScreenShot = new TakeScreenShoot();

@FindBy(linkText = "System")
WebElement Systemtab;

//@FindBy(linkText = "Users")
WebElement Usersmain;

@FindBy(linkText = "User Groups")
WebElement UserGroup;

@FindBy(linkText = "Insert")
WebElement InsertBtn;

@FindBy(xpath = "//input[@name = 'name']")
WebElement UserGroupName;

@FindBy(xpath = "(//a[text()='Select All'])[1]")
WebElement AccessPermission_All;

@FindBy(xpath = "(//a[text()='Unselect All'])[1]")
WebElement AccessPermission_None;

@FindBy(xpath = "(//a[text()='Select All'])[2]")
WebElement ModifyPermission_All;

@FindBy(xpath = "(//a[text()='Unselect All'])[2]")
WebElement ModifyPermission_None;

@FindBy(linkText = "Submit")
WebElement SubmitBtn;

@FindBy(linkText = "Cancel")
WebElement CancelBtn;

@FindBy(xpath = "//*[@id='content']/div[3]/div[1]/h1")
WebElement UserGrp_Title;

@FindBy(xpath = "//*[@id='content']/div[2]")
WebElement SuccessMsg;

@FindBy(xpath = "//*[@id='form']/table/tbody/tr[2]/td[3]/a")
WebElement EditLink;

@FindBy(xpath = "//*[@id='form']/table/tbody/tr[1]/td[2]/span")
WebElement UserGrpName_msg;

@FindBy(linkText = "Home")
WebElement HomeLink;

@FindBy(xpath = "//*[@id='content']/div[2]/div[1]/h1")
WebElement Dashbrd_Title;

@FindBy(linkText = ">")
WebElement NextBtn;

@FindBy(linkText = "<")
WebElement PreviousBtn;

@FindBy(xpath = "//*[@id='content']/div[3]/div[2]/div/div[2]")
WebElement PaginationText;

@FindBy(linkText = "Sales")
WebElement SalesLink;

//Clicking on UserGroup 
public void ClickOn_UserGroup(WebDriver driver) {
WebDriverWait wait=new WebDriverWait(driver, 20);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
Actions action = new Actions(driver);	
action.moveToElement(SalesLink).click().perform();
action.moveToElement(Systemtab).click().perform();
Usersmain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='system']/ul/li[2]/a")));
action.moveToElement(Usersmain).click().perform();
action.moveToElement(UserGroup).click().perform();
SoftAssert sAssert = new SoftAssert();	
sAssert.assertEquals(UserGrp_Title.getText(), "User Groups", "User groups Page title Assertion Failed");
sAssert.assertAll();	
}

//Insertion of User group with valid data
public void UserGroup_Creation_with_Valid_data(WebDriver driver) {
ClickOn_UserGroup(driver);
InsertBtn.click();
UserGroupName.sendKeys(read.getsheetnumber(41, 1, 0));
AccessPermission_All.click();
ModifyPermission_All.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(SuccessMsg.getText(), "Success: You have added an User Group successfully!", "User Group insertion with valid data failed");
sAssert.assertAll();
}

//Insertion of User group with empty data
public void UserGroup_Creation_with_empty_data(WebDriver driver) {
ClickOn_UserGroup(driver);
InsertBtn.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name must be between 3 and 64 characters!", "User Group insertion with empty data failed");
sAssert.assertAll();
}

//Insertion of User group with valid data
public void UserGroup_Creation_with_invalid_data(WebDriver driver) {
ClickOn_UserGroup(driver);
InsertBtn.click();
UserGroupName.sendKeys(read.getsheetnumber(41, 2, 0));
AccessPermission_All.click();
ModifyPermission_All.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name must be between 3 and 64 characters!", "User Group insertion with invalid data failed");
sAssert.assertAll();
}

//Insertion of User group with duplicate data
public void UserGroup_Creation_with_duplicate_data(WebDriver driver) {
ClickOn_UserGroup(driver);
InsertBtn.click();
UserGroupName.sendKeys(read.getsheetnumber(41, 3, 0));
AccessPermission_All.click();
ModifyPermission_All.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name already exist!", "User Group insertion with duplicate data failed");
sAssert.assertAll();	
}

//Clicking cancel while Insertion of User group 
public void UserGroup_Creation_cancel(WebDriver driver) {
ClickOn_UserGroup(driver);
InsertBtn.click();
UserGroupName.sendKeys(read.getsheetnumber(41, 4, 0));
AccessPermission_All.click();
ModifyPermission_All.click();
CancelBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrp_Title.getText(), "User Groups", "User groups insertion cancel Assertion Failed");
sAssert.assertAll();	
}

//Take screenshot of respective tab
public void Screenshot(String Method) {
TakeScreenShoot.TakeScreenshot(Method);
}	

//Editing User group with valid data
public void UserGroup_Edit_with_Valid_data(WebDriver driver) {
ClickOn_UserGroup(driver);
EditLink.click();
UserGroupName.clear();
UserGroupName.sendKeys(read.getsheetnumber(41, 6, 0));
AccessPermission_None.click();
ModifyPermission_None.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(SuccessMsg.getText(), "Success: You have modified users group!", "User Group Edit with valid data failed");
sAssert.assertAll();
}

//Editing User group with empty data
public void UserGroup_Edit_with_empty_data(WebDriver driver) {
ClickOn_UserGroup(driver);
EditLink.click();
UserGroupName.clear();
AccessPermission_None.click();
ModifyPermission_None.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name must be between 3 and 64 characters!", "User Group edit with invalid data failed");
sAssert.assertAll();
}

//Editing User group with invalid data
public void UserGroup_Edit_with_invalid_data(WebDriver driver) {
ClickOn_UserGroup(driver);
EditLink.click();
UserGroupName.clear();
UserGroupName.sendKeys(read.getsheetnumber(42, 2, 0));
AccessPermission_None.click();
ModifyPermission_None.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name must be between 3 and 64 characters!", "User Group edit with invalid data failed");
sAssert.assertAll();
}

/*//Editing User group with duplicate data
public void UserGroup_Edit_with_duplicate_data(WebDriver driver) {
ClickOn_UserGroup(driver);
EditLink.click();
UserGroupName.clear();
UserGroupName.sendKeys(read.getsheetnumber(42, 3, 0));
AccessPermission_None.click();
ModifyPermission_None.click();
SubmitBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrpName_msg.getText(), "User Group Name already exist!", "User Group edit with duplicate data failed");
sAssert.assertAll();
}*/

//Editing User group by clicking cancel
public void UserGroup_Edit_with_Cancel(WebDriver driver) {
ClickOn_UserGroup(driver);
EditLink.click();
UserGroupName.clear();
UserGroupName.sendKeys(read.getsheetnumber(42, 1, 0));
AccessPermission_None.click();
ModifyPermission_None.click();
CancelBtn.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(UserGrp_Title.getText(), "User Groups", "User groups Edit cancel Assertion Failed");
sAssert.assertAll();
}

//Navigation to home page from user group insert and Edit page
public void Navigate_To_HomePage_from_UserGroup(WebDriver driver){
ClickOn_UserGroup(driver);
InsertBtn.click();
HomeLink.click();
SoftAssert sAssert = new SoftAssert();
sAssert.assertEquals(Dashbrd_Title.getText(), "Dashboard", "Navigate from User group insert to home page failed");
ClickOn_UserGroup(driver);
EditLink.click();
HomeLink.click();
sAssert.assertEquals(Dashbrd_Title.getText(), "Dashboard", "Navigate from User group edit to home page failed");
sAssert.assertAll();
}

//Pagination for next to previous & Previous to next (Precondition more than 30 user groups needed)
public void Pagination_in_Usergroup(WebDriver driver) {
ClickOn_UserGroup(driver);
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
