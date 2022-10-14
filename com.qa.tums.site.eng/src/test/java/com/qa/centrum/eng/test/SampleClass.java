package com.qa.centrum.eng.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.baseClass.BaseClass;

public class SampleClass extends BaseClass{


	//	public static int getNumberOfElementsFound(By by) {
	//        return  driver.findElements(by).size();
	//      }

	public static WebElement getElementWithIndex(By by, int pos) {
		return driver.findElements(by).get(pos);
	}

	public static void main(String[] args) throws IOException, Exception {

		browserLaunch("chrome");
		launchURL("https://www.centrum.com/learn/vitamins-minerals/beta-carotene/");


		Thread.sleep(2000);
		WebElement cookie = driver.findElement(By.xpath("//button[text()='Dismiss']"));
		cookie.click();
		Thread.sleep(2000);
		WebElement gigya = driver.findElement(By.xpath("//h2[@class='heading']"));
		gigya.click();
		Thread.sleep(2000);
		scrollPage(300);
		Thread.sleep(2000);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='navigation-root navigation-branch navigation-level1 filter-list-js']//li"));
		int size = li.size();
		System.out.println(size);





		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='navigation-root navigation-branch navigation-level1 filter-list-js']//li"));
		
		for (int i = 0; i < list.size(); i++) {
			Thread.sleep(2000);
			scrollPage(300);
			Thread.sleep(2000);
			WebElement tb = driver.findElement(By.xpath("//div[@class='selected-item-js']"));
			tb.click();
			
			if (getElementWithIndex(By.xpath("//ul[@class='navigation-root navigation-branch navigation-level1 filter-list-js']//li//a"), i).isDisplayed()){
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='navigation-root navigation-branch navigation-level1 filter-list-js']//li//a"), i);
				System.out.println(ewi.getText());
				clickElementUsingJavaScript(ewi);
				System.out.println(driver.getCurrentUrl());
			}
			
			
			
		}









		//		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='navigation-root navigation-branch navigation-level1 filter-list-js']//li//a"));
		//		 for (WebElement webElement : list) {
		//			 String attribute = webElement.getAttribute("href");
		//			 System.out.println(attribute);
		//		}	


	}
}
