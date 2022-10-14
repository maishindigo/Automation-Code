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

public class CentrumProductPage extends BaseClass{
	
	
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
		System.out.println(currentUrl);
		implicitWait();
		WebElement cookieBtn = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn.click();
		implicitWait();
		WebElement clickGigyaForm = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm.click();

		driver.switchTo().window(secondTab);
//		String currentUrl1 = driver.getCurrentUrl();
//		System.out.println(currentUrl1);
//		implicitWait();
		Thread.sleep(5000);
		WebElement cookieBtn1 = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn1.click();
		
		implicitWait();
		WebElement clickGigyaForm1 = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm1.click();

		driver.switchTo().window(firstTab);
		implicitWait();
		
		WebElement productsPreProd=driver.findElement(By.xpath("//a[text()='Products ']"));
		productsPreProd.click();
		
		String productURLPreprod=driver.getCurrentUrl();
		String productDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(productURLPreprod.contains(productDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + productDomainPreprod);
		}
		String productPreprodPath = productURLPreprod.replace(productDomainPreprod, "");
		System.out.println(productPreprodPath);
//		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement productsProd=driver.findElement(By.xpath("//a[text()='Products ']"));
		productsProd.click();
		
		String productURLLive=driver.getCurrentUrl();
		String productDomainLive ="https://www.centrum.com/";
		if(productURLLive.contains(productDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + productDomainLive);
		}
		String productlivePath =productURLLive.replace(productDomainLive, "");
		Assert.assertEquals(productPreprodPath, productlivePath);
		System.out.println("Passed");
//		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
	
		
		WebElement imgMultiBeautyPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Multi + Beauty']"));
		imgMultiBeautyPreProd.click();
		
		String multiBeautyURLPreprod=driver.getCurrentUrl();
		String multiBeautyDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(multiBeautyURLPreprod.contains(multiBeautyDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + multiBeautyDomainPreprod);
		}
		String multiBeautyPreprodPath = multiBeautyURLPreprod.replace(multiBeautyDomainPreprod, "");
		System.out.println(multiBeautyPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgMultiBeautyProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Multi + Beauty']"));
		imgMultiBeautyProd.click();
		
		String multiBeautyURLLive=driver.getCurrentUrl();
		String multiBeautyDomainLive ="https://www.centrum.com/";
		if(multiBeautyURLLive.contains(multiBeautyDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + multiBeautyDomainLive);
		}
		String multiBeautylivePath = multiBeautyURLLive.replace(multiBeautyDomainLive, "");
		Assert.assertEquals(multiBeautyPreprodPath, multiBeautylivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		WebElement imgAdultsPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Adults 50+ Multivitamins']"));
		imgAdultsPreProd.click();
		
		String adultsURLPreprod=driver.getCurrentUrl();
		String adultsDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(adultsURLPreprod.contains(adultsDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + adultsDomainPreprod);
		}
		String adultsPreprodPath = adultsURLPreprod.replace(adultsDomainPreprod, "");
		System.out.println(adultsPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgAdultsProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Adults 50+ Multivitamins']"));
		imgAdultsProd.click();
		
		String adultsURLLive=driver.getCurrentUrl();
		String adultsDomainLive ="https://www.centrum.com/";
		if(adultsURLLive.contains(adultsDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + adultsDomainLive);
		}
		String adultslivePath = adultsURLLive.replace(adultsDomainLive, "");
		System.out.println(adultslivePath);
		Assert.assertEquals(adultsPreprodPath, adultslivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Need to verify on Centrum Men image
		 */
		WebElement imgMenPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Men']"));
		imgMenPreProd.click();
		
		String menURLPreprod=driver.getCurrentUrl();
		String menDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(menURLPreprod.contains(menDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + menDomainPreprod);
		}
		String menPreprodPath = menURLPreprod.replace(menDomainPreprod, "");
		System.out.println(menPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgMenProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Men']"));
		imgMenProd.click();
		

		String menURLLive=driver.getCurrentUrl();
		String menDomainLive ="https://www.centrum.com/";
		if(menURLLive.contains(menDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + menDomainLive);
		}
		String menlivePath = menURLLive.replace(menDomainLive, "");
		System.out.println(menlivePath);
		Assert.assertEquals(menPreprodPath, menlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgWomenPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Women 50+ Multivitamins']"));
		imgWomenPreProd.click();
		
		String womenURLPreprod=driver.getCurrentUrl();
		String womenDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(womenURLPreprod.contains(womenDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + womenDomainPreprod);
		}
		String womenPreprodPath = womenURLPreprod.replace(womenDomainPreprod, "");
		System.out.println(womenPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgWomenProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Women 50+ Multivitamins']"));
		imgWomenProd.click();
		
		String womenURLLive=driver.getCurrentUrl();
		String womenDomainLive ="https://www.centrum.com/";
		if(womenURLLive.contains(womenDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + womenDomainLive);
		}
		String womenlivePath = womenURLLive.replace(womenDomainLive, "");
		System.out.println(womenlivePath);
		Assert.assertEquals(womenPreprodPath, womenlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgAdults50PreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Adults 50+']"));
		imgAdults50PreProd.click();
		
		String adults50URLPreprod=driver.getCurrentUrl();
		String adults50DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(adults50URLPreprod.contains(adults50DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + adults50DomainPreprod);
		}
		String adults50PreprodPath = adults50URLPreprod.replace(adults50DomainPreprod, "");
		System.out.println(adults50PreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgAdults50Prod = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Adults 50+']"));
		imgAdults50Prod.click();
		
		String adults50URLLive=driver.getCurrentUrl();
		String adults50DomainLive ="https://www.centrum.com/";
		if(adults50URLLive.contains(adults50DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + adults50DomainLive);
		}
		String adults50livePath = adults50URLLive.replace(adults50DomainLive, "");
		System.out.println(adults50livePath);
		Assert.assertEquals(adults50PreprodPath, adults50livePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgMen50PreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Men 50+ Multivitamins']"));
		imgMen50PreProd.click();
		
		String men50URLPreprod=driver.getCurrentUrl();
		String men50DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(men50URLPreprod.contains(men50DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + men50DomainPreprod);
		}
		String men50PreprodPath = men50URLPreprod.replace(men50DomainPreprod, "");
		System.out.println(men50PreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgMen50Prod = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Men 50+ Multivitamins']"));
		imgMen50Prod.click();
		
		String men50URLLive=driver.getCurrentUrl();
		String men50DomainLive ="https://www.centrum.com/";
		if(men50URLLive.contains(men50DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + men50DomainLive);
		}
		String men50livePath = men50URLLive.replace(men50DomainLive, "");
		System.out.println(men50livePath);
		Assert.assertEquals(men50PreprodPath, men50livePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgWomen50PreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Women 50+']"));
		imgWomen50PreProd.click();
		
		String women50URLPreprod=driver.getCurrentUrl();
		String women50DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(women50URLPreprod.contains(women50DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + women50DomainPreprod);
		}
		String women50PreprodPath = women50URLPreprod.replace(women50DomainPreprod, "");
		System.out.println(women50PreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgWomen50Prod = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Women 50+']"));
		imgWomen50Prod.click();
		
		String women50URLLive=driver.getCurrentUrl();
		String women50DomainLive ="https://www.centrum.com/";
		if(women50URLLive.contains(women50DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + women50DomainLive);
		}
		String women50livePath = women50URLLive.replace(women50DomainLive, "");
		System.out.println(women50livePath);
		Assert.assertEquals(women50PreprodPath, women50livePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgMenImmunePreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Immune Support Men']"));
		imgMenImmunePreProd.click();
		
		String menImmuneURLPreprod=driver.getCurrentUrl();
		String menImmuneDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(menImmuneURLPreprod.contains(menImmuneDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + menImmuneDomainPreprod);
		}
		String menImmunePreprodPath = menImmuneURLPreprod.replace(menImmuneDomainPreprod, "");
		System.out.println(menImmunePreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgMenImmuneProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Immune Support Men']"));
		imgMenImmuneProd.click();
		
		String menImmuneURLLive=driver.getCurrentUrl();
		String menImmuneDomainLive ="https://www.centrum.com/";
		if(menImmuneURLLive.contains(menImmuneDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + menImmuneDomainLive);
		}
		String menImmunelivePath = menImmuneURLLive.replace(menImmuneDomainLive, "");
		System.out.println(menImmunelivePath);
		Assert.assertEquals(menImmunePreprodPath, menImmunelivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * 
		 */
		
		WebElement imgWomenImmunePreProd = driver.findElement(By.xpath("//img[@alt='Box of Box of Centrum Minis Immune Support Women']"));
		imgWomenImmunePreProd.click();
		
		String womenImmuneURLPreprod=driver.getCurrentUrl();
		String womenImmuneDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(womenImmuneURLPreprod.contains(womenImmuneDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + womenImmuneDomainPreprod);
		}
		String womenImmunePreprodPath = womenImmuneURLPreprod.replace(womenImmuneDomainPreprod, "");
		System.out.println(womenImmunePreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgWomenImmuneProd = driver.findElement(By.xpath("//img[@alt='Box of Box of Centrum Minis Immune Support Women']"));
		imgWomenImmuneProd.click();
		
		String womenImmuneURLLive=driver.getCurrentUrl();
		String womenImmuneDomainLive ="https://www.centrum.com/";
		if(womenImmuneURLLive.contains(womenImmuneDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + womenImmuneDomainLive);
		}
		String womenImmunelivePath = womenImmuneURLLive.replace(womenImmuneDomainLive, "");
		System.out.println(womenImmunelivePath);
		Assert.assertEquals(womenImmunePreprodPath, womenImmunelivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * 
		 */
		
		WebElement imgMenMultivitaminPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Men’s Whole Food Blend Multivitamin ']"));
		imgMenMultivitaminPreProd.click();
		
		String menMultivitaminURLPreprod=driver.getCurrentUrl();
		String menMultivitaminDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(menMultivitaminURLPreprod.contains(menMultivitaminDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + menMultivitaminDomainPreprod);
		}
		String menMultivitaminPreprodPath = menMultivitaminURLPreprod.replace(menMultivitaminDomainPreprod, "");
		System.out.println(menMultivitaminPreprodPath);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement imgMenMultivitaminProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Men’s Whole Food Blend Multivitamin ']"));
		imgMenMultivitaminProd.click();
		
		String menMultivitaminURLLive=driver.getCurrentUrl();
		String menMultivitaminDomainLive ="https://www.centrum.com/";
		if(menMultivitaminURLLive.contains(menMultivitaminDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + menMultivitaminDomainLive);
		}
		String menMultivitaminlivePath = menMultivitaminURLLive.replace(menMultivitaminDomainLive, "");
		System.out.println(menMultivitaminlivePath);
		Assert.assertEquals(menMultivitaminPreprodPath, menMultivitaminlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		
	}
}
