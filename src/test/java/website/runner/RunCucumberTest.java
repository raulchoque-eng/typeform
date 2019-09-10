package website.runner;

import core.selenium.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;

/**
 * RunCucumberTest class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"website/steps"},
        format = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/re-run.txt"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    /**
     * Closes WebDriver instance each end scenario.
     */
    @AfterTest
    public void closeDriver() {
        WebDriverManager.getInstance().getDriver().close();
    }
}
