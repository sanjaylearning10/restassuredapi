package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue="stepDefs"
,dryRun=false, plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"},
snippets=SnippetType.CAMELCASE,monochrome=false)
public class Runner {
	

}
