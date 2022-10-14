package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumCopperPage;

public class CentrumSampleCooperTest  extends BaseClass{
	
	CentrumCopperPage cu;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/copper/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/copper/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cu = new CentrumCopperPage();
		switchingTab(firstTab);
		cu.clickCookieBtn();
		cu.clickGigyaForm();
		switchingTab(secondTab);
		cu.clickCookieBtn();
		cu.clickGigyaForm();
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		cu.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		boolean preProd = cu.clickFeaturedProduct();
		Assert.assertTrue(preProd);
		System.out.println("Featured product TAB enabled in the PreProd URL: "+preProd);
		switchingTab(secondTab);
		boolean live = cu.clickFeaturedProduct();
		Assert.assertTrue(live);
		System.out.println("Featured product TAB enabled in the Live URL: "+live);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductSilverMen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductSilverMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyEnergyFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickEnergyFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickEnergyFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyArticleOneFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyArticleTwoFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 18, enabled = true)
	private void verifyArticleThreeFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyArticleFourFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyLearnMoreOneFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyLearnMoreTwoFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyLearnMoreThreeFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyLearnMoreFourFeatured() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = cu.clickBuyNowOne();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = cu.clickBuyNowOne();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 25, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = cu.clickBuyNowTwo();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = cu.clickBuyNowTwo();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 26, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = cu.clickBuyNowThree();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = cu.clickBuyNowThree();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 27, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = cu.clickBuyNowFour();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = cu.clickBuyNowFour();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 28, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 29, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 30, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 31, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
}
