package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumVitaminForMenPage;

public class CentrumSampleVitaminForMenTest extends BaseClass{

	
	CentrumVitaminForMenPage vm;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/nutrients-and-routine/best-vitamins-for-men/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/nutrients-and-routine/best-vitamins-for-men/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vm = new CentrumVitaminForMenPage();
		switchingTab(firstTab);
		vm.clickCookieBtn();
		vm.clickGigyaForm();
		switchingTab(secondTab);
		vm.clickCookieBtn();
		vm.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyRightMenLinkOne() throws Exception {
		switchingTab(firstTab);
		vm.clickRightMenLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickRightMenLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyRightMenLinkTwo() throws Exception {
		switchingTab(firstTab);
		vm.clickRightMenLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickRightMenLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyGoodMultivitaminLink() throws Exception {
		switchingTab(firstTab);
		vm.clickGoodMultivitaminLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickGoodMultivitaminLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		vm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		vm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}
	
	
	@Test(priority = 5)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		vm.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		vm.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		vm.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		vm.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vm.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
}
