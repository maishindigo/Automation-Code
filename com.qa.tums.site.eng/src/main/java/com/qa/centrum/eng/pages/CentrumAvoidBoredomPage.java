package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumAvoidBoredomPage extends BaseClass{

	public CentrumAvoidBoredomPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='food and nutrition']")
	private static WebElement getCraftyLinkOne;
	
	@FindBy(xpath = "//a[text()='immune support']")
	private static WebElement getCraftyLinkTwo;
	
	@FindBy(xpath = "//u[text()='stress management']")
	private static WebElement getCraftyLinkThree;
	
	@FindBy(xpath = "//a[text()='Learning Center']")
	private static WebElement getCraftyLinkFour;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
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
	
	public void clickGetCraftyLinkOne() throws Exception {
		scrollDownUsingElement(getCraftyLinkOne);
		clickElementUsingJavaScript(getCraftyLinkOne);
	}
	
	public void clickGetCraftyLinkTwo() throws Exception {
		scrollDownUsingElement(getCraftyLinkTwo);
		clickElementUsingJavaScript(getCraftyLinkTwo);
	}
	
	public void clickGetCraftyLinkThree() throws Exception {
		scrollDownUsingElement(getCraftyLinkThree);
		clickElementUsingJavaScript(getCraftyLinkThree);
	}
	
	public void clickGetCraftyLinkFour() throws Exception {
		scrollDownUsingElement(getCraftyLinkFour);
		clickElementUsingJavaScript(getCraftyLinkFour);
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
