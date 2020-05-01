package com.learning.poi;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;;;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	  Workbook  workbook = new HSSFWorkbook();		   
		  Sheet sheet = workbook.createSheet();
		  sheet.setColumnWidth(0, 7000);
		  
		  Sheet sheet2 = workbook.createSheet("pancakes");
		  Sheet sheet3 = workbook.createSheet(WorkbookUtil.createSafeSheetName("38479.()((*&&&%$^$*&%^&*&*%^^$#@@$@#CVBoihiu") ); 
		  
		  //Row row = sheet.createRow(0);
		  //Cell cell = row.createCell(0);
		  	  
		  //cell.setCellValue("hello poi");
		  //System.out.println(cell.getRichStringCellValue().toString());
		  
		  //cell formulas below
		  
		  Cell cell1 = sheet.createRow(0).createCell(0);
		  
		  /* uncomment from here
		   
		  Cell cell3 = sheet.createRow(0).createCell(2);
		  Cell cell4 = sheet.createRow(0).createCell(3);
		  Cell cell5 = sheet.createRow(0).createCell(4);
		  Cell cell6 = sheet.createRow(0).createCell(5);
		  
		  //cell formatting /cell styles
		  CellStyle cellStyle = workbook.createCellStyle();
		  cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		  cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		  
		  Font font = workbook.createFont();
		  font.setColor(IndexedColors.LIGHT_YELLOW.getIndex());
		  font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		  font.setItalic(true);
		  font.setFontHeightInPoints( (short) 20);
		  font.setUnderline(Font.U_DOUBLE);
		  font.setFontName("Helvetia");
		  
		  cellStyle.setFont(font);
		  
		  cell1.setCellStyle(cellStyle);
		  
		  cell1.setCellValue(56);
		  cell2.setCellValue("+");
		  cell3.setCellValue(4);
		  cell4.setCellValue("=");
		  cell5.setCellFormula("A1+C1");
		  
		  cell6.setCellValue("Your Data");
		  
		  cell6.getRow().setHeightInPoints(30);
		  
		  uncomment till here*/
		  
		  cell1.getRow().setHeightInPoints((short) 100);
		  
		  
		  // merging cells
		  
		  sheet.addMergedRegion(new CellRangeAddress(0,4,0,3));

		  try(FileOutputStream output = new FileOutputStream("test.xls")) {			  
			  workbook.write(output);  
		  }
		  catch(Exception e) { 
			  e.printStackTrace();
		  }
    }
}
