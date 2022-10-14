package com.qa.centrum.eng.test;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumQuizPage;
import com.qa.tums.eng.util.Retry;

public class CentrumSampleQuizTest extends BaseClass{

	CentrumQuizPage qp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/product-recommendation-tool-quiz/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/product-recommendation-tool-quiz/");
	}


	@Test(priority = 0, enabled = true, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		qp = new CentrumQuizPage();
		switchingTab(firstTab);
		qp.clickCookieBtn();
//		qp.clickGigyaForm();
		switchingTab(secondTab);
		qp.clickCookieBtn();
//		qp.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyStartBtn() throws Exception {
		switchingTab(firstTab);
		qp.clickStartBtn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		qp.clickStartBtn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHealthGoal() throws Exception{
		switchingTab(firstTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllHealthGoal();
		System.out.println("Health Goal Successfully verified in the Preprod Url");
		switchingTab(secondTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllHealthGoal();
		System.out.println("Health Goal Successfully verified in the Live Url");
	}
	
	
	@Test(priority = 3)
	private void verifyAllAge() throws Exception{
		switchingTab(firstTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllWhatIsYouAge();
		System.out.println("Age Successfully verified in the Preprod Url");
		switchingTab(secondTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllWhatIsYouAge();
		System.out.println("Age Successfully verified in the live Url");
	}
	
	@Test(priority = 4)
	private void verifyAllGender() throws Exception{
		switchingTab(firstTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllGender();
		System.out.println("Gender Successfully verified in the Preprod Url");
		switchingTab(secondTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllGender();
		System.out.println("Gender Successfully verified in the live Url");
	}
	
	@Test(priority = 5)
	private void verifyAllVitaminFormat()throws Exception {
		switchingTab(firstTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllVitaminFormat();
		System.out.println("Vitamin Successfully verified in the Preprod Url");
		switchingTab(secondTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.clickAllVitaminFormat();
		System.out.println("Vitamin Successfully verified in the live Url");
	}
	
	@Test(priority = 6)
	private void verifyGigyaForm() throws Exception{
		switchingTab(firstTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.verifyGigyaForm();
		System.out.println("Gigya Form Successfully verified in the Preprod Url");
		switchingTab(secondTab);
		qp.clickStartBtn();
		scrollPage(300);
		qp.verifyGigyaForm();
		System.out.println("Gigya Form Successfully verified in the Live Url");
	}
}
