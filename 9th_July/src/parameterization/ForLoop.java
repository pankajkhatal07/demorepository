package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ForLoop {

	public static void main(String[] args) throws IOException {
		
	String path = "C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Mock 8_Group B_9th July 2022_Batch.xlsx";
//not showing any data	//String path ="D:\\Study\\Velocity\\Manual 1\\Notes\\MockMarks\\Mock 8_Group B_9th July 2022_Batc.xlsx";
//null pointer exception //String path ="C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Mock 9_Group B_9th July 2022_Batch.xlsx";
		FileInputStream file = new FileInputStream(path);//This class is used to open the file in input mode. means we are reading the data.
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);//workbook
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int lrow=sheet.getLastRowNum();//get last index
		//System.out.println(lrow);
     	int lcell=sheet.getRow(lrow).getLastCellNum(); // index+1;
	      // System.out.println(lcell);
     	for (int i=0;i<=lrow;i++)  //for row
		{
			XSSFRow row1 =sheet.getRow(i);  //value of row is stored in one variable by using XSSFRow class.
		
			for(int j=0;j<lcell;j++) //column /cell
			{	
				XSSFCell cell1=row1.getCell(j);
			
				
				switch(cell1.getCellType()) {
				case STRING:System.out.print(cell1.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell1.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(cell1.getBooleanCellValue());
				break;
				case _NONE:System.out.println(cell1.getRawValue());
				break;
				case ERROR:System.out.println(cell1.getErrorCellString());
				break;
				case FORMULA:System.out.println(cell1.getNumericCellValue());
				break;	
				}
				System.out.print(" || ");
			}
			System.out.println();
		}
		
		
	}

}
