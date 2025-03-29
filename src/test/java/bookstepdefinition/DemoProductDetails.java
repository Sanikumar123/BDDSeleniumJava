package bookstepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import utility.TestContextSetup;

public class DemoProductDetails {
	
TestContextSetup testContextSetup;
	
	public DemoProductDetails(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	@Then("user should be on productDetailspage")
	public void user_should_be_on_product_detailspage() {
	   
		String expectedUrl = "https://www.demoblaze.com/prod.html?idp_";
		String url = testContextSetup.driver.getCurrentUrl();
		System.out.println(url);
		String arr[] = url.split("=");
		String actualurl = arr[0];
		Assert.assertEquals(expectedUrl, actualurl);
		
	}
	@Then("expected product name should be displayed")
	public void expected_product_name_should_be_displayed() {
	    
		String selectedPrdName = testContextSetup.object.getdemoProductDetailshpageObject().getSelectedProductSelected();
		Assert.assertEquals(selectedPrdName, testContextSetup.expectedProductName);
	}


}
