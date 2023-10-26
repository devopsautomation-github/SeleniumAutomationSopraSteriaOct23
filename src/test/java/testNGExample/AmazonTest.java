package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
	//pre-condition ----- Before --------BeforeSuite -----BeforeTest ----BeforeClass -----BeforeMethod
	//testcase ----- @Test
	//post-condition ----- After --------AfterSuite -----AfterTest ----AfterClass -----AfterMethod
	
	
	
	
	//execution workflow 
	//login -----addItem ----logout
	
	//priority
	
	//highest negative number having highest priority
	//by default priority ----- 0
	//if priority is same ----- execution as naming conv  ----- ASCII value
	
	
	
	


	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("==========launchApp================");
		
	}
	
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("==========closeApp================");
		
	}
	
	
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	
	@Test(priority = 3)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 2)
	public void addItem() {
		
		System.out.println("addItem test case");
		
	}
	
	
	@Test(priority = 2)
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	


}
