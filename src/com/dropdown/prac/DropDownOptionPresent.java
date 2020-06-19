package com.dropdown.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionPresent {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement month = driver.findElement(By.id("month"));
		Select sel = new Select(month);
		List<WebElement> AllElements = sel.getOptions();
		for (WebElement element : AllElements) {
			String value = element.getText();
			if (value.equals("May")) {
				System.out.println("family member");
			}
		}
	}

}
