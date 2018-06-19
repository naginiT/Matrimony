package TestNGPractice;


import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliExampe2
{
	@Test
	public void sikuliscreenshot() throws Exception
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");*/
		Screen s=new Screen();
		App.open("notepad.exe");
		s.click();
		s.type("hi");
	}
}
