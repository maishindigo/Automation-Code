package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.lycopene;

public class lycopeneTest extends BaseClass{
	lycopene l;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		l = new lycopene();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("LycopenePreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("LycopeneProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		l = new lycopene();
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
		l = new lycopene();
		switchingTab(firstTab);
		l.visiblityFoodAndNutrition();
		l.ClickFeaturedProductsTab();
		switchingTab(secondTab);
		l.visiblityFoodAndNutrition();
		l.ClickFeaturedProductsTab();

	}
	@Test(priority = 2, enabled = true)
	private void SilverMen() throws Exception {
		l = new lycopene();
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
	@Test(priority = 3, enabled = true)
	private void BuyNow1() throws Exception {
		l = new lycopene();
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
		l = new lycopene();
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
	private void SilverWomen() throws Exception {
		l = new lycopene();
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
	@Test(priority = 6, enabled = true)
	private void BuyNow2() throws Exception {
		l = new lycopene();
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
		l = new lycopene();
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
	private void MinisAdult50Plus() throws Exception {
		l = new lycopene();
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
	@Test(priority = 9, enabled = true)
	private void BuyNow3() throws Exception {
		l = new lycopene();
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
		l = new lycopene();
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
	private void HeartHealth() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickHeartHealth();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickHeartHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 12, enabled = true)
	private void heartHealthLearnMore() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickHeartHealthLeranMore();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickHeartHealthLeranMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 13, enabled = true)
	private void FiveVitaminsMineralsforHealthyEyes() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickfiveVitaminsMineralsforHealthyEyes();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickfiveVitaminsMineralsforHealthyEyes();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 14, enabled = true)
	private void HowtoTakeVitamins() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickHowtoTakeVitamins();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickHowtoTakeVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 15, enabled = true)
	private void FourTipsForMoreBalancedDiet() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickFourTipsForMoreBalancedDiet();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickFourTipsForMoreBalancedDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 16, enabled = true)
	private void tenSimpleWaystoLiveHealthierLife() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clicktenSimpleWaystoLiveHealthierLife();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clicktenSimpleWaystoLiveHealthierLife();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 17, enabled = true)
	private void Vitamin_A() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickVitamin_A();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_A();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 18, enabled = true)
	private void Vitamin_A_Learn() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickVitamin_A_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_A_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 19, enabled = true)
	private void Beta_Catotene() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickBetaCarotene();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickBetaCarotene();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 20, enabled = true)
	private void BetaCarotene_Learn() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickBetaCaroteneLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickBetaCaroteneLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void lutein() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickLutein();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickLutein();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 22, enabled = true)
	private void Lutein_Learn() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickLutein_Learn();;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickLutein_Learn();;
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void Vitamin_E() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickVitamin_E();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_E();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 24, enabled = true)
	private void Vitamin_E_Learn() throws Exception {
		l = new lycopene();
		switchingTab(firstTab);
		l.clickVitamin_E_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		l.clickVitamin_E_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	

}
