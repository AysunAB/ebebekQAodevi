
package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",

                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
        },
        features ="src/test/resources/features",//path od features folder
        glue = {"stepDefinitions"},//path of the step definitions folder
        tags ="@TC001",

        dryRun = false




)

public class Runner {


}
