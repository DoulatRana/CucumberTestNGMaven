package runner;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},glue={"steps"},monochrome=true,
plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
