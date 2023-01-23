package com.obsqura.utilities;


import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DateUtility{

	public void selectDate(WebDriver driver,String targetDate,String dateFormat) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy"); 
        //SimpleDateFormat targetDateFormat=new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
        Date formattedTargetDate;
       
        	targetDateFormat.setLenient(false);
        	formattedTargetDate=targetDateFormat.parse(targetDate);
        	System.out.println(formattedTargetDate);
        	calendar.setTime(formattedTargetDate);
        	int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
        	int targetMonth=calendar.get(Calendar.MONTH);
        	int targetYear=calendar.get(Calendar.YEAR);
        	
        	
       
        
	}
        
}
