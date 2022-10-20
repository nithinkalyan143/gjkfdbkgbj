package ninjatutorials.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue="ninjatutorials.stepdefinitions",
        features="src/test/resources/ninjatutorials/login.feature",
        plugin={"pretty", "html:target/cucumber.html"},
        dryRun=false

)
public class testrunner {
}
