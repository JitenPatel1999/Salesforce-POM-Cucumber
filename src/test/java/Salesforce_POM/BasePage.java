package Salesforce_POM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage extends Base_Functions{
	protected WebDriver driver;
	protected static Logger myLog = LogManager.getLogger(BasePage.class);
	public BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public static void enterText(WebElement wb, String data) {
		if(wb.isDisplayed()) {
			wb.sendKeys(data);
			System.out.println(data+" has been entered into the field.");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			myLog.error("Web element is not found");
		}
	}
	public static void clickElement(WebElement wb, String click) {
		if(wb.isDisplayed()) {
			wb.click();
			System.out.println(click+" has been clicked.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			myLog.error("Web element is not found");
		}
	}
	public static void Select(WebElement wb, String data) {
		Select select = new Select(wb);
		select.selectByVisibleText(data);
		System.out.println(data+" has been selected.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
