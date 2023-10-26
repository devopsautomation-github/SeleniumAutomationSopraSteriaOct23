package utiltity;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	@Before
	public void launchApp() {
		
		System.out.println("launching an applicaiton");
		
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}
	
	
	@After
	public void closingApp() throws Exception {
		
		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
		driver.close();
	}

}
