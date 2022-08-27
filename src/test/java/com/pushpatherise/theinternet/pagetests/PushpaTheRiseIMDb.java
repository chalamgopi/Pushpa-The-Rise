package com.pushpatherise.theinternet.pagetests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pushpatherise.base.TestUtilities;
import com.pushpatherise.pages.PushpaRiseIMDBPage;
import com.pushpatherise.pages.PushpaWikiPage;

public class PushpaTheRiseIMDb extends TestUtilities {
	
	@Test
	public void pushpaIMDb() throws InterruptedException {
		log.info("Starting Pushpa IMDB");
		// open main page
		PushpaRiseIMDBPage pushpaWiki = new PushpaRiseIMDBPage(driver, log);
		pushpaWiki.openPage();
		takeScreenshot("Pushpa IMDB opened");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Pushpa: The Rise - Part 1']")).getText());
		  takeScreenshot("Validated-Pushpa: The Rise – Part 01 in IMDB"); 
		  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		  WebElement element =driver.findElement(By.xpath("//span[normalize-space()='Details']"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		  Thread.sleep(500); takeScreenshot("scrolled till element");
		  System.out.println(driver.findElement(By.xpath("//li[@data-testid='title-details-releasedate']//a[@aria-label='See more']")).getText());
		  System.out.println(driver.findElement(By.xpath("//a[normalize-space()='January 7, 2022 (United States)']")).getText());
		  takeScreenshot("Release date");
		  takeScreenshot("Date"); 
		  System.out.println(driver.findElement(By.xpath("//li[@data-testid='title-details-origin']")).getText()); 
		  takeScreenshot("Country"); 
		  Thread.sleep(4000);
		 
		// Verifications
		// New page url is expected
		
	}
}
