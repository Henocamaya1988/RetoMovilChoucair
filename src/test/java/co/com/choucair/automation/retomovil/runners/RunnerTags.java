package co.com.choucair.automation.retomovil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/coursera.feature",
        glue = {"co.com.choucair.automation.retomovil.stepdefinitions","co.com.choucair.automation.retomovil.utils"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
