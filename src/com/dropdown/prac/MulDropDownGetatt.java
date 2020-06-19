package com.dropdown.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulDropDownGetatt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement dropdownElement = driver.findElement(By.id("month"));

		String singleOrMulti = dropdownElement.getAttribute("multiple");

		if (singleOrMulti != null) {
			System.out.println("Dropdown is Multi value dropdown");
		} else {
			System.out.println("Dropdown is Single value dropdown");
		}
	}
}
