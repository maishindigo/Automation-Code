package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumHomePage;

public class CentrumSampleHomepageTest extends BaseClass{

	CentrumHomePage hp;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("preprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("prod"));
	}

	@Test(priority = 0, enabled= true)
	private void cookieAndGigyaPopUp() throws Exception {
		hp = new CentrumHomePage();
		switchingTab(firstTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
		switchingTab(secondTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
	}

	/**
	 * Yogita's Code
	 */

	@Test(priority = 1, enabled = true)
	private void GetStartedButton() throws Exception {
		switchingTab(firstTab);
		hp.clickongetstarted();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickongetstarted();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);

	}
//	@Test(priority = 2, enabled = true)
//	private void Learn1Button() throws Exception {
//		switchingTab(firstTab);
//		hp.clickonLearn1();
//		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		switchingTab(secondTab);
//		hp.clickonLearn1();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//
//	}
	@Test(priority = 3, enabled = true)
	private void Learn2Button() throws Exception {
		switchingTab(firstTab);
		hp.clickonLearn2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickonLearn2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);

	}
	@Test(priority = 4, enabled = true)
	private void AboutButton() throws Exception {
		switchingTab(firstTab);
		hp.clickonabout();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickonabout();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);

	}
	@Test(priority = 5, enabled = true)
	private void Learn3Button() throws Exception {
		switchingTab(firstTab);
		hp.clickonlearn3();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickonlearn3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);

	}
//	@Test(priority = 6, enabled = true)
//	private void ViewallButton() throws Exception {
//		switchingTab(firstTab);
//		hp.clickonViewall();
//		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		switchingTab(secondTab);
//		hp.clickonViewall();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//
//	}


	/**
	 * Sujai's Code
	 */
	@Test(priority = 7, enabled = true)
	private void verifyMultivitamins() throws Exception {
		switchingTab(firstTab);
		hp.clickMultivitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickMultivitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 8,enabled = true)
	private void verifyTargetedSupplements() throws Exception {
		switchingTab(firstTab);
		hp.clickTargetedSupplements();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickTargetedSupplements();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 9, enabled = true)
	public void verifyVitamainPacks() throws Exception {
		switchingTab(firstTab);
		hp.clickVitaminPack();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickVitaminPack();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	public void verifySeeAllProduct() throws Exception {
		switchingTab(firstTab);
		hp.clickSeeAllProduct();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.clickSeeAllProduct();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 11, enabled= true)
	public void verifyWomen() throws Exception {
		switchingTab(firstTab);
		hp.imgWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.imgWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 12, enabled = true)
	public void verifyWomenBuyNowAndCompare() throws Exception {
		switchingTab(firstTab);
		hp.buyNowAndCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.buyNowAndCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 13, enabled = true)
	private void verifyMen() throws Exception {
		switchingTab(firstTab);
		hp.imgMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.imgMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void verifyMenBuyAndCompare() throws Exception {
		switchingTab(firstTab);
		hp.buyNowAndCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.buyNowAndCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void verifyKidsTropicalPunch() throws Exception {
		switchingTab(firstTab);
		hp.imgKidsTropicalPunch();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.imgKidsTropicalPunch();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 16, enabled = true)
	public void verifyKidsTropicalPuchBuyNowAndCompare() throws Exception {
		switchingTab(firstTab);
		hp.buyNowAndCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.buyNowAndCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 17, enabled = true)
	public void verifyAdults() throws Exception {
		switchingTab(firstTab);
		hp.imgAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.imgAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	@Test(priority = 18, enabled = true)
	public void verifyAdultsBuyNowAndCompare() throws Exception {
		switchingTab(firstTab);
		hp.buyNowAndCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hp.buyNowAndCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}


}