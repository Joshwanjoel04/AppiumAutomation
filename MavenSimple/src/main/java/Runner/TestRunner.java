package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Automation/MavenSimple/src/main/java/Login.feature"
		,glue={"stepDefinations"}
		)

public class TestRunner {

}
