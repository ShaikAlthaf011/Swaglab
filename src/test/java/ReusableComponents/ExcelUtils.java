package ReusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public String[][]getlogindata() throws IOException{
	File F=new File(".\\Datafolder\\DataExcelsheetswag.xlsx");
	FileInputStream fis=new FileInputStream(F);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("swaglabdata");
	int noofRows=sheet.getPhysicalNumberOfRows();
	int noofColumns=sheet.getRow(0).getLastCellNum();
	String [][]Data=new String[noofRows-1][noofColumns];
	for(int i=0;i<noofRows-1;i++) {
		for(int j=0;j<noofColumns;j++) {
			DataFormatter df=new DataFormatter();
			Data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			
		}
	}
	workbook.close();
	fis.close();
	return Data;
	
}
}
