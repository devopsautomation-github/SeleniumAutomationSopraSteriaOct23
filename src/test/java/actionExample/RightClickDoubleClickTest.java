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

public class RightClickDoubleClickTest {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an applicaiton");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void closingApp() throws Exception {

		System.out.println("closingApp an applicaiton");
		Thread.sleep(7000);
		driver.close();

//		driver.quit();

	}

	@Test()
	public void verifyRightClickTest() throws Exception {

		WebElement btn_rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
//		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//app1
		Actions act = new Actions(driver);
		
		
		//rightclick ---- contextClick
		act.contextClick(btn_rightClick).perform();
		
		
	}
	
	
	@Test()
	public void verifyDoubleClickTest() throws Exception {

//		WebElement btn_rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//app1
		Actions act = new Actions(driver);
		
		
		//rightclick ---- contextClick
		act.doubleClick(btn_doubleClick).perform();
		
		
		
		
		//handle an alert
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + alertText);
		
		Assert.assertTrue(alertText.contains("double"));
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
