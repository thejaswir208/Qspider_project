import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org. openqa. selenium. chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		/*Set ChromeDriver path*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize browser and Launch*/
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
		
		/*Open Facebook page*/
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Opened the Facebook page");
		
		/*Enter First name*/
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thejaswi");
		System.out.println("Entered First Name");

		/*Enter Last name*/
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		System.out.println("Entered Last Name/Surname");

		/*Enter Email/Mobile Number*/
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("thejasw123i@gmail.com");
		System.out.println("Entered Email/Mobile Number");

		/*Enter New Password*/
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
		System.out.println("Entered New Password");

		/*Enter valid Email ID*/
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thejurocking@gmail.com");
		System.out.println("Entered Valid Email ID to Login");

		/*Enter Valid Password*/
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("C00lguy@");
		System.out.println("Entered Valid Password");

		/*Click on Login Button*/
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("Clicked on Login Button");
		
		/*Title of the page*/
		Thread.sleep(10000);
		String actualTitle = driver.getTitle(); 
		System.out.println("Page title is: "+actualTitle);
		
		/*Screenshot of the page*/
		TakesScreenshot scrFile= (TakesScreenshot)driver;
		File src = scrFile.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\Screenshots\\scr.jpg");
		FileUtils.copyFile(src,des);
		
		/*Pop-up Handling*/
		//driver.switchTo().alert().dismiss();
		
		/*Logout From Facebook*/
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		System.out.println("Clicked on Log Out Option");
		
		/*Verify LogOut page*/
		Thread.sleep(10000);
		String actualTitle1 = driver.getTitle(); 
		System.out.println("Logged Out froom Facebook and present Page title is: "+actualTitle1);
		
		/*Closed the browser*/
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Closed the browser");
	}

}
