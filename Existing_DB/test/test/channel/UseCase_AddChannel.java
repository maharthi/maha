package test.channel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.channelspage.Channels_Page;

import test.baseclass.BaseClass;

public class UseCase_AddChannel extends BaseClass {
	
	@Test(priority=2)
	public void Channel_Create() throws InterruptedException {
	Channels_Page Channel = PageFactory.initElements(driver,Channels_Page.class);
	Channel.UseCase_Create_Channel(driver);
 }
}
