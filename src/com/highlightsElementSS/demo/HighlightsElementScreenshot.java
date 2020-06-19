package com.highlightsElementSS.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightsElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/checkboxes";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// highlights element with red border 3px width
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
		Thread.sleep(2000);
		// take screenshot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// save image screenshot as driver
		FileUtils.copyFile(file,
				new File("C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Screenshots\\highlightdemoss.jgp"),
				true);
		System.out.println("okay done");
		driver.close();
	}
}
