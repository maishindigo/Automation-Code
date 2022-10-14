package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.baseClass.BaseClass;

public class CentrumHomePage extends BaseClass {
	
	public CentrumHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Yogita's Code 
	 */
	
	@FindBy(xpath="//a[text()='Get Started']")
    private static WebElement getStarted;
	
	@FindBy(xpath="(//a[text()='Learn more'])[1]")
    private static WebElement learnmore1;
	
	@FindBy(xpath="(//a[text()='Learn more'])[2]")
    private static WebElement learnmore2;
	
	@FindBy(xpath="(//a[text()='About us'])")
    private static WebElement aboutus;
	
	@FindBy(xpath="(//a[text()='Learn'])[2]")
    private static WebElement learn3;
	
	@FindBy(xpath="//a[text()='View all']")
    private static WebElement viewall;
	
	
	/**
	 * Sujai's Code
	 */
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	
	@FindBy(xpath = "(//div[@class='component-content'])[111]")
	private static WebElement btnMultivitaminscroll;
	
	@FindBy(xpath = "//a[text()='Multivitamins']")
	private static WebElement btnMultivitamins;
	
	@FindBy(xpath = "//a[text()='Targeted Supplements']")
	private static WebElement targetedSupplements;
	
	@FindBy(xpath = "//a[text()='Vitamin Packs']")
	private static WebElement vitaminPacks;
	
	@FindBy(xpath = "//a[@class='browse-card-products']")
	private static WebElement seeAllProduct;
	
	@FindBy(xpath = "//img[@alt='Box of Centrum Silver Women 50+ Multivitamins']")
	private static WebElement women;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "//h2[text()='Centrum Silver WOMEN 40CT']")
	private static WebElement buyNowOneText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "//img[@alt='Box of Centrum Silver Men']")
	private static WebElement men;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "//h2[text()='Centrum Silver Men 40ct']")
	private static WebElement buyNowTwoText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "//img[@title='Bottle of Centrum Kids MultiGummies in Tropical Punch Flavor']")
	private static WebElement kidsTropicalPunch;
	
	@FindBy(xpath = "(//div[@class='component-content']//following::a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "//h2[text()='Centrum Kids MultiGummies in Tropical Punch Flavors']")
	private static WebElement buyNowThreeText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "//img[@alt='Box of Centrum MultiGummies Adults ']")
	private static WebElement adults;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies Adult']")
	private static WebElement buyNowFourText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement CompareFour;
	
	
	
	/**
	 * Yogita's Code
	 */
	
	public void clickongetstarted() throws Exception {
		//scrollDownUsingElement(getStarted);
		moveToElement(getStarted);
		elementClick(getStarted);
	}
	public void clickonLearn1() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learnmore1);
		elementClick(learnmore1);
	}
	public void clickonLearn2() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learnmore2);
		elementClick(learnmore2);
	}	
	public void clickonabout() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(aboutus);
		elementClick(aboutus);
	}	
	public void clickonlearn3() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learn3);
		elementClick(learn3);
	}
	public void clickonViewall() throws Exception {
		scrollPageInUpAndDown();
	
		moveToElement(viewall);
		elementClick(viewall);
	}

	/**
	 * Sujai's Code
	 */
	
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
	
	public void clickMultivitamins() throws Exception {
		scrollDownUsingElement(btnMultivitaminscroll);
		elementClick(btnMultivitamins);
	}
	
	public void clickTargetedSupplements() throws Exception {
		scrollDownUsingElement(btnMultivitaminscroll);
		elementClick(targetedSupplements);
	}
	
	public void clickVitaminPack() throws Exception {
		scrollDownUsingElement(btnMultivitaminscroll);
		elementClick(vitaminPacks);
	}
	
	public void clickSeeAllProduct() throws Exception {
		scrollDownUsingElement(btnMultivitaminscroll);
		elementClick(seeAllProduct);
	}
	
	public void imgWomen() throws Exception {
		scrollDownUsingElement(women);
		elementClick(women);
		
	}

	public void buyNowAndCompareOne() throws Exception {
		scrollDownUsingElement(women);
		elementClick(buyNowOne);
		if (buyNowOneText.isDisplayed()) {
			System.out.println(getElementText(buyNowOneText));
			refreshWebPage();
			elementClick(compareOne);
		}
	}
	
	public void imgMen() throws Exception {
		scrollDownUsingElement(men);
		elementClick(men);
	}
	
	public void buyNowAndCompareTwo() throws Exception {
		scrollDownUsingElement(men);
		elementClick(buyNowTwo);
		if (buyNowTwoText.isDisplayed()) {
			System.out.println(getElementText(buyNowTwoText));
			refreshWebPage();
			elementClick(compareTwo);
		}
	}
	
	
	public void imgKidsTropicalPunch() throws Exception {
		scrollDownUsingElement(kidsTropicalPunch);
		elementClick(kidsTropicalPunch);
	}
	
	public void buyNowAndCompareThree() throws Exception {
		scrollDownUsingElement(kidsTropicalPunch);
		elementClick(buyNowThree);
		if (buyNowThreeText.isDisplayed()) {
			System.out.println(getElementText(buyNowThreeText));
			refreshWebPage();
			elementClick(compareThree);
		}
	}
	
	public void imgAdults() throws Exception {
		scrollDownUsingElement(adults);
		elementClick(adults);
	}
	
	public void buyNowAndCompareFour() throws Exception {
		scrollDownUsingElement(adults);
		elementClick(buyNowFour);
		if (buyNowFourText.isDisplayed()) {
			System.out.println(getElementText(buyNowFourText));
			refreshWebPage();
			elementClick(CompareFour);
		}
	}
}
