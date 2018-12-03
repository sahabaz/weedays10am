package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new File("C:\\Users\\Jspider\\Desktop\\testData.xls"));
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(5);
		Cell c = r.getCell(1);
		String s = c.toString();
		System.out.println(s);
	}
}
