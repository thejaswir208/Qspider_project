import org.openqa.selenium.By;
import org. openqa. selenium. WebDriver;
import org. openqa. selenium. chrome.ChromeDriver;

public class ActiTime_Func {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Actitime page*/
		driver.get("https://demo.actitime.com");
		System.out.println("Opened the Actitime page");
		
		/*Enter the Username*/
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		System.out.println("Entered the Username");
		
		/*Enter the Password*/
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		System.out.println("Entered the Password");

		/*Click on Login Button*/
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Clicked on Login Button");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		System.out.println("Clicked on Help");

		driver.quit();
		System.out.println("Closed the browser");
	}

}
