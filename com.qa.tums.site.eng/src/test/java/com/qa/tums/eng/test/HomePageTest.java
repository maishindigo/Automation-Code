package com.qa.tums.eng.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.HomePages;
import com.qa.tums.eng.util.ExtentManager;
import com.qa.tums.eng.util.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest extends BaseClass{
	HomePages hp;
	

	
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		launchURL(loadProperties().getProperty("url"));

	}

//	
//	WebDriver driver;
//	String firstTab;
//	String secondTab;
//	
//	@BeforeClass
//	private void launchTheFirstTab() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//	}
//	@BeforeMethod
//	private void launchTheSecondTab() {
//		driver.get("https://gskstaging15:Climate2022@tums-com-v2.preprod-cf65.ch.adobecqms.net/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		firstTab = driver.getWindowHandle();
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("window.open('https://www.tums.com/')");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}
	@Test
	public void verifyTheLearnMoreLink() throws Exception {
		hp  = new HomePages();
//		Thread.sleep(5000);
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
//		secondTab = driver.getWindowHandle();
//		driver.switchTo().window(firstTab);
//		WebElement findElement = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//		if (findElement.isDisplayed()) {
//			findElement.click();
//		}
//		driver.switchTo().window(secondTab);
////		driver.switchTo().window(tabs.get(1));
//		WebElement findElements = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//		if (findElements.isDisplayed()) {
//			findElements.click();
//		}
		
		hp.clickCookiesDismissBtn();
//		hp.clickLearnMoreBtn();
		
		WebElement findElement = driver.findElement(By.xpath("//a[@id='cooling-sensation-learn-more']"));
		scrollDownUsingElement(findElement);
		
		
		
//		hp.verifyurl(excelRead("vURL", 1, 1));
//		hp.verifyTlt(excelRead("Title", 1, 1));
	}

//	@Test(priority = 1, enabled = true)
//	private void verifyProductPage() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickProductPageLink();
//		hp.verifyurl(excelRead("vURL", 2, 1));
//		hp.verifyTlt(excelRead("Title", 2, 1));
//	}
//
//	@Test(priority = 2,enabled = true)
//	private void verifyBuyNowLink() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickBuyNowBtn();
//		hp.verifyurl(excelRead("vURL", 3, 1));
//		hp.verifyTlt(excelRead("Title", 3, 1));
//
//	}

//	@Test(priority = 3,enabled = true)
//	private void verifyTUMS_ChewyBitesLink() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickTUMS_ChewyBitesLink();
//		hp.verifyurl(excelRead("vURL", 4, 1));
//		hp.verifyTlt(excelRead("Title", 4, 1));
//	}
//
//	@Test(priority = 4,enabled = true)
//	private void verifyTUMS_ChewyBitesCoolingsSensationLink() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickTUMS_ChewyBitesCoolingsSensationLink();
//		hp.verifyurl(excelRead("vURL", 5, 1));
//		hp.verifyTlt(excelRead("Title", 5, 1));
//	}
//
//	@Test(priority = 5,enabled = true)
//	private void verifyTUMSAmerica1Link() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickTUMSAmerica1Link();
//		hp.verifyurl(excelRead("vURL", 6, 1));
//		hp.verifyTlt(excelRead("Title", 6, 1));
//	}
//
//	@Test(priority = 6,enabled = true)
//	private void verifyfightBackFastAgainstLink() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickfightBackFastAgainstLink();
//		hp.verifyurl(excelRead("vURL", 7, 1));
//		
//		hp.verifyTlt(excelRead("Title", 7, 1));
//
//	}
//
//	@Test(priority =7, enabled = true)
//	private void verifyYoutube() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.clickYoutubeIcon();
//		hp.switchtoFrame();
//		hp.verifyYoutubeVideo();
//
//	}
//
//	@Test(priority = 8, enabled = true)
//	private void verifyCokkieSetting() throws Exception {
//		hp.clickCookiesDismissBtn();
//		hp.cookieSetting();
//		hp.cookieContent();
//	}
	
	
	
	
	
	
	
	

}
