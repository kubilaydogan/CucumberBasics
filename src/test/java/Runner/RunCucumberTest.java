package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = false,
        // tags = "@wiki",
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        monochrome = true
)
public class RunCucumberTest {
}