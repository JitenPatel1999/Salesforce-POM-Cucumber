package Salesforce_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllTabs extends BasePage {
	@FindBy(xpath="//a[text()= 'Opportunities']") WebElement opp;
	@FindBy(xpath="//a[text()= 'Leads']") WebElement leads;
	@FindBy(xpath="//a[text()= 'Accounts']") WebElement accounts;
	@FindBy(xpath="//a[text()= 'Contacts']") WebElement contacts;
	public AllTabs(WebDriver driver) {
		super(driver);
	}
	public WebDriver clickOnOppurtunities() {
		clickElement(opp, "Oppurtunities");
		return driver;
	}
	public WebDriver clickOnLeads() {
		clickElement(leads,"Leads");
		return driver;
	}
	public WebDriver clickOnAccounts() {
		clickElement(accounts, "Accounts");
		return driver;
	}
	public WebDriver clickOnContacts() {
		clickElement(contacts, "Contacts");
		return driver;
	}
}
