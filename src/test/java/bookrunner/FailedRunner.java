package bookrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "@target/failedrerun.txt",  
		glue="bookstepdefinition",
		plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)

public class FailedRunner extends AbstractTestNGCucumberTests{
	
	//tags="@reg or @smoke"
	//"@reg and not @smoke"
	
	
	//parallel execution
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=false) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}
