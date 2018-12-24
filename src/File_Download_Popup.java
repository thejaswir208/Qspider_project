import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class File_Download_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.gecko.driver", "..<Path>../geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver();
		
		
		/*Initialize the browser(launch the browser)*/
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Selenium download page*/
		driver.get("https://demo.actitime.com");
		System.out.println("Opened the selenium download page");
		
	

	}

}
