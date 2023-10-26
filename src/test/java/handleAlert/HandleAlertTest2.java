package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiltity.Constants;

public class HandleAlertTest2 {
	
	
public WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an applicaiton");
		
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91995/Downloads/Test%20(2).html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closingApp() throws Exception {
		
		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	//@Test
	public void verifySimpleAlert() throws Exception {
		
		WebElement simpleLAertButton = driver.findElement(By.xpath("//input[contains(@value,'Alert')]"));
		simpleLAertButton.click();
		
		Thread.sleep(5000);
		
		
		//handle to handle an alert
		
		//alert/frame/window ------ driver.switchTo()
		
		
		
		//getText
		//accept ---- ok
		//dismiss ---- cancel
		//sendKeys
		
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertText = simpleAlert.getText();
		
		System.out.println("Alexrt Text: "+ alertText);
		simpleAlert.accept();
		
		Assert.assertTrue(alertText.contains("alert message!"));				//Hi.. This is alert message!
		
		
	}
	
	
	

	//@Test
	public void verifyConfirmAlert() throws Exception {
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[contains(text(),'Confirmation')]"));
		confirmAlert.click();
		
		Thread.sleep(5000);
		
		
		//handle to handle an alert
		
		//alert/frame/window ------ driver.switchTo()
		
		
		
		//getText
		//accept ---- ok
		//dismiss ---- cancel
		//sendKeys
		
		Alert confirmAlertElement = driver.switchTo().alert();
		
		String alertText = confirmAlertElement.getText();
		
		System.out.println("Alert Text: "+ alertText);
		
		//accept ---- ok 
//		confirmAlertElement.accept();
		
		//accept ---- cancel 
		confirmAlertElement.dismiss();
		
		Assert.assertTrue(alertText.contains("'OK' or 'Cancel'"));				//Press 'OK' or 'Cancel' button!
		
		
		
		
		String OK_cancel_verify = driver.findElement(By.cssSelector("#demo")).getText();
		
		System.out.println("**********************: " + OK_cancel_verify);		//You pressed Cancel!
		
		
	}
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
		
		WebElement promtpAlertButton = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		promtpAlertButton.click();
		
		Thread.sleep(5000);
		
		
		//handle to handle an alert
		
		//alert/frame/window ------ driver.switchTo()
		
		
		
		//getText
		//accept ---- ok
		//dismiss ---- cancel
		//sendKeys
		
		Alert promptAlert = driver.switchTo().alert();
		
		String alertText = promptAlert.getText();
		
		System.out.println("Alert Text: "+ alertText);				//Please enter your name:
		
		Thread.sleep(3000);
		String name = "lavanya gupta";
		
		System.out.println("============entering value onto prompt========================");
		
		promptAlert.sendKeys(name);
		
		Thread.sleep(3000);
		
		//accept ---- ok 
		promptAlert.accept();
		
		//accept ---- cancel 
//		promptAlert.dismiss();
		
		Assert.assertTrue(alertText.contains("Please enter your name:"));				//Please enter your name:
		
		
		
		
		String OK_cancel_verify = driver.findElement(By.cssSelector("#demoPrompt")).getText();
		
		System.out.println("**********************: " + OK_cancel_verify);		//You pressed Cancel!
		
		Assert.assertTrue(OK_cancel_verify.contains(name));
		
		
	}

}
