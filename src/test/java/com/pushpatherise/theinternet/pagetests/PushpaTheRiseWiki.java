package com.pushpatherise.theinternet.pagetests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pushpatherise.base.TestUtilities;
import com.pushpatherise.pages.PushpaWikiPage;

public class PushpaTheRiseWiki extends TestUtilities {
	
	@Test
	public void pushpaWiki() throws InterruptedException {
		log.info("Starting Pushpa Wikipedia");
		// open main page
		PushpaWikiPage pushpaWiki = new PushpaWikiPage(driver, log);
		pushpaWiki.openPage();
		takeScreenshot("Pushpa wikipedia opened");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//b[contains(text(),'Pushpa: The Rise – Part 01')]")).getText());
		takeScreenshot("Validated-Pushpa: The Rise – Part 01 in WIKI");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/th[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		takeScreenshot("scrolled till element");
		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Release date']")).getText());
		takeScreenshot("Release date");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText());
		takeScreenshot("Date");
		Thread.sleep(4000);
	
		// Verifications
		// New page url is expected
		
	}
}
