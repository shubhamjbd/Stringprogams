package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RivisionDynamicExcelShhet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
 

		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\sir\\\\Desktop\\\\apachepoi\\\\sheet3.xlsx");
		
		Sheet Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet4");
		
		 
		
		int totalNoOfRows=Mysheet.getLastRowNum();
		 
		int TotalNoOfColumn=Mysheet.getRow(0).getLastCellNum()-1;  //you can minus 1 at here
	 
		
		for(int i=0;i<=totalNoOfRows;i++)
		{	
			for (int j=0;j<=TotalNoOfColumn;j++)
		          {
		            String valuesOfRowsAndColumns=Mysheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.print(valuesOfRowsAndColumns+"|| ");
		          }
			
			    System.out.println();
		}
		
		
		
	}

}
