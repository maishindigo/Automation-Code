package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumChromiumPage extends BaseClass{
	
	public CentrumChromiumPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white rounded')]")
	private static WebElement energy;
	
	@FindBy(xpath = "(//h2[@style='text-align: center;'])[2]")
	private static WebElement scrollToArticle;
	
	@FindBy(xpath = "//a[@href='/learn/articles/how-supplements-work/how-do-vitamins-work/']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/how-to-take-vitamins-when/']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/4-tips-for-a-more-balanced-diet/']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/what-your-diet-may-be-missing/']")
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
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	private static WebElement featruedProductOpen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[1]")
	private static WebElement productMen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[2]")
	private static WebElement productMen50Plus;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[3]")
	private static WebElement productWomen;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300')])[4]")
	private static WebElement productWomen50Plus;
	
	
	
	
	
	
	
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
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(articleOne);
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
	
	public void clickProductMen50Plus() throws Exception {
		elementClick(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(productMen50Plus);
	}
	
	public void clickProductWomen() throws Exception {
		elementClick(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(productWomen);
	}
	
	public void clickProductWomen50Plus() throws Exception {
		elementClick(featruedProduct);
		scrollDownUsingElement(productMen);
		elementClick(productWomen50Plus);
	}
	
	
	public void clickEnergyFeatured() throws Exception {
		elementClick(featruedProduct);
		scrollDownUsingElement(energy);
		elementClick(energy);
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
	
	
	
	
}

