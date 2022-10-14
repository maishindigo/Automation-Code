package com.qa.centrum.eng.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.centrumMen;
import com.qa.centrum.eng.pages.centrumWomenTropicalFruitMultigummies;
import com.qa.tums.eng.pages.aboutCentrum;

public class centrumMenTest extends BaseClass {
	centrumMen cm;

	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
//		switchingTab(firstTab);
//		launchURL(loadProperties().getProperty("preprod"));
//		switchingTab(secondTab);
//		launchURL(loadProperties().getProperty("prod"));

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("CentrumMenPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("CentrumMenprod"));

	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		cm.clickGigyaForm();
		System.out.println("gigya clicked 1");
//		cm.clickProductsLink();
//		System.out.println("product clicked");
//		cm.clickCentrumMen();
//		System.out.println("centrum men clicked1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		cm.clickCookieBtn();
		System.out.println("cookie button clicked2");
		cm.clickGigyaForm();
		System.out.println("gigya clicked 2");
		//cm.clickProductsLink();
//		System.out.println("product clicked 2");
//		cm.clickCentrumMen();
//		System.out.println("centrum men clicked2");

}

@Test(priority = 1, enabled = true)
private void VerifyWriteaReview() throws Exception {
	cm = new centrumMen();
	switchingTab(firstTab);
	cm.clickWriteAReview();
	cm.clickWriteAReviewClose();
	switchingTab(secondTab);
	cm.clickWriteAReview();
	cm.clickWriteAReviewClose();
}
	@Test(priority = 1, enabled = true)
	private void BuyNowButton() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickBuyNow();
		Assert.assertTrue(cm.men40T());
		cm.clickBuyNowClose();
		switchingTab(secondTab);
		cm.clickBuyNow();
		Assert.assertTrue(cm.men40T());
		cm.clickBuyNowClose();

	}
	//***** Coupon links are different on both *****//
//	@Test(priority = 2, enabled = true)
//	private void CouponLink() throws Exception {
//		switchingTab(firstTab);
//		cm.clickCoupons();
//		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		switchingTab(secondTab);
//		cm.clickCoupons();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
//
//	}
	@Test(priority = 3, enabled = true)
	private void VerifyGetCoupon() throws Exception {
		cm = new centrumMen();
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
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.visiblityProductBefefit();
		//String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cm.visiblityProductBefefit();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void VerifyIngedientsTab() throws Exception {
		cm = new centrumMen();
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
		cm = new centrumMen();
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
		cm = new centrumMen();
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
	private void verifyTextCentrumMen() throws Exception{
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
	@Test(priority = 2, enabled = true)
	private void AdultLink() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		cm.clickAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 3, enabled = true)
	private void SilverMenLink() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickSilverMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		cm.clickSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 4, enabled = true)
	private void MultigummiesMen() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickcentrumMultigummiesMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		cm.clickcentrumMultigummiesMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 5, enabled = true)
	private void MultigummiesMen50Plus() throws Exception {
		cm = new centrumMen();
		switchingTab(firstTab);
		cm.clickcentrumMultigummiesMen50Plus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		navigateBack();
		switchingTab(secondTab);
		cm.clickcentrumMultigummiesMen50Plus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		navigateBack();
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 7, enabled = true)
    private void verifyMultivitamins() throws Exception {
        switchingTab(firstTab);
        cm = new centrumMen();
        cm.clickGigyaForm();
        //cm.clickCookieBtn();
        cm.clickMultivitamins();
        String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
        switchingTab(secondTab);
        cm.clickMultivitamins();
        String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    }



   @Test(priority = 8,enabled = true)
    private void verifyTargetedSupplements() throws Exception {
        switchingTab(firstTab);
        cm = new centrumMen();
        cm.clickGigyaForm();
        cm.clickTargetedSupplements();
        String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
        switchingTab(secondTab);
        cm.clickTargetedSupplements();
        String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    }



   @Test(priority = 9, enabled = true)
    public void verifyVitamainPacks() throws Exception {
        switchingTab(firstTab);
        cm = new centrumMen();
       // cm.clickCookieBtn();
        cm.clickGigyaForm();
        cm.clickVitaminPack();
        String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
        switchingTab(secondTab);
        cm.clickVitaminPack();
        String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    }



   @Test(priority = 10, enabled = true)
    public void verifySeeAllProduct() throws Exception {
        switchingTab(firstTab);
        cm = new centrumMen();
        cm.clickGigyaForm();
        cm.clickSeeAllProduct();
        String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
        switchingTab(secondTab);
        cm.clickSeeAllProduct();
        String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    }
   
   @Test(priority = 10, enabled = true)
   public void verifyNonGMO() throws Exception {
       switchingTab(firstTab);
       cm = new centrumMen();
       cm.clickGigyaForm();
       //cm.clickCookieBtn();
       cm.clickNonGMO();
       String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
       switchingTab(secondTab);
       cm.clickNonGMO();;
       String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
       boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
       System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }
}
