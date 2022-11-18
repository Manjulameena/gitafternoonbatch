package org.correctformat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CorrectFormatexcel {
public static void main (String[]args) throws IOException {
	File f=new File("C:\\Users\\Admin\\Desktop\\New folder\\SampleProgram\\src\\test\\java\\org\\day2\\samplexcel\\book1.xlsx");
FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet("Sheet1");
	Row r=s.getRow(2);
	Cell c=r.getCell(2);
	System.out.println(c);
	//TO GET THE CELL TYPE
	int CellType=c.getCellType();
	System.out.println("cell type:"+CellType);
//TO CHECK WHETHER THE VALUE IN THE CELL IS STRING VALUE
	if(CellType==1) {
		String stringcellvalue=c.getStringCellValue();
		System.out.println(stringcellvalue);
	}
	
	//TO CHECK WHETHER THE VALUE IN THE CELL IS IN THE NUMBER FORMAT
	else if(CellType==0) {
		//TO CHECK THE VALUE IN THE CELL IS IN THE DATE FORMAT
	if(DateUtil.isCellDateFormatted(c)){ 
		//TO GET THE VALUE FROM THECELL AS DATA VALUE
	java.util.Date dateCellvalue=c.getDateCellValue();
	//TO CONVERT THE DATE VALUE TO SIMPLE DATEFORMAT
	SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
	//TO CONVERT THE DATA VALUE TO STRING VALUE
 String format=sim.format(dateCellvalue);
 
 System.out.println(format);
 
 
	
	}
	else {
		//TO GET THE VALUE FROM THE CELL AS NUMERIC VALUE
		double numericCellValue=c.getNumericCellValue();
		//TYPECASTING
		long l=(long)numericCellValue;
		//TO CONVERT THE LONG VALUE TO STRING
		String valueOf=String.valueOf(l);
	//TO PRINT THE CONVERTED LONG VALUE TO STRING
System.out.println(valueOf);
	}
}
}
}
