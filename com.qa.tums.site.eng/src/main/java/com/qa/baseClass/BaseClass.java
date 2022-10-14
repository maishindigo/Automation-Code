package com.qa.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qa.tums.eng.util.ExtentManager;


/**
 * 
 * @author sujsekar
 *
 */

public class BaseClass {


	public static WebDriver driver;
	public static Actions action;
	public static Properties properties;
	public static String firstTab;
	public static String secondTab;
	public static String originalUrl;
	public static JavascriptExecutor js;

	@BeforeSuite
	public void startReport() {
		ExtentManager.setExtent();
	}
	@AfterSuite
	public void endReport() {
		ExtentManager.endReport();

	}

	public static Properties loadProperties() throws IOException {
		FileInputStream fileinput = new FileInputStream("src\\main\\resources\\Config.Properties\\config.properties");
		properties = new Properties();
		properties.load(fileinput);
		return properties;
	}




	public static WebDriver browserLaunch(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\new driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			if (browserName.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
				driver.get("http://www.google.com");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("It is not a valid browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void driverQuite() {
		driver.quit();
	}

	public static void launchURL(String url) throws Exception {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Entered URL is incorrect");
		}
	}

	public static boolean elementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return true;
		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("Element is not displayed");
		}
		return false;
	}
	public static boolean assertionElementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public static boolean elementIsEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not enabled");
		}
	}

	public static boolean elementIsSelected(WebElement element) throws Exception {
		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not selected");
		}
	}

	public static void elementSendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public static String getElementText(WebElement element) throws Exception {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get the text from the webpage");
		}
	}

	public static String getElementAttribute(WebElement element, String value) throws Exception {
		try {
			String attribute = element.getAttribute(value);
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get the attribute value from the webpage");
		}
	}

	public static void moveToElement(WebElement element) throws Exception {
		try {
			action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to mouse over the element");
		}
	}

	public static void doubleClickElement(WebElement element) throws Exception {
		try {
			action = new Actions(driver);
			action.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to double click the webelement");
		}
	}

	public static void contextClickElement(WebElement element) throws Exception {
		try {
			action = new Actions(driver);
			action.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to right click the webelement");
		}
	}

	public static void dragAndDrop(WebElement source, WebElement target) throws Exception {
		try {
			action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to perform the drag and drop function");
		}
	}

	public static void elementClear(WebElement element) {
		element.clear();
	}

	public static void acceptAlert() throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to accept the alert");
		}
	}

	public static void dismissAlert() throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to cancel the alert");
		}
	}

	public static void sendKeysToAlert(String text) throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to insert the text in alert box");
		}
	}
	
	public static void fluentWait() {
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(200, TimeUnit.MILLISECONDS)
		        .ignoring(NoSuchElementException.class);
	}

	// Scroll Down the page
	public static void scrollDownUsingElement(WebElement element) throws Exception {
//		pageLoad(element);
		try {
//			if (elementIsDisplayed(element)&& elementIsEnabled(element)) {
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
//			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to scroll down the page");
		}
	}

	// scroll up the page
	public static void scrollupUsingElement(WebElement element) throws Exception {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to scroll up the page");
		}
	}

	// launching URL by using navigation
	public static void navigateToUrl(String url) throws Exception {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to launch the URL");
		}
	}

	// Moving back to the web page using navigation
	public static void navigateBack() throws Exception {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to navigate back to the webpage");
		}
	}

	// Moving forward to the web page using navigation
	public static void navigateForward() throws Exception {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to navigate forward to the webpage");
		}
	}

	// Refresh the web page
	public static void refreshWebPage() throws Exception {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to refresh the web page");
		}
	}

	public static String getPageTitle() throws Exception {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get te=he title from the web page");
		}
	}

	public static String getCurrentUrl() throws Exception {
		try {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get the URL from the current web page");
		}
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void waitPause(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void clickElementUsingJavaScript(WebElement element) throws Exception {
		try {
			 js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to click the element using JavaScript");
		}
	}

	public static void windowHandle() throws Exception {
		try {
			String pwnd = driver.getWindowHandle();
			Set<String> allwnd = driver.getWindowHandles();
			for (String string : allwnd) {
				if (pwnd != string) {
					driver.switchTo().window(string);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the driver control to new window");
		}
	}
	
	public static String windowHandleByIndex(int n) {
		String oldwindow = driver.getWindowHandle();
		Set<String> newwindow = driver.getWindowHandles();
		driver.getWindowHandles();
		int i = 0;
		for (String string : newwindow) {
			if (i == n) {

				WebDriver window = driver.switchTo().window(string);
			}
		}
		return oldwindow;
	}


	public static void switchTab() throws Throwable {
		String windowHandle = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
		for (int i = 1; i < tabs.size(); i--) {
			driver.switchTo().window(tabs.get(i));
		}

		//driver.switchTo().window(tabs.get(0));
	}

	public static void multipleWindowHandle() throws Exception {
		try {
			String pwnd = driver.getWindowHandle();
			Set<String> allwnd = driver.getWindowHandles();
			for (String child : allwnd) {
				if (!child.equals(pwnd)) {
					driver.switchTo().window(pwnd);
					driver.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the driver control to new window");
		}
	}
	
	public static void switchTabAll() throws Throwable {

        // Get the current window handle

        String windowHandle = driver.getWindowHandle();



        // Get the list of window handles

        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());

// Use the list of window handles to switch between windows

        driver.switchTo().window(tabs.get(1));

        String getURL = driver.getCurrentUrl();

       

        System.out.println("external url is " + getURL);

        for (int i = 1; i < tabs.size(); i++) {

            driver.switchTo().window(tabs.get(i));

            driver.close();

        }

        driver.switchTo().window(tabs.get(0));

    }

	public static void windowhandleByTitle(String title) throws Exception {
		try {
			driver.switchTo().window(title);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the window based on tile");
		}
	}

	public static void windowhandleByUrl(String url) throws Exception {
		try {
			driver.switchTo().window(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the window based on url");
		}
	}

	public static void selectDropDown(WebElement element, String options, String value) throws Exception {
		try {
			Select sc = new Select(element);
			if (options.equals("value")) {
				sc.selectByValue(value);
			} else if (options.equals("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (options.equals("visibletext")) {
				sc.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to select the value from drop down");
		}
	}

	public static void tabFunction() throws Exception {
		try {
			action = new Actions(driver);
			action.keyDown(Keys.TAB).build().perform();
			action.keyUp(Keys.TAB).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to perform the Tab functionality");
		}

	}

	public static String excelRead(String sheetName, int rowNum, int cellNum) throws IOException {

		File file = new File("src\\test\\resources\\Excelsheet\\Book1 (2).xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fileInput);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		String valueOf = null;
		if (cell.getCellType() == 0) {
			double numericCellValue = cell.getNumericCellValue();
			long lng = (long) numericCellValue;
			valueOf = String.valueOf(numericCellValue);
		} else if (cell.getCellType() == 1) {
			valueOf = cell.getStringCellValue();
		}
		return valueOf;
	}

	public static void excelWrite(int rowNum, int cellNum, String value) throws Throwable {
		File file = new File("src\\test\\resources\\Excelsheet\\Book1 (2).xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fileInput);
		Sheet sheet = wb.getSheet("SevereHeartburn");
		Row row = sheet.createRow(rowNum);
		Cell cell = sheet.getRow(rowNum).getCell(cellNum);
		if (cell == null) {
			cell = row.createCell(cellNum);
			cell.setCellValue(value);
		} else {
			cell.setCellValue(value);
		}
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		fout.close();
	}

	public static String excelReadAllValues() throws IOException {

		File file = new File("src\\test\\resources\\Excelsheet\\Book1 (2).xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fileInput);
		Sheet sheet = wb.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		return null;
	}

	public static void selectByValue(WebElement element, String value) throws Exception {
		try {
			Select sel = new Select(element);
			sel.selectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to select the element by value");
		}
	}

	public static void selectByVisibleText(WebElement element, String value) throws Exception {
		try {
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to select the element by visible text");
		}
	}

	public static void selectByIndex(WebElement element, int index) throws Exception {
		try {
			Select sel = new Select(element);
			sel.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to select the element by Index");
		}
	}

	public static void deSelectByValue(WebElement element, String value) throws Exception {
		try {
			Select sel = new Select(element);
			sel.deselectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to deselect the option by value");
		}
	}

	public static void deSelectByVisbileText(WebElement element, String value) throws Exception {
		try {
			Select sel = new Select(element);
			sel.deselectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to deselect the option by visible text");
		}
	}

	public static void deSelectByIndex(WebElement element, int index) throws Exception {
		try {
			Select sel = new Select(element);
			sel.deselectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to deselect the option by index");
		}
	}

	public static void deSelectAll(WebElement element) throws Exception {
		try {
			Select sel = new Select(element);
			sel.deselectAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to deselect all the Options");
		}
	}

	public static void switchToFrameUsingID(String frameID) throws Exception {
		try {
			driver.switchTo().frame(frameID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the driver to frame using ID or name");
		}
	}

	public static void switchToFrameUsingElement(WebElement element) throws Exception {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the driver to frame using element");
		}
	}

	public static void switchToFrameUsingIndex(int index) throws Exception {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			throw new Exception("Unable to switch the driver to frame using Index");
		}
	}

	public static void frameSwitchingToDefaultContent() throws Exception {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the driver to default webpage");
		}
	}

	public static void frameSwitchingToParentFrame() throws Exception {
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the frame to parent frame ");
		}

	}

	public static String takeScreenshot(String fileName) {
		String dateName = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
		File screenshotAs = takescreenshot .getScreenshotAs(OutputType.FILE);
		String des = System.getProperty("user.dir")+"\\Screenshot\\"+fileName+"_"+dateName+".png";

		try {
			FileUtils.copyFile(screenshotAs, new File(des));
		} catch (Exception e) {
			e.getMessage();
		}
		return des;
	}

	public static void alertIsPresent() {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.alertIsPresent());
	}

	public static void elementToBeClickable( WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void elementToBeSelected( WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void presenceOfElementLocated(String element) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
	}

	public static void visibilityOf( WebElement element) {
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void pageLoad(WebElement element) {
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
	public static boolean compareTwoText(String source, String destination) {
		try {
			Assert.assertEquals(source, destination);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void toFetchAllUrl(String internalUrl) {

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links: "+allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {

			WebElement element = allLinks.get(i);
			String url = element.getAttribute("href");

			String domain = internalUrl;

			if (url !=null && url.contains(domain)) {
				System.out.println(url);

			}

		}

	}
	public static void actionClick(WebElement element) {
		action = new Actions(driver);
		action.click(element).build().perform();
		//		Action action  = ob.build();
		//		action.perform();

	}

	public static boolean verifyUrl(String exp) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL---->"+currentUrl);
		boolean compareTwoText = compareTwoText(currentUrl, exp);
		System.out.println("Url Verifyed--->"+compareTwoText);
		try {
			URL url = new URL(currentUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 404) {
				System.out.println("404 Error found" );
			}
			else {
				System.out.println("URL is working fine");
			}
		} catch (Exception e) {

		}
		return compareTwoText;
	}

	public static boolean verifyTitle(String exp) {

		String currentTitle = driver.getTitle();
		System.out.println("title--->"+currentTitle);
		boolean compareTwoText = compareTwoText(currentTitle, exp);
		System.out.println("Title Verified--->"+compareTwoText);
		String title = "404 Error";

		try {
			if (currentTitle.contains(title)) {
				System.out.println("404 Error found" );
			}
			else {
				System.out.println("URL is working fine");
			}
		} catch (Exception e) {

		}
		return compareTwoText;

	}
	public static void scrollPageInUpAndDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	
	public static void scrollPage(int num) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+num+")", "");
	}
	
	
	public static void scrollPageInDown500() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	public static void scrollPageInUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}
	
	
//	public static void preProdUrl(String preProdUrl) throws Exception {
//		try {
//			driver.get(preProdUrl);
//			driver.manage().window().maximize();
//			implicitWait();
//			firstTab = driver.getWindowHandle();
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("Entered URL is incorrect");
//		}
//	}
	
//	public static void liveUrl(String liveUrl) throws Exception {
//		try {
//			JavascriptExecutor js = (JavascriptExecutor) driver; 
//			js.executeScript("window.open('"+liveUrl+"')");
//			implicitWait();
//			for(String winHandle : driver.getWindowHandles()){
//				driver.switchTo().window(winHandle);
//			}
//			secondTab = driver.getWindowHandle();
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("Entered URL is incorrect");
//		}
//	}
	
	public static void switchingTab(String tabs) throws Exception {
		try {
			driver.switchTo().window(tabs);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to switch the Tab to the respective window");
		}
	}
	

//	public static String comparePreProdUrl(String url) {
//		try {
//			String preProdCurrentUrl=driver.getCurrentUrl();
//			String preProdDomin =url;
//			if(preProdCurrentUrl.contains(preProdDomin)){
//				System.out.println("URL contains Preprod Domain :" + preProdDomin);
//			}
//			String preProdUrl = preProdCurrentUrl.replace(preProdDomin, "");
//			System.out.println(preProdUrl);
//			
//		} catch (Exception e) {
//
//		}
//		return null;
//		
//	}
	
//	public static String compareLiveUrl(String url) {
//		try {
//			String liveCurrentUrl=driver.getCurrentUrl();
//			String liveDomain = url;
//			if(liveCurrentUrl.contains(liveDomain)){
//				System.out.println("URL contains Live Domain :" + liveDomain);
//			}
//			String liveUrl = liveCurrentUrl.replace(liveDomain, "");
//			System.out.println(liveUrl);
//		} catch (Exception e) {
//			
//		}
//		return null;
//	}
	
	
	public static String compareUrl(String url) {
		try {
			String currentUrl=driver.getCurrentUrl();
			String domainUrl = url;
			if(currentUrl.contains(domainUrl)){
				System.out.println("URL contains Live Domain :" + domainUrl);
			}
			 originalUrl = currentUrl.replace(domainUrl, "");
			System.out.println(originalUrl);
			
		} catch (Exception e) {
			
		}
		return originalUrl;
	}
	
	
	
	public static void launchTwoUrl() throws Exception {
		try {
			launchURL("https://www.google.co.in/");
			firstTab = driver.getWindowHandle();
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.open('https://www.google.co.in/')");
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
			}
			secondTab = driver.getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to launch two URL");
		}
	}
	
	public static void newScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public static boolean elementVisible(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public static boolean isClickable(WebElement element) {
		elementToBeClickable(element);
		try {
			
			if (elementIsDisplayed(element)&& elementIsEnabled(element)) {
				element.click();
			}
			return true;
		} catch (Exception e) {

		}
		return false;
	}
	
	
	public boolean click1(WebElement locator, String locatorName) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Able to click on \""+locatorName+"\"");
			} else {
				System.out.println("Click Unable to click on \""+locatorName+"\"");
			}
		}

	}
	
	public static WebElement getElementWithIndex(By by, int pos) {
		return driver.findElements(by).get(pos);
	}
	
	
}
