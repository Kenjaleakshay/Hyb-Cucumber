package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue={"hooks","stepdefinitions"},
		publish=true,monochrome=true,
		plugin={"pretty","html:target/CucumberReports/CucumberRepo.html",
				"json:target/CucumberReports/CucumberRepo.json",
				"junit:target/CucumberReports/CucumberRepo.xml"},
		
                 tags="@login")
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
