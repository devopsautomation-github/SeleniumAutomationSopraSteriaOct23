package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handle_IRCTCWindow {
	
	
public WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an applicaiton");
		
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closingApp() throws Exception {
		
		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
//		driver.close();				//browser instance --- current focus
		
		driver.quit();				//all the instance
		
	}
	
	
	
	@Test
	public void verifyFrame() throws Exception {
		
		
		//Windows
		
		String parentWin = driver.getWindowHandle();            //current window unique id
		System.out.println("Parent Window ID: " + parentWin);
		
		
		
//		
//		Set<String> allWindow =  driver.getWindowHandles();								//no of windows opened by driver instance
//		
//		System.out.println("Window Count after launching an application: " + allWindow.size());
		
		
		
		
		//handle to handle an alert
		
		//alert/frame/window ------ driver.switchTo()
		
		
		
		WebElement hotel_lnk = driver.findElement(By.partialLinkText("HOTELS"));
		
		hotel_lnk.click();
		
		
		
		//driver.switchTo().frame(myFrame);
		
		
		Set<String> allWindow =  driver.getWindowHandles();								//no of windows opened by driver instance
		
		System.out.println("Window Count after click on Hotel link: " + allWindow.size());
		
		
		
		String win1 = (String)allWindow.toArray()[0];
		String win2 = (String)allWindow.toArray()[1];
		
		
		System.out.println("win1 Window ID: " + win1);
		System.out.println("win2 Window ID: " + win2);
		
		
		
		
		System.out.println("**************************: " +driver.getTitle());
		
		
		
		Thread.sleep(5000);
		//switch to window
		
		driver.switchTo().window(win2);
		
		System.out.println("**********switching to win2****************: " +driver.getTitle());
		
		
		
		//perform action on win2   ---- hotelWin
		
		//click on login
		driver.findElement(By.partialLinkText("Login")).click();
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.switchTo().window(win1);
		System.out.println("**********switching to win1****************: " +driver.getTitle());	
		
		
		//click on  CONTACT US 
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		
		
		
		
		
		Thread.sleep(5000);
		//switch to window
		
		driver.switchTo().window(win2);
		
		System.out.println("**********switching again to win2****************: " +driver.getTitle());
		
		
		
		if(driver.getTitle().contains("IRCTC Hotels")) {
			
			
		//enter value into username on MOdel dialog
		driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("sopraSteria@test.com");
		
		}
		
		
		
		Thread.sleep(5000);
		
		driver.switchTo().window(win1);
		System.out.println("**********switching again to win1****************: " +driver.getTitle());	
		
		
		
	}
	
	
	


}
