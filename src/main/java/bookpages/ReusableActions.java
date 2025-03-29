package bookpages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableActions {
	
	
	
	//wait
	public void waitForPageToLoad(WebDriver driver, WebElement element)
	{
		try {
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e)
		{
			System.out.println(e);
		}
        
        
	}
	
	//AcceptAlert
	public void SelectOkOnAlert(WebDriver driver)
	{
		try {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}catch(Exception e)
		{
			System.out.println(e);
		}
        
        
	}
	
	//CancelAlert
	public void SelectCancelOnAlert(WebDriver driver, WebElement element)
	{
		try {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		}catch(Exception e)
		{
			System.out.println(e);
		}
        
        
	}
	
	//GetMsgFromAlert
	public String getMsgFromAlert(WebDriver driver)
	{
		Alert alert = null;
		try {
		alert = driver.switchTo().alert();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return alert.getText();
        
        
	}
	
	//Dropdown
	public void selectValueFromDropdown(WebElement element,String Value)
	{
		try {
		Select drop = new Select(element);
		drop.selectByVisibleText(Value);
		}catch(Exception e)
		{
			System.out.println(e);
		}
        
        
	}
	
	//Click
	public void click(WebElement element)
	{
		try {
		element.click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
        
	}
	
	
	//typevalue
		public void enterValue(WebElement element,String value)
		{
			try {
			
			element.sendKeys(value);
			}catch(Exception e)
			{
				System.out.println(e);
			}
	        
		}
		
		
		//ElementVisiblity
		
		public void elementDisplayed(WebElement element)
		{
			try {
			element.isDisplayed();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	


}
