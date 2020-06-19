package com.dropdown.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetoptionWithequalsDD {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement selectcountrycombo = driver.findElement(By.id("Skills"));
		selectcountrycombo.click();

		List<WebElement> comboboxes = driver.findElements(By.cssSelector("select#Skills"));
		for (WebElement cobobox : comboboxes) {
			if (cobobox.getText().equals("India")) {
				cobobox.click();
				break;
			}
			System.out.println("complete");
		}
		driver.close();
	}
}
