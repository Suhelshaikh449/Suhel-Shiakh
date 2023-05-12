package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement UserName;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement Password;
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement Login;
	private WebElement Logout;
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set1()
   {
		UserName.sendKeys("admin");		
   }
	public void Set2()
	{
		Password.sendKeys("manager");	
	}
	public void Set3()
	{
		Login.click();	
	}
		
}