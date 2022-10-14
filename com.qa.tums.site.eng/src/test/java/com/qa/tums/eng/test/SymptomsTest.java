package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.SymptomsPages;

public class SymptomsTest extends BaseClass{
	SymptomsPages sp ;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		launchURL(loadProperties().getProperty("url3"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyAnacidsTumsLink() throws InterruptedException, IOException {
		sp = new SymptomsPages();
		sp.clickCookiesDismissBtn();
		sp.clickAntacidsTumsbtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 4, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 4, 2));
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyAccordion() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickContentHeartBurnAndChestPain();
		sp.clickaccordionHeartBurnBloatingAndBleching();
		sp.clickHeartBurnAndAcidicThroat();
		sp.clickHearBurnAndNause();
		sp.clickHeartBurnAndHiccups();
		sp.clickWhenPregnant();
		sp.clickMedicalAttention();
	}
	
	
	
	@Test(priority = 2, enabled = true)
	private void verifyShowReferenceLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickShowReferenceBtn();
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyHeartBurnCausesLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickHeartBurnCausesBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 5, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 5, 2));
	}

	@Test(priority = 4, enabled = true)
	private void verifyFindingReliefLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickFindingReliefBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 6, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 6, 2));
	}

	@Test(priority = 5, enabled = true)
	private void verifyTumsPregnancyLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickTumsPregnancyBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 7, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 7, 2));
	}

	@Test(priority = 6, enabled = true)
	private void verifyThisIsHeartBurnLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickThisIsHeartBurnBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 8, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 8, 2));
	}
	
	@Test(priority = 7, enabled = true)
	private void verifySevereHeartBurnLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickSevereHeartBurnBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 9, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 9, 2));
	}

	@Test(priority = 8, enabled = true)
	private void verifyNightTimeHeartBurnLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickNightTimeHeartBurnBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 10, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 10, 2));
	}
	
	
	@Test(priority = 9, enabled = true)
	private void verifyAcidRefluxLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickAcidRefluxBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 11, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 11, 2));
		
	}
	
	@Test(priority = 10, enabled = true)
	private void verifySeeProductsLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickSeeProductsBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 12, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 12, 2));
	}
	
	
	@Test(priority = 11, enabled = true)
	private void verifyCookieSettingsLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickCookieSettingsBtn();
		sp.cookieContent();
	}

	@Test(priority = 12, enabled = true)
	private void verifyBreadCrumbHomeIconLink() throws Exception {
		sp.clickCookiesDismissBtn();
		sp.clickBreadCrumbHomeIconBtn();
		sp.verifyCurrentUrl(excelRead("Symptoms", 13, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 13, 2));
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyBreadCrumbHeartBurn101() throws InterruptedException, IOException {
		sp.clickCookiesDismissBtn();
		sp.clickBreadCrumbHeartburn101();
		sp.verifyCurrentUrl(excelRead("Symptoms", 14, 1));
		sp.verifyPageTitle(excelRead("Symptoms", 14, 2));
		
	}
	
	@Test(priority = 14, enabled = true)
	private void launchTumsSiteVerifySymptoms() throws  Exception {
		launchURL(loadProperties().getProperty("url"));
		sp.clickCookiesDismissBtn();
		sp.mouseOverHearburn101();
		sp.clickSymptomsBtn();
	}
	
//	@Test(priority = 15, enabled = true)
//	private void verifyTwitterLink() throws Throwable {
//		sp.clickCookiesDismissBtn();
//		sp.clickTwitterBtn();
//		sp.verifyTwitterLink();
//		sp.verifyTwitterIcon();
//	}
	
	
	

}
