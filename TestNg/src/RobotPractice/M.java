package RobotPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M {
	

	
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
			driver.findElement(By.name("unm")).sendKeys("admin");
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys("admin321");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/b/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
			Thread.sleep(1000);
			InputStream inStream = null;
			OutputStream outStream = null;
			
		    try
		    {
		    	File afile =new File("C:\\Users\\hai\\Favorites\\Downloads\\Candidates_list.csv");
		    	File bfile =new File("D:\\MouniWork\\mouni\\Candidates_list.csv");
		    	inStream = new FileInputStream(afile);
		    	outStream = new FileOutputStream(bfile);
		    	byte[] buffer = new byte[1024];
		    	int length; 
		    	while ((length = inStream.read(buffer)) > 0)
		    	{
		    	  outStream.write(buffer, 0, length);
		    	}
		    	inStream.close();
		    	outStream.close();
		    	afile.delete();
		    	System.out.println("File is copied successful!");
		    	//driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
		    	Thread.sleep(1000);    
		    }
		   	catch(IOException e)
		   	{
		   	    e.printStackTrace();
		   	}
		}
	}


