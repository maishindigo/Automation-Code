package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class wellnessBenefits extends BaseClass{
	
	public wellnessBenefits() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Learn ']")
	WebElement LearnLink;
	
	@FindBy(xpath = "//a[text()='Wellness Benefits']")
	WebElement wellnessBenefit;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-yellow border-card border-rounded-card first odd last col-xs-12']")
	WebElement energyCard;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-purple border-card border-rounded-card first odd last col-xs-12']")
	WebElement boneHealthCard;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-green border-card border-rounded-card first odd last col-xs-12']")
	WebElement immuneHealthCard;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-red border-card border-rounded-card first odd last col-xs-12']")
	WebElement heartHealthCard;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-blue border-card border-rounded-card first odd last col-xs-12']")
	WebElement digestiveHealth;
	
	@FindBy(xpath = "box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-pink border-card border-rounded-card first odd last col-xs-12")
	WebElement hairSkinNails;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/energy/' and @class='btn btn-secondary']")
	WebElement learnMoreEnergy;
//	@FindBy(xpath = "(//a[text()='Learn More'])[7]")
//	WebElement learnMoreEnergy;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/bone-health/' and @class='btn btn-secondary']")
	WebElement learnMoreBoneHealth;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/immune-health/' and @class='btn btn-secondary']")
	WebElement learnMoreImmuneHealth;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/heart-health/' and @class='btn btn-secondary']")
	WebElement learnMoreHeartHealth;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/digestive-health/' and @class='btn btn-secondary']")
	WebElement learnMoreDigestive;
	
	@FindBy(xpath = "//a[@href='/learn/wellness-benefits/hair-skin-nails/' and @class='btn btn-secondary']")
	WebElement learnMoreHairSkin;
	
	@FindBy(xpath = "//div[@id='543340719']")
	WebElement whyVitaminsAndSupli;
	
	@FindBy(xpath = "(//a[@aria-label='Why are Vitamins Important?'])[2]")
	WebElement learnMore;
	
	
	
	
	
	
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
	public void mouseHoverOnLearnLink() throws Exception {
		moveToElement(LearnLink);
		
	}
	
	public void clickWellnessBenefits() throws Exception {
		moveToElement(wellnessBenefit);
		elementClick(wellnessBenefit);
	}
	public void clickEnergyCard() throws Exception {
		scrollDownUsingElement(energyCard);
		elementClick(energyCard);
	}
	public void clickBoneHealthCard() throws Exception {
		scrollDownUsingElement(boneHealthCard);
		elementClick(boneHealthCard);
	}
	public void clickImmuneHealthCard() throws Exception {
		scrollDownUsingElement(immuneHealthCard);
		elementClick(immuneHealthCard);
	}
	public void clickHeartHealthCard() throws Exception {
		scrollDownUsingElement(heartHealthCard);
		elementClick(heartHealthCard);
	}
	public void clickDigestiveHealthCard() throws Exception {
		scrollDownUsingElement(digestiveHealth);
		elementClick(digestiveHealth);
	}
	public void clickHairSkinNailsCard() throws Exception {
		scrollDownUsingElement(hairSkinNails);
		elementClick(hairSkinNails);
	}
	public void clickEnergyLearnMore() throws Exception {
		scrollDownUsingElement(learnMoreEnergy);
		implicitWait(10);
		clickElementUsingJavaScript(learnMoreEnergy);
	}
	
	
	public void clickBoneLearnMore() throws Exception {
		scrollDownUsingElement(learnMoreBoneHealth);
		clickElementUsingJavaScript(learnMoreBoneHealth);
	}
	public void clickImmuneLearnMore() throws Exception {
		scrollDownUsingElement(learnMoreImmuneHealth);
		clickElementUsingJavaScript(learnMoreImmuneHealth);
	}
	public void clickHeartLearnMore() throws Exception {
		scrollDownUsingElement(learnMoreHeartHealth);
		clickElementUsingJavaScript(learnMoreHeartHealth);
	}
	public void clickDigestiveLearnmore() throws Exception {
		scrollDownUsingElement(learnMoreDigestive);
		clickElementUsingJavaScript(learnMoreDigestive);
	}
	public void clickHairLearnMore() throws Exception {
		scrollDownUsingElement(learnMoreHairSkin);
		clickElementUsingJavaScript(learnMoreHairSkin);
	}
	public void clickLearnMore() throws Exception {
		scrollDownUsingElement(learnMore);
		clickElementUsingJavaScript(learnMore);
	}
	public void clickWhyVitaminsAndSupli() throws Exception {
		scrollDownUsingElement(whyVitaminsAndSupli);
		clickElementUsingJavaScript(whyVitaminsAndSupli);
	}

}
