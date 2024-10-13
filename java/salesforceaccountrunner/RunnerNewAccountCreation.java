package salesforceaccountrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/salesforcenewaccountfeature/NewAccountSalesForce.feature",glue="salesforceaccountstepdefinition")

public class RunnerNewAccountCreation extends AbstractTestNGCucumberTests {

	

}
