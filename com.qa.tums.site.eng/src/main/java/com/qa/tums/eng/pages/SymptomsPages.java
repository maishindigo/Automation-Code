package com.qa.tums.eng.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SymptomsPages extends BaseClass{

	public SymptomsPages() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;

	@FindBy(xpath = "//u[text()='antacids such as TUMS']")
	private static WebElement antacidsTumsbtn;

	@FindBy(xpath = "//div[@class='paragraphSystem item0 content']")
	private static WebElement contentAccordionOne;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[1]")
	private static WebElement accordionOne;


	@FindBy(xpath = "(//h3[@class='accordion-title component'])[2]")
	private static WebElement accordionTwo;

	@FindBy(xpath = "//div[@class='paragraphSystem item1 content']")
	private static WebElement contentAccordionTwo;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[3]")
	private static WebElement accordionThree;

	@FindBy(xpath = "//div[@class='paragraphSystem item2 content']")
	private static WebElement contentAccordionThree;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[4]")
	private static WebElement accordionFour;

	@FindBy(xpath = "//div[@class='paragraphSystem item3 content']")
	private static WebElement contentAccordionFour;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[5]")
	private static WebElement accordionFive;

	@FindBy(xpath = "//div[@class='paragraphSystem item4 content']")
	private static WebElement contentAccordionFive;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[6]")
	private static WebElement accordionSix;

	@FindBy(xpath = "//div[@class='paragraphSystem content item5']")
	private static WebElement contentAccordionSix;

	@FindBy(xpath = "(//h3[@class='accordion-title component'])[7]")
	private static WebElement accordionSeven;

	@FindBy(xpath = "//div[@class='paragraphSystem item6 content']")
	private static WebElement contentAccordionSeven;

	@FindBy(xpath = "//p[text()='Show References']")
	private static WebElement showReferenceBtn;

	@FindBy(xpath = "//div[@class='richText component section show-reference-content even last col-xs-12']")
	private static WebElement contentReference;

	@FindBy(xpath = "//p[text()='Hide References']")
	private static WebElement hideReference;

	@FindBy(xpath = "//a[text()='Heartburn Causes']")
	private static WebElement heartBurnCausesBtn;

	@FindBy(xpath = "//a[text()='Finding Relief']")
	private static WebElement findingReliefBtn;

	@FindBy(xpath = "//a[text()='TUMS While Pregnant']")
	private static WebElement tumsPregnancyBtn;

	@FindBy(xpath = "//a[text()='How Do I Know If This Is Heartburn?']")
	private static WebElement thisIsHeartBurnBtn;

	@FindBy(xpath = "//a[text()='The Signs of Severe Heartburn']")
	private static WebElement severeHeartBurnBtn;

	@FindBy(xpath = "//a[text()='What You Can Do to Manage Night-Time Heartburn']")
	private static WebElement nightTimeHeartBurn;

	@FindBy(xpath = "//a[text()='How to Know if You Have Acid Reflux']")
	private static WebElement acidReflux;


	@FindBy(xpath = "//a[@id='seeproducts-link']")
	private static WebElement seeProductsBtn;

	@FindBy(xpath ="//button[text()='Cookie Settings']")
	private static WebElement cookieSettingsBtn;

	@FindBy(xpath = "//p[@id='ot-pc-desc']")
	private static WebElement cookieContent;

	@FindBy(xpath = "(//a[@href='/'])[2]")
	private static WebElement breadCrumbHomeIconBtn;
	
	@FindBy(xpath = "//a[text()='Heartburn 101']")
    private static WebElement breadCrumbHeartburn101;

	@FindBy(xpath = "//img[@Title='Twitter']")
	private static WebElement twitterBtn;

	@FindBy(xpath = "//input[@name='session[username_or_email]']")
	private static WebElement twitterUserName;

	@FindBy(xpath = "//input[@name='session[password]']")
	private static WebElement twitterPassword;

	@FindBy(xpath = "(//div[@role='button'])[2]")
	private static WebElement twitterLoginBtn;
	

	@FindBy(xpath = "//span[text()='https://tums-com-v2.preprod-cf65.ch.adobecqms.net/about-heartburn/symptoms/']")
	private static WebElement twitterLink;

	@FindBy(xpath = "//div[@data-testid='tweetButton']")
	private static WebElement twitterIcon;


	@FindBy(xpath = "//img[@Title='Facebook']")
	private static WebElement facebookBtn;

	@FindBy(xpath = "//img[@Title='Email']")
	private static WebElement gmailBtn;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement Heartburn101;
	
	@FindBy(xpath = "(//a[@title='Symptoms'])[2]")
	private static WebElement symptomsBtn;

	@FindBy(xpath = "//h1[text()='Heartburn Symptoms: The 5 Signs of Heartburn']")
	private static WebElement textSymptoms;












	public void clickCookiesDismissBtn() throws InterruptedException {
		Thread.sleep(3000);
		if (cookiesDismissBtn.isDisplayed()) {
			elementClick(cookiesDismissBtn);
		} 
	}

	public void clickAntacidsTumsbtn() {
		elementClick(antacidsTumsbtn);
	}

	public void clickContentHeartBurnAndChestPain() throws Exception {
		implicitWait();
		if (contentAccordionOne.isDisplayed()) {
			System.out.println("1st accordion opened successfully");
			elementClick(accordionOne);
			System.out.println("1st accordion closed successfully");
			implicitWait();
		}
	}


	public void clickaccordionHeartBurnBloatingAndBleching() {
		elementClick(accordionTwo);
		if (contentAccordionTwo.isDisplayed()) {
			System.out.println("2nd accordion opened successfully");
			elementClick(accordionTwo);
			System.out.println("2nd accordion closed successfully");
			implicitWait();
		}

	}

	public void clickHeartBurnAndAcidicThroat() {
		elementClick(accordionThree);
		if (contentAccordionThree.isDisplayed()) {
			System.out.println("3rd accordion opened successfully");
			elementClick(accordionThree);
			System.out.println("3rd accordion closed successfully");
			implicitWait();
		}
	}

	public void clickHearBurnAndNause() {
		elementClick(accordionFour);
		if (contentAccordionFour.isDisplayed()) {
			System.out.println("4th accordion opened successfully");
			elementClick(accordionFour);
			System.out.println("4th accordion closed successfully");
			implicitWait();
		}
	}

	public void clickHeartBurnAndHiccups() {
		elementClick(accordionFive);
		if (contentAccordionFive.isDisplayed()) {
			System.out.println("5th accordion opened successfully");
			elementClick(accordionFive);
			System.out.println("5th accordion closed successfully");
			implicitWait();
		}
	}

	public void clickWhenPregnant() {
		elementClick(accordionSix);
		if (contentAccordionSix.isDisplayed()) {
			System.out.println("6th accordion opened successfully");
			elementClick(accordionSix);
			System.out.println("6th accordion closed successfully");
			implicitWait();
		}
	}

	public void clickMedicalAttention() {
		elementClick(accordionSeven);
		if (contentAccordionSeven.isDisplayed()) {
			System.out.println("7th accordion opened successfully");
			elementClick(accordionSeven);
			System.out.println("7th accordion closed successfully");
			implicitWait();
		}
	}

	public void clickShowReferenceBtn() throws Exception {
		scrollPageInUpAndDown();
		elementClick(showReferenceBtn);
		if (contentReference.isDisplayed()) {
			System.out.println("Under Show reference content is presented");
			elementClick(hideReference);
			System.out.println("Hide reference clicked successfully");
		}
	}

	public void verifyCurrentUrl(String exp) {
		verifyUrl(exp);
	}

	public void verifyPageTitle(String exp) {
		verifyTitle(exp);
	}

	public void clickHeartBurnCausesBtn() throws Exception {
		scrollPageInUpAndDown();
		elementClick(heartBurnCausesBtn);
	}

	public void clickFindingReliefBtn() throws Exception {
		scrollPageInUpAndDown();
		elementClick(findingReliefBtn);
	}

	public void clickTumsPregnancyBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(tumsPregnancyBtn);
		elementClick(tumsPregnancyBtn);
	}


	public void clickThisIsHeartBurnBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(thisIsHeartBurnBtn);
		elementClick(thisIsHeartBurnBtn);
	}

	public void clickSevereHeartBurnBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(severeHeartBurnBtn);
		elementClick(severeHeartBurnBtn);
	}

	public void clickNightTimeHeartBurnBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(nightTimeHeartBurn);
		elementClick(nightTimeHeartBurn);
	}


	public void clickAcidRefluxBtn() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(acidReflux);
		elementClick(acidReflux);
	}

	public void clickSeeProductsBtn() throws Exception {
		scrollPageInDown500();
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

	public void clickBreadCrumbHeartburn101() {
		elementClick(breadCrumbHeartburn101);
	}
	

	public void clickTwitterBtn() throws Throwable {
		moveToElement(twitterBtn);
		elementClick(twitterBtn);
		Thread.sleep(5000);
		windowHandle();
		Thread.sleep(5000);
		elementSendKeys(twitterUserName, loadProperties().getProperty("un"));
		elementSendKeys(twitterPassword, loadProperties().getProperty("pwd"));
		elementClick(twitterLoginBtn);
		

	}

	public void verifyTwitterLink() throws IOException {
		String text = twitterLink.getText();
		System.out.println(text);
		boolean compareTwoText = compareTwoText(text, excelRead("Symptoms", 1, 1));
		System.out.println("Twitter link text verified successfully :"+compareTwoText);
 
	}

	public void verifyTwitterIcon() {
		if (twitterIcon.isDisplayed()) {
			System.out.println("Twitter Icon is diplayed");
		}
	
	}


	public void mouseOverHearburn101() throws Exception {
		moveToElement(Heartburn101);
	}

	public void clickSymptomsBtn() {
		elementClick(symptomsBtn);
		if (textSymptoms.isDisplayed()) {
			System.out.println("User successfully navigated to Symptoms page");
		}
	}








}
