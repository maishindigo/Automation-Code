package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumDuringPregnancyPage;

public class CentrumSampleDuringPregnancyTest extends BaseClass{
	
	CentrumDuringPregnancyPage dp;	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/nutrients-and-routine/nutrient-needs-throughout-pregnancy/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/nutrients-and-routine/nutrient-needs-throughout-pregnancy/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		dp = new CentrumDuringPregnancyPage();
		switchingTab(firstTab);
		dp.clickCookieBtn();
		dp.clickGigyaForm();
		switchingTab(secondTab);
		dp.clickCookieBtn();
		dp.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void VerifyPregnancyDietLinkOne() throws Exception {
		switchingTab(firstTab);
		dp.clickPregnancyDietLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickPregnancyDietLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyPregnancyDietLinkTwo() throws Exception {
		switchingTab(firstTab);
		dp.clickPregnancyDietLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickPregnancyDietLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyOmega3LinkOne() throws Exception {
		switchingTab(firstTab);
		dp.clickOmega3LinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickOmega3LinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyCalciumAndVitaminDLinkOne() throws Exception {
		switchingTab(firstTab);
		dp.clickCalciumAndVitaminDLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickCalciumAndVitaminDLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyAfterBabyArrivesLinkOne() throws Exception {
		switchingTab(firstTab);
		dp.clickAfterBabyArrivesLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickAfterBabyArrivesLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 6)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		dp.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		dp.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}
	
	@Test(priority = 7)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		dp.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		dp.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		dp.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		dp.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dp.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
}
