package com.qa.centrum.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.nutrientsAndRoutine;
import com.qa.centrum.eng.pages.wellnessBenefits;

public class nutrientsAndRoutineTest extends BaseClass {
	nutrientsAndRoutine nr;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("preprod"));
		nr.mouseHoverOnLearnLink();
		nr.clickNutrientsAndRoutine();;
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("prod"));
		nr.mouseHoverOnLearnLink();
		nr.clickNutrientsAndRoutine();;
	}
	
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		nr.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		nr.clickCookieBtn();
		System.out.println("cookie button clicked2");
		nr.clickGigyaForm();
		System.out.println("gigya clicked 2");

}
	@Test(priority = 1, enabled = true)
	private void VerifyReadMore1() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickReadMore1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickReadMore1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 2, enabled = true)
	private void VerifyReadMore2() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickReadMore2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickReadMore2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 3, enabled = true)
	private void VerifyHowtoTakeVitamins() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowtoTakeVitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowtoTakeVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 4, enabled = true)
	private void VerifyFiveVitaminsforWomenOver50() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickFiveVitaminsforWomenOver50();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickFiveVitaminsforWomenOver50();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 5, enabled = true)
	private void VerifyFiveVitaminsMineralsforHealthyEyes() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickFiveVitaminsMineralsforHealthyEyes();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickFiveVitaminsMineralsforHealthyEyes();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 6, enabled = true)
	private void VerifyTheABCsofVitaminD() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTheABCsofVitaminD();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTheABCsofVitaminD();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 7, enabled = true)
	private void VerifyWhatNutrientsDoINeedDuringPregnancy() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickWhatNutrientsDoINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickWhatNutrientsDoINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 8, enabled = true)
	private void VerifyTopFiveNutrientsforMen50Plus() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTopFiveNutrientsforMen50Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTopFiveNutrientsforMen50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 9, enabled = true)
	private void VerifyTheBenefitsoOmegaSupplements() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTheBenefitsoOmegaSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTheBenefitsoOmegaSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 10, enabled = true)
	private void VerifyHowCanVitaminEBenefitMHealth() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowCanVitaminEBenefitMHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowCanVitaminEBenefitMHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 11, enabled = true)
	private void VerifyHowVitaminDBenefitsYourHealth() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowVitaminDBenefitsYourHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowVitaminDBenefitsYourHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 12, enabled = true)
	private void VerifyTipsforanEasyDailVitaminRegimen() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTipsforanEasyDailVitaminRegimen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTipsforanEasyDailVitaminRegimen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 13, enabled = true)
	private void VerifyTheBenefitsofBiotinforMen() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTheBenefitsofBiotinforMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTheBenefitsofBiotinforMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 14, enabled = true)
	private void VerifyKetoVitamins() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickKetoVitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickKetoVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 15, enabled = true)
	private void VerifyNaturalSourcesofZinc() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickNaturalSourcesofZinc();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickNaturalSourcesofZinc();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 16, enabled = true)
	private void VerifyVitaminsMineralsforHealthyAging() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickVitaminsMineralsforHealthyAging();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickVitaminsMineralsforHealthyAging();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 17, enabled = true)
	private void VerifyAGuidetoVitaminsforKids() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickAGuidetoVitaminsforKids();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickAGuidetoVitaminsforKids();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 18, enabled = true)
	private void VerifyWhichVitaminsareAntioxidants() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickWhichVitaminsareAntioxidants();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickWhichVitaminsareAntioxidants();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 19, enabled = true)
	private void VerifyHowMuchVitaminBShouldYouTakeaDay() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowMuchVitaminBShouldYouTakeaDay();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowMuchVitaminBShouldYouTakeaDay();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 20, enabled = true)
	private void VerifyWomensVitaminsWhatYouNeedtoKnow() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickWomensVitaminsWhatYouNeedtoKnow();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickWomensVitaminsWhatYouNeedtoKnow();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 21, enabled = true)
	private void VerifyPaleoVitaminsandSupplements() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickPaleoVitaminsandSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickPaleoVitaminsandSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 22, enabled = true)
	private void VerifyBenefitsofFolicAcidforWomen() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickBenefitsofFolicAcidforWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickBenefitsofFolicAcidforWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 23, enabled = true)
	private void VerifyBestMultivitaminsforMen() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickBestMultivitaminsforMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickBestMultivitaminsforMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 24, enabled = true)
	private void VerifyHowSupplementsandMultivitaminsWorkTogether() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowSupplementsandMultivitaminsWorkTogether();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowSupplementsandMultivitaminsWorkTogether();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 25, enabled = true)
	private void VerifyLearnMoreAboutOsteoporosisAndSupporting() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickLearnMoreAboutOsteoporosisAndSupporting();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickLearnMoreAboutOsteoporosisAndSupporting();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 26, enabled = true)
	private void VerifyIodineInadequacy() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickIodineInadequacy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickIodineInadequacy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	@Test(priority = 27, enabled = true)
	private void VerifyTheBenefitsofAshwagandhaSupplementsforStress() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickTheBenefitsofAshwagandhaSupplementsforStress();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickTheBenefitsofAshwagandhaSupplementsforStress();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 28, enabled = true)
	private void VerifyHowMuchMelatoninShouldITake() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickHowMuchMelatoninShouldITake();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickHowMuchMelatoninShouldITake();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 29, enabled = true)
	private void VerifyCOSMOSMindStudyResults() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickCOSMOSMindStudyResults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickCOSMOSMindStudyResults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 30, enabled = true)
	private void VerifyMultivitaminsforKidsWhatYouNeedtoKnow() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickMultivitaminsforKidsWhatYouNeedtoKnow();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickMultivitaminsforKidsWhatYouNeedtoKnow();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 31, enabled = true)
	private void VerifyFourHealthBenefitsofVitaminC() throws Exception {
		nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		nr.clickFourHealthBenefitsofVitaminC();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nr.clickFourHealthBenefitsofVitaminC();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

	

}
