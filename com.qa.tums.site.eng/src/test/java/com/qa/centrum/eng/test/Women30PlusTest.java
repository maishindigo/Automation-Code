package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.Women30Plus;


public class Women30PlusTest extends BaseClass{
	Women30Plus wp;
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
		wp = new Women30Plus();
		switchingTab(firstTab);
		wp.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		wp.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		wp.clickCookieBtn();
		System.out.println("cookie button clicked2");
		wp.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}

@Test(priority = 1, enabled = true)
private void VerifyWriteaReview() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.clickWriteAReview();
	wp.clickWriteAReviewClose();
	switchingTab(secondTab);
	wp.clickWriteAReview();
	wp.clickWriteAReviewClose();
}
@Test(priority = 2, enabled = true)
private void VerifyBuyNow() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.ClickBuyNow();
	switchingTab(secondTab);
	wp.ClickBuyNow();

}
@Test(priority = 3, enabled = true)
private void VerifyGetCoupon() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.clickGetCoupons();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickGetCoupons();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 4, enabled = true)
private void VerifyProductBenefitTab() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.visiblityProductBefefit();
	//String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.visiblityProductBefefit();
//	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 5, enabled = true)
private void VerifyIngedientsTab() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.clickVitaminAndMineralTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	wp.clickVitaminAndMineralTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 6, enabled = true)
private void VerifyUsageTab() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.clickUsageTab();
	String preProdUrl = compareUrl(excelRead("Centrum",1, 0));
	switchingTab(secondTab);
	wp.clickUsageTab();
	String liveUrl = compareUrl(excelRead("Centrum",1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 7, enabled = true)
private void VerifyFAQTab() throws Exception {
	wp = new Women30Plus();
	switchingTab(firstTab);
	wp.clickFAQsTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickFAQsTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 8)
private void verifyTextImmuneSupportMen() throws Exception{
	switchingTab(firstTab);
	boolean preProd = wp.txtProductVerification();
	Assert.assertTrue(preProd);
	System.out.println("Product Presented in Preprod");
	switchingTab(secondTab);
	boolean live = wp.txtProductVerification();
	Assert.assertTrue(live);
	System.out.println("Product Presented in Live");
}

@Test(priority = 9)
private void verifyCompareTab()throws Exception {
	switchingTab(firstTab);
	wp.clickCompareTab();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickCompareTab();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 10)
private void verifyCompareButton()throws Exception {
	switchingTab(firstTab);
	wp.clickCompareButton();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickCompareButton();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 11)
private void verifyRelatedProductOne()throws Exception {
	switchingTab(firstTab);
	wp.clickRelatedProductOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickRelatedProductOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 12)
private void verifyRelatedProductTwo()throws Exception {
	switchingTab(firstTab);
	wp.clickRelatedProductTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickRelatedProductTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 13)
private void verifyRelatedProductThree()throws Exception {
	switchingTab(firstTab);
	wp.clickRelatedProductThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickRelatedProductThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 14)
private void verifyRelatedProductFour()throws Exception {
	switchingTab(firstTab);
	wp.clickRelatedProductFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickRelatedProductFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 15)
private void verifyBuyNowOne() throws Exception {
	switchingTab(firstTab);
	wp.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the PreProd Url");
	switchingTab(secondTab);
	wp.clickBuyNowOne();
	System.out.println("Buy Now One is verified in the Live Url");
}

@Test(priority = 16)
private void verifyBuyNowTwo() throws Exception {
	switchingTab(firstTab);
	wp.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the PreProd Url");
	switchingTab(secondTab);
	wp.clickBuyNowTwo();
	System.out.println("Buy Now Two is verified in the Live Url");
}

@Test(priority = 17)
private void verifyBuyNowThree() throws Exception {
	switchingTab(firstTab);
	wp.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the PreProd Url");
	switchingTab(secondTab);
wp.clickBuyNowThree();
	System.out.println("Buy Now Three is verified in the Live Url");
}

@Test(priority = 18)
private void verifyBuyNowFour() throws Exception {
	switchingTab(firstTab);
	wp.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the PreProd Url");
	switchingTab(secondTab);
	wp.clickBuyNowFour();
	System.out.println("Buy Now Four is verified in the Live Url");
}

@Test(priority = 19)
private void verifyCompareOne() throws Exception{
	switchingTab(firstTab);
	wp.clickCompareOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickCompareOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 20)
private void verifyCompareTwo() throws Exception{
	switchingTab(firstTab);
	wp.clickCompareTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickCompareTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 21)
private void verifyCompareThree() throws Exception{
	switchingTab(firstTab);
	wp.clickCompareThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickCompareThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 22)
private void verifyCompareFour() throws Exception{
	switchingTab(firstTab);
	wp.clickCompareFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
wp.clickCompareFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 23)
private void verifyBrowseOne() throws Exception{
	switchingTab(firstTab);
	wp.clickBrowseLinkOne();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickBrowseLinkOne();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 24)
private void verifyBrowseTwo() throws Exception{
	switchingTab(firstTab);
	wp.clickBrowseLinkTwo();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickBrowseLinkTwo();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 25)
private void verifyBrowseThree() throws Exception{
	switchingTab(firstTab);
	wp.clickBrowseLinkThree();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickBrowseLinkThree();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

@Test(priority = 26)
private void verifyBrowseFour() throws Exception{
	switchingTab(firstTab);
	wp.clickBrowseLinkFour();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	wp.clickBrowseLinkFour();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
}

}
