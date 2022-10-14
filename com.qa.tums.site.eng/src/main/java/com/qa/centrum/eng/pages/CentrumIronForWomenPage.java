package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumIronForWomenPage extends BaseClass{
	
	public CentrumIronForWomenPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='over-the-counter multivitamin like Centrum']")
	private static WebElement ironDietLinkOne;
	
	@FindBy(xpath = "//a[text()='Centrum Women']")
	private static WebElement ironDietLinkTwo;
	
	@FindBy(xpath = "//a[text()='ingredients']")
	private static WebElement ironDietLinkThree;
	
	@FindBy(xpath = "//a[text()='Centrum Expert Corner']")
	private static WebElement ironDietLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='How to Make Coffee at Home']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
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
	
	public void clickIronDietLinkOne() throws Exception {
		scrollDownUsingElement(ironDietLinkOne);
		clickElementUsingJavaScript(ironDietLinkOne);
	}
	
	public void clickIronDietLinkTwo() throws Exception {
		scrollDownUsingElement(ironDietLinkTwo);
		clickElementUsingJavaScript(ironDietLinkTwo);
	}
	
	public void clickIronDietLinkThree() throws Exception {
		scrollDownUsingElement(ironDietLinkThree);
		clickElementUsingJavaScript(ironDietLinkThree);
	}
	
	public void clickIronDietLinkFour() throws Exception {
		scrollDownUsingElement(ironDietLinkFour);
		clickElementUsingJavaScript(ironDietLinkFour);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(ironDietLinkFour);
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
