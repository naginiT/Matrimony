package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG
{
	@BeforeSuite
	public void accept()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void decline()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void close()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void back() 
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void encrypt()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void gmail()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void fast()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void hash()
	{
		System.out.println("After Method");
	}
	@Test
	public void quit()
	{
		System.out.println("testing");
	}
}
