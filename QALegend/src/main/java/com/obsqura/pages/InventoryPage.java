package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.Waitutility;

public class InventoryPage {
	public WebDriver driver;
	Waitutility waitUtility = new Waitutility();
	
	PageUtility pageutility=new PageUtility();
	@FindBy(xpath="//input[@type='search'][1]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"102\"]/td[9]/div/div/button")
	WebElement actions;
	@FindBy(xpath="//*[@id=\"102\"]/td[9]/div/div/ul/li[1]/a")
	//*[@id="102"]/td[9]/div/div/ul/li[1]/a
	WebElement duplicateProduct;
	@FindBy(xpath=" //h1[contains(text(),'Add Product')]")
	WebElement addProduct;
	@FindBy(xpath="//*[@id=\"102\"]/td[9]/div/div/ul/li[2]/a")
	WebElement editProduct;
	@FindBy(xpath=" //h1[contains(text(),'Edit Product')]")
	WebElement edit;
	@FindBy(xpath="//*[@id=\"102\"]/td[9]/div/div/ul/li[3]/a")
	WebElement printBarCode;
	@FindBy(xpath=" //h1[contains(text(),'Print Barcode')]")
	WebElement PrintBarcodeheader;
	@FindBy(xpath="//*[@id=\"102\"]/td[9]/div/div/ul/li[5]/a")
	WebElement deleteProduct;
	//*[@id="3"]/td[9]/div/div/ul/li[5]/a
	@FindBy(xpath="//b[contains(text(),'Delete Product')]")
	WebElement deletePdtHeader;
	@FindBy(xpath="//*[@id=\"action-form\"]/div[1]/div[1]/li/a/i")
	//*[@id="action-form"]/div[1]/div[1]/li/a/i
	WebElement addActions;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory/add']")
	WebElement addnewProduct;
	@FindBy(xpath="//h1[contains(text(),'Inventory')]")
	WebElement searchHeader;
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getSearch(String code) {
		search.sendKeys(code);
		
		
	}
	public String validateSearchInInventoryPage()
	{
		waitUtility.hardSleep();
		String st = searchHeader.getText();
		return st;
	}
	public void getDuplicateProduct()
	{
		waitUtility.hardSleep();
		actions.click();
		pageutility.selectdropDownActions(duplicateProduct, "  Duplicate Product");
		duplicateProduct.click();
		waitUtility.hardSleep();
		//pageutility.selectdropDownValue(duplicateProduct, "  Duplicate Product");
	}
	public String validateDuplicateProduct()
	{
		waitUtility.hardSleep();
		String st = addProduct.getText();
		return st;
	}
	
	public void getEditProductPage()
	{
		waitUtility.hardSleep();
		actions.click();
		pageutility.selectdropDownActions(editProduct, " Edit Product");
		editProduct.click();
		waitUtility.hardSleep();
		
	}
	public String validateEditedProduct()
	{
		waitUtility.hardSleep();
		String st = edit.getText();
		return st;
	}

	public void getBarCodeOrLabelPage() {
		waitUtility.hardSleep();
		actions.click();
		pageutility.selectdropDownActions(printBarCode, "  Print Barcode/Label");
		printBarCode.click();
		waitUtility.hardSleep();
		
	}
	public String validateBarcodeOrLabelProduct()
	{
		waitUtility.hardSleep();
		String st = PrintBarcodeheader.getText();
		return st;
	}

	public void getProductDeletePage() {
		waitUtility.hardSleep();
		actions.click();
		pageutility.selectdropDownActions(deleteProduct, " Delete Product");
		waitUtility.hardSleep();
		deleteProduct.click();
		waitUtility.hardSleep();
		//yesIamSure.click();
		
	}

	public String validateDeleteProductPage() {
		waitUtility.hardSleep();
		String st = deletePdtHeader.getText();
		return st;
	}
	public void getAddProductDetailsPage()
	{waitUtility.hardSleep();
		addActions.click();
		pageutility.selectdropDownActions(addActions, " Add Product                            ");
		waitUtility.hardSleep();
		addnewProduct.click();
	}

	public String validateAddProductPage() {
		waitUtility.hardSleep();
		String st = addProduct.getText();
		return st;
	}
}
