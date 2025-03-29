package bookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginpage extends ReusableActions {
	
	WebDriver driver;
	
	
	public DemoLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement loginBtn;
	
	@FindBy(xpath="//h5[@id='logInModalLabel']")
	WebElement loginLabel;
	
	
	
      public void login(String uName, String pWD) {
		
    	  waitForPageToLoad(driver,loginLabel);
    	  username.sendKeys(uName);	
    	  password.sendKeys(pWD);
    	  loginBtn.click();
    	// return new DemoHomepage(driver);
	}

}
