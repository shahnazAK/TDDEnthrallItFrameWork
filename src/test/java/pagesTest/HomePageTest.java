package pagesTest;


import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void clickLogInFromTollberTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.clickLogInFromTollber();
		homePage.OppenApplicationPageandClickSubmitButton();
		
//	Thread.sleep(4000);
//	homePage.sendKeysUserId();
//	Thread.sleep(3000);
//	homePage.sendKeysPassWord();
//	Thread.sleep(3000);
//	homePage.clickLogInButton();
//	Thread.sleep(5000);
//	homePage.clickAutomation();
//	Thread.sleep(3000);
//	homePage.clickEnrollNow();
	}

	
}