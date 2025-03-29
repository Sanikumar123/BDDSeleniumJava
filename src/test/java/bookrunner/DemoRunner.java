package bookrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="src/test/java/features",
		glue="bookstepdefinition", dryRun=false, tags= "@IconsOnLaunchPage or @Login",
		plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "rerun:target/failedrerun.txt"}
		
		
		)



public class DemoRunner extends AbstractTestNGCucumberTests {
	
	
	//tags="@reg or @smoke"
		//"@reg and not @smoke"
	
	//parallel execution
		
		 @Override
		 
		 @DataProvider(parallel=true) 
		 public Object[][] scenarios() 
		 { 
			 return super.scenarios();
			 
		 }
		 
	
	

}
