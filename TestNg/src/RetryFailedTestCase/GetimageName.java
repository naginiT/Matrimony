package RetryFailedTestCase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	 

public class GetimageName
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://cubicitsolution.co.in/welcome");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\'sb-slider\']/li[1]/div/h3"));
		a.moveToElement(e1).build().perform();
		System.out.println(e1.getText());
		Actions a1=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"nav-arrows\"]/a[1]"));
		a1.click(e).build().perform();
		
		
	}
}
		

				
			
				
				
			

