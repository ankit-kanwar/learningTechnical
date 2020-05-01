package com.learning.poi;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class IteratingExcelApp {
	
	private static final String PARENT_FOLDER = "D:/_Drive/PoC_Learning_Proj/learningpoi";

	public static void main(String[] args) {
		JFileChooser jFileChooser = new JFileChooser(PARENT_FOLDER);
		int userInput = jFileChooser.showOpenDialog(null);
		
		if( userInput  == JFileChooser.APPROVE_OPTION ) {
			try {
				Workbook workbook = new HSSFWorkbook(new FileInputStream(jFileChooser.getSelectedFile()));
				Sheet sheet = workbook.getSheetAt(0);
				
				for (Row row : sheet) {					
					for (Cell cell : row) {
						cell.setCellType(Cell.CELL_TYPE_STRING);
						System.out.print(cell.getStringCellValue()+"\t");
					}
					System.out.println();
				}
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
