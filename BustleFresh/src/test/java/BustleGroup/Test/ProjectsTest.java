package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.LoginPage;
import Bustle.pages.ProjectPage;

public class ProjectsTest extends ProjectPage{
	
	@Test
	public void ProjectsTest1() throws InterruptedException
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		addProject("Lifejourney","ArunH");
	}

}
