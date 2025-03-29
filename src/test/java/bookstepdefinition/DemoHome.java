package bookstepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import bookpages.DemoLaunchpage;
import bookpages.DemoLoginpage;
import bookpages.DemoHomepage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContextSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoHome {
	
	
	TestContextSetup testContextSetup;
	
	
	public DemoHome(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	
	@Given("user should should be on homepage")
	public void user_should_be_able_see_the_username() throws InterruptedException {
	   // Thread.sleep(3000);
		String expected= "seleniumtutorial4@gmail.com";
		
		String actual  = testContextSetup.object.getdemoHomehpageObject().getUserName();
		Assert.assertEquals(expected, actual);
		
		
	}	
	
	
	@When("user selects the expected product")
	public void user_selects_the_expected_product(DataTable dataTable) {
	    
		List<List<String>> data = dataTable.asLists();
		testContextSetup.expectedProductName = data.get(0).get(0);
		testContextSetup.object.getdemoHomehpageObject().clickOnSelectedProduct(testContextSetup.expectedProductName);
	}

}
