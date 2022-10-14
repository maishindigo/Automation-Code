package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumFolicAcidPage;

public class CentrumSampleFolicAcidTest extends BaseClass{
	
	CentrumFolicAcidPage fa;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/folic-acid/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/folic-acid/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		fa = new CentrumFolicAcidPage();
		switchingTab(firstTab);
		fa.clickCookieBtn();
		fa.clickGigyaForm();
		switchingTab(secondTab);
		fa.clickCookieBtn();
		fa.clickGigyaForm();
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyBrainHealth() throws Exception {
		switchingTab(firstTab);
		fa.clickBrainHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickBrainHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyPregnancy() throws Exception {
		switchingTab(firstTab);
		fa.clickPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		boolean preProd = fa.clickFeaturedProduct();
		Assert.assertTrue(preProd);
		System.out.println("Featured product TAB enabled in the PreProd URL: "+preProd);
		switchingTab(secondTab);
		boolean live = fa.clickFeaturedProduct();
		Assert.assertTrue(live);
		System.out.println("Featured product TAB enabled in the Live URL: "+live);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		fa.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductAdults() throws Exception {
		switchingTab(firstTab);
		fa.clickProductAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickProductAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		fa.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyProductSilverAdults() throws Exception {
		switchingTab(firstTab);
		fa.clickProductSilverAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickProductSilverAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyBrainHealthFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickBrainHealthFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickBrainHealthFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyPregnancyFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickPregnancyFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickPregnancyFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyArticleOneFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyArticleTwoFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 20, enabled = true)
	private void verifyArticleThreeFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyArticleFourFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickArticleFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickArticleFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyLearnMoreOneFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyLearnMoreTwoFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24, enabled = true)
	private void verifyLearnMoreThreeFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 25, enabled = true)
	private void verifyLearnMoreFourFeatured() throws Exception {
		switchingTab(firstTab);
		fa.clickLearnMoreFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickLearnMoreFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 26, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = fa.clickBuyNowOne();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = fa.clickBuyNowOne();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 27, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = fa.clickBuyNowTwo();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = fa.clickBuyNowTwo();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 28, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = fa.clickBuyNowThree();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = fa.clickBuyNowThree();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 29, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = fa.clickBuyNowFour();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = fa.clickBuyNowFour();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 30, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		fa.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 31, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		fa.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 32, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		fa.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 33, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		fa.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		fa.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	

}
