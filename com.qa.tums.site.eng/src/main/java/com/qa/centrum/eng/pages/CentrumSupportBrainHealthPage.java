package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumSupportBrainHealthPage extends BaseClass{
	
	public CentrumSupportBrainHealthPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Physical Activity Guidelines for Americans']")
	private static WebElement goodHealthLink;
	
	@FindBy(xpath = "//u[text()='Vitamin C is a powerful antioxidant']")
	private static WebElement feedYourHeadLinkOne;
	
	@FindBy(xpath = "//u[text()='oxidative stress, which affects brain health.']")
	private static WebElement feedYourHeadLinkTwo;
	
	@FindBy(xpath = "//u[text()='help satisfy vitamin B12 needs']")
	private static WebElement feedYourHeadLinkThree;
	
	@FindBy(xpath = "//u[text()='Omega-3 fats support the structure of brain cell membranes']")
	private static WebElement feedYourHeadLinkFour;
	
	@FindBy(xpath = "//u[text()='nutrient-rich diet']")
	private static WebElement feedYourHeadLinkFive;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
	private static WebElement articleFour;
	
	
	
	
	
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
	
	public void clickGoodHealthLink() throws Exception {
		scrollDownUsingElement(goodHealthLink);
		clickElementUsingJavaScript(goodHealthLink);
	}

	public void clickFeedYourHeadLinkOne() throws Exception {
		scrollupUsingElement(feedYourHeadLinkOne);
		clickElementUsingJavaScript(feedYourHeadLinkOne);
	}
	
	public void clickFeedYourHeadLinkTwo() throws Exception {
		scrollupUsingElement(feedYourHeadLinkTwo);
		clickElementUsingJavaScript(feedYourHeadLinkTwo);
	}
	
	public void clickFeedYourHeadLinkThree() throws Exception {
		scrollupUsingElement(feedYourHeadLinkThree);
		clickElementUsingJavaScript(feedYourHeadLinkThree);
	}
	
	public void clickFeedYourHeadLinkFour() throws Exception {
		scrollupUsingElement(feedYourHeadLinkFour);
		clickElementUsingJavaScript(feedYourHeadLinkFour);
	}
	
	public void clickFeedYourHeadLinkFive() throws Exception {
		scrollupUsingElement(feedYourHeadLinkFive);
		clickElementUsingJavaScript(feedYourHeadLinkFive);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(feedYourHeadLinkFive);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
	} 
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
	} 
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
	} 
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
	} 
}
