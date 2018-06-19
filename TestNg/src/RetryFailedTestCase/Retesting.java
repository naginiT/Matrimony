package RetryFailedTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retesting 
{
	@Test
	public  void login() throws Exception
		{

			System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://ghmc1.ghmc.gov.in/vehmain/login.asp");
			Thread.sleep(10000);

			driver.findElement(By.name("username")).sendKeys("WESTZONE");
			Thread.sleep(1000);

			driver.findElement(By.name("password")).sendKeys("WESTZONE@VMS");
			Thread.sleep(1000);

			driver.findElement(By.name("Submit")).click();
			Thread.sleep(1000);
			
			if(driver.getTitle().contentEquals(":: Vehicle Management System :: Greater Hyderabad Municipal Corporation"))
				{
					System.out.println("Login Success");
					driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[6]/div/strong/a/font")).click();
					driver.close();
				}
			else
				{
					System.out.println("Login Failed");
				}

		}
}
