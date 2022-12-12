package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		//read data from excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("smokeTest");
		//XSSFSheet sheet = workbook.getSheetAt(0);		//Student
		
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
