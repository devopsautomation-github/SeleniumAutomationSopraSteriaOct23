package actionExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiltity.Constants;

public class DragDropExample {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an applicaiton");

		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void closingApp() throws Exception {

		System.out.println("closingApp an applicaiton");
		Thread.sleep(7000);
//		driver.close();

//		driver.quit();

	}

	
	
	@Test()
	public void verifyDragDropTest() throws Exception {
		
		
		//concept missing   ------- 
		
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("name or id");
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*=\"droppable/photo-manager\"]"));
		driver.switchTo().frame(myFrame);
		
		

		WebElement img3 = driver.findElement(By.cssSelector("[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		//app1
		Actions act = new Actions(driver);
		
		
		//dragdropMethod
		act.dragAndDrop(img3, trash).perform();
		
		
		
		
		
		
		
		
		
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		//app3
//		act.clickAndHold(img4).moveToElement(trash).release().build().perform();
		
	}

}
