package cucumber.test.launcher;

import cucumber.api.CucumberOptions;
import cucumber.test.FeatureRunner;

@CucumberOptions(features = "src/test/java/cucumber/feature/InstagramLiker.feature",
        plugin = "json:target/cucumber.json", glue = "cucumber/test/")
public class Feature1 extends FeatureRunner {

}
