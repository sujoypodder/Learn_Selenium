package com.notification.some;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OffWindowsNotification {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notification");
		driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		System.out.println("done");
		driver.close();
	}
}
