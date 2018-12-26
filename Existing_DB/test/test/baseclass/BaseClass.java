package test.baseclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.loginpage.Login_Page;
import com.utility.ConfigReader;
import excelreader.ExcelReader;



public class BaseClass 
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void validtest()
	{		
	  ConfigReader read=new ConfigReader();
	  System.setProperty("webdriver.chrome.driver" , read.getChrome());
	  driver = new ChromeDriver();
	  driver.get(read.ApplicationUrl());
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Login_Page obj=PageFactory.initElements(driver, Login_Page.class);
      obj.login("admin", "passwd");
   }
	 
	
     
   public static void parent()
   {
	   Set<String> all=driver.getWindowHandles();
       Iterator<String> itr= all.iterator();
       String parent=itr.next();
       String child=itr.next();
       driver.switchTo().window(child);
       driver.close();
       driver.switchTo().window(parent);
   }
	 
   public static void child()
   {
	   Set<String> all=driver.getWindowHandles();
       Iterator<String> itr= all.iterator();
       String parent=itr.next();
       String child=itr.next();
       driver.switchTo().window(child);
      // driver.close();
       //driver.switchTo().window(parent);
   }
	/*@AfterMethod()
	public void teardown(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		TakeScreenShoot.TakeScreenshot(result.getName().toString().trim());
		}	
	}
	

    @AfterMethod
	//To take screenshot on fail of test methods
	public void TestOnFail(ITestResult result) throws IOException {
		  	if(ITestResult.FAILURE==result.getStatus()) {
		  		String methodName = result.getName().toString().trim();
		  		TakeScreenshot(methodName);
		  		webelement_Category obj=PageFactory.initElements(driver, webelement_Category.class);
		  		obj.Take_Screen_Shot_Data_Tab();
		  		TakeScreenshot(methodName +"Data");
		  		obj.Take_Screen_Shot_Design_Tab();
		  		TakeScreenshot(methodName +"Design");
		  		System.out.println(methodName + ":Screenshot taken");
		  		//obj.Errors();
		  	}
}*/
		/*			
	@AfterSuite()
	public void browserclose()
	{
		driver.close();
	}
	*/
	
	//login credintials
	@DataProvider(name="logincredintials")
	public Object[][] loginvalues()
	{
		ExcelReader load = new ExcelReader();
		int rowdetails=load.getrowcount(0);		
		Object[][] data =new Object[rowdetails][2];
		for(int i=0;i<rowdetails;i++)
		{			
			data[i][0]=	load.getsheetnumber(0, i, 0);
			data[i][1]=	load.getsheetnumber(0, i, 1);
		}
		return data;
			
	}
	
}
