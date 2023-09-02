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

public class data_readandget {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\ansys dual band\\com.Data_driven\\Data_driven.xlsx");    
		
		FileInputStream  fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = sheetAt.getRow(i);
			
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int a =(int) numericCellValue;             ////type casting
					System.out.println(a);
					
				}
				
			}
			
		}
		
	}

}
