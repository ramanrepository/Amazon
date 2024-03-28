package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy (xpath = "//span[contains(text(),'Hello, Raman')]") WebElement userNameLabel;
	@FindBy (id ="twotabsearchtextbox") WebElement searchBox;
	@FindBy (id = "nav-search-submit-button") WebElement searchBtn;
	
	public HomePage() {
		PageFactory.initElements(driver,this);	

	}
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public void typeSearchBox(String searchitem) {
		searchBox.sendKeys(searchitem);
	}
	public SearchPage searchButton() {
		searchBox.click();
		return new SearchPage();
	}
}
