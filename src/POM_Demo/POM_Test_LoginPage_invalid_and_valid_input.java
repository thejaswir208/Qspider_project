package POM_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Test_LoginPage_invalid_and_valid_input {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("ActiTime Login page is loaded");
		
		POM_Login_Page login = new POM_Login_Page(driver);
		
		login.setUserName("abcd");
		System.out.println("Entered Invalid Username");
		
		login.setPassword("wxyz");
		System.out.println("Entered Invalid Password");
		
		login.clickLoginButton();
		System.out.println("Clicked on Login Button");
		
		Thread.sleep(5000);
		
		login.setUserName("admin");
		System.out.println("Entered Valid Username");
		
		login.setPassword("manager");
		System.out.println("Entered Valid Password");
		
		login.clickLoginButton();
		System.out.println("Clicked on Login Button");
		
		int count = login.getLinkCount();
		System.out.println("Number of links in page is "+count);
		
		driver.close();
	}

}
