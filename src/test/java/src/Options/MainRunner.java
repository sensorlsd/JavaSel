package src.Options;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/src/WebDriverUni/"},
        glue = {"src.steps"},
        monochrome = true,
        tags = {},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)

public class MainRunner {

}
