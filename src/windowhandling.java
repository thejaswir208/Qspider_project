import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Actitime page*/
		//WebDriverWait wait = new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();;
		Set<String> allWHS = driver.getWindowHandles();
		int count = allWHS.size();
		System.out.println("Number of Browsers/Windows: "+count);
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println("Title of the page is: " +driver.getTitle());
			driver.close();
		}


	}

}
