import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFramework {

	public static void main(String[] args) throws InvalidFormatException, IOException {
	
		FileInputStream fs = new FileInputStream("E:\\Navya\\JAVA&Selenium\\Selenium\\Example1.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Cell c1 = wb.getSheet("Sheet1").getRow(0).getCell(0);
		String name = c1.getStringCellValue();
		System.out.println(name);
	}

}
