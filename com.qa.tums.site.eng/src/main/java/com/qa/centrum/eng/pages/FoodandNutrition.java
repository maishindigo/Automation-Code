package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class FoodandNutrition extends BaseClass {
	public FoodandNutrition() {
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
	
	@FindBy(xpath = "//strong[text()='The 6 Nutrients Your Diet May Be Missing']")
	WebElement The6NutrientsYourDietMayBeMissing;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	WebElement ShoreUpYourDefenses;
	
	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	WebElement fourTipsforaMoreBalancedDiet;
	
	@FindBy(xpath = "//strong[text()='Going Vegan? Essential Vitamins & Supplements for Vegans']")
	WebElement GoingVegan;
	
	@FindBy(xpath = "//strong[text()='Getting Vitamins from Food vs. from Supplements']")
	WebElement GettingVitaminsfromFoodvsfromSupplements;
	
	
	
	
	
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
	public void clickThe6NutrientsYourDietMayBeMissing() throws Exception {
		moveToElement(The6NutrientsYourDietMayBeMissing);
		clickElementUsingJavaScript(The6NutrientsYourDietMayBeMissing);
	}
	public void clickShoreUpYourDefenses() throws Exception {
		moveToElement(ShoreUpYourDefenses);
		clickElementUsingJavaScript(ShoreUpYourDefenses);
	}
	public void clickfourTipsforaMoreBalancedDiet() throws Exception {
		moveToElement(fourTipsforaMoreBalancedDiet);
		clickElementUsingJavaScript(fourTipsforaMoreBalancedDiet);
	}
	public void clickGoingVegan() throws Exception {
		moveToElement(GoingVegan);
		clickElementUsingJavaScript(GoingVegan);
	}
	public void clickGettingVitaminsfromFoodvsfromSupplements() throws Exception {
		moveToElement(GettingVitaminsfromFoodvsfromSupplements);
		clickElementUsingJavaScript(GettingVitaminsfromFoodvsfromSupplements);
	}
	
}
