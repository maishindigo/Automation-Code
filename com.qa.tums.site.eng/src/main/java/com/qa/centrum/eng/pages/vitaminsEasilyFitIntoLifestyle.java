package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class vitaminsEasilyFitIntoLifestyle extends BaseClass{
	public vitaminsEasilyFitIntoLifestyle() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
    
    @FindBy(xpath = "//a[text()='take-back programs']")
	WebElement takeBackPrograms;
    
    @FindBy(xpath = "//a[text()='eat balanced meals every day']")
	WebElement eatBalancedMealsEveryDay;
    
    @FindBy(xpath = "//a[text()='take vitamins as a supplement']")
	WebElement takeVitaminsasaSupplement;
    
    @FindBy(xpath = "//a[text()='Centrum ingredients']")
	WebElement CentrumIngredients;
    
    @FindBy(xpath = "//a[text()='Learn Center']")
	WebElement LearnCenter;
    
    @FindBy(xpath = "//a[text()='Centrum products']")
	WebElement CentrumProducts;
    
    @FindBy(xpath = "//strong[text()='How Can Vitamin E Benefit My Health?']")
   	WebElement HowCanVitaminEBenefitMyHealth;
    
    @FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
   	WebElement HowToTake;
    
    @FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
   	WebElement EstablishingaSelfCareRoutine;
    
    @FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
   	WebElement fiveHealthyHomemadeLunchIdeasforAdults;
    
   
    
    
	
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
   	public void clickTakeBackPrograms() throws Exception {
   		moveToElement(takeBackPrograms);
   		clickElementUsingJavaScript(takeBackPrograms);
   	}
   	public void clickeatBalancedMealsEveryDay() throws Exception {
   		moveToElement(eatBalancedMealsEveryDay);
   		clickElementUsingJavaScript(eatBalancedMealsEveryDay);
   	}
   	public void clicktakeVitaminsasaSupplement() throws Exception {
   		moveToElement(takeVitaminsasaSupplement);
   		clickElementUsingJavaScript(takeVitaminsasaSupplement);
   	}
   	public void clickCentrumIngredients() throws Exception {
   		moveToElement(CentrumIngredients);
   		clickElementUsingJavaScript(CentrumIngredients);
   	}
   	public void clickHowCanVitaminEBenefitMyHealth() throws Exception {
   		moveToElement(HowCanVitaminEBenefitMyHealth);
   		clickElementUsingJavaScript(HowCanVitaminEBenefitMyHealth);
   	}
   	public void clickHowToTake() throws Exception {
   		moveToElement(HowToTake);
   		clickElementUsingJavaScript(HowToTake);
   	}
   	public void clickEstablishingaSelfCareRoutine() throws Exception {
   		moveToElement(EstablishingaSelfCareRoutine);
   		clickElementUsingJavaScript(EstablishingaSelfCareRoutine);
   	}
   	public void clickfiveHealthyHomemadeLunchIdeasforAdults() throws Exception {
   		moveToElement(fiveHealthyHomemadeLunchIdeasforAdults);
   		clickElementUsingJavaScript(fiveHealthyHomemadeLunchIdeasforAdults);
   	}

}
