import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org. openqa. selenium. chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.interactions.Actions;

public class Dependent_Independent_Element {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Seleniumhq.org page*/
		driver.get("https://www.seleniumhq.org/download/");
		System.out.println("Opened the Seleniumhq.org page");
		
		/*Get client version of Java Language*/
		String Client_version = driver.findElement(By.xpath("//td[text()='Java']/../td[2]")).getText();
		System.out.println("Version of Java is:"+ Client_version );
		
		/*Scrolling the page*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		/*Hover on Python Download element*/
		WebElement element = driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a"));
		Actions action = new Actions(driver); 
        action.moveToElement(element).build().perform();
                
        
        /*Taking Screenshot*/
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src1 = ts.getScreenshotAs(OutputType.FILE);
        File des = new File(".\\Screenshots\\src1.jpg");
        FileUtils.copyFile(src1, des);

		
	}

}
