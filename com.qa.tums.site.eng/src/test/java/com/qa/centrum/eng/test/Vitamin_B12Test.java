package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.Vitamin_B12;


public class Vitamin_B12Test extends BaseClass {
Vitamin_B12 vb;
@BeforeClass
private void lauchingTheBrowser() throws IOException, Exception {
	browserLaunch(loadProperties().getProperty("browser"));
	launchTwoUrl();

}

@BeforeMethod
private void launchingTheUrl() throws IOException, Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	launchURL(loadProperties().getProperty("Vitamin_b12Preprod"));
	switchingTab(secondTab);
	launchURL(loadProperties().getProperty("Vitamin_b12Prod"));
}
@Test(priority = 0, enabled = true)
private void cookieButton() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickCookieBtn();
	System.out.println("cookie btn clicked1");
	vb.clickGigyaForm();
	System.out.println("gigya clicked 1");
	switchingTab(secondTab);
	System.out.println("tab switched");
	vb.clickCookieBtn();
	System.out.println("cookie button clicked2");
	vb.clickGigyaForm();
	System.out.println("gigya clicked 2");

}

@Test(priority = 1, enabled = true)
private void VerifyTab() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.visiblityFoodAndNutrition();
	vb.ClickFeaturedProductsTab();
	switchingTab(secondTab);
	vb.visiblityFoodAndNutrition();
	vb.ClickFeaturedProductsTab();

}
@Test(priority = 2, enabled = true)
private void SilverMen() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickSilverMen();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickSilverMen();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 3, enabled = true)
private void BuyNow1() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow1();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow1();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 4, enabled = true)
private void Compare1() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare1();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare1();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 5, enabled = true)
private void SilverWomen() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickSilverWomen();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickSilverWomen();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 6, enabled = true)
private void BuyNow2() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow2();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow2();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 7, enabled = true)
private void Compare2() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare2();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare2();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 8, enabled = true)
private void MinisWomen50Plus() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickminisWomen50Plus();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickminisWomen50Plus();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 9, enabled = true)
private void BuyNow3() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow3();
	
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow3();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 10, enabled = true)
private void Compare3() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare3();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare3();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 11, enabled = true)
private void MinisMen50Plus() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickminisMen50Plus();
	;
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickminisMen50Plus();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 12, enabled = true)
private void BuyNow4() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow4();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickBuyNow4();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 13, enabled = true)
private void Compare4() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare4();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.ClickFeaturedProductsTab();
	vb.clickCompare4();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 14, enabled = true)
private void Energy() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickEnergy();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickEnergy();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 15, enabled = true)
private void EnergyLearnMore() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickEnergyLeranMore();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickEnergyLeranMore();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 16, enabled = true)
private void TopFiveNutrientsForMen50() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickTopFiveNutrientsForMen50();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickTopFiveNutrientsForMen50();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 17, enabled = true)
private void StrategiestoSupportBrainHealth() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickStrategiestoSupportBrainHealth();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickStrategiestoSupportBrainHealth();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 18, enabled = true)
private void TenSimpleWaystoLiveHealthierLife() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clicktenSimpleWaystoLiveHealthierLife();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clicktenSimpleWaystoLiveHealthierLife();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}

@Test(priority = 19, enabled = true)
private void HowtoTakeVitamins() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickHowtoTakeVitamins();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickHowtoTakeVitamins();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 20, enabled = true)
private void Iron() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickIron();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickIron();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 21, enabled = true)
private void IronLearnMore() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickIronLearn();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickIronLearn();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 22, enabled = true)
private void VitaminB6() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickVitaminB6();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickVitaminB6();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 23, enabled = true)
private void VitaminB6Learn() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickVitaminB6Learn();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickVitaminB6Learn();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 24, enabled = true)
private void Niacin() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickNiacin();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickNiacin();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 25, enabled = true)
private void NiacinLearn() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickNiacinLearn();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickNiacinLearn();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 26, enabled = true)
private void Thiamin() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickThiamin();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickThiamin();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
@Test(priority = 27, enabled = true)
private void ThiaminLearnMore() throws Exception {
	vb = new Vitamin_B12();
	switchingTab(firstTab);
	vb.clickThiaminLearn();
	String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
	switchingTab(secondTab);
	vb.clickThiaminLearn();
	String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}



}
