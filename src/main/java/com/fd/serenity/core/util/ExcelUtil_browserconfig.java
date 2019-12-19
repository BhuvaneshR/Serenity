package com.fd.serenity.core.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil_browserconfig {
		
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
    private static XSSFCell Cell1;
    private static XSSFCell Cell2;
	private static XSSFRow Row;
	public static String[] testConfiguration = new String[13];
	public static final String Path_TestData = System.getProperty("user.dir") + "/UI_RunManager.xlsx";
	public static final String Path_RunManager = System.getProperty("user.dir") +"/Run_Manager.xlsx";
	public static final String Path_TestCaseList = System.getProperty("user.dir") +"/UI_RunManager.xlsx";
    public HashSet<String> runnerList=new HashSet<String>();

	public static void setExcelFile(String Path,String SheetName) throws Exception 
	{
				try {
					// Open the Excel file
					FileInputStream ExcelFile = new FileInputStream(Path);
					// Access the required test data sheet
					ExcelWBook = new XSSFWorkbook(ExcelFile);
					ExcelWSheet = ExcelWBook.getSheet(SheetName);
					} catch (Exception e){
						throw (e);
					}
	}
	public static String getCellData(int RowNum, int ColNum) throws Exception
	{
				try
				{
					Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
					String CellData = Cell.getStringCellValue();
					return CellData;
				}
				catch (Exception e)
				{
					return"";
				}
	}
	public static int getPhysicalNumberOfRows()
	{
		int intRow=ExcelWSheet.getPhysicalNumberOfRows();
		return intRow;
		
	}
	public static int getPhysicalNumberofcolumn(int i)
	{
		int noOfColumns = ExcelWSheet.getRow(i).getLastCellNum();
		return noOfColumns;
	}
	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	
	{
				try{
					Row  =ExcelWSheet.getRow(RowNum); // 10-1
					if (Row == null) {
					   // First cell in the row, create
						Row = ExcelWSheet.createRow(RowNum);
					}
					Cell  = Row.getCell(ColNum); // 4-1
					if (Cell == null) {
					    // New cell
						Cell = Row.createCell(ColNum, Cell.CELL_TYPE_STRING);
					}
					System.out.println(Result);
					Cell.setCellValue(Result);
		// Constant variables Test Data path and Test Data file name
						FileOutputStream fileOut = new FileOutputStream(Path_TestData);
						ExcelWBook.write(fileOut);
						fileOut.flush();
						fileOut.close();
				  }
				  catch(Exception e)
				  {
						throw (e);
				  }
	}
public static int getRowNum(String key, int columnNum, int startRowNum) {
		
		try {
			setExcelFile(Path_RunManager, "TestConfigurations");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FormulaEvaluator formulaEvaluator = ExcelWBook .getCreationHelper().createFormulaEvaluator();

		String currentValue;
		for (int currentRowNum = startRowNum; currentRowNum <= ExcelWSheet.getLastRowNum(); currentRowNum++) 
		{
			XSSFRow row = ExcelWSheet.getRow(currentRowNum);
			XSSFCell cell = row.getCell(columnNum);
			currentValue = getCellValueAsString(cell, formulaEvaluator);
			if (currentValue.equals(key)) 
			{
				return currentRowNum;
			}
		}

		return -1;
	}
	
	
	/**
	 * This function will return the Cell Value as String from the Given cell
	 * Need to add this under the Java class handling excel operations
	 * @return
	 */
	private static String getCellValueAsString(XSSFCell cell,FormulaEvaluator formulaEvaluator) {
		if (cell == null || cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return "";
		} else {
			if (formulaEvaluator.evaluate(cell).getCellType() == XSSFCell.CELL_TYPE_ERROR) {
			
			}

			DataFormatter dataFormatter = new DataFormatter();
			return dataFormatter.formatCellValue(formulaEvaluator.evaluateInCell(cell));
		}
	}
	/**
	 * This function will the string array of the Test Configuration for the given Config passed in browserConfig
	 * Need to add this under the Java class handling excel operations
	 * @return
	 * @throws Exception 
	 */	
	public static String[] getTestConfig(String[] keys,String browserConfig){
		try
		{
		setExcelFile(Path_RunManager,"TestConfigurations");
		FormulaEvaluator formulaEvaluator = ExcelWBook.getCreationHelper().createFormulaEvaluator();
		XSSFRow hrow = ExcelWSheet.getRow(0);
		for (int i = 1; i <= ExcelWSheet.getLastRowNum(); i++) {
		{ 
			if(getCellData(i,0).equalsIgnoreCase(browserConfig))
			{
				XSSFRow row = ExcelWSheet.getRow(i);
				for (int j = 0; j<keys.length;j++)
				{
					testConfiguration[j] = getValue(hrow, row, keys[j], formulaEvaluator);
					
				}
				break;	
			}
		}
	}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testConfiguration;	
	}
	/*
	 * This function will extract all the data from the TestConfiguration sheet and store in a List + Map. 
	 * Instead of every time accessing the excel sheet for the Test Configuration, the excel sheet is accessed once 
	 * and all the values are stored in List + Map and TestConfiguration can be accesed from the same 
	 * Need to put this under the Java class handling excel operations
	 * @return
	 */
	
	private static String getValue(XSSFRow hrow, XSSFRow row, String columnHeader, FormulaEvaluator formulaEvaluator) {
		int columnNum = -1;
		String currentValue;

		for (int currentColumnNum = 0; currentColumnNum < row.getLastCellNum(); currentColumnNum++) {
			XSSFCell cell = hrow.getCell(currentColumnNum);
			currentValue = getCellValueAsString(cell, formulaEvaluator);

			if (currentValue.equals(columnHeader)) {
				columnNum = currentColumnNum;
				break;
			}
		}

		if (columnNum == -1) {
			return null;
		} else {

			XSSFCell cell = row.getCell(columnNum);
			return getCellValueAsString(cell, formulaEvaluator);
		}
	}
	
	public HashSet<String> getRunners() throws Exception
    {
           StringBuilder sb=new StringBuilder();
           String runnerNames=null;
           FileInputStream testCase = new FileInputStream(Path_TestCaseList);
           // Access the required test data sheet
           ExcelWBook = new XSSFWorkbook(testCase);
           ExcelWSheet = ExcelWBook.getSheet("TCList");
           //CellReference cellReference=new CellReference();
           for(int i=1;i<ExcelWSheet.getPhysicalNumberOfRows();i++)
           {
                  Row  =ExcelWSheet.getRow(i);
                  Cell=Row.getCell(1);
                  String executeStatus=Cell.getStringCellValue();
                  if(executeStatus.equalsIgnoreCase("Yes"))
                  {
                        Cell1=Row.getCell(2);
                        runnerNames=Cell1.getStringCellValue();
                        sb.append(runnerNames).append(",");
                  }

           }
           String value=sb.toString().substring(0,sb.length()-1);
           //String testCaseList="\""+value+"\"";
           System.out.println("The runner files are:"+value);
           String[] runners=value.split(",");
           for(int i=0;i<runners.length;i++)
           {
                  runnerList.add(runners[i]);
           } 
           return runnerList;
    }

    
    public String getbrowserName(String testCaseName) throws Exception
    {
    StringBuilder sb=new StringBuilder();
    String test=null;
    String browser=null;
    String executeStatus=null;
    FileInputStream testCase = new FileInputStream(Path_TestCaseList);
    // Access the required test data sheet
    ExcelWBook = new XSSFWorkbook(testCase);
    ExcelWSheet = ExcelWBook.getSheet("Datasheet");
    //CellReference cellReference=new CellReference();
    System.out.println("The total number of rows is:"+ExcelWSheet.getPhysicalNumberOfRows());
    for(int i=1;i<ExcelWSheet.getPhysicalNumberOfRows();i++)
    {
    Row  =ExcelWSheet.getRow(i);
    Cell=Row.getCell(0);
    Cell2=Row.getCell(2);
    test=Cell.getStringCellValue();
    System.out.println("The name of the test case is:"+test);
    executeStatus=Cell2.getStringCellValue();
    System.out.println("The status:"+executeStatus);
    if(test.equalsIgnoreCase(testCaseName) && executeStatus.equalsIgnoreCase("Yes"))
    {
    Cell1=Row.getCell(1);
    browser=Cell1.getStringCellValue();
    System.out.println("browser nae is:"+browser);
    sb.append(browser).append(",");
    }
    
    }
    String value=sb.toString().substring(0,sb.length()-1);
    System.out.println("The browsers are:"+value);
    //String testCaseList="\""+value+"\"";
    return value;
    }


	

	}



