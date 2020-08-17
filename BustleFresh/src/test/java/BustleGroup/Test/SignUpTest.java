package BustleGroup.Test;

import org.testng.annotations.Test;

import Bustle.pages.SignUppage;

public class SignUpTest extends SignUppage{
	
	@Test
	public void SignUp()
	{
		gotoSignUpPage();
		Signupapplication();
	}
	
	

}
