package com.example.demo.newpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTestday9 {
	WebDriver driver;
	@Parameters("browsers")
  @BeforeTest
  public void browserselection(String browsers) {
	if(browsers.equalsIgnoreCase("chrome")) {
			
	WebDriverManager.edgedriver().setup();
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);
	
	
		}
		else if(browsers.equalsIgnoreCase("edge")) {
			
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 
		}
  }
	
	@Test
	public void TC1() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
		  String url=driver.getCurrentUrl();
		  System.out.println(url);
		  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
}
