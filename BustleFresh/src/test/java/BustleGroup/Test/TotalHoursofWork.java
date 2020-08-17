package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.ActivityPage;
import Bustle.pages.LoginPage;

public class TotalHoursofWork extends ActivityPage {
	

	@Test
	public void TotalHours() 
	{
		LoginPage login = new LoginPage();
		login.loginToApplication();
		verifyTotalHoursWorkDone("00:00");
		verifyTotalBillableHours("00:00");
		verifyTotalActivity("0%");
		verifyTotalNoOfUsers("0");
		selectDateFromCalendar("10","20","March","2018");
	}

}
