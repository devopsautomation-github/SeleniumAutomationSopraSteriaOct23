package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	//Identification
	
//	By txt_Email = By.cssSelector("input#Email");
//	By txt_Pass = By.cssSelector("input#Password");
//	By chk_rem = By.xpath("//input[@name='RememberMe']");
//	By btn_login = By.tagName("button");
//	By btn_logout = By.partialLinkText("Logo");
//	By lbl_Email = By.xpath("//label[@for='Email']");
	
	
	//pageObject Model ----- pageFactory
	
	
	@FindBy(css = "input#Email")
	WebElement txt_email;
	
	@FindBy(css = "input#Password")
	WebElement txt_pass;
	
	
	@FindBy(xpath  = "//input[@name='RememberMe']")
	WebElement chk_rem;
	
	
	@FindBy(tagName  = "button")
	WebElement btnLogin;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btnLogout;
	
	@FindBy(xpath = "//label[@for='Email']")
	WebElement lbl_Email;
	
	
	
	

	//methods
	public void enterEmail(String email) {

		txt_email.clear();
		txt_email.sendKeys(email);

	}

	public void enterPass(String pwd) {

		txt_pass.clear();
		txt_pass.sendKeys(pwd);

	}

	public void clickLoginButton() {

		btnLogin.click();

	}
	
	public void click_RemCheckbox() {

		chk_rem.click();

	}
	
	
	public void clickLogoutButton() {

		btnLogout.click();

	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	

}
