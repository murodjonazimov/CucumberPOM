package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"},
				features = "/Users/murodjonazimov/eclipse-workspace"
						+ "/CucumberPOM/src/main/java/com/qa/features", // the path of feature file
				glue = { "com/qa/stepDefenition" },// path of the step definition file
				format = {"pretty", "html:test-output",
						"json:Json_Output/cucumber.json","junit:JUnit_xml/cucumber.xml"}, // to generate different types of reports
				monochrome = true, // display the console output proper readable format
				strict = true, // It well check if any step is not defined in step definition files
				dryRun = false // to check mapping is proper between features file and step definition file
		
		
		
		)

public class TestRunner {
	

}
