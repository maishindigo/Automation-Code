package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.howSpplementsWork;
import com.qa.centrum.eng.pages.iron;

public class ironTest extends BaseClass {
	iron i;

	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		i = new iron();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("IronPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("IronProd"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		i.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		i.clickCookieBtn();
		System.out.println("cookie button clicked2");
		i.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}

	@Test(priority = 1, enabled = true)
	private void VerifyTab() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.visiblityFoodAndNutrition();
		i.ClickFeaturedProductsTab();
		switchingTab(secondTab);
		i.visiblityFoodAndNutrition();
		i.ClickFeaturedProductsTab();

	}

	@Test(priority = 2, enabled = true)
	private void CentrumAdult() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCentrumAdults();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCentrumAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void CentrumAdultBuyNow() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow1();;

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow1();;
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void CentrumAdultCompare() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareAdult();;

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareAdult();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void CentrumEnergy() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void CentrumEnergyBuyNow() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow3();;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow3();;
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void EnergyCompare() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareEnergy();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void CentrumWomen() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCentrumWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCentrumWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 9, enabled = true)
	private void CentrumWomenBuyNow() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow2();;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow2();;
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void CentrumWomenCompare() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareCentrumWomen();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareCentrumWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 11, enabled = true)
	private void CentrumSilverWomen() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 12, enabled = true)
	private void SilverWomenBuyNow() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow4();;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickBuyNow4();;
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 13, enabled = true)
	private void SilverWomenCompare() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareSilverWomen();

		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		i.ClickFeaturedProductsTab();
		i.clickCompareSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void Vitamin_B6_Button() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonVitamin_B6();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonVitamin_B6();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void Vitamin_B6_Learn_Button() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonVitamin_B6_Learn();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonVitamin_B6_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 16, enabled = true)
	private void Vitamin_B12_Button() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonVitamin_B12();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonVitamin_B12();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 17, enabled = true)
	private void Vitamin_B12_Learn_Button() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonVitamin_B12_Learn();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonVitamin_B12_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 18, enabled = true)
	private void Folic_AcidButton() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonFolic_Acid();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonFolic_Acid();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 19, enabled = true)
	private void Folic_Acid_LearnButton() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonFolic_Acid_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonFolic_Acid_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 20, enabled = true)
	private void Copper_Button() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonCopper();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);

		i.clickonCopper();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 21, enabled = true)
	private void Copper_LearnButton() throws Exception {
		i = new iron();
		switchingTab(firstTab);

		i.clickonCopper_Learn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		// i.clickonVitamins_Minerals();
		i.clickonCopper_Learn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 22, enabled = true)
	private void HowtoTakeVitamins() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.clickHowtoTakeVitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		// i.clickonVitamins_Minerals();
		i.clickHowtoTakeVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 23, enabled = true)
	private void WhatNutrientsDoINeedDuringPregnancy() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.clickWhatNutrientsDoINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		// i.clickonVitamins_Minerals();
		i.clickWhatNutrientsDoINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 24, enabled = true)
	private void ComplexionProtection() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.clickComplexionProtection();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		// i.clickonVitamins_Minerals();
		i.clickComplexionProtection();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 25, enabled = true)
	private void SixWaysToBoostYourEnergy() throws Exception {
		i = new iron();
		switchingTab(firstTab);
		i.clickSixWaysToBoostYourEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		// i.clickonVitamins_Minerals();
		i.clickSixWaysToBoostYourEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	

}
