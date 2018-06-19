package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliExample
{
	@Test
	public void sikuliscreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Screen s= new Screen();
		Pattern p=new Pattern("D:\\MouniWork\\Capture\\Capture.png");
		s.type(p, "mouni");
			
	}
}
