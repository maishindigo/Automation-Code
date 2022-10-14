package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumHeaderAndFooterPOMPage extends BaseClass{
	
	public CentrumHeaderAndFooterPOMPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Yogita's Code
	 */
		
	
	@FindBy(xpath = "//a[text()='Get Coupon']")
    WebElement getcoupon;
	
	@FindBy(xpath = "//a[text()='Where to Buy']")
    WebElement wheretobuy;
	
	@FindBy(xpath = "//a[text()='Newsletter']")
    WebElement newsletter;
	
	@FindBy(xpath = "//img[@alt=\"Centrum\"]")
    WebElement HeaderCentrum;
	
	@FindBy(xpath = "//span[@class=\"country-selected\"]")
    WebElement country;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    WebElement search;
	
	@FindBy(xpath = "//a[@title=\"GSK-logo\"]")
    WebElement Gsk_Logo;
	
	
	
	/**
	 * Sujai's Code 
	 */
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUS;
	
	@FindBy(xpath = "//a[text()='Sitemap']")
	WebElement sitemap;
	
	@FindBy(xpath = "(//input[@name='data.centrum.newsletter.firstName'])[3]")
	WebElement firstName;
	
	@FindBy(xpath = "(//input[@name='profile.email'])[3]")
	WebElement email;
	
	@FindBy(xpath = "//h2[text()='An email just for you is on the way']")
	WebElement emailText;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement clickGigyaForm;
	
	@FindBy(xpath = "(//input[@name='data.centrum.newsletter.firstName'])[4]")
	WebElement firstNameOne;
	
	@FindBy(xpath = "(//input[@name='profile.email'])[4]")
	WebElement firstEmailOne;
	
	@FindBy(xpath = "//h2[text()='An email just for you is on the way']")
	WebElement gigyaText;
	
	@FindBy(xpath = "(//input[@class='gigya-input-submit'])[5]")
	WebElement closeGigyaWindow;
	
	@FindBy(xpath = "//div[@class='gigyaraas component section max-content-width even last col-xs-12 content_hide']")
	private static WebElement gigyaClose;
	
	/**
	 * Yogitas's Code
	 */
	
	public void clickoncoupon() throws Exception {
		moveToElement(getcoupon);
		elementClick(getcoupon);
	}
	public void clickonwheretobuy() throws Exception {
		moveToElement(wheretobuy);
		elementClick(wheretobuy);
	}
	public void clickonnewsletter() throws Exception {
		moveToElement(newsletter);
		elementClick(newsletter);
	}
	public void clickonHeaderCentrum() throws Exception {
		moveToElement(HeaderCentrum);
		elementClick(HeaderCentrum);
	}
	public void clickonCountryside() throws Exception {
		moveToElement(country);
		elementClick(country);
	}
	public void clickonsearch() throws Exception {
		moveToElement(search);
		elementClick(search);
	}
	public void clickonGskLogo() throws Exception {
		moveToElement(Gsk_Logo);
		elementClick(Gsk_Logo);
	}
	
	
	/**
	 * Sujai's Code
	 */
	
	
	
	public void clickCookieBtn() {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() throws Exception {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
			elementVisible(gigyaClose);
			Assert.assertTrue(elementIsDisplayed(gigyaClose));
		} catch (NoSuchElementException e) {

		}
	}
	
	public void clickContactUs() throws Exception {
		scrollDownUsingElement(contactUS);
		elementClick(contactUS);
	}
	
	public void clickSiteMap() throws Exception {
		scrollDownUsingElement(sitemap);
		elementClick(sitemap);
	}
	
	public void gigyaFormOne() throws Exception {
		scrollDownUsingElement(firstName);
		elementSendKeys(firstName, "Sujai");
		elementSendKeys(email, "Sujaiit0696@gmail.com");
		email.sendKeys(Keys.ENTER);
		if (emailText.isDisplayed()) {
			System.out.println(getElementText(emailText));
		}
		
	}
	
	public void gigyaFormTwo() throws Exception {
		scrollDownUsingElement(clickGigyaForm);
		elementClick(clickGigyaForm);
		elementSendKeys(firstNameOne, "Sujai");
		elementSendKeys(firstEmailOne, "Sujaiit0696@gmail.com");
		firstEmailOne.sendKeys(Keys.ENTER);
		if (gigyaText.isDisplayed()) {
			System.out.println(getElementText(gigyaText));
			elementClick(closeGigyaWindow);
		}
		
		
	}
	
	
	
}
