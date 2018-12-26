package test.broadcaster_group;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.broadcaster_group.Broadcaster_Page;

import test.baseclass.BaseClass;

public class Usecase_Broadcaster extends BaseClass {
	@Test(priority=1)
	 public void Broadcaster_Create_UC()
	 {
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 Broadcaster_Page Broadcaster = PageFactory.initElements(driver,Broadcaster_Page .class);
		 Broadcaster.UseCase_BroadcasterGroup();
	  }
}
