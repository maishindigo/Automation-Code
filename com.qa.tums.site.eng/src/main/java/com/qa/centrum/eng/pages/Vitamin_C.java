package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class Vitamin_C extends BaseClass {
	public Vitamin_C() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;

	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	WebElement FoodAndNutrition;

	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']")
	WebElement FeaturedProductsClosed;

	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	WebElement FeaturedProductsOpened;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-seniors f-tablets filter-item product-blue product-card first odd last']")
	WebElement silverMen;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple box_1938611159_copy_']")
	WebElement SilverWomen;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-capsule f-digestive-health f-immunity f-non-binary f-seniors f-young-adults filter-item product-card product-orange first odd last']")
	WebElement ImmuneAndDigestiveSupport;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-brain-function f-cellular-protection f-general-wellness f-gummy f-immunity f-non-binary f-physical-stress-relief f-young-adults filter-item product-card product-purple first odd last']")
	WebElement MultiPlusAntioxidants;
	
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
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary'])[1]")
	WebElement BoneHealth_Learn;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-pink border-card border-rounded-card first odd last col-xs-12']")
	WebElement hairSkinNail;
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary'])[2]")
	WebElement HairSkinNail_Learn;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-green border-card border-rounded-card first odd last col-xs-12']")
	WebElement ImmuneHealth;
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary'])[3]")
	WebElement ImmuneHealth_Learn;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	WebElement ShoreUpYourDefenses;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	WebElement FiveVitaminsAndMineralsforHealthyEyes;
	
	@FindBy(xpath = "//strong[text()='The 6 Nutrients Your Diet May Be Missing']")
	WebElement TheSixNutrientsYourDietMayBeMissing;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitaminsandWhenYouShouldTakThem;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Vitamin_A;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement Vitamin_E;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[3]")
	WebElement Vitamin_D;
	
	@FindBy(xpath = "//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-between-d justify-space-between p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12']")
	WebElement Zinc;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[1]")
	WebElement Vitamin_A_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[2]")
	WebElement Vitamin_E_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[3]")
	WebElement Vitamin_D_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[4]")
	WebElement Zinc_Learn;
	
	
	
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
	public void clickImmuneAndDigestiveSupport() throws Exception {
		scrollDownUsingElement(ImmuneAndDigestiveSupport);
		clickElementUsingJavaScript(ImmuneAndDigestiveSupport);
	}
	public void clickSilverMen() throws Exception {
		scrollDownUsingElement(silverMen);
		clickElementUsingJavaScript(silverMen);
	}
	public void clickSilverWomen() throws Exception {
		scrollDownUsingElement(SilverWomen);
		clickElementUsingJavaScript(SilverWomen);
	}
	public void clickMultiPlusAntioxidants() throws Exception {
		scrollDownUsingElement(MultiPlusAntioxidants);
		clickElementUsingJavaScript(MultiPlusAntioxidants);
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
	public void clickBoneHealth() throws Exception {
		scrollDownUsingElement(BoneHealth);
		clickElementUsingJavaScript(BoneHealth);
	}
	public void clickBoneHealthLearn() throws Exception {
		scrollDownUsingElement(BoneHealth_Learn);
		clickElementUsingJavaScript(BoneHealth_Learn);
	}
	public void clickHairSkinNail() throws Exception {
		scrollDownUsingElement(hairSkinNail);
		clickElementUsingJavaScript(hairSkinNail);
	}
	public void clickHairSkinNail_Learn() throws Exception {
		scrollDownUsingElement(HairSkinNail_Learn);
		clickElementUsingJavaScript(HairSkinNail_Learn);
	}
	public void clickImmuneHealth() throws Exception {
		scrollDownUsingElement(ImmuneHealth);
		clickElementUsingJavaScript(ImmuneHealth);
	}
	public void clickImmuneHealthLearn() throws Exception {
		scrollDownUsingElement(ImmuneHealth_Learn);
		clickElementUsingJavaScript(ImmuneHealth_Learn);
	}
	public void clickShoreUpYourDefenses() throws Exception {
		scrollDownUsingElement(ShoreUpYourDefenses);
		clickElementUsingJavaScript(ShoreUpYourDefenses);
	}
	public void clickFiveVitaminsAndMineralsforHealthyEyes() throws Exception {
		scrollDownUsingElement(FiveVitaminsAndMineralsforHealthyEyes);
		clickElementUsingJavaScript(FiveVitaminsAndMineralsforHealthyEyes);
	}
	public void clickTheSixNutrientsYourDietMayBeMissing() throws Exception {
		scrollDownUsingElement(TheSixNutrientsYourDietMayBeMissing);
		clickElementUsingJavaScript(TheSixNutrientsYourDietMayBeMissing);
	}
	public void clickHowtoTakeVitaminsandWhenYouShouldTakThem() throws Exception {
		scrollDownUsingElement(HowtoTakeVitaminsandWhenYouShouldTakThem);
		clickElementUsingJavaScript(HowtoTakeVitaminsandWhenYouShouldTakThem);
	}
	public void clickVitamin_A() throws Exception {
		scrollDownUsingElement(Vitamin_A);
		clickElementUsingJavaScript(Vitamin_A);
	}
	public void clickVitamin_E() throws Exception {
		scrollDownUsingElement(Vitamin_E);
		clickElementUsingJavaScript(Vitamin_E);
	}
	public void clickVitamin_D() throws Exception {
		scrollDownUsingElement(Vitamin_D);
		clickElementUsingJavaScript(Vitamin_D);
	}
	public void clickZinc() throws Exception {
		scrollDownUsingElement(Zinc);
		clickElementUsingJavaScript(Zinc);
	}
	public void clickVitamin_ALearn() throws Exception {
		scrollDownUsingElement(Vitamin_A_Learn);
		clickElementUsingJavaScript(Vitamin_A_Learn);
	}
	public void clickVitamin_ELearn() throws Exception {
		scrollDownUsingElement(Vitamin_E_Learn);
		clickElementUsingJavaScript(Vitamin_E_Learn);
	}
	public void clickVitamin_DLearn() throws Exception {
		scrollDownUsingElement(Vitamin_D_Learn);
		clickElementUsingJavaScript(Vitamin_D_Learn);
	}
	public void clickZincLearn() throws Exception {
		scrollDownUsingElement(Zinc_Learn);
		clickElementUsingJavaScript(Zinc_Learn);
	}
}
