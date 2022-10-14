package com.qa.centrum.eng.test;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumAboutPage;
import com.qa.tums.eng.util.Xls_Reader;

public class CentrumSampleAboutPage extends BaseClass {
	CentrumAboutPage ab;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		//launchURL(loadProperties().getProperty("preprod"));
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/about/");
		switchingTab(secondTab);
		//launchURL(loadProperties().getProperty("prod"));
		launchURL("https://www.centrum.com/about/");
		
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		 ab = new CentrumAboutPage();
		 switchingTab(firstTab);
		 ab.clickCookieBtn();
		 ab.clickGigyaForm();
		 switchingTab(secondTab);
		 ab.clickCookieBtn();
		 ab.clickGigyaForm();

}
	
	@Test(priority = 1, enabled = true)
	private void scienceLink() throws Exception {
		switchingTab(firstTab);
		ab.clickSciencebtn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickSciencebtn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 2, enabled = true)
	private void CentrumAdultsLink() throws Exception {
		switchingTab(firstTab);
		ab.clickcentrumAdultbtn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickcentrumAdultbtn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 3, enabled = true)
	private void CentrumMultiGummiesAdultsLink() throws Exception {
		switchingTab(firstTab);
		ab.clickCentrumMultiGummiesAdult();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickCentrumMultiGummiesAdult();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 4, enabled = true)
	private void CentrumMinis() throws Exception {
		switchingTab(firstTab);
		ab.clickCenturmMinisbtn();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickCenturmMinisbtn();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 5, enabled = true)
	private void CentrumMultigummiesWomen() throws Exception {
		switchingTab(firstTab);
		ab.clickMultiGummiesWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickMultiGummiesWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}
	
	@Test(priority = 6, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		ab.clickbuyNow1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickbuyNow1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void Compare1() throws Exception {
		switchingTab(firstTab);
		ab.clickcompare1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickcompare1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 8, enabled = true)
	private void CentrumBuyNow2() throws Exception {
		switchingTab(firstTab);
		ab.clickbuyNow2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickbuyNow2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}
	
	@Test(priority = 9, enabled = true)
	private void Compare2() throws Exception {
		switchingTab(firstTab);
		ab.clickcompare2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickcompare2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}


	@Test(priority = 10, enabled = true)
	private void CentrumBuyNow3() throws Exception {
		switchingTab(firstTab);
		ab.clickbuyNow3();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickbuyNow3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 11, enabled = true)
	private void Compare3() throws Exception {
		switchingTab(firstTab);
		ab.clickcompare3();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickcompare3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}
	@Test(priority = 12, enabled = true)
	private void CentrumBuyNow4() throws Exception {
		switchingTab(firstTab);
		ab.clickbuyNow4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickbuyNow4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 13, enabled = true)
	private void Compare4() throws Exception {
		switchingTab(firstTab);
		ab.clickcompare4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickcompare4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 14, enabled = true)
	private void Article1() throws Exception {
		switchingTab(firstTab);
		ab.clickarticle1();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickarticle1();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 15, enabled = true)
	private void Article2() throws Exception {
		switchingTab(firstTab);
		ab.clickarticle2();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickarticle2();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 16, enabled = true)
	private void Article3() throws Exception {
		switchingTab(firstTab);
		ab.clickarticle3();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickarticle3();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}

	@Test(priority = 17, enabled = true)
	private void Article4() throws Exception {
		switchingTab(firstTab);
		ab.clickarticle4();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ab.clickarticle4();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);

	}
}
