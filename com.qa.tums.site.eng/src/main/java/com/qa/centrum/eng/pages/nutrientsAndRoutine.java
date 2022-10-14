package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class nutrientsAndRoutine extends BaseClass {
	
	public nutrientsAndRoutine() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Learn ']")
	WebElement LearnLink;
	
	@FindBy(xpath = "//a[text()='Nutrients and Routine']")
	WebElement nutrientsAndRoutine;
	
	@FindBy(xpath = "(//strong[text()='Read More'])[2]")
	WebElement readMore2;
	
	@FindBy(xpath = "(//strong[text()='Read More'])[1]")
	WebElement readMore1;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement HowtoTakeVitamins;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
	WebElement FiveVitaminsforWomenOver50;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	WebElement FiveVitaminsMineralsforHealthyEyes;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	WebElement TheABCsofVitaminD;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	WebElement WhatNutrientsDoINeedDuringPregnancy;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	WebElement TopFiveNutrientsforMen50Plus;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Omega-3 Supplements']")
	WebElement TheBenefitsoOmegaSupplements;
	
	@FindBy(xpath = "//strong[text()='How Can Vitamin E Benefit My Health?']")
	WebElement HowCanVitaminEBenefitMHealth;
	
	@FindBy(xpath = "//strong[text()='How Vitamin D Benefits Your Health']")
	WebElement HowVitaminDBenefitsYourHealth;
	
	@FindBy(xpath = "//strong[text()='Multivitamins with Iron for Women']")
	WebElement MultivitaminswithIronforWomen;
	
	@FindBy(xpath = "//strong[text()='Tips for an Easy Daily Vitamin Regimen']")
	WebElement TipsforanEasyDailVitaminRegimen;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Biotin for Men']")
	WebElement TheBenefitsofBiotinforMen;
	
	@FindBy(xpath = "//strong[text()='Keto Vitamins']")
	WebElement KetoVitamins;
	
	@FindBy(xpath = "//strong[text()='Natural Sources of Zinc']")
	WebElement NaturalSourcesofZinc;
	
	@FindBy(xpath = "//strong[text()='Vitamins & Minerals for Healthy Aging']")
	WebElement VitaminsMineralsforHealthyAging;
	
	@FindBy(xpath = "//strong[text()='A Guide to Vitamins for Kids']")
	WebElement AGuidetoVitaminsforKids;
	
	@FindBy(xpath = "//strong[text()='Which Vitamins are Antioxidants?']")
	WebElement WhichVitaminsareAntioxidants;
	
	@FindBy(xpath = "//strong[text()='How Much Vitamin B12 Should You Take a Day?']")
	WebElement HowMuchVitaminBShouldYouTakeaDay;
	
	@FindBy(xpath = "//strong[text()='Women’s Vitamins: What You Need to Know']")
	WebElement WomensVitaminsWhatYouNeedtoKnow;
	
	@FindBy(xpath = "//strong[text()='Paleo Vitamins and Supplements']")
	WebElement PaleoVitaminsandSupplements;
	
	@FindBy(xpath = "//strong[text()='Benefits of Folic Acid for Women']")
	WebElement BenefitsofFolicAcidforWomen;
	
	@FindBy(xpath = "//strong[text()='Best Multivitamins for Men']")
	WebElement BestMultivitaminsforMen;
	
	@FindBy(xpath = "//strong[text()='How Supplements and Multivitamins Work Together']")
	WebElement HowSupplementsandMultivitaminsWorkTogether;
	
	@FindBy(xpath = "//strong[text()='Learn more about osteoporosis and supporting overall bone health from this guide.']")
	WebElement LearnMoreAboutOsteoporosisAndSupporting;
	
	@FindBy(xpath = "//strong[text()='Iodine Inadequacy']")
	WebElement IodineInadequacy;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Ashwagandha Supplements for Stress']")
	WebElement TheBenefitsofAshwagandhaSupplementsforStress;
	
	@FindBy(xpath = "//strong[text()='How Much Melatonin Should I Take?']")
	WebElement HowMuchMelatoninShouldITake;
	
	@FindBy(xpath = "//strong[text()='COSMOS-Mind Study Results']")
	WebElement COSMOSMindStudyResults;
	
	@FindBy(xpath = "//strong[text()='Multivitamins for Kids: What You Need to Know']")
	WebElement MultivitaminsforKidsWhatYouNeedtoKnow;
	
	@FindBy(xpath = "//strong[text()='4 Health Benefits of Vitamin C']")
	WebElement FourHealthBenefitsofVitaminC;
	
//	@FindBy(xpath = "//strong[text()='How Much Melatonin Should I Take?']")
//	WebElement HowMuchMelatoninShouldITake;
	
	
//	@FindBy(xpath = "(//strong[text()='Read More'])[1]")
//	WebElement readMore1;
	
	
	
	
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
	public void mouseHoverOnLearnLink() throws Exception {
		moveToElement(LearnLink);
		
	}
	
	public void clickNutrientsAndRoutine() throws Exception {
		moveToElement(nutrientsAndRoutine);
		elementClick(nutrientsAndRoutine);
	}
	
	public void clickReadMore1() throws Exception {
		moveToElement(readMore1);
		clickElementUsingJavaScript(readMore1);
	}
	
	public void clickReadMore2() throws Exception {
		moveToElement(readMore2);
		clickElementUsingJavaScript(readMore2);
	}
	public void clickHowtoTakeVitamins() throws Exception {
		moveToElement(HowtoTakeVitamins);
		clickElementUsingJavaScript(HowtoTakeVitamins);
	}
	public void clickFiveVitaminsforWomenOver50() throws Exception {
		moveToElement(FiveVitaminsforWomenOver50);
		clickElementUsingJavaScript(FiveVitaminsforWomenOver50);
	}
	public void clickFiveVitaminsMineralsforHealthyEyes() throws Exception {
		moveToElement(FiveVitaminsMineralsforHealthyEyes);
		clickElementUsingJavaScript(FiveVitaminsMineralsforHealthyEyes);
	}
	public void clickTheABCsofVitaminD() throws Exception {
		moveToElement(TheABCsofVitaminD);
		clickElementUsingJavaScript(TheABCsofVitaminD);
	}
	public void clickWhatNutrientsDoINeedDuringPregnancy() throws Exception {
		moveToElement(WhatNutrientsDoINeedDuringPregnancy);
		clickElementUsingJavaScript(WhatNutrientsDoINeedDuringPregnancy);
	}
	public void clickTopFiveNutrientsforMen50Plus() throws Exception {
		moveToElement(TopFiveNutrientsforMen50Plus);
		clickElementUsingJavaScript(TopFiveNutrientsforMen50Plus);
	}
	public void clickTheBenefitsoOmegaSupplements() throws Exception {
		moveToElement(TheBenefitsoOmegaSupplements);
		clickElementUsingJavaScript(TheBenefitsoOmegaSupplements);
	}
	public void clickHowCanVitaminEBenefitMHealth() throws Exception {
		moveToElement(HowCanVitaminEBenefitMHealth);
		clickElementUsingJavaScript(HowCanVitaminEBenefitMHealth);
	}
	public void clickHowVitaminDBenefitsYourHealth() throws Exception {
		moveToElement(HowVitaminDBenefitsYourHealth);
		clickElementUsingJavaScript(HowVitaminDBenefitsYourHealth);
	}
	public void clickTipsforanEasyDailVitaminRegimen() throws Exception {
		moveToElement(TipsforanEasyDailVitaminRegimen);
		clickElementUsingJavaScript(TipsforanEasyDailVitaminRegimen);
	}
	public void clickTheBenefitsofBiotinforMen() throws Exception {
		moveToElement(TheBenefitsofBiotinforMen);
		clickElementUsingJavaScript(TheBenefitsofBiotinforMen);
	}
	public void clickKetoVitamins() throws Exception {
		moveToElement(KetoVitamins);
		clickElementUsingJavaScript(KetoVitamins);
	}
	public void clickNaturalSourcesofZinc() throws Exception {
		moveToElement(NaturalSourcesofZinc);
		clickElementUsingJavaScript(NaturalSourcesofZinc);
	}
	public void clickVitaminsMineralsforHealthyAging() throws Exception {
		moveToElement(VitaminsMineralsforHealthyAging);
		clickElementUsingJavaScript(VitaminsMineralsforHealthyAging);
	}
	public void clickAGuidetoVitaminsforKids() throws Exception {
		moveToElement(AGuidetoVitaminsforKids);
		clickElementUsingJavaScript(AGuidetoVitaminsforKids);
	}
	public void clickWhichVitaminsareAntioxidants() throws Exception {
		moveToElement(WhichVitaminsareAntioxidants);
		clickElementUsingJavaScript(WhichVitaminsareAntioxidants);
	}
	public void clickHowMuchVitaminBShouldYouTakeaDay() throws Exception {
		moveToElement(HowMuchVitaminBShouldYouTakeaDay);
		clickElementUsingJavaScript(HowMuchVitaminBShouldYouTakeaDay);
	}
	public void clickWomensVitaminsWhatYouNeedtoKnow() throws Exception {
		moveToElement(WomensVitaminsWhatYouNeedtoKnow);
		clickElementUsingJavaScript(WomensVitaminsWhatYouNeedtoKnow);
	}
	public void clickPaleoVitaminsandSupplements() throws Exception {
		moveToElement(PaleoVitaminsandSupplements);
		clickElementUsingJavaScript(PaleoVitaminsandSupplements);
	}
	public void clickBenefitsofFolicAcidforWomen() throws Exception {
		moveToElement(BenefitsofFolicAcidforWomen);
		clickElementUsingJavaScript(BenefitsofFolicAcidforWomen);
	}
	public void clickBestMultivitaminsforMen() throws Exception {
		moveToElement(BestMultivitaminsforMen);
		clickElementUsingJavaScript(BestMultivitaminsforMen);
	}
	public void clickHowSupplementsandMultivitaminsWorkTogether() throws Exception {
		moveToElement(HowSupplementsandMultivitaminsWorkTogether);
		clickElementUsingJavaScript(HowSupplementsandMultivitaminsWorkTogether);
	}
	public void clickLearnMoreAboutOsteoporosisAndSupporting() throws Exception {
		moveToElement(LearnMoreAboutOsteoporosisAndSupporting);
		clickElementUsingJavaScript(LearnMoreAboutOsteoporosisAndSupporting);
	}
	public void clickIodineInadequacy() throws Exception {
		moveToElement(IodineInadequacy);
		clickElementUsingJavaScript(IodineInadequacy);
	}
	public void clickTheBenefitsofAshwagandhaSupplementsforStress() throws Exception {
		moveToElement(TheBenefitsofAshwagandhaSupplementsforStress);
		clickElementUsingJavaScript(TheBenefitsofAshwagandhaSupplementsforStress);
	}
	public void clickHowMuchMelatoninShouldITake() throws Exception {
		moveToElement(HowMuchMelatoninShouldITake);
		clickElementUsingJavaScript(HowMuchMelatoninShouldITake);
	}
	public void clickCOSMOSMindStudyResults() throws Exception {
		moveToElement(COSMOSMindStudyResults);
		clickElementUsingJavaScript(COSMOSMindStudyResults);
	}
	public void clickMultivitaminsforKidsWhatYouNeedtoKnow() throws Exception {
		moveToElement(MultivitaminsforKidsWhatYouNeedtoKnow);
		clickElementUsingJavaScript(MultivitaminsforKidsWhatYouNeedtoKnow);
	}
	public void clickFourHealthBenefitsofVitaminC() throws Exception {
		moveToElement(FourHealthBenefitsofVitaminC);
		clickElementUsingJavaScript(FourHealthBenefitsofVitaminC);
	}
	


}
