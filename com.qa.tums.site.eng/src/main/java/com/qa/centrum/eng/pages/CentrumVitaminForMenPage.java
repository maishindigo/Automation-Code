package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminForMenPage extends BaseClass {

	public CentrumVitaminForMenPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Centrum MultiGummies® Men 50+']")
	private static WebElement rightMenLinkOne;
	
	@FindBy(xpath = "//a[text()='vitamins and minerals']")
	private static WebElement rightMenLinkTwo;
	
	@FindBy(xpath = "//a[text()='Centrum Men Multivitamins']")
	private static WebElement goodMultivitaminLink;
	
	@FindBy(xpath = "//strong[text()='Vitamins for Healthy Appearance']")
	private static WebElement scroll;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='How Supplements and Multivitamins Work Together']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
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
	
	public void clickRightMenLinkOne() throws Exception {
		scrollDownUsingElement(rightMenLinkOne);
		clickElementUsingJavaScript(rightMenLinkOne);
	}
	
	public void clickRightMenLinkTwo() throws Exception {
		scrollDownUsingElement(rightMenLinkTwo);
		clickElementUsingJavaScript(rightMenLinkTwo);
	}
	
	public void clickGoodMultivitaminLink() throws Exception {
		scrollDownUsingElement(goodMultivitaminLink);
		clickElementUsingJavaScript(goodMultivitaminLink);
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
