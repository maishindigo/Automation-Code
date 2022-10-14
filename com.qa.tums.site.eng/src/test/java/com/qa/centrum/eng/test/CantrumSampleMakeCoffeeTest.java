package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumMakeCoffeePage;

public class CantrumSampleMakeCoffeeTest extends BaseClass{
	
	CentrumMakeCoffeePage mc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}



	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/health-and-lifestyle-tips/how-to-make-coffee-at-home/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/health-and-lifestyle-tips/how-to-make-coffee-at-home/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		mc = new CentrumMakeCoffeePage();
		switchingTab(firstTab);
		mc.clickCookieBtn();
		mc.clickGigyaForm();
		switchingTab(secondTab);
		mc.clickCookieBtn();
		mc.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyFrenchPressLinkOne() throws Exception {
		switchingTab(firstTab);
		mc.clickFrenchPressOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickFrenchPressOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFrenchPressLinkTwo() throws Exception {
		switchingTab(firstTab);
		mc.clickFrenchPressTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickFrenchPressTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFrenchPressLinkThree() throws Exception {
		switchingTab(firstTab);
		mc.clickFrenchPressThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickFrenchPressThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		mc.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		mc.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		mc.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		mc.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mc.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	

}
