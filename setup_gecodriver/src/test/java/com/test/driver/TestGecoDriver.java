package com.test.driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnselenium.ConfigureWebdriver.DriverFactory;

public class TestGecoDriver {
	
	private WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		driver = DriverFactory.getDriver();
	}
  
	@Test
  public void TestGecoDriver() {
		
		driver.get("https://gmail.com");
		String titleText = driver.getTitle();
		Assert.assertEquals("Gmail", "Gmail");
		driver.quit();
		
  }
}
