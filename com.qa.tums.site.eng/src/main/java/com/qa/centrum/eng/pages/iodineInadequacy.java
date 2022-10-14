package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class iodineInadequacy extends BaseClass {
	public iodineInadequacy() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement btnShowReference;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement btnHideReference;
    
    @FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	WebElement TheABCsoVitaminD;
    
    @FindBy(xpath = "//strong[text()='How Can Vitamin E Benefit My Health?']")
	WebElement HowCanVitaminEBenefitMyHealth;
    
    @FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitamins;
    
    @FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	WebElement EstablishingaSelfCareRoutine;
    
    @FindBy(xpath = "//a[text()='Choose Your Centrum']")
   	WebElement chooseCentrum;
    
    @FindBy(xpath = "//img[@title='Blue and white quiz background ']")
   	WebElement takeThis;
    
    
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
	public void clickTheABCsoVitaminD() throws Exception {
		moveToElement(TheABCsoVitaminD);
		clickElementUsingJavaScript(TheABCsoVitaminD);
	}
	public void clickHowCanVitaminEBenefitMyHealth() throws Exception {
		moveToElement(HowCanVitaminEBenefitMyHealth);
		clickElementUsingJavaScript(HowCanVitaminEBenefitMyHealth);
	}
	public void clickHowtoTakeVitamins() throws Exception {
		moveToElement(HowtoTakeVitamins);
		clickElementUsingJavaScript(HowtoTakeVitamins);
	}
	public void clickEstablishingaSelfCareRoutine() throws Exception {
		moveToElement(EstablishingaSelfCareRoutine);
		clickElementUsingJavaScript(EstablishingaSelfCareRoutine);
	}
	public void clickchooseCentrum() throws Exception {
		moveToElement(chooseCentrum);
		clickElementUsingJavaScript(chooseCentrum);
	}
	public void clickTakeThis() throws Exception {
		moveToElement(takeThis);
		clickElementUsingJavaScript(takeThis);
	}

}
