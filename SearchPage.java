package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SearchPage extends TestBase{

	@FindBy (id ="twotabsearchtextbox") WebElement searchBox;
	@FindBy (id = "nav-search-submit-button") WebElement searchBtn;

	public SearchPage() {
		PageFactory.initElements(driver,this);	

	}
	public void typeSearchBox(String searchitem) {
		searchBox.sendKeys(searchitem);
	}
	public SearchPage searchButton() {
		searchBox.click();
		return new SearchPage();
	}
}
