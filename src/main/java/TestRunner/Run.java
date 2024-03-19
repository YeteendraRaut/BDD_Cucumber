package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {".//Features/LoginFeature.feature",".//Features/Customers.feature"},
		glue="stepDefinition",
		dryRun = false,
		monochrome = true,
		tags = "@Sanity",//scenarios under @sanity tag will be executed
		plugin = {"pretty","html:target/cucumber-reports/reports_html2.html"}
		)

//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}



public class Run {
	
}
