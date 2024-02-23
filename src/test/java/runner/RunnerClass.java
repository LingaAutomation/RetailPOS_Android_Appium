package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features"}
	,glue={"steps"},
		monochrome=true,
		dryRun = false,
		tags = "@err1",
	    plugin= {"pretty",
		"html:target/cucumber/report.html",
		"de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports",
		"html:test-output","json:target/json_output/cucumber.json",
		"html:target/cucumber-html-report"

		}

		)
//Strict Removed from Cucumber-7.0.0. So that, strict=true or false won't work and Strict default as "true" from 7.0.0

public class RunnerClass {

} 
 