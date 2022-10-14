package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.MeditationForStress;


public class MeditationForStressTest extends BaseClass{
	MeditationForStress mf;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("MeditationForStressPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("MeditationforStressProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		mf.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		mf.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		mf.clickCookieBtn();
		System.out.println("cookie button clicked2");
		mf.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority = 1)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        mf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        mf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	
	@Test(priority = 3, enabled = true)
	private void immuneHealth() throws Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		mf.clickimmuneHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mf.clickimmuneHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void WorkFromHome() throws Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		mf.clickWorkFromHome();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mf.clickWorkFromHome();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void selfCareRoutine() throws Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		mf.clickselfCareRoutine();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mf.clickselfCareRoutine();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void selfAndMoodSuppliment() throws Exception {
		mf = new MeditationForStress();
		switchingTab(firstTab);
		mf.clickselfAndMoodSuppliment();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mf.clickselfAndMoodSuppliment();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

}
