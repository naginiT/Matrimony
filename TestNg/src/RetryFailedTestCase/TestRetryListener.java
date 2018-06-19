package RetryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryListener
{
	@Test(retryAnalyzer=Retest2.class)
	public void testretry()
	{
		Assert.assertEquals("TestNg1", "TestNg2");
	}
}
