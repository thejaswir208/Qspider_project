import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(50);
		System.out.println("Opened Notepad");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		System.out.println("Entered A in Notepad");
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		/*DEMO FOR MOUSE MOVEMENTS*/
		// int j=10;
				// for(int i=0;i<=10;i++)
				//{
					//System.out.println("line");
					//r.mouseMove(50, j);
					//j=j+50;
				//	Thread.sleep(500);
			//	}
	}

}
