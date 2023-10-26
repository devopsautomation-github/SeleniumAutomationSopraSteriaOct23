package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import controlExample.BaseTest;

public class HandleAlertTest extends BaseTest{
	
	
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
		
		System.out.println("Alert Text: "+ alertText);				//Your Name Please
		
		Thread.sleep(3000);
		String name = "abhishek";
		
		System.out.println("============entering value onto prompt========================");
		
		promptAlert.sendKeys(name);
		
		Thread.sleep(3000);
		
		//accept ---- ok 
		promptAlert.accept();
		
		//accept ---- cancel 
//		promptAlert.dismiss();
		
		Assert.assertTrue(alertText.contains("Your Name Please"));				//Your Name Please
		
		
		
		
		
		
		
	}

}
