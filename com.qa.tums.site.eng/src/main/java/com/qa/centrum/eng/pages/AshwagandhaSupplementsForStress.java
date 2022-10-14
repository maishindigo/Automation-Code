package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AshwagandhaSupplementsForStress extends BaseClass {
	public AshwagandhaSupplementsForStress() {
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

    @FindBy(xpath = "//a[text()='positive effects on energy']")
	WebElement positiveEffectsOnEnergy;
    
    @FindBy(xpath = "//a[text()='Centrum Calm and Reset Gummies']")
	WebElement CentrumCalmandResetGummies;
    
    @FindBy(xpath = "//a[text()='meditation']")
	WebElement meditation;
    
   
    
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
	public void clickpositiveEffectsOnEnergy() throws Exception {
		moveToElement(positiveEffectsOnEnergy);
		clickElementUsingJavaScript(positiveEffectsOnEnergy);
	}
	public void clickCentrumCalmandResetGummies() throws Exception {
		moveToElement(CentrumCalmandResetGummies);
		clickElementUsingJavaScript(CentrumCalmandResetGummies);
	}
	public void clickmeditation() throws Exception {
		moveToElement(meditation);
		clickElementUsingJavaScript(meditation);
	}
}
