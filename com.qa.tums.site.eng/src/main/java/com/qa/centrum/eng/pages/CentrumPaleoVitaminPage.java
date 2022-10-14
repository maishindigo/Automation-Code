package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumPaleoVitaminPage extends BaseClass{

	public CentrumPaleoVitaminPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Calcium']")
	private static WebElement calciumLink;
	
	@FindBy(xpath = "//a[text()='B-Vitamins']")
	private static WebElement vitaminBLink;
	
	@FindBy(xpath = "//a[text()='Vitamin D']")
	private static WebElement vitaminDLink;
	
	@FindBy(xpath = "//a[text()='in Centrum products']")
	private static WebElement centrumProduct;
	
	@FindBy(xpath = "//h2[text()='Nutrition for Now']")
	private static WebElement scrollToReference;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy (xpath = "//Strong[text()='What Nutrients Do I Need During Pregnancy?']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//Strong[text()='The Benefits of Omega-3 Supplements']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//Strong[text()='Complexion Protection']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//Strong[text()='Establishing a Self-Care Routine']")
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
	
	public void clickCalciumLink() throws Exception {
		scrollDownUsingElement(calciumLink);
		clickElementUsingJavaScript(calciumLink);
	}
	
	public void clickVitaminBLink() throws Exception {
		scrollDownUsingElement(vitaminBLink);
		clickElementUsingJavaScript(vitaminBLink);
	}
	
	public void clickVitaminDLink() throws Exception {
		scrollDownUsingElement(vitaminDLink);
		clickElementUsingJavaScript(vitaminDLink);
	}
	
	
	public void clickCentrumProduct() throws Exception {
		scrollDownUsingElement(vitaminDLink);
		clickElementUsingJavaScript(vitaminDLink);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(scrollToReference);
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
