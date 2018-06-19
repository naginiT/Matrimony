package RetryFailedTestCase;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retest2 implements IRetryAnalyzer
{

	@Override
	public boolean retry(ITestResult result) 
	{
		
		int retryCount=1;
		int MAX_RETRY_COUNT=5;
		
		if(result.getStatus()==ITestResult.FAILURE && retryCount<=MAX_RETRY_COUNT)
		{
			try
			{
				System.out.println(String.format("Method Name: %s Retry Count: %d", result.getMethod(),retryCount));
				retryCount++;
				return true;
			}
			catch(Exception e)
			{
				
			}
		}
		return false;
	}

}
