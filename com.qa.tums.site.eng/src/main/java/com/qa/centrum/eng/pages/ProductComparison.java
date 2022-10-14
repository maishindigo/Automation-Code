package com.qa.centrum.eng.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class ProductComparison extends BaseClass {
//	public ProductComparison() {
//		PageFactory.initElements(driver, this);
//	}
//	public static WebElement getElementWithIndex(By by, int pos) {
//        return driver.findElements(by).get(pos);
//    }
//	
//
//	int i, j;
//	// li[@class='compare-item-js'])[49]
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
//
//	@FindBy(xpath = "(//div[@class='compare-selected-item-js'])[1]")
//	WebElement SelectProduct1;
//
//	@FindBy(xpath = "(//div[@class='compare-selected-item-js'])[2]")
//	WebElement SelectProduct2;
//
//	String xOptions = String.format("(//li[@class='compare-item-js'])[" + j + "]");
//	
	@FindBy(xpath = "//div[contains(@class, 'box component section bg-color-white border')]")
	WebElement Productcard;
//
	public void clickCookieBtn() {
		try {
			elementClick(cookieBtn);
		} catch (NoSuchElementException e) {

		}

	}

	public void clickGigyaForm() {
		try {
			elementClick(gigyaForm);
		} catch (NoSuchElementException e) {

		}
	}
//
//	public void clickDropdown1() throws Exception {
//		scrollDownUsingElement(SelectProduct1);
//		if(elementIsEnabled(SelectProduct1)) {
//			clickElementUsingJavaScript(SelectProduct1);
//		}
//		else {
//		scrollupUsingElement(SelectProduct1);
//		//moveToElement(SelectProduct1);
//		clickElementUsingJavaScript(SelectProduct1);
//	}}
//	public void clickDropdown2() throws Exception {
//		scrollDownUsingElement(SelectProduct2);
//		if(elementIsEnabled(SelectProduct2)) {
//			clickElementUsingJavaScript(SelectProduct2);
//		}
//		else {
//		scrollupUsingElement(SelectProduct2);
//		//moveToElement(SelectProduct1);
//		clickElementUsingJavaScript(SelectProduct2);
//	}}
////	public void SelectProduct1() throws Exception {
////		for (int i=0; i<=48; i++) {	
////				//String xOptions=String.format("(//li[@class='compare-item-js'])[\"+ i + \"]");
////				WebElement element = driver.findElement(By.xpath(xOptions));
////				element.click();
////				System.out.println("clicked on " + element.getText());	
////			}
////		}
//	public void SelectProduct1() throws Exception {
//		for (int i = 1; j <= 48; j++) {
//
//			clickDropdown1();
//			WebElement element = driver.findElement(By.xpath("(//li[@class='compare-item-js'])[" + i + "]"));
//			element.click();
//			System.out.println("clicked on "+ i + " and the product name is "+ Productcard.getText());
//			clickDropdown1();
//		}	
//		}
//
//	public void SelectProduct2() throws Exception {
//		for (int j = 50; j <= 98; j++) {
//
//			clickDropdown2();
//			WebElement element = driver.findElement(By.xpath("(//li[@class='compare-item-js'])[" + j + "]"));
//			element.click();
//			System.out.println("clicked on "+j + " and the product name is "+ Productcard.getText());
//			clickDropdown2();
//		}
//	}
//	
//	
//}
	
	public static WebElement getElementWithIndex(By by, int pos) {
     return driver.findElements(by).get(pos);
     }
  
	public void test1() throws Exception {
	List<WebElement> list = driver.findElements(By.xpath("//li[@class='compare-item-js']"));
    for (int i = 0; i < 4; i++) {
        Thread.sleep(2000);
      //  scrollPage(300);
        Thread.sleep(2000);
        WebElement tb = driver.findElement(By.xpath("(//div[@class='compare-selected-item-js'])[1]"));
        tb.click();
        if (getElementWithIndex(By.xpath("//li[@class='compare-item-js']"), i).isDisplayed()){
            WebElement ewi = getElementWithIndex(By.xpath("//li[@class='compare-item-js']"), i);
            System.out.println(ewi.getText());
            clickElementUsingJavaScript(ewi);
            //System.out.println("clicked on "+i + " and the product name is "+ Productcard.getText());
        }
        }
    }
	public void test2() throws Exception {
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='compare-item-js']"));
	    for (int i = 51; i < 55; i++) {
	        Thread.sleep(2000);
	      //  scrollPage(300);
	        Thread.sleep(2000);
	        WebElement tb = driver.findElement(By.xpath("(//div[@class='compare-selected-item-js'])[2]"));
	        tb.click();
	        if (getElementWithIndex(By.xpath("//li[@class='compare-item-js']"), i).isDisplayed()){
	            WebElement ewi = getElementWithIndex(By.xpath("//li[@class='compare-item-js']"), i);
	            System.out.println(ewi.getText());
	            clickElementUsingJavaScript(ewi);
	            //System.out.println("clicked on "+i + " and the product name is "+ Productcard.getText());
	        }
	        }
	    }
}
