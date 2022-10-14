package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumFaqsPage extends BaseClass{
	
	public CentrumFaqsPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath ="//header[@class='accordion-head active']")
	private static WebElement active;
	
	@FindBy(xpath = "//a[@title='Q: Which Centrum products are gluten-free?']")
	private static WebElement generalProductQuestionTwo;
	
	@FindBy(xpath = "//a[@title='Q: Are Centrum products non-GMO?']")
	private static WebElement generalProductQuestionThree;
	
	@FindBy(xpath = "//a[@title='Q: What are the benefits of taking a multivitamin such as Centrum?']")
	private static WebElement generalProductQuestionFour;
	
	@FindBy(xpath = "//a[@title='Q: Is it harmful to take outdated/expired Centrum?']")
	private static WebElement generalProductQuestionFive;
	
	@FindBy(xpath = "//a[@title='Q: How long can I take Centrum multivitamins?']")
	private static WebElement generalProductQuestionSix;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Men different from Centrum Adults multivitamins?']")
	private static WebElement generalProductQuestionSeven;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Women different from Centrum Adults multivitamins?']")
	private static WebElement generalProductQuestionEight;
	
	@FindBy(xpath = "//a[@title='Q: If I am lactose-intolerant, can I take Centrum multivitamins?']")
	private static WebElement generalProductQuestionNine;
	
	@FindBy(xpath = "//a[@title='Q: What does folic acid do?']")
	private static WebElement ingredientsOne;
	
	@FindBy(xpath = "//a[@title='Q: What do lutein and zeaxanthin do?']")
	private static WebElement ingredientsTwo;
	
	@FindBy(xpath = "//a[@title='Q: How do vitamins A, C, E and zinc support my vision health?']")
	private static WebElement ingredientsThree;
	
	@FindBy(xpath = "//a[@title='Q: What are the benefits of ginseng and B vitamins?']")
	private static WebElement ingredientsFour;
	
	@FindBy(xpath = "//a[@title='Q: Do Centrum multivitamins contain fiber?']")
	private static WebElement ingredientsFive;
	
	@FindBy(xpath = "//a[@title='Q: What is omega-3?']")
	private static WebElement ingredientsSix;
	
	@FindBy(xpath = "//a[@title='Q: What is EPA/DHA?']")
	private static WebElement ingredientsSeven;
	
	@FindBy(xpath = "//a[@title='Q: What is the difference between vitamin D and vitamin D3?']")
	private static WebElement ingredientsEight;
	
	@FindBy(xpath = "//a[@title='Q: Do I need to take Vitamin D?']")
	private static WebElement ingredientsNine;
	
	@FindBy(xpath = "//a[@title='Q: How much Vitamin D is too much?']")
	private static WebElement ingredientsTen;
	
	@FindBy(xpath = "//a[@title='Q: What are sources of Vitamin D?']")
	private static WebElement ingredientsEleven;
	
	@FindBy(xpath = "//a[@title='Q: What is ashwagandha?']")
	private static WebElement ingredientsTweleve;
	
	@FindBy(xpath = "//a[@title='Q: What is melatonin?']")
	private static WebElement ingredientsThirteen;
	
	@FindBy(xpath = "//a[@title='Q: What is CoQ10?']")
	private static WebElement ingredientsFourteen;
	
	@FindBy(xpath = "//a[@title='Q: What is turmeric? Where is it sourced from?']")
	private static WebElement ingredientsFifteen;
	
	@FindBy(xpath = "//a[@title='Q: What is rosehip?']")
	private static WebElement ingredientsSixteen;
	
	@FindBy(xpath = "//a[@title='Q: What is the difference between Centrum Adults and Centrum Silver Adults multivitamins?']")
	private static WebElement centrumSilverOne;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Silver Men different from Centrum Silver Adults multivitamins?']")
	private static WebElement centrumSilverTwo;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Silver Women different from Centrum Silver Adults multivitamins?']")
	private static WebElement centrumSilverThree;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Silver multivitamins easy to swallow?']")
	private static WebElement centrumSilverFour;
	
	@FindBy(xpath = "//a[@title='Q: How is Centrum Specialist Energy specially formulated to support my energy needs?']")
	private static WebElement centrumSpecialistOne;
	
	@FindBy(xpath = "//a[@title='Q: How is Centrum Specialist Heart specially formulated to support my heart health**?']")
	private static WebElement centrumSpecialistTwo;
	
	@FindBy(xpath = "//a[@title='Q: Can kids take Centrum multivitamin tablets?']")
	private static WebElement kidsOne;
	
	@FindBy(xpath = "//a[@title='Q: Are Centrum Kids Chewable Multivitamins, Organic MultiGummies and Tropical Punch MultiGummies made with high fructose corn syrup?']")
	private static WebElement kidsTwo;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum MultiGummies Women different from Centrum MultiGummies Adults multivitamins?']")
	private static WebElement multigummiesOne;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum MultiGummies Men different from Centrum MultiGummies Adults multivitamins?']")
	private static WebElement multigummiesTwo;
	
	@FindBy(xpath = "//a[@title='Q: How many calories does Centrum MultiGummies Men and Women contain?']")
	private static WebElement multigummiesThree;
	
	@FindBy(xpath = "//a[@title='Q: Does Centrum MultiGummies contain gluten?']")
	private static WebElement multigummiesFour;
	
	@FindBy(xpath = "//a[@title='Q: Does Centrum MultiGummies contain any allergens?']")
	private static WebElement multigummiesFive;
	
	@FindBy(xpath = "//a[@title='Q: Is it safe to take Centrum MultiGummies with other Centrum multivitamin products?']")
	private static WebElement multigummiesSix;
	
	@FindBy(xpath = "//a[@title='Q: What is the best time of day to take Centrum MultiGummies?']")
	private static WebElement multigummiesSeven;
	
	@FindBy(xpath = "//a[@title='Q: My Centrum MultiGummies changed colors. Is it still safe to take?']")
	private static WebElement multigummiesEight;
	
	@FindBy(xpath = "//a[@title='Q: Can I take Centrum MultiGummies while pregnant or nursing?']")
	private static WebElement multigummiesNine;
	
	@FindBy(xpath = "//a[@title='Q: Can I take Centrum MultiGummies with my medications?']")
	private static WebElement multigummiesTen;
	
	@FindBy(xpath = "//a[@title='Q: Is Centrum MultiGummies sweetened with artificial sweeteners?']")
	private static WebElement multigummiesEleven;
	
	@FindBy(xpath = "//a[@title='Q: Does Centrum MultiGummies contain artificial colors?']")
	private static WebElement multigummiesTwelve;
	
	@FindBy(xpath = "//a[@title='Q: How many calories does Centrum Tropical Fruit Flavored MultiGummies Men and Women contain?']")
	private static WebElement multigummiesThirteen;
	
	@FindBy(xpath = "//a[@title='Q: Should I take Centrum MultiGummies Multi + Beauty with a separate daily multivitamin?']")
	private static WebElement multiBeautyOne;
	
	@FindBy(xpath = "//a[@title='Q: How does Centrum MultiGummies Multi + Beauty help my hair, skin and nails?']")
	private static WebElement multiBeautyTwo;
	
	@FindBy(xpath = "//a[@title='Q: Is Centrum MultiGummies Multi + Beauty non-GMO?']")
	private static WebElement multiBeautyThree;
	
	@FindBy(xpath = "//a[@title='Q: Should I take Centrum MultiGummies Multi + Beauty with a biotin supplement?']")
	private static WebElement multiBeautyFour;
	
	@FindBy(xpath = "//a[@title='Q: What types of omega-3 are in Centrum MultiGummies Multi + Omega-3?']")
	private static WebElement multiOmega3One;
	
	@FindBy(xpath = "//a[@title='Q: Do Centrum MultiGummies Multi + Omega-3 taste good?']")
	private static WebElement multiOmega3Two;
	
	@FindBy(xpath = "//a[@title='Q: What type of fish do the Multi + Omega-3 products contain?']")
	private static WebElement multiOmega3Three;
	
	@FindBy(xpath = "//a[@title='Q: Should I take Centrum MultiGummies Multi + Omega-3 as my daily multivitamin or do I take it along with another multivitamin product?']")
	private static WebElement multiOmega3Four;
	
	@FindBy(xpath = "//a[@title='Q: What is Centrum Multi + Omega-3 Men 50+?']")
	private static WebElement multiOmega3MenAndWomenOne;
	
	@FindBy(xpath = "//a[@title='Q: What is Centrum Multi + Omega-3 Women 50+?']")
	private static WebElement multiOmega3MenAndWomenTwo;
	
	@FindBy(xpath = "//a[@title='Q: What are the ingredients in Centrum Multi + Omega-3 50+ that support Heart, Brain and Eyes?']")
	private static WebElement multiOmega3MenAndWomenThree;
	
	@FindBy(xpath = "//a[@title='Q: What is the recommended daily serving of Centrum Multi + Omega-3 50+?']")
	private static WebElement multiOmega3MenAndWomenFour;
	
	@FindBy(xpath = "//a[@title='Q: How much omega-3 do I need?']")
	private static WebElement multiOmega3MenAndWomenFive;
	
	@FindBy(xpath = "//a[@title='Q: Should I take Centrum Multi+ Omega-3 50+ with a separate daily multivitamin?']")
	private static WebElement multiOmega3MenAndWomenSix;
	
	@FindBy(xpath = "//a[@title='Q: What is the difference between the Men 50+ and Women 50+ Centrum Multi + Omega-3 products?']")
	private static WebElement multiOmega3MenAndWomenSeven;
	
	@FindBy(xpath = "//a[@title='Q: What is Centrum MultiGummies Multi + Antioxidants?']")
	private static WebElement multiAntioxidantsOne;
	
	@FindBy(xpath = "//a[@title='Q: Is Centrum MultiGummies Multi + Antioxidants gluten free?']")
	private static WebElement multiAntioxidantsTwo;
	
	@FindBy(xpath = "//a[@title='Q: Does Centrum MultiGummies Multi + Antioxidants contain artificial sweeteners?']")
	private static WebElement multiAntioxidantsThree;
	
	@FindBy(xpath = "//a[@title='Q: What are the vitamins and minerals in Centrum MultiGummies Multi + Antioxidants that support immune health?']")
	private static WebElement multiAntioxidantsFour;
	
	@FindBy(xpath = "//a[@title='Q: How do the ingredients in Centrum MultiGummies Multi + Antioxidants differ from other Centrum MultiGummies?']")
	private static WebElement multiAntioxidantsFive;
	
	@FindBy(xpath = "//a[@title='Q: What are the benefits of Centrum MultiGummies Multi + Antioxidants?']")
	private static WebElement multiAntioxidantsSix;
	
	@FindBy(xpath = "//a[@title='Q: How does Centrum MultiGummies Multi + Antioxidants support immunity and vitality?']")
	private static WebElement multiAntioxidantsSeven;
	
	@FindBy(xpath = "//a[@title='Q: Should I take Centrum MultiGummies Multi + Antioxidants with a separate daily multivitamin?']")
	private static WebElement multiAntioxidantsEight;
	
	@FindBy(xpath = "//a[@title='Q: Do Centrum MultiGummies Multi + Antioxidants taste good?']")
	private static WebElement multiAntioxidantsNine;
	
	@FindBy(xpath = "//a[@title='Q: How do Centrum MultiGummies Multi + Antioxidants support brain health?']")
	private static WebElement multiAntioxidantsTen;
	
	@FindBy(xpath = "//a[@title='Q: How do Centrum MultiGummies Multi + Antioxidants support cellular health?']")
	private static WebElement multiAntioxidantsEleven;
	
	@FindBy(xpath = "//a[@title='Q: What is Centrum MultiGummies Men 50+?']")
	private static WebElement menAndWomen50PlusOne;
	
	@FindBy(xpath = "//a[@title='Q: What is Centrum MultiGummies Women 50+?']")
	private static WebElement menAndWomen50PlusTwo;
	
	@FindBy(xpath = "//a[@title='Q: What are the ingredients in Centrum MultiGummies Men 50+ and Women 50+ that support energy, immunity, and metabolism?']")
	private static WebElement menAndWomen50PlusThree;
	
	@FindBy(xpath = "//a[@title='Q: What is the recommended daily serving of Centrum MultiGummies Men 50+ and Women 50+?']")
	private static WebElement menAndWomen50PlusFour;
	
	@FindBy(xpath = "(//a[@title='Q: Can I take another supplement in combination with my Centrum multivitamin?'])[1]")
	private static WebElement targettedSupplementsOne;
	
	@FindBy(xpath = "(//a[@title='Q: Can I take a multivitamin with my Centrum Targeted Supplements?'])[1]")
	private static WebElement targettedSupplementsTwo;
	
	@FindBy(xpath = "//a[@title='Q: What makes Adult Centrum Rest & Renew different from Centrum Adult Gummy Rest & Rejuvenate?']")
	private static WebElement benefitBlendsOne;
	
	@FindBy(xpath = "//a[@title='Q: What makes Centrum Calm & Rebalance different from Centrum Adult Gummy Calm & Reset?']")
	private static WebElement benefitBlendsTwo;
	
	@FindBy(xpath = "//a[@title='Q: What happens if I take more than the suggested daily amount of Organic Multigummies?']")
	private static WebElement centrumOrganicMultigummiesOne;
	
	@FindBy(xpath = "//a[@title='Q: When is the best time of day to take Centrum Organic Multigummies?']")
	private static WebElement centrumOrganicMultigummiesTwo;
	
	@FindBy(xpath = "//a[@title='Q: Are Centrum Organic Multigummies vegetarian?']")
	private static WebElement centrumOrganicMultigummiesThree;
	
	@FindBy(xpath = "//a[@title='Q: How many supplements are in each wellness packet? ']")
	private static WebElement dailyWellnessPacksOne;
	
	@FindBy(xpath = "//a[@title='Q: Why are there 4 supplements in each Wellness Pack?']")
	private static WebElement dailyWellnessPacksTwo;
	
	@FindBy(xpath = "//a[@title='Q: Can I take all 4 supplements at the same time? Are there any interactions?']")
	private static WebElement dailyWellnessPacksThree;
	
	@FindBy(xpath = "//a[@title='Q: Do I need to take the supplements at the same time every day?  What happens if I forget? ']")
	private static WebElement dailyWellnessPacksFour;
	
	@FindBy(xpath = "//a[@title='Q: Do I need to take the supplements with food? Can I take them on an empty stomach?']")
	private static WebElement dailyWellnessPacksFive;
	
	@FindBy(xpath = "//a[@title='Q:  Can I take the supplements separately (versus altogether?)']")
	private static WebElement dailyWellnessPacksSix;
	
	@FindBy(xpath = "//a[@title='Q: Can I take my medications at the same time as the Centrum Daily Wellness Pack?']")
	private static WebElement dailyWellnessPacksSeven;
	
	@FindBy(xpath = "//a[@title='Q: Can I continue to take my other supplements while I am taking my Centrum Daily Wellness Pack? ']")
	private static WebElement dailyWellnessPacksEight;
	
	@FindBy(xpath = "//a[@title='Q: Will these supplements interfere with sleep if taken at night?   ']")
	private static WebElement dailyWellnessPacksNine;
	
	@FindBy(xpath = "//a[@title='Q: Will my Centrum Daily Wellness Pack expire? ']")
	private static WebElement dailyWellnessPacksTen;
	
	@FindBy(xpath = "//a[@title='Q: Where are Centrum Daily Wellness Packs manufactured? ']")
	private static WebElement dailyWellnessPacksEleven;
	
	@FindBy(xpath = "//a[@title='Q: Does my Centrum Daily Wellness Pack contain any of the 8 major allergens (egg, milk, soybean, peanuts, wheat, tree nuts, crustacean shellfish, fish)?   ']")
	private static WebElement dailyWellnessPacksTwelve;
	
	@FindBy(xpath = "//a[@title='Q: Are the Centrum Daily Wellness Packs gluten free? ']")
	private static WebElement dailyWellnessPacksThirteen;
	
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
	
//	public void clickGeneralProductQuestionOne() throws Exception{
//		elementToBeClickable(generalProductQuestionOne);
//		scrollDownUsingElement(generalProductQuestionOne);
//		boolean elementIsDisplayed = elementIsDisplayed(generalProductQuestionOne);
//		Assert.assertTrue(elementIsDisplayed);
//		clickElementUsingJavaScript(generalProductQuestionOne);
//	}
	
	public void clickGeneralProductQuestionTwo() throws Exception {
		scrollDownUsingElement(generalProductQuestionTwo);
		clickElementUsingJavaScript(generalProductQuestionTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionTwo);
		}
	}
	
	public void clickGeneralProductQuestionThree() throws Exception {
		scrollDownUsingElement(generalProductQuestionThree);
		clickElementUsingJavaScript(generalProductQuestionThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionThree);
		}
	}
	
	public void clickGeneralProductQuestionFour() throws Exception {
		scrollDownUsingElement(generalProductQuestionFour);
		clickElementUsingJavaScript(generalProductQuestionFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionFour);
		}
	}
	
	public void clickGeneralProductQuestionFive() throws Exception {
		scrollDownUsingElement(generalProductQuestionFive);
		clickElementUsingJavaScript(generalProductQuestionFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionFive);
		}
	}
	
	public void clickGeneralProductQuestionSix() throws Exception {
		scrollDownUsingElement(generalProductQuestionSix);
		clickElementUsingJavaScript(generalProductQuestionSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionSix);
		}
	}
	
	public void clickGeneralProductQuestionSeven() throws Exception {
		scrollDownUsingElement(generalProductQuestionSeven);
		clickElementUsingJavaScript(generalProductQuestionSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionSeven);
		}
	}
	
	public void clickGeneralProductQuestionEight() throws Exception {
		scrollDownUsingElement(generalProductQuestionEight);
		clickElementUsingJavaScript(generalProductQuestionEight);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionEight);
		}
	}
	
	public void clickGeneralProductQuestionNine() throws Exception {
		scrollDownUsingElement(generalProductQuestionNine);
		clickElementUsingJavaScript(generalProductQuestionNine);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(generalProductQuestionNine);
		}
	}
	
	public void clickIngredientsOne() throws Exception{
		scrollDownUsingElement(ingredientsOne);
		clickElementUsingJavaScript(ingredientsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsOne);
		}
	}
	
	public void clickIngredientsTwo() throws Exception{
		scrollDownUsingElement(ingredientsTwo);
		clickElementUsingJavaScript(ingredientsTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsTwo);
		}
	}
	
	public void clickIngredientsThree() throws Exception{
		scrollDownUsingElement(ingredientsThree);
		clickElementUsingJavaScript(ingredientsThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsThree);
		}
	}
	
	public void clickIngredientsFour() throws Exception{
		scrollDownUsingElement(ingredientsFour);
		clickElementUsingJavaScript(ingredientsFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsFour);
		}
	}
	
	public void clickIngredientsFive() throws Exception{
		scrollDownUsingElement(ingredientsFive);
		clickElementUsingJavaScript(ingredientsFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsFive);
		}
	}
	
	public void clickIngredientsSix() throws Exception{
		scrollDownUsingElement(ingredientsSix);
		clickElementUsingJavaScript(ingredientsSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsSix);
		}
	}
	
	public void clickIngredientsSeven() throws Exception{
		scrollDownUsingElement(ingredientsSeven);
		clickElementUsingJavaScript(ingredientsSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsSeven);
		}
	}
	
	public void clickIngredientsEight() throws Exception{
		scrollDownUsingElement(ingredientsEight);
		clickElementUsingJavaScript(ingredientsEight);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsEight);
		}
	}
	
	public void clickIngredientsNine() throws Exception{
		scrollDownUsingElement(ingredientsNine);
		clickElementUsingJavaScript(ingredientsNine);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsNine);
		}
	}
	
	public void clickIngredientsTen() throws Exception{
		scrollDownUsingElement(ingredientsTen);
		clickElementUsingJavaScript(ingredientsTen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsTen);
		}
	}
	
	public void clickIngredientsEleven() throws Exception{
		scrollDownUsingElement(ingredientsEleven);
		clickElementUsingJavaScript(ingredientsEleven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsEleven);
		}
	}
	
	public void clickIngredientsTweleve() throws Exception{
		scrollDownUsingElement(ingredientsTweleve);
		clickElementUsingJavaScript(ingredientsTweleve);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsTweleve);
		}
	}
	
	public void clickIngredientsThirteen() throws Exception{
		scrollDownUsingElement(ingredientsThirteen);
		clickElementUsingJavaScript(ingredientsThirteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsThirteen);
		}
	}
	
	public void clickIngredientsFourteen() throws Exception{
		scrollDownUsingElement(ingredientsFourteen);
		clickElementUsingJavaScript(ingredientsFourteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsFourteen);
		}
	}
	
	public void clickIngredientsFifteen() throws Exception{
		scrollDownUsingElement(ingredientsFifteen);
		clickElementUsingJavaScript(ingredientsFifteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsFifteen);
		}
	}
	
	public void clickIngredientsSixteen() throws Exception{
		scrollDownUsingElement(ingredientsSixteen);
		clickElementUsingJavaScript(ingredientsSixteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(ingredientsSixteen);
		}
	}
	
	public void clickCentrumSilverOne() throws Exception{
		scrollDownUsingElement(centrumSilverOne);
		clickElementUsingJavaScript(centrumSilverOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSilverOne);
		}
	}
	
	public void clickCentrumSilverTwo() throws Exception{
		scrollDownUsingElement(centrumSilverTwo);
		clickElementUsingJavaScript(centrumSilverTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSilverTwo);
		}
	}
	
	public void clickCentrumSilverThree() throws Exception{
		scrollDownUsingElement(centrumSilverThree);
		clickElementUsingJavaScript(centrumSilverThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSilverThree);
		}
	}
	
	public void clickCentrumSilverFour() throws Exception{
		scrollDownUsingElement(centrumSilverFour);
		clickElementUsingJavaScript(centrumSilverFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSilverFour);
		}
	}
	
	public void clickCentrumSpecialistOne() throws Exception{
		scrollDownUsingElement(centrumSpecialistOne);
		clickElementUsingJavaScript(centrumSpecialistOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSpecialistOne);
		}
	}
	
	public void clickCentrumSpecialistTwo() throws Exception{
		scrollDownUsingElement(centrumSpecialistTwo);
		clickElementUsingJavaScript(centrumSpecialistTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumSpecialistTwo);
		}
	}
	
	public void clickKidsOne() throws Exception{
		scrollDownUsingElement(kidsOne);
		clickElementUsingJavaScript(kidsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(kidsOne);
		}
	}
	
	public void clickKidsTwo() throws Exception{
		scrollDownUsingElement(kidsTwo);
		clickElementUsingJavaScript(kidsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(kidsOne);
		}
	}
	
	public void clickMultigummiesOne() throws Exception{
		scrollDownUsingElement(multigummiesOne);
		clickElementUsingJavaScript(multigummiesOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesOne);
		}
	}
	
	public void clickMultigummiesTwo() throws Exception{
		scrollDownUsingElement(multigummiesTwo);
		clickElementUsingJavaScript(multigummiesTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesTwo);
		}
	}
	
	public void clickMultigummiesThree() throws Exception{
		scrollDownUsingElement(multigummiesThree);
		clickElementUsingJavaScript(multigummiesThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesThree);
		}
	}
	
	public void clickMultigummiesFour() throws Exception{
		scrollDownUsingElement(multigummiesFour);
		clickElementUsingJavaScript(multigummiesFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesFour);
		}
	}
	
	public void clickMultigummiesFive() throws Exception{
		scrollDownUsingElement(multigummiesFive);
		clickElementUsingJavaScript(multigummiesFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesFive);
		}
	}
	
	public void clickMultigummiesSix() throws Exception{
		scrollDownUsingElement(multigummiesSix);
		clickElementUsingJavaScript(multigummiesSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesSix);
		}
	}
	
	public void clickMultigummiesSeven() throws Exception{
		scrollDownUsingElement(multigummiesSeven);
		clickElementUsingJavaScript(multigummiesSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesSeven);
		}
	}
	
	
	public void clickMultigummiesEight() throws Exception{
		scrollDownUsingElement(multigummiesEight);
		clickElementUsingJavaScript(multigummiesEight);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesEight);
		}
	}
	
	
	public void clickMultigummiesNine() throws Exception{
		scrollDownUsingElement(multigummiesNine);
		clickElementUsingJavaScript(multigummiesNine);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesNine);
		}
	}
	
	public void clickMultigummiesTen() throws Exception{
		scrollDownUsingElement(multigummiesTen);
		clickElementUsingJavaScript(multigummiesTen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesTen);
		}
	}
	
	public void clickMultigummiesEleven() throws Exception{
		scrollDownUsingElement(multigummiesEleven);
		clickElementUsingJavaScript(multigummiesEleven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesEleven);
		}
	}
	
	public void clickMultigummiesTwelve() throws Exception{
		scrollDownUsingElement(multigummiesTwelve);
		clickElementUsingJavaScript(multigummiesTwelve);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesTwelve);
		}
	}
	
	public void clickMultigummiesThirteen() throws Exception{
		scrollDownUsingElement(multigummiesThirteen);
		clickElementUsingJavaScript(multigummiesThirteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multigummiesThirteen);
		}
	}
	
	public void clickMultiBeautyOne() throws Exception{
		scrollDownUsingElement(multiBeautyOne);
		clickElementUsingJavaScript(multiBeautyOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiBeautyOne);
		}
	}
	
	public void clickMultiBeautyTwo() throws Exception{
		scrollDownUsingElement(multiBeautyTwo);
		clickElementUsingJavaScript(multiBeautyTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiBeautyTwo);
		}
	}
	
	public void clickMultiBeautyThree() throws Exception{
		scrollDownUsingElement(multiBeautyThree);
		clickElementUsingJavaScript(multiBeautyThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiBeautyThree);
		}
	}
	
	public void clickMultiBeautyFour() throws Exception{
		scrollDownUsingElement(multiBeautyFour);
		clickElementUsingJavaScript(multiBeautyFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiBeautyFour);
		}
	}
	
	public void clickMultiOmega3One() throws Exception{
		scrollDownUsingElement(multiOmega3One);
		clickElementUsingJavaScript(multiOmega3One);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3One);
		}
	}
	
	public void clickMultiOmega3Two() throws Exception{
		scrollDownUsingElement(multiOmega3Two);
		clickElementUsingJavaScript(multiOmega3Two);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3Two);
		}
	}
	
	public void clickMultiOmega3Three() throws Exception{
		scrollDownUsingElement(multiOmega3Three);
		clickElementUsingJavaScript(multiOmega3Three);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3Three);
		}
	}
	
	public void clickMultiOmega3Four() throws Exception{
		scrollDownUsingElement(multiOmega3Four);
		clickElementUsingJavaScript(multiOmega3Four);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3Four);
		}
	}
	
	
	public void clickMultiOmega3MenAndWomenOne() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenOne);
		clickElementUsingJavaScript(multiOmega3MenAndWomenOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenOne);
		}
	}
	
	public void clickMultiOmega3MenAndWomenTwo() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenTwo);
		clickElementUsingJavaScript(multiOmega3MenAndWomenTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenTwo);
		}
	}
	
	public void clickMultiOmega3MenAndWomenThree() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenThree);
		clickElementUsingJavaScript(multiOmega3MenAndWomenThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenThree);
		}
	}
	
	public void clickMultiOmega3MenAndWomenFour() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenFour);
		clickElementUsingJavaScript(multiOmega3MenAndWomenFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenFour);
		}
	}
	
	public void clickMultiOmega3MenAndWomenFive() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenFive);
		clickElementUsingJavaScript(multiOmega3MenAndWomenFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenFive);
		}
	}
	
	public void clickMultiOmega3MenAndWomenSix() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenSix);
		clickElementUsingJavaScript(multiOmega3MenAndWomenSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenSix);
		}
	}
	
	public void clickMultiOmega3MenAndWomenSeven() throws Exception{
		scrollDownUsingElement(multiOmega3MenAndWomenSeven);
		clickElementUsingJavaScript(multiOmega3MenAndWomenSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiOmega3MenAndWomenSeven);
		}
	}
	
	public void clickMultiAntioxidantsOne() throws Exception{
		scrollDownUsingElement(multiAntioxidantsOne);
		clickElementUsingJavaScript(multiAntioxidantsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsOne);
		}
	}
	
	public void clickMultiAntioxidantsTwo() throws Exception{
		scrollDownUsingElement(multiAntioxidantsTwo);
		clickElementUsingJavaScript(multiAntioxidantsTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsTwo);
		}
	}
	
	public void clickMultiAntioxidantsThree() throws Exception{
		scrollDownUsingElement(multiAntioxidantsThree);
		clickElementUsingJavaScript(multiAntioxidantsThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsThree);
		}
	}
	
	public void clickMultiAntioxidantsFour() throws Exception{
		scrollDownUsingElement(multiAntioxidantsFour);
		clickElementUsingJavaScript(multiAntioxidantsFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsFour);
		}
	}
	
	public void clickMultiAntioxidantsFive() throws Exception{
		scrollDownUsingElement(multiAntioxidantsFive);
		clickElementUsingJavaScript(multiAntioxidantsFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsFive);
		}
	}
	
	public void clickMultiAntioxidantsSix() throws Exception{
		scrollDownUsingElement(multiAntioxidantsSix);
		clickElementUsingJavaScript(multiAntioxidantsSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsSix);
		}
	}
	
	public void clickMultiAntioxidantsSeven() throws Exception{
		scrollDownUsingElement(multiAntioxidantsSeven);
		clickElementUsingJavaScript(multiAntioxidantsSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsSeven);
		}
	}
	
	public void clickMultiAntioxidantsEight() throws Exception{
		scrollDownUsingElement(multiAntioxidantsEight);
		clickElementUsingJavaScript(multiAntioxidantsEight);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsEight);
		}
	}
	
	public void clickMultiAntioxidantsNine() throws Exception{
		scrollDownUsingElement(multiAntioxidantsNine);
		clickElementUsingJavaScript(multiAntioxidantsNine);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsNine);
		}
	}
	
	public void clickMultiAntioxidantsTen() throws Exception{
		scrollDownUsingElement(multiAntioxidantsTen);
		clickElementUsingJavaScript(multiAntioxidantsTen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsTen);
		}
	}
	
	public void clickMultiAntioxidantsEleven() throws Exception{
		scrollDownUsingElement(multiAntioxidantsEleven);
		clickElementUsingJavaScript(multiAntioxidantsEleven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(multiAntioxidantsEleven);
		}
	}
	
	public void clickMenAndWomen50PlusOne() throws Exception{
		scrollDownUsingElement(menAndWomen50PlusOne);
		clickElementUsingJavaScript(menAndWomen50PlusOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(menAndWomen50PlusOne);
		}
	}
	
	public void clickMenAndWomen50PlusTwo() throws Exception{
		scrollDownUsingElement(menAndWomen50PlusTwo);
		clickElementUsingJavaScript(menAndWomen50PlusTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(menAndWomen50PlusTwo);
		}
	}
	
	public void clickMenAndWomen50PlusThree() throws Exception{
		scrollDownUsingElement(menAndWomen50PlusThree);
		clickElementUsingJavaScript(menAndWomen50PlusThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(menAndWomen50PlusThree);
		}
	}
	
	public void clickMenAndWomen50PlusFour() throws Exception{
		scrollDownUsingElement(menAndWomen50PlusFour);
		clickElementUsingJavaScript(menAndWomen50PlusFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(menAndWomen50PlusFour);
		}
	}
	
	public void clickTargettedSupplementsOne() throws Exception{
		scrollDownUsingElement(targettedSupplementsOne);
		clickElementUsingJavaScript(targettedSupplementsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(targettedSupplementsOne);
		}
	}
	
	public void clickTargettedSupplementsTwo() throws Exception{
		scrollDownUsingElement(targettedSupplementsTwo);
		clickElementUsingJavaScript(targettedSupplementsTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(targettedSupplementsTwo);
		}
	}
	
	public void clickBenefitBlendsOne() throws Exception{
		scrollDownUsingElement(benefitBlendsOne);
		clickElementUsingJavaScript(benefitBlendsOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(benefitBlendsOne);
		}
	}
	
	public void clickBenefitBlendsTwo() throws Exception{
		scrollDownUsingElement(benefitBlendsTwo);
		clickElementUsingJavaScript(benefitBlendsTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(benefitBlendsTwo);
		}
	}
	
	public void clickCentrumOrganicMultigummiesOne() throws Exception{
		scrollDownUsingElement(centrumOrganicMultigummiesOne);
		clickElementUsingJavaScript(centrumOrganicMultigummiesOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumOrganicMultigummiesOne);
		}
	}
	
	public void clickCentrumOrganicMultigummiesTwo() throws Exception{
		scrollDownUsingElement(centrumOrganicMultigummiesTwo);
		clickElementUsingJavaScript(centrumOrganicMultigummiesTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumOrganicMultigummiesTwo);
		}
	}
	
	public void clickCentrumOrganicMultigummiesThree() throws Exception{
		scrollDownUsingElement(centrumOrganicMultigummiesThree);
		clickElementUsingJavaScript(centrumOrganicMultigummiesThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(centrumOrganicMultigummiesThree);
		}
	}
	
	
	public void clickDailyWellnessPacksOne() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksOne);
		clickElementUsingJavaScript(dailyWellnessPacksOne);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksOne);
		}
	}
	
	public void clickDailyWellnessPacksTwo() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksTwo);
		clickElementUsingJavaScript(dailyWellnessPacksTwo);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksTwo);
		}
	}
	
	public void clickDailyWellnessPacksThree() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksThree);
		clickElementUsingJavaScript(dailyWellnessPacksThree);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksThree);
		}
	}
	
	public void clickDailyWellnessPacksFour() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksFour);
		clickElementUsingJavaScript(dailyWellnessPacksFour);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksFour);
		}
	}
	
	public void clickDailyWellnessPacksFive() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksFive);
		clickElementUsingJavaScript(dailyWellnessPacksFive);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksFive);
		}
	}
	
	public void clickDailyWellnessPacksSix() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksSix);
		clickElementUsingJavaScript(dailyWellnessPacksSix);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksSix);
		}
	}
	
	public void clickDailyWellnessPacksSeven() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksSeven);
		clickElementUsingJavaScript(dailyWellnessPacksSeven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksSeven);
		}
	}
	
	public void clickDailyWellnessPacksEight() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksEight);
		clickElementUsingJavaScript(dailyWellnessPacksEight);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksEight);
		}
	}
	
	public void clickDailyWellnessPacksNine() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksNine);
		clickElementUsingJavaScript(dailyWellnessPacksNine);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksNine);
		}
	}
	
	public void clickDailyWellnessPacksTen() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksTen);
		clickElementUsingJavaScript(dailyWellnessPacksTen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksTen);
		}
	}
	
	public void clickDailyWellnessPacksEleven() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksEleven);
		clickElementUsingJavaScript(dailyWellnessPacksEleven);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksEleven);
		}
	}
	
	public void clickDailyWellnessPacksTwelve() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksTwelve);
		clickElementUsingJavaScript(dailyWellnessPacksTwelve);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksTwelve);
		}
	}
	
	public void clickDailyWellnessPacksThirteen() throws Exception{
		scrollDownUsingElement(dailyWellnessPacksThirteen);
		clickElementUsingJavaScript(dailyWellnessPacksThirteen);
		if (active.isDisplayed()) {
			Assert.assertTrue(elementIsDisplayed(active));
			clickElementUsingJavaScript(dailyWellnessPacksThirteen);
		}
	}
	
	
}
