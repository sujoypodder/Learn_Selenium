package com.notification.some;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessChekh {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(true);
		driver = new FirefoxDriver(option);
		driver.get("https://www.redison.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("done");
		driver.close();
	}
}
