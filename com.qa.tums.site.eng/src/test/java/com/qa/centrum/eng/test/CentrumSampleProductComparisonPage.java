package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumProductComparisonPage;

public class CentrumSampleProductComparisonPage extends BaseClass {
	
	CentrumProductComparisonPage pc;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/products/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/products/");
	}
	
	@Test(priority = 0, enabled= true)
	private void clickCookieAndGigya() throws Exception {
		pc = new CentrumProductComparisonPage();
		switchingTab(firstTab);
		pc.clickCookieBtn();
		pc.clickGigyaForm();
		switchingTab(secondTab);
		pc.clickCookieBtn();
		pc.clickGigyaForm();
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyAdults() throws Exception {
		switchingTab(firstTab);
		pc.clickAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		pc.clickAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same : "+compareTwoText);
//		switchingTab(firstTab);
//		pc.verifyCentrumAdult();
//		switchingTab(secondTab);
//		pc.verifyCentrumAdult();
		switchingTab(firstTab);
		pc.clickVitaminAndMinerals();
	}
}

