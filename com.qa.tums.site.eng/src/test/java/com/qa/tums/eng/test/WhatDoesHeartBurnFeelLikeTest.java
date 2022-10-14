package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.WhatDoesHeartburnFeelLikePage;

public class WhatDoesHeartBurnFeelLikeTest extends BaseClass{
	
	WhatDoesHeartburnFeelLikePage hfl;
	
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		launchURL(loadProperties().getProperty("url5"));

	}
	
	@Test(priority = 0, enabled = true)
	private void hearBurn101Test() throws IOException, Exception {
		hfl = new WhatDoesHeartburnFeelLikePage();
		launchURL(loadProperties().getProperty("url"));
		hfl.clickCookiesDismissBtn();
		hfl.mouseOverHearburn101();
	}
	
	
	
	
	
	
	
	
	
	

}
