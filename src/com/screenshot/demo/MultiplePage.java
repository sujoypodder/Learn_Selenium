package com.screenshot.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MultiplePage {

	public static void multipleScreenshot(WebDriver driver, String screenshotname) throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// save file
		FileUtils.copyFile(srcFile,
				new File(
						"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Screenshots\\" + screenshotname + ".jpg"),
				true);
		System.out.println("taken appropriately");
	}
}
