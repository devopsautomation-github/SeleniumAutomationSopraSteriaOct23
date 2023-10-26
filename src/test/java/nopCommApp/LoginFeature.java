package nopCommApp;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import utiltity.BaseTest;

public class LoginFeature extends BaseTest{

	
	@Test
	public void verifyLogin() {
		
		System.out.println("testing login fucntioanlity");
		
		driver.findElement(By.cssSelector("#RememberMe")).click();
		
		
		
	}
	
	
	@Before
	public void actionFromLocal() {
		System.out.println("======================actionFromLocal================");
		
	}
	
	
}
