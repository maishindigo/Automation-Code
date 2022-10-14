package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class HeartBurn101Pages extends BaseClass {

	public HeartBurn101Pages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;

	@FindBy(xpath = "(//img[@title='Man Holding Chest']//following::a)[1]")
	private static WebElement heartBurnSymptoms;

	@FindBy(xpath = "//a[text()='Heartburn Causes']")
	private static WebElement heartBurnCausesBtn;

	@FindBy(xpath = "//a[text()='Finding Relief']")
	private static WebElement findingReliefBtn;

	@FindBy(xpath = "//a[text()='Tums & Pregnancy']")
	private static WebElement tumsPregnancyBtn;

	@FindBy(xpath = "//a[text()='How Do I Know If This Is Heartburn?']")
	private static WebElement thisIsHeartBurnBtn;

	@FindBy(xpath = "//a[text()='How Does TUMS Work?']")
	private static WebElement tumsWorkBtn;

	@FindBy(xpath = "//a[text()='What Behaviors Can Trigger Heartburn?']")
	private static WebElement triggerHeartBurnBtn;

	@FindBy(xpath = "//a[text()='The Signs of Severe Heartburn']")
	private static WebElement severeHeartBurnBtn;

	@FindBy(xpath = "//a[text()='What Causes Heartburn? A Checklist']")
	private static WebElement heartBurnCheckListBtn;

	@FindBy(xpath = "//a[text()='How You Can Reduce Heartburn']")
	private static WebElement reduceHeartBurnBtn;

	@FindBy(xpath = "//a[text()='Acid Reflux vs. GERD']")
	private static WebElement acidRefluxBtn;

	@FindBy(xpath = "//a[text()='Antacids And Why They Work']")
	private static WebElement antacidsWhyTheyWorkBtn;

	@FindBy(xpath = "//a[@id='seeproducts-link']")
	private static WebElement seeProductsBtn;

	@FindBy(xpath ="//button[text()='Cookie Settings']")
	private static WebElement cookieSettingsBtn;

	@FindBy(xpath = "//p[@id='ot-pc-desc']")
	private static WebElement cookieContent;

	@FindBy(xpath = "(//a[@href='/'])[2]")
	private static WebElement breadCrumbHomeIconBtn;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement Heartburn101;
	
	@FindBy(xpath = "//h1[text()='Heartburn 101']")
	private static WebElement textHeartburn101;
	
	


	public void verifyCurrentUrl(String exp) {
		verifyUrl(exp);
	}

	public void verifyPageTitle(String exp) {
		verifyTitle(exp);
	}


	public void clickCookiesDismissBtn() throws InterruptedException {
		Thread.sleep(2000);
		if (cookiesDismissBtn.isDisplayed()) {
			elementClick(cookiesDismissBtn);
		} 
	}

	public void clickHeartBurnSymptoms() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(heartBurnSymptoms);//
		elementClick(heartBurnSymptoms);
	}

	public void clickHeartBurnCausesBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(heartBurnCausesBtn);//
		elementClick(heartBurnCausesBtn);
	}

	public void clickFindingReliefBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(findingReliefBtn);//
		elementClick(findingReliefBtn);
	}

	public void clickTumsPregnancyBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(tumsPregnancyBtn);//
		elementClick(tumsPregnancyBtn);
	}


	public void clickThisIsHeartBurnBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(thisIsHeartBurnBtn);
		elementClick(thisIsHeartBurnBtn);
	}


	public void clickTumsWorkBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(tumsWorkBtn);
		elementClick(tumsWorkBtn);
	}

	public void clickTriggerHeartBurnBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(triggerHeartBurnBtn);
		elementClick(triggerHeartBurnBtn);
	}

	public void clickSevereHeartBurnBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(severeHeartBurnBtn);
		elementClick(severeHeartBurnBtn);
	}

	public void clickHeartBurnCheckListBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(heartBurnCheckListBtn);
		elementClick(heartBurnCheckListBtn);
	}

	public void clickReduceHeartBurnBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(reduceHeartBurnBtn);
		elementClick(reduceHeartBurnBtn);
	}

	public void clickAcidRefluxBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(acidRefluxBtn);
		elementClick(acidRefluxBtn);
	}

	public void clickAntacidsWhyTheyWorkBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(antacidsWhyTheyWorkBtn);
		actionClick(antacidsWhyTheyWorkBtn);
		elementClick(antacidsWhyTheyWorkBtn);
	}

	public void clickSeeProductsBtn() throws Exception {
//		scrollPageInDown500();
		scrollPageInUpAndDown();
		moveToElement(seeProductsBtn);
		elementClick(seeProductsBtn);
	}

	public void clickCookieSettingsBtn() throws Exception {
		scrollPageInDown500();
		moveToElement(cookieSettingsBtn);
		boolean cookieBtn = cookieSettingsBtn.isDisplayed();
		System.out.println("Cookie Setting is displayed on site :" + cookieBtn);
		elementClick(cookieSettingsBtn);

	}

	public void cookieContent() {
		boolean para = cookieContent.isEnabled();
		System.out.println("Cookie paragraph is presented :"+para);
	}

	public void clickBreadCrumbHomeIconBtn() throws Exception {
		elementClick(breadCrumbHomeIconBtn);
	}

	public void mouseOverHearburn101() throws Exception {
		moveToElement(Heartburn101);
		elementClick(Heartburn101);
		if (textHeartburn101.isDisplayed()) {
			System.out.println("User successfully navigated to Heartburn101 page");
		}
	}
}
