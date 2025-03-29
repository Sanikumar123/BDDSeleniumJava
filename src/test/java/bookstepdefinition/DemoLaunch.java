package bookstepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bookpages.DemoLoginpage;
import bookpages.DemoHomepage;
import bookpages.DemoLaunchpage;
import io.cucumber.java.en.Given;
import utility.TestContextSetup;

public class DemoLaunch {
	
	
	
	TestContextSetup testContextSetup;
	
	
	
	
	public DemoLaunch(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	@Given("User launches Demoblaze application")
	public void user_launches_demoblaze_application() {
		
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.manage().window().maximize();
		testContextSetup.driver.get("https://www.demoblaze.com/index.html");
		
	   
		
	}
	
	@Given("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		
		//DemoLaunchpage launch = new DemoLaunchpage(testContextSetup.driver);
		testContextSetup.object.getdemoLaunchpageObject().clickLoginbtn();
		
	  
		
	}
	
	
	@Given("Able to see Home, Contact,About Us, Cart, Login, Sign up icons")
	public void able_to_see_home_contact_about_us_cart_login_sign_up_icons() {
	    
		testContextSetup.object.getdemoLaunchpageObject().verifyIcons();
	}

}
