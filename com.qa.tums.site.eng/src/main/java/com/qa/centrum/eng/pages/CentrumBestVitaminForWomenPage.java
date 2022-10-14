package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumBestVitaminForWomenPage extends BaseClass{
	
	public CentrumBestVitaminForWomenPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	
	@FindBy(xpath = "//u[text()='multivitamins for women']")
	private static WebElement multivitaminForWomenLink;
	
	@FindBy(xpath = "//u[text()='Centrum® Silver® Women']")
	private static WebElement healthyAgingLinkOne;
	
	@FindBy(xpath = "//u[text()='Centrum® vitamins formulated especially for women']")
	private static WebElement healthyAgingLinkTwo;
	
	
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
	
	
	public void clickMultivitaminForWomenLink() throws Exception{
		scrollDownUsingElement(multivitaminForWomenLink);
		clickElementUsingJavaScript(multivitaminForWomenLink);
	}
	
	public void clickHealthyAgingLinkOne() throws Exception{
		scrollDownUsingElement(healthyAgingLinkOne);
		clickElementUsingJavaScript(healthyAgingLinkOne);
	}
	
	public void clickHealthyAgingLinkTwo() throws Exception{
		scrollDownUsingElement(healthyAgingLinkTwo);
		clickElementUsingJavaScript(healthyAgingLinkTwo);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(healthyAgingLinkTwo);
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
