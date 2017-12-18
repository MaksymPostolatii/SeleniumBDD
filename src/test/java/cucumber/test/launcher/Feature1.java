package cucumber.test.launcher;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.test.FeatureRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/java/cucumber/feature/InstagramLiker.feature",
        plugin = "json:target/cucumber.json", glue = "cucumber/test/")
public class Feature1 extends FeatureRunner{

}
