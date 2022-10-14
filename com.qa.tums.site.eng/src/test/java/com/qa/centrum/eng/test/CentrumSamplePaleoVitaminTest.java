package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumPaleoVitaminPage;

public class CentrumSamplePaleoVitaminTest extends BaseClass{
	
	CentrumPaleoVitaminPage pv;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/nutrients-and-routine/paleo-vitamins-supplements/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/nutrients-and-routine/paleo-vitamins-supplements/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		pv = new CentrumPaleoVitaminPage();
		switchingTab(firstTab);
		pv.clickCookieBtn();
		pv.clickGigyaForm();
		switchingTab(secondTab);
		pv.clickCookieBtn();
		pv.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyCalciumLink() throws Exception {
		switchingTab(firstTab);
		pv.clickCalciumLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickCalciumLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyVitaminBLink() throws Exception {
		switchingTab(firstTab);
		pv.clickVitaminBLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickVitaminBLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyVitaminDLink() throws Exception {
		switchingTab(firstTab);
		pv.clickVitaminDLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickVitaminDLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyCentrumProduct() throws Exception {
		switchingTab(firstTab);
		pv.clickCentrumProduct();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickCentrumProduct();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		pv.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		pv.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}
	
	@Test(priority = 6)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		pv.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		pv.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		pv.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		pv.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pv.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
}
