package mct.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/resources/All-Test-Features"},
glue = {"mct.steps.definations"},
plugin = { "pretty", "json:target/cucumber-reports/cucumber.json","html:cucumber-reports/report.html" },
snippets = SnippetType.CAMELCASE	
)

public class TestRunner {
	
}
