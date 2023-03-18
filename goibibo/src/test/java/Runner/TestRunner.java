package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\maneesh.machugari\\IdeaProjects\\BDDframework\\Features",glue={"Stepdefinition"},
        plugin= {"pretty","html:target/cucumber-html-report.html","json:target/cucumber-json-reppost.json"},
        monochrome= true,
        dryRun= false
)
public class TestRunner {


}
