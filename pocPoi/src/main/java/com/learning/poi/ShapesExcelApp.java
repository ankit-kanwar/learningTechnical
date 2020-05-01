package com.learning.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSimpleShape;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ShapesExcelApp {

	public static void main(String[] args) {
		
		Workbook workbook = new HSSFWorkbook();
		
		Sheet sheet = workbook.createSheet();
		
		HSSFPatriarch patriarch = (HSSFPatriarch) sheet.createDrawingPatriarch();
		HSSFClientAnchor anchor = new HSSFClientAnchor();
		anchor.setCol1(1);
		anchor.setCol2(3);
		anchor.setRow1(1);
		anchor.setRow2(5);
		
		HSSFSimpleShape shape = patriarch.createSimpleShape(anchor);
		//shape.setShapeType(HSSFSimpleShape.OBJECT_TYPE_LINE);
		shape.setShapeType(HSSFSimpleShape.OBJECT_TYPE_OVAL);
		//shape.setFillColor(100, 100, 100); // rgb color
		
		shape.setFillColor(0, 255, 255); // rgb color complete green 255 is max range of rgb color
		shape.setLineStyle(HSSFSimpleShape.LINESTYLE_DASHGEL);
		shape.setLineStyleColor(200, 120, 40);
		shape.setLineWidth(HSSFSimpleShape.LINEWIDTH_ONE_PT * 3);
		
		try(FileOutputStream fos = new FileOutputStream("shapes_video_11.xls");) {
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
