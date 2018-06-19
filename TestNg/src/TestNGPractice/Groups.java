package TestNGPractice;

import org.testng.annotations.Test;

public class Groups 
{

	@Test(groups= {"Regression"})
	public void A()
	{
		System.out.println("A");
	}
	@Test(groups= {"Sanity"})
	public void B()
	{
		System.out.println("B");
	}

	@Test(groups= {"Regression"})
	public void C()
	{
		System.out.println("C");
	}

	@Test(groups= {"Sanity"})
	public void D()
	{
		System.out.println("D");
	}
}
