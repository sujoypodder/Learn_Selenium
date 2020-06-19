package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://demo.guru99.com/test/simple_context_menu.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement ele = driver.findElement(By.linkText("Bank Project"));
		Actions act = new Actions(driver);
		act.contextClick(ele);
		act.perform();
		System.out.println("success");
	}
}
