   package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\ansys dual band\\com.Data_driven\\Data_driven.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		Sheet sheetAt = wb.getSheetAt(0); 
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType(); 
		
		if (cellType.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println(stringCellValue);
			
		}
		else {
			cellType.equals(CellType.NUMERIC);
			
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
		
		
		
		
		
	}

}
