package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumVitaminPacksWomen40PlusPage;
import com.qa.centrum.eng.pages.CentrumVitaminPacksWomen60PlusPage;

public class CentrumSampleVitaminPacksWomen60PlusTest extends BaseClass{
	
	CentrumVitaminPacksWomen60PlusPage vp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/products/vitamin-packs/women-60-plus/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/products/vitamin-packs/women-60-plus/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vp = new CentrumVitaminPacksWomen60PlusPage();
		switchingTab(firstTab);
		vp.clickCookieBtn();
		vp.clickGigyaForm();
		switchingTab(secondTab);
		vp.clickCookieBtn();
		vp.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyWriteAReviewBtn() throws Exception {
		switchingTab(firstTab);
		vp.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		vp.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowBtn() throws Exception{
		switchingTab(firstTab);
		vp.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		vp.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		vp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVitaminAndMinerals() throws Exception{
		switchingTab(firstTab);
		vp.clickVitaminAndMinerals();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickVitaminAndMinerals();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyUsage() throws Exception{
		switchingTab(firstTab);
		vp.clickUsage();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickUsage();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFAQ() throws Exception{
		switchingTab(firstTab);
		vp.clickFAQ();
		System.out.println("FAQs verified in Preprod URL");
		switchingTab(secondTab);
		vp.clickFAQ();
		System.out.println("FAQs verified in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyTextImmuneSupportMen() throws Exception{
		switchingTab(firstTab);
		boolean preProd = vp.txtProductVerification();
		Assert.assertTrue(preProd);
		System.out.println("Product Presented in Preprod");
		switchingTab(secondTab);
		boolean live = vp.txtProductVerification();
		Assert.assertTrue(live);
		System.out.println("Product Presented in Live");
	}
	
	@Test(priority = 8)
	private void verifyCompareTab()throws Exception {
		switchingTab(firstTab);
		vp.clickCompareTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyCompareButton()throws Exception {
		switchingTab(firstTab);
		vp.clickCompareButton();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareButton();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedProductOne()throws Exception {
		switchingTab(firstTab);
		vp.clickRelatedProductOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickRelatedProductOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedProductTwo()throws Exception {
		switchingTab(firstTab);
		vp.clickRelatedProductTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickRelatedProductTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedProductThree()throws Exception {
		switchingTab(firstTab);
		vp.clickRelatedProductThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickRelatedProductThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedProductFour()throws Exception {
		switchingTab(firstTab);
		vp.clickRelatedProductFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickRelatedProductFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		vp.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the PreProd Url");
		switchingTab(secondTab);
		vp.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the Live Url");
	}
	
	@Test(priority = 15)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		vp.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the PreProd Url");
		switchingTab(secondTab);
		vp.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the Live Url");
	}
	
	@Test(priority = 16)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		vp.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the PreProd Url");
		switchingTab(secondTab);
		vp.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the Live Url");
	}
	
	@Test(priority = 17)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		vp.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the PreProd Url");
		switchingTab(secondTab);
		vp.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the Live Url");
	}
	
	@Test(priority = 18)
	private void verifyCompareOne() throws Exception{
		switchingTab(firstTab);
		vp.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyCompareTwo() throws Exception{
		switchingTab(firstTab);
		vp.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyCompareThree() throws Exception{
		switchingTab(firstTab);
		vp.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyCompareFour() throws Exception{
		switchingTab(firstTab);
		vp.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyBrowseOne() throws Exception{
		switchingTab(firstTab);
		vp.clickBrowseLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickBrowseLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBrowseTwo() throws Exception{
		switchingTab(firstTab);
		vp.clickBrowseLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickBrowseLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBrowseThree() throws Exception{
		switchingTab(firstTab);
		vp.clickBrowseLinkThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickBrowseLinkThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBrowseFour() throws Exception{
		switchingTab(firstTab);
		vp.clickBrowseLinkFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vp.clickBrowseLinkFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

}
