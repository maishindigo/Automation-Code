package com.qa.tums.eng.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SignsOfSevereHeartburnPages extends BaseClass {
	
	public SignsOfSevereHeartburnPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;
	
	@FindBy(xpath = "(//a[@href='/'])[3]")
	private static WebElement breadCrumbHomeIconBtn;
	
	@FindBy(xpath = "(//a[text()='Heartburn 101'])[2]")
    private static WebElement breadCrumbHeartburn101;
	
	@FindBy(xpath = "//a[text()='pain in your chest']")
	private static WebElement painInYourChestBtn;
	
	@FindBy(xpath = "//a[text()='Nexium 24HR']")
	private static WebElement nexium24HRBtn;
	
	@FindBy(xpath = "//button[@class='exit-notification-accept']")
	private static WebElement nexiumOKBtn;
	
	@FindBy(xpath = "//a[@href='https://www.rmhp.org/blog/2012/july/is-heartburn-a-sign-of-something-more-serious']")
	private static WebElement referenceUrlOne;
	
	@FindBy(xpath = "//button[@class='exit-notification-accept']")
	private static WebElement referenceOkOne;
	
	@FindBy(xpath = "//a[@href='https://www.medicalnewstoday.com/articles/312964.php']")
	private static WebElement referenceUrlTwo;
	
	@FindBy(xpath = "//button[@class='exit-notification-accept']")
	private static WebElement referenceOkTwo;
	
	@FindBy(xpath = "//a[@id='seeproducts-link']")
	private static WebElement seeProductsBtn;
	
	@FindBy(xpath ="//button[text()='Cookie Settings']")
	private static WebElement cookieSettingsBtn;

	@FindBy(xpath = "//p[@id='ot-pc-desc']")
	private static WebElement cookieContent;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement Heartburn101;
	
	@FindBy(xpath = "(//a[@title='Signs of severe heartburn'])[2]")
	private static WebElement severeheartburnBtn;
	
	@FindBy(xpath = "//h1[text()='The Signs of Severe Heartburn']")
	private static WebElement textSevereHeartburn;
	
	
	
	
	
	
	
	
	public void verifyCurrentUrl(String exp) {
		verifyUrl(exp);
	}

	public void verifyPageTitle(String exp) {
		verifyTitle(exp);
	}
	
	
	public void clickCookiesDismissBtn() throws InterruptedException {
		Thread.sleep(3000);
		if (cookiesDismissBtn.isDisplayed()) {
			elementClick(cookiesDismissBtn);
		} 
	}
	
	public void clickBreadCrumbHomeIconBtn() throws Exception {
		actionClick(breadCrumbHomeIconBtn);
		elementClick(breadCrumbHomeIconBtn);
	}

	public void clickBreadCrumbHeartburn101() throws Exception {
		actionClick(breadCrumbHeartburn101);
		elementClick(breadCrumbHeartburn101);
	}
	
	public void clickPainInYourChestBtn() {
		elementClick(painInYourChestBtn);
	}
	
	public void clickNexium24HRBtn() throws Throwable {
		elementClick(nexium24HRBtn);
		elementClick(nexiumOKBtn);
		String pwnd = driver.getWindowHandle();
		Set<String> allwnd = driver.getWindowHandles();
		for (String string : allwnd) {
			if (pwnd != string) {
				driver.switchTo().window(string);
			}
		}
		verifyCurrentUrl(excelRead("SevereHeartburn", 4, 1));
		verifyPageTitle(excelRead("SevereHeartburn", 4, 2));
		
		driver.close();
		driver.switchTo().window(pwnd);
	}
		
	
	
	public void clickReferenceUrlOne() throws Throwable {
		elementClick(referenceUrlOne);
		elementClick(referenceOkOne);
		Thread.sleep(2000);
		String pwnd = driver.getWindowHandle();
		Set<String> allwnd = driver.getWindowHandles();
		for (String string : allwnd) {
			if (pwnd != string) {
				driver.switchTo().window(string);
			}
		}
		verifyCurrentUrl(excelRead("SevereHeartburn", 5, 1));
		verifyPageTitle(excelRead("SevereHeartburn", 5, 2));
		
		driver.close();
		driver.switchTo().window(pwnd);
	}
	
	public void clickReferenceUrlTwo() throws Exception {
		elementClick(referenceUrlTwo);
		elementClick(referenceOkTwo);
		Thread.sleep(2000);
		String pwnd = driver.getWindowHandle();
		Set<String> allwnd = driver.getWindowHandles();
		for (String string : allwnd) {
			if (pwnd != string) {
				driver.switchTo().window(string);
			}
		}
		verifyCurrentUrl(excelRead("SevereHeartburn", 6, 1));
		verifyPageTitle(excelRead("SevereHeartburn", 6, 2));
		
		driver.close();
		driver.switchTo().window(pwnd);
	}
	
	public void clickSeeProductsBtn() throws Exception {
		scrollPageInDown500();
		elementClick(seeProductsBtn);
	
	}
	

	public void clickCookieSettingsBtn() throws Exception {
		//		scrollDownUsingElement(cookieSettingsBtn);
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
	
	public void mouseOverHearburn101() throws Exception {
		moveToElement(Heartburn101);
	}
	
	public void clickSevereheartburnBtn() {
		elementClick(severeheartburnBtn);
		if (textSevereHeartburn.isDisplayed()) {
			System.out.println("User successfully navigated to Signs of severeHeartburn Page");
		}
	}
	
	
	
	

}
