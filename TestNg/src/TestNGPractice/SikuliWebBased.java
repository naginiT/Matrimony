package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;

public class SikuliWebBased 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Screen s=new Screen();
		s.find("D:\\MouniWork\\Capture\\fbimage1.png");
		s.type( "mouni");
		s.find("D:\\MouniWork\\Capture\\fbimage2.png");
		s.type( "mounika");
	}
}
