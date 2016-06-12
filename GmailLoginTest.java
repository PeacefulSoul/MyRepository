

package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources/", // path to the features
		glue = "steps", // path to the step definition file
		strict = false, dryRun = false,
		// plugin={"html:reports/unitTest/html/SimonFeb2016ReleaseTest"},
		//plugin = { "html:target/htmlReport/loginReport.html", "json:target/jsonReport/loginReport.json" }, 
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		tags = { "@Gmaillogin2" }) 

public class GmailLoginTest {
	
	public void test() {
	}

}
