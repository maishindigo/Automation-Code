package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumTipsForAMoreBalancedDietPage extends BaseClass{
	
	public CentrumTipsForAMoreBalancedDietPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//h2[text()='4. Avoid Cigarettes']")
	private static WebElement scrollToOverAllHealth;
	
	@FindBy(xpath = "//u[text()='support your overall health.']")
	private static WebElement linkOverAllHealth;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement scrollToArticles;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured first odd col-xs-12']")
	private static WebElement nutrientsYourDiet;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured even col-xs-12']")
	private static WebElement boostYourEnergy;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured odd col-xs-12']")
	private static WebElement healtheirLife;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured even last col-xs-12']")
	private static WebElement brainHealth;
	
	
	
	
	
	
	
	
	
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
	
	public void clickLinkOverAllHealth() throws Exception {
		scrollDownUsingElement(scrollToOverAllHealth);
		elementClick(linkOverAllHealth);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(scrollToOverAllHealth);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}
	
	public void clickNutrientsYourDiet() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(nutrientsYourDiet);
	}
	
	public void clickBoostYourEnergy() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(boostYourEnergy);
	}
	
	public void clickHealtheirLife() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(healtheirLife);
	}
	
	public void clickBrainHealth() throws Exception {
		scrollDownUsingElement(scrollToArticles);
		elementClick(brainHealth);
	}
	
}
