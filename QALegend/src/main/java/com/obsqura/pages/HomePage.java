package com.obsqura.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.Excelutilities;




public class HomePage {

	public WebDriver driver;
	Excelutilities excelUtilities=new Excelutilities();
	@FindBy(xpath = "//input[@name='emailto']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='subject_']")
	WebElement Subject;
	@FindBy(xpath = "//textarea[@id='body_']")
	WebElement Message;
	@FindBy(xpath = "//*[contains(text(),'Send                ')][1]")
	WebElement Send;
	@FindBy(xpath = "//*[contains(text(),'More Info')] [1]")
	WebElement reparation;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/customers']")
	WebElement customer;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory']")
	WebElement inventory;
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement PhNo;
	@FindBy(xpath="//form[@id='send_quicksms']//following::textarea[1]")
	WebElement SMS;
	@FindBy(xpath="//*[contains(text(),'Send                ')]")
	WebElement sendSMS;
	@FindBy(xpath = "//*[contains(text(),'This value should be a valid email.')]")
	WebElement Invalidemail;
	@FindBy(xpath="//*[contains(text(),'Joe Jacobs')][1]")
	WebElement name;
	@FindBy(xpath="//*[contains(text(),'Sign out')]")
	WebElement signout;
	@FindBy(xpath="//*[contains(text(),'Sign in to start your session')]")
	WebElement loginPage;
	@FindBy(xpath="//*[contains(text(),'Logged In Successfully')]")
	WebElement LoginSuccess;
	@FindBy(xpath="//li[text()='This value is required.']")
	WebElement invalidSMS;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getSendInvalidEmailDetails(String email,String subject,String message) throws InterruptedException
	{
		Email.sendKeys(email);
		Subject.sendKeys(subject);
		Message.sendKeys(message);
		Send.click();
	}
	public void getSendValidEmailDetails() throws EncryptedDocumentException, IOException
	{
		excelUtilities.getDataFromExcel("Sheet3");	
		Send.click();
		
	}

	public void clickReparation() {
		reparation.click();
		
		
	}
	public void clickInventory() {
		inventory.click();
		
	}
	public void clickCustomer() {
		customer.click();
		
	}

	public void getSendSMSDetails(String phno, String sms) throws InterruptedException {
		PhNo.sendKeys(phno);
		SMS.sendKeys(sms);
		sendSMS.click();
		
	}
	public String getInvalidEmailMessageSuccessfully() {
		String st = Invalidemail.getText();
		return st;
	}
	public String getValidMessageSuccessfully() {
		String st = LoginSuccess.getText();
		return st;
	}
	public String getInvalidSMSMessageSuccessfully() {
		String st = invalidSMS.getText();
		return st;
	}
	public void getUserSignOut()
	{
	name.click();
	signout.click();
	
	}
	
	public String getLogoutMessageSuccessfully()
	{
		String st=loginPage.getText();
		return st;
	}
	/*public void scroll()
	{
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 js.executeScript("window.scrollBy(0,-1000)");
		 
	}*/


}
