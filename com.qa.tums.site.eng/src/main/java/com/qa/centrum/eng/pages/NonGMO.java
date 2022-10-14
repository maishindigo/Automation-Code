package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NonGMO extends BaseClass {
	public NonGMO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
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
	public void clickShowReference() throws Exception {
//      scrollDownUsingElement();
      elementClick(btnShowReference);
      Assert.assertTrue(elementIsDisplayed(btnHideReference));
      elementClick(btnHideReference);
  }

}
