package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class MeditationForStress extends BaseClass{
	
	public MeditationForStress() {
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
    
    @FindBy(xpath = "//u[text()='immune health']")
   	WebElement immuneHealth;
    
    @FindBy(xpath = "//u[text()='work from home with kids']")
   	WebElement WorkFromHome;
    
    @FindBy(xpath = "//u[text()='self-care routine']")
   	WebElement selfCareRoutine;
    
    @FindBy(xpath = "//u[text()='Stress & Mood Supplement']")
   	WebElement selfAndMoodSuppliment;
    
//    @FindBy(xpath = "//strong[text()='Over 50? What Your Body Needs More of Now']")
//   	WebElement over50;
//       
//       @FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
//   	WebElement fiveVitaminsforWomenOver50;
//       
//       @FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
//   	WebElement topFiveNutrients;
//       
//       @FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
//   	WebElement tenSimpleWays;
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
      	public void clickShowReference() throws Exception {
//            scrollDownUsingElement();
            elementClick(btnShowReference);
            Assert.assertTrue(elementIsDisplayed(btnHideReference));
            elementClick(btnHideReference);
        }
      	public void clickimmuneHealth() throws Exception {
      		moveToElement(immuneHealth);
      		clickElementUsingJavaScript(immuneHealth);
      	}
      	public void clickWorkFromHome() throws Exception {
      		moveToElement(WorkFromHome);
      		clickElementUsingJavaScript(WorkFromHome);
      	}
      	public void clickselfCareRoutine() throws Exception {
      		moveToElement(selfCareRoutine);
      		clickElementUsingJavaScript(selfCareRoutine);
      	}
      	public void clickselfAndMoodSuppliment() throws Exception {
      		moveToElement(selfAndMoodSuppliment);
      		clickElementUsingJavaScript(selfAndMoodSuppliment);
      	}

}
