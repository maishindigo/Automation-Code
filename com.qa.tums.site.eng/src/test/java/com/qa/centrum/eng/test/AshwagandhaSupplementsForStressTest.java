package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.AshwagandhaSupplementsForStress;
import com.qa.centrum.eng.pages.iodineInadequacy;

public class AshwagandhaSupplementsForStressTest extends BaseClass {
	AshwagandhaSupplementsForStress asf;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		asf = new AshwagandhaSupplementsForStress();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("AshwagandhaSupplementsPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("AshwagandhaSupplementsProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		asf = new AshwagandhaSupplementsForStress();
		switchingTab(firstTab);
		asf.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		asf.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		asf.clickCookieBtn();
		System.out.println("cookie button clicked2");
		asf.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 1, enabled = true)
	private void positiveEffectsOnEnergyLink() throws Exception {
		asf = new AshwagandhaSupplementsForStress();
		switchingTab(firstTab);
		asf.clickpositiveEffectsOnEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		asf.clickpositiveEffectsOnEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void CentrumCalmandResetGummiesLink() throws Exception {
		asf = new AshwagandhaSupplementsForStress();
		switchingTab(firstTab);
		asf.clickCentrumCalmandResetGummies();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		asf.clickCentrumCalmandResetGummies();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void meditationLink() throws Exception {
		asf = new AshwagandhaSupplementsForStress();
		switchingTab(firstTab);
		asf.clickmeditation();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		asf.clickmeditation();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 4)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        asf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        asf.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }

}
