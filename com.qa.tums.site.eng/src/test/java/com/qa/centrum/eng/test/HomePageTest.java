package com.qa.centrum.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.centrum.eng.pages.HomePages;

public class HomePageTest extends HomePages{
	HomePages hp ;
	
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		launchURL(loadProperties().getProperty("url"));
		
	}
	
	@Test
	private void verifyTheLearnMoreLink() throws Exception {
		hp = new HomePages();
		hp.clickCookiesDismissBtn();
		hp.clickLearnMoreBtn();
		hp.clickCookiesDismissBtn();
		hp.verifyurl();
		
	}
	

}
