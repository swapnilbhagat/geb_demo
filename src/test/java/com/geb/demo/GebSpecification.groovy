/**
 * 
 */
package com.geb.demo

import com.geb.demo.page.Google;

import geb.Browser
import geb.spock.GebSpec

/**
 * Test case using geb.
 * 
 * @author SwapnilB
 *
 */
class GebSpecification extends GebSpec{

	def "Go to google"(){
		setup:"Set up chrome driver in system property"
		System.setProperty("webdriver.chrome.driver", "C:\\browser_drivers\\chromedriver.exe")

		when : "When in google.com type test and click on search"
		to Google
		$("#lst-ib input[name=q]").value("test")
		$("#lst-ib input[type=btnK]").click()

		then: "text should be test"
		$("#tsf input[id=lst-ib]").text() == "test"
	}
}
