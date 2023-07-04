package SeleniumGrid4.Grid4;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeTest1 {
	
    public Capabilities capabilities;

@Test(priority=1)
public void test1() throws MalformedURLException
{
		// TODO Auto-generated method stub
	////WebDriverManager.chromedriver().setup();
	  // ChromeOptions options = new ChromeOptions();
	 //  options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	//System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		
		   URL remoteUrl = new URL("http://localhost:4444");
		   capabilities = new ChromeOptions();
		  // ChromeOptions chromeOptions = new ChromeOptions();
		 //  chromeOptions.setPlatformName("Windows 10");
		 //  chromeOptions.setBrowserVersion("latest");
		   WebDriver driver = new RemoteWebDriver(remoteUrl, capabilities);
		 

           // Use the Remote WebDriver to automate browser actions
   		driver.get("http://google.com");
   		System.out.println(driver.getTitle());

           // Close the browser and quit the WebDriver
           driver.quit();
	}
 

}
