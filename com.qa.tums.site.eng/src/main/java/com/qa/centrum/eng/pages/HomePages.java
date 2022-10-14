package com.qa.centrum.eng.pages;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class HomePages extends BaseClass {

	public HomePages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;

	@FindBy(id = "learn-more")
	private static WebElement learnMoreBtn;
	
	

	public void clickCookiesDismissBtn() {
		elementClick(cookiesDismissBtn);
	}

	public void clickLearnMoreBtn() {
		elementClick(learnMoreBtn);

	}
	public void verifyurl() {
		verifyUrl();
	}
	
			
	
}
