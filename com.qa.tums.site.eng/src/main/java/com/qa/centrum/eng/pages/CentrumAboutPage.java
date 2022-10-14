package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

import bsh.This;

public class CentrumAboutPage extends BaseClass{
	public CentrumAboutPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='About ']")
	WebElement aboutbtn;
	
	@FindBy(xpath = "//a[text()='science']")
	WebElement sciencebtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[1]")
	WebElement centrumAdultbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[2]")
	WebElement CentrumMultiGummiesbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[3]")
	WebElement CenturmMinisbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[4]")
	WebElement MultiGummiesbtn;
	
	@FindBy(xpath = "//img[@alt='Box of Centrum Adults Multivitamins']")
	WebElement scrollDown;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[1]")
	WebElement buyNow1;
	
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[1]")
	WebElement compare1;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[2]")
	WebElement buyNow2;
	
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[2]")
	WebElement compare2;
	
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[3]")
	WebElement buyNow3;
	
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[3]")
	WebElement compare3;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[4]")
	WebElement buyNow4;
	
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section flex p-d-l-2 p-m-l-2 even last reference-compare-button'])[4]")
	WebElement compare4;
	
	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	WebElement articleScrollDown;

	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	WebElement article1;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	WebElement article2;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	WebElement article3;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	WebElement article4;
	
	
	
	
	
	
	
	public void clickCookieBtn() {
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {
		}
	}
	
	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {
		}
	}
	
	public void clickAboutbtn() throws Exception {
		moveToElement(aboutbtn);
		elementClick(aboutbtn);
	}
	
	public void clickSciencebtn() throws Exception {
		elementClick(sciencebtn);
	}
	
	public void clickcentrumAdultbtn() throws Exception {
		scrollDownUsingElement(centrumAdultbtn);
		elementClick(centrumAdultbtn);
	}
	
	public void clickCentrumMultiGummiesAdult() throws Exception {
		scrollDownUsingElement(CentrumMultiGummiesbtn);
		elementClick(CentrumMultiGummiesbtn);
	}
	
	public void clickCenturmMinisbtn() throws Exception {
		scrollDownUsingElement(CenturmMinisbtn);
		elementClick(CenturmMinisbtn);
	}
	
	public void clickMultiGummiesWomen() throws Exception {
		scrollDownUsingElement(MultiGummiesbtn);
		elementClick(MultiGummiesbtn);
	}
	
	public void clickbuyNow1() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(buyNow1);
		
	}
	
	
	
	public void clickcompare1() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(compare1);
	}
	
	public void clickbuyNow2() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(buyNow2);
	}
	
	public void clickcompare2() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(compare2);
	}
	
	public void clickbuyNow3() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(buyNow3);
	}
	public void clickcompare3() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(compare3);
	}
	public void clickbuyNow4() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(buyNow4);
	}
	
	public void clickcompare4() throws Exception {
		scrollDownUsingElement(scrollDown);
		elementClick(compare4);
	}
	public void clickarticle1() throws Exception {
		scrollDownUsingElement(articleScrollDown);
		elementClick(article1);
	}
	public void clickarticle2() throws Exception {
		scrollDownUsingElement(articleScrollDown);
		elementClick(article2);
	}
	public void clickarticle3() throws Exception {
		scrollDownUsingElement(articleScrollDown);
		elementClick(article3);
	}
	public void clickarticle4() throws Exception {
		scrollDownUsingElement(articleScrollDown);
		elementClick(article4);
	}

}


