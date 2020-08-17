package Bustle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TasksPage extends BaseClass{
	
	By tasksicon = By.xpath("//span[.='Tasks']");
	By addtasks = By.xpath("//button[.='Add Task']");
	By taskname = By.name("taskName");
	By save = By.xpath("//button[.='Save']");
	
	 public void clickonTaskIcon()
	 {
		WebElement TasksIcon = driver.findElement(tasksicon); 
	    TasksIcon.click();
	 }
	 
	 public void clickonAddTasks()
	 {
		 WebElement AddTasks =  driver.findElement(addtasks);
		 AddTasks.click();
	 }
      
	 public void enterTaskName(String task)
	 {
		 WebElement TaskName = driver.findElement(taskname);
		 TaskName.sendKeys(task);
	 }
	 
	 public void clickonSaveButton()
	 {
		 WebElement Save = driver.findElement(save);
		 Save.click();
	 }
}
