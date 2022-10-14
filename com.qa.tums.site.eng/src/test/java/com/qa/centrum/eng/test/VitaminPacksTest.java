package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.VitaminPacks;

public class VitaminPacksTest extends BaseClass{
	VitaminPacks vp;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("Women30PlusPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("Women30PlusProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vp = new VitaminPacks();
		switchingTab(firstTab);
		vp.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		vp.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		vp.clickCookieBtn();
		System.out.println("cookie button clicked2");
		vp.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 1)
	private void verifyWellnessPacksWomen20Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksWomen20Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksWomen20Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 2)
	private void verifybuyNow1()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyCompare1()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyWellnessPacksWomen30Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksWomen30Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksWomen30Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifybuyNow2()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyCompare2()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyWellnessPacksWomen40Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksWomen40Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksWomen40Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 18)
	private void verifybuyNow3()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare3()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare3();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksWomen50Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksWomen50Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksWomen50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow4()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare4()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksMen40Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksMen40Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksMen40Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow5()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow5();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow5();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare5()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare5();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare5();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksMen50Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksMen40Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksMen50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow6()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow6();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow6();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare6()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare6();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare6();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksWomen60Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksWomen60Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksWomen60Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow7()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow7();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow7();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare7()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare7();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare7();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksMen60Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksMen60Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksMen60Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow8()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow8();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow8();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare8()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare8();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare8();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksMen30Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksMen30Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksMen30Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow9()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow9();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow9();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare9()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare9();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare9();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyWellnessPacksMen20Plus()throws Exception {
		switchingTab(firstTab);
		vp.clickWellnessPacksMen20Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickWellnessPacksMen20Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifybuyNow10()throws Exception {
		switchingTab(firstTab);
		vp.clickbuyNow10();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickbuyNow10();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyCompare10()throws Exception {
		switchingTab(firstTab);
		vp.clickCompare10();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompare10();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	

}
