package Bustle.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class SignUppage extends BaseClass {
	
	By signuplink = By.xpath("//a[.='Sign Up']");
	By emailid = By.name("email-id");
	By fullname = By.name("first-name");
	By password = By.name("password");
	By confirmpassword = By.name("confirm-password");
	By signupbutton = By.xpath("//button[.='Sign Up']");
	By ErrorMsg = By.xpath("//p[.='Error!']");
	
	public void Signupapplication()
	{
		Signupapplication("Arun.havale@softsuave.com","Arun Havale","1234abcd","1234abcd");
	}
    	
	public void gotoSignUpPage()
	{
		
		WebElement SignUpLink = driver.findElement(signuplink);
		SignUpLink.click();
	}
		
	public void Signupapplication(String email,String name,String pwd,String Confirm_pwd)
	{
		WebElement EmailID = driver.findElement(emailid);
		WebElement FullName = driver.findElement(fullname);
	    WebElement Password = driver.findElement(password);
	    WebElement ConfirmPassword = driver.findElement(confirmpassword);
	    WebElement SIGNUP = driver.findElement(signupbutton);
	    EmailID.sendKeys(email);
	    FullName.sendKeys(name);
	    Password.sendKeys(pwd);
	    ConfirmPassword.sendKeys(Confirm_pwd);
	    SIGNUP.click();
	    
	    waitForElement(ErrorMsg);
	   String ErrorMsgText = driver.findElement(ErrorMsg).getText();
	  // System.out.println(ErrorMsgText);
	  Assert.assertEquals(ErrorMsgText,"ERROR!" );
	 }
}
