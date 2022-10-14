package com.qa.tums.eng.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void setExtent() {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/Reports/" + "MyReport_" + dateName + ".html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent.config.xml");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "WKWZTPqvmdckJHX");
		extent.setSystemInfo("ProjectName", "Centrum English");
		extent.setSystemInfo("Tester", "SUJAI SEKAR");
		extent.setSystemInfo("OS", "Win11");
		extent.setSystemInfo("Browser", "Chrome");
	}

	public static void endReport() {
		extent.flush();
	}
}
