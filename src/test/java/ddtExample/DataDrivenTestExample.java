package ddtExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestExample extends BaseTest{
	
	
	@Test(dataProvider = "regressionTest")
	public void verifyLoginWithInValidCred(String email, String pwd) throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		//==============================================
		
//		driver.getPageSource();
		
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful."));
		Thread.sleep(3000);
		
				
	}
	
	
	@DataProvider
	public Object[][] smokeTest() {
		
		Object [] [] data = { {"Deepashu@gmail.com", "welcome"}, {"fehmi@google.com", "welcome"},  {"Dushyant@google.com", "2340923"} };
		return data;
		
	}
	
	
	@DataProvider
	public Object[][] regressionTest() {
		
		Object [] [] data = { {"Deepashu_regression@gmail.com", "welcome"}, {"fehmi_regression@google.com", "welcome"},  {"Dushyant_regression@google.com", "2340923"},  {"Anshal_regression@yahoo.com", "2340923"} };
		return data;
		
	}
	

}
