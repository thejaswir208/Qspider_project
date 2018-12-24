import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Chrome Options*/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		/*Firefox Options*/
		//FirefoxOptions foptions = new FirefoxOptions();
		//foptions.addPreference("geo-enabled", false);
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Sample page*/
		driver.get("https://www.redbus.in");
		System.out.println("Opened the  web page");


	}

}
