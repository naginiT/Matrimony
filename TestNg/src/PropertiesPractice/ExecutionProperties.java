package PropertiesPractice;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionProperties 
{
	@Test
	public void FinalExecution() throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		FacebookSheet fb=new FacebookSheet();
	    InvokeBrowser ib=new InvokeBrowser(driver);
		
		PropertiesProgram p=new PropertiesProgram();
		Properties p1=p.Example();
		XSSFSheet sh=fb.Readingdata("D:\\Excelsheets\\Properties.xlsx", "Sheet1");
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			ib.Actions(p1, sh.getRow(i).getCell(0).toString(), sh.getRow(i).getCell(1).toString(), sh.getRow(i).getCell(2).toString());
		}
	}

}
