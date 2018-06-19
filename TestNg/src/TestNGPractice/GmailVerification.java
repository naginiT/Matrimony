package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailVerification 
{
	WebDriver driver;
	
	@Test(dependsOnMethods = {"open"})

	public void Singin() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();
		Thread.sleep(1000);
		}

	@Test(dependsOnMethods = {"Singin"})

	public void username() throws Exception 
	{
		driver.findElement(By.name("identifier")).sendKeys("mounikagujjarlapudi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("mounik@1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(1000);

	}
	@Test
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("Installing the ChromeDriver");
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=YyjLWsPKLoWvX6vNjLgJ");
		driver.manage().window().maximize();

	}
	@Test(dependsOnMethods= {"username"})
	public void Compose()throws Exception 
	{
		driver.findElement(By.cssSelector("#\\3a hs > div > div")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("to")).sendKeys("mounikagujjarlapudi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("subjectbox")).sendKeys("TestNG Example Program");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\":o1\"]")).sendKeys("i got it");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#\\3a mm")).click();
		Thread.sleep(1000);
	}
	/*@Test(dependsOnMethods= {"Compose"})
	public void VerufySentmsg()throws Exception
	{
		driver.findElement(By.linkText("https://mail.google.com/mail/u/0/#sent")).click();
		Thread.sleep(1000);
	}*/


	/*@Test(dependsOnMethods = {"username"})

	public void Gmail() throws Exception
	{
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
	Thread.sleep(1000);
	}*/

}
