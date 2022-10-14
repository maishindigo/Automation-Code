package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BenefitsofFolicAcidforWomen extends BaseClass{
	public BenefitsofFolicAcidforWomen() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='women who are pregnant']")
	WebElement womenWhoArePregnant;
	
	@FindBy(xpath = "//a[text()='multivitamin']")
	WebElement multivitamin;
	
	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	WebElement ComplexionProtection;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDINeedDuringPregnancy;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Omega-3 Supplements']")
	WebElement TheBenefitsofOmegaSupplements;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	WebElement EstablishingaSelfCareRoutine;
	
	@FindBy(xpath = "//a[text()='Choose Your Centrum']")
	WebElement chooseYourCentrum;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement btnShowReference;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement btnHideReference;
	
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
	public void clickWomenWhoArePregnant() throws Exception {
		scrollDownUsingElement(womenWhoArePregnant);
		clickElementUsingJavaScript(womenWhoArePregnant);
	}
	public void clickMultivitamin() throws Exception {
		scrollDownUsingElement(multivitamin);
		clickElementUsingJavaScript(multivitamin);
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
	public void clickShowReference() throws Exception {
//      scrollDownUsingElement();
      elementClick(btnShowReference);
      Assert.assertTrue(elementIsDisplayed(btnHideReference));
      elementClick(btnHideReference);
  }
}
