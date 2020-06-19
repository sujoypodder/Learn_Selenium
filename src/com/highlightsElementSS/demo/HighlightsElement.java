package com.highlightsElementSS.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightsElement {

	public static void forhighlights(WebDriver driver, WebElement ele) throws IOException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", ele);
	}

	public static void forscreenshot(WebDriver driver, String elessnamr) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Screenshots\\" + elessnamr + ".jgp"),
				true);
	}
}