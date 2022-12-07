package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Book1.xlsx";
		//step 2
		FileInputStream file = new FileInputStream(path); //read the data from excel sheet
		//step 3
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		//XSSF means-XSSF (XML Spreadsheet Format): It is used for xlsx file format of MS-Excel.
		/*
		 public class XSSFWorkbook
				extends POIXMLDocument
				implements Workbook, Date1904Support
				High level representation of a SpreadsheetML workbook. This is the first object most users will construct whether they are reading or writing a workbook. It is also the top level object for creating new sheets/etc.*/
						/*
		 public XSSFWorkbook(java.io.InputStream is)
             throws java.io.IOException
			Constructs a XSSFWorkbook object, by buffering the whole stream into memory and then opening an OPCPackage object for it.
			Using an InputStream requires more memory than using a File, so if a File is available then you should instead do something like


       OPCPackage pkg = OPCPackage.open(path);
       XSSFWorkbook wb = new XSSFWorkbook(pkg);
       // work with the wb object
       ......
       pkg.close(); // gracefully closes the underlying zip file
   
			Throws:
			java.io.IOException - If reading data from the stream fails
			POIXMLException - a RuntimeException that can be caused by invalid OOXML data
			java.lang.RuntimeException - a number of other runtime exceptions can be thrown, especially if there are problems with the input format*/
		
		XSSFSheet Sheet =workbook.getSheetAt(0); 
		int row = Sheet.getLastRowNum();
		System.out.println(row);
		int Col= Sheet.getRow(0).getLastCellNum();
		System.out.println(Col);
		
	}

}
