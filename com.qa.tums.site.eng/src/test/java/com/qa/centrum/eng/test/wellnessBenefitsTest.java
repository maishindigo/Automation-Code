package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.centrumMen;
import com.qa.centrum.eng.pages.wellnessBenefits;

public class wellnessBenefitsTest extends BaseClass {
	wellnessBenefits wb;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("preprod"));
		wb.mouseHoverOnLearnLink();
		wb.clickWellnessBenefits();
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("prod"));
		wb.mouseHoverOnLearnLink();
		wb.clickWellnessBenefits();
	}
	
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		wb.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		wb.clickCookieBtn();
		System.out.println("cookie button clicked2");
		wb.clickGigyaForm();
		System.out.println("gigya clicked 2");

}
	@Test(priority = 1, enabled = true)
	private void EnergyTab() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickEnergyCard();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickEnergyCard();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 2, enabled = true)
	private void BoneHealthTab() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickBoneHealthCard();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickBoneHealthCard();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 3, enabled = true)
	private void ImmuneHealthTab() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickImmuneHealthCard();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickImmuneHealthCard();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 4, enabled = true)
	private void HeartHealthTab() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickHeartHealthCard();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickHeartHealthCard();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 5, enabled = true)
	private void DigestiveHealthTab() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickDigestiveHealthCard();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickDigestiveHealthCard();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 6, enabled = true)
	private void VerifyEnergyLearnMore() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		//wb.clickCookieBtn();
		wb.clickEnergyLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		//navigateBack();
		switchingTab(secondTab);
		//wb.clickCookieBtn();
		wb.clickEnergyLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		//navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 7, enabled = true)
	private void VerifylearnMoreBoneHealth() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickBoneLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickBoneLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 8, enabled = true)
	private void VerifylearnMoreImmuneHealth() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickImmuneLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickImmuneLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 9, enabled = true)
	private void VerifyLearnMoreHeartHealth() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickHeartLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		wb.clickHeartLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 10, enabled = true)
	private void VerifyLearnMoreDigestive() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickDigestiveLearnmore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wb.clickDigestiveLearnmore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 11, enabled = true)
	private void VerifyLearnMoreHairSkin() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickHairLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wb.clickHairLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 12, enabled = true)
	private void VerifyWhyVitaminsAndSupli() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickWhyVitaminsAndSupli();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wb.clickWhyVitaminsAndSupli();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 13, enabled = true)
	private void VerifyLearnMore() throws Exception {
		wb = new wellnessBenefits();
		switchingTab(firstTab);
		wb.clickLearnMore();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		wb.clickLearnMore();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

}
