package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.Vitamin_C;

public class vitamin_CTest extends BaseClass {
	Vitamin_C vc;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("Vitamin_CPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("Vitamin_CProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		vc.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		vc.clickCookieBtn();
		System.out.println("cookie button clicked2");
		vc.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}

	@Test(priority = 1, enabled = true)
	private void VerifyTab() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.visiblityFoodAndNutrition();
		vc.ClickFeaturedProductsTab();
		switchingTab(secondTab);
		vc.visiblityFoodAndNutrition();
		vc.ClickFeaturedProductsTab();

	}@Test(priority = 8, enabled = true)
	private void MinisImmuneAndDigestiveSupport() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickImmuneAndDigestiveSupport();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickImmuneAndDigestiveSupport();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void BuyNow1() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow1();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void Compare1() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare1();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void SilverMen() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickSilverMen();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void BuyNow2() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow2();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 7, enabled = true)
	private void Compare2() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare2();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 5, enabled = true)
	private void SilverWomen() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickSilverWomen();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 9, enabled = true)
	private void BuyNow3() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow3();
		
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	private void Compare3() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare3();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 11, enabled = true)
	private void MultiPlusAntioxidants() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickMultiPlusAntioxidants();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickMultiPlusAntioxidants();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 12, enabled = true)
	private void BuyNow4() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickBuyNow4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 13, enabled = true)
	private void Compare4() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.ClickFeaturedProductsTab();
		vc.clickCompare4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 14, enabled = true)
	private void BoneHealth() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickBoneHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickBoneHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 15, enabled = true)
	private void HairSkinNails() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickHairSkinNail();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickHairSkinNail();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 16, enabled = true)
	private void HairSkinNailsLearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickHairSkinNail_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickHairSkinNail_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 17, enabled = true)
	private void ImmuneHealth() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickImmuneHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickImmuneHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 18, enabled = true)
	private void ImmuneHealthLearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickImmuneHealthLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickImmuneHealthLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 19, enabled = true)
	private void ShoreUpYourDefenses() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickShoreUpYourDefenses();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickShoreUpYourDefenses();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 20, enabled = true)
	private void FiveVitaminsAndMineralsforHealthyEyes() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickFiveVitaminsAndMineralsforHealthyEyes();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickFiveVitaminsAndMineralsforHealthyEyes();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 21, enabled = true)
	private void TheSixNutrientsYourDietMayBeMissing() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickTheSixNutrientsYourDietMayBeMissing();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickTheSixNutrientsYourDietMayBeMissing();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 22, enabled = true)
	private void HowtoTakeVitaminsandWhenYouShouldTakThem() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickHowtoTakeVitaminsandWhenYouShouldTakThem();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickHowtoTakeVitaminsandWhenYouShouldTakThem();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 23, enabled = true)
	private void VitaminA() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_A();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_A();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 24, enabled = true)
	private void VitaminALearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_ALearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_ALearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 25, enabled = true)
	private void VitaminE() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_E();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_E();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 26, enabled = true)
	private void VitaminELearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_ELearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_ELearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 27, enabled = true)
	private void VitaminD() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_D();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_D();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 28, enabled = true)
	private void VitaminDLearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickVitamin_DLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickVitamin_DLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 29, enabled = true)
	private void Zinc() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickZinc();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickZinc();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 30, enabled = true)
	private void ZincLearn() throws Exception {
		vc = new Vitamin_C();
		switchingTab(firstTab);
		vc.clickZincLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vc.clickZincLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

}
