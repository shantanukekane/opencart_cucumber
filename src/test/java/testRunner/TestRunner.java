package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//featurefile/"},
					//features= {".//featurefile/Login.feature"},
					//features= {".//featurefile/LoginDDTExcel.feature"},
					features= {".//featurefile/Login.feature",".//featurefile/Registration.feature"},
					//features = {".//featurefile/Registration.feature"},
					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html",   // this is for cucumber report
							  "rerun:target/rerun.txt",          // this is for rerun the failed scenario
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

		}
