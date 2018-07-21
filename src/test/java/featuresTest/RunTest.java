package featuresTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/features/CreateLead.feature", glue= {"steps","tests.pages"}, monochrome=true)
@RunWith(Cucumber.class)
	
public class RunTest {

}
