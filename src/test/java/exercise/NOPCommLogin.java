package exercise;

import java.util.List;

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
			
		
		
		List<WebElement>  all_input_element = driver.findElements(By.tagName("input"));			//----- single element
		System.out.println("element count: " + all_input_element.size() );
		
		
		
		
		
		for (int i = 0; i < all_input_element.size(); i++) {
			
			
			String all_name_att = all_input_element.get(i).getAttribute("name");
			
			System.out.println("********************" + all_name_att);
			
			if(all_name_att.equals("Email")) {
				
				System.out.println("================do something===============");
				
				all_input_element.get(i).sendKeys("ashdlaslkdjlaksjdlk");
			}
			
		}
		
		
		
		
	}
}
