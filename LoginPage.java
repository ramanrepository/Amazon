package com.amazon.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy (id = "nav-link-accountList-nav-line-1") WebElement signin;
	@FindBy (id = "ap_email" ) WebElement Username;
	@FindBy (id = "continue") WebElement Continuebtn;
	@FindBy (id = "ap_password") WebElement Password;
	@FindBy (id = "signInSubmit") WebElement Signinbtn;
	@FindBy (id = "nav-logo-sprites")WebElement Amazonlogo;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);	

	}
	public String validateAmazonTitle() {
		return driver.getTitle();
	}
	public boolean validateAmazonImage() {
		return Amazonlogo.isDisplayed();
		
	}
	
	public void loginbtn() {
		signin.click();
		
	}
	
	public void typeusername(String username) {
		Username.sendKeys(username);
		
	}
	public void continuebtn() {
		Continuebtn.click();
		
	}
	public void typepassword(String password) {
		Password.sendKeys(password);
		
	}
	public HomePage signinbtn() {
	 	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", Signinbtn);
		return new HomePage();
		}

}
