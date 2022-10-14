package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class magnesium extends BaseClass{
	public magnesium() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;

	@FindBy(xpath = "//div[@class='selected-item-js']")
	WebElement ironDropdown;

	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	WebElement FoodAndNutrition;

	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']")
	WebElement FeaturedProductsClosed;

	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	WebElement FeaturedProductsOpened;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-seniors f-tablets filter-item product-blue product-card first odd last']")
	WebElement silverMen;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-general-wellness f-heart f-metabolism f-non-binary f-seniors f-tablets filter-item product-card product-green box_1938611159_copy_']")
	WebElement minisAdult50;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-non-binary f-seniors f-tablets filter-item product-card product-green first odd last']")
	WebElement silverAdult;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-muscle-function f-seniors f-tablets product-blue product-card first odd last']")
	WebElement minisMen50Plus;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[1]")
	WebElement BuyNow1;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[2]")
	WebElement BuyNow2;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[3]")
	WebElement BuyNow3;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[4]")
	WebElement BuyNow4;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[1]")
	WebElement Compare1;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[2]")
	WebElement Compare2;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[3]")
	WebElement Compare3;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[4]")
	WebElement Compare4;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-purple border-card border-rounded-card first odd last col-xs-12']")
	WebElement BoneHealth;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-red border-card border-rounded-card first odd last col-xs-12']")
	WebElement heartHealth;
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary'])[1]")
	WebElement heartHealthLearnMore;
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary'])[2]")
	WebElement BoneHealthLearnMore;
	
	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	WebElement FourTipsForMoreBalancedDiet;
	
	@FindBy(xpath = "//strong[text()='How to Keep Your Bones Healthy and Strong']")
	WebElement HowToKeepsYourBones;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDINeedDuringPregnancy;
	
	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	WebElement ComplexionProtection;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Maganese;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement VitaminD;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[3]")
	WebElement Calcium;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[4]")
	WebElement Phosphorus;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[1]")
	WebElement Maganese_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[2]")
	WebElement Vitamin_D_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[3]")
	WebElement Calcium_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[4]")
	WebElement Phosphorus_Learn;
	
	
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

	

	public void visiblityFoodAndNutrition() throws Exception {
		scrollDownUsingElement(FoodAndNutrition);
		if (elementIsDisplayed(FoodAndNutrition)) {
			System.out.println("Food and Nutrition Tab is Open");
		}
	}

	public void visiblityFeaturedProductOpen() throws Exception {
		scrollDownUsingElement(FeaturedProductsOpened);
		if (elementIsDisplayed(FeaturedProductsOpened)) {
			System.out.println("Food and Nutrition Tab is Open");
		}

	}

	public void ClickFeaturedProductsTab() throws Exception {
		scrollDownUsingElement(FeaturedProductsClosed);
		if (elementIsDisplayed(FeaturedProductsClosed)) {
			clickElementUsingJavaScript(FeaturedProductsClosed);
		}
		visiblityFeaturedProductOpen();

	}
	public void clickSilverMen() throws Exception {
		scrollDownUsingElement(silverMen);
		clickElementUsingJavaScript(silverMen);
	}
	public void clickMinisAdult50Plus() throws Exception {
		scrollDownUsingElement(minisAdult50);
		clickElementUsingJavaScript(minisAdult50);
	}
	public void clickSilverAdults() throws Exception {
		scrollDownUsingElement(silverAdult);
		clickElementUsingJavaScript(silverAdult);
	}
	public void clickminisMen50Plus() throws Exception {
		scrollDownUsingElement(minisMen50Plus);
		clickElementUsingJavaScript(minisMen50Plus);
	}
	public void clickBuyNow1() throws Exception {
		scrollDownUsingElement(BuyNow1);
		clickElementUsingJavaScript(BuyNow1);
	}
	public void clickBuyNow2() throws Exception {
		scrollDownUsingElement(BuyNow2);
		clickElementUsingJavaScript(BuyNow2);
	}
	public void clickBuyNow3() throws Exception {
		scrollDownUsingElement(BuyNow3);
		clickElementUsingJavaScript(BuyNow3);
	}
	public void clickBuyNow4() throws Exception {
		scrollDownUsingElement(BuyNow4);
		clickElementUsingJavaScript(BuyNow4);
	}
	public void clickCompare1() throws Exception {
		scrollDownUsingElement(Compare1);
		clickElementUsingJavaScript(Compare1);
	}
	public void clickCompare2() throws Exception {
		scrollDownUsingElement(Compare2);
		clickElementUsingJavaScript(Compare2);
	}
	public void clickCompare3() throws Exception {
		scrollDownUsingElement(Compare3);
		clickElementUsingJavaScript(Compare3);
	}
	public void clickCompare4() throws Exception {
		scrollDownUsingElement(Compare4);
		clickElementUsingJavaScript(Compare4);
	}
	public void clickHeartHealth() throws Exception {
		scrollDownUsingElement(heartHealth);
		clickElementUsingJavaScript(heartHealth);
	}
	public void clickHeartHealthLeranMore() throws Exception {
		scrollDownUsingElement(heartHealthLearnMore);
		clickElementUsingJavaScript(heartHealthLearnMore);
	}
	public void clickBoneHealth() throws Exception {
		scrollDownUsingElement(BoneHealth);
		clickElementUsingJavaScript(BoneHealth);
	}
	public void clickBoneHealthLeranMore() throws Exception {
		scrollDownUsingElement(BoneHealthLearnMore);
		clickElementUsingJavaScript(BoneHealthLearnMore);
	}
	public void clickFourTipsForMoreBalancedDiet() throws Exception {
		moveToElement(FourTipsForMoreBalancedDiet);
		clickElementUsingJavaScript(FourTipsForMoreBalancedDiet);
	}
	public void clickHowToKeepsYourBones() throws Exception {
		moveToElement(HowToKeepsYourBones);
		clickElementUsingJavaScript(HowToKeepsYourBones);
	}
	public void clickWhatNutrientsDINeedDuringPregnancy() throws Exception {
		moveToElement(WhatNutrientsDINeedDuringPregnancy);
		clickElementUsingJavaScript(WhatNutrientsDINeedDuringPregnancy);
	}
	public void clickComplexionProtection() throws Exception {
		moveToElement(ComplexionProtection);
		clickElementUsingJavaScript(ComplexionProtection);
	}
	public void clickPhosphorus() throws Exception {
		scrollDownUsingElement(Phosphorus);
		clickElementUsingJavaScript(Phosphorus);
	}
	public void clickPhosphorusLearn() throws Exception {
		scrollDownUsingElement(Phosphorus_Learn);
		clickElementUsingJavaScript(Phosphorus_Learn);
	}
	public void clickVitaminD() throws Exception {
		scrollDownUsingElement(VitaminD);
		clickElementUsingJavaScript(VitaminD);
	}
	public void clickVitaminDLearn() throws Exception {
		scrollDownUsingElement(Vitamin_D_Learn);
		clickElementUsingJavaScript(Vitamin_D_Learn);
	}
	public void clickMaganese() throws Exception {
		scrollDownUsingElement(Maganese);
		clickElementUsingJavaScript(Maganese);
	}
	public void clickMaganeseLearn() throws Exception {
		scrollDownUsingElement(Maganese_Learn);
		clickElementUsingJavaScript(Maganese_Learn);
	}
	public void clickCalcium() throws Exception {
		scrollDownUsingElement(Calcium);
		clickElementUsingJavaScript(Calcium);
	}
	public void clickCalciumLearn() throws Exception {
		scrollDownUsingElement(Calcium_Learn);
		clickElementUsingJavaScript(Calcium_Learn);
	}
}
