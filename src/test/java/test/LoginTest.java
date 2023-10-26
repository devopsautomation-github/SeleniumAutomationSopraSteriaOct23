package test;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		LoginPage lp = new LoginPage(driver);
		
		
//		Actions act = new Actions(driver);
		
		lp.enterEmail("admin@yourstore.com");
		lp.enterPass("admin");
		
		lp.click_RemCheckbox();
		
		lp.clickLoginButton();
		
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		lp.clickLogoutButton();
		
		
		lp.verifyApplicationTitle("Your store. Login");
		
		
	}

}
