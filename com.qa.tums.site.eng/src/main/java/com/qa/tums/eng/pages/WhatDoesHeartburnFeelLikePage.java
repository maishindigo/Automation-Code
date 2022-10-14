package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class WhatDoesHeartburnFeelLikePage extends BaseClass {
	
	public WhatDoesHeartburnFeelLikePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;

	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement Heartburn101;
	
	@FindBy(xpath = "(//a[@title='What does heartburn feel like'])[2]")
	private static WebElement heartburnFeelLike;
	
	@FindBy(xpath = "//h1[text()='What Does Heartburn Feel Like?']")
	private static WebElement textHeartburnFeelLike;
	
	@FindBy(xpath = "//img[@src='/content/dam/cf-consumer-healthcare/bp-tums/en_US/products/what-does-hearburn-feel-like-thumb.jpg']")
	private static WebElement imgYouteBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickCookiesDismissBtn() throws InterruptedException {
		Thread.sleep(3000);
		if (cookiesDismissBtn.isDisplayed()) {
			elementClick(cookiesDismissBtn);
		} 
	}
	
	public void mouseOverHearburn101() throws Exception {
		moveToElement(Heartburn101);
		elementClick(heartburnFeelLike);
		if (textHeartburnFeelLike.isDisplayed()) {
			System.out.println("User successfully navigated to Hearburn Feel Like Page");
			
		}
		
	}
	
	
	
	
	
}
