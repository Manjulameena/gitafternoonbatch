package org.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3Frame {
	public static void main(String[] args) throws IOException {
		//mention the filepath or locator
		File f=new File("C:\\Users\\Admin\\Desktop\\New folder\\SampleProgram\\src\\test\\java\\org\\day2\\samplexcel\\book1.xlsx");
		//get into the file
		FileInputStream fin=new FileInputStream(f);
		//get into the workbook
		Workbook w=new XSSFWorkbook(fin);
		//get the sheet
		Sheet s=w.getSheet("Sheet1");
		//to find the number of row inthe sheet
		//int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		//System.out.println("Row count:"+physicalNumberOfRows);
		//to fine the number of cells in the sheet
		//Row row = s.getRow(2);
		//int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		//System.out.println("cell count:"+physicalNumberOfCells);

	//to get the whole date from the sheet
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
//to get each row in the sheet
		Row r=s.getRow(i);
		//to get the cell count
		for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c=r.getCell(j);
			System.out.println(c);
		}
	}
	
	}
}