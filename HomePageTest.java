package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.SearchPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
		
		public HomePageTest() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiation();
			loginpage = new LoginPage();
			loginpage.loginbtn();
			loginpage.typeusername(prop.getProperty("username"));
			loginpage.continuebtn();
			loginpage.typepassword(prop.getProperty("password"));
			homepage = loginpage.signinbtn();
		
		 homepage = new HomePage();
		 searchpage = new SearchPage();
		}
		
		@Test (priority = 1)
		public void homePageTitleTest() {
			String title = homepage.validateHomePageTitle();
		
			Assert.assertEquals(title, "Hi, Raman");
			
		}
		@Test(priority = 2)
		public void validateimagetest() {
			homepage.typeSearchBox("laptop");
			homepage.searchButton();
		}
	
		
		
	    @AfterMethod
		public void close() {
			driver.quit();
		} 
		}
   

