package org.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//This is a Base Class
public class BaseClass {
	
protected WebDriver driver;
protected String url;
	
	
	@Parameters({"url","browserType"})
	@BeforeClass
	public void validateJS(String url,String browserType)
	
	{
		
		if(browserType.equals("CH"))
	           {	
			        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		            driver = new ChromeDriver();
		            
		
	           }
		
		else if(browserType.equals("FF"))
			    {	
			         System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				     driver = new FirefoxDriver();
				     
				     
			    }
		else 
			
				
			    {	
			        System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					
					
				}
					
		this.url = url;
		


	
	}
	

}
