package TestNGPractice;

import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliNotepadSaving
{
	@Test
	public void notepadsaving() throws Exception
	{
		Screen s=new Screen();
		App.open("notepad.exe");
		s.click();
		s.type("hi");
		s.find("D:\\MouniWork\\Capture\\Capture2.png").click();
		s.find("D:\\MouniWork\\Capture\\Capture3.png").click();
		s.find("D:\\MouniWork\\Capture\\Capture4.png").click();
		s.find("D:\\MouniWork\\Capture\\Capture5.png").click();
		s.find("D:\\MouniWork\\Capture\\Capture6.png").click();
		s.type("notepad");
		s.find("D:\\MouniWork\\Capture\\Capture7.png").click();
		s.find("D:\\MouniWork\\Capture\\Capture8.png").click();
	}
}
