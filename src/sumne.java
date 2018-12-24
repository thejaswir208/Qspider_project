import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sumne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Actitime page*/
		driver.get("file:///G:/Selenium/Qspider/Html_pages/Sample.html");
		System.out.println("Opened the Sample web page");
		
		/*Enter the Username*/
		driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("admin");
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("nanu");
		String s =driver.findElement(By.id("t1")).getAttribute("value");
		System.out.println("Entered the Username");
		System.out.println(s);
		
		/*Enter the Username*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t2').value='admin';");
		//driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("admin");
		System.out.println("Entered the Username1");
		driver.close();
		
	
					
		}
	}


