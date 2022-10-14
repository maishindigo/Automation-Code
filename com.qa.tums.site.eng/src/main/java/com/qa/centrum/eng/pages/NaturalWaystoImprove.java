package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NaturalWaystoImprove extends BaseClass{
	public NaturalWaystoImprove() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
	WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	WebElement gigyaForm;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement btnShowReference;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement btnHideReference;
    
    @FindBy(xpath = "//strong[text()='Over 50? What Your Body Needs More of Now']")
   	WebElement over50;
       
       @FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
   	WebElement fiveVitaminsforWomenOver50;
       
       @FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
   	WebElement topFiveNutrients;
       
       @FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
   	WebElement tenSimpleWays;
       
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
   	public void clickShowReference() throws Exception {
//         scrollDownUsingElement();
         elementClick(btnShowReference);
         Assert.assertTrue(elementIsDisplayed(btnHideReference));
         elementClick(btnHideReference);
     }
   	public void clickOver50() throws Exception {
   		moveToElement(over50);
   		clickElementUsingJavaScript(over50);
   	}
   	public void clickFiveVitaminsforWomenOver50() throws Exception {
   		moveToElement(fiveVitaminsforWomenOver50);
   		clickElementUsingJavaScript(fiveVitaminsforWomenOver50);
   	}
   	public void clickTopFiveNutrients() throws Exception {
   		moveToElement(topFiveNutrients);
   		clickElementUsingJavaScript(topFiveNutrients);
   	}
   	public void clickTenSimpleWays() throws Exception {
   		moveToElement(tenSimpleWays);
   		clickElementUsingJavaScript(tenSimpleWays);
   	}

}
