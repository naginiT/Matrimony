package FailedTestCaseScreenShot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hexacolor1 
{
		public static void main(String[] args) throws Exception
		 {
			System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
			String sizeF=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("font-size");
			System.out.println("Font-Size: "+sizeF);
			
			String color=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
			System.out.println("BeforeColor: "+color.hashCode());
			
			WebElement e=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]"));
			Actions a=new Actions(driver);
			a.moveToElement(e).build().perform();
			
			String color1=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
			System.out.println("AfterColor: "+color1.hashCode());  

	}
	
}
