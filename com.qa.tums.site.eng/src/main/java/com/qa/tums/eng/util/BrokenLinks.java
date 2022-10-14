package com.qa.tums.eng.util;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.baseClass.BaseClass;

public class BrokenLinks extends BaseClass {

	public static void main(String[] args) throws Throwable {

		browserLaunch("chrome");
		launchURL("https://www.tums.com/");
		implicitWait();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :"+links.size());

		//to iterate the all the links
		int count = 0;
		int row = 0;
		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);
			String attribute = element.getAttribute("href");
			//System.out.println(attribute);
			//To find the response code
			try {
				if(attribute != null) {
					URL url = new URL(attribute);
					URLConnection openConnection =  url.openConnection();
					HttpURLConnection connection =  (HttpURLConnection) openConnection;
					int responseCode = connection.getResponseCode();

					if(responseCode == 200 ) {
						System.out.println(attribute);
						//excelWrite(row, 0,attribute);
//						System.out.println(attribute+" --->Code : "+connection.getResponseCode()+
//								"--->"+connection.getResponseMessage());
						row++;
						count++;
					
					}
					
				}
			}
			catch(Exception e) {

			}
		}
		
		System.out.println("Working Links : "+count);
	}
}

