package CucumberRunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {"src/test/resources/LoginAndHome.feature",
				"src/test/resources/Oppurtunities.feature",
				"src/test/resources/Leads.feature"},
		glue = {"SalesforceStepDefinitions"},
		dryRun = false,
		monochrome = true,
				plugin = {"pretty",
						  "json:target/cucumber-reports/cucumber.json",
						  "html:target/cucumber-reports/cucumberreport.html"}
)
public class SalesforceRunner extends AbstractTestNGCucumberTests{
}
