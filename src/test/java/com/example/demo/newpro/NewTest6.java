package com.example.demo.newpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest6 {
	
	WebDriver driver;
  @Test
  public void TC1() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Thread.sleep(5000);
	  System.out.println("Smoke test");
	  driver.quit();
  }
  
  @Test
  public void TC2() throws InterruptedException {
	 
	  WebDriverManager.edgedriver().setup();
	  WebDriver drive = new EdgeDriver();
	  drive.get("https://www.godaddy.com/");
	  drive.manage().window().maximize();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(3000);
	  drive.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  System.out.println("Regression test one");
	  Assert.assertEquals(drive.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  drive.quit();
	  
  }
  
  @Test
  public void TC3() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	
	  System.out.println("Regression test two");
	  
	  
	  driver.get("https://www.godaddy.com/");
	 driver.manage().window().maximize();
	  
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
       Thread.sleep(7000);	 
	  Assert.assertEquals(driver.getTitle(), "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  	
	  Thread.sleep(7000);
	  WebElement search=driver.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/div/div"));
	  WebElement btn=driver.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/button"));
	 
	  boolean btnbool=btn.isEnabled();
	  boolean sbool=search.isEnabled();
	  Assert.assertEquals(btnbool, sbool);
	  driver.quit();
	  System.out.println("t3");
  }
}

