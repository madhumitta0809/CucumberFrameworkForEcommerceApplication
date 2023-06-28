package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue={"stepDefinitions","hooks"},
		snippets =SnippetType.CAMELCASE,
		tags = "@run"
		)
public class Runner {

}
