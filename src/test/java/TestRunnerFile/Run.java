package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue="StepDefinitionClass",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports/reports_html.html"}
		
		)

public class Run {
	//Empty Class

}
