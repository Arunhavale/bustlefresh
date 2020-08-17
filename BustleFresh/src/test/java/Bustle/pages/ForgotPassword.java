package Bustle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bustle.pages.BaseClass;

public class ForgotPassword extends BaseClass{
	By forgotpassword =By.xpath("//a[.='Forgot Password?']");
	By emailId = By.name("email-id");
	By submit = By.xpath("//button[.='Submit']");
	By succeccmsg = By.className("message-sec");
	
	public void clickonForgotPassword()
	{
		LoginPage l =new LoginPage();
		l.loginToApplication(" "," ");
		WebElement ForgotPassword = driver.findElement(forgotpassword);
		ForgotPassword.click();
	}
	
	
	public void enterDataIntoForgotPasswordPage(String email)
	{
		//driver.get("http://bustle-spot.com/");
		WebElement EmailID = driver.findElement(emailId);
		WebElement SUBMIT = driver.findElement(submit);
		EmailID.sendKeys(email);
		SUBMIT.click();
		waitForElement(succeccmsg);
		System.out.println("Mail sent Notification :" + driver.findElement(succeccmsg).getText());
		
	}
}
