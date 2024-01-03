package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/main/resources/Feature",
		glue = "steps",
		tags = "@TC001",
		
		plugin = {
			"html:target/cucumber-reports/cucumber-html-reports",
			"json:target/cucumber-reports/cucumber-json-reports",		
		}
		
		
		)
public class BaseRunner extends AbstractTestNGCucumberTests {

}
