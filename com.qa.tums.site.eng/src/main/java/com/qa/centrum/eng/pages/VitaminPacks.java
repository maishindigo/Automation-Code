package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VitaminPacks extends BaseClass {
	public VitaminPacks() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-capsule f-eye-health f-female f-hair-skin-nails f-heart f-tablets f-young-adults filter-item product-card product-purple first odd last']")
	private static WebElement WellnessPacksWomen20Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-brain-function f-gummy f-non-binary f-physical-stress-relief f-seniors f-young-adults filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksWomen30Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-gummy f-mental f-non-binary f-seniors f-young-adults filter-item product-card product-teal first odd last']")
	private static WebElement WellnessPacksWomen40Plus;
	
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-capsule f-digestive-health f-immunity f-non-binary f-seniors f-young-adults filter-item product-card product-orange first odd last']")
	private static WebElement WellnessPacksWomen50Plus;
	
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-40-49 f-adults f-capsule f-eye-health f-immunity f-male f-muscle-function f-tablets filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksMen40Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-brain-function f-capsule f-heart f-immunity f-male f-seniors f-tablets filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksMen50Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-60-100 f-bone-health f-capsule f-female f-heart f-muscle-function f-seniors f-tablets filter-item product-card product-purple first odd last']")
	private static WebElement WellnessPacksWomen60Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-60-100 f-brain-function f-capsule f-heart f-male f-muscle-function f-seniors f-tablets filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksMen60Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-30-39 f-adults f-capsule f-energy f-immunity f-male f-metabolism f-muscle-function f-tablets f-young-adults filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksMen30Plus;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-capsule f-energy f-male f-metabolism f-muscle-function f-tablets f-young-adults filter-item product-blue product-card first odd last']")
	private static WebElement WellnessPacksMen20Plus;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
	private static WebElement buyNow1;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNow2;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNow3;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNow4;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[5]")
	private static WebElement buyNow5;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[6]")
	private static WebElement buyNow6;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[7]")
	private static WebElement buyNow7;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[8]")
	private static WebElement buyNow8;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[9]")
	private static WebElement buyNow9;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[10]")
	private static WebElement buyNow10;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compare1;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compare2;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compare3;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compare4;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[5]")
	private static WebElement compare5;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[6]")
	private static WebElement compare6;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[7]")
	private static WebElement compare7;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[8]")
	private static WebElement compare8;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[9]")
	private static WebElement compare9;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[10]")
	private static WebElement compare10;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Women 20+']")
	private static WebElement BuyNowProductName1;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Women 30+']")
	private static WebElement BuyNowProductName2;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Women 40+']")
	private static WebElement BuyNowProductName3;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Women 50+']")
	private static WebElement BuyNowProductName4;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Men 40+']")
	private static WebElement BuyNowProductName5;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Men 50+']")
	private static WebElement BuyNowProductName6;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Women 60+']")
	private static WebElement BuyNowProductName7;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Men 60+']")
	private static WebElement BuyNowProductName8;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Men 30+']")
	private static WebElement BuyNowProductName9;
	
	@FindBy(xpath = "//h2[text()='Centrum Daily Wellness Packs Men 20+']")
	private static WebElement BuyNowProductName10;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement btnBuyNowClose;
	
	
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
	public void clickWellnessPacksWomen20Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksWomen20Plus);
		clickElementUsingJavaScript(WellnessPacksWomen20Plus);
	}

	public void clickWellnessPacksWomen30Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksWomen30Plus);
		clickElementUsingJavaScript(WellnessPacksWomen30Plus);
	}

	public void clickWellnessPacksWomen40Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksWomen40Plus);
		clickElementUsingJavaScript(WellnessPacksWomen40Plus);
	}

	public void clickWellnessPacksWomen50Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksWomen50Plus);
		clickElementUsingJavaScript(WellnessPacksWomen50Plus);
	}

	public void clickWellnessPacksMen40Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksMen40Plus);
		clickElementUsingJavaScript(WellnessPacksMen40Plus);
	}

	public void clickWellnessPacksMen50Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksMen50Plus);
		clickElementUsingJavaScript(WellnessPacksMen50Plus);
	}

	public void clickWellnessPacksWomen60Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksWomen60Plus);
		clickElementUsingJavaScript(WellnessPacksWomen60Plus);
	}

	public void clickWellnessPacksMen60Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksMen60Plus);
		clickElementUsingJavaScript(WellnessPacksMen60Plus);
	}

	public void clickWellnessPacksMen30Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksMen30Plus);
		clickElementUsingJavaScript(WellnessPacksMen30Plus);
	}

	public void clickWellnessPacksMen20Plus()throws Exception {
		scrollDownUsingElement(WellnessPacksMen20Plus);
		clickElementUsingJavaScript(WellnessPacksMen20Plus);
	}

	public void clickbuyNow1()throws Exception {
		scrollDownUsingElement(buyNow1);
		clickElementUsingJavaScript(buyNow1);
		visibilityOf(BuyNowProductName1);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName1);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}

	public void clickbuyNow2()throws Exception {
		scrollDownUsingElement(buyNow2);
		clickElementUsingJavaScript(buyNow2);
		visibilityOf(BuyNowProductName2);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName2);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	public void clickbuyNow3()throws Exception {
		scrollDownUsingElement(buyNow3);
		clickElementUsingJavaScript(buyNow3);
		visibilityOf(BuyNowProductName3);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName3);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}

	public void clickbuyNow4()throws Exception {
		scrollDownUsingElement(buyNow4);
		clickElementUsingJavaScript(buyNow4);
		visibilityOf(BuyNowProductName4);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName4);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	public void clickbuyNow5()throws Exception {
		scrollDownUsingElement(buyNow5);
		clickElementUsingJavaScript(buyNow5);
		visibilityOf(BuyNowProductName5);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName5);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}

	public void clickbuyNow6()throws Exception {
		scrollDownUsingElement(buyNow6);
		clickElementUsingJavaScript(buyNow6);
		visibilityOf(BuyNowProductName6);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName6);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	public void clickbuyNow7()throws Exception {
		scrollDownUsingElement(buyNow7);
		clickElementUsingJavaScript(buyNow7);
		visibilityOf(BuyNowProductName7);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName7);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}

	public void clickbuyNow8()throws Exception {
		scrollDownUsingElement(buyNow8);
		clickElementUsingJavaScript(buyNow8);
		visibilityOf(BuyNowProductName8);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName8);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	public void clickbuyNow9()throws Exception {
		scrollDownUsingElement(buyNow9);
		clickElementUsingJavaScript(buyNow9);
		visibilityOf(BuyNowProductName9);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName9);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}

	public void clickbuyNow10()throws Exception {
		scrollDownUsingElement(buyNow10);
		clickElementUsingJavaScript(buyNow10);
		visibilityOf(BuyNowProductName10);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName10);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	


	public void clickCompare1()throws Exception {
		scrollDownUsingElement(compare1);
		clickElementUsingJavaScript(compare1);
	}

	public void clickCompare2()throws Exception {
		scrollDownUsingElement(compare2);
		clickElementUsingJavaScript(compare2);
	}

	public void clickCompare3()throws Exception {
		scrollDownUsingElement(compare3);
		clickElementUsingJavaScript(compare3);
	}

	public void clickCompare4()throws Exception {
		scrollDownUsingElement(compare4);
		clickElementUsingJavaScript(compare4);
	}

	public void clickCompare5()throws Exception {
		scrollDownUsingElement(compare5);
		clickElementUsingJavaScript(compare5);
	}

	public void clickCompare6()throws Exception {
		scrollDownUsingElement(compare6);
		clickElementUsingJavaScript(compare6);
	}

	public void clickCompare7()throws Exception {
		scrollDownUsingElement(compare7);
		clickElementUsingJavaScript(compare7);
	}

	public void clickCompare8()throws Exception {
		scrollDownUsingElement(compare8);
		clickElementUsingJavaScript(compare8);
	}
	public void clickCompare9()throws Exception {
		scrollDownUsingElement(compare9);
		clickElementUsingJavaScript(compare9);
	}

	public void clickCompare10()throws Exception {
		scrollDownUsingElement(compare10);
		clickElementUsingJavaScript(compare10);
	}

}
