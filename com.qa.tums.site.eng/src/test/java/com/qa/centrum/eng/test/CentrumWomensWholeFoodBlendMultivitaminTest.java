package com.qa.centrum.eng.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumWomensWholeFoodBlendMultivitamin;

public class CentrumWomensWholeFoodBlendMultivitaminTest extends BaseClass{
	CentrumWomensWholeFoodBlendMultivitamin cw;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("CentrumWomensWholeFoodBlendMultivitaminPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("CentrumWomensWholeFoodBlendMultivitaminProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cw = new CentrumWomensWholeFoodBlendMultivitamin();
		switchingTab(firstTab);
		cw.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		cw.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		cw.clickCookieBtn();
		System.out.println("cookie button clicked2");
		cw.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}

@Test(priority = 1, enabled = true)
private void VerifyWriteaReview() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.clickWriteAReview();
	cw.clickWriteAReviewClose();
	switchingTab(secondTab);
	cw.clickWriteAReview();
	cw.clickWriteAReviewClose();
}
@Test(priority = 2, enabled = true)
private void VerifyBuyNow() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.ClickBuyNow();
	switchingTab(secondTab);
	cw.ClickBuyNow();

}
@Test(priority = 3, enabled = true)
private void VerifyGetCoupon() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.clickGetCoupons();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickGetCoupons();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 4, enabled = true)
private void VerifyProductBenefitTab() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.visiblityProductBefefit();
	//String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.visiblityProductBefefit();
//	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 5, enabled = true)
private void VerifyIngedientsTab() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.clickVitaminAndMineralTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	cw.clickVitaminAndMineralTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 6, enabled = true)
private void VerifyUsageTab() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.clickUsageTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	cw.clickUsageTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 7, enabled = true)
private void VerifyFAQTab() throws Exception {
	cw = new CentrumWomensWholeFoodBlendMultivitamin();
	switchingTab(firstTab);
	cw.clickFAQsTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickFAQsTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 8)
private void verifyTextImmuneSupportMen() throws Exception{
	switchingTab(firstTab);
	boolean preProd = cw.txtProductVerification();
	Assert.assertTrue(preProd);
	System.out.println("Product Presented in Preprod");
	switchingTab(secondTab);
	boolean live = cw.txtProductVerification();
	Assert.assertTrue(live);
	System.out.println("Product Presented in Live");
}

@Test(priority = 9)
private void verifyCompareTab()throws Exception {
	switchingTab(firstTab);
	cw.clickCompareTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickCompareTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 10)
private void verifyCompareButton()throws Exception {
	switchingTab(firstTab);
	cw.clickCompareButton();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickCompareButton();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 11)
private void verifyRelatedProductOne()throws Exception {
	switchingTab(firstTab);
	cw.clickRelatedProductOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickRelatedProductOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 12)
private void verifyRelatedProductTwo()throws Exception {
	switchingTab(firstTab);
	cw.clickRelatedProductTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickRelatedProductTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 13)
private void verifyRelatedProductThree()throws Exception {
	switchingTab(firstTab);
	cw.clickRelatedProductThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickRelatedProductThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 14)
private void verifyRelatedProductFour()throws Exception {
	switchingTab(firstTab);
	cw.clickRelatedProductFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickRelatedProductFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 15)
private void verifyBuyNowOne() throws Exception {
	switchingTab(firstTab);
	cw.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the PreProd Url");
	switchingTab(secondTab);
	cw.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the Live Url");
}

@Test(priority = 16)
private void verifyBuyNowTwo() throws Exception {
	switchingTab(firstTab);
	cw.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the PreProd Url");
	switchingTab(secondTab);
	cw.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the Live Url");
}

@Test(priority = 17)
private void verifyBuyNowThree() throws Exception {
	switchingTab(firstTab);
	cw.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the PreProd Url");
	switchingTab(secondTab);
cw.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the Live Url");
}

@Test(priority = 18)
private void verifyBuyNowFour() throws Exception {
	switchingTab(firstTab);
	cw.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the PreProd Url");
	switchingTab(secondTab);
	cw.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the Live Url");
}

@Test(priority = 19)
private void verifyCompareOne() throws Exception{
	switchingTab(firstTab);
	cw.clickCompareOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickCompareOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 20)
private void verifyCompareTwo() throws Exception{
	switchingTab(firstTab);
	cw.clickCompareTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickCompareTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 21)
private void verifyCompareThree() throws Exception{
	switchingTab(firstTab);
	cw.clickCompareThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickCompareThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 22)
private void verifyCompareFour() throws Exception{
	switchingTab(firstTab);
	cw.clickCompareFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
cw.clickCompareFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 23)
private void verifyBrowseOne() throws Exception{
	switchingTab(firstTab);
	cw.clickBrowseLinkOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickBrowseLinkOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 24)
private void verifyBrowseTwo() throws Exception{
	switchingTab(firstTab);
	cw.clickBrowseLinkTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickBrowseLinkTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 25)
private void verifyBrowseThree() throws Exception{
	switchingTab(firstTab);
	cw.clickBrowseLinkThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickBrowseLinkThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 26)
private void verifyBrowseFour() throws Exception{
	switchingTab(firstTab);
	cw.clickBrowseLinkFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	cw.clickBrowseLinkFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}
}
