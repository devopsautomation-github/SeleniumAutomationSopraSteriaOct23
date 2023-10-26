package javascriptExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiltity.Constants;

public class MyntraApp_ScrollExample {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an applicaiton");

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

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
	public void verifyAmazonSearchItem() throws Exception {

		//javascript
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lbl_returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'within 14days')] "));
		
		
		
//		js.executeScript("alert('hello everyone, happy learning!!')");
		js.executeScript("arguments[0].scrollIntoView()", lbl_returnPolicy);
		

	}



}
