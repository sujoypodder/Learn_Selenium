package com.bitm.projectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumLWT\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().setSize(new Dimension(600, 400));

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("mail222gmail.com");

		WebElement email1 = driver.findElement(By.name("email"));
		// email1.sendKeys();

		WebElement email2 = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		// email2.sendKeys();

		WebElement email3 = driver.findElement(By.cssSelector("#input-email"));
		// email3.sendKeys();

		WebElement forgetpass = driver.findElement(By.linkText("Forgotten Password"));
		forgetpass.click();

		driver.close();

	}

}
