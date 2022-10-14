package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumMultiOmega3Men50Page;

public class CentrumSampleMultiOmega3Men50Test extends BaseClass{
	
	CentrumMultiOmega3Men50Page mo;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/products/multivitamins/centrum-multi-omega-3-men-50/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/products/multivitamins/centrum-multi-omega-3-men-50/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		mo = new CentrumMultiOmega3Men50Page();
		switchingTab(firstTab);
		mo.clickCookieBtn();
		mo.clickGigyaForm();
		switchingTab(secondTab);
		mo.clickCookieBtn();
		mo.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyWriteAReviewBtn() throws Exception {
		switchingTab(firstTab);
		mo.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		mo.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowBtn() throws Exception{
		switchingTab(firstTab);
		mo.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		mo.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		mo.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVitaminAndMinerals() throws Exception{
		switchingTab(firstTab);
		mo.clickVitaminAndMinerals();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickVitaminAndMinerals();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyUsage() throws Exception{
		switchingTab(firstTab);
		mo.clickUsage();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickUsage();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFAQ() throws Exception{
		switchingTab(firstTab);
		mo.clickFAQ();
		System.out.println("FAQs verified in Preprod URL");
		switchingTab(secondTab);
		mo.clickFAQ();
		System.out.println("FAQs verified in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyTextImmuneSupportMen() throws Exception{
		switchingTab(firstTab);
		boolean preProd = mo.txtProductVerification();
		Assert.assertTrue(preProd);
		System.out.println("Product Presented in Preprod");
		switchingTab(secondTab);
		boolean live = mo.txtProductVerification();
		Assert.assertTrue(live);
		System.out.println("Product Presented in Live");
	}
	
	@Test(priority = 8)
	private void verifyCompareTab()throws Exception {
		switchingTab(firstTab);
		mo.clickCompareTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyCompareButton()throws Exception {
		switchingTab(firstTab);
		mo.clickCompareButton();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareButton();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedProductOne()throws Exception {
		switchingTab(firstTab);
		mo.clickRelatedProductOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickRelatedProductOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedProductTwo()throws Exception {
		switchingTab(firstTab);
		mo.clickRelatedProductTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickRelatedProductTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedProductThree()throws Exception {
		switchingTab(firstTab);
		mo.clickRelatedProductThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickRelatedProductThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedProductFour()throws Exception {
		switchingTab(firstTab);
		mo.clickRelatedProductFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickRelatedProductFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		mo.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the PreProd Url");
		switchingTab(secondTab);
		mo.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the Live Url");
	}
	
	@Test(priority = 15)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		mo.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the PreProd Url");
		switchingTab(secondTab);
		mo.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the Live Url");
	}
	
	@Test(priority = 16)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		mo.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the PreProd Url");
		switchingTab(secondTab);
		mo.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the Live Url");
	}
	
	@Test(priority = 17)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		mo.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the PreProd Url");
		switchingTab(secondTab);
		mo.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the Live Url");
	}
	
	@Test(priority = 18)
	private void verifyCompareOne() throws Exception{
		switchingTab(firstTab);
		mo.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyCompareTwo() throws Exception{
		switchingTab(firstTab);
		mo.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyCompareThree() throws Exception{
		switchingTab(firstTab);
		mo.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyCompareFour() throws Exception{
		switchingTab(firstTab);
		mo.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyBrowseOne() throws Exception{
		switchingTab(firstTab);
		mo.clickBrowseLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickBrowseLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBrowseTwo() throws Exception{
		switchingTab(firstTab);
		mo.clickBrowseLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickBrowseLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBrowseThree() throws Exception{
		switchingTab(firstTab);
		mo.clickBrowseLinkThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickBrowseLinkThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBrowseFour() throws Exception{
		switchingTab(firstTab);
		mo.clickBrowseLinkFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		mo.clickBrowseLinkFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

}
