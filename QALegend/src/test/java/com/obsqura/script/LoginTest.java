package com.obsqura.script;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.listeners.ExtentReportListener;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.Excelutilities;
@Listeners(ExtentReportListener.class)
public class LoginTest extends BaseTest {
	@Test(dataProviderClass=Excelutilities.class,dataProvider = "dp_validLogin")
	 public void verifyValidLogin(String username, String password) {
		LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(username, password);
		  String s = loginPage.loginSuccess();
			Assert.assertEquals(s, "Logged In Successfully");
	 }
	  @Test(dataProviderClass=Excelutilities.class,dataProvider = "dp_invalidLogin")
	  public void verifyInvalidLogin(String username, String password) {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(username, password);
		  String s = loginPage.loginFailure();
			Assert.assertEquals(s, "Sign in to start your session");
		  
	  }
	 

}
