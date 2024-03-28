package com.amazon.qa.testcases;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
LoginPage loginpage;
HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
	 loginpage = new LoginPage();
	 homepage = new HomePage();
	}
	
	@Test (priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validateAmazonTitle();
	
		Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
		
	}
	@Test(priority = 2)
	public void validateimagetest() {
		boolean flag = loginpage.validateAmazonImage();
		Assert.assertEquals(flag, flag);
		
	}
	
	@Test (priority = 3)
	public void login() {
		loginpage.loginbtn();
		loginpage.typeusername(prop.getProperty("username"));
		loginpage.continuebtn();
		loginpage.typepassword(prop.getProperty("password"));
		homepage = loginpage.signinbtn();
	}
	
	
    @AfterMethod
	public void close() {
		driver.quit();
	} 
	}

