package POM_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Example for POM(Page Object Model) 

public class POM_Login_Page {
	//Declaration using @FindBy annotation
	@FindBy(xpath="//input[@name='username']")
	private WebElement unTB;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginBTN;
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	
	///////////////////////////////////////
	
	//Initialization using initElements() method of PageFactory Class
	public POM_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	
	
	public int getLinkCount()
	{
		int count = allLinks.size();
		return count;
		
	}
	
	
	
	
	//While developing method if any inputs are required always use method argument instead of hard-coded values.

}
