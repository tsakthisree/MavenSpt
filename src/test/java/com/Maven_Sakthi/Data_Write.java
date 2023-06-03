package com.Maven_Sakthi;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Data_Write {
	
	public static void main(String[] agrs) throws IOException {
		
	File f = new File("C:\\Users\\suren\\OneDrive\\Desktop\\Maven.xlsx"); 
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook();
	
	Sheet createsheet = wb.createSheet("DemoData");
	
	Row createrow = createsheet.createRow(2);
	
	Cell createcell = createrow.createCell(1);
	
	createcell.setCellValue("Hasini@06");
	
	System.out.println("done");
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	
	
	
	}
}
