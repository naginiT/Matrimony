package FailedTestCaseScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersEx.class)
public class FailedScreenShot
{
	public static WebDriver driver;
	@Test
	public void CaptureScreenShot()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.id("lst-id")).sendKeys("mouni");
	}
}
