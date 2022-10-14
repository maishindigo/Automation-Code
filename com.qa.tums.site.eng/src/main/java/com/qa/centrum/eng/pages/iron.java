package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class iron extends BaseClass {
	public iron() {
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

	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-immunity f-metabolism f-non-binary f-tablets f-young-adults filter-item product-card product-green first odd last']")
	WebElement AdultCard;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[1]")
	WebElement BuyNowAdult;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[1]")
	WebElement CompareAdult;

	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-female f-general-wellness f-hair-skin-nails f-immunity f-metabolism f-tablets f-young-adults filter-item last-down product-card product-purple box_1938611159_copy_']")
	WebElement CentrumWomenCard;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[2]")
	WebElement BuyNowCentrumWomen;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[2]")
	WebElement CompareCentrumWomen;

	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-energy f-non-binary f-seniors f-tablets f-young-adults filter-item product-card product-orange box_1938611159_copy_']")
	WebElement EnergyCard;

	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple box_1938611159_copy_']")
	WebElement SilverWomen;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[3]")
	WebElement BuyNowEnergy;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[3]")
	WebElement CompareEnergy;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[3]")
	WebElement BuyNowSilverWomen;

	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[4]")
	WebElement CompareSilverWomen;

	@FindBy(xpath = "@FindBy(xpath = \"//li[@class='tabs-nav-item even last is-active']\")\n"
			+ "	WebElement FeaturedProductsOpened;")
	WebElement Pregnancy;

	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-yellow border-card border-rounded-card first odd last col-xs-12']")
	WebElement Energy;

	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-green border-card border-rounded-card first odd last col-xs-12']")
	WebElement ImmuneHealth;

	@FindBy(xpath = "(//a[text()='Learn More'])[1]")
	WebElement pregnancyLearnMore;

	@FindBy(xpath = "(//a[text()='Learn More'])[2]")
	WebElement energyLearnMore;

	@FindBy(xpath = "(//a[text()='Learn More'])[3]")
	WebElement immuneHealthLearnMore;

	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitamins;

	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDoINeedDuringPregnancy;

	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	WebElement ComplexionProtection;

	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	WebElement SixWaysToBoostYourEnergy;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-between-d justify-space-between p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Vitamin_B12;

	@FindBy(xpath = "(//a[text()='Learn more'])[1]")
	WebElement Vitamin_B12_Learn;

	@FindBy(xpath = "//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-between-d justify-space-between p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12']")
	WebElement Vitamin_B6;

	@FindBy(xpath = "(//a[text()='Learn more'])[2]")
	WebElement Vitamin_B6_Learn;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement Copper;

	@FindBy(xpath = "(//a[text()='Learn more'])[3]")
	WebElement Copper_Learn;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[3]")
	WebElement Folic_acid;

	@FindBy(xpath = "(//a[text()='Learn more'])[4]")
	WebElement Folic_Learn;

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

	public void clickCentrumAdults() throws Exception {
		scrollDownUsingElement(AdultCard);
		clickElementUsingJavaScript(AdultCard);
	}

	public void clickBuyNow1() throws Exception {
		scrollDownUsingElement(BuyNowAdult);
		clickElementUsingJavaScript(BuyNowAdult);
	}

	public void clickCompareAdult() throws Exception {
		scrollDownUsingElement(CompareAdult);
		clickElementUsingJavaScript(CompareAdult);
	}

	public void clickCentrumWomen() throws Exception {
		scrollDownUsingElement(CentrumWomenCard);
		clickElementUsingJavaScript(CentrumWomenCard);
	}

	public void clickBuyNow2() throws Exception {
		scrollDownUsingElement(BuyNowCentrumWomen);
		clickElementUsingJavaScript(BuyNowCentrumWomen);
	}

	public void clickCompareCentrumWomen() throws Exception {
		scrollDownUsingElement(CompareCentrumWomen);
		clickElementUsingJavaScript(CompareCentrumWomen);
	}

	public void clickEnergy() throws Exception {
		scrollDownUsingElement(EnergyCard);
		clickElementUsingJavaScript(EnergyCard);
	}

	public void clickBuyNow3() throws Exception {
		scrollDownUsingElement(BuyNowEnergy);
		clickElementUsingJavaScript(BuyNowEnergy);
	}

	public void clickCompareEnergy() throws Exception {
		scrollDownUsingElement(CompareEnergy);
		clickElementUsingJavaScript(CompareEnergy);
	}
	public void clickSilverWomen() throws Exception {
		scrollDownUsingElement(SilverWomen);
		clickElementUsingJavaScript(SilverWomen);
	}

	public void clickBuyNow4() throws Exception {
		scrollDownUsingElement(BuyNowSilverWomen);
		clickElementUsingJavaScript(BuyNowSilverWomen);
	}

	public void clickCompareSilverWomen() throws Exception {
		scrollDownUsingElement(CompareSilverWomen);
		clickElementUsingJavaScript(CompareSilverWomen);
	}
	public void clickonFolic_Acid() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Folic_acid);
		elementClick(Folic_acid);
	}
	public void clickonFolic_Acid_Learn() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Folic_Learn);
		clickElementUsingJavaScript(Folic_Learn);
	}
	
	public void clickonVitamin_B6() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Vitamin_B6);
		elementClick(Vitamin_B6);
	}
	public void clickonVitamin_B6_Learn() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Vitamin_B6_Learn);
		clickElementUsingJavaScript(Vitamin_B6_Learn);
	}
	public void clickonVitamin_B12() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Vitamin_B12);
		elementClick(Vitamin_B12);
	}
	public void clickonVitamin_B12_Learn() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Vitamin_B12_Learn);
		clickElementUsingJavaScript(Vitamin_B12_Learn);
	}
	
	
	public void clickonCopper() throws Exception {
		
		scrollDownUsingElement(Copper);
		elementClick(Copper);
	}
	public void clickonCopper_Learn() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Copper_Learn);
		clickElementUsingJavaScript(Copper_Learn);
	}
	public void clickonPregnancyCard() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Pregnancy);
		clickElementUsingJavaScript(Pregnancy);
	}
	public void clickonPregnancyLearnMore() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(pregnancyLearnMore);
		clickElementUsingJavaScript(pregnancyLearnMore);
	}
	public void clickonEnergyCard() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(Energy);
		clickElementUsingJavaScript(Energy);
	}
	public void clickonEnergyLearnMore() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(energyLearnMore);
		clickElementUsingJavaScript(energyLearnMore);
	}
	public void clickonImmuneHealthCard() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(ImmuneHealth);
		clickElementUsingJavaScript(ImmuneHealth);
	}
	public void clickImmuneHealthLearnMore() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(immuneHealthLearnMore);
		clickElementUsingJavaScript(energyLearnMore);
	}
	public void clickHowtoTakeVitamins() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(HowtoTakeVitamins);
		clickElementUsingJavaScript(HowtoTakeVitamins);
	}
	public void clickWhatNutrientsDoINeedDuringPregnancy() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(WhatNutrientsDoINeedDuringPregnancy);
		clickElementUsingJavaScript(WhatNutrientsDoINeedDuringPregnancy);
	}
	public void clickSixWaysToBoostYourEnergy() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(SixWaysToBoostYourEnergy);
		clickElementUsingJavaScript(SixWaysToBoostYourEnergy);
	}
	public void clickComplexionProtection() throws Exception {
		//scrollPageInUpAndDown();
		scrollDownUsingElement(ComplexionProtection);
		clickElementUsingJavaScript(ComplexionProtection);
	}

}
