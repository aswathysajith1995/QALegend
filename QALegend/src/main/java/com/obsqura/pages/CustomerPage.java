package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.GenericUtility;
import com.obsqura.utilities.PageUtility;

import com.obsqura.utilities.Waitutility;

public class CustomerPage {
	public WebDriver driver;
	Waitutility waitUtility = new Waitutility();
	GenericUtility genericutility=new GenericUtility();
	PageUtility pageutility=new PageUtility();
	
	@FindBy(xpath = "//button[@href='#clientmodal']")
	WebElement AddClient;
	@FindBy(xpath = "//*[contains(text(),'Add Client')][1]")
	WebElement AddClientheader;
	@FindBy(xpath = "//input[@type='search'][1]")
	WebElement Search;
	@FindBy(xpath="//*[@id=\"dynamic-table\"]/tbody/tr[1]/td[7]/div/div/button")
	
	WebElement dropdownActions;
	@FindBy(xpath="//h1[contains(text(),'Customers')]")
	WebElement customer;
	@FindBy(xpath = "//input[@name='name']")
	WebElement clientname;
	@FindBy(xpath = "//input[@name='company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement geoLocate;
	@FindBy(xpath = "//input[@id='route']")
	WebElement Address;
	@FindBy(xpath = "//input[@id='locality']")
	WebElement City;
	@FindBy(xpath = "//input[@id='postal_code']")
	WebElement postalCode;
	@FindBy(xpath = "//input[@id='telephone']")
	WebElement Telephone;
	@FindBy(xpath = "//input[@id='email1']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='vat1']")
	WebElement VAT;
	@FindBy(xpath = "//input[@id='cf1']")
	WebElement SSN;
	@FindBy(xpath = "//input[@id='image']")
	WebElement fileUpload;
	@FindBy(xpath = "//textarea[@id='comment1']")
	WebElement Comments;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement AddClientButton;
	@FindBy(xpath = "//button[@class='pull-left btn btn-default'and text()=' Go Back']")
	WebElement GoBack;
	@FindBy(xpath="//div[@id='titoloclienti']")
	WebElement newClient;
	@FindBy(xpath="//*[@id=\"dynamic-table\"]/tbody/tr[1]/td[7]/div/div/ul/li[1]/a")
    WebElement verifyClient;
	@FindBy(xpath="//*[@id=\"dynamic-table\"]/tbody/tr[1]/td[7]/div/div/ul/li[2]/a")
	WebElement verifyClientRepairs;
	@FindBy(xpath="//*[@id=\"modify_client\"]")
	WebElement editClient;
	@FindBy(xpath="//*[@id=\"delete_client\"]")
	WebElement deleteClient;
	@FindBy(xpath="//*[@id=\"view_image\"]")
	WebElement viewImage;
	@FindBy(xpath="//div[@id='titoloclienti']")
	WebElement viewClientHeader;
	@FindBy(xpath="//div[@id='view-repars-table_info']")
	WebElement viewClientRepairHeader;
	@FindBy(xpath="//h4[@id='titclienti']")
	WebElement editClientHeader;
	@FindBy(xpath="//div[contains(text(),'Are you sure!')]")		
	WebElement deleteClientHeader;
	@FindBy(xpath="//input[@id='email1']")
	WebElement editEmail;
	@FindBy(xpath="//div[text()='No Image Uploaded']")
			WebElement viewimageHeader;
	@FindBy(xpath="//span[@id='v_name']")
	WebElement viewClientName;
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchCustomer(String email) {
		Search.sendKeys(email);
		
		
	}
	public String validCustomer()
	{
		String st = customer.getText();
		return st;
	}

	public String addValidClient() {
		waitUtility.hardSleep();
		String st = AddClientheader.getText();
		return st;
	}
	public String getNewClientValidationDetails() {
		waitUtility.hardSleep();
		String st = newClient.getText();
		return st;
	}
	public void addClient(){
		
		AddClient.click();
		waitUtility.waitForElementToBeClickable(driver, AddClientheader);
		

	}
	public void addCustomerDetails(String name,String companyname,String geolocate,
			String address,String city,
			String postalcode,String telephone,String email,
			String vat,String ssn,String comments
			)
	{
		clientname.sendKeys(name);
		company.sendKeys(companyname);
		geoLocate.sendKeys(geolocate);
		Address.sendKeys(address);
		City.sendKeys(city);
		postalCode.sendKeys(postalcode);
		Telephone.sendKeys(telephone);
		Email.sendKeys(email);
		VAT.sendKeys(vat);
		SSN.sendKeys(ssn);
		pageutility.fileUpload(driver, fileUpload);
		Comments.sendKeys(comments);
		AddClientButton.click();
		
	}
	
	public void getviewClientAction()
	{
		waitUtility.hardSleep();
		dropdownActions.click();
		pageutility.selectdropDownActions(verifyClient, " View Client");
		verifyClient.click();
		waitUtility.hardSleep();
		//viewClientName.clear();
		//s.uppercaseFirstChar(viewClientName);
		
		//waitUtility.waitForElementToBeClickable(driver, verifyClient);
	}
	public String getViewClientValidationDetails()
	{
		String st = viewClientHeader.getText();
		return st;	
	}

	public void getviewClientRepairAction() {
		waitUtility.hardSleep();
		dropdownActions.click();
		pageutility.selectdropDownActions(verifyClientRepairs, " View Client Repairs");
		verifyClientRepairs.click();
		waitUtility.waitImplicit(driver);
	}
	public String getViewClientReparirValidationDetails()
	{waitUtility.hardSleep();
		String st = viewClientRepairHeader.getText();
		waitUtility.hardSleep();
		return st;
		
	}
	public void geteditClientdetails()
	{
		//waitUtility.waitImplicit(driver);
		waitUtility.hardSleep();
		dropdownActions.click();
		pageutility.selectdropDownActions(editClient, " Edit Client");
		editClient.click();
		waitUtility.hardSleep();
		editEmail.clear();
		genericutility.getRandomNumber(editEmail);
		
		
		//waitUtility.waitImplicit(driver);
	}
	public String getEditClientValidationDetails()
	{
		waitUtility.hardSleep();
		String st = editClientHeader.getText();
		waitUtility.waitImplicit(driver);
		return st;	
	}
	public void getdeleteClientdetails()
	{
		waitUtility.hardSleep();
		dropdownActions.click();
		pageutility.selectdropDownActions(deleteClient, "  Delete Client");	
		deleteClient.click();
		waitUtility.waitImplicit(driver);
	}
	public String getDeleteClientValidationDetails()
	{	waitUtility.hardSleep();
		String st = deleteClientHeader.getText();
		waitUtility.hardSleep();
		return st;	
	}
	public void getviewImage()
	{
		waitUtility.hardSleep();
		dropdownActions.click();
		pageutility.selectdropDownActions(viewImage, "   View Image");
		viewImage.click();
		waitUtility.waitImplicit(driver);
	}
	public String getViewImageValidationDetails()
	{
		waitUtility.hardSleep();
		String st = viewimageHeader.getText();
		System.out.println(st);
		waitUtility.waitImplicit(driver);
		return st;	
	}
	

}
