package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.BenefitsofFolicAcidforWomen;
import com.qa.centrum.eng.pages.Vitamin_B12;
import com.qa.centrum.eng.pages.magnesium;

public class BenefitsofFolicAcidforWomenTest extends BaseClass {
	BenefitsofFolicAcidforWomen bf;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("BenefitsoFolicAcidforWomenPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("BenefitsoFolicAcidforWomenProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		bf.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		bf.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		bf.clickCookieBtn();
		System.out.println("cookie button clicked2");
		bf.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority = 1, enabled = true)
	private void WomenWhoArePregnantLink() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		bf.clickWomenWhoArePregnant();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bf.clickWomenWhoArePregnant();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void MultivitaminsLink() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		bf.clickMultivitamin();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bf.clickMultivitamin();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void WhatNutrientsDINeedDuringPregnancy() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
	bf.clickWhatNutrientsDINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
	bf.clickWhatNutrientsDINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void ComplexionProtection() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		bf.clickComplexionProtection();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bf.clickComplexionProtection();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void TheBenefitsofOmegaSupplements() throws Exception {
		bf = new BenefitsofFolicAcidforWomen();
		switchingTab(firstTab);
		bf.clickTheBenefitsofOmegaSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bf.clickTheBenefitsofOmegaSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        bf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        bf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	}
	


