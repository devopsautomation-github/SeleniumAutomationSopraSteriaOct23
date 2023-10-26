package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckBoxBoxradioButton extends BaseTest{
	
	
//	@Test
//	public void verifyCheckboxBox() {
//		
//		
//		driver.findElement(By.cssSelector("[value='Boat']")).click();
//
//		
//	}

	
	
	
	@Test
	public void verifyCheckboxBox() {
		
		
//		driver.findElement(By.cssSelector("[type=\"checkbox\"]")).click();			//multiple match ---- perform action on first element
		
		
		
//		//indexing start from 0
//		driver.findElements(By.cssSelector("[type=\"checkbox\"]")).get(0).click();
//		driver.findElements(By.cssSelector("[type=\"checkbox\"]")).get(1).click();
//		driver.findElements(By.cssSelector("[type=\"checkbox\"]")).get(2).click();

		
		
		List<WebElement>   all_checkbox = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		
		System.out.println("checkbox count: " + all_checkbox.size());
		
		
		
		
		for (int i = 0; i < all_checkbox.size(); i++) {
			
			
			driver.findElements(By.cssSelector("[type=\"checkbox\"]")).get(i).click();
		}
		
		
		
		System.out.println("==================================================");
		
		boolean isBoatCheckboxSelected =  driver.findElement(By.cssSelector("[value='Boat']")).isSelected();
		
		System.out.println("isBoatCheckboxSelected: " + isBoatCheckboxSelected);
		
		
	}
	
	
	@Test
	public void verifyRadioButton() {
		
		driver.findElement(By.cssSelector("input[value='female']")).click();
	}
	
	
	
}
