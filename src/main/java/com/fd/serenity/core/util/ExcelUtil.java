package com.fd.serenity.core.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil {
		
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static final String Path_TestData = "C:\\Users\\504206\\Desktop\\Testsample.xlsx";
//	public static final String File_TestData = "";
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
	}



