package Dec19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	//Declaration
	private WebElement unTB;
	private WebElement pwdTB;
	private WebElement LoginBTN;
	
	
	///////////////////////////////////////
	
	//Initialization
	public Login_Page(WebDriver driver)
	{
		unTB = driver.findElement(By.xpath("//input[@name='username']"));
		pwdTB = driver.findElement(By.xpath("//input[@name='pwd']"));
		LoginBTN = driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	
	///////////////////////////////////////////
	
	//Utilization
	public void setUserName(String uName)
	{
		unTB.sendKeys(uName);
	}
	
	
	public void setPassword(String password)
	{
		pwdTB.sendKeys(password);
	}
	
	
	public void clickLoginButton()
	{
		LoginBTN.click();
	}
	
	
	
	
	//While developing method if any inputs are required always use method argument instead of hard-coded values.

}
