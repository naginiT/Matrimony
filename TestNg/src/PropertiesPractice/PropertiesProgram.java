package PropertiesPractice;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProgram 
{
	public Properties Example() throws Exception
	{
		Properties p=new Properties();
		InputStream is=new FileInputStream("value.properties");
		p.load(is);
		return p;
		
	}

}
