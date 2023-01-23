package com.obsqura.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageUtility {
	public WebDriver driver;
	public void fileUpload(WebDriver driver,WebElement fileUpload)
	{
		fileUpload.sendKeys("C:\\Users\\DELL PC\\Downloads\\krishnammaadhar.jpg");
	}
	public void selectdropDownValue(WebElement element,String valuetobeSelected)
	{
		List<WebElement> values=element.findElements(By.tagName("span"));
		for(WebElement value: values)
		{
			System.out.println(value.getText());
			if(value.getText().equals(valuetobeSelected))
			{
				value.click();
				break;
			}
		}
	}
	public void selectdropDownActions(WebElement element,String valuetobeSelected)
	{
		
		List<WebElement> values=element.findElements(By.tagName("li"));
		for(WebElement value: values)
		{
			System.out.println(value.getText());
			if(value.getText().equals(valuetobeSelected))
			{
				value.click();
				break;
			}
		}
	}
}
