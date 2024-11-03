package Salesforce_POM;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import UtilityPackage.Salesforce_Listener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Functions {
	protected static WebDriver driver = null;
	protected static Logger myLog = LogManager.getLogger(Base_Functions.class);
	public static void browser(String browser) {
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser has been setup.");
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Browser has been setup.");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Browser has been setup.");
			break;
		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			System.out.println("Browser has been setup.");
			break;
		default:
			System.out.println("Please enter a valid browser.");
			break;
		}
	}
	public static void goToUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("You have reached: "+url);
	}
	public static void closeDriver() {
		driver.quit();
		System.out.println("The browser is now closed.");
	}
}
