 package screenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import test.baseclass.BaseClass;




public class TakeScreenShoot extends BaseClass
{
	public static void TakeScreenshot(String MethodName)
	{
		
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy-HHmmSSS");
		    Date dateobj = new Date();
		    String TimeStamp = df.format(dateobj);
			FileUtils.copyFile(scrFile, new File(".\\Screenshot\\" + MethodName + TimeStamp +".png"));	
		    } 
		catch (Exception e) 
		    {
			System.out.println(e.getMessage());
			} 
		}
	
}


