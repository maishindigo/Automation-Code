package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.ContactForm;

public class ContactFormTest extends BaseClass{
	ContactForm cf;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("ContactFormPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("ContactFormProd"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cf = new ContactForm();
		switchingTab(firstTab);
		cf.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		cf.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		cf.clickCookieBtn();
		System.out.println("cookie button clicked2");
		cf.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 3, enabled = true)
	private void VerifyEmail() throws Exception {
		cf = new ContactForm();
		switchingTab(firstTab);
		cf.clickEmail();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cf.clickEmail();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void VerifyFAQLink() throws Exception {
		cf = new ContactForm();
		switchingTab(firstTab);
		cf.clickFAQLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cf.clickFAQLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void VerifyhereLink() throws Exception {
		cf = new ContactForm();
		switchingTab(firstTab);
		cf.clickhereLink();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cf.clickhereLink();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}


}
