/**
 * 
 */
package com.geb.demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import geb.Browser;

/**
 * Geb test using junit.
 * 
 * @author SwapnilB
 *
 */
public class GebTest {
	@Test
	public void testGotoGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\browser_drivers\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		Browser browser = new Browser();
		browser.setDriver(chromeDriver);
		browser.go("http://www.google.com/");
		browser.close();
	}
}
