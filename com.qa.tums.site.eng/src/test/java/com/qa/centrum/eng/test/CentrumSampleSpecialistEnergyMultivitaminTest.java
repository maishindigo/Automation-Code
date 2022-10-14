package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumSpecialistEnergyMultivitaminPage;

public class CentrumSampleSpecialistEnergyMultivitaminTest extends BaseClass{

	CentrumSpecialistEnergyMultivitaminPage sm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/products/targeted-supplements/specialist-energy-multivitamin/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/products/targeted-supplements/specialist-energy-multivitamin/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		sm = new CentrumSpecialistEnergyMultivitaminPage();
		switchingTab(firstTab);
		sm.clickCookieBtn();
		sm.clickGigyaForm();
		switchingTab(secondTab);
		sm.clickCookieBtn();
		sm.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyWriteAReviewBtn() throws Exception {
		switchingTab(firstTab);
		sm.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		sm.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowBtn() throws Exception{
		switchingTab(firstTab);
		sm.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		sm.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		sm.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVitaminAndMinerals() throws Exception{
		switchingTab(firstTab);
		sm.clickVitaminAndMinerals();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickVitaminAndMinerals();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyUsage() throws Exception{
		switchingTab(firstTab);
		sm.clickUsage();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickUsage();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFAQ() throws Exception{
		switchingTab(firstTab);
		sm.clickFAQ();
		System.out.println("FAQs verified in Preprod URL");
		switchingTab(secondTab);
		sm.clickFAQ();
		System.out.println("FAQs verified in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyTextImmuneSupportMen() throws Exception{
		switchingTab(firstTab);
		boolean preProd = sm.txtProductVerification();
		Assert.assertTrue(preProd);
		System.out.println("Product Presented in Preprod");
		switchingTab(secondTab);
		boolean live = sm.txtProductVerification();
		Assert.assertTrue(live);
		System.out.println("Product Presented in Live");
	}
	
	@Test(priority = 8)
	private void verifyCompareTab()throws Exception {
		switchingTab(firstTab);
		sm.clickCompareTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyCompareButton()throws Exception {
		switchingTab(firstTab);
		sm.clickCompareButton();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareButton();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedProductOne()throws Exception {
		switchingTab(firstTab);
		sm.clickRelatedProductOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickRelatedProductOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedProductTwo()throws Exception {
		switchingTab(firstTab);
		sm.clickRelatedProductTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickRelatedProductTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedProductThree()throws Exception {
		switchingTab(firstTab);
		sm.clickRelatedProductThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickRelatedProductThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedProductFour()throws Exception {
		switchingTab(firstTab);
		sm.clickRelatedProductFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickRelatedProductFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		sm.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the PreProd Url");
		switchingTab(secondTab);
		sm.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the Live Url");
	}
	
	@Test(priority = 15)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		sm.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the PreProd Url");
		switchingTab(secondTab);
		sm.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the Live Url");
	}
	
	@Test(priority = 16)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		sm.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the PreProd Url");
		switchingTab(secondTab);
		sm.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the Live Url");
	}
	
	@Test(priority = 17)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		sm.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the PreProd Url");
		switchingTab(secondTab);
		sm.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the Live Url");
	}
	
	@Test(priority = 18)
	private void verifyCompareOne() throws Exception{
		switchingTab(firstTab);
		sm.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyCompareTwo() throws Exception{
		switchingTab(firstTab);
		sm.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyCompareThree() throws Exception{
		switchingTab(firstTab);
		sm.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyCompareFour() throws Exception{
		switchingTab(firstTab);
		sm.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyBrowseOne() throws Exception{
		switchingTab(firstTab);
		sm.clickBrowseLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickBrowseLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBrowseTwo() throws Exception{
		switchingTab(firstTab);
		sm.clickBrowseLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickBrowseLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBrowseThree() throws Exception{
		switchingTab(firstTab);
		sm.clickBrowseLinkThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickBrowseLinkThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBrowseFour() throws Exception{
		switchingTab(firstTab);
		sm.clickBrowseLinkFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		sm.clickBrowseLinkFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	
}
