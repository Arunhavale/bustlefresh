package Bustle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProjectPage extends BaseClass {
	  
	
	    By projectsicon = By.xpath("//span[.='Projects']");
	    By addprojects = By.xpath("//button[.='Add Projects']");
	    By projectname =By.name("project-name");
	    By selectpmanager = By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[4]/div/form/div[5]/div/div/div[1]");
	    By save = By.xpath("//button[.='Save']");
	    
	    
	    public void clickonProjectsIcon()
	    {
	    	WebElement ProjectsIcon = driver.findElement(projectsicon);
	    	ProjectsIcon.click();
	    	Assert.assertEquals(driver.getCurrentUrl(), "http://bustle-spot.com/project#");
	    }
	    
	        
	    public void clickonAddProjects()
	    {
	    	WebElement AddProjects = driver.findElement(addprojects);
	    	AddProjects.click();
	    }
	    
	    	    
	    public void enterProjectName(String project)
	    {
	    	WebElement ProjectName = driver.findElement(projectname);
	    	ProjectName.sendKeys(project);
	    }
	    
	    
	    public void SelectProjectManager(String Person) throws InterruptedException
	    {
	    	waitForElement(selectpmanager);
	    	WebElement ProjectManager = driver.findElement(selectpmanager);
	    	ProjectManager.click();
	    	
	    	String xpath = "//*[text()='Replace']";
	    	xpath = xpath.replace("Replace",Person);
	    			  	
	    	WebElement managerOptions = driver.findElement(By.xpath(xpath));
	    	managerOptions.click();
	    }
	    
	    public void clickonSaveButton()
	    {
	    	WebElement Save = driver.findElement(save);
	    	Save.click();
	    }

	    
	    public void addProject(String projectName,String projectManagerName) throws InterruptedException
	    {
	    	clickonProjectsIcon();
	    	clickonAddProjects();
	    	enterProjectName(projectName);
	    	SelectProjectManager(projectManagerName);
	    	clickonSaveButton();
	    }
	    
//	    public void SelectProjectManager(String Person)
//	    {
//	    	waitForElement(selectpmanager);
//	    	WebElement ProjectManager = driver.findElement(selectpmanager);
//	    	ProjectManager.click();;
//	    	WebElement Pm = driver.findElement(By.xpath("//div[.='ArunH']"));
//	    	Pm.click();
//	    	
//	    }
}
