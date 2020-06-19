package com.properties.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Configuration\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("baseUrl"));
		WebElement email = driver.findElement(By.id(prop.getProperty("emailid")));
		email.sendKeys(prop.getProperty("emailtext"));
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys(prop.getProperty("passwordtext"));
	}
}
