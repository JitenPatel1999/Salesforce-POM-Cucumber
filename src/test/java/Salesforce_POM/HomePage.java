package Salesforce_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	@FindBy(xpath="//*[@id=\"userNavLabel\"]") WebElement user;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]") WebElement logout;
	@FindBy(xpath="//*[@id=\"AllTab_Tab\"]/a") WebElement extend;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]") WebElement developerConsole;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public WebDriver Logout() {
		clickElement(user, "User Navigation");
		clickElement(logout, "Logout");
		return driver;
	}
	public void DeveloperConsole() {
		clickElement(user, "User Navigation");
		clickElement(developerConsole, "Developer Console");
	}
	public void UserNav() {
		clickElement(user, "User");
	}
	public WebDriver allTabs() {
		clickElement(extend, "All Tabs");
		return driver;
	}
}
