package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.lycopene;
import com.qa.centrum.eng.pages.magnesium;

public class magnesiumTest extends BaseClass {
	magnesium mag;

	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("MagnesiumPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("MagnesiumProd"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		mag.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		mag.clickCookieBtn();
		System.out.println("cookie button clicked2");
		mag.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}

	@Test(priority = 1, enabled = true)
	private void VerifyTab() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.visiblityFoodAndNutrition();
		mag.ClickFeaturedProductsTab();
		switchingTab(secondTab);
		mag.visiblityFoodAndNutrition();
		mag.ClickFeaturedProductsTab();

	}

	@Test(priority = 2, enabled = true)
	private void SilverMen() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickSilverMen();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void BuyNow1() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow1();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void Compare1() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare1();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 5, enabled = true)
	private void MinisMen50Plus() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickminisMen50Plus();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickminisMen50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 6, enabled = true)
	private void BuyNow2() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow2();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 7, enabled = true)
	private void Compare2() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare2();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 8, enabled = true)
	private void minisAdult50plus() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickMinisAdult50Plus();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickMinisAdult50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 9, enabled = true)
	private void BuyNow3() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow3();
		
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	private void Compare3() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare3();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 11, enabled = true)
	private void SilverAdult() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickSilverAdults();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickSilverAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 12, enabled = true)
	private void BuyNow4() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickBuyNow4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 13, enabled = true)
	private void Compare4() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare4();
		;
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.ClickFeaturedProductsTab();
		mag.clickCompare4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void HeartHealth() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickHeartHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickHeartHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void heartHealthLearnMore() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickHeartHealthLeranMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickHeartHealthLeranMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 16, enabled = true)
	private void BoneHealth() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickBoneHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickBoneHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 17, enabled = true)
	private void BoneHealthLearnMore() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickHeartHealthLeranMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickHeartHealthLeranMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 18, enabled = true)
	private void HowToKeepsYourBones() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickHowToKeepsYourBones();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickHowToKeepsYourBones();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 19, enabled = true)
	private void FourTipsForMoreBalancedDiets() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickFourTipsForMoreBalancedDiet();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickFourTipsForMoreBalancedDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 20, enabled = true)
	private void WhatNutrientsDINeedDuringPregnancy() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickWhatNutrientsDINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickWhatNutrientsDINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 21, enabled = true)
	private void ComplexionProtection() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickComplexionProtection();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickComplexionProtection();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void Maganese() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickMaganese();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickMaganese();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 23, enabled = true)
	private void Maganese_Learn() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickMaganeseLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickMaganeseLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 24, enabled = true)
	private void VitaminD() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickVitaminD();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickVitaminD();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 25, enabled = true)
	private void VitaminDLearn() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickVitaminDLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickVitaminDLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 26, enabled = true)
	private void Calcium() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickCalcium();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickCalcium();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 27, enabled = true)
	private void CalciumLearn() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickCalciumLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickCalciumLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 28, enabled = true)
	private void Phosphorus() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickPhosphorus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickPhosphorus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 29, enabled = true)
	private void PhosphorusLearn() throws Exception {
		mag = new magnesium();
		switchingTab(firstTab);
		mag.clickPhosphorusLearn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mag.clickPhosphorusLearn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	

}
