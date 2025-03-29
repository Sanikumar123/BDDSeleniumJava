package bookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLaunchpage extends ReusableActions {
	
	WebDriver driver;
	
	public DemoLaunchpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@id='login2']")
	WebElement launchLoginbtn;
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	WebElement homeBtn;
	
	@FindBy(xpath="//a[normalize-space()='Contact']")
	WebElement contactBtn;
	
	@FindBy(xpath="//a[normalize-space()='About us']")
	WebElement aboutusBtn;
	
	@FindBy(xpath="//a[@id='cartur']")
	WebElement cartBtn;
	
	@FindBy(xpath="//a[@id='signin2']")
	WebElement signupBtn;
	

	
	

	
	
	
	
	public void clickLoginbtn() {
		
		launchLoginbtn.click();
		
	}
	
public void verifyIcons() {
		
	waitForPageToLoad(driver,launchLoginbtn);
	elementDisplayed(launchLoginbtn);
	elementDisplayed(homeBtn);
	elementDisplayed(contactBtn);
	elementDisplayed(aboutusBtn);
	elementDisplayed(cartBtn);
	elementDisplayed(signupBtn);
	
	
		
	}
	
	
	
	
	
	
	

}
