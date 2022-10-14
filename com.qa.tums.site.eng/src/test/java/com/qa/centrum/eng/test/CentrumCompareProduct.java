package com.qa.centrum.eng.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

public class CentrumCompareProduct extends BaseClass{
	
	String firstTab;
	String secondTab;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
	}

	@BeforeMethod
	private void launchingTheUrl() throws IOException, Exception {
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
		
		
		
		WebElement countryPreProd = driver.findElement(By.xpath("//span[@class='country-selected']"));
		countryPreProd.click();
		
		Thread.sleep(2000);
		
		WebElement locationPreProd = driver.findElement(By.xpath("//p[text()='Select Location and Language:']"));
		if (locationPreProd.isDisplayed()) {
			System.out.println(locationPreProd.getText()+"Preprod site");
		}
		
		driver.switchTo().window(secondTab);
		implicitWait();

		WebElement countryProd = driver.findElement(By.xpath("//span[@class='country-selected']"));
		countryProd.click();
		
		Thread.sleep(2000);
		
		WebElement locationProd = driver.findElement(By.xpath("//p[text()='Select Location and Language:']"));
		if (locationProd.isDisplayed()) {
			System.out.println(locationProd.getText()+"Live Site");
		}
		
		WebElement searchPreProd = driver.findElement(By.xpath("(//button[@class='button'])[1]"));
		searchPreProd.click();
		
		WebElement serchIcon = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
		String placeHolder = serchIcon.getAttribute("placeholder");
		
		if (serchIcon.isDisplayed()) {
			System.out.println(placeHolder);
		}
		
		
		
		/**
		 * 
		 */
		
//		WebElement productsPreProd=driver.findElement(By.xpath("//a[text()='Products ']"));
//		productsPreProd.click();
//		
//		String productURLPreprod=driver.getCurrentUrl();
//		String productDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
//		if(productURLPreprod.contains(productDomainPreprod)){
//			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
//			System.out.println("URL contains Preprod Domain :" + productDomainPreprod);
//		}
//		String productPreprodPath = productURLPreprod.replace(productDomainPreprod, "");
//		System.out.println(productPreprodPath);
////		driver.navigate().back();
//
//		driver.switchTo().window(secondTab);
//		Thread.sleep(2000);
//		
//		WebElement productsProd=driver.findElement(By.xpath("//a[text()='Products ']"));
//		productsProd.click();
//		
//		String productURLLive=driver.getCurrentUrl();
//		String productDomainLive ="https://www.centrum.com/";
//		if(productURLLive.contains(productDomainLive)){
//			// String livePath =getStartedURLLive.replace(DomainLive, "");
//			System.out.println("URL contains Live Domain :" + productDomainLive);
//		}
//		String productlivePath =productURLLive.replace(productDomainLive, "");
//		Assert.assertEquals(productPreprodPath, productlivePath);
//		System.out.println("Passed");
////		driver.navigate().back();
//
//		driver.switchTo().window(firstTab);
//		Thread.sleep(2000);
//	
//		
//		WebElement imgMultiBeautyPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Multi + Beauty']"));
//		imgMultiBeautyPreProd.click();
//		
//		WebElement txtMultiBeautyPreProd = driver.findElement(By.xpath("//div[@class='richText component section p-d-r-2 first odd col-xs-12']"));
//		
//		if (txtMultiBeautyPreProd.isDisplayed()) {
//			System.out.println(txtMultiBeautyPreProd.getText());
//		}
//		
//		WebElement buyNow1PreProd = driver.findElement(By.xpath("(//a[@data-gtm-product-name='Centrum MultiGummies Multi+ Beauty'])[1]"));
//		buyNow1PreProd.click();
//		
//		
//		WebElement multiGummiesPreProd = driver.findElement(By.xpath("//h2[@class='ps-product-name']"));
//		
//		if (multiGummiesPreProd.isDisplayed()) {
//			driver.navigate().refresh();
//		}
//		
//	
//		WebElement getCoupon1PreProd = driver.findElement(By.xpath("(//a[text()='Get Coupons'])[1]"));
//		getCoupon1PreProd.click();
//		
////		String multiBeautyURLPreprod=driver.getCurrentUrl();
////		String multiBeautyDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
////		if(multiBeautyURLPreprod.contains(multiBeautyDomainPreprod)){
////			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
////			System.out.println("URL contains Preprod Domain :" + multiBeautyDomainPreprod);
////		}
////		String multiBeautyPreprodPath = multiBeautyURLPreprod.replace(multiBeautyDomainPreprod, "");
////		System.out.println(multiBeautyPreprodPath);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//	
//
//		
//		
//		WebElement btnCompare1PreProd = driver.findElement(By.xpath("//a[@class='compare-button default-compare btn btn-primary btn-flexible']"));
//		scrollDownUsingElement(btnCompare1PreProd);
//		scrollPageInUp();
//		btnCompare1PreProd.click();
//		
//		
//		WebElement display1PreProd = driver.findElement(By.xpath("//h1[text()='Compare Centrum Products and Vitamins']"));
//		
//		if (display1PreProd.isDisplayed()) {
//			System.out.println(display1PreProd.isDisplayed());
//		}		
//		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.switchTo().window(secondTab);
//		Thread.sleep(2000);
//		
//		WebElement imgMultiBeautyProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Multi + Beauty']"));
//		imgMultiBeautyProd.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement txtMultiBeautyProd = driver.findElement(By.xpath("//div[@class='richText component section p-d-r-2 first odd col-xs-12']"));
//		
//		if (txtMultiBeautyProd.isDisplayed()) {
//			System.out.println(txtMultiBeautyProd.getText());
//		}
//		
//		WebElement buyNow1Prod = driver.findElement(By.xpath("(//a[@data-gtm-product-name='Centrum MultiGummies Multi+ Beauty'])[1]"));
//		buyNow1Prod.click();
//		
//		
//		WebElement multiGummiesProd = driver.findElement(By.xpath("//h2[@class='ps-product-name']"));
//		
//		if (multiGummiesProd.isDisplayed()) {
//			driver.navigate().refresh();
//		}
//		
//	
//		WebElement getCoupon1Prod = driver.findElement(By.xpath("(//a[text()='Get Coupons'])[1]"));
//		getCoupon1Prod.click();
//		
//		
////		String multiBeautyURLLive=driver.getCurrentUrl();
////		String multiBeautyDomainLive ="https://www.centrum.com/";
////		if(multiBeautyURLLive.contains(multiBeautyDomainLive)){
////			// String livePath =getStartedURLLive.replace(DomainLive, "");
////			System.out.println("URL contains Live Domain :" + multiBeautyDomainLive);
////		}
////		String multiBeautylivePath = multiBeautyURLLive.replace(multiBeautyDomainLive, "");
////		Assert.assertEquals(multiBeautyPreprodPath, multiBeautylivePath);
////		System.out.println("Passed");
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//	
//
//		
//		
//		WebElement btnCompare1Prod = driver.findElement(By.xpath("//a[@class='compare-button default-compare btn btn-primary btn-flexible']"));
//		scrollDownUsingElement(btnCompare1Prod);
//		scrollPageInUp();
//		btnCompare1Prod.click();
//		
//		
//		WebElement display1Prod = driver.findElement(By.xpath("//h1[text()='Compare Centrum Products and Vitamins']"));
//		
//		if (display1Prod.isDisplayed()) {
//			System.out.println(display1Prod.isDisplayed());
//		}		
//		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.switchTo().window(firstTab);
//		Thread.sleep(2000);
	
	
	
	}
	
}
