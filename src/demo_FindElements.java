import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Sample page*/
		driver.get("file:///G:/Selenium/Qspider/Html_pages/Demo_FindElements.html");
		System.out.println("Opened the Sample web page");
		
		/**/
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		for (int i=0;i<count;i++)
		{
			WebElement link = alllinks.get(i);
			String text = link.getText();
			System.out.println("Text of link is : " + text);
		}
		
		driver.close();
	}

}
