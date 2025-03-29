package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	
	FileInputStream fin;
	public Properties prop;
	
	
	public WebDriver setup()
	{
		try {
			fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\confg.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {;
			prop.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//browser launch
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		//launch url
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		return driver;
	}

}
