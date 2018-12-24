package Dec19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LoginPage_invalid_and_valid_input {

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
		
		Login_Page login = new Login_Page(driver);
		
		login.setUserName("abcd");
		System.out.println("Entered Invalid Username");
		
		login.setPassword("wxyz");
		System.out.println("Entered Invalid Password");
		
		login.clickLoginButton();
		System.out.println("Clicked on Login Button");
		
		login.setUserName("admin");
		System.out.println("Entered Valid Username");
		
		login.setPassword("manager");
		System.out.println("Entered Valid Password");
		
		login.clickLoginButton();
		System.out.println("Clicked on Login Button");
	}

}
