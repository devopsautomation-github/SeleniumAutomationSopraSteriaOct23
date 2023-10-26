package handleFrameExample;

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

public class HandleFrame {
	
	
public WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an applicaiton");
		
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closingApp() throws Exception {
		
		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
		driver.close();
		
//		driver.quit();
		
	}
	
	
	
	@Test
	public void verifyFrame() throws Exception {
		
		//handle to handle an alert
		
		//alert/frame/window ------ driver.switchTo()
		
		//index --- start from 0
		//name or id 
		//WebElement 
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("name or id");
		
		
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		driver.switchTo().frame(myFrame);
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		
		System.out.println("*************" + img3.getAttribute("alt"));				//Planning the ascent
		
		
		
		
	}
	
	
	


}
