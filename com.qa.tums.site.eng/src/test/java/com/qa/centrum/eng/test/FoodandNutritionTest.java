package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.FoodandNutrition;
import com.qa.centrum.eng.pages.nutrientsAndRoutine;

public class FoodandNutritionTest extends BaseClass {
	FoodandNutrition fn;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		fn = new FoodandNutrition();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("preprod"));
		fn.mouseHoverOnLearnLink();
		fn.clickNutrientsAndRoutine();;
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("prod"));
		fn.mouseHoverOnLearnLink();
		fn.clickNutrientsAndRoutine();;
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		fn = new FoodandNutrition();
		switchingTab(firstTab);
		fn.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		fn.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		fn.clickCookieBtn();
		System.out.println("cookie button clicked2");
	fn.clickGigyaForm();
		System.out.println("gigya clicked 2");

}
	@Test(priority = 1, enabled = true)
	private void VerifyReadMore1() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickReadMore1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickReadMore1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyReadMore2() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickReadMore1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickReadMore1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyThe6NutrientsYourDietMayBeMissing() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickThe6NutrientsYourDietMayBeMissing();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickThe6NutrientsYourDietMayBeMissing();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyShoreUpYourDefenses() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickShoreUpYourDefenses();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickShoreUpYourDefenses();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyfourTipsforaMoreBalancedDiet() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickfourTipsforaMoreBalancedDiet();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickfourTipsforaMoreBalancedDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyGoingVegan() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickGoingVegan();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickGoingVegan();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 1, enabled = true)
	private void VerifyGettingVitaminsfromFoodvsfromSupplements() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		fn.clickGettingVitaminsfromFoodvsfromSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fn.clickGettingVitaminsfromFoodvsfromSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	
	
}
