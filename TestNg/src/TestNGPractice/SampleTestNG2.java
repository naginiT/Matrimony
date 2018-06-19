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

public class SampleTestNG2 
{

	@BeforeSuite
	public void open()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void close()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void exit()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void A()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void B()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void F()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void G()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void H()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void run()
	{
		System.out.println("Test");
	}
	@Test
	public void N()
	{
		System.out.println("Another Test");
	}
}
