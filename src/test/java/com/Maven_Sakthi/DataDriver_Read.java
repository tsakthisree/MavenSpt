package com.Maven_Sakthi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriver_Read {
	
	public static void particularData()throws IOException {
		
		File f = new File("C:\\Users\\suren\\OneDrive\\Desktop\\Maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f); //File Not Found Exception...
		
		Workbook wb = new XSSFWorkbook(fis); //IO Exception
		
		Sheet st = wb.getSheet("User Data");
		Row ro = st.getRow(2);
		Cell cl = ro.getCell(1);
		
		CellType cellType = cl.getCellType();
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cl.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(cellType.equals(cellType.NUMERIC)) {
		
			double numericCellValue = cl.getNumericCellValue();
			System.out.println(numericCellValue);
			}
	}
	
		public static void allData() throws IOException {
		
		File f = new File("C:\\Users\\suren\\OneDrive\\Desktop\\Maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet st = wb.getSheet("User Data");
		
		int physicalNumberOfRows = st.getPhysicalNumberOfRows();
		
		System.out.println("physicalNumberOfRows :" + physicalNumberOfRows);
		
		
		for (int i = 0; i <physicalNumberOfRows; i++) {
			
			Row ro = st.getRow(i);
			
			int physicalNumberOfCells = ro.getPhysicalNumberOfCells();
			System.out.println("physicalNumberOfCells :" + physicalNumberOfCells);
			
			for (int j = 0; j < physicalNumberOfCells; j++) {
				
				Cell cl = ro.getCell(j);
				
				CellType cellType = cl.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cl.getStringCellValue();
					System.out.println(stringCellValue);
					}
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double numericCellValue = cl.getNumericCellValue();
					System.out.println(numericCellValue);
					
				}	
			}	
		}
	}
		
	public static void main(String[]agrs)throws Throwable{
		allData();
	}
}

		








