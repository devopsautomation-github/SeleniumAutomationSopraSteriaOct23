package takeScreenshotExample;

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
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utiltity.Constants;

public class CaptureScreenshotAmazonExample {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an applicaiton");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void closingApp() throws Exception {

		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
		driver.close();

//		driver.quit();

	}

	@Test()
	public void verifyAmazonSearchItem() throws Exception {

		WebElement txt_search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		txt_search.sendKeys("iphone 15 pro");

		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

		Thread.sleep(3000);

		// take a screenshot -------------- external ASHOT ------ JPEG format, Element

//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//		
//		
////		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		
//		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);							//captured a screenshot
//		
//		File targetLocation = new File(".\\sopraSteria_screenshot/AmazonSearchItem.png");
//		
//		
//		FileUtils.copyFile(screenshotFile, targetLocation);
		
//		getScreenshot("Amazon_DayTimeMin_random");
		
		
//		getScreenshot(result.getName());
		
		

	}

	public void getScreenshot(String fileName) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;

//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File screenshotFile = ts.getScreenshotAs(OutputType.FILE); // captured a screenshot

		File targetLocation = new File(".\\sopraSteria_screenshot/IMG_"+fileName+"_sopraSteria.png");

		FileUtils.copyFile(screenshotFile, targetLocation);

	}

}
