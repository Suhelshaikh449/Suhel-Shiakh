package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import setup.HomePage;
import setup.LoginPage;

public class TestExecution {
	

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.Edge.driver","F:\\AUTOMATION TESTING\\SOFTWARE\\edgedriver_win64\\msedgedriver.exe");
			
		   WebDriver driver = new EdgeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://localhost/login.do");
		   
		  Thread.sleep(2000);
	
		HomePage a = new HomePage(driver);
		a.Set1();
		Thread.sleep(2000);
		a.Set2();
		Thread.sleep(2000);
		a.Set3();
		Thread.sleep(2000);
		
		LoginPage b = new LoginPage(driver);
		b.set4();
		Thread.sleep(3000);
		b.set();
		Thread.sleep(2000);
		
		driver.quit();
	}
}	

