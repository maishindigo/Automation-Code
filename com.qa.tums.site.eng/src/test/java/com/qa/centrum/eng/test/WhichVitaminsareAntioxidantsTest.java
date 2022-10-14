package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.BenefitsofFolicAcidforWomen;
import com.qa.centrum.eng.pages.WhichVitaminsareAntioxidants;

public class WhichVitaminsareAntioxidantsTest extends BaseClass {
	WhichVitaminsareAntioxidants wv;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("WhichVitaminsareAntioxidantsPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("WhichVitaminsareAntioxidantsProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		wv.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		wv.clickCookieBtn();
		System.out.println("cookie button clicked2");
		wv.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority = 2, enabled = true)
	private void DietLink() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickDiet();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wv.clickDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        wv.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        wv.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	@Test(priority = 4, enabled = true)
	private void ShoreUpYourDefences() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickShoreUpYourDefences();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wv.clickShoreUpYourDefences();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void ComplexionProtection() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickComplexionProtection();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wv.clickComplexionProtection();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void WhatNutrientsDINeedDuringPregnancy() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickWhatNutrientsDINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wv.clickWhatNutrientsDINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void Study() throws Exception {
		wv = new WhichVitaminsareAntioxidants();
		switchingTab(firstTab);
		wv.clickStudy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wv.clickStudy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
}
