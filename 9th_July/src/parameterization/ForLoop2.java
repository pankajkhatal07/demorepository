package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ForLoop2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\excel-spreadsheet-examples-for-students.xlsx";
        FileInputStream file = new FileInputStream(path); 
        
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int row=sheet.getLastRowNum();
        int cell =sheet.getRow(row).getLastCellNum();
        
        for(int i=0;i<=row;i++) 
        {
        	XSSFRow rowvalue=sheet.getRow(i);
        	   for(int j=0;j<cell;j++)
        	   {
        		   XSSFCell cellvalue = rowvalue.getCell(j);
        		   switch(cellvalue.getCellType()) {
        		   case STRING :System.out.print(cellvalue.getStringCellValue());
        		   break;
        		   case BOOLEAN : System.out.print(cellvalue.getBooleanCellValue());
        		   break;
        		   case NUMERIC : System.out.print(cellvalue.getNumericCellValue());
        		   break;
        		 //  case _NONE :System.out.println(cellvalue.get);
        		   //case : System.out.println("NO value");
        		   
        		   }
        		   System.out.print(" || ");
        	   }
        	   System.out.println();
        }
        
	}

}
