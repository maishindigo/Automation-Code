package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumHeaderAndFooterPOMPage;

public class CentrumSampleFooterPage extends BaseClass{
	
	CentrumHeaderAndFooterPOMPage hf;
	
	@BeforeClass
	private void lauchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();

	}
	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("preprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("prod"));
		
	}
	
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		hf = new CentrumHeaderAndFooterPOMPage();
		 switchingTab(firstTab);
		 hf.clickCookieBtn();
		 hf.clickGigyaForm();
		 switchingTab(secondTab);
		 hf.clickCookieBtn();
		 hf.clickGigyaForm();
	}
	
	/**
	 * Yogitas's Code
	 */
	@Test(priority = 1, enabled = true)
    private void getcouponButton() throws Exception {
         switchingTab(firstTab);
         hf.clickoncoupon();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickoncoupon();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 2, enabled = true)
    private void WheretoBuyButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonwheretobuy();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonwheretobuy();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 3, enabled = true)
    private void NewsletterButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonnewsletter();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonnewsletter();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 4, enabled = true)
    private void HeaderCentrumButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonHeaderCentrum();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonHeaderCentrum();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 5, enabled = true)
    private void CountrySideButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonCountryside();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonCountryside();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 6, enabled = true)
    private void SearchButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonsearch();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonsearch();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
    @Test(priority = 7, enabled = true)
    private void GskLogoButton() throws Exception {
         switchingTab(firstTab);
         hf.clickonGskLogo();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         hf.clickonGskLogo();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
         
    }
	
	/**
	 * Sujai's Code
	 */
	@Test(priority = 8, enabled = true)
	private void contactUS() throws Exception {
		 switchingTab(firstTab);
		 hf.clickContactUs();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hf.clickContactUs();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		
		
	}
	
	@Test(priority =9, enabled=true)
	private void siteMap() throws Exception {
		switchingTab(firstTab);
		hf.clickSiteMap();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		hf.clickSiteMap();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		
	}
	
	@Test(priority = 10, enabled = true)
	private void signUpGigyaForm() throws Exception {
		switchingTab(firstTab);
		hf.gigyaFormOne();
		switchingTab(secondTab);
		hf.gigyaFormOne();
	}
	
	@Test(priority = 11, enabled = true)
	private void gigyaForm() throws Exception {
		switchingTab(firstTab);
		hf.gigyaFormTwo();
		switchingTab(secondTab);
		hf.gigyaFormTwo();
	}
	
}
