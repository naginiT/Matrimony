package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx
{
	
	@DataProvider(name="Data")
	
	public Object[][]  Data()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="mounika";
		obj[0][1]="mounika95";
		
		obj[1][0]="abcdefgh";
		obj[1][1]="uvwxyz";
		
		obj[2][0]="mounika95";
		obj[2][1]="mounik@1995";
		
		return obj;
		
	}
	WebDriver driver;
	@Test(dataProvider="Data")
	public void test(String user,String pass)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys(user);
	      driver.findElement(By.id("pass")).sendKeys(pass);
	}


}
