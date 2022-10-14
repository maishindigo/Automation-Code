package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BoneHealthandOsteoporosis extends BaseClass{
	public BoneHealthandOsteoporosis() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Centrum Movement & Strength Capsule']")
	WebElement centrumMovement;
	
	@FindBy(xpath = "//a[text()='Centrum Silver Women']")
	WebElement CentrumSilver;
	
	@FindBy(xpath = "//a[text()='Centrum product']")
	WebElement CentrumProduct;
	
	@FindBy(xpath = "//a[text()='Choose Your Centrum quiz']")
	WebElement CentrumQuiz;
	
	@FindBy(xpath = "//a[text()='Centrum Movement & Strength Capsule']")
	WebElement CentrumMovementAndStrength;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement btnShowReference;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement btnHideReference;
    
    @FindBy(xpath = "//strong[text()='Complexion Protection']")
	WebElement ComplexionProtection;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDINeedDuringPregnancy;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Omega-3 Supplements']")
	WebElement TheBenefitsofOmegaSupplements;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	WebElement EstablishingaSelfCareRoutine;
	
	
	public void clickCookieBtn() {
		try {
			elementClick(cookieBtn);
		} catch (NoSuchElementException e) {

		}

	}

	public void clickGigyaForm() {
		try {
			elementClick(gigyaForm);
		} catch (NoSuchElementException e) {

		}
	}
	public void clickShowReference() throws Exception {
//      scrollDownUsingElement();
      elementClick(btnShowReference);
      Assert.assertTrue(elementIsDisplayed(btnHideReference));
      elementClick(btnHideReference);
  }
	public void clickCentrumMovement() throws Exception {
		moveToElement(centrumMovement);
		clickElementUsingJavaScript(centrumMovement);
	}
	public void clickCentrumSilver() throws Exception {
		moveToElement(CentrumSilver);
		clickElementUsingJavaScript(CentrumSilver);
	}
	public void clickCentrumProduct() throws Exception {
		moveToElement(CentrumProduct);
		clickElementUsingJavaScript(CentrumProduct);
	}
	public void clickCentrumQuiz() throws Exception {
		moveToElement(CentrumQuiz);
		clickElementUsingJavaScript(CentrumQuiz);
	}
	public void clickCentrumMovementAndStrength() throws Exception {
		moveToElement(CentrumMovementAndStrength);
		clickElementUsingJavaScript(CentrumMovementAndStrength);
	}
	public void clickWhatNutrientsDINeedDuringPregnancy() throws Exception {
		moveToElement(WhatNutrientsDINeedDuringPregnancy);
		clickElementUsingJavaScript(WhatNutrientsDINeedDuringPregnancy);
	}
	public void clickComplexionProtection() throws Exception {
		moveToElement(ComplexionProtection);
		clickElementUsingJavaScript(ComplexionProtection);
	}
	public void clickTheBenefitsofOmegaSupplements() throws Exception {
		moveToElement(TheBenefitsofOmegaSupplements);
		clickElementUsingJavaScript(TheBenefitsofOmegaSupplements);
	}
	public void clickEstablishingaSelfCareRoutine() throws Exception {
		moveToElement(EstablishingaSelfCareRoutine);
		clickElementUsingJavaScript(EstablishingaSelfCareRoutine);
	}
}


