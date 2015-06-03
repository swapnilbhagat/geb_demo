/**
 * 
 */
package com.geb.demo.page

import geb.Page;

/**
 * Page object for Google.
 * 
 * @author SwapnilB
 *
 */
class Google extends Page{
	static url = "http://www.google.com/"
	static at = { title == "Google" }

	static content = {
		//content for this page
	}
}
