package com.qa.centrum.eng.test;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.FoodandNutrition;
import com.qa.centrum.eng.pages.howSpplementsWork;


public class howSupplementsWorkTest extends BaseClass {
	howSpplementsWork hsw;
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		hsw = new howSpplementsWork();
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("HowSupplementsWorkPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("HowSupplementsWorkProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		hsw = new howSpplementsWork();
		switchingTab(firstTab);
		hsw.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		hsw.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		hsw.clickCookieBtn();
		System.out.println("cookie button clicked2");
	hsw.clickGigyaForm();
		System.out.println("gigya clicked 2");

}
	@Test(priority = 1, enabled = true)
	private void VerifyReadMore1() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickReadMore1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickReadMore1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 2, enabled = true)
	private void VerifyReadMore2() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickReadMore1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickReadMore1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 3, enabled = true)
	private void VerifyHowDoVitaminsWork() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickHowDoVitaminsWork();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickHowDoVitaminsWork();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 4, enabled = true)
	private void VerifyStudy() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickStudy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickStudy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 5, enabled = true)
	private void VerifyGummyVitaminsforAdults() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickGummyVitaminsforAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickGummyVitaminsforAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 6, enabled = true)
	private void VerifyDebunkingVitaminMyths() throws Exception {
		//nr = new nutrientsAndRoutine();
		switchingTab(firstTab);
		hsw.clickDebunkingVitaminMyths();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hsw.clickDebunkingVitaminMyths();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
}
	@Test(priority = 7, enabled = true)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        hsw.clickShowReference();
        switchingTab(secondTab);
        hsw.clickShowReference();
    }
}
