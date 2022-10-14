package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMultivitaminsForKidsPage extends BaseClass{

	public CentrumMultivitaminsForKidsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='multivitamins for kids']")
	private static WebElement bannerLink;
	
	@FindBy(xpath = "(//a[text()='AI'])[1]")
	private static WebElement multivitaminLinkOne;
	
	@FindBy(xpath = "(//a[text()='https://lpi.oregonstate.edu/mic/life-stages/children'])[1]")
	private static WebElement multivitaminLinkTwo;
	
	@FindBy(xpath = "(//a[text()='AI'])[2]")
	private static WebElement multivitaminLinkThree;
	
	@FindBy(xpath = "(//a[text()='https://lpi.oregonstate.edu/mic/life-stages/children'])[2]")
	private static WebElement multivitaminLinkFour;
	
	
	@FindBy(xpath = "//strong[text()='Centrum MultiGummies Kids Tropical Punch']")
	private static WebElement tropicalPunchLink;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Kids MultiGummies']")
	private static WebElement multiGummiesLink;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Vitamins & Minerals for Healthy Aging']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='How Vitamin D Benefits Your Health']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Which Vitamins are Antioxidants?']")
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
	
	public void clickBannerLink() throws Exception {
		clickElementUsingJavaScript(bannerLink);
	}
	
	
	public void clickMultivitaminLinkOne() throws Exception {
		scrollDownUsingElement(multivitaminLinkOne);
		clickElementUsingJavaScript(multivitaminLinkOne);
	}
	
	public void clickMultivitaminLinkTwo() throws Exception {
		scrollDownUsingElement(multivitaminLinkTwo);
		clickElementUsingJavaScript(multivitaminLinkTwo);
	}
	
	public void clickMultivitaminLinkThree() throws Exception {
		scrollDownUsingElement(multivitaminLinkThree);
		clickElementUsingJavaScript(multivitaminLinkThree);
	}
	
	public void clickMultivitaminLinkFour() throws Exception {
		scrollDownUsingElement(multivitaminLinkFour);
		clickElementUsingJavaScript(multivitaminLinkFour);
	}
	
	public void clickTropicalPunchLink() throws Exception {
		scrollDownUsingElement(tropicalPunchLink);
		clickElementUsingJavaScript(tropicalPunchLink);
	}
	
	public void clickMultiGummiesLink() throws Exception {
		scrollDownUsingElement(multiGummiesLink);
		clickElementUsingJavaScript(multiGummiesLink);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(multiGummiesLink);
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
