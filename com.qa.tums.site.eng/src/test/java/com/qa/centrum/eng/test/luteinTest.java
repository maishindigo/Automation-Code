package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.iron;
import com.qa.centrum.eng.pages.lutein;

public class luteinTest extends BaseClass {
	lutein l;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		l = new lutein();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("LuteinPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("LuteinProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		l.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		l.clickCookieBtn();
		System.out.println("cookie button clicked2");
		l.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}

	@Test(priority = 1, enabled = true)
	private void VerifyTab() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.visiblityFoodAndNutrition();
		l.ClickFeaturedProductsTab();
		switchingTab(secondTab);
		l.visiblityFoodAndNutrition();
		l.ClickFeaturedProductsTab();

	}

	@Test(priority = 2, enabled = true)
	private void CentrumAdult() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverAdults();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void BuyNow1() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow1();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void Compare1() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare1();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void SilverMen() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverMen();;

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void BuyNow2() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow2();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void Compare2() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare2();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void SilverWomen() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverWomen();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 9, enabled = true)
	private void BuyNow3() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow3();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void Compare3() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare3();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 11, enabled = true)
	private void MinisAdult50Plus() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickMinisAdult50Plus();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickMinisAdult50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 12, enabled = true)
	private void BuyNow4() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow4();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickBuyNow4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 13, enabled = true)
	private void Compare4() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare4();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.ClickFeaturedProductsTab();
		l.clickCompare4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 14, enabled = true)
	private void EyeHealth() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickEyeHealth();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickEyeHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 15, enabled = true)
	private void EyeHealthLearnMore() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickEyeHealthLeranMore();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickEyeHealthLeranMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 16, enabled = true)
	private void FiveVitaminsMineralsforHealthyEyes() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickFiveVitaminsMineralsforHealthyEyes();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickFiveVitaminsMineralsforHealthyEyes();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 17, enabled = true)
	private void HowtoTakeVitamins() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickHowtoTakeVitamins();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickHowtoTakeVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 18, enabled = true)
	private void FourTipsForMoreBalancedDiet() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickFourTipsForMoreBalancedDiet();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickFourTipsForMoreBalancedDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 19, enabled = true)
	private void tenSimpleWaystoLiveHealthierLife() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clicktenSimpleWaystoLiveHealthierLife();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clicktenSimpleWaystoLiveHealthierLife();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 20, enabled = true)
	private void Vitamin_A() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickVitamin_A();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_A();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 21, enabled = true)
	private void Vitamin_A_Learn() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickVitamin_A_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_A_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 22, enabled = true)
	private void Beta_Catotene() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickBetaCarotene();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickBetaCarotene();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 23, enabled = true)
	private void BetaCarotene_Learn() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickBetaCaroteneLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickBetaCaroteneLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 24, enabled = true)
	private void Lycopene() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickLycopene();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickLycopene_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 25, enabled = true)
	private void Vitamin_C() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickVitamin_C();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_C();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 26, enabled = true)
	private void Vitamin_C_Learn() throws Exception {
		l = new lutein();
		switchingTab(firstTab);
		l.clickVitamin_C_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_C_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
}
