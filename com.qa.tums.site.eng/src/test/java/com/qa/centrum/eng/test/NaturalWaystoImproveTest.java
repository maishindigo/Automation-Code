package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.NaturalWaystoImprove;
import com.qa.centrum.eng.pages.iodineInadequacy;

public class NaturalWaystoImproveTest extends BaseClass{
	NaturalWaystoImprove nw;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("NaturalWaystoImprovePreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("NaturalWaystoImproveProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		nw.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		nw.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		nw.clickCookieBtn();
		System.out.println("cookie button clicked2");
		nw.clickGigyaForm();
		System.out.println("gigya clicked 2");

	}
	@Test(priority = 1)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        nw.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        nw.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	@Test(priority = 2, enabled = true)
	private void over50() throws Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		nw.clickOver50();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nw.clickOver50();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void fiveVitaminsforWomenOver50() throws Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		nw.clickFiveVitaminsforWomenOver50();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nw.clickFiveVitaminsforWomenOver50();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void HowtoTakeVitamins() throws Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		nw.clickTopFiveNutrients();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nw.clickTopFiveNutrients();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void tenSimpleWays() throws Exception {
		nw = new NaturalWaystoImprove();
		switchingTab(firstTab);
		nw.clickTenSimpleWays();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		nw.clickTenSimpleWays();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

}
