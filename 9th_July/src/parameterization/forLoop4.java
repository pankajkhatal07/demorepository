package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class forLoop4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Mock 8_Group B_9th July 2022_Batchnew.xlsx";

		FileInputStream file = new FileInputStream(path);//read file
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheetAt(0);
	//	System.out.println(sheet);
		
		int lrow=sheet.getLastRowNum();
	//	System.out.println(lrow);
		
		int Lcell=sheet.getRow(lrow).getLastCellNum();// lastIndex+1
		//System.out.println(Lcell);
		
		for(int i=0;i<=lrow;i++) {
			
			XSSFRow row =sheet.getRow(i);
			
			for (int j=0;j<Lcell;j++) {
				
				XSSFCell cell =row.getCell(j);
				
				switch(cell.getCellType()) {
				case STRING : System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC :System.out.print(cell.getNumericCellValue());
				break;
				}
				System.out.print("  ||  ");	
			}
			System.out.println();
		}
	}

}
