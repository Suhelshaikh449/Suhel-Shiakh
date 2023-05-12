package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", 
				"F:\\AUTOMATION TESTING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			 //Thread.sleep(10000);
			//driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//driver.manage().window().minimize();
			
			
			//driver.navigate().to("https://www.youtube.com/");
			
			//System.out.println(driver.getCurrentUrl());
			
			 
			
			//driver.navigate().forward();
			//driver.navigate().back();
			//driver.navigate().refresh();
			
			//System.out.println(driver.getTitle());
			
			//System.out.println(driver.getPageSource());
			//driver.quit();
			
			
			//driver.close();
		}
	}
	
