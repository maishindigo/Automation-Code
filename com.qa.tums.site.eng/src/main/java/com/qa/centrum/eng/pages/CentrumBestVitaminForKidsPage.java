package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumBestVitaminForKidsPage extends BaseClass{
	
	public CentrumBestVitaminForKidsPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//u[text()='balanced, nutritious meals']")
	private static WebElement dietLink;
	
	@FindBy(xpath = "//u[text()='Vitamin C: Plays a role in immune function']")
	private static WebElement vitaminLinkOne;
	
	@FindBy(xpath = "//u[text()='help the body form and maintain strong teeth and bones']")
	private static WebElement vitaminLinkTwo;
	
	@FindBy(xpath = "//strong[text()='Step 4)']")
	private static WebElement scroll;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='How to Keep Your Bones Healthy and Strong']")
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

	public void clickDietLink() throws Exception {
		scrollDownUsingElement(dietLink);
		clickElementUsingJavaScript(dietLink);
	}
	
	public void clickVitaminLinkOne() throws Exception {
		scrollDownUsingElement(vitaminLinkOne);
		clickElementUsingJavaScript(vitaminLinkOne);
	}
	
	public void clickVitaminLinkTwo() throws Exception {
		scrollDownUsingElement(vitaminLinkTwo);
		clickElementUsingJavaScript(vitaminLinkTwo);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(scroll);
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
