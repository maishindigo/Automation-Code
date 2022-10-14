package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumOmegaSupplementsPage extends BaseClass{
	
	
	public CentrumOmegaSupplementsPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='adding more fish and grass-fed meat to your diet']")
	private static WebElement omega3sAnd6sLink;
	
	@FindBy(xpath = "//u[text()='omega-3s continues to show benefits']")
	private static WebElement benefitsOfEyeBrainAndHeart;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement scrollToArticle;
	
	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
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
	
	public void clickOmega3sAnd6sLink() throws Exception {
		scrollDownUsingElement(omega3sAnd6sLink);
		clickElementUsingJavaScript(omega3sAnd6sLink);
	}
	
	public void clickBenefitsOfEyeBrainAndHeart() throws Exception {
		scrollDownUsingElement(benefitsOfEyeBrainAndHeart);
		clickElementUsingJavaScript(benefitsOfEyeBrainAndHeart);
	}
	
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(benefitsOfEyeBrainAndHeart);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleFour);
	}
}
