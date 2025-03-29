package bookpages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public DemoLaunchpage getdemoLaunchpageObject()
	{
		DemoLaunchpage launch = new DemoLaunchpage(driver);
		return launch;
	}
	
	
	public DemoLoginpage getdemoLoginhpageObject()
	{
		DemoLoginpage login = new DemoLoginpage(driver);
		return login;
	}
	
	
	public DemoHomepage getdemoHomehpageObject()
	{
		DemoHomepage home = new DemoHomepage(driver);
		return home;
	}

	
	
	public DemoProductDetailspage getdemoProductDetailshpageObject()
	{
		DemoProductDetailspage details = new DemoProductDetailspage(driver);
		return details;
	}

}
