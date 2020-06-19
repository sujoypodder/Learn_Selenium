package com.screenshot.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// take screenshot file type
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// save file
		FileUtils.copyFile(srcFile,
				new File("C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Screenshots\\singlepage.jpg"), true);
		System.out.println("taken appropriately");
		driver.close();
	}
}
