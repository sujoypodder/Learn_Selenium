package com.screenshot.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePageScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// take screenshot and save
		MultiplePage.multipleScreenshot(driver, "firstscreenshot");
		// second sceernshot and save
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("podder");
		MultiplePage.multipleScreenshot(driver, "secondscreenshot");
		driver.close();
	}
}
