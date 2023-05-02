package com.example.demo.newpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest4 {
  @Test(groups= {"smoke"})
  public void Test1() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"
	  		);
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/");
	  driver.quit();
	  
  }
}

