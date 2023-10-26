package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleInputBox extends BaseTest{
	
	
	@Test
	public void verifyInputBox() {
		
		//enter value into first name
		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("enter first name");
		
		
		
		boolean isLastName_enabled = driver.findElement(By.cssSelector("[name=\"lname\"]")).isEnabled();
		
		
		
		System.out.println("last name enabled or disabled: " + isLastName_enabled);
		//enter value into last name
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		
		
//		driver.findElement(By.cssSelector("[name=\"lname\"]")).sendKeys("enter last name");
		
		WebElement txt_lname = driver.findElement(By.cssSelector("[name=\"lname\"]"));

		
		
		JS.executeScript("arguments[0].value='enter value into last name';", txt_lname);
		
	}

}
