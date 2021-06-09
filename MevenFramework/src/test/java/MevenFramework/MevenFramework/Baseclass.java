package MevenFramework.MevenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
WebDriver driver;
	
	@BeforeMethod
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
		@AfterMethod
		public void closBrowser() {
		driver.close();
		}
}
