package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumGummyCalmResetforAdults;


public class CentrumGummyCalmResetforAdultsTest extends BaseClass {
	CentrumGummyCalmResetforAdults cg;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("CentrumGummyCalmResetforAdultsPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("CentrumGummyCalmResetforAdultsProd"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		cg.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		cg.clickCookieBtn();
		System.out.println("cookie button clicked2");
		cg.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}

	@Test(priority = 1, enabled = true)
	private void VerifyWriteaReview() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickWriteAReview();
		cg.clickWriteAReviewClose();
		switchingTab(secondTab);
		cg.clickWriteAReview();
		cg.clickWriteAReviewClose();
	}

	@Test(priority = 2, enabled = true)
	private void VerifyBuyNow() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.ClickBuyNow();
		switchingTab(secondTab);
		cg.ClickBuyNow();

	}

	@Test(priority = 3, enabled = true)
	private void VerifyGetCoupon() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void VerifyProductBenefitTab() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.visiblityProductBefefit();
		// String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.visiblityProductBefefit();
//	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 5, enabled = true)
	private void VerifyIngedientsTab() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickVitaminAndMineralTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickVitaminAndMineralTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 6, enabled = true)
	private void VerifyUsageTab() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickUsageTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickUsageTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 7, enabled = true)
	private void VerifyFAQTab() throws Exception {
		cg = new CentrumGummyCalmResetforAdults();
		switchingTab(firstTab);
		cg.clickFAQsTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickFAQsTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}

	@Test(priority = 8)
	private void verifyTextImmuneSupportMen() throws Exception {
		switchingTab(firstTab);
		boolean preProd = cg.txtProductVerification();
		Assert.assertTrue(preProd);
		System.out.println("Product Presented in Preprod");
		switchingTab(secondTab);
		boolean live = cg.txtProductVerification();
		Assert.assertTrue(live);
		System.out.println("Product Presented in Live");
	}

	@Test(priority = 9)
	private void verifyCompareTab() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 10)
	private void verifyCompareButton() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareButton();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareButton();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 11)
	private void verifyRelatedProductOne() throws Exception {
		switchingTab(firstTab);
		cg.clickRelatedProductOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickRelatedProductOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 12)
	private void verifyRelatedProductTwo() throws Exception {
		switchingTab(firstTab);
		cg.clickRelatedProductTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickRelatedProductTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 13)
	private void verifyRelatedProductThree() throws Exception {
		switchingTab(firstTab);
		cg.clickRelatedProductThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickRelatedProductThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 14)
	private void verifyRelatedProductFour() throws Exception {
		switchingTab(firstTab);
		cg.clickRelatedProductFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickRelatedProductFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 15)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		cg.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the PreProd Url");
		switchingTab(secondTab);
		cg.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the Live Url");
	}

	@Test(priority = 16)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		cg.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the PreProd Url");
		switchingTab(secondTab);
		cg.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the Live Url");
	}

	@Test(priority = 17)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		cg.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the PreProd Url");
		switchingTab(secondTab);
		cg.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the Live Url");
	}

	@Test(priority = 18)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		cg.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the PreProd Url");
		switchingTab(secondTab);
		cg.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the Live Url");
	}

	@Test(priority = 19)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 20)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 21)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 22)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		cg.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 23)
	private void verifyBrowseOne() throws Exception {
		switchingTab(firstTab);
		cg.clickBrowseLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickBrowseLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 24)
	private void verifyBrowseTwo() throws Exception {
		switchingTab(firstTab);
		cg.clickBrowseLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickBrowseLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 25)
	private void verifyBrowseThree() throws Exception {
		switchingTab(firstTab);
		cg.clickBrowseLinkThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickBrowseLinkThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

	@Test(priority = 26)
	private void verifyBrowseFour() throws Exception {
		switchingTab(firstTab);
		cg.clickBrowseLinkFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cg.clickBrowseLinkFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :" + compareTwoText);
	}

}
