package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumAllArticlesPage;
import com.qa.centrum.eng.pages.CentrumTipsForAMoreBalancedDietPage;

public class CentrumSampleTipsForAMoreBalancedDietTest extends BaseClass{
	
	CentrumTipsForAMoreBalancedDietPage bd;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/food-and-nutrition/4-tips-for-a-more-balanced-diet/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/food-and-nutrition/4-tips-for-a-more-balanced-diet/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		bd = new CentrumTipsForAMoreBalancedDietPage();
		switchingTab(firstTab);
		bd.clickCookieBtn();
		bd.clickGigyaForm();
		switchingTab(secondTab);
		bd.clickCookieBtn();
		bd.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyLinkOverAllHealth() throws Exception {
		switchingTab(firstTab);
		bd.clickLinkOverAllHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bd.clickLinkOverAllHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		bd.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		bd.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}
	
	@Test(priority = 3)
	private void verifyNutrientsYourDiet() throws Exception {
		switchingTab(firstTab);
		bd.clickNutrientsYourDiet();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bd.clickNutrientsYourDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBoostYourEnergy() throws Exception {
		switchingTab(firstTab);
		bd.clickBoostYourEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bd.clickBoostYourEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHealtheirLife() throws Exception {
		switchingTab(firstTab);
		bd.clickHealtheirLife();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bd.clickHealtheirLife();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyBrainHealth() throws Exception {
		switchingTab(firstTab);
		bd.clickBrainHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bd.clickBrainHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

}


