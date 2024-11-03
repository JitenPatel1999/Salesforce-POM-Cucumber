package Salesforce_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OppurtunitiesPage extends BasePage{
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a") WebElement pipeline;
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a") WebElement stuck;
	public OppurtunitiesPage(WebDriver driver) {
		super(driver);
	}
	public WebDriver clickPipeline() {
		clickElement(pipeline, "Pipeline");
		return driver;
	}
	public WebDriver clickStuck() {
		clickElement(stuck, "Stuck");
		return driver;
	}
}
