import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo_Selenium_Grid_Parallel {
	@Parameters({"nodeURL","browserName"})
	@Test
	public void demo_Grid(String n, String b) throws MalformedURLException
	{
	URL node = new URL(n);
	
	DesiredCapabilities browser = new DesiredCapabilities();
	browser.setBrowserName(b);
	
	WebDriver driver = new RemoteWebDriver(node, browser);
	//driver.manage().window().maximize();
	System.out.println("Launched the chrome browser");

	/*Open the Actitime page*/
	driver.get("https://demo.actitime.com");
	System.out.println("Opened the Actitime page");

	driver.close();
	}
}
