package com.learning.poi;

import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ConditionalFormattingInExcelApp {
		
	public static void main(String[] args) {
		
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("conditional_formatting");
		
		Row row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue(38); //A1
		row0.createCell(1).setCellValue("+"); //B1
		row0.createCell(2).setCellValue(12);  //C1
		row0.createCell(3).setCellValue("=");  //D1
		
		//create conditional format
		SheetConditionalFormatting conditionalFormatting = sheet.getSheetConditionalFormatting();
		
		//create rules
		ConditionalFormattingRule rule = conditionalFormatting.createConditionalFormattingRule(ComparisonOperator.EQUAL, "$A1+$C1");
		
		//create background colour
		PatternFormatting background = rule.createPatternFormatting();
		background.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		
		CellRangeAddress[] range = {CellRangeAddress.valueOf("E1:E1")};
		
		conditionalFormatting.addConditionalFormatting(range, rule);
		
		try(FileOutputStream fos = new FileOutputStream("conditionalFormatting.xls");) {
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
