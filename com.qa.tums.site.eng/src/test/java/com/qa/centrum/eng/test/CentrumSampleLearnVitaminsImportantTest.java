package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.LearnWhyAreVitaminsImportantPage;

public class CentrumSampleLearnVitaminsImportantTest extends BaseClass{
	LearnWhyAreVitaminsImportantPage vi;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/why-are-vitamins-important/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/why-are-vitamins-important/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vi = new LearnWhyAreVitaminsImportantPage();
		switchingTab(firstTab);
		vi.clickCookieBtn();
		vi.clickGigyaForm();
		switchingTab(secondTab);
		vi.clickCookieBtn();
		vi.clickGigyaForm();
	}


	@Test(priority = 1, enabled = true)
	private void verifySupportImmunity() throws Exception {
		vi = new LearnWhyAreVitaminsImportantPage();
		switchingTab(firstTab);
		vi.clickSupportImmunity();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSupportImmunity();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 2, enabled = true)
	private void verifyMaintainStrongBones() throws Exception {
		switchingTab(firstTab);
		vi.clickMaintainStrongBone();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMaintainStrongBone();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 3, enabled = true)
	private void verifyMeetingYourNutritionalNeeds() throws Exception {
		switchingTab(firstTab);
		vi.clickMeetingYourNutritionalNeeds();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMeetingYourNutritionalNeeds();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 4, enabled = true)
	private void verifyPaleo() throws Exception {
		switchingTab(firstTab);
		vi.clickPaleo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickPaleo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyKeto() throws Exception {
		switchingTab(firstTab);
		vi.clickKeto();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickKeto();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyVegetarianLinkOne() throws Exception {
		switchingTab(firstTab);
		vi.clickVegetarianLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegetarianLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 7, enabled = true)
	private void verifyVegetarianLinkTwo() throws Exception {
		switchingTab(firstTab);
		vi.clickVegetarianLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegetarianLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyVegan() throws Exception {
		switchingTab(firstTab);
		vi.clickVegan();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegan();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 9, enabled = true)
	private void verifyOysters() throws Exception {
		switchingTab(firstTab);
		vi.clickOysters();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickOysters();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	private void verifyPinkSalmon() throws Exception {
		switchingTab(firstTab);
		vi.clickPinkSalmon();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickPinkSalmon();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 11,enabled = true)
	private void verifyAlmonds() throws Exception {
		switchingTab(firstTab);
		vi.clickAlmonds();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickAlmonds();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 12,enabled = true)
	private void verifySpinach() throws Exception {
		switchingTab(firstTab);
		vi.clickSpinach();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSpinach();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 13,enabled =true)
	private void verifyHalibut() throws Exception {
		switchingTab(firstTab);
		vi.clickHalibut();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickHalibut();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void verifyAvocados() throws Exception {
		switchingTab(firstTab);
		vi.clickAvocados();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickAvocados();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void verifyChickPeas() throws Exception {
		switchingTab(firstTab);
		vi.clickChickPeas();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickChickPeas();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 16,enabled = true)
	private void verifyGreekYogurt() throws Exception {
		switchingTab(firstTab);
		vi.clickGreekYogurt();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickGreekYogurt();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 17, enabled = true)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		vi.clickShowReference();
		switchingTab(secondTab);
		vi.clickShowReference();
	}

	@Test(priority = 18, enabled = true)
	private void verifyMultivitamins() throws Exception {
		switchingTab(firstTab);
		vi.clickMultivitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMultivitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 19, enabled = true)
	private void verifyBenefitBlends() throws Exception {
		switchingTab(firstTab);
		vi.clickBenefitBlends();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickBenefitBlends();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}


	@Test(priority = 20, enabled=true)
	private void verifyWholeFoodBlends() throws Exception {
		switchingTab(firstTab);
		vi.clickWholeFoodBlends();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickWholeFoodBlends();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 21, enabled = true)
	private void verifySeeAllProducts() throws Exception {
		switchingTab(firstTab);
		vi.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 22, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);

	}

	@Test(priority = 23, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);

	}

	@Test(priority = 24, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 25, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
}
