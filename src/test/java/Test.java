import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void dataDriven(String path,int roww,int cell1,String Sheet) throws IOException {

	//Xlsheet\\harish.xls
	
		File f=new File(path);
	FileInputStream f2=new FileInputStream(f);	
	
	Workbook w= new HSSFWorkbook(f2);
	
	//Harish sep
	
	Sheet s3 = w.getSheet(Sheet);
	Row row = s3.getRow(roww);
	
	Cell cell = row.getCell(cell1);
	System.out.println(cell);
	
		
	}
	
	public static void main(String[] args) throws IOException {
		dataDriven("Xlsheet\\harish.xls", 1, 1, "Harish sep");
		
	}
	

}
