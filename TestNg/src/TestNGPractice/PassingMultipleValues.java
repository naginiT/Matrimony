package TestNGPractice;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PassingMultipleValues
{
	@Test
	public void multiplevalues() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  FileInputStream fis= new FileInputStream("C:\\Users\\hai\\Desktop\\Excelsheets\\DataProvider.xlsx");
		  @SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sh=wb.getSheetAt(0);
		  XSSFCell ce;
		  System.out.println(sh.getLastRowNum());
		  for(int i=1;i<=sh.getLastRowNum();i++)
		  {
			  ce=sh.getRow(i).getCell(0);
			  driver.findElement(By.name("firstname")).sendKeys(ce.getStringCellValue());
			  Thread.sleep(2000);
			  driver.findElement(By.name("firstname")).clear();
			  Thread.sleep(2000);
		  }
		  driver.close();
	}
}
