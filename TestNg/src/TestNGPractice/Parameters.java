package TestNGPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters 
{
	WebDriver driver;
	@org.testng.annotations.Parameters({"user","password"})
	@Test
	
	public void passingvalues(String user,String password)
	{
		  System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys(user);
	      driver.findElement(By.id("pass")).sendKeys(password);
	  }

}
