package nopComm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class NOPCommLogin {

	// pre-condition ------- before
	// testcase ----- Test
	// post-condition ----After
	
//	WebDriver driver;
	
	WebDriver driver;

	@Before
	public void launchApp() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	@After
	public void closeApp() throws Exception {

		
		//close the browser
		Thread.sleep(5000);
		driver.close();
//		driver.quit();

	}

	@Test
	public void verifyAppTitle() {

		System.out.println("Application title: "+ driver.getTitle());
		System.out.println("Application URL: "+ driver.getCurrentUrl());		//actual value
		
		
		
		
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		Assert.assertTrue("error message: validation of application URL get failed !!", driver.getCurrentUrl().contains("/auth/login1") );
		
		
		
		if(driver.getTitle().contains("google")) {
			
			System.out.println("test case validation pass");
		}
		
		else {
			
			System.out.println("test case validation failed !!");
			
			System.out.println("===============error message ===================");
		}

	}
	
	
	

	


}
