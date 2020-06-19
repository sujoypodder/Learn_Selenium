package com.highlightsElementSS.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightsElementMultiple {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// firstname
		WebElement name = driver.findElement(By.name("firstname"));
		HighlightsElement.forhighlights(driver, name);
		name.sendKeys("selenium");
		HighlightsElement.forscreenshot(driver, "first");
		// lastname
		WebElement lname = driver.findElement(By.name("lastname"));
		HighlightsElement.forhighlights(driver, lname);
		lname.sendKeys("testing");
		HighlightsElement.forscreenshot(driver, "second");

		System.out.println("done");
		driver.close();
	}
}
