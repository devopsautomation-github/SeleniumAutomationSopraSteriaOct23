package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropDownExample extends BaseTest{
	
	
	@Test
	public void verifyListBox() throws Exception {
		
		WebElement countryList = driver.findElement(By.cssSelector("[name='FromLB']"));
		
		
		
		Select list = new Select(countryList);
		
		System.out.println("is countryList accept multiple selection or not: " + list.isMultiple());				//true
		Assert.assertTrue(list.isMultiple());
		
		
		//Selection 
		//index  ----- start from 0
		//visibleText
		//value
		
		list.selectByIndex(0);						//USA
		list.selectByIndex(1);						//Russia
		
		Thread.sleep(2000);
		list.selectByValue("India");				//India
		
		Thread.sleep(2000);
		list.selectByVisibleText("Spain");			//Spain
		
		
		Thread.sleep(5000);
		
		list.deselectByValue("USA");	
		
		Thread.sleep(2000);
		list.deselectByVisibleText("Spain");
		
		
		Thread.sleep(3000);
		
		list.deselectAll();
		
		
		Thread.sleep(3000);
		list.selectByValue("India");
		
		
	}
	
	
	
	@Test
	public void verifyCarListBox() throws Exception {
		
		WebElement carList = driver.findElement(By.xpath("//select"));				//by default --- perform an action on first element
		
		
		
		Select list = new Select(carList);
		
		System.out.println("is carList accept multiple selection or not: " + list.isMultiple());				//false
		Assert.assertFalse(list.isMultiple());
		
		
		//Selection 
		//index  ----- start from 0
		//visibleText
		//value
		
		
		list.selectByIndex(1);						//Saab
		
		Thread.sleep(2000);
		list.selectByValue("USA");					//Volvo
		
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota");			//Toyota
		
		
		
		
		
	}

}
