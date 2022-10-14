package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class howSpplementsWork extends BaseClass{
	public howSpplementsWork() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Learn ']")
	WebElement LearnLink;
	
	@FindBy(xpath = "//a[text()='Food and Nutrition']")
	WebElement foodNutrition;
	
	@FindBy(xpath = "(//strong[text()='Read More'])[2]")
	WebElement readMore2;
	
	@FindBy(xpath = "(//strong[text()='Read More'])[1]")
	WebElement readMore1;
	
	@FindBy(xpath = "//strong[text()='How Do Vitamins Work?']")
	WebElement HowDoVitaminsWork;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
	WebElement Study;
	
	@FindBy(xpath = "//strong[text()='Gummy Vitamins for Adults: What You Need to Know']")
	WebElement GummyVitaminsforAdults;
	
	@FindBy(xpath = "//strong[text()='Debunking Vitamin Myths']")
	WebElement DebunkingVitaminMyths;
	
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
	public void mouseHoverOnLearnLink() throws Exception {
		moveToElement(LearnLink);
		
	}
	
	public void clickNutrientsAndRoutine() throws Exception {
		moveToElement(foodNutrition);
		elementClick(foodNutrition);
	}
	
	public void clickReadMore1() throws Exception {
		moveToElement(readMore1);
		clickElementUsingJavaScript(readMore1);
	}
	
	public void clickReadMore2() throws Exception {
		moveToElement(readMore2);
		clickElementUsingJavaScript(readMore2);
	}
	public void clickHowDoVitaminsWork() throws Exception {
		moveToElement(HowDoVitaminsWork);
		clickElementUsingJavaScript(HowDoVitaminsWork);
	}
	public void clickStudy() throws Exception {
		moveToElement(Study);
		clickElementUsingJavaScript(Study);
	}
	public void clickGummyVitaminsforAdults() throws Exception {
		moveToElement(GummyVitaminsforAdults);
		clickElementUsingJavaScript(GummyVitaminsforAdults);
	}
	public void clickDebunkingVitaminMyths() throws Exception {
		moveToElement(DebunkingVitaminMyths);
		clickElementUsingJavaScript(DebunkingVitaminMyths);
	}
	public void clickShowReference() throws Exception {
        elementClick(btnShowReference);
        Assert.assertTrue(elementIsDisplayed(btnHideReference));
        elementClick(btnHideReference);
        System.out.println("Show Refrence and Hide reference ---->Clicked and Verified Successfully<----");
    }

}
