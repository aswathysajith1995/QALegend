package com.obsqura.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstants;
import com.obsqura.pages.CustomerPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class CustomerTest extends BaseTest {
	@Test()
	  public void verifySearchEmailIsSuccessfullyDisplayedOnCustomerPage() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();//clickCustomer
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.searchCustomer("binu@test.com");
		  String st=customerPage.validCustomer();
		  Assert.assertEquals(st, "Customers");
		 
	  }
	@Test()
	  public void verifyViewClientActionsIsDisplayedSuccessfully() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.getviewClientAction();
		  String st=customerPage.getViewClientValidationDetails();
		  Assert.assertEquals(st, "Client: keerthi");
		 
	  }
	@Test()
	  public void verifyViewClientRepairActionsIsSuccessfullyDisplayed() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.getviewClientRepairAction();
		  String st=customerPage.getViewClientReparirValidationDetails();
		  Assert.assertEquals(st, "Showing 0 to 0 of 0 entries");
		 
	  }
	@Test()
	  public void verifyEditClientActionsIsDisplayedSuccessfully() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.geteditClientdetails();
		  String st=customerPage.getEditClientValidationDetails();
		  Assert.assertEquals(st, "Edit Client");
		 
	  }
	@Test()
	  public void verifyDeleteClientActionsIsDisplayedSuccessfully() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.getdeleteClientdetails();
		String st=customerPage.getDeleteClientValidationDetails();
		 Assert.assertEquals(st, "Are you sure!");
		 
	  }
	@Test()
	  public void verifyviewImageActionsIsSuccessfullyDisplayed() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerPage=new CustomerPage(driver);
		  customerPage.getviewImage();
		  String st=customerPage.getViewImageValidationDetails();
		  Assert.assertEquals(st, "No Image Uploaded");
		 
	  }
	@Test()
	  public void verifyAddClientPageIsDisplayedSuccessfully() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickCustomer();
		  CustomerPage customerpage=new CustomerPage(driver);
		  customerpage.addClient();
		  customerpage.addCustomerDetails("Aswathy","Obsqura","India","XYZ",
				  "TVm","690501","76589341234","aswathy@gmail.com",
				    "VA45","SS4567","Finished");
		 String s=customerpage.getNewClientValidationDetails();
		 Assert.assertEquals(s, "Client: Aswathy");
	  }
}
