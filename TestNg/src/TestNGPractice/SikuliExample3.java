package TestNGPractice;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class SikuliExample3
{
	@Test
	public void sikuliscreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Screen s=new Screen();
		ScreenImage si=s.capture();
		ImageIO.write(si.getImage(), "png",new File("D:\\MouniWork\\Sikuliimage.png"));
	}
}
