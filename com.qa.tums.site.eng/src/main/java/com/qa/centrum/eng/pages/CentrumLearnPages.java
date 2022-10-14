package com.qa.centrum.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumLearnPages extends BaseClass  {
	public CentrumLearnPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Dismiss']")
    WebElement cookieBtn;
    
	@FindBy(xpath = "//h2[@class='heading']")
    WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Learn ']")
    WebElement learn;
	
	@FindBy(xpath = "//a[@title=\"Learn\"]")
    WebElement learnmores;
	
	@FindBy(xpath = "//a[text()='Vitamins & Minerals']")
    WebElement vitamins;
	
	@FindBy(xpath = "//a[text()='Wellness Benefits']")
    WebElement wellness;
	
	@FindBy(xpath = "//a[text()='Why Are Vitamins Important?']")
    WebElement importance;
	
	@FindBy(xpath = "//a[text()='Nutrients and Routine']")
    WebElement nutrients;
	
	@FindBy(xpath = "//a[text()='Health and Lifestyle Tips']")
    WebElement lifestyle;
	
	@FindBy(xpath = "//a[text()='Food and Nutrition']")
    WebElement food;
	
	@FindBy(xpath = "//a[text()='View All Articles']")
    WebElement articles;
	
	@FindBy(xpath = "(//img[@class=\"richText-image pull-left\"])[1]")
    WebElement richtext;
	
	@FindBy(xpath = "(//img[@class=\"richText-image pull-left\"])[2]")
    WebElement richtext1;
	
	
	
	//Methods//
		public void clickoncookie() throws Exception {
			//moveToElement(cookieBtn);
			elementClick(cookieBtn);
			
		}
		public void clickongigya() throws Exception {
			//moveToElement(gigyaForm);
			elementClick(gigyaForm);
		}
		public void clickonlearnhome() throws Exception {
			moveToElement(learn);
			elementClick(learn);
			
		}
		public void clickonlearnmore() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(learnmores);
			
		}
		public void clickonvitamins() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(vitamins);
			
		}
		public void clickonwellness() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(wellness);
			
		}
		public void clickonvitaminsimportance() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(importance);
			
		}
		public void clickonnutrients() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(nutrients);
			
		}
		public void clickonLifestyle() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(lifestyle);
			
		}
		public void clickonFood() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(food);
			
		}
		public void clickonArticles() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(articles);
			
		}
		public void clickonRichText() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(richtext);
			
		}
		public void clickonRichText1() throws Exception {
			//scrollDownUsingElement(learn);
			moveToElement(learn);
			elementClick(richtext1);
			
		}
}

