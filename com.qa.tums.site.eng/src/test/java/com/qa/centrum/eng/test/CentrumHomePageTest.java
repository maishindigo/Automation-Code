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

public class CentrumHomePageTest extends BaseClass{

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
	public void verifyTheLearnMoreLink() throws Exception {
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		secondTab = driver.getWindowHandle();
		driver.switchTo().window(firstTab);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
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

		WebElement clickGigyaForm1 = driver.findElement(By.xpath("//h2[@class='heading']"));
		clickGigyaForm1.click();

		driver.switchTo().window(firstTab);


		//		//Yogita's Code
		implicitWait();  
		driver.switchTo().window(firstTab);
		scrollPageInUpAndDown();
		WebElement products=driver.findElement(By.xpath("//a[text()='Products ']"));
		products.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		String getStartedURLPreprod1=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod1);
		String DomainPreprod1 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod1.contains(DomainPreprod1)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod1);
		}
		String PreprodPath1 =getStartedURLPreprod1.replace(DomainPreprod1, "");
		System.out.println("Products in PreProd");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		implicitWait();

		scrollPageInUpAndDown();
		WebElement products1=driver.findElement(By.xpath("//a[text()='Products ']"));
		products1.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);

		String getStartedURLLive1=driver.getCurrentUrl();
		String DomainLive1 ="https://www.centrum.com/";
		if(getStartedURLLive1.contains(DomainLive1)){
			System.out.println("URL contains Live Domain :" + DomainLive1);
		}
		String livePath1 =getStartedURLLive1.replace(DomainLive1, "");
		Assert.assertEquals(PreprodPath1, livePath1);
		System.out.println("Live path: "+ livePath1 + "and preprod: "+ PreprodPath1 + "are same");
		System.out.println("Products in Prod");
		System.out.println("Passed");
		driver.navigate().back();


		//learn

		implicitWait();  
		driver.switchTo().window(firstTab);
		//scrollPageInUpAndDown();
		WebElement learn=driver.findElement(By.xpath("//a[text()='Learn ']"));
		learn.click();
		Thread.sleep(1000);
		//  driver.navigate().back();
		Thread.sleep(1000);
		String getStartedURLPreprod2=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod2);
		String DomainPreprod2 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod2.contains(DomainPreprod2)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod2);
		}
		String PreprodPath2 =getStartedURLPreprod2.replace(DomainPreprod2, "");
		System.out.println("Learn in Pre-Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		implicitWait();


		//scrollPageInUpAndDown();
		WebElement learn1=driver.findElement(By.xpath("//a[text()='Learn ']"));
		learn1.click();
		Thread.sleep(1000);
		// driver.navigate().back();
		//Thread.sleep(1000);

		String getStartedURLLive2=driver.getCurrentUrl();
		String DomainLive2 ="https://www.centrum.com/";
		if(getStartedURLLive2.contains(DomainLive2)){
			System.out.println("URL contains Live Domain :" + DomainLive2);
		}
		String livePath2 =getStartedURLLive2.replace(DomainLive2, "");
		Assert.assertEquals(PreprodPath2, livePath2);
		System.out.println("Live path: "+ livePath2 + "and preprod: "+ PreprodPath2 + "are same");
		System.out.println("Learn in Prod");
		System.out.println("Passed");
		driver.navigate().back();
		//about

		implicitWait();  
		driver.switchTo().window(firstTab);
		//scrollPageInUpAndDown();
		WebElement aboutt=driver.findElement(By.xpath("//a[text()='About ']"));
		aboutt.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		String getStartedURLPreprod4=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod4);
		String DomainPreprod4 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod4.contains(DomainPreprod4)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod4);
		}
		String PreprodPath4 =getStartedURLPreprod4.replace(DomainPreprod4, "");
		System.out.println("About in Pre-Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		implicitWait();


		//scrollPageInUpAndDown();
		WebElement aboutt1=driver.findElement(By.xpath("//a[text()='About ']"));
		aboutt1.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);

		String getStartedURLLive4=driver.getCurrentUrl();
		String DomainLive4 ="https://www.centrum.com/";
		if(getStartedURLLive4.contains(DomainLive4)){
			System.out.println("URL contains Live Domain :" + DomainLive4);
		}
		String livePath4 =getStartedURLLive4.replace(DomainLive4, "");
		Assert.assertEquals(PreprodPath4, livePath4);
		System.out.println("Live path: "+ livePath4 + "and preprod: "+ PreprodPath4 + "are same");
		System.out.println("About in Prod");
		System.out.println("Passed");
		driver.navigate().back();

		//about centrum

		implicitWait();  
		driver.switchTo().window(firstTab);
		//scrollPageInUpAndDown();
		WebElement about_centrum=driver.findElement(By.xpath("//a[text()='Choose Your Centrum ']"));
		about_centrum.click();
		Thread.sleep(1000);
		// driver.navigate().back();
		// Thread.sleep(1000);
		String getStartedURLPreprod5=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod5);
		String DomainPreprod5 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod5.contains(DomainPreprod5)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod5);
		}
		String PreprodPath5 =getStartedURLPreprod5.replace(DomainPreprod5, "");
		System.out.println("About Centrum in Pre-Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl5 = driver.getCurrentUrl();
		System.out.println(currentUrl5);
		implicitWait();


		//scrollPageInUpAndDown();
		WebElement about_centrum1=driver.findElement(By.xpath("//a[text()='Choose Your Centrum ']"));
		about_centrum1.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);

		String getStartedURLLive5=driver.getCurrentUrl();
		String DomainLive5 ="https://www.centrum.com/";
		if(getStartedURLLive5.contains(DomainLive5)){
			System.out.println("URL contains Live Domain :" + DomainLive5);
		}
		String livePath5 =getStartedURLLive5.replace(DomainLive5, "");
		Assert.assertEquals(PreprodPath5, livePath5);
		System.out.println("Live path: "+ livePath5 + "and preprod: "+ PreprodPath5 + "are same");
		System.out.println("About Centrum in Prod");
		System.out.println("Passed");
		driver.navigate().back();

		//homepage

		implicitWait();  
		driver.switchTo().window(firstTab);
		scrollPageInUpAndDown();
		WebElement getstarted=driver.findElement(By.xpath("//a[text()='Get Started']"));
		getstarted.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		String getStartedURLPreprod6=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod6);
		String DomainPreprod6 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod6.contains(DomainPreprod6)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod6);
		}
		String PreprodPath6 =getStartedURLPreprod6.replace(DomainPreprod6, "");
		System.out.println("Get Started in Pre-prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl6 = driver.getCurrentUrl();
		System.out.println(currentUrl6);
		implicitWait();


		/*
		 * WebElement cookieBtn13 =
		 * driver.findElement(By.xpath("//button[text()='Dismiss']"));
		 * cookieBtn13.click();
		 *
		 * WebElement clickGigyaForm13 =
		 * driver.findElement(By.xpath("//h2[@class='heading']"));
		 * clickGigyaForm13.click();
		 */
		//Thread.sleep(20000);
		scrollPageInUpAndDown();
		WebElement getstarted1=driver.findElement(By.xpath("//a[text()='Get Started']"));
		getstarted1.click();
		Thread.sleep(1000);
		// driver.navigate().back();
		//Thread.sleep(1000);

		String getStartedURLLive6=driver.getCurrentUrl();
		String DomainLive6 ="https://www.centrum.com/";
		if(getStartedURLLive6.contains(DomainLive6)){
			System.out.println("URL contains Live Domain :" + DomainLive6);
		}
		String livePath6 =getStartedURLLive6.replace(DomainLive6, "");
		Assert.assertEquals(PreprodPath6, livePath6);
		System.out.println("Live path: "+ livePath6 + "and preprod: "+ PreprodPath6 + "are same");
		System.out.println("Get Started in Prod");
		System.out.println("Passed");
		driver.navigate().back();

		//3rdFunctionality

		implicitWait();
		driver.switchTo().window(firstTab);
		//scrollPageInUpAndDown();
		WebElement learnmore=driver.findElement(By.xpath("(//a[text()='Learn more'])[1]"));
		learnmore.click();
		Thread.sleep(1000);
		// driver.navigate().back();
		String getStartedURLPreprod7=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod7);
		String DomainPreprod7 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod7.contains(DomainPreprod7)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod7);
		}
		String PreprodPath7 =getStartedURLPreprod7.replace(DomainPreprod7, "");
		System.out.println("Learn_More in Pre-PROD");
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		// System.out.println("second tab");

		String currentUrl7 = driver.getCurrentUrl();
		System.out.println(currentUrl7);
		implicitWait();

		Thread.sleep(2000);
		//scrollPageInUpAndDown();
		WebElement learnmore1=driver.findElement(By.xpath("(//a[text()='Learn more'])[1]"));
		System.out.println("passed");
		moveToElement(learnmore1);
		learnmore1.click();
		//driver.navigate().back();
		Thread.sleep(1000);

		String getStartedURLLive7=driver.getCurrentUrl();
		String DomainLive7 ="https://www.centrum.com/";
		if(getStartedURLLive7.contains(DomainLive7)){
			System.out.println("URL contains Live Domain :" + DomainLive7);
		}
		String livePath7 =getStartedURLLive7.replace(DomainLive7, "");
		Assert.assertEquals(PreprodPath7, livePath7);
		System.out.println("Live path: "+ livePath7 + "and preprod: "+ PreprodPath7 + "are same");
		System.out.println("Learn more in Prod");
		System.out.println("Passed");
		driver.navigate().back();

		//4th Functionality
		implicitWait();
		driver.switchTo().window(firstTab);
		// scrollPageInUpAndDown();
		WebElement learnmore2=driver.findElement(By.xpath("(//a[text()='Learn more'])[2]"));
		System.out.println("whether clicable");
		moveToElement(learnmore2);
		learnmore2.click();
		//driver.navigate().back();
		Thread.sleep(1000);

		String getStartedURLPreprod8=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod8);
		String DomainPreprod8 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod8.contains(DomainPreprod8)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod8);
		}
		String PreprodPath8 =getStartedURLPreprod8.replace(DomainPreprod8, "");
		System.out.println("Aboutus in Pre Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl8 = driver.getCurrentUrl();
		System.out.println(currentUrl8);
		implicitWait();


		implicitWait();
		//scrollPageInUpAndDown();
		WebElement learnmore3=driver.findElement(By.xpath("(//a[text()='Learn more'])[2]"));
		System.out.println("passed for learnmore");
		moveToElement(learnmore3);
		learnmore3.click();
		//driver.navigate().back();
		Thread.sleep(1000);

		String getStartedURLLive8=driver.getCurrentUrl();
		String DomainLive8 ="https://www.centrum.com/";
		if(getStartedURLLive8.contains(DomainLive8)){



			// String livePath =getStartedURLLive.replace(DomainLive, "");



			System.out.println("URL contains Live Domain :" + DomainLive8);
		}
		String livePath8 =getStartedURLLive8.replace(DomainLive8, "");
		Assert.assertEquals(PreprodPath8, livePath8);
		System.out.println("Live path: "+ livePath8 + "and preprod: "+ PreprodPath8 + "are same");
		System.out.println("LearnMore in Prod");
		System.out.println("Passed");
		driver.navigate().back();

		//aboutus

		implicitWait();
		driver.switchTo().window(firstTab);
		//scrollPageInUpAndDown();
		implicitWait();
		WebElement aboutus=driver.findElement(By.xpath("//a[text()='About us']"));
		// moveToElement(aboutus);
		aboutus.click();
		//driver.navigate().back();
		Thread.sleep(2000);

		String getStartedURLPreprod9=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod9);
		String DomainPreprod9 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod9.contains(DomainPreprod9)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod9);
		}
		String PreprodPath9 =getStartedURLPreprod9.replace(DomainPreprod9, "");
		System.out.println("About us in Pre-Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl9 = driver.getCurrentUrl();
		System.out.println(currentUrl9);


		implicitWait();
		//added gigyaa...
//		WebElement cookieBtnOne = driver.findElement(By.xpath("//button[text()='Dismiss']"));
//		cookieBtnOne.click();
//
//		WebElement clickGigyaFormOne = driver.findElement(By.xpath("//h2[@class='heading']"));
//		clickGigyaFormOne.click();
		// scrollPageInUpAndDown();
		WebElement aboutus1=driver.findElement(By.xpath("//a[text()='About us']"));
		System.out.println("clicking on about us");
		moveToElement(aboutus1);
		aboutus1.click();
		//driver.navigate().back();
		Thread.sleep(2000);

		String getStartedURLLive9=driver.getCurrentUrl();
		String DomainLive9 ="https://www.centrum.com/";
		if(getStartedURLLive9.contains(DomainLive9)){



			System.out.println("URL contains Live Domain :" + DomainLive9);
		}
		String livePath9 =getStartedURLLive9.replace(DomainLive9, "");
		Assert.assertEquals(PreprodPath9, livePath9);
		System.out.println("Live path: "+ livePath9 + "and preprod: "+ PreprodPath9 + "are same");
		System.out.println("About us in Prod");
		System.out.println("Passed");
		driver.navigate().back();



		//Vitamins and Minerals

		implicitWait();
		driver.switchTo().window(firstTab);
		scrollPageInUpAndDown();
		WebElement learnvit=driver.findElement(By.xpath("//a[@aria-label=\"Vitamins & Minerals\"]"));
		learnvit.click();
		// driver.navigate().back();
		Thread.sleep(2000);

		String getStartedURLPreprod10=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod10);
		String DomainPreprod10 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod10.contains(DomainPreprod10)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod10);
		}
		String PreprodPath10 =getStartedURLPreprod10.replace(DomainPreprod10, "");
		System.out.println("Vitamins and Minerals in Pre-prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl0 = driver.getCurrentUrl();
		System.out.println(currentUrl0);

		implicitWait();
		scrollPageInUpAndDown();
		WebElement learnvit1=driver.findElement(By.xpath("//a[@aria-label=\"Vitamins & Minerals\"]"));
		learnvit1.click();
		//driver.navigate().back();
		Thread.sleep(2000);

		String getStartedURLLive10=driver.getCurrentUrl();
		String DomainLive10 ="https://www.centrum.com/";
		if(getStartedURLLive10.contains(DomainLive10)){
			System.out.println("URL contains Live Domain :" + DomainLive10);
		}
		String livePath10 =getStartedURLLive10.replace(DomainLive10, "");
		Assert.assertEquals(PreprodPath10, livePath10);
		System.out.println("Live path: "+ livePath10 + "and preprod: "+ PreprodPath10 + "are same");
		System.out.println("Vitamins and Minerals in Prod");
		System.out.println("Passed");
		driver.navigate().back();
		//viewall//

		implicitWait();
		driver.switchTo().window(firstTab);
		scrollPageInUpAndDown();
		WebElement viewall=driver.findElement(By.xpath("//a[text()='View all']"));
		viewall.click();
		//driver.navigate().back();
		Thread.sleep(1000);

		String getStartedURLPreprod11=driver.getCurrentUrl();
		System.out.println(getStartedURLPreprod11);
		String DomainPreprod11 ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod11.contains(DomainPreprod11)){
			System.out.println("URL contains Preprod Domain :" + DomainPreprod11);
		}
		String PreprodPath11 =getStartedURLPreprod11.replace(DomainPreprod11, "");
		System.out.println("View all in Pre-Prod");
		driver.navigate().back();

		driver.switchTo().window(secondTab);

		String currentUrl11 = driver.getCurrentUrl();
		System.out.println(currentUrl11);
		implicitWait();
		//scrollPageInUpAndDown();
		scrollPageInUpAndDown();
		WebElement viewall1=driver.findElement(By.xpath("//a[text()='View all']"));
		viewall1.click();
		//driver.navigate().back();
		Thread.sleep(1000);;

		String getStartedURLLive11=driver.getCurrentUrl();
		String DomainLive11 ="https://www.centrum.com/";
		if(getStartedURLLive11.contains(DomainLive11)){



			// String livePath =getStartedURLLive.replace(DomainLive, "");



			System.out.println("URL contains Live Domain :" + DomainLive11);
		}
		String livePath11 =getStartedURLLive11.replace(DomainLive11, "");
		Assert.assertEquals(PreprodPath11, livePath11);
		System.out.println("Live path: "+ livePath11 + "and preprod: "+ PreprodPath11 + "are same");
		System.out.println("View all in Prod");
		System.out.println("Passed");
		driver.navigate().back();
		//	Yogita's Code end 	
		
		////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		
		
		//Sujai Code Starts
		driver.switchTo().window(firstTab);

		scrollPageInUpAndDown();
		WebElement btnMultivitaminsPreProd = driver.findElement(By.xpath("//a[text()='Multivitamins']"));
		btnMultivitaminsPreProd.click();

		String getStartedURLPreprod=driver.getCurrentUrl();
		String DomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(getStartedURLPreprod.contains(DomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + DomainPreprod);
		}
		String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		WebElement btnMultivitaminsProd = driver.findElement(By.xpath("//a[text()='Multivitamins']"));
		btnMultivitaminsProd.click();
		String getStartedURLLive=driver.getCurrentUrl();
		String DomainLive ="https://www.centrum.com/";
		if(getStartedURLLive.contains(DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + DomainLive);
		}
		String livePath =getStartedURLLive.replace(DomainLive, "");
		Assert.assertEquals(PreprodPath, livePath);
		System.out.println("Passed");

		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(firstTab);


		WebElement btnTargetedSupplements = driver.findElement(By.xpath("//a[text()='Targeted Supplements']"));
		btnTargetedSupplements.click();

		String targetedURLPreprod=driver.getCurrentUrl();
		String targetedPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(targetedURLPreprod.contains(targetedPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + targetedPreprod);
		}
		String targetedPreprodPath =targetedURLPreprod.replace(targetedPreprod, "");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);


		WebElement btnTargetedSupplementsProd = driver.findElement(By.xpath("//a[text()='Targeted Supplements']"));
		btnTargetedSupplementsProd.click();


		String targetedURLLive=driver.getCurrentUrl();
		String targetedLive ="https://www.centrum.com/";
		if(targetedURLLive.contains(DomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + targetedLive);
		}
		String targetedlivePath =targetedURLLive.replace(targetedLive, "");
		Assert.assertEquals(targetedPreprodPath, targetedlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		Thread.sleep(2000);

		driver.switchTo().window(firstTab);
		Thread.sleep(1000);



		WebElement btnVitaminPacks = driver.findElement(By.xpath("//a[text()='Vitamin Packs']"));
		btnVitaminPacks.click();

		String vitaminURLPreprod=driver.getCurrentUrl();
		String vitaminPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(vitaminURLPreprod.contains(vitaminPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + vitaminPreprod);
		}
		String vitaminPreprodPath = vitaminURLPreprod.replace(vitaminPreprod, "");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);


		WebElement btnVitaminPacksProd = driver.findElement(By.xpath("//a[text()='Vitamin Packs']"));
		btnVitaminPacksProd.click();

		String vitaminURLLive=driver.getCurrentUrl();
		String vitaminLive ="https://www.centrum.com/";
		if(vitaminURLLive.contains(vitaminLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + vitaminLive);
		}
		String vitaminlivePath =vitaminURLLive.replace(vitaminLive, "");
		Assert.assertEquals(vitaminPreprodPath, vitaminlivePath);
		System.out.println("Passed");
		driver.navigate().back();
		Thread.sleep(2000);

		driver.switchTo().window(firstTab);
		Thread.sleep(1000);



		WebElement btnSeeAllProduct = driver.findElement(By.xpath("//a[@class='browse-card-products']"));
		btnSeeAllProduct.click();

		String allProductURLPreprod=driver.getCurrentUrl();
		String allProductPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(allProductURLPreprod.contains(allProductPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + allProductPreprod);
		}
		String allProductPreprodPath = allProductURLPreprod.replace(allProductPreprod, "");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);


		WebElement btnSeeAllProductProd = driver.findElement(By.xpath("//a[@class='browse-card-products']"));
		btnSeeAllProductProd.click();

		String allProductURLLive=driver.getCurrentUrl();
		String allProductLive ="https://www.centrum.com/";
		if(allProductURLLive.contains(allProductLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + allProductLive);
		}
		String allProductlivePath =allProductURLLive.replace(allProductLive, "");
		Assert.assertEquals(allProductPreprodPath, allProductlivePath);
		System.out.println("Passed");

		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().window(firstTab);
		Thread.sleep(1000);


		scrollPageInUpAndDown();

		WebElement btnWomenPreProd = driver.findElement(By.xpath("//p[text()='Women']"));
		btnWomenPreProd.click();

		String womenURLPreprod=driver.getCurrentUrl();
		String womenDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(womenURLPreprod.contains(womenDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + womenDomainPreprod);
		}
		String womenPreprodPath =womenURLPreprod.replace(womenDomainPreprod, "");
		System.out.println(womenPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();
		WebElement btnWomenProd = driver.findElement(By.xpath("//p[text()='Women']"));
		btnWomenProd.click();
		String womenURLLive=driver.getCurrentUrl();
		String womenDomainLive ="https://www.centrum.com/";
		if(womenURLLive.contains(womenDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + womenDomainLive);
		}
		String womenlivePath =womenURLLive.replace(womenDomainLive, "");
		Assert.assertEquals(womenPreprodPath, womenlivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);


		WebElement btnMenPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Men']"));
		btnMenPreProd.click();

		String menURLPreprod=driver.getCurrentUrl();
		String menDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(menURLPreprod.contains(menDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + menDomainPreprod);
		}
		String menPreprodPath = menURLPreprod.replace(menDomainPreprod, "");
		System.out.println(menPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);

		WebElement btnMenProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum Silver Men']"));
		btnMenProd.click();

		String menURLLive=driver.getCurrentUrl();
		String menDomainLive ="https://www.centrum.com/";
		if(menURLLive.contains(menDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + menDomainLive);
		}
		String menlivePath =menURLLive.replace(menDomainLive, "");
		Assert.assertEquals(menPreprodPath, menlivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(3000);

		//				scrollPageInUpAndDown();
		Thread.sleep(3000);
		WebElement btnKidstropicalPunchPreProd = driver.findElement(By.xpath("//img[@title='Bottle of Centrum Kids MultiGummies in Tropical Punch Flavor']"));
		btnKidstropicalPunchPreProd.click();
		String kidsURLPreprod=driver.getCurrentUrl();
		String kidsDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(kidsURLPreprod.contains(kidsDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + kidsDomainPreprod);
		}
		String kidsPreprodPath = kidsURLPreprod.replace(kidsDomainPreprod, "");
		System.out.println(kidsPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		//				scrollPageInUpAndDown();

		WebElement btnKidstropicalPunchProd = driver.findElement(By.xpath("//img[@title='Bottle of Centrum Kids MultiGummies in Tropical Punch Flavor']"));
		btnKidstropicalPunchProd.click();

		String kidsURLLive=driver.getCurrentUrl();
		String kidsDomainLive ="https://www.centrum.com/";
		if(kidsURLLive.contains(kidsDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + kidsDomainLive);
		}
		String kidslivePath =kidsURLLive.replace(kidsDomainLive, "");
		Assert.assertEquals(kidsPreprodPath, kidslivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);
		Thread.sleep(2000);

		//				scrollPageInUpAndDown();
		Thread.sleep(2000);

		WebElement btnAdultsPreProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Adults ']"));
		btnAdultsPreProd.click();
		String adultURLPreprod=driver.getCurrentUrl();
		String adultDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(adultURLPreprod.contains(adultDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + adultDomainPreprod);
		}
		String adultPreprodPath = adultURLPreprod.replace(adultDomainPreprod, "");
		System.out.println(adultPreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		//				scrollPageInUpAndDown();
		WebElement btnAdultsProd = driver.findElement(By.xpath("//img[@alt='Box of Centrum MultiGummies Adults ']"));
		btnAdultsProd.click();
		String adultURLLive=driver.getCurrentUrl();
		String adultDomainLive ="https://www.centrum.com/";
		if(adultURLLive.contains(adultDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + adultDomainLive);
		}
		String adultlivePath =adultURLLive.replace(adultDomainLive, "");
		Assert.assertEquals(adultPreprodPath, adultlivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);

		Thread.sleep(2000);

		WebElement btnBuyNow1PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]"));
		btnBuyNow1PreProd.click();

		WebElement textCentrumSilverWomenPreProd = driver.findElement(By.xpath("//h2[text()='Centrum Silver WOMEN 40CT']"));

		if (textCentrumSilverWomenPreProd.isDisplayed()) {
			System.out.println("Centrum Silver WOMEN 40CT is presented preprod");
			implicitWait();
		}
		driver.navigate().refresh();

		WebElement btnCompare1PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[1]"));
		btnCompare1PreProd.click();

		String compareOneURLPreprod=driver.getCurrentUrl();
		String compareOneDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compareOneURLPreprod.contains(compareOneDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compareOneDomainPreprod);
		}
		String compareOnePreprodPath = compareOneURLPreprod.replace(compareOneDomainPreprod, "");
		System.out.println(compareOnePreprodPath);
		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		scrollPageInUpAndDown();

		WebElement btnBuyNow1Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]"));
		btnBuyNow1Prod.click();

		WebElement textCentrumSilverWomenProd = driver.findElement(By.xpath("//h2[text()='Centrum Silver WOMEN 40CT']"));

		if (textCentrumSilverWomenProd.isDisplayed()) {
			System.out.println("Centrum Silver WOMEN 40CT is presented prod");
			implicitWait();
		}
		driver.navigate().refresh();
		implicitWait();
		WebElement btnCompare1Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[1]"));
		btnCompare1Prod.click();

		String compareOneURLLive=driver.getCurrentUrl();
		String compareOneDomainLive ="https://www.centrum.com/";
		if(compareOneURLLive.contains(compareOneDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compareOneDomainLive);
		}
		String compareOnelivePath =compareOneURLLive.replace(compareOneDomainLive, "");
		Assert.assertEquals(compareOnePreprodPath, compareOnelivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);


		implicitWait();
		//		scrollPageInUpAndDown();
		WebElement btnBuyNow2PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]"));
		btnBuyNow2PreProd.click();

		WebElement textCentrumSilverMenPreProd = driver.findElement(By.xpath("//h2[text()='Centrum Silver Men 40ct']"));
		if (textCentrumSilverMenPreProd.isDisplayed()) {
			System.out.println("Centrum Silver Men 40ct is presented pre prod");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare2PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[2]"));
		btnCompare2PreProd.click();

		String compareTwoURLPreprod=driver.getCurrentUrl();
		String compareTwoDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compareTwoURLPreprod.contains(compareTwoDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compareTwoDomainPreprod);
		}
		String compareTwoPreprodPath = compareTwoURLPreprod.replace(compareTwoDomainPreprod, "");
		System.out.println(compareTwoPreprodPath);

		driver.navigate().back();

		driver.switchTo().window(secondTab);
		implicitWait();
		//		scrollPageInUpAndDown();
		WebElement btnBuyNow2Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]"));
		btnBuyNow2Prod.click();

		WebElement textCentrumSilverMenProd = driver.findElement(By.xpath("//h2[text()='Centrum Silver Men 40ct']"));
		if (textCentrumSilverMenProd.isDisplayed()) {
			System.out.println("Centrum Silver Men 40ct is presented prod");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare2Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[2]"));
		btnCompare2Prod.click();

		String compareTwoURLLive=driver.getCurrentUrl();
		String compareTwoDomainLive ="https://www.centrum.com/";
		if(compareTwoURLLive.contains(compareTwoDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compareTwoDomainLive);
		}
		String compareTwolivePath =compareTwoURLLive.replace(compareTwoDomainLive, "");
		Assert.assertEquals(compareTwoPreprodPath, compareTwolivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);


		Thread.sleep(2000);
		scrollPageInUpAndDown();

		WebElement btnBuyNow3PreProd = driver.findElement(By.xpath("(//div[@class='component-content']//following::a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]"));
		btnBuyNow3PreProd.click();


		WebElement textTropicalPunchPreProd = driver.findElement(By.xpath("//h2[text()='Centrum Kids MultiGummies in Tropical Punch Flavors']"));
		if (textTropicalPunchPreProd.isDisplayed()) {
			System.out.println("Centrum Kids MultiGummies in Tropical Punch Flavors is presented pre Prod");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare3PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[3]"));
		btnCompare3PreProd.click();

		String compareThreeURLPreprod=driver.getCurrentUrl();
		String compareThreeDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compareThreeURLPreprod.contains(compareThreeDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compareThreeDomainPreprod);
		}
		String compareThreePreprodPath = compareThreeURLPreprod.replace(compareThreeDomainPreprod, "");
		System.out.println(compareThreePreprodPath);

		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);

		implicitWait();
		//scrollPageInUpAndDown();

		WebElement btnBuyNow3Prod = driver.findElement(By.xpath("(//div[@class='component-content']//following::a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]"));
		btnBuyNow3Prod.click();

		WebElement textTropicalPunchProd = driver.findElement(By.xpath("//h2[text()='Centrum Kids MultiGummies in Tropical Punch Flavors']"));
		if (textTropicalPunchProd.isDisplayed()) {
			System.out.println("Centrum Kids MultiGummies in Tropical Punch Flavors is presented  Prod");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare3Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[3]"));
		btnCompare3Prod.click();

		String compareThreeURLLive=driver.getCurrentUrl();
		String compareThreeDomainLive ="https://www.centrum.com/";
		if(compareThreeURLLive.contains(compareThreeDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compareThreeDomainLive);
		}
		String compareThreelivePath =compareThreeURLLive.replace(compareThreeDomainLive, "");
		Assert.assertEquals(compareThreePreprodPath, compareThreelivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);


		implicitWait();


		WebElement btnBuyNow4PreProd = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]"));
		btnBuyNow4PreProd.click();

		WebElement textAdultPreProd = driver.findElement(By.xpath("//h2[text()='Centrum MultiGummies Adult']"));
		if (textAdultPreProd.isDisplayed()) {
			System.out.println("Centrum MultiGummies Adult is presented");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare4PreProd = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[4]"));
		btnCompare4PreProd.click();

		String compareFourURLPreprod=driver.getCurrentUrl();
		String compareFourDomainPreprod ="https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/";
		if(compareFourURLPreprod.contains(compareFourDomainPreprod)){
			//String PreprodPath =getStartedURLPreprod.replace(DomainPreprod, "");
			System.out.println("URL contains Preprod Domain :" + compareFourDomainPreprod);
		}
		String compareFourPreprodPath = compareFourURLPreprod.replace(compareFourDomainPreprod, "");
		System.out.println(compareFourPreprodPath);

		driver.navigate().back();

		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		implicitWait();


		WebElement btnBuyNow4Prod = driver.findElement(By.xpath("(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]"));
		btnBuyNow4Prod.click();

		WebElement textAdultProd = driver.findElement(By.xpath("//h2[text()='Centrum MultiGummies Adult']"));
		if (textAdultProd.isDisplayed()) {
			System.out.println("Centrum MultiGummies Adult is presented");
			implicitWait();
		}

		driver.navigate().refresh();

		WebElement btnCompare4Prod = driver.findElement(By.xpath("(//a[@class='compare-button default-compare'])[4]"));
		btnCompare4Prod.click();

		String compareFourURLLive=driver.getCurrentUrl();
		String compareFourDomainLive ="https://www.centrum.com/";
		if(compareFourURLLive.contains(compareFourDomainLive)){
			// String livePath =getStartedURLLive.replace(DomainLive, "");
			System.out.println("URL contains Live Domain :" + compareFourDomainLive);
		}
		String compareFourlivePath =compareThreeURLLive.replace(compareFourDomainLive, "");
		Assert.assertEquals(compareFourPreprodPath, compareFourlivePath);
		System.out.println("Passed");
		driver.navigate().back();

		driver.switchTo().window(firstTab);









		//				Thread.sleep(2000);
		//				try {
		//					WebElement closeBtn = driver.findElement(By.xpath("(//img[@role='presentation'])[3]"));
		//					visibilityOf(closeBtn);
		//					if (closeBtn.isDisplayed()) {
		//						closeBtn.click();
		//					}
		//				} catch (Exception e) {
		//					System.out.println("Pop-up is not visible");
		//				}




	}


}
