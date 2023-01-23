package com.obsqura.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.DataProvider;



public class Excelutilities {
	
	public String[][] getDataFromExcel(String sheetname) throws EncryptedDocumentException, IOException 
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\obsqura\\testdata\\testData.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook w=WorkbookFactory.create(fis);
		 Sheet s=w.getSheet(sheetname);
		  int totalRows=s.getLastRowNum();
		  System.out.println(totalRows);
		  Row rowcells=s.getRow(0);
		  int totalCols=rowcells.getLastCellNum();
		  System.out.println(totalCols);
		  DataFormatter format=new DataFormatter();
		  String testData[][]=new String[totalRows][totalCols];
		  for(int i=1;i<=totalRows;i++) {
		  for(int j=0;j<totalCols;j++) {
		  testData[i-1][j]=format.formatCellValue(s.getRow(i).getCell(j));
			 System.out.println(testData[i-1][j]);
		  }
		  }
		return testData;
	}
	 @DataProvider(name="dp_invalidLogin")
	public String[][] getData() throws EncryptedDocumentException, IOException 
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\obsqura\\testdata\\testData.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook w=WorkbookFactory.create(fis);
		 Sheet s=w.getSheet("Sheet1");
		  int totalRows=s.getLastRowNum();
		  System.out.println(totalRows);
		  Row rowcells=s.getRow(0);
		  int totalCols=rowcells.getLastCellNum();
		  System.out.println(totalCols);
		  DataFormatter format=new DataFormatter();
		  String testData[][]=new String[totalRows][totalCols];
		  for(int i=1;i<=totalRows;i++) {
		  for(int j=0;j<totalCols;j++) {
		  testData[i-1][j]=format.formatCellValue(s.getRow(i).getCell(j));
			 System.out.println(testData[i-1][j]);
		  }
		  }
		return testData;
	}
	 @DataProvider(name="dp_validLogin")
		public String[][] getDataInValidLogin() throws EncryptedDocumentException, IOException 
		{
			File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\obsqura\\testdata\\testData.xlsx");
			 FileInputStream fis=new FileInputStream(f);
			 Workbook w=WorkbookFactory.create(fis);
			 Sheet s=w.getSheet("Sheet2");
			  int totalRows=s.getLastRowNum();
			  System.out.println(totalRows);
			  Row rowcells=s.getRow(0);
			  int totalCols=rowcells.getLastCellNum();
			  System.out.println(totalCols);
			  DataFormatter format=new DataFormatter();
			  String testData[][]=new String[totalRows][totalCols];
			  for(int i=1;i<=totalRows;i++) {
			  for(int j=0;j<totalCols;j++) {
			  testData[i-1][j]=format.formatCellValue(s.getRow(i).getCell(j));
				 System.out.println(testData[i-1][j]);
			  }
			  }
			return testData;
		}

}
