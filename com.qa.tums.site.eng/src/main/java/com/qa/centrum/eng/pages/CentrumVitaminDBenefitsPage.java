package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminDBenefitsPage extends BaseClass{

	public CentrumVitaminDBenefitsPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//u[text()='support your immune system']")
	private static WebElement ImmuneSystemOne;
	
	@FindBy(xpath = "//u[text()='well-balanced diet']")
	private static WebElement ImmuneSystemTwo;
	
	@FindBy(xpath = "//u[text()='Vitamin D increases your body’s absorption of calcium, which in turn helps you build strong, healthy bones']")
	private static WebElement boneHealthLink;
	
	@FindBy(xpath = "//u[text()='Not only is vitamin D good for your bones—it’s good for your mind, too!']")
	private static WebElement cognitiveFunctionLinkOne;
	
	@FindBy(xpath = "//u[text()='vitamin D may also help us as we age']")
	private static WebElement cognitiveFunctionLinkTwo;
	
	@FindBy(xpath = "//a[text()='Centrum® Multivitamin']")
	private static WebElement happinessLinkOne;
	
	@FindBy(xpath = "//a[text()='The ABC’s of Vitamin D']")
	private static WebElement happinessLinkTwo;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='5 Things to Do When Not Feeling Well and Bored']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement articleFour;
	
	
	public void clickCookieBtn() {
		elementToBeClickable(cookieBtn);
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
	
	public void clickImmuneSystemOne() throws Exception {
		scrollDownUsingElement(ImmuneSystemOne);
		clickElementUsingJavaScript(ImmuneSystemOne);
	}
	
	public void clickImmuneSystemTwo() throws Exception {
		scrollDownUsingElement(ImmuneSystemTwo);
		clickElementUsingJavaScript(ImmuneSystemTwo);
	}
	
	public void clickBoneHealthLink() throws Exception {
		scrollDownUsingElement(boneHealthLink);
		clickElementUsingJavaScript(boneHealthLink);
	}
	
	public void clickCognitiveFunctionLinkOne() throws Exception {
		scrollDownUsingElement(cognitiveFunctionLinkOne);
		clickElementUsingJavaScript(cognitiveFunctionLinkOne);
	}
	
	public void clickCognitiveFunctionLinkTwo() throws Exception {
		scrollDownUsingElement(cognitiveFunctionLinkTwo);
		clickElementUsingJavaScript(cognitiveFunctionLinkTwo);
	}
	
	public void clickHappinessLinkOne() throws Exception {
		scrollDownUsingElement(happinessLinkOne);
		clickElementUsingJavaScript(happinessLinkOne);
	}
	
	public void clickHappinessLinkTwo() throws Exception {
		scrollDownUsingElement(happinessLinkTwo);
		clickElementUsingJavaScript(happinessLinkTwo);
	}
	
	public void clickShowReference() throws Exception {
		scrollDownUsingElement(happinessLinkTwo);
		elementClick(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		elementClick(btnHideReference);
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
	}
}
