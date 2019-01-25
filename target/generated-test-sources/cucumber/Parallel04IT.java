import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/home/centos/workspace-demo/test/Auto/src/test/resources/FSF-Rules-1008-1002.feature:17"},
        plugin = {"json:/home/centos/workspace-demo/test/Auto/target/cucumber-parallel/4.json", "html:/home/centos/workspace-demo/test/Auto/target/cucumber-parallel/4", "rerun:/home/centos/workspace-demo/test/Auto/target/cucumber-parallel/4.txt"},
        monochrome = true,
        glue = {"demo.web.test.fr"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
