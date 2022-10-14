package com.qa.centrum.eng.pages;

import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumCouponsPage extends BaseClass{

	public CentrumCouponsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "(//input[@name='data.ds.centrum.coupons.firstName'])[2]")
	private static WebElement txtFirstName;

	@FindBy(xpath = "(//input[@name='profile.email'])[4]")
	private static WebElement txtEmail;

	@FindBy(xpath = "(//input[@name='data.ds.centrum.coupons.dateOfBirth'])[2]")
	private static WebElement txtDOB;

	@FindBy(xpath = "(//input[@class='gigya-input-submit'])[5]")
	private static WebElement btnSubmit;

	@FindBy(xpath = "//p[text()='Thanks for Signing Up!']")
	private static WebElement txtSigningUp;
	
	@FindBy(xpath = "//input[@class='gigya-button']")
	private static WebElement btnOk;
	
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement recommendedArticleOne;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement recommendedArticleTwo;
	
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

	public void txtFirstName() throws Exception{

		if (elementVisible(txtFirstName)) {
			elementSendKeys(txtFirstName, "ABC");
		}
	}

	public void txtEmail() throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtEmail)) {
			elementSendKeys(txtEmail, "abc00@gmail.com");
		}
	}

	public void txtDOB() throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtDOB)) {
			elementSendKeys(txtDOB, "10102022");
		}
	}

	
	public void btnSubmit() throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(btnSubmit)) {
			clickElementUsingJavaScript(btnSubmit);
		}
		if (txtSigningUp.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(txtSigningUp));
			elementToBeClickable(btnOk);
			clickElementUsingJavaScript(btnOk);
		}
	}
	
	public void clickRecommendedArticleOne() throws Exception{
		scrollDownUsingElement(recommendedArticleOne);
		clickElementUsingJavaScript(recommendedArticleOne);
	}
	
	public void clickRecommendedArticleTwo() throws Exception{
		scrollDownUsingElement(recommendedArticleTwo);
		clickElementUsingJavaScript(recommendedArticleTwo);
	}
	
	
}
