package com.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
	public void EnterUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public void endRun(WebDriver driver) {
		driver.quit();
	}

	public void ValidatePageUrl(String expectedUrl, String actualUrl) {

	}

}
