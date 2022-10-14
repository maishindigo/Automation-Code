package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumMensWholeFoodBlendMultivitamin;

public class CentrumMensWholeFoodBlendMultivitaminTest extends BaseClass {
	CentrumMensWholeFoodBlendMultivitamin cm;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("CentrumMensWholeFoodBlendMultivitaminPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("CentrumMensWholeFoodBlendMultivitaminProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cm = new CentrumMensWholeFoodBlendMultivitamin();
		switchingTab(firstTab);
		cm.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		cm.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		cm.clickCookieBtn();
		System.out.println("cookie button clicked2");
		cm.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}

@Test(priority = 1, enabled = true)
private void VerifyWriteaReview() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.clickWriteAReview();
	cm.clickWriteAReviewClose();
	switchingTab(secondTab);
	cm.clickWriteAReview();
	cm.clickWriteAReviewClose();
}
@Test(priority = 2, enabled = true)
private void VerifyBuyNow() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.ClickBuyNow();
	switchingTab(secondTab);
	cm.ClickBuyNow();

}
@Test(priority = 3, enabled = true)
private void VerifyGetCoupon() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.clickGetCoupons();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickGetCoupons();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 4, enabled = true)
private void VerifyProductBenefitTab() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.visiblityProductBefefit();
	//String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.visiblityProductBefefit();
//	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 5, enabled = true)
private void VerifyIngedientsTab() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.clickVitaminAndMineralTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	cm.clickVitaminAndMineralTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 6, enabled = true)
private void VerifyUsageTab() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.clickUsageTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	cm.clickUsageTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 7, enabled = true)
private void VerifyFAQTab() throws Exception {
	cm = new CentrumMensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cm.clickFAQsTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickFAQsTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 8)
private void verifyTextImmuneSupportMen() throws Exception{
	switchingTab(firstTab);
	boolean preProd = cm.txtProductVerification();
	Assert.assertTrue(preProd);
	System.out.println("Product Presented in Preprod");
	switchingTab(secondTab);
	boolean live = cm.txtProductVerification();
	Assert.assertTrue(live);
	System.out.println("Product Presented in Live");
}

@Test(priority = 9)
private void verifyCompareTab()throws Exception {
	switchingTab(firstTab);
	cm.clickCompareTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickCompareTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 10)
private void verifyCompareButton()throws Exception {
	switchingTab(firstTab);
	cm.clickCompareButton();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickCompareButton();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 11)
private void verifyRelatedProductOne()throws Exception {
	switchingTab(firstTab);
	cm.clickRelatedProductOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickRelatedProductOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 12)
private void verifyRelatedProductTwo()throws Exception {
	switchingTab(firstTab);
	cm.clickRelatedProductTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickRelatedProductTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 13)
private void verifyRelatedProductThree()throws Exception {
	switchingTab(firstTab);
	cm.clickRelatedProductThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickRelatedProductThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 14)
private void verifyRelatedProductFour()throws Exception {
	switchingTab(firstTab);
	cm.clickRelatedProductFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickRelatedProductFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 15)
private void verifyBuyNowOne() throws Exception {
	switchingTab(firstTab);
	cm.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the PreProd Url");
	switchingTab(secondTab);
	cm.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the Live Url");
}

@Test(priority = 16)
private void verifyBuyNowTwo() throws Exception {
	switchingTab(firstTab);
	cm.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the PreProd Url");
	switchingTab(secondTab);
	cm.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the Live Url");
}

@Test(priority = 17)
private void verifyBuyNowThree() throws Exception {
	switchingTab(firstTab);
	cm.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the PreProd Url");
	switchingTab(secondTab);
cm.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the Live Url");
}

@Test(priority = 18)
private void verifyBuyNowFour() throws Exception {
	switchingTab(firstTab);
	cm.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the PreProd Url");
	switchingTab(secondTab);
	cm.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the Live Url");
}

@Test(priority = 19)
private void verifyCompareOne() throws Exception{
	switchingTab(firstTab);
	cm.clickCompareOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickCompareOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 20)
private void verifyCompareTwo() throws Exception{
	switchingTab(firstTab);
	cm.clickCompareTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickCompareTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 21)
private void verifyCompareThree() throws Exception{
	switchingTab(firstTab);
	cm.clickCompareThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickCompareThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 22)
private void verifyCompareFour() throws Exception{
	switchingTab(firstTab);
	cm.clickCompareFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
cm.clickCompareFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 23)
private void verifyBrowseOne() throws Exception{
	switchingTab(firstTab);
	cm.clickBrowseLinkOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickBrowseLinkOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 24)
private void verifyBrowseTwo() throws Exception{
	switchingTab(firstTab);
	cm.clickBrowseLinkTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickBrowseLinkTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 25)
private void verifyBrowseThree() throws Exception{
	switchingTab(firstTab);
	cm.clickBrowseLinkThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickBrowseLinkThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 26)
private void verifyBrowseFour() throws Exception{
	switchingTab(firstTab);
	cm.clickBrowseLinkFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cm.clickBrowseLinkFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

}
