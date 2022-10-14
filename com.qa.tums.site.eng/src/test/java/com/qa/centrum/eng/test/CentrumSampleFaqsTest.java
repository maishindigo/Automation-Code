package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumFaqsPage;
import com.qa.tums.eng.util.Retry;

public class CentrumSampleFaqsTest extends BaseClass{
	
	CentrumFaqsPage cf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/about/faqs/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/about/faqs/");
	}


	@Test(priority = 0, enabled = true, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		cf = new CentrumFaqsPage();
		switchingTab(firstTab);
		cf.clickCookieBtn();
		cf.clickGigyaForm();
		switchingTab(secondTab);
		cf.clickCookieBtn();
		cf.clickGigyaForm();
	}
	
//	@Test(priority = 1)
//	private void verifyGeneralProductQuestionOne() throws Exception {
//		switchingTab(firstTab);
//		cf.clickGeneralProductQuestionOne();
//		switchingTab(secondTab);
//		cf.clickGeneralProductQuestionOne();
//	}

	
	@Test(priority = 2)
	private void verifyGeneralProductQuestionTwo() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionTwo();
		System.out.println("General Product Question Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionTwo();
		System.out.println("General Product Question Two Verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyGeneralProductQuestionThree() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionThree();
		System.out.println("General Product Question Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionThree();
		System.out.println("General Product Question Three Verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyGeneralProductQuestionFour() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionFour();
		System.out.println("General Product Question Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionFour();
		System.out.println("General Product Question Four Verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyGeneralProductQuestionFive() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionFive();
		System.out.println("General Product Question Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionFive();
		System.out.println("General Product Question Five Verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyGeneralProductQuestionSix() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionSix();
		System.out.println("General Product Question Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionSix();
		System.out.println("General Product Question Six Verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyGeneralProductQuestionSeven() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionSeven();
		System.out.println("General Product Question Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionSeven();
		System.out.println("General Product Question Seven Verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyGeneralProductQuestionEight() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionEight();
		System.out.println("General Product Question Eight Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionEight();
		System.out.println("General Product Question Eight Verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyGeneralProductQuestionNine() throws Exception{
		switchingTab(firstTab);
		cf.clickGeneralProductQuestionNine();
		System.out.println("General Product Question Nine Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickGeneralProductQuestionNine();
		System.out.println("General Product Question Nine Verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyIngredientsOne() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsOne();
		System.out.println("Ingredients one Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsOne();
		System.out.println("Ingredients one Verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyIngredientsTwo() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsTwo();
		System.out.println("Ingredients Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsTwo();
		System.out.println("Ingredients Two Verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyIngredientsThree() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsThree();
		System.out.println("Ingredients Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsThree();
		System.out.println("Ingredients Three Verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyIngredientsFour() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsFour();
		System.out.println("Ingredients Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsFour();
		System.out.println("Ingredients Four Verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyIngredientsFive() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsFive();
		System.out.println("Ingredients Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsFive();
		System.out.println("Ingredients Five Verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyIngredientsSix() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsSix();
		System.out.println("Ingredients Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsSix();
		System.out.println("Ingredients Six Verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyIngredientsSeven() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsSeven();
		System.out.println("Ingredients Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsSeven();
		System.out.println("Ingredients Seven Verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyIngredientsEight() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsEight();
		System.out.println("Ingredients Eight Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsEight();
		System.out.println("Ingredients Eight Verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifyIngredientsNine() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsNine();
		System.out.println("Ingredients Nine Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsNine();
		System.out.println("Ingredients Nine Verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifyIngredientsTen() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsTen();
		System.out.println("Ingredients Ten Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsTen();
		System.out.println("Ingredients Ten Verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifyIngredientsEleven() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsEleven();
		System.out.println("Ingredients Eleven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsEleven();
		System.out.println("Ingredients Eleven Verified in the Live URL");
	}
	
	@Test(priority = 21)
	private void verifyIngredientsTweleve() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsTweleve();
		System.out.println("Ingredients Tweleve Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsTweleve();
		System.out.println("Ingredients Tweleve Verified in the Live URL");
	}
	
	@Test(priority = 22)
	private void verifyIngredientsThirteen() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsThirteen();
		System.out.println("Ingredients Thirteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsThirteen();
		System.out.println("Ingredients Thirteen Verified in the Live URL");
	}
	
	@Test(priority = 23)
	private void verifyIngredientsFourteen() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsFourteen();
		System.out.println("Ingredients Fourteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsFourteen();
		System.out.println("Ingredients Fourteen Verified in the Live URL");
	}
	
	@Test(priority = 24)
	private void verifyIngredientsFifteen() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsFifteen();
		System.out.println("Ingredients Fifteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsFifteen();
		System.out.println("Ingredients Fifteen Verified in the Live URL");
	}
	
	@Test(priority = 25)
	private void verifyIngredientsSixteen() throws Exception{
		switchingTab(firstTab);
		cf.clickIngredientsSixteen();
		System.out.println("Ingredients Sixteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickIngredientsSixteen();
		System.out.println("Ingredients Sixteen Verified in the Live URL");
	}
	
	@Test(priority = 26)
	private void verifyCentrumSilverOne() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSilverOne();
		System.out.println("Centrum Silver One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSilverOne();
		System.out.println("Centrum Silver One Verified in the Live URL");
	}
	
	@Test(priority = 27)
	private void verifyCentrumSilverTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSilverTwo();
		System.out.println("Centrum Silver Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSilverTwo();
		System.out.println("Centrum Silver Two Verified in the Live URL");
	}
	
	@Test(priority = 28)
	private void verifyCentrumSilverThree() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSilverThree();
		System.out.println("Centrum Silver Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSilverThree();
		System.out.println("Centrum Silver Three Verified in the Live URL");
	}
	
	@Test(priority = 29)
	private void verifyCentrumSilverFour() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSilverFour();
		System.out.println("Centrum Silver Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSilverFour();
		System.out.println("Centrum Silver Four Verified in the Live URL");
	}
	
	@Test(priority = 30)
	private void verifyCentrumSpecialistOne() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSpecialistOne();
		System.out.println("Centrum Specialist One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSpecialistOne();
		System.out.println("Centrum Specialist One Verified in the Live URL");
	}
	
	@Test(priority = 31)
	private void verifyCentrumSpecialistTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumSpecialistTwo();
		System.out.println("Centrum Specialist Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumSpecialistTwo();
		System.out.println("Centrum Specialist Two Verified in the Live URL");
	}
	
	@Test(priority = 32)
	private void verifyKidsOne() throws Exception {
		switchingTab(firstTab);
		cf.clickKidsOne();
		System.out.println("Kids One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickKidsOne();
		System.out.println("Kids One Verified in the Live URL");
	}
	
	@Test(priority = 33)
	private void verifyKidsTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickKidsTwo();
		System.out.println("Kids Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickKidsTwo();
		System.out.println("Kids Two Verified in the Live URL");
	}
	
	
	
	@Test(priority = 34)
	private void verifMultigummiesOne() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesOne();
		System.out.println("Multigummies One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesOne();
		System.out.println("Multigummies One Verified in the Live URL");
	}
	
	@Test(priority = 35)
	private void verifMultigummiesTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesTwo();
		System.out.println("Multigummies Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesTwo();
		System.out.println("Multigummies Two Verified in the Live URL");
	}
	
	@Test(priority = 36)
	private void verifMultigummiesThree() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesThree();
		System.out.println("Multigummies Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesThree();
		System.out.println("Multigummies Three Verified in the Live URL");
	}
	
	@Test(priority = 37)
	private void verifMultigummiesFour() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesFour();
		System.out.println("Multigummies Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesFour();
		System.out.println("Multigummies Four Verified in the Live URL");
	}
	
	@Test(priority = 38)
	private void verifMultigummiesFive() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesFive();
		System.out.println("Multigummies Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesFive();
		System.out.println("Multigummies Five Verified in the Live URL");
	}
	
	@Test(priority = 39)
	private void verifMultigummiesSix() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesSix();
		System.out.println("Multigummies Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesSix();
		System.out.println("Multigummies Six Verified in the Live URL");
	}
	
	@Test(priority = 40)
	private void verifMultigummiesSeven() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesSeven();
		System.out.println("Multigummies Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesSeven();
		System.out.println("Multigummies Seven Verified in the Live URL");
	}
	
	@Test(priority = 41)
	private void verifMultigummiesEight() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesEight();
		System.out.println("Multigummies Eight Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesEight();
		System.out.println("Multigummies Eight Verified in the Live URL");
	}
	
	@Test(priority = 42)
	private void verifMultigummiesNine() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesNine();
		System.out.println("Multigummies Nine Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesNine();
		System.out.println("Multigummies Nine Verified in the Live URL");
	}
	
	@Test(priority = 43)
	private void verifMultigummiesTen() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesTen();
		System.out.println("Multigummies Ten Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesTen();
		System.out.println("Multigummies Ten Verified in the Live URL");
	}
	
	@Test(priority = 44)
	private void verifMultigummiesEleven() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesEleven();
		System.out.println("Multigummies Eleven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesEleven();
		System.out.println("Multigummies Eleven Verified in the Live URL");
	}
	
	@Test(priority = 45)
	private void verifMultigummiesTwelve() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesTwelve();
		System.out.println("Multigummies Twelve Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesTwelve();
		System.out.println("Multigummies Twelve Verified in the Live URL");
	}
	
	@Test(priority = 46)
	private void verifMultigummiesThirteen() throws Exception {
		switchingTab(firstTab);
		cf.clickMultigummiesThirteen();
		System.out.println("Multigummies Thirteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultigummiesThirteen();
		System.out.println("Multigummies Thirteen Verified in the Live URL");
	}
	
	@Test(priority = 47)
	private void verifMultiBeautyOne() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiBeautyOne();
		System.out.println("Multi Beauty One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiBeautyOne();
		System.out.println("Multi Beauty One Verified in the Live URL");
	}
	
	@Test(priority = 48)
	private void verifMultiBeautyTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiBeautyTwo();
		System.out.println("Multi Beauty Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiBeautyTwo();
		System.out.println("Multi Beauty Two Verified in the Live URL");
	}
	
	@Test(priority = 49)
	private void verifMultiBeautyThree() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiBeautyThree();
		System.out.println("Multi Beauty Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiBeautyThree();
		System.out.println("Multi Beauty Three Verified in the Live URL");
	}
	
	@Test(priority = 50)
	private void verifMultiBeautyFour() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiBeautyFour();
		System.out.println("Multi Beauty Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiBeautyFour();
		System.out.println("Multi Beauty Four Verified in the Live URL");
	}
	
	@Test(priority = 51)
	private void verifMultiOmega3One() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3One();
		System.out.println("Multi Omega3 one Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3One();
		System.out.println("Multi Omega3 one Verified in the Live URL");
	}
	
	@Test(priority = 52)
	private void verifMultiOmega3Two() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3Two();
		System.out.println("Multi Omega3 Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3Two();
		System.out.println("Multi Omega3 Two Verified in the Live URL");
	}
	
	@Test(priority = 53)
	private void verifMultiOmega3Three() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3Three();
		System.out.println("Multi Omega3 Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3Three();
		System.out.println("Multi Omega3 Three Verified in the Live URL");
	}
	
	@Test(priority = 54)
	private void verifMultiOmega3Four() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3Four();
		System.out.println("Multi Omega3 Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3Four();
		System.out.println("Multi Omega3 Four Verified in the Live URL");
	}
	
	@Test(priority = 55)
	private void verifMultiOmega3MenAndWomenOne() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenOne();
		System.out.println("Multi Omega3 Men and Women one Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenOne();
		System.out.println("Multi Omega3 Men and Women one Verified in the Live URL");
	}
	
	@Test(priority = 56)
	private void verifMultiOmega3MenAndWomenTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenTwo();
		System.out.println("Multi Omega3 Men and Women Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenTwo();
		System.out.println("Multi Omega3 Men and Women Two Verified in the Live URL");
	}
	
	@Test(priority = 57)
	private void verifMultiOmega3MenAndWomenThree() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenThree();
		System.out.println("Multi Omega3 Men and Women Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenThree();
		System.out.println("Multi Omega3 Men and Women Three Verified in the Live URL");
	}
	
	@Test(priority = 58)
	private void verifMultiOmega3MenAndWomenFour() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenFour();
		System.out.println("Multi Omega3 Men and Women Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenFour();
		System.out.println("Multi Omega3 Men and Women Four Verified in the Live URL");
	}
	
	@Test(priority = 59)
	private void verifMultiOmega3MenAndWomenFive() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenFive();
		System.out.println("Multi Omega3 Men and Women Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenFive();
		System.out.println("Multi Omega3 Men and Women Five Verified in the Live URL");
	}
	
	@Test(priority = 60)
	private void verifMultiOmega3MenAndWomenSix() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenSix();
		System.out.println("Multi Omega3 Men and Women Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenSix();
		System.out.println("Multi Omega3 Men and Women Six Verified in the Live URL");
	}
	
	@Test(priority = 61)
	private void verifMultiOmega3MenAndWomenSeven() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiOmega3MenAndWomenSeven();
		System.out.println("Multi Omega3 Men and Women Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiOmega3MenAndWomenSeven();
		System.out.println("Multi Omega3 Men and Women Seven Verified in the Live URL");
	}
	
	@Test(priority = 62)
	private void verifMultiAntioxidantsOne() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsOne();
		System.out.println("Multi Antioxidants One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsOne();
		System.out.println("Multi Antioxidants One Verified in the Live URL");
	}
	
	@Test(priority = 63)
	private void verifMultiAntioxidantsTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsTwo();
		System.out.println("Multi Antioxidants Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsTwo();
		System.out.println("Multi Antioxidants Two Verified in the Live URL");
	}
	
	@Test(priority = 64)
	private void verifMultiAntioxidantsThree() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsThree();
		System.out.println("Multi Antioxidants Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsThree();
		System.out.println("Multi Antioxidants Three Verified in the Live URL");
	}
	
	@Test(priority = 65)
	private void verifMultiAntioxidantsFour() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsFour();
		System.out.println("Multi Antioxidants Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsFour();
		System.out.println("Multi Antioxidants Four Verified in the Live URL");
	}
	
	@Test(priority = 66)
	private void verifMultiAntioxidantsFive() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsFive();
		System.out.println("Multi Antioxidants Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsFive();
		System.out.println("Multi Antioxidants Five Verified in the Live URL");
	}
	
	@Test(priority = 67)
	private void verifMultiAntioxidantsSix() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsSix();
		System.out.println("Multi Antioxidants Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsSix();
		System.out.println("Multi Antioxidants Six Verified in the Live URL");
	}
	
	@Test(priority = 68)
	private void verifMultiAntioxidantsSeven() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsSeven();
		System.out.println("Multi Antioxidants Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsSeven();
		System.out.println("Multi Antioxidants Seven Verified in the Live URL");
	}
	
	@Test(priority = 69)
	private void verifMultiAntioxidantsEight() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsEight();
		System.out.println("Multi Antioxidants Eight Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsEight();
		System.out.println("Multi Antioxidants Eight Verified in the Live URL");
	}
	
	@Test(priority = 70)
	private void verifMultiAntioxidantsNine() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsNine();
		System.out.println("Multi Antioxidants Nine Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsNine();
		System.out.println("Multi Antioxidants Nine Verified in the Live URL");
	}
	
	@Test(priority = 71)
	private void verifMultiAntioxidantsTen() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsTen();
		System.out.println("Multi Antioxidants Ten Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsTen();
		System.out.println("Multi Antioxidants Ten Verified in the Live URL");
	}
	
	@Test(priority = 72)
	private void verifMultiAntioxidantsEleven() throws Exception {
		switchingTab(firstTab);
		cf.clickMultiAntioxidantsEleven();
		System.out.println("Multi Antioxidants Eleven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMultiAntioxidantsEleven();
		System.out.println("Multi Antioxidants Eleven Verified in the Live URL");
	}
	
	@Test(priority = 73)
	private void verifMenAndWomen50PlusOne() throws Exception {
		switchingTab(firstTab);
		cf.clickMenAndWomen50PlusOne();
		System.out.println("Men and Women50 Plus One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMenAndWomen50PlusOne();
		System.out.println("Men and Women50 Plus One Verified in the Live URL");
	}
	
	@Test(priority = 74)
	private void verifMenAndWomen50PlusTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickMenAndWomen50PlusTwo();
		System.out.println("Men and Women50 Plus Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMenAndWomen50PlusTwo();
		System.out.println("Men and Women50 Plus Two Verified in the Live URL");
	}
	
	@Test(priority = 75)
	private void verifMenAndWomen50PlusThree() throws Exception {
		switchingTab(firstTab);
		cf.clickMenAndWomen50PlusThree();
		System.out.println("Men and Women50 Plus Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMenAndWomen50PlusThree();
		System.out.println("Men and Women50 Plus Three Verified in the Live URL");
	}
	
	@Test(priority = 76)
	private void verifMenAndWomen50PlusFour() throws Exception {
		switchingTab(firstTab);
		cf.clickMenAndWomen50PlusFour();
		System.out.println("Men and Women50 Plus Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickMenAndWomen50PlusFour();
		System.out.println("Men and Women50 Plus Four Verified in the Live URL");
	}
	
	@Test(priority = 77)
	private void verifTargettedSupplementsOne() throws Exception {
		switchingTab(firstTab);
		cf.clickTargettedSupplementsOne();
		System.out.println("Targetted Supplements One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickTargettedSupplementsOne();
		System.out.println("Targetted Supplements One Verified in the Live URL");
	}
	
	@Test(priority = 78)
	private void verifBenefitBlendsOne() throws Exception {
		switchingTab(firstTab);
		cf.clickBenefitBlendsOne();
		System.out.println("Benefit Blends One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickBenefitBlendsOne();
		System.out.println("Benefit Blends One Verified in the Live URL");
	}
	
	@Test(priority = 79)
	private void verifBenefitBlendsTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickBenefitBlendsTwo();
		System.out.println("Benefit Blends Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickBenefitBlendsTwo();
		System.out.println("Benefit Blends Two Verified in the Live URL");
	}
	
	@Test(priority = 80)
	private void verifCentrumOrganicMultigummiesOne() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumOrganicMultigummiesOne();
		System.out.println("Centrum Organic Multigummies One Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumOrganicMultigummiesOne();
		System.out.println("Centrum Organic Multigummies One Verified in the Live URL");
	}
	
	@Test(priority = 81)
	private void verifCentrumOrganicMultigummiesTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumOrganicMultigummiesTwo();
		System.out.println("Centrum Organic Multigummies Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumOrganicMultigummiesTwo();
		System.out.println("Centrum Organic Multigummies Two Verified in the Live URL");
	}
	
	@Test(priority = 82)
	private void verifCentrumOrganicMultigummiesThree() throws Exception {
		switchingTab(firstTab);
		cf.clickCentrumOrganicMultigummiesThree();
		System.out.println("Centrum Organic Multigummies Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickCentrumOrganicMultigummiesThree();
		System.out.println("Centrum Organic Multigummies Three Verified in the Live URL");
	}
	
	@Test(priority = 83)
	private void verifDailyWellnessPacksOne() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksOne();
		System.out.println("Centrum Daily Wellness One Packs Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksOne();
		System.out.println("Centrum Daily Wellness One Packs Verified in the Live URL");
	}
	
	@Test(priority = 84)
	private void verifDailyWellnessPacksTwo() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksTwo();
		System.out.println("Centrum Daily Wellness Packs Two Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksTwo();
		System.out.println("Centrum Daily Wellness Packs Two Verified in the Live URL");
	}
	
	@Test(priority = 85)
	private void verifDailyWellnessPacksThree() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksThree();
		System.out.println("Centrum Daily Wellness Packs Three Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksThree();
		System.out.println("Centrum Daily Wellness Packs Three Verified in the Live URL");
	}
	
	@Test(priority = 86)
	private void verifDailyWellnessPacksFour() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksFour();
		System.out.println("Centrum Daily Wellness Packs Four Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksFour();
		System.out.println("Centrum Daily Wellness Packs Four Verified in the Live URL");
	}
	
	@Test(priority = 87)
	private void verifDailyWellnessPacksFive() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksFive();
		System.out.println("Centrum Daily Wellness Packs Five Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksFive();
		System.out.println("Centrum Daily Wellness Packs Five Verified in the Live URL");
	}
	
	@Test(priority = 88)
	private void verifDailyWellnessPacksSix() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksSix();
		System.out.println("Centrum Daily Wellness Packs Six Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksSix();
		System.out.println("Centrum Daily Wellness Packs Six Verified in the Live URL");
	}
	
	@Test(priority = 89)
	private void verifDailyWellnessPacksSeven() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksSeven();
		System.out.println("Centrum Daily Wellness Packs Seven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksSeven();
		System.out.println("Centrum Daily Wellness Packs Seven Verified in the Live URL");
	}
	
	@Test(priority = 90)
	private void verifDailyWellnessPacksEight() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksEight();
		System.out.println("Centrum Daily Wellness Packs Eight Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksEight();
		System.out.println("Centrum Daily Wellness Packs Eight Verified in the Live URL");
	}
	
	@Test(priority = 91)
	private void verifDailyWellnessPacksNine() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksNine();
		System.out.println("Centrum Daily Wellness Packs Nine Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksNine();
		System.out.println("Centrum Daily Wellness Packs Nine Verified in the Live URL");
	}
	
	@Test(priority = 92)
	private void verifDailyWellnessPacksTen() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksTen();
		System.out.println("Centrum Daily Wellness Packs Ten Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksTen();
		System.out.println("Centrum Daily Wellness Packs Ten Verified in the Live URL");
	}
	
	@Test(priority = 93)
	private void verifDailyWellnessPacksEleven() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksEleven();
		System.out.println("Centrum Daily Wellness Packs Eleven Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksEleven();
		System.out.println("Centrum Daily Wellness Packs Eleven Verified in the Live URL");
	}
	
	@Test(priority = 94)
	private void verifDailyWellnessPacksTwelve() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksTwelve();
		System.out.println("Centrum Daily Wellness Packs Twelve Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksTwelve();
		System.out.println("Centrum Daily Wellness Packs Twelve Verified in the Live URL");
	}
	
	@Test(priority = 95)
	private void verifDailyWellnessPacksThirteen() throws Exception {
		switchingTab(firstTab);
		cf.clickDailyWellnessPacksThirteen();
		System.out.println("Centrum Daily Wellness Packs Thirteen Verified in the PreProd URL");
		switchingTab(secondTab);
		cf.clickDailyWellnessPacksThirteen();
		System.out.println("Centrum Daily Wellness Packs Thirteen Verified in the Live URL");
	}
	
	
	
	
	
	
}
