package TestNGPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelreading 
{
     @SuppressWarnings("deprecation")
  public static void main(String[] args) throws Exception 
   {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://cubicitsolution.co.in/matrimony/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"top-area-nav\"]/ul/li/a")).click();
	
	FileInputStream fi = new FileInputStream("D:\\Excelsheets\\reading.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheetAt(0);
	XSSFCell c ;
	
	System.out.println(sh.getLastRowNum());
	  for(int i=1;i<=sh.getLastRowNum();i++)
	   {
		 c=sh.getRow(i).getCell(0);
     	 if(c.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
     	  {
     		long l=(long) c.getNumericCellValue();
     		//driver.findElement(By.id("email")).sendKeys(String.valueOf(l));
     		///driver.findElement(By.id("top-area-login")).sendKeys(String.valueOf(l));
     		driver.findElement(By.id("top-area-login")).sendKeys(String.valueOf(l));
     		Thread.sleep(1000);
     	}
     	else
     	{
     		//driver.findElement(By.id("email")).sendKeys(c.getStringCellValue());
      		driver.findElement(By.id("top-area-login")).sendKeys(c.getStringCellValue());
      		Thread.sleep(1000);
     	}
     	 for(int j=1;j<=sh.getLastRowNum();i++)
  	   {
  		 c=sh.getRow(j).getCell(1);
       	 if(c.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
       	  {
       		long l=(long) c.getNumericCellValue();
       		driver.findElement(By.id("top-area-password")).sendKeys(String.valueOf(l));
    		Thread.sleep(1000);
       	}
       	else
       	{	
              	//driver.findElement(By.id("email")).sendKeys(c.getStringCellValue());
       		driver.findElement(By.id("top-area-password")).sendKeys(c.getStringCellValue());
    		Thread.sleep(1000);
       	}
     	      	
	///	c=sh.getRow(i).getCell(1);
		//System.out.println(c);
		//driver.findElement(By.id("top-area-password")).sendKeys(c.getStringCellValue());
		//Thread.sleep(1000);
		driver.findElement(By.id("top-area-button-submit")).click();
		Thread.sleep(1000);
	
		System.out.println(driver.getTitle());
		//String er="CubicIT Products - Exclusive Matrimony for Aryavysya";
		String er="CubicIT Products - My Profile";
		String ar=driver.getTitle();
		    if(er.equals(ar))
		    {
		       sh.getRow(i).createCell(2).setCellValue("pass");
		       FileOutputStream fo=new FileOutputStream("D:\\Excelsheets\\reading.xlsx");
	        	wb.write(fo);
		       //driver.findElement(By.xpath("//*[@id=\'top-area-nav\']/ul/li[4]/a")).click();
		       Thread.sleep(2000);
		    }
		else
		   {
			sh.getRow(i).createCell(2).setCellValue("fail");
			FileOutputStream fo=new FileOutputStream("D:\\Excelsheets\\reading.xlsx");
			wb.write(fo);
			
		}
		    driver.findElement(By.xpath("//*[@id='top-area-nav']/ul/li[4]/a")).click();
	   }
     }
   }}