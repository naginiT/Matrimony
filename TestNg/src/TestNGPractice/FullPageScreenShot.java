package TestNGPractice;

import java.io.File;

import javax.imageio.ImageIO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenShot 
{
	@Test
	public void screen() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html");
		Reporter.log("element found");
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		File fi=new File("D:\\MouniWork\\FullPageScreenshots.png");
		ImageIO.write(s.getImage(),"png", fi);
		Reporter.log("<br><img src="+fi+" height ='500' width='550'/><br>");
		
	}
}
