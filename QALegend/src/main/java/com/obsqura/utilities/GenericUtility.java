package com.obsqura.utilities;

import java.util.Random;

import org.openqa.selenium.WebElement;

public class GenericUtility {
	public void getRandomNumber(WebElement element)
	{
		element.click();  
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		element.sendKeys("username"+ randomInt +"@gmail.com"); 
	}

}
