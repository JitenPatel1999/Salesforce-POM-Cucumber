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
import Salesforce_POM.OppurtunitiesPage;
import Salesforce_POM.Salesforce_LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SalesforceOppurtunitiesStepDefinition {
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
	static OppurtunitiesPage opp;
	
	
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
	@Given("the user is logged in and at the home screen")
	public void the_user_is_logged_in_and_at_the_home_screen() {
		Salesforce_LoginPage loginpage = new Salesforce_LoginPage(driver);
		loginpage.enterUsername("jiten@tekarch.com");
		loginpage.enterPassword("Nami0506");
		driver = loginpage.clickLogin();
		homepage = new HomePage(driver);
	}
	
	
	//TC17
	@When("I click on all tabs for Oppurtunities")
	public void i_click_on_all_tabs() {
	    homepage.allTabs();
	}
	@When("I land on the all tabs page for Oppurtunities")
	public void i_land_on_the_all_tabs_page() {
	    tabs = new AllTabs(driver);
	}
	@When("I click on the Oppurtunities link")
	public void i_click_on_the_oppurtunities_link() {
	    tabs.clickOnOppurtunities();
	}
	@When("I land on the Oppurtunities page")
	public void i_land_on_the_oppurtunities_page() {
	    opp = new OppurtunitiesPage(driver);
	}
	@Then("I should be viewing the Oppurtunities page")
	public void i_should_be_viewing_the_oppurtunities_page() {
	    System.out.println(driver.getTitle());
	}
	
	//TC18
	@When("I click on all tabs a second time")
	public void i_click_on_all_tabs_a_second_time() {
		homepage.allTabs();
	}
	@When("I land on the all tabs page a second time")
	public void i_land_on_the_all_tabs_page_a_second_time() {
	    tabs = new AllTabs(driver);
	}
	@When("I click on the Oppurtunities link a second time")
	public void i_click_on_the_oppurtunities_link_a_second_time() {
	    tabs.clickOnOppurtunities();
	}
	@When("I land on the Oppurtunities page a second time")
	public void i_land_on_the_oppurtunities_page_a_second_time() {
	    opp = new OppurtunitiesPage(driver);
	}
	@When("I click on the Pipeline link")
	public void i_click_on_the_pipeline_link() {
	    opp.clickPipeline();
	}
	@Then("I should be seeing the Pipeline page")
	public void i_should_be_seeing_the_pipeline_page() {
	    System.out.println(driver.getTitle());
	}
	
	
	//TC20
	@When("I click on all tabs a third time")
	public void i_click_on_all_tabs_a_third_time() {
	    homepage.allTabs();
	}
	@When("I land on the all tabs page a third time")
	public void i_land_on_the_all_tabs_page_a_third_time() {
	    tabs = new AllTabs(driver);
	}
	@When("I click on the Oppurtunities link a third time")
	public void i_click_on_the_oppurtunities_link_a_third_time() {
	    tabs.clickOnOppurtunities();
	}
	@When("I land on the Oppurtunities page a thrid time")
	public void i_land_on_the_oppurtunities_page_a_thrid_time() {
	    opp = new OppurtunitiesPage(driver);
	}
	@When("I click on the stuck link")
	public void i_click_on_the_stuck_link() {
	    opp.clickStuck();
	}
	@Then("I should be seeing the stuck page")
	public void i_should_be_seeing_the_stuck_page() {
	    System.out.println(driver.getTitle());
	}
}
