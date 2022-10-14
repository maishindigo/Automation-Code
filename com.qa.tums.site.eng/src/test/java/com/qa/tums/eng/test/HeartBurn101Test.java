package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.HeartBurn101Pages;
import com.qa.tums.eng.util.Retry;

public class HeartBurn101Test extends BaseClass {

	HeartBurn101Pages hbp;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		launchURL(loadProperties().getProperty("url2"));
	}
	

	@Test(priority = 0, enabled = true)
	private void verifyHeartBurnSymptomsLink() throws Exception {
		hbp = new HeartBurn101Pages();
		hbp.clickCookiesDismissBtn();
		hbp.clickHeartBurnSymptoms();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 1, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 1, 2));
	}

	@Test(priority = 1, enabled = true)
	private void verifyHeartBurnCausesLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickHeartBurnCausesBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 2, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 2, 2));
	}

	@Test(priority = 2, enabled = true)
	private void verifyFindingReliefLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickFindingReliefBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 3, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 3, 2));
	}

	@Test(priority = 3, enabled = true)
	private void verifyTumsPregnancyLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickTumsPregnancyBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 4, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 4, 2));
	}

	@Test(priority = 4, enabled = true)
	private void verifyThisIsHeartBurnLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickThisIsHeartBurnBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 5, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 5, 2));
	}

	@Test(priority = 5, enabled = true)
	private void verifyTumsWorkLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickTumsWorkBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 6, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 6, 2));
	}

	@Test(priority = 6, enabled = true)
	private void verifyTriggerHeartBurnLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickTriggerHeartBurnBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 7, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 7, 2));
	}

	@Test(priority = 7, enabled = true)
	private void verifySevereHeartBurnLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickSevereHeartBurnBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 8, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 8, 2));
	}

	@Test(priority = 8, enabled = true)
	private void verifyHeartBurnCheckListLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickHeartBurnCheckListBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 9, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 9, 2));
	}

	@Test(priority = 9, enabled = true)
	private void verifyReduceHeartBurnLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickReduceHeartBurnBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 10, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 10, 2));
	}

	@Test(priority = 10, enabled = true)
	private void verifyAcidRefluxLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickAcidRefluxBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 11, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 11, 2));
	}

	@Test(priority = 11, enabled = true)
	private void verifyAntacidsWhyTheyWorkLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickAntacidsWhyTheyWorkBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 12, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 12, 2));
	}

	@Test(priority = 12, enabled = true)
	private void verifySeeProductsLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickSeeProductsBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 13, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 13, 2));
	}

	@Test(priority = 13, enabled = true)
	private void verifyCookieSettingsLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickCookieSettingsBtn();
		hbp.cookieContent();
	}

	@Test(priority = 14, enabled = true)
	private void verifyBreadCrumbHomeIconLink() throws Exception {
		hbp.clickCookiesDismissBtn();
		hbp.clickBreadCrumbHomeIconBtn();
		hbp.verifyCurrentUrl(excelRead("HeartBurn101", 14, 1));
		hbp.verifyPageTitle(excelRead("HeartBurn101", 14, 2));
	}
	
	@Test(priority = 15, enabled = true)
	private void hearBurn101Test() throws IOException, Exception {
		launchURL(loadProperties().getProperty("url"));
		hbp.clickCookiesDismissBtn();
		hbp.mouseOverHearburn101();
		
	}

}
