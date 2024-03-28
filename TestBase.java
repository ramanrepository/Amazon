package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amazon.qa.util.TestUtil;

public class TestBase {

	  public static Properties prop = new Properties();
	  public static WebDriver driver;
	
	  //Step 1
	  public TestBase()  {
		
		  try {
			FileInputStream file = new FileInputStream("C:\\Users\\raman\\git\\repository\\Amazon\\src\\main\\java\\com\\amazon\\qa\\config\\Config.properties");
		prop.load(file);
		  } 		  
		  catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  catch(IOException a ) {
			  a.printStackTrace();
		  }
		  
	  }
	  //step 2 
	 
	@SuppressWarnings("deprecation")
	public static void initiation() {
		String browsername = prop.getProperty("browser");  
		  
		if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
			else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        
		
		driver.get(prop.getProperty("url"));
   

			}
		
}
