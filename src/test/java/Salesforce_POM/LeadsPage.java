package Salesforce_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage extends BasePage{
	@FindBy(xpath="//select[@id= 'fcf']") WebElement view;
	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	public void view() {
		clickElement(view, "View");
	}
}
