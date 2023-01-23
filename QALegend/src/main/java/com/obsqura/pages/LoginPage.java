package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='identity']")
	WebElement UserName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement Login;
	@FindBy(xpath="//*[contains(text(),'Logged In Successfully')]")
	WebElement LoginSuccess;
	@FindBy(xpath="//*[contains(text(),'Sign in to start your session')]")
	WebElement LoginFailure;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickLogin(String n,String s)
	{
		UserName.sendKeys(n);
		Password.sendKeys(s);
		Login.click();
		
	}

	/*public void typeUsername(String username) {
		UserName.sendKeys(username);
		
		
	}

	public void typePassword(String password) {
		Password.sendKeys(password);
		
	}

	public void clickLogin() {
		Login.click();
		
	}*/

	public String loginSuccess() {
		String st=LoginSuccess.getText();
		return st;
	}
	public String loginFailure()
	{
		String st=LoginFailure.getText();
		return st;
	}

}
