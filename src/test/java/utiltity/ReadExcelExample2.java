package utiltity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData\\RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//read data from sheet
		//indexing start from 0 ----- 
		XSSFSheet  sheet = workbook.getSheetAt(1);
		
		
		//access sheet by Sheetname
//		XSSFSheet  sheet = workbook.getSheet("smokeTest");
		
		
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
