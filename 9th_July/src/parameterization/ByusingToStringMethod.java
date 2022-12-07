package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ByusingToStringMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String path = "C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Mock 8_Group B_9th July 2022_Batchnew.xlsx";
         FileInputStream file = new FileInputStream(path);
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet =workbook.getSheetAt(0);
         int lrow=sheet.getLastRowNum();
         int lcell=sheet.getRow(lrow).getLastCellNum();
         for(int i=0;i<=lrow;i++) 
         {
        	 XSSFRow Currentrow =sheet.getRow(i);
        	 
        	 for(int j=0;j<lcell;j++) 
        	 { 
        		 DataFormatter df  = new DataFormatter();
        		 
        		//String value=Currentrow.getCell(j).toString();
        		String value=df.formatCellValue(Currentrow.getCell(j));
        		System.out.print(value+" || ");
        		 
        	 }
        	 System.out.println();
         }
	}

}
