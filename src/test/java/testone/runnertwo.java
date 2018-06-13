package testone;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resource"
		//,tags = ("@tag1" "@tag2")
		)
public class runnertwo {

}
