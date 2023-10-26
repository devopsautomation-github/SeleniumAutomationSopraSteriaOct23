package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage2 {

	WebDriver driver;

	public LoginPage2(WebDriver driver) {

		this.driver = driver;

	}
	
	
	//Identification
	
	By txt_Email = By.cssSelector("input#Email");
	By txt_Pass = By.cssSelector("input#Password");
	By chk_rem = By.xpath("//input[@name='RememberMe']");
	By btn_login = By.tagName("button");
	By btn_logout = By.partialLinkText("Logo");
	By lbl_Email = By.xpath("//label[@for='Email']");
	
	

	//methods
	public void enterEmail(String email) {

		driver.findElement(txt_Email).clear();
		driver.findElement(txt_Email).sendKeys(email);

	}

	public void enterPass(String pwd) {

		driver.findElement(txt_Pass).clear();
		driver.findElement(txt_Pass).sendKeys(pwd);

	}

	public void clickLoginButton() {

		driver.findElement(btn_login).click();

	}
	
	public void click_RemCheckbox() {

		driver.findElement(chk_rem).click();

	}
	
	
	public void clickLogoutButton() {

		driver.findElement(btn_logout).click();

	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	

}
