package SalesforceStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import Salesforce_POM.HomePage;
import Salesforce_POM.Salesforce_LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLoginStepDefinition{
	static WebDriver driver;
	static Salesforce_LoginPage loginpage;
	static HomePage homepage;
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
	
	
	@Before
	public static void beforeScenario() {
		if (driver == null) {
	        browser("edge");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }
	}
	@After
	public static void afterScnario() {
		if (driver != null) {
	        closeDriver(); // Quit driver once after all scenarios
	        driver = null;
	    }
	}
	@Given("the url {string}")
	public void the_url(String url) {
		goToUrl(url);
	}
	//TC1
	@When("I land on the login page")
	public void i_land_on_the_login_page() {
	    loginpage = new Salesforce_LoginPage(driver);
	}
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		loginpage.enterUsername(string);
	}
	@When("I dont enter a password")
	public void i_dont_enter_a_password() {
	    loginpage.enterPassword("");
	}
	@When("I clicked the login button")
	public void i_clicked_the_login_button() {
	    loginpage.clickLogin();
	}
	@Then("I should be able to see the login page error message")
	public void i_should_be_able_to_see_the_login_page_error_message() {
	    System.out.println(driver.getTitle());
	}
	//TC2
	@When("I land on the login page a second time")
	public void i_land_on_the_login_page_a_second_time() {
		loginpage = new Salesforce_LoginPage(driver);
	}
	@When("I enter the username a second time as {string}")
	public void i_enter_the_username_a_second_time_as(String string) {
	    loginpage.enterUsername(string);
	}
	@When("I enter the password a second time as {string}")
	public void i_enter_the_password_a_second_time_as(String string) {
	    loginpage.enterPassword(string);
	}
	@When("I clicked the login button a second time")
	public void i_clicked_the_login_button_a_second_time() {
	    loginpage.clickLogin();
	}
	@Then("I should be able to see the Salesforce home page")
	public void i_should_be_able_to_see_the_salesforce_home_page() {
	    System.out.println(driver.getTitle());
	}
	//TC9
	@When("I land on the login page a third time")
	public void i_land_on_the_login_page_a_third_time() {
	    loginpage = new Salesforce_LoginPage(driver);
	}
	@When("I enter the username a thrid time as {string}")
	public void i_enter_the_username_a_thrid_time_as(String string) {
	    loginpage.enterUsername(string);
	}
	@When("I enter the password a third time as {string}")
	public void i_enter_the_password_a_third_time_as(String string) {
	    loginpage.enterPassword(string);
	}
	@When("I clicked the login button a third time")
	public void i_clicked_the_login_button_a_third_time() {
	    loginpage.clickLogin();
	}
	@When("I land on the home page")
	public void i_land_on_the_home_page() {
	    homepage = new HomePage(driver);
	}
	@When("I click the logout button")
	public void i_click_the_logout_button() {
	    homepage.Logout();
	}
	@Then("I should see the login page again")
	public void i_should_see_the_login_page_again() {
	    System.out.println(driver.getTitle());
	}
	//TC3
	@When("I land on the login page a fourth time")
	public void i_land_on_the_login_page_a_fourth_time() {
	    loginpage = new Salesforce_LoginPage(driver);
	}
	@When("I enter the username a foruth time as {string}")
	public void i_enter_the_username_a_foruth_time_as(String string) {
	    loginpage.enterUsername(string);
	}
	@When("I enter the password a fourth time as {string}")
	public void i_enter_the_password_a_fourth_time_as(String string) {
	    loginpage.enterPassword(string);
	}
	@When("I click on remember me")
	public void i_click_on_remember_me() {
	    loginpage.rememberMe();
	}
	@When("I click the login button a fourth time")
	public void i_click_the_login_button_a_fourth_time() {
	    loginpage.clickLogin();
	}
	@When("I land on the home page a second time")
	public void i_land_on_the_home_page_a_second_time() {
	    homepage = new HomePage(driver);
	}
	@When("I click the logout button a second time")
	public void i_click_the_logout_button_a_second_time() {
	    homepage.Logout();
	}
	@Then("I should see my username is saved")
	public void i_should_see_my_username_is_saved() {
	    System.out.println(driver.getTitle());
	}
	//TC8
	@When("I land on the login page a fifth time")
	public void i_land_on_the_login_page_a_fifth_time() {
	    loginpage = new Salesforce_LoginPage(driver);
	}
	@When("I enter the username a fifth time as {string}")
	public void i_enter_the_username_a_fifth_time_as(String string) {
	    loginpage.enterUsername(string);
	}
	@When("I enter the password a fifth time as {string}")
	public void i_enter_the_password_a_fifth_time_as(String string) {
	    loginpage.enterPassword(string);
	}
	@When("I click the login button a fifth time")
	public void i_click_the_login_button_a_fifth_time() {
	    loginpage.clickLogin();
	}
	@When("I land on the homepage")
	public void i_land_on_the_homepage() {
	    homepage = new HomePage(driver);
	}
	@When("I clicked on developer console")
	public void i_clicked_on_developer_console() {
	    homepage.DeveloperConsole();
	}
	@Then("I should see the developer console")
	public void i_should_see_the_developer_console() {
	    System.out.println(driver.getTitle());
	}
}
