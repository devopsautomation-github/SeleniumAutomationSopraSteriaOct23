package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest2 {
	
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
		
		System.out.println("==========launchApp2================");
		
	}
	
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("==========closeApp2================");
		
	}
	
	
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case2");
		
	}
	
	
	@Test
	public void logout() {
		
		System.out.println("logout test case2");
		
	}
	
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case2");
		
	}
	


}
