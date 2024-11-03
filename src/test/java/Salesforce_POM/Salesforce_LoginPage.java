package Salesforce_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salesforce_LoginPage extends BasePage{
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="Login") WebElement login;
	@FindBy(xpath="//*[@id=\"rememberUn\"]") WebElement remember;
	@FindBy(id="forgot_password_link") WebElement forgot;
	public Salesforce_LoginPage(WebDriver driver) {
		super(driver);
	}
	public void enterUsername(String data) {
		enterText(username, data);
	}
	public void enterPassword(String data) {
		password.sendKeys(data);
	}
	public void rememberMe() {
		clickElement(remember, "Remember Me");
	}
	public void forgotPassword() {
		clickElement(forgot, "Forgot Password");
	}
	public WebDriver clickLogin() {
		clickElement(login, "Login");
		return driver;
	}
}
