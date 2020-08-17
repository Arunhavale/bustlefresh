package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.LoginPage;

public class LoginTest extends LoginPage{
	
	
	@Test
	public void validLoginTest()
	{
		loginToApplication();
		verifysuccessMsg();
	}
	
	@Test
	public void invalidLoginTest1()  
	{
	   String invalidEmail ="Arun.havale@gmail.com";
	   String validPassword = "Havale@1994";
		loginToApplication(invalidEmail,validPassword);
		verifyErrorMsg();
	}
	
	@Test
	public void invalidLoginTest2()
	{
		 String invalidEmail ="Arun@gmail.com";
		   String invalidPassword = "Hajkfk";
		loginToApplication(invalidEmail,invalidPassword);
		verifyErrorMsg();
	}
    
	@Test
	public void invalidLoginTest3()
	{
		loginToApplication(" ","");
		verifyNoEmailpasswordErrorMsg();
	}
}
