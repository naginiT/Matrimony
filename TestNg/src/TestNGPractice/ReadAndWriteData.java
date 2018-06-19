package TestNGPractice;


	import java.io.FileInputStream;
	
import java.io.FileOutputStream;


	
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class ReadAndWriteData
	{

	

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			FileInputStream fis=new FileInputStream("D:\\Excelsheets\\reading.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
			XSSFCell c ;
			System.out.println(sh.getLastRowNum());
			for(int i=1;i<=sh.getLastRowNum();i++)
			{
	         	c=sh.getRow(i).getCell(0);
	         	if(c.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
	         	{
	         		long l=(long) c.getNumericCellValue();
	         		driver.findElement(By.id("email")).sendKeys(String.valueOf(l));
	         	}
	         	else
	         	{
	         		driver.findElement(By.id("email")).sendKeys(c.getStringCellValue());
	         	}
				Thread.sleep(2000);
				c=sh.getRow(i).getCell(1);
				System.out.println(c);
				
				driver.findElement(By.id("pass")).sendKeys(c.getStringCellValue());
				Thread.sleep(5000);
				driver.findElement(By.id("loginbutton")).submit();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				String er="(33) Facebook";
				String ar=driver.getTitle();
				if(er.equals(ar))
				{
				sh.getRow(i).createCell(2).setCellValue("pass");
				FileOutputStream fo=new FileOutputStream("D:\\Excelsheets\\reading.xlsx");
				wb.write(fo);
				driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[22]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"js_5v\"]/div/div/ul/li[12]")).click();
				}
				else
				{
					sh.getRow(i).createCell(2).setCellValue("fail");
					FileOutputStream fo=new FileOutputStream("D:\\Excelsheets\\reading.xlsx");
					wb.write(fo);
					
				}
         		
				//driver.findElement(By.id("email")).clear();
				Thread.sleep(2000);
			}
			

		}

	}


