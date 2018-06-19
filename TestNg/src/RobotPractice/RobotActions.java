package RobotPractice;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotActions 
{
	@Test
	public void wordtopdf() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.ilovepdf.com/word_to_pdf");
		 driver.findElement(By.id("pickfiles")).click();
		 Thread.sleep(2000);
		 StringSelection ss=new StringSelection("D:\\MouniWork\\RobotActions.docx");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 Thread.sleep(2000);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 Thread.sleep(2000);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
