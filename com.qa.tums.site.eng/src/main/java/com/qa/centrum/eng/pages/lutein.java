package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class lutein extends BaseClass {
	public lutein() {
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
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-non-binary f-seniors f-tablets filter-item product-card product-green first odd last']")
	WebElement silverAdult;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-seniors f-tablets filter-item product-blue product-card first odd last']")
	WebElement silverMen;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple box_1938611159_copy_']")
	WebElement SilverWomen;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-general-wellness f-heart f-metabolism f-non-binary f-seniors f-tablets filter-item product-card product-green box_1938611159_copy_']")
	WebElement minisAdult50;
	
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
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-teal border-card border-rounded-card first odd last col-xs-12']")
	WebElement eyeHealth;
	
	
	@FindBy(xpath = "//a[@class='btn btn-secondary']")
	WebElement eyeHealthLearnMore;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	WebElement FiveVitaminsMineralsforHealthyEyes;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitamins;
	
	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	WebElement FourTipsForMoreBalancedDiet;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	WebElement tenSimpleWaystoLiveHealthierLife;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Vitamin_A;

	@FindBy(xpath = "(//a[text()='Learn more'])[1]")
	WebElement Vitamin_A_Learn;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement BetaCarotene;

	@FindBy(xpath = "(//a[text()='Learn more'])[2]")
	WebElement BetaCaroteneLearn;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[3]")
	WebElement Lycopene;;

	@FindBy(xpath = "(//a[text()='Learn more'])[3]")
	WebElement Lycopene_Learn;

	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[4]")
	WebElement Vitamin_C;

	@FindBy(xpath = "(//a[text()='Learn more'])[4]")
	WebElement Vitamin_C_Learn;
	

	
	
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
	public void clickSilverWomen() throws Exception {
		scrollDownUsingElement(SilverWomen);
		clickElementUsingJavaScript(SilverWomen);
	}
	public void clickSilverAdults() throws Exception {
		scrollDownUsingElement(silverAdult);
		clickElementUsingJavaScript(silverAdult);
	}
	public void clickSilverMen() throws Exception {
		scrollDownUsingElement(silverMen);
		clickElementUsingJavaScript(silverMen);
	}
	public void clickMinisAdult50Plus() throws Exception {
		scrollDownUsingElement(minisAdult50);
		clickElementUsingJavaScript(minisAdult50);
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
	public void clickEyeHealth() throws Exception {
		scrollDownUsingElement(eyeHealth);
		clickElementUsingJavaScript(eyeHealth);
	}
	public void clickEyeHealthLeranMore() throws Exception {
		scrollDownUsingElement(eyeHealthLearnMore);
		clickElementUsingJavaScript(eyeHealthLearnMore);
	}
	public void clickFiveVitaminsMineralsforHealthyEyes() throws Exception {
		moveToElement(FiveVitaminsMineralsforHealthyEyes);
		clickElementUsingJavaScript(FiveVitaminsMineralsforHealthyEyes);
	}
	public void clickHowtoTakeVitamins() throws Exception {
		moveToElement(HowtoTakeVitamins);
		clickElementUsingJavaScript(HowtoTakeVitamins);
	}
	public void clickFourTipsForMoreBalancedDiet() throws Exception {
		moveToElement(FourTipsForMoreBalancedDiet);
		clickElementUsingJavaScript(FourTipsForMoreBalancedDiet);
	}
	public void clicktenSimpleWaystoLiveHealthierLife() throws Exception {
		moveToElement(tenSimpleWaystoLiveHealthierLife);
		clickElementUsingJavaScript(tenSimpleWaystoLiveHealthierLife);
	}
	public void clickVitamin_A() throws Exception {
		scrollDownUsingElement(Vitamin_A);
		clickElementUsingJavaScript(Vitamin_A);
	}
	public void clickVitamin_A_Learn() throws Exception {
		scrollDownUsingElement(Vitamin_A_Learn);
		clickElementUsingJavaScript(Vitamin_A_Learn);
	}
	public void clickBetaCarotene() throws Exception {
		scrollDownUsingElement(BetaCarotene);
		clickElementUsingJavaScript(BetaCarotene);
	}
	public void clickBetaCaroteneLearn() throws Exception {
		scrollDownUsingElement(BetaCaroteneLearn);
		clickElementUsingJavaScript(BetaCaroteneLearn);
	}
	public void clickLycopene() throws Exception {
		scrollDownUsingElement(Lycopene);
		clickElementUsingJavaScript(Lycopene);
	}
	public void clickLycopene_Learn() throws Exception {
		scrollDownUsingElement(Lycopene_Learn);
		clickElementUsingJavaScript(Lycopene_Learn);
	}
	public void clickVitamin_C() throws Exception {
		scrollDownUsingElement(Vitamin_C);
		clickElementUsingJavaScript(Vitamin_C);
	}
	public void clickVitamin_C_Learn() throws Exception {
		scrollDownUsingElement(Vitamin_C_Learn);
		clickElementUsingJavaScript(Vitamin_C_Learn);
	}
	
}
