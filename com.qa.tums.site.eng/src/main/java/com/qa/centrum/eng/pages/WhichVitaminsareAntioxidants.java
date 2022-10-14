package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class WhichVitaminsareAntioxidants extends BaseClass {
	
	public WhichVitaminsareAntioxidants() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='diet']")
	WebElement Diet;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement btnShowReference;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement btnHideReference;
    
    @FindBy(xpath = "//strong[text()='Complexion Protection']")
	WebElement ComplexionProtection;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDINeedDuringPregnancy;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	WebElement ShoreUpYourDefences;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
	WebElement study;
	
	
	
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
	public void clickDiet() throws Exception {
		moveToElement(Diet);
		clickElementUsingJavaScript(Diet);
	}
	
	public void clickWhatNutrientsDINeedDuringPregnancy() throws Exception {
		moveToElement(WhatNutrientsDINeedDuringPregnancy);
		clickElementUsingJavaScript(WhatNutrientsDINeedDuringPregnancy);
	}
	public void clickComplexionProtection() throws Exception {
		moveToElement(ComplexionProtection);
		clickElementUsingJavaScript(ComplexionProtection);
	}
	public void clickShoreUpYourDefences() throws Exception {
		moveToElement(ShoreUpYourDefences);
		clickElementUsingJavaScript(ShoreUpYourDefences);
	}
	public void clickStudy() throws Exception {
		moveToElement(study);
		clickElementUsingJavaScript(study);
	}
}
