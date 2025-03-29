package bookstepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContextSetup;

public class DemoLogin {
	
	//WebDriver driver;
	
	
 TestContextSetup testContextSetup;
	
	public DemoLogin(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	

	
	
	@When("User enters UserName,Password and clicks on Login button")
	public void user_enters_user_name_password_and_clicks_on_login_button(DataTable dataTable) throws InterruptedException  {
		
		
		List<List<String>> data = dataTable.asLists();
		
		testContextSetup.object.getdemoLoginhpageObject().login(data.get(0).get(0), data.get(0).get(1));
		
		
		
	   
	}
	

}
