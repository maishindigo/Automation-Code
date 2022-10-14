package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.ProductComparison;

public class ProductComparisonTest extends BaseClass{
	ProductComparison pc;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		switchingTab(firstTab);
		launchURL(loadProperties().getProperty("ProductComparisonPreprod"));
		switchingTab(secondTab);
		launchURL(loadProperties().getProperty("ProductComparisonProd"));
	}
	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		pc = new ProductComparison();
		switchingTab(firstTab);
		pc.clickCookieBtn();
		System.out.println("cookie btn clicked1");
		pc.clickGigyaForm();
		System.out.println("gigya clicked 1");
		switchingTab(secondTab);
		System.out.println("tab switched");
		pc.clickCookieBtn();
		System.out.println("cookie button clicked2");
		pc.clickGigyaForm();
		System.out.println("gigya clicked 2");
	}
	@Test(priority = 3)
	private void verifyDropdown1()throws Exception {
		pc = new ProductComparison();
		switchingTab(firstTab);
		pc.test1();
		switchingTab(secondTab);
		pc.test1();

}
	@Test(priority = 3)
	private void verifyDropdown2()throws Exception {
		pc = new ProductComparison();
		switchingTab(firstTab);
		pc.test2();
		switchingTab(secondTab);
		pc.test2();

}
//	@Test(priority = 3)
//	private void verifyDropdown2()throws Exception {
//		pc = new ProductComparison();
//		switchingTab(firstTab);
//		pc.SelectProduct2();
//		switchingTab(secondTab);
//		pc.SelectProduct2();

}
	
