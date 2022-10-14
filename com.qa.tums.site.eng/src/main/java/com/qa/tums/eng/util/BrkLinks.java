package com.qa.tums.eng.util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.baseClass.BaseClass;

public class BrkLinks extends BaseClass {

	public static void main(String[] args) throws Exception {

		browserLaunch("chrome");
		launchURL("https://gskstaging15:Climate2022@tums-com-v2.preprod-cf65.ch.adobecqms.net/es-us/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :" + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);
			//WebElement url1 = element.findElement(By.partialLinkText("preprod-cf65"));
			String url = element.getAttribute("href");
			
		//System.out.println(url);
				verifyLinkActive(url);

		}
	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage()+" - "+httpURLConnect.getResponseCode());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)

				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND+"-"+httpURLConnect.getResponseCode());

		} catch (Exception e) {

		}
	}

}