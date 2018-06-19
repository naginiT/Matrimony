package FailedTestCaseScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

	public class SS extends FailedScreenShot
	{
			
			public static String m() throws Exception
			{

			
			TakesScreenshot ts=(TakesScreenshot) driver;
			 
			File src=ts.getScreenshotAs(OutputType.FILE);
			String  s="D:\\MouniWork\\screen.png";
			File des=new File(s);
			
			 
			FileUtils.copyFile(src,des);
			 
			System.out.println("Screenshot taken");
			return s;
			} 
			

	}


