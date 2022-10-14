package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumOrganicKidsMultigummies extends BaseClass {
	public CentrumOrganicKidsMultigummies() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "(//button[text()='Write a review '])[1]")
	private static WebElement btnReview;
	
	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement btnReviewClose;
	
	@FindBy(xpath = "(//a[@role='button'])[1]")
	private static WebElement btnBuyNow;
	
	//h2[text()='CENTRUM ORGANIC GUMMY KIDS']
	@FindBy(xpath = "//h2[text()='CENTRUM ORGANIC GUMMY KIDS']")
	private static WebElement BuyNowProductName;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement btnBuyNowClose;
	
	@FindBy(xpath = "(//a[text()='Get Coupons'])[1]")
	private static WebElement getCoupons;
	//li[@class='tabs-nav-item odd first is-active']
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	private static WebElement productBenefitOpen;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even is-active']")
	private static WebElement ingredientsOpen;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd is-active']")
	private static WebElement UsageOpen;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	private static WebElement FAQOpen;
	
	@FindBy(xpath = "(//a[@role='tab'])[1]")
	private static WebElement productBenefitTab;
	
	@FindBy(xpath = "(//a[@role='tab'])[2]")
	private static WebElement ingredientsTab;
	
	@FindBy(xpath = "(//a[@role='tab'])[3]")
	private static WebElement UsageTab;
	
	@FindBy(xpath = "(//a[@role='tab'])[4]")
	private static WebElement FAQTab;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[1]")
	private static WebElement viewSupplementVitamin1;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[2]")
	private static WebElement viewSupplementVitamin2;
	
	@FindBy(xpath = "//p[text()='Centrum Organic Kids’ Multigummies']")
	private static WebElement txtImmuneSupportMen;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white rounded flex')]")
	private static WebElement compareTab;
	
	@FindBy(xpath = "//a[@class='compare-button default-compare btn btn-primary btn-flexible']")
	private static WebElement compareButton;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-general-wellness f-heart f-metabolism f-non-binary f-seniors f-tablets filter-item product-card product-green box_1938611159_copy_')]")
	private static WebElement relatedProductOne;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple first odd last')]")
	private static WebElement relatedProductTwo;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-female f-general-wellness f-hair-skin-nails f-immunity f-metabolism f-tablets f-young-adults filter-item last-down product-card product-purple box_1938611159_copy_')]")
	private static WebElement relatedProductThree;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-bone-health f-brain-function f-eye-health f-female f-general-wellness f-heart f-seniors f-tablets filter-item product-card product-purple box_1938611159_copy_')]")
	private static WebElement relatedProductFour;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[5]")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//div[@class='ps-header']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compareFour;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[1]")
	private static WebElement browseLinkOne;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[2]")
	private static WebElement browseLinkTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[3]")
	private static WebElement browseLinkThree;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[4]")
	private static WebElement browseLinkFour;
	
	
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
	public void clickWriteAReview() throws Exception {
		moveToElement(btnReview);
		elementClick(btnReview);
	}
	public void clickWriteAReviewClose() throws Exception {
		moveToElement(btnReviewClose);
		clickElementUsingJavaScript(btnReviewClose);
	}
	public void ClickBuyNow() throws Exception {
		elementClick(btnBuyNow);
		visibilityOf(BuyNowProductName);
		boolean elementIsDisplayed = elementIsDisplayed(BuyNowProductName);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnBuyNowClose);
	}
	public void clickGetCoupons() throws Exception{
		visibilityOf(getCoupons);
		clickElementUsingJavaScript(getCoupons);
	}
	public void visiblityProductBefefit() throws Exception {
		scrollDownUsingElement(productBenefitOpen);
		boolean elementIsDisplayed = elementIsDisplayed(productBenefitOpen);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println("Product Benefit Tab is Open");
	}
	
	public void clickVitaminAndMineralTab() throws Exception {
		scrollDownUsingElement(ingredientsTab);
		clickElementUsingJavaScript(ingredientsTab);
		boolean elementIsDisplayed = elementIsDisplayed(ingredientsOpen);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println("Vitamins & minerals Tab is Open");
		elementClick(viewSupplementVitamin1);
	}
	public void clickUsageTab() throws Exception {
		scrollDownUsingElement(UsageTab);
		clickElementUsingJavaScript(UsageTab);
		boolean elementIsDisplayed = elementIsDisplayed(UsageOpen);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println("Usage Tab is Open");
		elementClick(viewSupplementVitamin2);
	}
	public void clickFAQsTab() throws Exception {
		scrollDownUsingElement(FAQTab);
		clickElementUsingJavaScript(FAQTab);
		boolean elementIsDisplayed = elementIsDisplayed(FAQOpen);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println("FAQs Tab is Open");
	}
	public boolean txtProductVerification() throws Exception{
		boolean elementIsDisplayed = elementIsDisplayed(txtImmuneSupportMen);
		return elementIsDisplayed;
}

public void clickCompareTab() throws Exception {
	scrollDownUsingElement(compareTab);
	clickElementUsingJavaScript(compareTab);
}

public void clickCompareButton() throws Exception {
	scrollDownUsingElement(compareButton);
	clickElementUsingJavaScript(compareButton);
}

public void clickRelatedProductOne()throws Exception {
	scrollDownUsingElement(relatedProductOne);
	clickElementUsingJavaScript(relatedProductOne);
}

public void clickRelatedProductTwo()throws Exception {
	scrollDownUsingElement(relatedProductTwo);
	clickElementUsingJavaScript(relatedProductTwo);
}

public void clickRelatedProductThree()throws Exception {
	scrollDownUsingElement(relatedProductThree);
	clickElementUsingJavaScript(relatedProductThree);
}

public void clickRelatedProductFour()throws Exception {
	scrollDownUsingElement(relatedProductFour);
	clickElementUsingJavaScript(relatedProductFour);
}

public void clickBuyNowOne() throws Exception{
	scrollDownUsingElement(buyNowOne);
	clickElementUsingJavaScript(buyNowOne);
//	elementClick(buyNowOne);
	visibilityOf(buyNowClose);
	boolean elementIsDisplayed = elementIsDisplayed(buyNowClose);
	Assert.assertTrue(elementIsDisplayed);
	refreshWebPage();
}

public void clickBuyNowTwo() throws Exception{
	scrollDownUsingElement(buyNowTwo);
	clickElementUsingJavaScript(buyNowTwo);
//	elementClick(buyNowTwo);
	visibilityOf(buyNowClose);
	boolean elementIsDisplayed = elementIsDisplayed(buyNowClose);
	Assert.assertTrue(elementIsDisplayed);
	refreshWebPage();
}

public void clickBuyNowThree() throws Exception{
	scrollDownUsingElement(buyNowThree);
	clickElementUsingJavaScript(buyNowThree);
//	elementClick(buyNowThree);
	visibilityOf(buyNowClose);
	boolean elementIsDisplayed = elementIsDisplayed(buyNowClose);
	Assert.assertTrue(elementIsDisplayed);
	refreshWebPage();
}

public void clickBuyNowFour() throws Exception{
	scrollDownUsingElement(buyNowFour);
	clickElementUsingJavaScript(buyNowFour);
//	elementClick(buyNowFour);
	visibilityOf(buyNowClose);
	boolean elementIsDisplayed = elementIsDisplayed(buyNowClose);
	Assert.assertTrue(elementIsDisplayed);
	refreshWebPage();
}

public void clickCompareOne() throws Exception {
	scrollDownUsingElement(compareOne);
	clickElementUsingJavaScript(compareOne);
} 

public void clickCompareTwo() throws Exception {
	scrollDownUsingElement(compareTwo);
	clickElementUsingJavaScript(compareTwo);
} 

public void clickCompareThree() throws Exception {
	scrollDownUsingElement(compareThree);
	clickElementUsingJavaScript(compareThree);
} 

public void clickCompareFour() throws Exception {
	scrollDownUsingElement(compareFour);
	clickElementUsingJavaScript(compareFour);
} 

public void clickBrowseLinkOne() throws Exception{
	scrollDownUsingElement(browseLinkOne);
	clickElementUsingJavaScript(browseLinkOne);
}

public void clickBrowseLinkTwo() throws Exception{
	scrollDownUsingElement(browseLinkTwo);
	clickElementUsingJavaScript(browseLinkTwo);
}

public void clickBrowseLinkThree() throws Exception{
	scrollDownUsingElement(browseLinkThree);
	clickElementUsingJavaScript(browseLinkThree);
}

public void clickBrowseLinkFour() throws Exception{
	scrollDownUsingElement(browseLinkFour);
	clickElementUsingJavaScript(browseLinkFour);
}
	
}
