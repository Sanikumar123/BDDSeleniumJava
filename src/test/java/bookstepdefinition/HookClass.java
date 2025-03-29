package bookstepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utility.TestContextSetup;

public class HookClass {
	
	
TestContextSetup testContextSetup;
	
	
	
	
	public HookClass(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	
	
	@Before("not @IconsOnLaunchPage")
	public void before()
	{
		testContextSetup.object.getdemoLaunchpageObject().clickLoginbtn();
		testContextSetup.object.getdemoLoginhpageObject().login(testContextSetup.base.prop.getProperty("username"), testContextSetup.base.prop.getProperty("password"));
	}
	
	
	@AfterStep
	public void afterStep(Scenario scenario)
	{
		if(scenario.isFailed())
		{

		TakesScreenshot shot =(TakesScreenshot) testContextSetup.driver;
		byte[] fileContent = shot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(fileContent, "image/png", "screenshot");
	}
	}
	
	
	

	@After
	public void after()
	{
		
		testContextSetup.driver.quit();
}
}
