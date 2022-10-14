package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.BoneHealthandOsteoporosis;
import com.qa.centrum.eng.pages.WhichVitaminsareAntioxidants;

public class BoneHealthandOsteoporosisTest extends BaseClass {
	BoneHealthandOsteoporosis bh;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("BoneHealthPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("BoneHealthProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		bh.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		bh.clickCookieBtn();
		System.out.println("cookie button clicked2");
		bh.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority =1, enabled = true)
	private void centrumMovementLink() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickCentrumMovement();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickCentrumMovement();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void DietCentrumSilver() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickCentrumSilver();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickCentrumSilver();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void DietCentrumProduct() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickCentrumProduct();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickCentrumProduct();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void CentrumQuiz() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickCentrumQuiz();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickCentrumQuiz();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        bh.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        bh.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	@Test(priority = 6, enabled = true)
	private void WhatNutrientsDINeedDuringPregnancy() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickWhatNutrientsDINeedDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickWhatNutrientsDINeedDuringPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void TheBenefitsofOmegaSupplements() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickTheBenefitsofOmegaSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickTheBenefitsofOmegaSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void ComplexionProtection() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickComplexionProtection();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickComplexionProtection();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 9, enabled = true)
	private void EstablishingaSelfCareRoutine() throws Exception {
		bh = new BoneHealthandOsteoporosis();
		switchingTab(firstTab);
		bh.clickEstablishingaSelfCareRoutine();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bh.clickEstablishingaSelfCareRoutine();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	

}
