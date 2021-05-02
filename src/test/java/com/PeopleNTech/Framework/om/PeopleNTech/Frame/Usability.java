package com.PeopleNTech.Framework.om.PeopleNTech.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Usability {
	
public WebDriver driver;
@Parameters({"browser","website"})
  @BeforeClass
  public void browser (String browser,String website) {
		 
		 if (browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "/Users/khadizapushpo/Downloads/chromedriver");
			 driver=new ChromeDriver();
				driver.get(website);
				driver.manage().window().maximize();
				
		 }else if(browser.equalsIgnoreCase("Firefox")){
			 System.setProperty("webdriver.gecko.driver","/Users/khadizapushpo/Downloads/geckodriver");
			  driver=new FirefoxDriver();
			  driver.get(website);
				driver.manage().window().maximize();
	  }
	  
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
