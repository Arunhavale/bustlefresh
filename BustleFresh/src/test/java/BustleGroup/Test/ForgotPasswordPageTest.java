package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.ForgotPassword;


public class ForgotPasswordPageTest extends ForgotPassword{
	
	@Test
	public void ForgotPassword()
	{
		
		clickonForgotPassword();
		enterDataIntoForgotPasswordPage("arun.havale@softsuave.com");
	}

}
