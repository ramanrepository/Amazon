package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AddressesPage;
import com.amazon.qa.pages.LoginPage;


public class AddAddressesPageTest extends TestBase{
	AddressesPage addaddress;
	LoginPage loginpage;
	
	public AddAddressesPageTest() {
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
	     loginpage.signinbtn();
	
	 addaddress = new AddressesPage();
	}
	

	@Test
	public void AddingNewAddress() {
		addaddress.accountbtn();
		addaddress.addresses();
		addaddress.fullname("Raman");
		addaddress.phonenumber("123456789");
		addaddress.address("1234 Cherrytree drive");
		addaddress.addresscity("Brampton");
		addaddress.Province();
		addaddress.postal("L6R3L7");
		addaddress.addaddressbtn();
	}

	
	
    @AfterMethod
	public void close() {
		driver.quit();
	} 
	

}



