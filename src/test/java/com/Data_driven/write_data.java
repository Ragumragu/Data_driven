package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data {
	public static void main(String[] args) throws Throwable {
		
		File f = new File("E:\\ansys dual band\\com.Data_driven\\Data_driven.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		Sheet createSheet = wb.createSheet("New_sheet1");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Google");
		
		wb.getSheet("New_sheet1").getRow(0).createCell(1).setCellValue("youtube");
		wb.getSheet("New_sheet1").getRow(0).createCell(2).setCellValue("Map");
		wb.getSheet("New_sheet1").getRow(0).createCell(3).setCellValue("email");
		
		Row createRow2 = createSheet.createRow(1);
		Cell createCell2 = createRow2.createCell(0);
		createCell2.setCellValue("personal_info");
		
		wb.getSheet("New_sheet1").getRow(1).createCell(1).setCellValue("ragu");
		wb.getSheet("New_sheet1").getRow(1).createCell(2).setCellValue("6382564536");
		wb.getSheet("New_sheet1").getRow(1).createCell(3).setCellValue("tiruppur");
		
		FileOutputStream fs = new FileOutputStream(f);
		
		wb.write(fs);
		
		System.out.println("Compleded");
		
	}

}
