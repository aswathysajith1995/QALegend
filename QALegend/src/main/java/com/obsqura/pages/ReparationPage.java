package com.obsqura.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.Waitutility;


public class ReparationPage {
	public WebDriver driver;
	Waitutility waitUtility = new Waitutility();
	DateUtility dateUtility=new DateUtility();
	PageUtility pageutility=new PageUtility();
	//StringUtility stringutility=new StringUtility();
	@FindBy(xpath="//h1[contains(text(),'Order & Reparations')]")
	WebElement Orders;
	@FindBy(xpath="//input[@type='search'][1]")
	WebElement Search;
	@FindBy(xpath="//*[@class=\"add_reparation btn btn-primary\"]     ")
	WebElement btnAddReparatn;
	@FindBy(xpath="//*[@id=\"select2-client_name-container\"]")
			//"//span[contains(text(),'kiran kmn - k')]")
	WebElement ClientName;
	@FindBy(xpath="//*[@id=\"rpair_form\"]/div[2]/div/div[2]/div[1]/span/span[1]/span")
	WebElement Taxrate; 
	@FindBy(xpath="//span[@id='select2-assigned_to-container']")
	WebElement assignedTo;
	@FindBy(xpath="//*[@id=\"select2-error_code-container\"]")
	WebElement errorCode;
	@FindBy(xpath="//span[@id='select2-has_warranty-container']")
	WebElement haswarrenty;
	@FindBy(xpath="//span[@id='select2-warranty-container']")
	WebElement warrenty;
	@FindBy(xpath="//input[@id='imei']")
	WebElement imei;
	@FindBy(xpath="//input[@id='category']")
	WebElement category;
	@FindBy(xpath="//input[@id='reparation_manufacturer']")
	WebElement manufacturer;
	@FindBy(xpath="//input[@id='reparation_model']")
	WebElement model;
	@FindBy(xpath="//input[@id='expected_close_date']")
	WebElement expectedClosingdate;
	@FindBy(xpath="/html/body/div[9]/div[3]/table/tbody/tr[3]/td[2]")
	
	WebElement selectClosingDate;
	@FindBy(xpath="//input[@id='warranty_card_number']")
	WebElement warrentyCardno;
	@FindBy(xpath="//i[@class='fa fa-file-pdf']")
	WebElement pdf;
	@FindBy(xpath="//i[@class='fa fa-file-excel']")
	WebElement excel;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/button")
	//*[@id="34"]/td[16]/div/div/button
	//*[@id="46"]/td[16]/div/div/button
	WebElement actions;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[1]/a")
	WebElement view;
	@FindBy(xpath="//div[@id='titoloOE']")
	WebElement viewHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[2]/a")
		WebElement edit;
	@FindBy(xpath="//h4[@id='titReparation']")
	WebElement editHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[3]/a")
	WebElement viewPayments;
	@FindBy(xpath="//h4[@id='myModalLabel']")
	WebElement viewPaymentHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[4]/a")
	//*[@id="62"]/td[16]/div/div/ul/li[4]/a
	WebElement addPayment;
	@FindBy(xpath="//h4[@id='myModalLabel']")
	WebElement addPaymentHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[5]/a")
	WebElement invoice;
	@FindBy(xpath="//h4[text()='Invoice ZS8AG5']")
			//h4[contains(text(),'Invoice ZS8AG5')]")
	WebElement invoiceHeader;
	@FindBy(xpath="//a[@id='upload_modal_btn'and @data-num='46']")
	WebElement attchments;
	@FindBy(xpath="//label[contains(text(),'Attachments')]")
	WebElement attchmnetHeader;
	@FindBy(xpath="//a[@id='email_invoice'and @data-num='46']")
	WebElement emailInvoice;
	@FindBy(xpath="//h4[contains(text(),'Enter Email Address')]")
	WebElement emailInvoiceHeader;
	@FindBy(xpath="//a[@id='delete_reparation'and @data-num='46']")
	WebElement deleteRepairs;
	@FindBy(xpath="//h4[contains(text(),'Are you sure!')]")
	WebElement deleteRepairsHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[9]/a")
	WebElement viewLog;
	@FindBy(xpath="//h1[contains(text(),'View log')]")
	WebElement viewLogHeader;
	@FindBy(xpath="//*[@id=\"46\"]/td[16]/div/div/ul/li[11]/a")
	WebElement printBarcode;
	@FindBy(xpath="//h1[contains(text(),'Print Barcode')]")
	WebElement printBarcodeHeader;
	@FindBy(xpath="//div[@id='titoloOE']")
	WebElement ReparationHeader;
	@FindBy(xpath="//input[@id='service_charges']")
	WebElement ServiceCharge;
	@FindBy(xpath="//button[@id='repair_submit']")
	WebElement buttonAddRepairs;
	@FindBy(xpath="//input[@id='date_of_purchase']")
	WebElement purchaseDate;
	@FindBy(xpath="/html/body/div[10]/div[3]/table/tbody/tr[4]/td[5]")
	WebElement selectPurchaseDate;
	@FindBy(xpath="//span[@class='bg-red']")
	WebElement StatustimeLine;
	@FindBy(xpath="//a[@href='#CompletedRepairs']")
	
	WebElement completedRepairs;
	@FindBy(xpath="//*[@id=\"dynamic-table-completed\"]/tbody/tr[1]/td[9]/div/span")
	//*[@id="dynamic-table-completed"]/tbody/tr[1]/td[9]/div/span
	//*[@id="dynamic-table-completed"]/tbody/tr[1]/td[9]/div/span
	WebElement bgColor;
	@FindBy(xpath="//a[@href='#PendingRepairs']")
	WebElement pendingRepairs;
	@FindBy(xpath="//*[@id=\"159\"]/td[9]/div/span")
	//*[@id="159"]/td[9]/div/span
	WebElement pendingColor;
	public ReparationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public void getCompletedRepais()
{
	waitUtility.waitImplicit(driver);
	completedRepairs.click();
}
public void getpendingRepairs()
{
	waitUtility.waitImplicit(driver);
	pendingRepairs.click();
}
public String getValidCompletedRepairs() {
	String color = bgColor.getCssValue("color");
	System.out.println(color);
	String hexColor=org.openqa.selenium.support.Color.fromString(color).asHex();
	System.out.println(hexColor);
	waitUtility.waitImplicit(driver);
	return hexColor;
}
public String getValidPendingRepairs() {
	String color = pendingColor.getCssValue("color");
	System.out.println(color);
	String hexColor=org.openqa.selenium.support.Color.fromString(color).asHex();
	System.out.println(hexColor);
	return hexColor;
}
	public void getSearchRepairs(String reparatnCode) {
		Search.sendKeys(reparatnCode);
		waitUtility.hardSleep();
		
	}

	public String getValidOrder() {
		String st = Orders.getText();
		return st;
	}

	
	public void getNewReparationDetails(String IMEI,String Category,
			String Manufacturer ,String Model,String Warrantycardno) throws Exception {
		btnAddReparatn.click();
		waitUtility.hardSleep();
		//waitUtility.waitForElementToBeClickable(driver,btnAddReparatn );
		imei.sendKeys(IMEI);
		pageutility.selectdropDownValue(ClientName, "kiran kmn - k");
		ClientName.click();
		waitUtility.hardSleep();
		category.sendKeys(Category);
		pageutility.selectdropDownValue(Taxrate, "SGST");
		Taxrate.click();
		waitUtility.hardSleep();
		pageutility.selectdropDownValue(assignedTo, "Joe Jacobs");
		assignedTo.click();
		waitUtility.hardSleep();
		manufacturer.sendKeys(Manufacturer);
		model.sendKeys(Model);
		pageutility.selectdropDownValue(errorCode, "203873 - Laptop not working");
		errorCode.click();
		//errorCode.clear();
		waitUtility.hardSleep();
		ServiceCharge.sendKeys("1");
		expectedClosingdate.sendKeys("12/11/2022");
		//expectedClosingdate.click();
		//selectClosingDate.click();
		//waitUtility.hardSleep();
		//dateUtility.selectDate(driver, "12-12-2022", "MMM-dd-YYYY");
		purchaseDate.sendKeys("12/11/2022");
		//waitUtility.hardSleep();
		//selectPurchaseDate.click();
		//waitUtility.hardSleep();
		//dateUtility.selectDate(driver, "12-22-2022", "MMM-dd-YYYY");
		pageutility.selectdropDownValue(haswarrenty, "In Warranty");
		haswarrenty.click();
		waitUtility.hardSleep();
		pageutility.selectdropDownValue(warrenty, "1 Month");
		warrenty.click();
		waitUtility.hardSleep();
		warrentyCardno.sendKeys(Warrantycardno);
		buttonAddRepairs.click();
		waitUtility.hardSleep();
		
	}
	public void verifyString() {
		String s="";
		s.isEmpty();
	}
	public String getValidAddRepairs() {
		waitUtility.hardSleep();
		String st = StatustimeLine.getText();
		waitUtility.hardSleep();
		return st;
	}
	
public void getViewPageDetails() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(view, " View");
	 view.click();
	 waitUtility.hardSleep();
}


public String getValidateViewDetails() {
	String st = viewHeader.getText();
	return st;
	
}

public void getEditPageDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(edit, " Edit");
	 edit.click();
	 waitUtility.hardSleep();
}

public String validateEditDetails() {
	String st = editHeader.getText();
	return st;
}

public void getViewPaymentsPageDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(viewPayments, " View Payments");
	 viewPayments.click();
	 waitUtility.hardSleep();
	
}
public String validateViewPaymentDetails() {
	String st = viewPaymentHeader.getText();
	return st;
}

public void getAddPaymentsPageDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(addPayment, "Add Payment");
	 addPayment.click();
	 waitUtility.hardSleep();
	
}

public String validateAddPaymentDetails() {
	String st = addPaymentHeader.getText();
	return st;
}

public void getAddInvoicePageDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(invoice, " Invoice");
	 invoice.click();
	 waitUtility.hardSleep();
	
}

public String validateAddInvoiceDetails() {
	waitUtility.hardSleep();
	String st = invoiceHeader.getText();
	waitUtility.hardSleep();
	return st;
}

public void getAttachmentPageDetails() {

	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(	attchments, " View Attachments");
	 attchments.click();
	 waitUtility.hardSleep();
	
}

public String validateAttachmentDetails() {
	String st = attchmnetHeader.getText();
	return st;
}

public void getEmailInvoiceDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(emailInvoice, " Email Invoice");
	 emailInvoice.click();
	 waitUtility.hardSleep();
}

public String validateEmailInvoiceDetails() {
	String st = emailInvoiceHeader.getText();
	return st;
}

public void getDeleteDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(deleteRepairs, " Delete");
	 deleteRepairs.click();
	 waitUtility.hardSleep();
	
}

public String validateDeleteDetails() {
	String st = deleteRepairsHeader.getText();
	return st;
}

public void getViewLogDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(viewLog, " View log");
	 viewLog.click();
	 waitUtility.hardSleep();
	
}

public String validateViewLogDetails() {
	String st=viewLogHeader.getText();
	return st;
}

public void getPrintBarcodeDetails() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 js.executeScript("window.scrollBy(1000,0)");
	 waitUtility.hardSleep();
	 actions.click();
	 waitUtility.hardSleep();
	 pageutility.selectdropDownActions(printBarcode, " Print Barcode");
	 printBarcode.click();
	 waitUtility.hardSleep();
	
}

public String validatePrintBarcodeDetails() {
	String st=printBarcodeHeader.getText();
	return st;
}


}
