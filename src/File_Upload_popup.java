import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Set chromeDriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
		
		/*Initialize the browser(launch the browser)*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched the chrome browser");
	
		/*Open the Sample page*/
		driver.get("file:///G:/Selenium/Qspider/Html_pages/File_Upload.html");
		System.out.println("Opened the Sample web page");
		
		/*File Upload using sendkeys()*/
	    String path = "G:\\Selenium\\Qspider\\Html_pages\\Sample_File_Upload.docx";
		driver.findElement(By.id("t1")).sendKeys(path );
		System.out.println("Uploaded file using sendkeys() method");
		
		
		
		///////////////////////////////////////////////////////////////////////////////
		/*Open the Sample page*/
		driver.get("file:///G:/Selenium/Qspider/Html_pages/File_Upload.html");
		System.out.println("Opened the Sample web page");
		
		/*File Upload using sendkeys()*/
	    String rPath = "./Demo/Sample_File_Upload.docx";
	    File f = new File(rPath);
	    String aPath = f.getAbsolutePath();
		driver.findElement(By.id("t1")).sendKeys(aPath);
		System.out.println("Uploaded file using sendkeys() and File() method");
		
	}

}
