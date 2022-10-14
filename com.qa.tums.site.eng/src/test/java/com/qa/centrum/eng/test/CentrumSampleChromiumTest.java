package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumChromiumPage;

public class CentrumSampleChromiumTest extends BaseClass{
	
	CentrumChromiumPage cr;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/chromium/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/chromium/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cr = new CentrumChromiumPage();
		switchingTab(firstTab);
		cr.clickCookieBtn();
		cr.clickGigyaForm();
		switchingTab(secondTab);
		cr.clickCookieBtn();
		cr.clickGigyaForm();
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		cr.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		cr.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		cr.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		cr.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		cr.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		cr.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		cr.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		cr.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		cr.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cr.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		boolean preProd = cr.clickFeaturedProduct();
		Assert.assertTrue(preProd);
		System.out.println("Featured product TAB enabled in the PreProd URL: "+preProd);
		switchingTab(secondTab);
		boolean live = cr.clickFeaturedProduct();
		Assert.assertTrue(live);
		System.out.println("Featured product TAB enabled in the Live URL: "+live);
	}
	
	
		@Test(priority = 11, enabled = true)
		private void verifyProductMen() throws Exception {
			switchingTab(firstTab);
			cr.clickProductMen();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickProductMen();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 12, enabled = true)
		private void verifyProductMen50Plus() throws Exception {
			switchingTab(firstTab);
			cr.clickProductMen50Plus();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickProductMen50Plus();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 13, enabled = true)
		private void verifyProductWomen() throws Exception {
			switchingTab(firstTab);
			cr.clickProductWomen();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickProductWomen();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 14, enabled = true)
		private void verifyProductWomen50Plus() throws Exception {
			switchingTab(firstTab);
			cr.clickProductWomen50Plus();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickProductWomen50Plus();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		
		@Test(priority = 15, enabled = true)
		private void verifyEnergyFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickEnergyFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickEnergyFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 16, enabled = true)
		private void verifyArticleOneFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickArticleOneFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickArticleOneFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 17, enabled = true)
		private void verifyArticleTwoFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickArticleTwoFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickArticleTwoFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		
		@Test(priority = 18, enabled = true)
		private void verifyArticleThreeFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickArticleThreeFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickArticleThreeFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 19, enabled = true)
		private void verifyArticleFourFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickArticleFourFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickArticleFourFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 20, enabled = true)
		private void verifyLearnMoreOneFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickLearnMoreOneFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickLearnMoreOneFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 21, enabled = true)
		private void verifyLearnMoreTwoFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickLearnMoreTwoFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickLearnMoreTwoFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 22, enabled = true)
		private void verifyLearnMoreThreeFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickLearnMoreThreeFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickLearnMoreThreeFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
		
		@Test(priority = 23, enabled = true)
		private void verifyLearnMoreFourFeatured() throws Exception {
			switchingTab(firstTab);
			cr.clickLearnMoreFourFeatured();
			String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
			switchingTab(secondTab);
			cr.clickLearnMoreFourFeatured();
			String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
		}
	
}
	