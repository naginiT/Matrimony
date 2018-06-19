package RobotPractice;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Download 
{
	
		public static void main(String[] args) throws Exception 
		{
			Robot robot = new Robot();
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/search?hl=en&tbm=isch&q=natural+image&chips=q:natural+image,g_5:1080p&sa=X&ved=0ahUKEwiXjbaPqrHbAhXZTX0KHZshD6YQ4lYIMCgB&biw=1366&bih=588&dpr=1#imgrc=_");
		    robot.setAutoDelay(1000);
		    
		    robot.mouseMove(450,600);
		    robot.mousePress(InputEvent.BUTTON3_MASK);
	        robot.mouseRelease(InputEvent.BUTTON3_MASK);
	        robot.setAutoDelay(1000);
	        
		    robot.mouseMove(480, 480);
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    robot.setAutoDelay(1000);
		    
		    robot.mouseMove(480, 450);
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    robot.setAutoDelay(1000);
		    
		    System.out.println("File/Image is sucessfully Downloaded");
		    
		    driver.close();  
		}
	

}
