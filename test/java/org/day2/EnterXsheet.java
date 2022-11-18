package org.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterXsheet {
public static void main(String[] args) throws IOException {
	//mention the filepath or locator
	File f=new File("C:\\Users\\Admin\\Desktop\\New folder\\SampleProgram\\src\\test\\java\\org\\day2\\samplexcel\\book1.xlsx");
	//get into the file
	FileInputStream fin=new FileInputStream(f);
	//get into the workbook
	Workbook w=new XSSFWorkbook(fin);
	//get the sheet
	Sheet s=w.getSheet("Sheet1");
	//get the row
	Row r=s.getRow(3);
	//get the cells
	Cell c=r.getCell(3);
	///print the statement
	System.out.println(c);
}

 
}
