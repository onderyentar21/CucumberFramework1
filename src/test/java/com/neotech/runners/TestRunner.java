package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// we can specify which feature/features to run
		features = "src/test/resources/features/",

		// we can specify where the code for the features are located
		glue = "com.neotech.steps",

		// if true, it does not run the java classes. Only checks the feature files
		// if they are glued to some java code
		dryRun =true,

		// tags can do the same thing groups on TestNG do
		tags = "@task",

		monochrome=true,
        plugin = {
                //prints the gherkin steps to the console
                "pretty",
                //Creates and saves the basic html report on the target folder.
                "html:target/cucumber-default-report.html",
                //stores every step of the exetion toa json file.
                "json:target/cucumber.json"
        }
        // plugin = {
        // "summary","pretty","html:Reports/CucumberReport/Reports.html"


		
		)


public class TestRunner {

}
