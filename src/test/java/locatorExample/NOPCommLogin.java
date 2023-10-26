package locatorExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class NOPCommLogin {

	WebDriver driver;

	@Before
	public void launchApp() {

		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}
	
	@After
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
		
		Assert.assertEquals("admin", actualAttValue_Password);
		
		
		Thread.sleep(2000);
		//xpath
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		
		
		
		
		//CSS

		
		driver.findElement(By.cssSelector("[href='/logout']")).click();
		
		
		
	}
}
