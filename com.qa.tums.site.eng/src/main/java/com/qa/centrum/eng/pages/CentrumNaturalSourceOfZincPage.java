package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumNaturalSourceOfZincPage extends BaseClass{
	
	public CentrumNaturalSourceOfZincPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Zinc']")
	private static WebElement zincOne;
	
	@FindBy(xpath = "//a[text()='well-balanced diet']")
	private static WebElement zincLink;
	
	@FindBy(xpath = "//u[text()='zinc plays a role in immune function']")
	private static WebElement dailyHealthLink;
	
	@FindBy(xpath = "//a[text()='vitamins with zinc']")
	private static WebElement supplementLink;
	
	@FindBy(xpath = "//a[text()='nutrients your diet may be missing']")
	private static WebElement veganLink;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Omega-3 Supplements']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Over 50? What Your Body Needs More of Now']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
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
	
	public void clickZincOne() throws Exception {
		clickElementUsingJavaScript(zincOne);
	}
	
	public void clickZincLink() throws Exception {
		scrollDownUsingElement(zincLink);
		clickElementUsingJavaScript(zincLink);
	}
	
	public void clickDailyHealthLink() throws Exception{
		scrollDownUsingElement(dailyHealthLink);
		clickElementUsingJavaScript(dailyHealthLink);
	}
	
	public void clickSupplementLink() throws Exception{
		scrollDownUsingElement(supplementLink);
		clickElementUsingJavaScript(supplementLink);
	}
	
	public void clickVeganLink() throws Exception{
		scrollDownUsingElement(veganLink);
		clickElementUsingJavaScript(veganLink);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(veganLink);
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
