package utiltity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//read data from sheet
		//indexing start from 0 ----- 
		HSSFSheet  sheet = workbook.getSheetAt(0);
		
		
		//access sheet by Sheetname
//		HSSFSheet  sheet = workbook.getSheet("smokeTest");
		
		
		int rowCount = sheet.getLastRowNum();
		
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		
		System.out.println("Row count are: " + rowCount);
		System.out.println("Columns count are: " + columnCount);
		
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fname = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			System.out.println("----------------------------------------------");
			System.out.println("Member details are: " + fname + " : " + address);
			
			
		}

	}

}
