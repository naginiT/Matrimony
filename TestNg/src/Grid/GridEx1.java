package Grid;


import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridEx1 
{
	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities ds=DesiredCapabilities.chrome();
		ds.setPlatform(Platform.WINDOWS);
		URL u=new URL("http://192.168.100.7:4444/wd/hub");
		RemoteWebDriver rc=new RemoteWebDriver(u,ds);
		rc.get("https://www.seleniumhq.org/download/");
		System.out.println("The hub is successfully connected");
	}
}

