package org.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	private DataFormatter datformat;
	private Workbook wb;
	        Sheet sheet;
	/**
	 * this method is usd
	 * @param excelpath
	 */
	public void loadExcelFile(String excelpath) {
		FileInputStream fisExcel;
		try {
			fisExcel = new FileInputStream(excelpath);
			 wb = WorkbookFactory.create(fisExcel);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}


/**
 * 
 * @param rowNumber
 * @param cellNumber
 * @param sheetName
 * @return
 */
public String getDataFromExcel(int rowNumber,int cellNumber,String sheetName)
{
datformat=new DataFormatter();
sheet= wb.getSheet(sheetName);
String data = datformat.formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));	
return data;	
}


public  void saveoutputintoExcel(String excelpath) {
	FileOutputStream fos=null;
	try {
		fos = new FileOutputStream(excelpath);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	try {
		wb.write(fos);
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public void setDataintoExcel(String setExcelData ,int rowNumber,int createcellNumber,String sheetName)
{
	sheet=wb.getSheet(sheetName);
	sheet.getRow(rowNumber).createCell(createcellNumber).setCellValue(setExcelData)	;
}


public void workbookClose() {
	try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

