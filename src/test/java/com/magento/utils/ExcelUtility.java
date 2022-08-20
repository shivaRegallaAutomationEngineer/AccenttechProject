package com.magento.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	
	private static Workbook workbook;
	private static Sheet sheet;
	
	//this method will open excel file with specified sheet
	  //@parameter ----> filepath
	//@parameter -----> sheetName
	
	public static void openExcel(String filePath,String sheetName) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			 workbook=new XSSFWorkbook(fis);//for xlsx format
			//Workbook workbook1=new HSSFWorkbook(fis);//for xls format
			 sheet= workbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//this method will return the number of rows
	
	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	//this method will return the number of columns
	public static int columnCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	//this method will return data from specified row and column
	//parameter row index
	//parameter column index
	
	public static String getCellData(int rowIndex,int columnIndex) {
		
		return sheet.getRow(rowIndex).getCell(columnIndex).toString();
		
	}
	
	//this method will read any excel file and return data in 2d array
	//parameter file path
	//parrameter sheetName
	
	
	public static Object[][] excelIntoArray(String filePath,String sheetName){
		openExcel(filePath,sheetName);
		Object[][] data = new Object[rowCount()-1][columnCount()];
		
		for(int i=1;i<rowCount();i++) {
			for(int j=0;j<columnCount();j++) {
				data[i-1][j]	=getCellData(i,j);
		}
	}
		return data;
}
}