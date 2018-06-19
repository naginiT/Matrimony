package RetryFailedTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextFromImage
{
	WebDriver driver;
	@Test
	public void exe()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/");
		List<WebElement> images=driver.findElements(By.xpath("//div[@class='sb-description']/h3"));
		int a=images.size();
		System.out.println("count of images" +a);
		for(int i=0;i<a;i++)
		{
		    WebElement ele=images.get(i);
		    String s=ele.getAttribute("outerText");
		    System.out.println(s);
		 }
	}
		
}
