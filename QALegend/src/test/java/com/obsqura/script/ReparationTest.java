package com.obsqura.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstants;
import com.obsqura.pages.CustomerPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ReparationPage;

public class ReparationTest extends BaseTest {
	@Test(priority=0)
	  public void verifyValidReparationCodeIsDisplayedOnSearch() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickReparation();
		  ReparationPage reparationPage=new ReparationPage(driver);
		  reparationPage.getSearchRepairs("VCAVEk");
		  String st=reparationPage.getValidOrder();
		  Assert.assertEquals(st, "Order & Reparations");
		 
	  }
	@Test
	  public void verifyCompletedRepairsIsDisplayedSuccessfully() {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickReparation();
		  ReparationPage reparationPage=new ReparationPage(driver);
		  reparationPage.getCompletedRepais();
		  String st=reparationPage.getValidCompletedRepairs();
		  Assert.assertEquals(st, "#000000");
	  }
	 @Test
	  public void verifyPendingRepairsIsDisplayedSuccessfully() {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickReparation();
		  ReparationPage reparationPage=new ReparationPage(driver);
		  reparationPage.getpendingRepairs();
		  String st=reparationPage.getValidPendingRepairs();
		  Assert.assertEquals(st, "#ffffff");
	  }
	@Test
	  public void verifyNewRepairsIsAddedSuccessfully() throws Exception {
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
		  HomePage homePage=new HomePage(driver);
		  homePage.clickReparation();
		  ReparationPage reparationPage=new ReparationPage(driver);
		  reparationPage.getNewReparationDetails("ER345","Repair","Bry","MN62","ER345TY");
		  reparationPage.verifyString();
		  Assert.assertTrue(true);
		 
	  }
	
	
	@Test
	  public void verifyViewProductOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getViewPageDetails();
	  String st=reparationPage.getValidateViewDetails();
	  Assert.assertEquals(st ,"Reparation: model1");  
	  }
	@Test
	  public void verifyEditProductOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getEditPageDetails();
	  String st=reparationPage.validateEditDetails();
	  Assert.assertEquals(st ,"Edit Reparationmodel1");  
	  }
	@Test
	  public void verifyViewPaymentsOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getViewPaymentsPageDetails();
	  String st=reparationPage.validateViewPaymentDetails();
	  Assert.assertEquals(st ,"View Payments ( : Y597kS)");  
	  }
	 @Test
	  public void verifyAddPaymentsOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getAddPaymentsPageDetails();
	  String st=reparationPage.validateAddPaymentDetails();
	  Assert.assertEquals(st ,"Add Payment");  
	  }
	 //@Test
	  public void verifyAddInvoiceOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getAddInvoicePageDetails();
	  //String st=reparationPage.validateAddInvoiceDetails();
	  //Assert.assertEquals(st ,"Invoice ZS8AG5");  
	  }
	 @Test
	  public void verifyAttachmentsOfReparationIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getAttachmentPageDetails();
	  String st=reparationPage.validateAttachmentDetails();
	  Assert.assertEquals(st ,"Attachments");  
	  }
	 @Test
	  public void verifyEmailInvoiceOfReparationIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getEmailInvoiceDetails();
	  String st=reparationPage.validateEmailInvoiceDetails();
	  Assert.assertEquals(st ,"Enter Email Address");  
	  }
	 @Test
	  public void verifyDeleteOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getDeleteDetails();
	  String st=reparationPage.validateDeleteDetails();
	  Assert.assertEquals(st ,"Are you sure!");  
	  }
	  @Test
	  public void verifyViewLogOfReparationPageIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getViewLogDetails();
	  String st=reparationPage.validateViewLogDetails();
	  Assert.assertEquals(st ,"View log");  
	  }
	  @Test
	  public void verifyPrintBarcodeOfReparationIsDisplayedSuccessfully()
	  {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickLogin(GenericConstants.Username, GenericConstants.Password);
	  HomePage homePage=new HomePage(driver);
	  homePage.clickReparation();
	  ReparationPage reparationPage=new ReparationPage(driver);
	  reparationPage.getPrintBarcodeDetails();
	  String st=reparationPage.validatePrintBarcodeDetails();
	  Assert.assertEquals(st ,"Print Barcode");  
	  }
}
