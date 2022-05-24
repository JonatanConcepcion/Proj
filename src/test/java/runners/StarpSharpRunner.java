package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/start_sharp.feature",
        tags = "",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class StarpSharpRunner {

}
