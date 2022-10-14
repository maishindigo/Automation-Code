package com.qa.centrum.eng.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

public class CentrumFooterPage extends BaseClass {
	
	String firstTab;
	String secondTab;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
		
//		preProdUrl(loadProperties().getProperty("preprod"));
//		liveUrl(loadProperties().getProperty("prod"));
		
		
		
		launchURL(loadProperties().getProperty("preprod"));
		implicitWait();
		firstTab = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.open('"+loadProperties().getProperty("prod")+"')");
		implicitWait();
		
		
	}

	@Test
	public void verifyProductPage() throws Exception {
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		secondTab = driver.getWindowHandle();
		driver.switchTo().window(firstTab);
		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		Thread.sleep(3000);
		WebElement cookieBtn = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn.click();
		Thread.sleep(3000);
		WebElement clickGigyaForm = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm.click();

		driver.switchTo().window(secondTab);
		Thread.sleep(5000);
		WebElement cookieBtn1 = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn1.click();
		
		implicitWait();
		WebElement clickGigyaForm1 = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm1.click();

		driver.switchTo().window(firstTab);
		implicitWait();
		
		/**
		 * 
		 */
		
		scrollPageInUpAndDown();
		WebElement btnContactUsPreProd = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		scrollDownUsingElement(btnContactUsPreProd);
		btnContactUsPreProd.click();
		
		String contactUSURLPreprod=driver.getCurrentUrl();
		String contactUSDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(contactUSURLPreprod.contains(contactUSDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + contactUSDomainPreprod);
		}
		String contactUSPreprodPath = contactUSURLPreprod.replace(contactUSDomainPreprod, "");
		System.out.println(contactUSPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		scrollPageInUpAndDown();
		WebElement btnContactUsProd = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		scrollDownUsingElement(btnContactUsProd);
		btnContactUsProd.click();
		
		String contactUSURLLive=driver.getCurrentUrl();
		String contactUSDomainLive ="https://www.centrum.com/";
		if(contactUSURLLive.contains(contactUSDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + contactUSDomainLive);
		}
		String contactUSlivePath = contactUSURLLive.replace(contactUSDomainLive, "");
		System.out.println(contactUSlivePath);
		Assert.assertEquals(contactUSPreprodPath, contactUSlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * 
		 */
		
		scrollPageInUpAndDown();
		WebElement btnSiteMapPreProd = driver.findElement(By.xpath("//a[text()='Sitemap']"));
		btnSiteMapPreProd.click();
		
		String siteMapURLPreprod=driver.getCurrentUrl();
		String siteMapDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(siteMapURLPreprod.contains(siteMapDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + siteMapDomainPreprod);
		}
		String siteMapPreprodPath = siteMapURLPreprod.replace(siteMapDomainPreprod, "");
		System.out.println(siteMapPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		scrollPageInUpAndDown();
		WebElement btnSiteMapProd = driver.findElement(By.xpath("//a[text()='Sitemap']"));
		btnSiteMapProd.click();
		
		String siteMapURLLive=driver.getCurrentUrl();
		String siteMapDomainLive ="https://www.centrum.com/";
		if(siteMapURLLive.contains(siteMapDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + siteMapDomainLive);
		}
		String siteMaplivePath = siteMapURLLive.replace(siteMapDomainLive, "");
		System.out.println(siteMaplivePath);
		Assert.assertEquals(siteMapPreprodPath, siteMaplivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		WebElement txtFirstNamePreProd = driver.findElement(By.xpath("(//input[@name='data.centrum.newsletter.firstName'])[3]"));
		txtFirstNamePreProd.sendKeys("Sujai");
		Thread.sleep(3000);
		
		WebElement txtEmailPreProd = driver.findElement(By.xpath("(//input[@name='profile.email'])[3]"));
		txtEmailPreProd.sendKeys("Sujaiit0696@gmail.com",Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement signUpPreProd = driver.findElement(By.xpath("//h2[text()='An email just for you is on the way']"));
		
		if (signUpPreProd.isDisplayed()) {
			System.out.println(signUpPreProd.getText()+"PreProd Site");
		}
		
		driver.switchTo().window(secondTab);
		
		/**
		 * 
		 */

		WebElement txtFirstNameProd = driver.findElement(By.xpath("(//input[@name='data.centrum.newsletter.firstName'])[3]"));
		txtFirstNameProd.sendKeys("Sujai");
		Thread.sleep(3000);
		
		WebElement txtEmailProd = driver.findElement(By.xpath("(//input[@name='profile.email'])[3]"));
		txtEmailProd.sendKeys("Sujaiit0696@gmail.com",Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement signUpProd = driver.findElement(By.xpath("//h2[text()='An email just for you is on the way']"));
		
		if (signUpProd.isDisplayed()) {
			System.out.println(signUpProd.getText()+"Live Site");
		}
		
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement signUpAndSavePreProd = driver.findElement(By.xpath("//h2[@class='heading']"));
		signUpAndSavePreProd.click();
		
		Thread.sleep(2000);
		
		WebElement txtFstNamePreProd = driver.findElement(By.xpath("(//input[@name='data.centrum.newsletter.firstName'])[3]"));
		txtFstNamePreProd.sendKeys("Sujai");
		
		WebElement txtFstEmailPreProd = driver.findElement(By.xpath("(//input[@name='profile.email'])[3]"));
		txtFstEmailPreProd.sendKeys("Sujaiit0696@gmail.com",Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement txtSignUpPreProd = driver.findElement(By.xpath("//h2[text()='An email just for you is on the way']"));
		
		if (txtSignUpPreProd.isDisplayed()) {
			System.out.println(txtSignUpPreProd.getText()+"PreProd Site");
		}
		
		Thread.sleep(2000);
		
		WebElement closeWindowPreProd = driver.findElement(By.xpath("(//input[@class='gigya-input-submit'])[4]"));
		closeWindowPreProd.click();
		
		
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		

		WebElement signUpAndSaveProd = driver.findElement(By.xpath("//h2[@class='heading']"));
		signUpAndSaveProd.click();
		
		WebElement txtFstNameProd = driver.findElement(By.xpath("(//input[@name='data.centrum.newsletter.firstName'])[3]"));
		txtFstNameProd.sendKeys("Sujai");
		
		WebElement txtFstEmailProd = driver.findElement(By.xpath("(//input[@name='profile.email'])[3]"));
		txtFstEmailProd.sendKeys("Sujaiit0696@gmail.com",Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement txtSignUpProd = driver.findElement(By.xpath("//h2[text()='An email just for you is on the way']"));
		
		if (txtSignUpProd.isDisplayed()) {
			System.out.println(txtSignUpProd.getText()+"Live Site");
		}
		
		Thread.sleep(2000);
		
		WebElement closeWindowProd = driver.findElement(By.xpath("(//input[@class='gigya-input-submit'])[4]"));
		closeWindowProd.click();
		
		
		
		
		
	}
}
