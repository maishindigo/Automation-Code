package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumDuringPregnancyPage extends BaseClass{
	
	public CentrumDuringPregnancyPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//u[text()='A balanced diet rich in fruits, vegetables, whole grains, seafood, lean meats']")
	private static WebElement pregnancyDietLinkOne;
	
	@FindBy(xpath = "//u[text()='folic acid as one of two nutrients that should be increased in women of childbearing age']")
	private static WebElement pregnancyDietLinkTwo;
	
	@FindBy(xpath = "//u[text()='omega-3 supplements can help balance your nutritional needs.']")
	private static WebElement omega3LinkOne;
	
	@FindBy(xpath = "//u[text()='Vitamin D is essential for calcium absorption by the body']")
	private static WebElement calciumAndVitaminD;
	
	@FindBy(xpath = "//u[text()='healthy lifestyle habits']")
	private static WebElement afterBabyArrivesLinkOne;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//h2[text()='Latest Articles']")
	private static WebElement scrollToArticles;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
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
	
	
	public void clickPregnancyDietLinkOne() throws Exception {
		scrollDownUsingElement(pregnancyDietLinkOne);
		clickElementUsingJavaScript(pregnancyDietLinkOne);
	}
	
	public void clickPregnancyDietLinkTwo() throws Exception {
		scrollDownUsingElement(pregnancyDietLinkTwo);
		clickElementUsingJavaScript(pregnancyDietLinkTwo);
	}
	
	public void clickOmega3LinkOne() throws Exception {
		scrollDownUsingElement(omega3LinkOne);
		clickElementUsingJavaScript(omega3LinkOne);
	}
	
	public void clickCalciumAndVitaminDLinkOne() throws Exception {
		scrollDownUsingElement(calciumAndVitaminD);
		clickElementUsingJavaScript(calciumAndVitaminD);
	}
	
	public void clickAfterBabyArrivesLinkOne() throws Exception {
		scrollDownUsingElement(afterBabyArrivesLinkOne);
		clickElementUsingJavaScript(afterBabyArrivesLinkOne);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(afterBabyArrivesLinkOne);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}
	
	public void clickArticleOne() throws Exception {
		scrollupUsingElement(articleOne);
		elementClick(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollupUsingElement(articleTwo);
		elementClick(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollupUsingElement(articleThree);
		elementClick(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollupUsingElement(articleFour);
		elementClick(articleFour);
	}

}
