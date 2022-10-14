package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.centrum.eng.pages.CentrumVitaminB6Page;

public class CentrumSampleVitaminB6Test extends CentrumVitaminB6Page{

	CentrumVitaminB6Page vb;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/vitamin-b6/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/vitamin-b6/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vb = new CentrumVitaminB6Page();
		switchingTab(firstTab);
		vb.clickCookieBtn();
		vb.clickGigyaForm();
		switchingTab(secondTab);
		vb.clickCookieBtn();
		vb.clickGigyaForm();
	}

	
	@Test(priority = 1, enabled = true)
	private void verifyHeartHealth() throws Exception {
		switchingTab(firstTab);
		vb.clickHeartHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickHeartHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		vb.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyBrainHealth() throws Exception {
		switchingTab(firstTab);
		vb.clickBrainHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBrainHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 6, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		boolean preProd = vb.clickFeaturedProduct();
		Assert.assertTrue(preProd);
		System.out.println("Featured product TAB enabled in the PreProd URL: "+preProd);
		switchingTab(secondTab);
		boolean live = vb.clickFeaturedProduct();
		Assert.assertTrue(live);
		System.out.println("Featured product TAB enabled in the Live URL: "+live);
	}


	@Test(priority = 13, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductMultiGummiesMen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductMultiGummiesMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductMultiGummiesMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyProductWomensMultivitamin() throws Exception {
		switchingTab(firstTab);
		vb.clickProductWomensMultivitamin();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductWomensMultivitamin();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyHeartHealthFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickHeartHealthFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickHeartHealthFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyEnergyFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickEnergyFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickEnergyFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyBrainHealthFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickBrainHealthFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBrainHealthFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyArticleOneFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyArticleTwoFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 22, enabled = true)
	private void verifyArticleThreeFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyArticleFourFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24, enabled = true)
	private void verifyLearnMoreOneFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 25, enabled = true)
	private void verifyLearnMoreTwoFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 26, enabled = true)
	private void verifyLearnMoreThreeFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 27, enabled = true)
	private void verifyLearnMoreFourFeatured() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 28, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = vb.clickBuyNowOne();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = vb.clickBuyNowOne();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 29, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = vb.clickBuyNowTwo();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = vb.clickBuyNowTwo();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 30, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = vb.clickBuyNowThree();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = vb.clickBuyNowThree();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 31, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = vb.clickBuyNowFour();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = vb.clickBuyNowFour();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 32, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 33, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 34, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 35, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


}
