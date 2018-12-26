package test.validlogin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.loginpage.Login_Page;

import test.baseclass.BaseClass;

public class Login extends BaseClass
{
    @Test(dataProvider="logincredintials")
	public void validtest(String uname ,String pwd)
	{
    	
    	Login_Page obj=PageFactory.initElements(driver, Login_Page.class);
		obj.login(uname, pwd);
	}
	
}
