package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.NaturalWaystoImprove;
import com.qa.centrum.eng.pages.vitaminsEasilyFitIntoLifestyle;

public class vitaminsEasilyFitIntoLifestyleTest extends BaseClass{
	vitaminsEasilyFitIntoLifestyle vef;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("VitaminsEasilyPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("VitaminsEasilyProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		vef.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		vef.clickCookieBtn();
		System.out.println("cookie button clicked2");
		vef.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 1, enabled = true)
	private void takeBackPrograms() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickTakeBackPrograms();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickTakeBackPrograms();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void eatBalancedMealsEveryDay() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickeatBalancedMealsEveryDay();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickeatBalancedMealsEveryDay();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void takeVitaminsasaSupplement() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clicktakeVitaminsasaSupplement();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clicktakeVitaminsasaSupplement();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void CentrumIngredients() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickCentrumIngredients();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickCentrumIngredients();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void HowCanVitaminEBenefitMyHealth() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickHowCanVitaminEBenefitMyHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickHowCanVitaminEBenefitMyHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void HowToTake() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickHowToTake();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickHowToTake();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void EstablishingaSelfCareRoutine() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickEstablishingaSelfCareRoutine();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickEstablishingaSelfCareRoutine();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void fiveHealthyHomemadeLunchIdeasforAdults() throws Exception {
		vef = new vitaminsEasilyFitIntoLifestyle();
		switchingTab(firstTab);
		vef.clickfiveHealthyHomemadeLunchIdeasforAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vef.clickfiveHealthyHomemadeLunchIdeasforAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

}
