package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver=null;
	
	public static void initializeBrowser(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		//return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
