package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumAllArticlesPage extends BaseClass{

	public CentrumAllArticlesPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//h3[text()='How Do Vitamins Work?']")
	private static WebElement scroll;

	@FindBy(xpath = "(//strong[text()='Read More'])[1]")
	private static WebElement readMoreOne;
	
	@FindBy(xpath = "(//strong[text()='Read More'])[2]")
	private static WebElement readMoreTwo;
	
	@FindBy(xpath = "//img[@alt='Two women riding a bike by the beach ']")
	private static WebElement scrollDown;

	@FindBy(xpath = "//strong[text()='How Do Vitamins Work?']")
	private static WebElement vitaminWork;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
	private static WebElement study;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement howToTakeVitamin;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
	private static WebElement vitaminsForWomen;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	private static WebElement vitaminsAndMinerals;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement vitaminD;
	
	@FindBy(xpath = "//strong[text()='What Nutrients Do I Need During Pregnancy?']")
	private static WebElement duringPregnancy;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement nutrientsForMen;
	
	@FindBy(xpath = "//a[text()='Show More Articles']")
	private static WebElement showMoreArticle;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Omega-3 Supplements']")
	private static WebElement omega3Supplements; 
	
	@FindBy(xpath = "//strong[text()='How Can Vitamin E Benefit My Health?']")
	private static WebElement vitaminEBenefit;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement healthierLife;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement selfCareRoutine;
	
	@FindBy(xpath = "//strong[text()='5 Things to Do When Not Feeling Well and Bored']")
	private static WebElement feelingWellAndBored;
	
	@FindBy(xpath = "//strong[text()='How to Make Coffee at Home']")
	private static WebElement makeCoffe;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement workFromHome;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement homeMadeLunch;
	
	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement goodForBrain;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	private static WebElement boostYourEnergy;
	
	@FindBy(xpath = "//strong[text()='Over 50? What Your Body Needs More of Now']")
	private static WebElement over50;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
	private static WebElement supportBrainHealth;
	
	@FindBy(xpath = "//strong[text()='How to Keep Your Bones Healthy and Strong']")
	private static WebElement healthAndStrong;
	
	@FindBy(xpath = "//strong[text()='Complexion Protection']")
	private static WebElement complexionProtection;
	
	@FindBy(xpath = "//strong[text()='The 6 Nutrients Your Diet May Be Missing']")
	private static WebElement nutrientsYourDiet;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement immuneHealth;
	
	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	private static WebElement balancedDiet;
	
	@FindBy(xpath = "//strong[text()='What Vitamins Should I Take Daily?']")
	private static WebElement vitaminShouldITakeDaily;
	
	@FindBy(xpath = "//strong[text()='How Vitamin D Benefits Your Health']")
	private static WebElement benefitsYourHealth;
	
	@FindBy(xpath = "//strong[text()='18 Wellness Tips for a Healthier You']")
	private static WebElement wellnessTips;
	
	
	@FindBy(xpath = "//strong[text()='Why are vitamins important?']")
	private static WebElement whyAreVitaminsImportant;
	
	@FindBy(xpath = "//strong[text()='Women’s Vitamins: What You Need to Know']")
	private static WebElement womensVitamins;
	
	@FindBy(xpath = "//strong[text()='Best Multivitamins for Men']")
	private static WebElement bestMultivitaminsForMen;
	
	@FindBy(xpath = "//strong[text()='How Supplements and Multivitamins Work Together']")
	private static WebElement multivitaminsWorkTogether;
	
	@FindBy(xpath = "//strong[text()='Getting Vitamins from Food vs. from Supplements']")
	private static WebElement gettingVitaminsFromFood;
	
	@FindBy(xpath = "//strong[text()='How Much Melatonin Should I Take?']")
	private static WebElement muchMelatonin;
	
	@FindBy(xpath = "//strong[text()='COSMOS-Mind Study Results']")
	private static WebElement mindStudyResults;
	
	@FindBy(xpath = "//strong[text()='Gummy Vitamins for Adults: What You Need to Know']")
	private static WebElement gummyVitaminsForMen;
	
	@FindBy(xpath = "//strong[text()='Debunking Vitamin Myths']")
	private static WebElement debunkingVitamin;
	
	@FindBy(xpath = "//strong[text()='Multivitamins with Iron for Women']")
	private static WebElement multivitaminsWithIron;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Biotin for Men']")
	private static WebElement benefitsOfBiotin;
	
	@FindBy(xpath = "//strong[text()='Keto Vitamins']")
	private static WebElement ketoVitamins;
	
	@FindBy(xpath = "//strong[text()='Natural Sources of Zinc']")
	private static WebElement naturalSources;
	
	@FindBy(xpath = "//strong[text()='Vitamins & Minerals for Healthy Aging']")
	private static WebElement mineralsForHealthyAging;
	
	@FindBy(xpath = "//strong[text()='A Guide to Vitamins for Kids']")
	private static WebElement guideToVitaminsForKids;
	
	@FindBy(xpath = "//strong[text()='Which Vitamins are Antioxidants?']")
	private static WebElement vitaminsAreAntioxidants;
	
	@FindBy(xpath = "//strong[text()='How Much Vitamin B12 Should You Take a Day?']")
	private static WebElement vitaminB12;
	
	@FindBy(xpath = "//strong[text()='Paleo Vitamins and Supplements']")
	private static WebElement paleoVitamins;
	
	@FindBy(xpath = "//strong[text()='Benefits of Folic Acid for Women']")
	private static WebElement benefitsOfFolicAcid;
	
	@FindBy(xpath = "//strong[text()='Learn more about osteoporosis and supporting overall bone health from this guide.']")
	private static WebElement overallBoneHealth;
	
	@FindBy(xpath = "//strong[text()='Iodine Inadequacy']")
	private static WebElement iodineInadequacy;
	
	@FindBy(xpath = "//strong[text()='The Benefits of Ashwagandha Supplements for Stress']")
	private static WebElement supplementsForStress;
	
	@FindBy(xpath = "//strong[text()='Meditation for Stress Management']")
	private static WebElement meditationForStress;
	
	@FindBy(xpath = "//strong[text()='Natural Ways to Improve Circulation']")
	private static WebElement improveCirculation;
	
	@FindBy(xpath = "//strong[text()='Going Vegan? Essential Vitamins & Supplements for Vegans']")
	private static WebElement goingVegan;
	
	@FindBy(xpath = "//strong[text()='Tips for an Easy Daily Vitamin Regimen']")
	private static WebElement easyDailyVitamin;
	
	@FindBy(xpath = "//strong[text()='Choosing a Daily Multivitamin']")
	private static WebElement dailyMultivitamin;
	
	
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

	public void clickReadMoreOne() throws Exception {
		scrollDownUsingElement(scroll);
		moveToElement(readMoreOne);
		elementClick(readMoreOne);
	}
	
	public void clickReadMoreTwo() throws Exception {
		scrollDownUsingElement(scroll);
		moveToElement(readMoreTwo);
		elementClick(readMoreTwo);
	}

	
	public void clickVitaminWork() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(vitaminWork);
	}

	public void clickStudy() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(study);
	}

	public void clickHowToTakeVitamin() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(howToTakeVitamin);
	}
	
	public void clickVitaminsForWomen() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(vitaminsForWomen);
	}
	
	public void clickVitaminsAndMinerals() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(vitaminsAndMinerals);
	}
	
	public void clickVitaminD() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(vitaminD);
	}
	
	public void clickDuringPregnancy() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(duringPregnancy);
	}
	
	public void clickNutrientsForMen() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(nutrientsForMen);
	}
	
	public void scrollArticleOne() throws Exception {
		
		try {
			scrollPageInUpAndDown();
			if (nutrientsForMen.isDisplayed()) {
				scrollDownUsingElement(nutrientsForMen);
				elementToBeClickable(showMoreArticle);
//				elementClick(showMoreArticle);
				clickElementUsingJavaScript(showMoreArticle);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void clickOmega3Supplements() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(nutrientsForMen);
		elementClick(omega3Supplements);
	}
	
	public void clickVitaminEBenefit() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(nutrientsForMen);
		elementClick(vitaminEBenefit);
	}
	
	public void clickHealthierLife() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(nutrientsForMen);
		elementClick(healthierLife);
	}
	
	public void clickSelfCareRoutine() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(nutrientsForMen);
		elementClick(selfCareRoutine);
	}
	
	public void clickFeelingWellAndBored() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(selfCareRoutine);
		elementClick(feelingWellAndBored);
	}
	
	public void clickMakeCoffee() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(selfCareRoutine);
		elementClick(makeCoffe);
	}
	
	public void clickWorkFromHome() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(selfCareRoutine);
		elementClick(workFromHome);
	}
	
	public void clickHomeMadeLunch() throws Exception {
		scrollArticleOne();
		scrollDownUsingElement(selfCareRoutine);
		elementClick(homeMadeLunch);
	}
	
	public void clickGoodForBrain() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(homeMadeLunch);
		elementClick(goodForBrain);
	}
	
	public void clickBoostYourEnergy() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(homeMadeLunch);
		elementClick(boostYourEnergy);
	}
	
	public void clickOver50() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(homeMadeLunch);
		elementClick(over50);
	}
	
	public void clickSupportBrainHealth() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(homeMadeLunch);
		elementClick(supportBrainHealth);
	}
	
	public void clickHealthAndStrong() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(supportBrainHealth);
		elementClick(healthAndStrong);
	}
	
	public void clickComplexionProtection() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(supportBrainHealth);
		elementClick(complexionProtection);
	}
	
	public void clickNutrientsYourDiet() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(supportBrainHealth);
		elementClick(nutrientsYourDiet);
	}
	
	public void clickImmuneHealth() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(supportBrainHealth);
		elementClick(immuneHealth);
	}
	
	public void clickBalancedDiet() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(balancedDiet);
		clickElementUsingJavaScript(balancedDiet);
	}
	
	public void clickVitaminShouldITakeDaily() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(vitaminShouldITakeDaily);
		clickElementUsingJavaScript(vitaminShouldITakeDaily);
	}
	
	public void clickBenefitsYourHealth() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(benefitsYourHealth);
		clickElementUsingJavaScript(benefitsYourHealth);
	}
	
	public void clickWellnessTips() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(wellnessTips);
		clickElementUsingJavaScript(wellnessTips);
	}
	
	public void clickWhyAreVitaminsImportant() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(whyAreVitaminsImportant);
		clickElementUsingJavaScript(whyAreVitaminsImportant);
	}
	
	public void clickWomensVitamins() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(womensVitamins);
		clickElementUsingJavaScript(womensVitamins);
	}
	
	public void clickBestMultivitaminsForMen() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(bestMultivitaminsForMen);
		clickElementUsingJavaScript(bestMultivitaminsForMen);
	}
	
	public void clickMultivitaminsWorkTogether() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(multivitaminsWorkTogether);
		clickElementUsingJavaScript(multivitaminsWorkTogether);
	}
	
	public void clickGettingVitaminsFromFood() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(gettingVitaminsFromFood);
		clickElementUsingJavaScript(gettingVitaminsFromFood);
	}
	
	public void clickMuchMelatonin() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(muchMelatonin);
		clickElementUsingJavaScript(muchMelatonin);
	}
	
	public void clickMindStudyResults() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(mindStudyResults);
		clickElementUsingJavaScript(mindStudyResults);
	}
	
	public void clickGummyVitaminsForMen() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(gummyVitaminsForMen);
		clickElementUsingJavaScript(gummyVitaminsForMen);
	}
	
	public void clickDebunkingVitamin() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(debunkingVitamin);
		clickElementUsingJavaScript(debunkingVitamin);
	}
	
	public void clickMultivitaminsWithIron() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(multivitaminsWithIron);
		clickElementUsingJavaScript(multivitaminsWithIron);
	}
	
	public void clickBenefitsOfBiotin() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(benefitsOfBiotin);
		clickElementUsingJavaScript(benefitsOfBiotin);
	}
	
	public void clickKetoVitamins() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(ketoVitamins);
		clickElementUsingJavaScript(ketoVitamins);
	}
	
	public void clickNaturalSources() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(naturalSources);
		clickElementUsingJavaScript(naturalSources);
	}
	
	public void clickMineralsForHealthyAging() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(mineralsForHealthyAging);
		clickElementUsingJavaScript(mineralsForHealthyAging);
	}
	
	public void clickGuideToVitaminsForKids() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(guideToVitaminsForKids);
		clickElementUsingJavaScript(guideToVitaminsForKids);
	}
	
	public void clickVitaminsAreAntioxidants() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(vitaminsAreAntioxidants);
		clickElementUsingJavaScript(vitaminsAreAntioxidants);
	}
	
	public void clickVitaminB12() throws Exception {
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(vitaminB12);
		clickElementUsingJavaScript(vitaminB12);
	}
	
	public void clickPaleoVitamins() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(paleoVitamins);
		clickElementUsingJavaScript(paleoVitamins);
	}
	
	public void clickBenefitsOfFolicAcid() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(benefitsOfFolicAcid);
		clickElementUsingJavaScript(benefitsOfFolicAcid);
	}
	
	public void clickOverallBoneHealth() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollDownUsingElement(overallBoneHealth);
		clickElementUsingJavaScript(overallBoneHealth);
	}
	
	public void clickIodineInadequacy() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(iodineInadequacy);
		clickElementUsingJavaScript(iodineInadequacy);
	}
	
	public void clickSupplementsForStress() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(supplementsForStress);
		clickElementUsingJavaScript(supplementsForStress);
	}
	
	public void clickMeditationForStress() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(meditationForStress);
		clickElementUsingJavaScript(meditationForStress);
	}
	
	public void clickImproveCirculation() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(improveCirculation);
		clickElementUsingJavaScript(improveCirculation);
	}
	
	public void clickGoingVegan() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(goingVegan);
		clickElementUsingJavaScript(goingVegan);
	}
	
	public void clickEasyDailyVitamin() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(easyDailyVitamin);
		clickElementUsingJavaScript(easyDailyVitamin);
	}
	
	public void clickDailyMultivitamin() throws Exception{
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne();
		scrollArticleOne(); 
		scrollDownUsingElement(dailyMultivitamin);
		clickElementUsingJavaScript(dailyMultivitamin);
	}
}
