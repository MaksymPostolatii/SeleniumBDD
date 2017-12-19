package cucumber.test.launcher;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/cucumber/feature/InstagramLogIn.feature",
        plugin = "json:target/cucumber.json", glue = "cucumber/test/")
public class Feature2 extends AbstractTestNGCucumberTests {
}
