package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class HomePages extends BaseClass {

	public HomePages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private static WebElement cookiesDismissBtn;

	@FindBy(id = "learn-more")
	private static WebElement learnMoreBtn;

	@FindBy(xpath = "//p[@id='product-availability']//following::a[text()='Please see our product page.']")
	private static  WebElement productPageLink;

	@FindBy(xpath = "//div[@class='richText-content']//following::a[text()='Buy Now']")
	private static WebElement BuyNowBtn;

	@FindBy(xpath = "//a[@id='chewy-bites-learn-more']")
	private static WebElement TUMS_ChewyBitesLink;

	@FindBy(xpath = "//a[@id='cooling-sensation-learn-more']")
	private static WebElement TUMS_ChewyBitesCoolingsSensationLink;

	@FindBy(xpath = "//a[@id='find-out-why']")
	private static WebElement TUMSAmerica1Link;	

	@FindBy(xpath = "//a[@id='fight-back-learn-more']")
	private static WebElement fightBackFastAgainstLink;	

	@FindBy(xpath = "//i[@class='icon icon-video-play']")
	private static WebElement youtubeIcon;


	@FindBy(xpath = "//iframe[@class='responsive-iframe']")
	private static WebElement frame;
	
	@FindBy(xpath = "//div[@class='html5-video-container']//descendant::video")
	private static WebElement youtubeVideo;

	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	private static WebElement pauseIcon;

	@FindBy(xpath = "//div[@class='close']")
	private static WebElement youtubeCloseBtn;
	
	@FindBy(xpath = "//button[@id='ot-sdk-btn']")
	private static WebElement cookieSetting;
	
	@FindBy(xpath = "//p[@id='ot-pc-desc']")
	private static WebElement cookiePara;
	
	
	
	
	

	public void clickCookiesDismissBtn() throws InterruptedException {
		Thread.sleep(3000);
		if (cookiesDismissBtn.isDisplayed()) {
			elementClick(cookiesDismissBtn);
		} 
	}

	public void clickLearnMoreBtn() {
		elementClick(learnMoreBtn);

	}
	public void verifyurl(String exp) {
		verifyUrl(exp);
	}

	public void verifyTlt(String exp) {
		verifyTitle(exp);
	}


	public void clickProductPageLink() throws Exception {
		moveToElement(productPageLink);
		actionClick(productPageLink);
		elementClick(productPageLink);
	}
	public void clickBuyNowBtn() throws Exception {
		moveToElement(BuyNowBtn);
		actionClick(BuyNowBtn);
		elementClick(BuyNowBtn);
	}

	public void clickTUMS_ChewyBitesLink() throws Exception {
		scrollDownUsingElement(TUMS_ChewyBitesLink);
		elementClick(TUMS_ChewyBitesLink);

	}

	public void clickTUMS_ChewyBitesCoolingsSensationLink() throws Exception {
		scrollDownUsingElement(TUMS_ChewyBitesCoolingsSensationLink);
		elementClick(TUMS_ChewyBitesCoolingsSensationLink);
	}

	public void clickTUMSAmerica1Link() throws Exception {
		scrollDownUsingElement(TUMSAmerica1Link);
		elementClick(TUMSAmerica1Link);
	}

	public void clickfightBackFastAgainstLink() throws Exception {
		scrollDownUsingElement(fightBackFastAgainstLink);
		elementClick(fightBackFastAgainstLink);
	}

	public void clickYoutubeIcon() throws Exception {
		moveToElement(youtubeIcon);
		actionClick(youtubeIcon);
		elementClick(youtubeIcon);
	}
	
	public void switchtoFrame() throws Exception {
		switchToFrameUsingElement(frame);
	}

	public void verifyYoutubeVideo() throws Exception {
		moveToElement(youtubeVideo);
		actionClick(youtubeVideo);
		if (pauseIcon.isDisplayed()) {
			System.out.println("Viedo is playing successfully");
		}else {
			System.out.println("Video is unavailable");
		}
		Thread.sleep(5000);
		frameSwitchingToDefaultContent();
		elementClick(youtubeCloseBtn);
	}
	
	public void cookieSetting() throws Exception {
		moveToElement(cookieSetting);
		boolean cookieBtn = cookieSetting.isDisplayed();
		System.out.println("Cookie Setting is displayed on site :" + cookieBtn);
		elementClick(cookieSetting);
	}
	
	public void cookieContent() {
		boolean para = cookiePara.isEnabled();
		System.out.println("Cookie paragraph is presented :"+para);
	}
	
	
	
	
	
	
}
