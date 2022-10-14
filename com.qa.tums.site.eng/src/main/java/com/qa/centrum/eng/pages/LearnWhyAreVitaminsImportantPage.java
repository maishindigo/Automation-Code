package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class LearnWhyAreVitaminsImportantPage extends BaseClass{

	public LearnWhyAreVitaminsImportantPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//u[text()='Good nutrition makes for a durable immune system']")
	private static WebElement linkSupportImmunity;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/the-abc-s-of-vitamin-d/']")
	private static WebElement linkMaintainStrongBones;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/how-supplements-multivitamins-work-together/']")
	private static WebElement linkMeetingYourNutritionalNeeds;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/paleo-vitamins-supplements/']")
	private static WebElement linkPaleo;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[1]")
	private static WebElement btnOysters;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[2]")
	private static WebElement btnPinkSalmon;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[3]")
	private static WebElement btnAlmonds;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[4]")
	private static WebElement btnSpinach;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[5]")
	private static WebElement btnHalibut;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[6]")
	private static WebElement btnAvocados;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[7]")
	private static WebElement btnChickpeas;
	
	@FindBy(xpath = "(//div[@class='component-content left']//following::figure)[8]")
	private static WebElement btnGreekYogurt;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[1]")
	private static WebElement multivitamins;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[2]")
	private static WebElement benefitBlends;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[3]")
	private static WebElement wholeFoodBlends;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[4]")
	private static WebElement seeAllProducts;
	
	@FindBy(xpath = "//strong[text()='How Do Vitamins Work?']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Choosing a Daily Multivitamin']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='The 6 Nutrients Your Diet May Be Missing']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even ']")
	private static WebElement keto;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/keto-vitamins/']")
	private static WebElement ketoLink;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd ']")
	private static WebElement vegetarian;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/how-much-b12-should-you-take-a-day/']")
	private static WebElement vegetarianLinkOne;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/the-benefits-of-omega-3-supplements/']")
	private static WebElement vegetarianLinkTwo;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']")
	private static WebElement vegan;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/vitamins-and-vegan-diet/']")
	private static WebElement veganLink;
	
	
	
	
	
	
	
	
	
	

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
	
	public void clickSupportImmunity() throws Exception {
		scrollPageInUpAndDown();
		elementClick(linkSupportImmunity);
	}
	
	public void clickMaintainStrongBone() throws Exception {
		scrollPageInUpAndDown();
		//scrollDownUsingElement(linkMaintainStrongBones);
		elementClick(linkMaintainStrongBones);
	}
	
	public void clickMeetingYourNutritionalNeeds() throws Exception {
		scrollDownUsingElement(linkMaintainStrongBones);
		elementClick(linkMeetingYourNutritionalNeeds);
	}
	
	public void clickPaleo() throws Exception {
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		elementClick(linkPaleo);
	}
	
	
	
	
	
	
	public void clickOysters() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnOysters);
	}
	
	public void clickPinkSalmon() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnPinkSalmon);
	}
	
	public void clickAlmonds() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnAlmonds);
	}
	
	public void clickSpinach() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnSpinach);
	}
	
	public void clickHalibut() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnHalibut);
	}
	
	public void clickAvocados() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnAvocados);
	}
	
	public void clickChickPeas() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnChickpeas);
	}
	
	public void clickGreekYogurt() throws Exception {
		scrollDownUsingElement(btnOysters);
		elementClick(btnGreekYogurt);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(btnHalibut);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
		System.out.println("Show Refrence and Hide refernce ---->Verified Successfully<----");
	}
	
	public void clickMultivitamins() throws Exception {
		scrollDownUsingElement(btnShowReference);
		elementClick(multivitamins);
	}
	
	public void clickBenefitBlends() throws Exception {
		scrollDownUsingElement(btnShowReference);
		elementClick(benefitBlends);
	}
	
	public void clickWholeFoodBlends() throws Exception {
		scrollDownUsingElement(btnShowReference);
		elementClick(wholeFoodBlends);
	}
	
	public void clickSeeAllProducts() throws Exception {
		scrollDownUsingElement(btnShowReference);
		elementClick(seeAllProducts);
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(seeAllProducts);
		elementClick(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(seeAllProducts);
		elementClick(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(seeAllProducts);
		elementClick(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(seeAllProducts);
		elementClick(articleFour);
	}
	
	
	public void clickKeto() throws Exception {
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		elementClick(keto);	
		elementClick(ketoLink);
		}
	
	
	public void clickVegetarianLinkOne() throws Exception {
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		elementClick(vegetarian);
		elementClick(vegetarianLinkOne);
	}
	
	
	public void clickVegetarianLinkTwo() throws Exception {
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		elementClick(vegetarian);
		elementClick(vegetarianLinkTwo);
	}
	
	public void clickVegan() throws Exception {
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		elementClick(vegan);
		elementClick(veganLink);
	}
	
	
	
	
	
	
	
	
	
}
