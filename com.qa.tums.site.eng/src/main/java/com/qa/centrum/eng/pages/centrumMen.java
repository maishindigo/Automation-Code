package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class centrumMen extends BaseClass {
	
		public centrumMen() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//button[text()='Dismiss']")
		WebElement cookieBtn;
		
		@FindBy(xpath = "//h2[@class='heading']")
		WebElement gigyaForm;
		
		@FindBy(xpath = "//a[@title=\"Products\"]")
	    WebElement products;
		
		@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-immunity f-male f-metabolism f-muscle-function f-tablets f-young-adults filter-item product-blue product-card first odd last']")
		WebElement centrumMen;
		
		@FindBy(xpath = "(//button[@class='bv_button_buttonMinimalist '])[2]")
		WebElement writeAReview;
		
		@FindBy(xpath = "//*[@role='dialog']")
		WebElement writeReviewPopUp;
		
		@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
		WebElement BuyNow;
		
		@FindBy(xpath = "//h2[text()='Centrum  MEN 40CT']")
		WebElement men40T;
		
		@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
		WebElement buyNowClose;
		
		@FindBy(xpath = "//a[text()='Get Coupons']")
	    WebElement coupons;
		
		@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-immunity f-metabolism f-non-binary f-tablets f-young-adults filter-item product-card product-green first odd last']")
	    WebElement CentrumAdults;
		
		@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-heart f-male f-seniors f-tablets filter-item product-blue product-card first odd last']")
	    WebElement CentrumSilverMen;
		
		@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-gummy f-immunity f-male f-metabolism f-muscle-function f-young-adults filter-item product-blue product-card box_1938611159_copy_']")
	    WebElement centrumMultigummiesMen;
		
		@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-gummy f-heart f-male f-muscle-function f-seniors filter-item product-blue product-card box_1938611159_copy_']")
	    WebElement centrumMultigummiesMen50Plus;
		
		@FindBy(xpath = "(//div[@class='component-content'])[111]")
	    private static WebElement btnMultivitaminscroll;
	    
	    @FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill')])[1]")
	    private static WebElement btnMultivitamins;
	    @FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[1]")
	    private static WebElement scrollDown;
	    
	    @FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill')])[2]")
	    private static WebElement targetedSupplements;
	    
	    @FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill')])[3]")
	    private static WebElement vitaminPacks;
	    
	    @FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill')])[4]")
	    private static WebElement seeAllProduct;

	    @FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']//span[text()='Product Benefits']")
	    private static WebElement productBenefits;
	    
	    @FindBy(xpath = "(//a[text()='Get Coupons'])[1]")
		private static WebElement getCoupons;
		//li[@class='tabs-nav-item odd first is-active']
		@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
		private static WebElement productBenefitOpen;
		
		@FindBy(xpath = "//li[@class='tabs-nav-item even is-active']")
		private static WebElement VitaminsAndMineralsOpen;
		
		@FindBy(xpath = "//li[@class='tabs-nav-item odd is-active']")
		private static WebElement UsageOpen;
		
		@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
		private static WebElement FAQOpen;
		
		@FindBy(xpath = "(//a[@role='tab'])[1]")
		private static WebElement productBenefitTab;
		
		@FindBy(xpath = "(//a[@role='tab'])[2]")
		private static WebElement vitaminsAndMineralsTab;
		
		@FindBy(xpath = "(//a[@role='tab'])[3]")
		private static WebElement UsageTab;
		
		@FindBy(xpath = "(//a[@role='tab'])[4]")
		private static WebElement FAQTab;
		
		@FindBy(xpath = "(//a[text()='View Supplement Facts'])[1]")
		private static WebElement viewSupplementVitamin1;
		
		@FindBy(xpath = "(//a[text()='View Supplement Facts'])[2]")
		private static WebElement viewSupplementVitamin2;
		
		@FindBy(xpath = "//p[text()='Men']")
		private static WebElement txtCentrumMen;
		
		@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white rounded flex')]")
		private static WebElement compareTab;
		
		@FindBy(xpath = "//a[@class='compare-button default-compare btn btn-primary btn-flexible']")
		private static WebElement compareButton;
		

	    
	    @FindBy(xpath = "//a[text()='Choose Your Centrum']")
	    private static WebElement chooseYourCentrum;
		
	    @FindBy(xpath = "//u[text()='non-GMO standard page']")
	    private static WebElement nonGMO;
	    
	    @FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement btnReviewClose;
	    
	    @FindBy(xpath = "(//a[@role='button'])[1]")
		private static WebElement btnBuyNow;
		
		//h2[text()='CENTRUM ORGANIC GUMMY KIDS']
		@FindBy(xpath = "//h2[text()='Centrum Women MultiGummies in Tropical Fruit Flavors']")
		private static WebElement BuyNowProductName;
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement btnBuyNowClose;
	    
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
		
		
		public void clickProductsLink() throws Exception {
			moveToElement(products);
			elementClick(products);
		}
		
		public void clickCentrumMen() throws Exception {
			moveToElement(centrumMen);
			elementClick(centrumMen);
		}
		public void clickWriteAReview() throws Exception {
			moveToElement(writeAReview);
			elementClick(writeAReview);
		}
		public void clickWriteAReviewClose() throws Exception {
			moveToElement(btnReviewClose);
			clickElementUsingJavaScript(btnReviewClose);
		}
		public boolean popUpPresent() throws Exception {
			implicitWait(10);
			return elementIsDisplayed(writeReviewPopUp);
		}
		public void clickBuyNow() throws Exception {
			implicitWait(20);
			elementClick(BuyNow);
		}
		public boolean men40T() throws Exception {
			implicitWait(10);
			return elementIsDisplayed(men40T);
		}
		public void clickBuyNowClose() throws Exception {
			moveToElement(buyNowClose);
			clickElementUsingJavaScript(buyNowClose);
		}
		public void clickCoupons() throws Exception {
			//moveToElement(coupons);
			elementClick(coupons);
		}
		public void clickAdults() throws Exception {
			//moveToElement(coupons);
			elementClick(CentrumAdults);
		}
		public void clickSilverMen() throws Exception {
			//moveToElement(coupons);
			elementClick(CentrumSilverMen);
		}
		public void clickcentrumMultigummiesMen() throws Exception {
			//moveToElement(coupons);
			elementClick(centrumMultigummiesMen);
		}
		public void clickcentrumMultigummiesMen50Plus() throws Exception {
			//moveToElement(coupons);
			elementClick(centrumMultigummiesMen50Plus);
		}
		public void clickMultivitamins() throws Exception {
	        scrollDownUsingElement(btnMultivitamins);
	        elementClick(btnMultivitamins);
	    }
	    
	    public void clickTargetedSupplements() throws Exception {
	        scrollDownUsingElement(targetedSupplements);
	    	implicitWait(10);
	        elementClick(targetedSupplements);
	    }
	    
	    public void clickVitaminPack() throws Exception {
	       scrollDownUsingElement(vitaminPacks);
	    	implicitWait(10);
	        elementClick(vitaminPacks);
	    }
	    
	    public void clickSeeAllProduct() throws Exception {
	       scrollDownUsingElement(seeAllProduct);
	    	implicitWait(10);
	        elementClick(seeAllProduct);
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
			scrollDownUsingElement(vitaminsAndMineralsTab);
			clickElementUsingJavaScript(vitaminsAndMineralsTab);
			boolean elementIsDisplayed = elementIsDisplayed(VitaminsAndMineralsOpen);
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
			boolean elementIsDisplayed = elementIsDisplayed(txtCentrumMen);
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
	    public void clickNonGMO() throws Exception {
	    	scrollDownUsingElement(nonGMO);
			elementClick(nonGMO);	
	    }
	}
