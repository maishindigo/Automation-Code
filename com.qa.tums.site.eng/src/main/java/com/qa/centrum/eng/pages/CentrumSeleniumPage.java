package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumSeleniumPage extends BaseClass{
	
	public CentrumSeleniumPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white rounded')])[1]")
	private static WebElement energy;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white rounded')])[2]")
	private static WebElement immuneHealth;
	
	@FindBy(xpath = "(//h2[@style='text-align: center;'])[2]")
	private static WebElement scrollToArticle;
	
	@FindBy(xpath = "//a[@href='/learn/articles/health-and-lifestyle-tips/10-simple-ways-to-live-a-healthier-life/']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[@href='/learn/articles/health-and-lifestyle-tips/complexion-protection/']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/what-to-eat-to-support-your-immune-health/']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[@href='/learn/articles/health-and-lifestyle-tips/strategies-to-support-brain-health/']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "(//h2[@style='text-align: center;'])[3]")
	private static WebElement scrollToExploreAdditional;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[1]")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[2]")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[3]")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section border border-color-gray-500')])[4]")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']")
	private static WebElement featruedProduct;
	
	@FindBy(xpath = "//div[contains(@class,'image component section m-m-b-5 image-350-cut image-border-rainbow')]")
	private static WebElement featruedProductHeader;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	private static WebElement featruedProductOpen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[1]")
	private static WebElement productMen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[2]")
	private static WebElement productMultiGummiesMen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[3]")
	private static WebElement productSilverWomen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[4]")
	private static WebElement productWomensMultivitamin;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//div[@class='ps-header']")
	private static WebElement buyNowHeader;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compareFour;
	
	
	
	
	
	
	
	public void clickCookieBtn() {
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {
			
		}
	}
	
	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}
	
		public void clickEnergy() throws Exception {
			scrollDownUsingElement(energy);
			elementClick(energy);
		}
		
		public void clickImmuneHealth() throws Exception {
			scrollDownUsingElement(immuneHealth);
			elementClick(immuneHealth);
		}
		
		public void clickArticleOne() throws Exception {
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleOne);
		}
		
		public void clickArticleTwo() throws Exception {
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleTwo);
		}
		
		public void clickArticleThree() throws Exception {
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleThree);
		}
		
		public void clickArticleFour() throws Exception {
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleFour);
		}
		
		public void clickLearnMoreOne() throws Exception {
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreOne);
		}
		
		public void clickLearnMoreTwo() throws Exception {
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreTwo);
		}
		
		public void clickLearnMoreThree() throws Exception {
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreThree);
		}
		
		public void clickLearnMoreFour() throws Exception {
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreFour);
		}
		
		public boolean clickFeaturedProduct() throws Exception {
			elementClick(featruedProduct);
			boolean elementIsDisplayed = elementIsDisplayed(featruedProductOpen);
			return true;
		}
	
		public void clickProductMen() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(productMen);
			elementClick(productMen);
		}
		
		public void clickProductMultiGummiesMen() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(productMultiGummiesMen);
			elementClick(productMultiGummiesMen);
		}
		
		public void clickProductSilverWomen() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(productSilverWomen);
			elementClick(productSilverWomen);
		}
		
		public void clickProductWomensMultivitamin() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(productWomensMultivitamin);
			elementClick(productWomensMultivitamin);
		}
		
		public void clickEnergyFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(energy);
			elementClick(energy);
		}
		
		public void clickImmuneHealthFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(immuneHealth);
			elementClick(immuneHealth);
		}
		
		
		
		public void clickArticleOneFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleOne);
		}
		
		public void clickArticleTwoFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleTwo);
		}
		
		public void clickArticleThreeFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleThree);
		}
		
		public void clickArticleFourFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToArticle);
			elementClick(articleFour);
		}
		
		public void clickLearnMoreOneFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreOne);
		}
		
		public void clickLearnMoreTwoFeatured() throws Exception {
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreTwo);
		}
		
		public void clickLearnMoreThreeFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreThree);
		}
		
		public void clickLearnMoreFourFeatured() throws Exception {
			elementClick(featruedProduct);
			scrollDownUsingElement(scrollToExploreAdditional);
			elementClick(learnMoreFour);
		}
		
	public boolean clickBuyNowOne() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(buyNowOne);
		visibilityOf(buyNowHeader);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowHeader);
		return elementIsDisplayed;
	}
	
	public boolean clickBuyNowTwo() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(buyNowTwo);
		visibilityOf(buyNowHeader);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowHeader);
		return elementIsDisplayed;
	}
	
	public boolean clickBuyNowThree() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(buyNowThree);
		visibilityOf(buyNowHeader);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowHeader);
		return elementIsDisplayed;
	}
	
	public boolean clickBuyNowFour() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(buyNowFour);
		visibilityOf(buyNowHeader);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowHeader);
		return elementIsDisplayed;
	}
	
	
	public void clickCompareOne() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(compareOne);
	}
	
	public void clickCompareTwo() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(compareTwo);
	}
	
	public void clickCompareThree() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(compareThree);
	}
	
	public void clickCompareFour() throws Exception {
		scrollDownUsingElement(featruedProductHeader);
		isClickable(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(compareFour);
	}


}
