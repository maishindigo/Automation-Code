package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.SignsOfSevereHeartburnPages;

public class SignsOfSevereHeartburnTest extends BaseClass{
	
	SignsOfSevereHeartburnPages shp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		launchURL(loadProperties().getProperty("url4"));
	}
	
	
	@Test(priority = 0, enabled = true)
	private void verifyBreadCrumbHomeIconLink() throws Exception {
		shp = new SignsOfSevereHeartburnPages();
		shp.clickCookiesDismissBtn();
		shp.clickBreadCrumbHomeIconBtn();
		shp.verifyCurrentUrl(excelRead("SevereHeartburn", 1, 1));
		shp.verifyPageTitle(excelRead("SevereHeartburn", 1, 2));
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyBreadCrumbHeartBurn101() throws Exception {
		shp.clickCookiesDismissBtn();
		shp.clickBreadCrumbHeartburn101();
		shp.verifyCurrentUrl(excelRead("SevereHeartburn", 2, 1));
		shp.verifyPageTitle(excelRead("SevereHeartburn", 2, 2));
		
	}

	@Test(priority = 2, enabled = true)
	private void verifyPainInYourChestLink() throws InterruptedException, IOException {
		shp.clickCookiesDismissBtn();
		shp.clickPainInYourChestBtn();
		shp.verifyCurrentUrl(excelRead("SevereHeartburn", 3, 1));
		shp.verifyPageTitle(excelRead("SevereHeartburn", 3, 2));
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyNexium24HRLink() throws Throwable {
		shp.clickCookiesDismissBtn();
		shp.clickNexium24HRBtn();
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyreferenceLinkOne() throws Throwable {
		shp.clickCookiesDismissBtn();
		shp.clickReferenceUrlOne();
		
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyreferenceLinkTwo() throws Exception {
		shp.clickCookiesDismissBtn();
		shp.clickReferenceUrlTwo();
	}
	
	@Test(priority = 6, enabled = true)
	private void verifySeeProductsLink() throws Exception {
		shp.clickCookiesDismissBtn();
		shp.clickSeeProductsBtn();
		shp.verifyCurrentUrl(excelRead("SevereHeartburn", 7, 1));
		shp.verifyPageTitle(excelRead("SevereHeartburn", 7, 2));
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyCookieSettingsLink() throws Exception {
		shp.clickCookiesDismissBtn();
		shp.clickCookieSettingsBtn();
		shp.cookieContent();
	}
	
	@Test(priority = 8, enabled = true)
	private void launchTumsSiteVerifySevereHeartburn() throws IOException, Exception {
		launchURL(loadProperties().getProperty("url"));
		shp.clickCookiesDismissBtn();
		shp.mouseOverHearburn101();
		shp.clickSevereheartburnBtn();
		
	}
	
}
