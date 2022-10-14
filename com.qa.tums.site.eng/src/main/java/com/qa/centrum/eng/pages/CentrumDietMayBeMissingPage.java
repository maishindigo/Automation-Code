package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumDietMayBeMissingPage extends BaseClass{

	public CentrumDietMayBeMissingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//h2[text()='2. Vitamin C']")
	private static WebElement scrollToVitacminC;

	@FindBy(xpath = "//u[text()='Vitamin C’s more well-known function is its role in immunity support']")
	private static WebElement vitaminCImmuneSupport;

	@FindBy(xpath = "//u[text()='its antioxidant abilities']")
	private static WebElement vitaminCAntioxidantAbilities;

	@FindBy(xpath = "//u[text()='Vitamin D plays a role in helping the body to absorb and use calcium']")
	private static WebElement vitaminDLinkOne;

	@FindBy(xpath = "//u[text()='support bone health']")
	private static WebElement vitaminDLinkTwo;

	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;

	@FindBy(xpath = "//h2[text()='4. Vitamin E']")
	private static WebElement scrollToVitaminE;

	@FindBy(xpath = "//u[text()='Vitamin E supports heart and brain health as well as immune function.']")
	private static WebElement vitaminELinkImmuneFunction;

	@FindBy(xpath = "//h2[text()='6. Magnesium']")
	private static WebElement scrollTomagnesium; 

	@FindBy(xpath = "//u[text()='balanced diet']")
	private static WebElement magnesiumLinkBalancedDiet;

	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement scrollToArticles;

	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleOne;

	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	private static WebElement articleTwo;

	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;

	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
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


	public void clickVitaminCImmuneSupport() throws Exception {
		scrollDownUsingElement(scrollToVitacminC);
		elementClick(vitaminCImmuneSupport);
	}

	public void clickVitaminCAntioxidantAbilities() throws Exception {
		scrollDownUsingElement(scrollToVitacminC);
		elementClick(vitaminCAntioxidantAbilities);
	}

	public void clickVitaminDLinkOne() throws Exception {
		scrollDownUsingElement(scrollToVitacminC);
		elementClick(vitaminDLinkOne);
	}

	public void clickVitaminDLinkTwo() throws Exception {
		scrollDownUsingElement(scrollToVitacminC);
		elementClick(vitaminDLinkTwo);
	}

	public void clickVitaminELinkImmuneFunction() throws Exception {
		scrollDownUsingElement(scrollToVitaminE);
		elementClick(vitaminELinkImmuneFunction);
	}

	public void clickMagnesiumLinkBalancedDiet() throws Exception {
		scrollDownUsingElement(scrollTomagnesium);
		elementClick(magnesiumLinkBalancedDiet);
	}

	public void clickShowReference() throws Exception {
		scrollDownUsingElement(scrollTomagnesium);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}

	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(articleOne);
	}

	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(articleTwo);
	}

	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(articleThree);
	}

	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(articleFour);
	}
}
