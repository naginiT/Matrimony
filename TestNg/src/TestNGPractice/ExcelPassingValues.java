package TestNGPractice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelPassingValues
{
	@Test
	public void passingvalues() throws Exception
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
		  
		  ce=sh.getRow(1).getCell(0);
		  int  i=(int) ce.getNumericCellValue();
		driver.findElement(By.name("firstname")).sendKeys(String.valueOf(i));
		  
	}
}
