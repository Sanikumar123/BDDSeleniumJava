package bookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoProductDetailspage extends ReusableActions{
	
WebDriver driver;
	
	public DemoProductDetailspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='product-content product-wrap clearfix product-deatil']/div/div[2]/h2")
	WebElement productName;
	
	
	public String getSelectedProductSelected()
	
	{
		waitForPageToLoad(driver,productName);
		return productName.getText();
		
	}

}
