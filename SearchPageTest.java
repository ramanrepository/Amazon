package com.amazon.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;

import com.amazon.qa.pages.SearchPage;

public class SearchPageTest extends TestBase{
	
	SearchPage searchpage;
		
		public SearchPageTest() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiation();
			
		 searchpage = new SearchPage();
		}
		
	
		@Test
		public void validateimagetest() {
			searchpage.typeSearchBox("laptop");
			searchpage.searchButton();
		}
	
		
		
	    @AfterMethod
		public void close() {
			driver.quit();
		} 
		

}
