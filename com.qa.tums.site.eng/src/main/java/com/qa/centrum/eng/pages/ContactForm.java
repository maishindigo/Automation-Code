package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class ContactForm extends BaseClass{
	public ContactForm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Consumer.Communications@gsk.com']")
	private static WebElement Email;
	
	@FindBy(xpath = "//a[text()='Frequently Asked Questions (FAQs)']")
	private static WebElement FAQLink;
	
	@FindBy(xpath = "//a[text()='here']")
	private static WebElement hereLink;
	
	
	
	
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
	public void clickEmail() throws Exception {
		moveToElement(Email);
		isClickable(Email);
	}
	public void clickFAQLink() throws Exception {
		moveToElement(FAQLink);
		elementClick(FAQLink);
	}
	public void clickhereLink() throws Exception {
		moveToElement(hereLink);
		elementClick(hereLink);
	}
}
