import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo_Selenium_Grid {

	@Test
	public void demo_Grid() throws MalformedURLException
	{
	URL node = new URL("http://192.168.43.211:4444/wd/hub");
	
	DesiredCapabilities browser = new DesiredCapabilities();
	browser.setBrowserName("chrome");
	
	WebDriver driver = new RemoteWebDriver(node, browser);
	//driver.manage().window().maximize();
	System.out.println("Launched the chrome browser");

	/*Open the Actitime page*/
	driver.get("https://demo.actitime.com");
	System.out.println("Opened the Actitime page");

	driver.close();
	}
}
