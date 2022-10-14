package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.centrum.eng.pages.CentrumThiaminPage;

public class CentrumSampleThiaminTest extends CentrumThiaminPage {
	
	CentrumThiaminPage th;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/thiamin/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/thiamin/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		th = new CentrumThiaminPage();
		switchingTab(firstTab);
		th.clickCookieBtn();
		th.clickGigyaForm();
		switchingTab(secondTab);
		th.clickCookieBtn();
		th.clickGigyaForm();
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		th.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 2, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		th.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		th.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		th.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		th.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		boolean preProd = th.clickFeaturedProduct();
		Assert.assertTrue(preProd);
		System.out.println("Featured product TAB enabled in the PreProd URL: "+preProd);
		switchingTab(secondTab);
		boolean live = th.clickFeaturedProduct();
		Assert.assertTrue(live);
		System.out.println("Featured product TAB enabled in the Live URL: "+live);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyProductAdultsFiftyPlus() throws Exception {
		switchingTab(firstTab);
		th.clickProductAdultsFiftyPlus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductAdultsFiftyPlus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyProductAdults() throws Exception {
		switchingTab(firstTab);
		th.clickProductAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		th.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		th.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyEnergyFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickEnergyFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickEnergyFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyArticleOneFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickArticleOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyArticleTwoFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickArticleTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 18, enabled = true)
	private void verifyArticleThreeFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickArticleThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyArticleFourFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickArticleFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyLearnMoreOneFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreOneFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreOneFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyLearnMoreTwoFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreTwoFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreTwoFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyLearnMoreThreeFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreThreeFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreThreeFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyLearnMoreFourFeatured() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreFourFeatured();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreFourFeatured();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = th.clickBuyNowOne();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = th.clickBuyNowOne();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 25, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = th.clickBuyNowTwo();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = th.clickBuyNowTwo();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 26, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = th.clickBuyNowThree();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = th.clickBuyNowThree();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 27, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		boolean preProdBuyNow = th.clickBuyNowFour();
		Assert.assertTrue(preProdBuyNow);
		switchingTab(secondTab);
		boolean liveBuyNow = th.clickBuyNowFour();
		Assert.assertTrue(liveBuyNow);
	}
	
	@Test(priority = 28, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		th.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 29, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		th.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 30, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		th.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 31, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		th.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	
	
	

}
