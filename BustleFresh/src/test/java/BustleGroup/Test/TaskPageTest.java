package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.LoginPage;
import Bustle.pages.TasksPage;

public class TaskPageTest extends TasksPage{
	
	@Test
	public void AddTask1()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		clickonTaskIcon();
		clickonAddTasks();
		enterTaskName("watering the trees");
		clickonSaveButton();
	}

}
