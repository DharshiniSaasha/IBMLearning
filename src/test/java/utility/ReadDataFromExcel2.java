package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
		//read data from excel file
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//XSSFSheet sheet = workbook.getSheet("smokeTest");
		HSSFSheet sheet = workbook.getSheetAt(0);		//Student
		
		//get number of rows and columns
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("No of Rows are: " + rowCount);
		System.out.println("No of Columns are: " + columnCount);
		
		
		//loop
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			System.out.println("FirstName: " + fName);
			System.out.println("address: " + address);
			System.out.println("===============" + i + "======================");
			
		}
		
		
		
		
	}

}
