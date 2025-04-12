	package bookpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DemoHomepage extends ReusableActions {
	
	
	WebDriver driver;
	
	
	
	public DemoHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='nameofuser']")
	WebElement userName;
	
	@FindBy(xpath="(//div[@id='tbodyid'])[1]/div")
	List<WebElement> tbody;
	
	
	
	
	

	
	
	
	public String getUserName()
	{
		waitForPageToLoad(driver,userName);
		String username = userName.getText();
		String arr[]=username.split(" ");
		//System.out.println(arr[1]);
		return arr[1];
	
	}
	
	
	public void clickOnSelectedProduct(String product)
	{ 	
		waitForPageToLoad(driver,userName);
		for(int i=1;i<tbody.size();i++)
		{
			WebElement prd = driver.findElement(By.xpath("(//div[@id='tbodyid'])[1]/div["+i+"]/div/div/h4/a"));
			String prductName  =prd.getText();
			if(product.equalsIgnoreCase(prductName))
			{
				prd.click();
				break;
				
			}
			
		}
		
		//return new DemoProductDetailspage(driver);
	}

}
