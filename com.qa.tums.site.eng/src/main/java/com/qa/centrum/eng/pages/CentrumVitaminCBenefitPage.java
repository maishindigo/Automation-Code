package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminCBenefitPage extends BaseClass{

	public CentrumVitaminCBenefitPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Vitamin C']")
	private static WebElement vitaminCLink;
	
	@FindBy(xpath = "//a[text()='vitamin A']")
	private static WebElement vitaminCLinkOne;
	
	@FindBy(xpath = "//a[text()='vitamin E']")
	private static WebElement vitaminCLinkTwo;
	
	@FindBy(xpath = "//a[text()='selenium']")
	private static WebElement vitaminCLinkThree;
	
	@FindBy(xpath = "//a[text()='beta carotene']")
	private static WebElement vitaminCLinkFour;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Men Multigummies']")
	private static WebElement productWithVitaminLinkOne;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Women Multigummies']")
	private static WebElement productWithVitaminLinkTwo;
	
	@FindBy(xpath = "//strong[text()='Centrum Minis Immune Support Women']")
	private static WebElement productWithVitaminLinkThree;
	
	@FindBy(xpath = "//strong[text()='Centrum Minis Immune Support Men']")
	private static WebElement productWithVitaminLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Paleo Vitamins and Supplements']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='How Supplements and Multivitamins Work Together']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Multivitamins for Kids: What You Need to Know']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Keto Vitamins']")
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
	
	public void clickVitaminCLink() throws Exception {
		scrollDownUsingElement(vitaminCLink);
		clickElementUsingJavaScript(vitaminCLink);
	}
	
	public void clickVitaminCLinkOne() throws Exception {
		scrollDownUsingElement(vitaminCLinkOne);
		clickElementUsingJavaScript(vitaminCLinkOne);
	}
	
	public void clickVitaminCLinkTwo() throws Exception {
		scrollDownUsingElement(vitaminCLinkTwo);
		clickElementUsingJavaScript(vitaminCLinkTwo);
	}
	
	public void clickVitaminCLinkThree() throws Exception {
		scrollDownUsingElement(vitaminCLinkThree);
		clickElementUsingJavaScript(vitaminCLinkThree);
	}
	
	public void clickVitaminCLinkFour() throws Exception {
		scrollDownUsingElement(vitaminCLinkFour);
		clickElementUsingJavaScript(vitaminCLinkFour);
	}
	
	public void clickProductWithVitaminLinkOne() throws Exception {
		scrollDownUsingElement(productWithVitaminLinkOne);
		clickElementUsingJavaScript(productWithVitaminLinkOne);
	}
	
	public void clickProductWithVitaminLinkTwo() throws Exception {
		scrollDownUsingElement(productWithVitaminLinkTwo);
		clickElementUsingJavaScript(productWithVitaminLinkTwo);
	}
	
	public void clickProductWithVitaminLinkThree() throws Exception {
		scrollDownUsingElement(productWithVitaminLinkThree);
		clickElementUsingJavaScript(productWithVitaminLinkThree);
	}
	
	public void clickProductWithVitaminLinkFour() throws Exception {
		scrollDownUsingElement(productWithVitaminLinkFour);
		clickElementUsingJavaScript(productWithVitaminLinkFour);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(productWithVitaminLinkFour);
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
