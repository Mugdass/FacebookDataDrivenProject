package fb;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "Features",
    glue = {"fb.stepdefinitions"},
    plugin = {"pretty", "json:reports/cucumber.json", "html:reports/cucumber.html"},
    tags = "@smoke"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {}
