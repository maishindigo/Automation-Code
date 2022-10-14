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

public class CentrumAboutPage extends BaseClass{
	
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
	public void verifyAbout() throws Exception {
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		secondTab = driver.getWindowHandle();
		driver.switchTo().window(firstTab);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		implicitWait();
		Thread.sleep(2000);
		WebElement cookieBtn = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn.click();
		Thread.sleep(2000);
		WebElement clickGigyaForm = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm.click();

		driver.switchTo().window(secondTab);
//		String currentUrl1 = driver.getCurrentUrl();
//		System.out.println(currentUrl1);
		Thread.sleep(4000);

		WebElement cookieBtn1 = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookieBtn1.click();
		
		Thread.sleep(2000);
		WebElement clickGigyaForm1 = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm1.click();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under HomePage, "About" should be clicked and verified
		 */
		WebElement btnAboutPreProd = driver.findElement(By.xpath("//a[text()='About ']"));
		btnAboutPreProd.click();
		
		String aboutURLPreprod=driver.getCurrentUrl();
		String aboutDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(aboutURLPreprod.contains(aboutDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + aboutDomainPreprod);
		}
		String aboutPreprodPath = aboutURLPreprod.replace(aboutDomainPreprod, "");
		System.out.println(aboutPreprodPath);
//		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement btnAboutProd = driver.findElement(By.xpath("//a[text()='About ']"));
		btnAboutProd.click();
		
		String aboutURLLive=driver.getCurrentUrl();
		String aboutDomainLive ="https://www.centrum.com/";
		if(aboutURLLive.contains(aboutDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + aboutDomainLive);
		}
		String aboutlivePath =aboutURLLive.replace(aboutDomainLive, "");
		Assert.assertEquals(aboutPreprodPath, aboutlivePath);
		System.out.println("Passed");
//		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "science" should be clicked and verified 
		 */
		
		WebElement btnSciencePreProd = driver.findElement(By.xpath("//a[text()='science']"));
		btnSciencePreProd.click();
		
		String scienceURLPreprod=driver.getCurrentUrl();
		String scienceDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(scienceURLPreprod.contains(scienceDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + scienceDomainPreprod);
		}
		String sciencePreprodPath = scienceURLPreprod.replace(scienceDomainPreprod, "");
		System.out.println(sciencePreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement btnScienceProd = driver.findElement(By.xpath("//a[text()='science']"));
		btnScienceProd.click();
		
		String scienceURLLive=driver.getCurrentUrl();
		String scienceDomainLive ="https://www.centrum.com/";
		if(scienceURLLive.contains(scienceDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + scienceDomainLive);
		}
		String sciencelivePath = scienceURLLive.replace(scienceDomainLive, "");
		Assert.assertEquals(sciencePreprodPath, sciencelivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "Centrum Product" should be clicked and verified
		 */
		
		scrollPageInUpAndDown();
		WebElement btnCentrumPreProd = driver.findElement(By.xpath("(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[1]"));
		btnCentrumPreProd.click();
		////div[contains(@class,'f-adults f-energy f-general-wellness f-immunity f-metabolism')]
		//img[@alt='Box of Centrum Adults Multivitamins']
		//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[1]
		
		String centrumURLPreprod=driver.getCurrentUrl();
		String centrumDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(centrumURLPreprod.contains(centrumDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + centrumDomainPreprod);
		}
		String centrumPreprodPath = centrumURLPreprod.replace(centrumDomainPreprod, "");
		System.out.println(centrumPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		
		WebElement btnCentrumProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Adults Multivitamins']"));
		btnCentrumProd.click();
		
		String centrumURLLive=driver.getCurrentUrl();
		String centrumDomainLive ="https://www.centrum.com/";
		if(centrumURLLive.contains(centrumDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + centrumDomainLive);
		}
		String centrumlivePath = centrumURLLive.replace(centrumDomainLive, "");
		Assert.assertEquals(centrumPreprodPath, centrumlivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Centrum MultiGummies Product" should be clicked and verified
		 */
		
		scrollPageInUpAndDown();
		WebElement btnCentrumMultiGummiesPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Adults ']"));
		btnCentrumMultiGummiesPreProd.click();
		
		String centrumMultiGummiesURLPreprod=driver.getCurrentUrl();
		String centrumMultiGummiesDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(centrumMultiGummiesURLPreprod.contains(centrumMultiGummiesDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + centrumMultiGummiesDomainPreprod);
		}
		String centrumMultiGummiesPreprodPath = centrumMultiGummiesURLPreprod.replace(centrumMultiGummiesDomainPreprod, "");
		System.out.println(centrumMultiGummiesPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		
		WebElement btnCentrumMultiGummiesProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Adults ']"));
		btnCentrumMultiGummiesProd.click();
		
		String centrumMultiGummiesURLLive=driver.getCurrentUrl();
		String centrumMultiGummiesDomainLive ="https://www.centrum.com/";
		if(centrumMultiGummiesURLLive.contains(centrumMultiGummiesDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + centrumMultiGummiesDomainLive);
		}
		String centrumMultiGummieslivePath = centrumMultiGummiesURLLive.replace(centrumMultiGummiesDomainLive, "");
		Assert.assertEquals(centrumMultiGummiesPreprodPath, centrumMultiGummieslivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "Centrum Minis Product" should be clicked and verified
		 */
		
		scrollPageInUpAndDown();
		WebElement btnCenturmMinisPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Adults 50+']"));
		btnCenturmMinisPreProd.click();
		
		String centrumMinisURLPreprod=driver.getCurrentUrl();
		String centrumMinisDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(centrumMinisURLPreprod.contains(centrumMinisDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + centrumMinisDomainPreprod);
		}
		String centrumMinisPreprodPath = centrumMinisURLPreprod.replace(centrumMinisDomainPreprod, "");
		System.out.println(centrumMinisPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		
		WebElement btnCenturmMinisProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Minis Adults 50+']"));
		btnCenturmMinisProd.click();
		
		
		String centrumMinisURLLive=driver.getCurrentUrl();
		String centrumMinisDomainLive ="https://www.centrum.com/";
		if(centrumMinisURLLive.contains(centrumMinisDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + centrumMinisDomainLive);
		}
		String centrumMinislivePath = centrumMinisURLLive.replace(centrumMinisDomainLive, "");
		Assert.assertEquals(centrumMinisPreprodPath, centrumMinislivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "Centrum MultiGummies Women Product" should be clicked and verified
		 */
		scrollPageInUpAndDown();
		WebElement btnMultiGummiesPreProd = driver.findElement(By.xpath("//img[@alt='Box of  Centrum MultiGummies Women 50+ Multivitamins']"));
		btnMultiGummiesPreProd.click();
		
		String multiGummiesURLPreprod=driver.getCurrentUrl();
		String multiGummiesDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(multiGummiesURLPreprod.contains(multiGummiesDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + multiGummiesDomainPreprod);
		}
		String multiGummiesPreprodPath = multiGummiesURLPreprod.replace(multiGummiesDomainPreprod, "");
		System.out.println(multiGummiesPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		
		WebElement btnMultiGummiesProd = driver.findElement(By.xpath("//img[@alt='Box of  Centrum MultiGummies Women 50+ Multivitamins']"));
		btnMultiGummiesProd.click();
		
		String multiGummiesURLLive=driver.getCurrentUrl();
		String multiGummiesDomainLive ="https://www.centrum.com/";
		if(multiGummiesURLLive.contains(multiGummiesDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + multiGummiesDomainLive);
		}
		String multiGummieslivePath = multiGummiesURLLive.replace(multiGummiesDomainLive, "");
		Assert.assertEquals(multiGummiesPreprodPath, multiGummieslivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "BuyNow One" should be clicked and verified
		 */
		
		WebElement btnBuyNow1PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[1]"));
		btnBuyNow1PreProd.click();
		
		String buyNow1URLPreprod=driver.getCurrentUrl();
		String buyNow1DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(buyNow1URLPreprod.contains(buyNow1DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + buyNow1DomainPreprod);
		}
		String buyNow1PreprodPath = buyNow1URLPreprod.replace(buyNow1DomainPreprod, "");
		System.out.println(buyNow1PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		
		try {
			WebElement btnBuyNow1Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[1]"));
			btnBuyNow1Prod.click();
			
		} catch (Exception e) {
			System.out.println("Unable to click the buy now button");
			throw new Exception("unable to click");
		}
		
		
		String buyNow1URLLive=driver.getCurrentUrl();
		String buyNow1DomainLive ="https://www.centrum.com/";
		if(buyNow1URLLive.contains(buyNow1DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + buyNow1DomainLive);
		}
		String buyNow1livePath = buyNow1URLLive.replace(buyNow1DomainLive, "");
		System.out.println(buyNow1livePath);
		Assert.assertEquals(buyNow1PreprodPath, buyNow1livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Compare One" should be clicked and verified
		 */
		scrollPageInUpAndDown();
		WebElement btnCompare1PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[1]"));
		btnCompare1PreProd.click();
		
		String compare1URLPreprod=driver.getCurrentUrl();
		String compare1DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compare1URLPreprod.contains(compare1DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compare1DomainPreprod);
		}
		String compare1PreprodPath = compare1URLPreprod.replace(compare1DomainPreprod, "");
		System.out.println(compare1PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		
		WebElement btnCompare1Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[1]"));
		btnCompare1Prod.click();
		
		String compare1URLLive=driver.getCurrentUrl();
		String compare1DomainLive ="https://www.centrum.com/";
		if(compare1URLLive.contains(compare1DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compare1DomainLive);
		}
		String compare1livePath = compare1URLLive.replace(compare1DomainLive, "");
		Assert.assertEquals(compare1PreprodPath, compare1livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "BuyNow Two" should be clicked and verified
		 */
//		scrollPageInUpAndDown();
//		WebElement btnBuyNow2PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[2]"));
//		btnBuyNow2PreProd.click();
//		
//		String buyNow2URLPreprod=driver.getCurrentUrl();
//		String buyNow2DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
//		if(buyNow2URLPreprod.contains(buyNow2DomainPreprod)){
//			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
//			System.out.println("URL contains Preprod Domain :" + buyNow2DomainPreprod);
//		}
//		String buyNow2PreprodPath = buyNow2URLPreprod.replace(buyNow2DomainPreprod, "");
//		System.out.println(buyNow2PreprodPath);
//		driver.navigate().back();
//
//		driver.switchTo().window(secondTab);
//		Thread.sleep(2000);
//		scrollPageInUpAndDown();
//		
//		WebElement btnBuyNow2Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[2]"));
//		btnBuyNow2Prod.click();
//		
//		String buyNow2URLLive=driver.getCurrentUrl();
//		String buyNow2DomainLive ="https://www.centrum.com/";
//		if(buyNow2URLLive.contains(buyNow2DomainLive)){
//			// String livePath =getStartedURLLive.replace(DomainLive, "");
//			System.out.println("URL contains Live Domain :" + buyNow2DomainLive);
//		}
//		String buyNow2livePath = buyNow2URLLive.replace(buyNow2DomainLive, "");
//		Assert.assertEquals(buyNow2PreprodPath, buyNow2livePath);
//		System.out.println("Passed");
//		driver.navigate().back();
//
//		driver.switchTo().window(firstTab);
//		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Compare Two" should be clicked and verified
		 */
//		scrollPageInUpAndDown();
		WebElement btnCompare2PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[2]"));
		btnCompare2PreProd.click();
		
		String compare2URLPreprod=driver.getCurrentUrl();
		String compare2DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compare2URLPreprod.contains(compare2DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compare2DomainPreprod);
		}
		String compare2PreprodPath = compare2URLPreprod.replace(compare2DomainPreprod, "");
		System.out.println(compare2PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
//		scrollPageInUpAndDown();
		
		WebElement btnCompare2Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[2]"));
		btnCompare2Prod.click();
		
		String compare2URLLive=driver.getCurrentUrl();
		String compare2DomainLive ="https://www.centrum.com/";
		if(compare2URLLive.contains(compare2DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compare2DomainLive);
		}
		String compare2livePath = compare2URLLive.replace(compare2DomainLive, "");
		Assert.assertEquals(compare2PreprodPath, compare2livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		
		/**
		 * Under About page "BuyNow Three" should be clicked and verified
		 */
		
//		WebElement btnBuyNow3PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[3]"));
//		btnBuyNow3PreProd.click();
//		
//		String buyNow3URLPreprod=driver.getCurrentUrl();
//		String buyNow3DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
//		if(buyNow3URLPreprod.contains(buyNow3DomainPreprod)){
//			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
//			System.out.println("URL contains Preprod Domain :" + buyNow3DomainPreprod);
//		}
//		String buyNow3PreprodPath = buyNow3URLPreprod.replace(buyNow3DomainPreprod, "");
//		System.out.println(buyNow3PreprodPath);
//		driver.navigate().back();
//
//		driver.switchTo().window(secondTab);
//		Thread.sleep(2000);
//		
//		
//		WebElement btnBuyNow3Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[3]"));
//		btnBuyNow3Prod.click();
//		
//		String buyNow3URLLive=driver.getCurrentUrl();
//		String buyNow3DomainLive ="https://www.centrum.com/";
//		if(buyNow3URLLive.contains(buyNow3DomainLive)){
//			// String livePath =getStartedURLLive.replace(DomainLive, "");
//			System.out.println("URL contains Live Domain :" + buyNow3DomainLive);
//		}
//		String buyNow3livePath = buyNow3URLLive.replace(buyNow3DomainLive, "");
//		Assert.assertEquals(buyNow3PreprodPath, buyNow3livePath);
//		System.out.println("Passed");
//		driver.navigate().back();
//
//		driver.switchTo().window(firstTab);
//		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Compare Three" should be clicked and verified
		 */
		
		WebElement btnCompare3PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[3]"));
		btnCompare3PreProd.click();
		
		String compare3URLPreprod=driver.getCurrentUrl();
		String compare3DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compare3URLPreprod.contains(compare3DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compare3DomainPreprod);
		}
		String compare3PreprodPath = compare3URLPreprod.replace(compare3DomainPreprod, "");
		System.out.println(compare3PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		
		WebElement btnCompare3Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[3]"));
		btnCompare3Prod.click();
		
		String compare3URLLive=driver.getCurrentUrl();
		String compare3DomainLive ="https://www.centrum.com/";
		if(compare3URLLive.contains(compare3DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compare3DomainLive);
		}
		String compare3livePath = compare3URLLive.replace(compare3DomainLive, "");
		Assert.assertEquals(compare3PreprodPath, compare3livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "BuyNow Four" should be clicked and verified
		 */
		
//		WebElement btnBuyNow4PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[4]"));
//		btnBuyNow4PreProd.click();
//		
//		String buyNow4URLPreprod=driver.getCurrentUrl();
//		String buyNow4DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
//		if(buyNow4URLPreprod.contains(buyNow4DomainPreprod)){
//			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
//			System.out.println("URL contains Preprod Domain :" + buyNow4DomainPreprod);
//		}
//		String buyNow4PreprodPath = buyNow4URLPreprod.replace(buyNow4DomainPreprod, "");
//		System.out.println(buyNow4PreprodPath);
//		driver.navigate().back();
//
//		driver.switchTo().window(secondTab);
//		Thread.sleep(2000);
//		
//		
//		WebElement btnBuyNow4Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget'])[4]"));
//		btnBuyNow4Prod.click();
//		
//		String buyNow4URLLive=driver.getCurrentUrl();
//		String buyNow4DomainLive ="https://www.centrum.com/";
//		if(buyNow4URLLive.contains(buyNow4DomainLive)){
//			// String livePath =getStartedURLLive.replace(DomainLive, "");
//			System.out.println("URL contains Live Domain :" + buyNow4DomainLive);
//		}
//		String buyNow4livePath = buyNow4URLLive.replace(buyNow4DomainLive, "");
//		Assert.assertEquals(buyNow4PreprodPath, buyNow4livePath);
//		System.out.println("Passed");
//		driver.navigate().back();
//
//		driver.switchTo().window(firstTab);
//		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Compare Four" should be clicked and verified
		 */
		
		WebElement btnCompare4PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[4]"));
		btnCompare4PreProd.click();
		
		String compare4URLPreprod=driver.getCurrentUrl();
		String compare4DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compare4URLPreprod.contains(compare4DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compare4DomainPreprod);
		}
		String compare4PreprodPath = compare4URLPreprod.replace(compare4DomainPreprod, "");
		System.out.println(compare4PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		
		WebElement btnCompare4Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[4]"));
		btnCompare4Prod.click();
		
		String compare4URLLive=driver.getCurrentUrl();
		String compare4DomainLive ="https://www.centrum.com/";
		if(compare4URLLive.contains(compare4DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compare4DomainLive);
		}
		String compare4livePath = compare4URLLive.replace(compare4DomainLive, "");
		Assert.assertEquals(compare4PreprodPath, compare4livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "Article one " should be clicked and verified
		 */
		
		
		WebElement article1PreProd = driver.findElement(By.xpath("//strong[text()='What’s Good for The Heart Is Good for The Brain']"));
		article1PreProd.click();
		
		String article1URLPreprod=driver.getCurrentUrl();
		String article1DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(article1URLPreprod.contains(article1DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + article1DomainPreprod);
		}
		String article1PreprodPath = article1URLPreprod.replace(article1DomainPreprod, "");
		System.out.println(article1PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement article1Prod = driver.findElement(By.xpath("//strong[text()='What’s Good for The Heart Is Good for The Brain']"));
		article1Prod.click();
		
		String article1URLLive=driver.getCurrentUrl();
		String article1DomainLive ="https://www.centrum.com/";
		if(article1URLLive.contains(article1DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + article1DomainLive);
		}
		String article1livePath = article1URLLive.replace(article1DomainLive, "");
		Assert.assertEquals(article1PreprodPath, article1livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Article Two " should be clicked and verified
		 */
		
		WebElement article2PreProd = driver.findElement(By.xpath("//strong[text()='The ABCs of Vitamin D']"));
		article2PreProd.click();
		
		String article2URLPreprod=driver.getCurrentUrl();
		String article2DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(article2URLPreprod.contains(article2DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + article2DomainPreprod);
		}
		String article2PreprodPath = article2URLPreprod.replace(article2DomainPreprod, "");
		System.out.println(article2PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement article2Prod = driver.findElement(By.xpath("//strong[text()='The ABCs of Vitamin D']"));
		article2Prod.click();
		
		String article2URLLive=driver.getCurrentUrl();
		String article2DomainLive ="https://www.centrum.com/";
		if(article2URLLive.contains(article2DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + article2DomainLive);
		}
		String article2livePath = article2URLLive.replace(article2DomainLive, "");
		Assert.assertEquals(article2PreprodPath, article2livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
		/**
		 * Under About page "Article Three " should be clicked and verified
		 */
		
		WebElement article3PreProd = driver.findElement(By.xpath("//strong[text()='6 Simple Ways to Boost Your Energy']"));
		article3PreProd.click();
		
		String article3URLPreprod=driver.getCurrentUrl();
		String article3DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(article3URLPreprod.contains(article3DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + article3DomainPreprod);
		}
		String article3PreprodPath = article3URLPreprod.replace(article3DomainPreprod, "");
		System.out.println(article3PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement article3Prod = driver.findElement(By.xpath("//strong[text()='6 Simple Ways to Boost Your Energy']"));
		article3Prod.click();
		
		String article3URLLive=driver.getCurrentUrl();
		String article3DomainLive ="https://www.centrum.com/";
		if(article3URLLive.contains(article3DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + article3DomainLive);
		}
		String article3livePath = article3URLLive.replace(article3DomainLive, "");
		Assert.assertEquals(article3PreprodPath, article3livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		/**
		 * Under About page "Article Four " should be clicked and verified
		 */
		
		WebElement article4PreProd = driver.findElement(By.xpath("//strong[text()='How to Take Vitamins and When You Should Take Them']"));
		article4PreProd.click();
		
		String article4URLPreprod=driver.getCurrentUrl();
		String article4DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(article4URLPreprod.contains(article4DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + article4DomainPreprod);
		}
		String article4PreprodPath = article4URLPreprod.replace(article4DomainPreprod, "");
		System.out.println(article4PreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		WebElement article4Prod = driver.findElement(By.xpath("//strong[text()='How to Take Vitamins and When You Should Take Them']"));
		article4Prod.click();
		
		String article4URLLive=driver.getCurrentUrl();
		String article4DomainLive ="https://www.centrum.com/";
		if(article4URLLive.contains(article4DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + article4DomainLive);
		}
		String article4livePath = article4URLLive.replace(article4DomainLive, "");
		Assert.assertEquals(article4PreprodPath, article4livePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		
	}

}
