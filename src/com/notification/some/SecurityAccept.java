package com.notification.some;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SecurityAccept {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.setAcceptInsecureCerts(false);
		driver = new FirefoxDriver();
		driver.get("http://www.cacert.org/");
		System.out.println("done");
		driver.close();
	}
}
