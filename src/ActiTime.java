import org.openqa.selenium.By;
import org. openqa. selenium. WebDriver;
import org. openqa. selenium. chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {

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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Thejaswi");
		System.out.println("Entered the Username");
		
		/*Enter the Password*/
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("password");
		System.out.println("Entered the Password");
		
		/*Check Keep me logged in*/
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		System.out.println("Checked Keep me logged in checkbox");
		
		/*Click on Login Button*/
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Clicked on Login Button");

		/*Click on Forgot Password*/
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		System.out.println("Clicked on Forgot Password link");

		/*Click on Return to home page*/
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Return')]")).click();
		System.out.println("Clicked on Return to home page link");

		/*Click on actiTime Inc. page*/
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		System.out.println("Clicked on actiTime Inc. page link");

		/*Closed the browser*/
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Closed the browser");
		
		/*  //nobr[contains(text(),actiTIme )]   */
		/*  //img[contains(@src,'customLogo')] Xpath for image(logo)  */
	}

}
