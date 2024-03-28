package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBase;

public class AddressesPage extends TestBase{
	@FindBy (xpath = "//span[contains(text(),'Your Account')]") WebElement Youraccount;
	@FindBy (xpath = "//span[contains(text(),'Hello, Raman')]") WebElement accountbtn;
 @FindBy (xpath = "//span[@class ='a-color-secondary']") WebElement Addresses;
 @FindBy ( id="ya-myab-plus-address-icon") WebElement Addaddress;
 @FindBy  (id="address-ui-widgets-enterAddressFullName") WebElement Fullname;
 @FindBy (id = "address-ui-widgets-enterAddressPhoneNumber") WebElement Phonenumber;
 @FindBy (id = "address-ui-widgets-enterAddressLine1") WebElement Address;
 @FindBy (id = "address-ui-widgets-enterAddressCity") WebElement Addresscity;
 @FindBy (xpath = "//span[@class ='a-button-text a-declarative']") WebElement Province;
 @FindBy (id = "address-ui-widgets-enterAddressPostalCode") WebElement Postal;
 @FindBy (id =  "address-ui-widgets-form-submit-button-announce") WebElement Addaddressbtn;
 
 public AddressesPage() {
		PageFactory.initElements(driver,this);	
		}
 public void accountbtn() {
	 accountbtn.click();
 }

 public void addresses() {
	 	
	   Addresses.click();
 }
 public void fullname(String fullname) {
	 Fullname.sendKeys(fullname);
 }
 public void phonenumber(String phonenumber) {
	 Phonenumber.sendKeys(phonenumber);
 }
 public void address(String street) {
	 Address.sendKeys(street);
 }
 public void addresscity(String city) {
	 Addresscity.sendKeys(city);
 }
 public void Province() {
	 Select obj = new Select(Province);
	 obj.selectByVisibleText("Ontario");
 }
 public void postal(String postalcode) {
	 Postal.sendKeys(postalcode);
 }
 public void addaddressbtn() {
	 	
	 Addaddressbtn.click();
}
}

