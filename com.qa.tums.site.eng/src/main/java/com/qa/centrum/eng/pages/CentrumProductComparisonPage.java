package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumProductComparisonPage extends BaseClass{
	
	public CentrumProductComparisonPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	
	@FindBy(xpath = "(//div[@data-label-slug='metabolism'])[2]")
	private static WebElement adults;
	
	@FindBy(xpath = "//li[text()='Formulated with 23 key micronutrients to help support daily ']")
	private static WebElement tabScroll;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even ']")
	private static WebElement vitaminsAndMinerals;
	
	
	
	
	
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
	
	
	public void clickAdults() throws Exception {
		scrollDownUsingElement(adults);
		elementClick(adults);
	}
	
	
	public void clickVitaminAndMinerals() throws Exception {
		scrollDownUsingElement(tabScroll);
//		boolean clickable = isClickable(vitaminsAndMinerals);
//		System.out.println(clickable);
		
		
		Assert.assertTrue(elementVisible(vitaminsAndMinerals));
		elementClick(vitaminsAndMinerals);
	}
	
	
	
	

}
