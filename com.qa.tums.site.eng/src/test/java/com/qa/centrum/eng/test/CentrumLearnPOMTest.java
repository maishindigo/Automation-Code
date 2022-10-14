package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.centrum.eng.pages.CentrumLearnPages;


public class CentrumLearnPOMTest  extends CentrumLearnPages {
CentrumLearnPages cl;
	
	@BeforeClass
    private void lauchingTheBrowser() throws IOException, Exception {
        browserLaunch(loadProperties().getProperty("browser"));
        launchTwoUrl();
   }
    @BeforeMethod
    private void launchingTheUrl() throws IOException, Exception {
        switchingTab(firstTab);
        launchURL(loadProperties().getProperty("preprod"));
        switchingTab(secondTab);
        launchURL(loadProperties().getProperty("prod"));
        
    }
    @Test(priority = 0, enabled = true)
    private void cookieButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickoncookie();
         cl.clickongigya();
         switchingTab(secondTab);
         cl.clickoncookie();
         cl.clickongigya();
    }
    
    @Test(priority = 1, enabled = true)
    private void learnButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonlearnhome();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonlearnhome();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 2, enabled = true)
    private void learnmoreButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonlearnmore();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonlearnmore();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 3, enabled = true)
    private void vitaminsButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonvitamins();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonvitamins();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 4, enabled = true)
    private void wellnessButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonwellness();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonwellness();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 5, enabled = true)
    private void importancevitaminsButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonvitaminsimportance();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonvitaminsimportance();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 6, enabled = true)
    private void NutrientsButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonnutrients();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonnutrients();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    
    @Test(priority = 7, enabled = true)
    private void LifestyleButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonLifestyle();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonLifestyle();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 8, enabled = true)
    private void FoodandNutritionButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonFood();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonFood();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 9, enabled = true)
    private void ArticlesButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonArticles();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonArticles();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 10, enabled = true)
    private void RichTextButton() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonRichText();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonRichText();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
    @Test(priority = 11, enabled = true)
    private void RichText1Button() throws Exception {
         cl=new CentrumLearnPages();
         switchingTab(firstTab);
         cl.clickonRichText1();
         String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
         switchingTab(secondTab);
         cl.clickonRichText1();
         String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    } 
}

