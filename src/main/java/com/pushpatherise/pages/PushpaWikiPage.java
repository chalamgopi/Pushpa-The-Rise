package com.pushpatherise.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PushpaWikiPage extends BasePageObject {

	
	private String pageUrl = "https://en.wikipedia.org/wiki/Pushpa:_The_Rise";

	
	
	public PushpaWikiPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	
	

}
