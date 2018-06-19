package TestNGPractice;

import java.io.File;


import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot1 
{
	@Test
	public void Fullpagescreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.programcreek.com/java-api-examples/java.awt.image.RenderedImage");
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		File f=new File("D:\\MouniWork\\fullpagescreenshot1.jpg");
		ImageIO.write(s.getImage(), "jpg", f);
	}
}
