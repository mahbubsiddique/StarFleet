package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "steps",
		tags = "@amazonLogin",
		plugin = "pretty"
		
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests{

}
