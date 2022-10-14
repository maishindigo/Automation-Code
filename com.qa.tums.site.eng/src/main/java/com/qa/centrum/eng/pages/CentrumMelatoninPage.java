package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMelatoninPage extends BaseClass{
	
	public CentrumMelatoninPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='overall wellness']")
	private static WebElement melatoninLink;
	
	@FindBy(xpath = "(//a[text()='Centrum Gummy Rest & Rejuvenate'])[1]")
	private static WebElement howMuchMelatoninLink;
	
	@FindBy(xpath = "//a[text()='completing your self-care routine']")
	private static WebElement restfulSleepLinkOne;
	
	@FindBy(xpath = "(//a[text()='Centrum Gummy Rest & Rejuvenate'])[2]")
	private static WebElement restfulSleepLinkTwo;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	
	
	public void clickCookieBtn() {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}
	
	public void clickMelatoninLink() throws Exception {
		scrollDownUsingElement(melatoninLink);
		clickElementUsingJavaScript(melatoninLink);
	}
	
	public void clickHowMuchMelatoninLink() throws Exception {
		scrollDownUsingElement(howMuchMelatoninLink);
		clickElementUsingJavaScript(howMuchMelatoninLink);
	}
	
	public void clickRestfulSleepLinkOne() throws Exception {
		scrollDownUsingElement(restfulSleepLinkOne);
		clickElementUsingJavaScript(restfulSleepLinkOne);
	}
	
	public void clickRestfulSleepLinkTwo() throws Exception {
		scrollDownUsingElement(restfulSleepLinkTwo);
		clickElementUsingJavaScript(restfulSleepLinkTwo);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(restfulSleepLinkTwo);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}

}
