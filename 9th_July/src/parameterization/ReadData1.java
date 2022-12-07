package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

//step-1 - Storing excel sheet path in the one String variable		
		String path="C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Book1.xlsx";

//		
		FileInputStream file = new FileInputStream(path);
/*java.io
Class FileInputStream
java.lang.Object
java.io.InputStream
java.io.FileInputStream
All Implemented Interfaces:
Closeable, AutoCloseable

public class FileInputStream
extends InputStream
A FileInputStream obtains input bytes from a file in a file system. 
What files are available depends on the host environment.
FileInputStream is meant for reading streams of raw bytes such as image data. 
For reading streams of characters, consider using FileReader.
*/
//Step 3- To open the excel sheet we need use the static method "create()" which is present in "Workbook Factory class"	
/*
 public XSSFWorkbook create()
Create a new empty Workbook
Specified by:
create in interface WorkbookProvider
Returns:
The created workbook*/		
String data =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);

	}
	
}
