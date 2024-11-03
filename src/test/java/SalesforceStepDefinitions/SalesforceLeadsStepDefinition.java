package SalesforceStepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import Salesforce_POM.AllTabs;
import Salesforce_POM.HomePage;
import Salesforce_POM.LeadsPage;
import Salesforce_POM.Salesforce_LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLeadsStepDefinition {
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
	
	static WebDriver driver;
	static Salesforce_LoginPage loginpage;
	static HomePage homepage;
	static AllTabs tabs;
	static LeadsPage lead;
	
	@Before
	public static void beforeScenario() {
		if (driver == null) {
	        browser("edge");
	        goToUrl("https://login.salesforce.com");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }
	}
	@After
	public static void afterScnario() {
		if (driver != null) {
	        closeDriver();
	        driver = null;
	    }
	}
	
	@Given("I have logged in succesfully and am at the home page")
	public void i_have_logged_in_succesfully_and_am_at_the_home_page() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		homepage = new HomePage(driver);
	}
	
	
	//TC20
	@When("I click on all tabs for Lead")
	public void i_click_on_all_tabs_for_Lead() {
	    homepage.allTabs();
	}
	@When("I land on the all tabs page for Lead")
	public void i_land_on_the_all_tabs_page_for_Lead() {
	    tabs = new AllTabs(driver);
	}
	@When("I click on the Leads link")
	public void i_click_on_the_leads_link() {
	    tabs.clickOnLeads();
	}
	@When("I land on the Leads page")
	public void i_land_on_the_leads_page() {
	    lead = new LeadsPage(driver);
	}
	@Then("I should see the leads page")
	public void i_should_see_the_leads_page() {
	    System.out.println(driver.getTitle());
	}
	
	
	//TC21
	@When("I click on all tabs again")
	public void i_click_on_all_tabs_again() {
	    homepage.allTabs();
	}
	@When("I land on the all tabs page again")
	public void i_land_on_the_all_tabs_page_again() {
	    tabs = new AllTabs(driver);
	}
	@When("I click on the Leads link again")
	public void i_click_on_the_leads_link_again() {
	    tabs.clickOnLeads();
	}
	@When("I land on the Leads page again")
	public void i_land_on_the_leads_page_again() {
	    lead = new LeadsPage(driver);
	}
	@When("I click on the view button")
	public void i_click_on_the_view_button() {
	    lead.view();
	}
	@Then("the Lead view should be displayed")
	public void the_lead_view_should_be_displayed() {
	    System.out.println(driver.getTitle());
	}
}
