package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.ActivityPage;
import Bustle.pages.LoginPage;

public class ActivityTest extends ActivityPage {
	
	

	@Test
	public void activitytest1(){
		LoginPage l = new LoginPage();
		l.loginToApplication();
		selectProject("AutomationTesting");
		selectName("ArunH");
		//selectDateFromCalendar("7","20","July","2019");	
		
	}
	
	@Test
	public void viewDetailsOfUser()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		viewDetails();
	}
	
	@Test
	public void viewScreenshotsOfUser()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		ViewScreeshot();
	}


}
