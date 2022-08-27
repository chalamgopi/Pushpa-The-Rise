package com.pushpatherise.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PushpaRiseIMDBPage extends BasePageObject {

	
	private String pageUrl = "https://www.imdb.com/title/tt9389998/";

	
	
	public PushpaRiseIMDBPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	
	

}
