package utility;
import org.openqa.selenium.WebDriver;

import bookpages.DemoHomepage;
import bookpages.DemoLoginpage;
import bookpages.DemoProductDetailspage;
import bookpages.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public TestBase base;
	public PageObjectManager object;
	public String expectedProductName;
	
	  public TestContextSetup() {
		  
		  base = new TestBase();
		  driver= base.setup();
		  object=  new PageObjectManager(driver);
		  
	  }
	  
	 
	

}
