package Dec19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LoginPage_valid_input {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("ActiTime Login page is loaded");
		
		
		Login_Page login = new Login_Page(driver);
		
		login.setUserName("admin");
		System.out.println("Entered Username");
		
		login.setPassword("manager");
		System.out.println("Entered Password");
		
		
		login.clickLoginButton();
		System.out.println("Clicked on Login Button");
	}

}
