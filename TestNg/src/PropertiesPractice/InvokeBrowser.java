package PropertiesPractice;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvokeBrowser 
{
	WebDriver driver;
	public  InvokeBrowser(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Actions(Properties p,String operations,String name,String value)
	{
		if(operations.equalsIgnoreCase("openurl"))
		{
			driver.get(p.getProperty(value));
		}
		else if(operations.equalsIgnoreCase("entername"))
		{
			driver.findElement(By.id(p.getProperty(name))).sendKeys(value);
		}
		else if(operations.equalsIgnoreCase("enterpassword"))
		{
			driver.findElement(By.id(p.getProperty(name))).sendKeys(value);
		}
		else if(operations.equalsIgnoreCase("login"))
		{
			driver.findElement(By.xpath(p.getProperty(name))).click();
		}
	}
}
