package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//img[@height = '61']")
	private WebElement Logo;
	@FindBy(xpath = "//a[@id = 'logoutLink']")
	private WebElement Logout;
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set4()
	{
	boolean Show = Logo.isDisplayed();
	
	if(Show == true)
	{
		System.out.println("Passed:" + Show);
	}
	else
	{
		System.out.println("Failed:" + Show);
	}
	}
	public void set()
	{
		Logout.click();
	}
	

	
}