package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.LoginPage;
import Bustle.pages.MembersPage;

public class MembersPageTest extends MembersPage{

	@Test
	public void AddMembers()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		addMember("Bustleuser@gmail.com");
		
	}
	
	@Test
	public void assignProject()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		assignProject("DataBase Testing","User");
	}
}
