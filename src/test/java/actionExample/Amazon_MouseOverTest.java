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

public class Amazon_MouseOverTest {

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
		Thread.sleep(7000);
		driver.close();

//		driver.quit();

	}

	@Test()
	public void verifyAmazonSearchItem() throws Exception {

		WebElement btn_signLin = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		WebElement lnk_CreateWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		//app1
		Actions act = new Actions(driver);
//		//perform at the end of method chain
//		act.moveToElement(btn_signLin).perform();
//		act.moveToElement(lnk_CreateWishList).perform();
//		act.click().perform();
		
		
		//app2
//		act.moveToElement(btn_signLin).perform();
//		act.click(lnk_CreateWishList).perform();
		
		
		
		//app3
		act.moveToElement(btn_signLin).click(lnk_CreateWishList).perform();
		
		
		
	}

}
