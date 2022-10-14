package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.ContactForm;
import com.qa.centrum.eng.pages.NonGMO;

public class NonGMOTest extends BaseClass{
	NonGMO nong;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("NonGMOPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("NonGMOProd"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		nong = new NonGMO();
		switchingTab(firstTab);
		nong.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		nong.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		nong.clickCookieBtn();
		System.out.println("cookie button clicked2");
		nong.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 2)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        nong.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        nong.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
}
