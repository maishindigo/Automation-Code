package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.BoneHealthandOsteoporosis;
import com.qa.centrum.eng.pages.iodineInadequacy;

public class iodineInadequacyTest extends BaseClass {
	iodineInadequacy ii;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("IodineInadequacyPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("IodineInadequacyProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		ii.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		ii.clickCookieBtn();
		System.out.println("cookie button clicked2");
		ii.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority = 1)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        ii.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        ii.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	@Test(priority = 2, enabled = true)
	private void TheABCsoVitaminD() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickTheABCsoVitaminD();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickTheABCsoVitaminD();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void HowCanVitaminEBenefitMyHealth() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickHowCanVitaminEBenefitMyHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickHowCanVitaminEBenefitMyHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void HowtoTakeVitamins() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickHowtoTakeVitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickHowtoTakeVitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority =5, enabled = true)
	private void EstablishingaSelfCareRoutine() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickEstablishingaSelfCareRoutine();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickEstablishingaSelfCareRoutine();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void chooseCentrum() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickchooseCentrum();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickchooseCentrum();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void takeThis() throws Exception {
		ii = new iodineInadequacy();
		switchingTab(firstTab);
		ii.clickTakeThis();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ii.clickTakeThis();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

}
