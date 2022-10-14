package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumDifferentDietPage extends BaseClass{
	
	public CentrumDifferentDietPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//u[text()='Vitamin D is another essential vitamin for everyone']")
	private static WebElement vitaminDLinkOne;
	
	@FindBy(xpath = "//u[text()='supports bone growth.']")
	private static WebElement vitaminDLinkTwo;
	
	@FindBy(xpath = "//u[text()='You can try eating more vitamin B12 fortified foods like soymilk, cereals and nutritional yeast']")
	private static WebElement vitaminB12link;
	
	@FindBy(xpath = "//u[text()='These important fatty acids support your heart and brain function,']")
	private static WebElement omega3Link;
	
	@FindBy(xpath = "//u[text()='take vitamin supplements when you need them']")
	private static WebElement nutritionalSupportLinkOne;
	
	@FindBy(xpath = "//a[text()='Centrum']")
	private static WebElement nutritionalSupportLinkTwo;
	
	@FindBy(xpath = "//a[text()='ingredients']")
	private static WebElement nutritionalSupportLinkThree;
	
	@FindBy(xpath = "//a[text()='multivitamin']")
	private static WebElement nutritionalSupportLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//a[text()='Vitamins and Minerals for Healthy Eyes']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='Wellness Quick Tips']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='How Vitamins Can Easily Fit Into My Regimen and Lifestyle']")
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
	
	public void clickVitaminDLinkOne() throws Exception {
		scrollDownUsingElement(vitaminDLinkOne);
		clickElementUsingJavaScript(vitaminDLinkOne);
	}
	
	public void clickVitaminDLinkTwo() throws Exception {
		scrollDownUsingElement(vitaminDLinkTwo);
		clickElementUsingJavaScript(vitaminDLinkTwo);
	}
	
	public void clickVitaminB12Link() throws Exception {
		scrollDownUsingElement(vitaminB12link);
		clickElementUsingJavaScript(vitaminB12link);
	}
	
	public void clickOmega3Link() throws Exception {
		scrollDownUsingElement(omega3Link);
		clickElementUsingJavaScript(omega3Link);
	}
	
	public void clickNutritionalSupportLinkOne() throws Exception {
		scrollDownUsingElement(nutritionalSupportLinkOne);
		clickElementUsingJavaScript(nutritionalSupportLinkOne);
	}
	
	public void clickNutritionalSupportLinkTwo() throws Exception {
		scrollDownUsingElement(nutritionalSupportLinkTwo);
		clickElementUsingJavaScript(nutritionalSupportLinkTwo);
	}
	
	public void clickNutritionalSupportLinkThree() throws Exception {
		scrollDownUsingElement(nutritionalSupportLinkThree);
		clickElementUsingJavaScript(nutritionalSupportLinkThree);
	}
	
	public void clickNutritionalSupportLinkFour() throws Exception {
		scrollDownUsingElement(nutritionalSupportLinkFour);
		clickElementUsingJavaScript(nutritionalSupportLinkFour);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(nutritionalSupportLinkFour);
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
