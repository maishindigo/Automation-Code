package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class Vitamin_B12 extends BaseClass{
	public Vitamin_B12() {
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
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-muscle-function f-seniors f-tablets product-blue product-card first odd last']")
	WebElement minisMen50Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple first odd last']")
	WebElement minisWomen50Plus;
	
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
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white rounded flex justify-center-d justify-center p-d-2 p-m-2 anchor-box benefit-card border-bottom-gradient-yellow border-card border-rounded-card first odd last col-xs-12']")
	WebElement Energy;
	
	@FindBy(xpath = "//a[@class='btn btn-secondary']")
	WebElement EnergyLearnMore;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	WebElement TopFiveNutrientsForMen50;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
	WebElement StrategiestoSupportBrainHealth;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	WebElement tenSimpleWaystoLiveHealthierLife;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitamins;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Iron;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement VitaminB6;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[1]")
	WebElement Niacin;
	
	@FindBy(xpath = "(//div[@class='box component section border border-color-gray-500 rounded flex flex-col justify-space-around-d justify-space-around p-d-2 p-m-x-1 p-m-y-2 anchor-box ingredient-card first odd last col-xs-12'])[2]")
	WebElement thiamin;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[1]")
	WebElement Iron_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[2]")
	WebElement Vitamin_B6_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[3]")
	WebElement niacin_Learn;
	
	@FindBy(xpath = "(//a[text()='Learn more'])[4]")
	WebElement thiamin_Learn;
	
	
	
	
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
	public void clickSilverWomen() throws Exception {
		scrollDownUsingElement(SilverWomen);
		clickElementUsingJavaScript(SilverWomen);
	}
	public void clickminisWomen50Plus() throws Exception {
		scrollDownUsingElement(minisWomen50Plus);
		clickElementUsingJavaScript(minisWomen50Plus);
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
	public void clickEnergy() throws Exception {
		scrollDownUsingElement(Energy);
		clickElementUsingJavaScript(Energy);
	}
	public void clickEnergyLeranMore() throws Exception {
		scrollDownUsingElement(EnergyLearnMore);
		clickElementUsingJavaScript(EnergyLearnMore);
	}
	public void clickTopFiveNutrientsForMen50() throws Exception {
		moveToElement(TopFiveNutrientsForMen50);
		clickElementUsingJavaScript(TopFiveNutrientsForMen50);
	}
	
	public void clicktenSimpleWaystoLiveHealthierLife() throws Exception {
		moveToElement(tenSimpleWaystoLiveHealthierLife);
		clickElementUsingJavaScript(tenSimpleWaystoLiveHealthierLife);
	}
	public void clickStrategiestoSupportBrainHealth() throws Exception {
		moveToElement(StrategiestoSupportBrainHealth);
		clickElementUsingJavaScript(StrategiestoSupportBrainHealth);
	}
	public void clickHowtoTakeVitamins() throws Exception {
		moveToElement(HowtoTakeVitamins);
		clickElementUsingJavaScript(HowtoTakeVitamins);
	}
	public void clickIron() throws Exception {
		scrollDownUsingElement(Iron);
		clickElementUsingJavaScript(Iron);
	}
	public void clickIronLearn() throws Exception {
		scrollDownUsingElement(Iron_Learn);
		clickElementUsingJavaScript(Iron_Learn);
	}
	public void clickVitaminB6() throws Exception {
		scrollDownUsingElement(VitaminB6);
		clickElementUsingJavaScript(VitaminB6);
	}
	public void clickVitaminB6Learn() throws Exception {
		scrollDownUsingElement(Vitamin_B6_Learn);
		clickElementUsingJavaScript(Vitamin_B6_Learn);
	}
	public void clickNiacin() throws Exception {
		scrollDownUsingElement(Niacin);
		clickElementUsingJavaScript(Niacin);
	}
	public void clickNiacinLearn() throws Exception {
		scrollDownUsingElement(niacin_Learn);
		clickElementUsingJavaScript(niacin_Learn);
	}
	public void clickThiamin() throws Exception {
		scrollDownUsingElement(thiamin);
		clickElementUsingJavaScript(thiamin);
	}
	public void clickThiaminLearn() throws Exception {
		scrollDownUsingElement(thiamin_Learn);
		clickElementUsingJavaScript(thiamin_Learn);
	}

}
