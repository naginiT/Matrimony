package PropertiesPractice;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FacebookSheet 
{
	public XSSFSheet Readingdata(String filepath,String sheet) throws Exception
	{
		FileInputStream fis=new FileInputStream(filepath);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheet);
		return sh;
	}
}
