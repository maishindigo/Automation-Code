package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumOrganicKidsMultigummies;


public class CentrumOrganicKidsMultigummiesTest extends BaseClass{
	CentrumOrganicKidsMultigummies co;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("CentrumOrganicKidsMultigummiesPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("CentrumOrganicKidsMultigummiesProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		co = new CentrumOrganicKidsMultigummies();
		switchingTab(firstTab);
		co.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		co.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		co.clickCookieBtn();
		System.out.println("cookie button clicked2");
		co.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}

@Test(priority = 1, enabled = true)
private void VerifyWriteaReview() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.clickWriteAReview();
	co.clickWriteAReviewClose();
	switchingTab(secondTab);
	co.clickWriteAReview();
	co.clickWriteAReviewClose();
}
@Test(priority = 1, enabled = true)
private void VerifyBuyNow() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.ClickBuyNow();
	switchingTab(secondTab);
	co.ClickBuyNow();

}
@Test(priority = 1, enabled = true)
private void VerifyGetCoupon() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.clickGetCoupons();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickGetCoupons();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 1, enabled = true)
private void VerifyProductBenefitTab() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.visiblityProductBefefit();
	//String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.visiblityProductBefefit();
//	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 1, enabled = true)
private void VerifyIngedientsTab() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.clickVitaminAndMineralTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	co.clickVitaminAndMineralTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 1, enabled = true)
private void VerifyUsageTab() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.clickUsageTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	co.clickUsageTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 1, enabled = true)
private void VerifyFAQTab() throws Exception {
	co = new CentrumOrganicKidsMultigummies();
	switchingTab(firstTab);
	co.clickFAQsTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickFAQsTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 7)
private void verifyTextImmuneSupportMen() throws Exception{
	switchingTab(firstTab);
	boolean preProd = co.txtProductVerification();
	Assert.assertTrue(preProd);
	System.out.println("Product Presented in Preprod");
	switchingTab(secondTab);
	boolean live = co.txtProductVerification();
	Assert.assertTrue(live);
	System.out.println("Product Presented in Live");
}

@Test(priority = 8)
private void verifyCompareTab()throws Exception {
	switchingTab(firstTab);
	co.clickCompareTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickCompareTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 9)
private void verifyCompareButton()throws Exception {
	switchingTab(firstTab);
	co.clickCompareButton();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickCompareButton();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 10)
private void verifyRelatedProductOne()throws Exception {
	switchingTab(firstTab);
	co.clickRelatedProductOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickRelatedProductOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 11)
private void verifyRelatedProductTwo()throws Exception {
	switchingTab(firstTab);
	co.clickRelatedProductTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickRelatedProductTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 12)
private void verifyRelatedProductThree()throws Exception {
	switchingTab(firstTab);
	co.clickRelatedProductThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickRelatedProductThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 13)
private void verifyRelatedProductFour()throws Exception {
	switchingTab(firstTab);
	co.clickRelatedProductFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickRelatedProductFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 14)
private void verifyBuyNowOne() throws Exception {
	switchingTab(firstTab);
	co.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the PreProd Url");
	switchingTab(secondTab);
	co.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the Live Url");
}

@Test(priority = 15)
private void verifyBuyNowTwo() throws Exception {
	switchingTab(firstTab);
	co.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the PreProd Url");
	switchingTab(secondTab);
	co.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the Live Url");
}

@Test(priority = 16)
private void verifyBuyNowThree() throws Exception {
	switchingTab(firstTab);
	co.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the PreProd Url");
	switchingTab(secondTab);
co.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the Live Url");
}

@Test(priority = 17)
private void verifyBuyNowFour() throws Exception {
	switchingTab(firstTab);
	co.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the PreProd Url");
	switchingTab(secondTab);
	co.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the Live Url");
}

@Test(priority = 18)
private void verifyCompareOne() throws Exception{
	switchingTab(firstTab);
	co.clickCompareOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickCompareOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 19)
private void verifyCompareTwo() throws Exception{
	switchingTab(firstTab);
	co.clickCompareTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickCompareTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 20)
private void verifyCompareThree() throws Exception{
	switchingTab(firstTab);
	co.clickCompareThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickCompareThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 21)
private void verifyCompareFour() throws Exception{
	switchingTab(firstTab);
	co.clickCompareFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
co.clickCompareFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 22)
private void verifyBrowseOne() throws Exception{
	switchingTab(firstTab);
	co.clickBrowseLinkOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickBrowseLinkOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 23)
private void verifyBrowseTwo() throws Exception{
	switchingTab(firstTab);
	co.clickBrowseLinkTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickBrowseLinkTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 24)
private void verifyBrowseThree() throws Exception{
	switchingTab(firstTab);
	co.clickBrowseLinkThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickBrowseLinkThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 25)
private void verifyBrowseFour() throws Exception{
	switchingTab(firstTab);
	co.clickBrowseLinkFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	co.clickBrowseLinkFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

}
