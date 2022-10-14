package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumAvoidBoredomPage;
import com.qa.centrum.eng.pages.CentrumSupplementsAndMultivitaminPage;

public class CentrumSampleSupplemetnsAndMultivitaminTest extends BaseClass{


	CentrumSupplementsAndMultivitaminPage sm;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/nutrients-and-routine/how-supplements-multivitamins-work-together/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/nutrients-and-routine/how-supplements-multivitamins-work-together/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		sm = new CentrumSupplementsAndMultivitaminPage();
		switchingTab(firstTab);
		sm.clickCookieBtn();
		sm.clickGigyaForm();
		switchingTab(secondTab);
		sm.clickCookieBtn();
		sm.clickGigyaForm();
	}

	@Test(priority = 1)
	private void verifyVitaminB12Link() throws Exception {
		switchingTab(firstTab);
		sm.clickVitaminB12Link();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickVitaminB12Link();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyClickVitaminDLink() throws Exception {
		switchingTab(firstTab);
		sm.clickVitaminDLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickVitaminDLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyCalciumLink() throws Exception {
		switchingTab(firstTab);
		sm.clickCalciumLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCalciumLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 4)
	private void verifyMultivitaminLink() throws Exception {
		switchingTab(firstTab);
		sm.clickMultivitaminLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickMultivitaminLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		sm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		sm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}


	@Test(priority = 6)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		sm.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		sm.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		sm.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		sm.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

}
