package crossBrowserTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utiltity.Constants;


public class NOPCommLogin {

	WebDriver driver;

	
	
	@Parameters("br")
//	@Parameters({"br", "platform", "mobiledevice"})
	@BeforeTest
	public void launchApp(String browserDetails) {
		
//		public void launchApp(String browserDetails, String plat, String mob) {


		Constants con = new Constants();
		
		
		System.out.println("access value from Constant class file: " + con.browser);
		System.out.println("access value from Constant class file: " + Constants.browser);
		
		System.out.println("access value from testNG XML using paramter: " + browserDetails);
//		System.out.println("access value from testNG XML using paramter .... platform: " + plat);
//		System.out.println("access value from testNG XML using paramter  .... mobiledevice: " + mob);
		
		//Constants.browser = "chrome";
		//System.out.println("********************" + Constants.browser);
		
		
		String sopra_steria_browser = browserDetails;
		
		
		
		
		
		
		if(sopra_steria_browser.equalsIgnoreCase("CHROME")) {
			
			System.out.println("execution of test on chrome browser");
			driver = new ChromeDriver();
			
		}
		
		else if(sopra_steria_browser.equalsIgnoreCase("edge")) {
			System.out.println("execution of test on edge browser");
			driver = new EdgeDriver();
		}
		
		else if(sopra_steria_browser.equalsIgnoreCase("firefox")) {
			System.out.println("execution of test on firefox browser");
			driver = new FirefoxDriver();
		}
		
		else {
			
			System.out.println("==============execution of test on default browser =============");
			driver = new ChromeDriver();
		}
		
	//	driver = new ChromeDriver();
		
		
		
		//execute test on edge browser
		
//		driver = new EdgeDriver();
		
		
		
		//execute test on firefox browser
		
//		driver = new FirefoxDriver();
		
		
		
		driver.get(Constants.nop_app);

	}
	
	@AfterTest
	public void closeApp() throws Exception {

		
		//close the browser
		Thread.sleep(5000);
		driver.close();
//		driver.quit();

	}

	@Test
	public void verifyLoginFeature() throws Exception {
			//perform an action on element on page
	
//		id
//		className
//		name
//		tagname
//
//		linkText
//		partialLinkText
//
//
//		xpath
//		css Selector

//		boolean name = true;
		
		
		//ID
		WebElement txt_email = driver.findElement(By.id("Email"));
		
		txt_email.clear();
		txt_email.sendKeys("admin@yourstore.com");
		
		Thread.sleep(3000);
		
		//Name ---- password
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");;
		
		
		//name
		driver.findElement(By.name("RememberMe")).click();
		
		
		//tagname ---- login button
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(2000);
		System.out.println("Application Title after login: " + driver.getTitle());
		
		
		//linkText  ------ extact text
		
//		driver.findElement(By.linkText("Logout")).click();
		
		
		//partiallinkText
		driver.findElement(By.partialLinkText("ogou")).click();
		
		
		Thread.sleep(2000);
		System.out.println("Application Title after logout: " + driver.getTitle());
		Thread.sleep(2000);
		
		
		
		
		//classname ------ password
		String actualAttValue_Password = driver.findElement(By.className("password")).getAttribute("value");
		
		System.out.println("Value of password field: " + actualAttValue_Password);
		
		Assert.assertEquals( actualAttValue_Password, "admin");
		
		
		Thread.sleep(2000);
		//xpath
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		
		
		
		
		//CSS

		
		driver.findElement(By.cssSelector("[href='/logout']")).click();
		
		
		
	}
}
