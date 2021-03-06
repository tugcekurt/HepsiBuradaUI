//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/AddBook.feature"},
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:src\\target\\cucumber-reports\\report.html"},
        monochrome = true
)
class TestRunner {


}
