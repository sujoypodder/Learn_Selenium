package com.dropdown.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);

		// select and deselect dropdown
//		WebElement slctdrop = driver.findElement(By.id("select-demo"));
//		Select slct = new Select(slctdrop);
//		slct.selectByVisibleText("Friday");
//		Thread.sleep(2000);
//		slct.deselectByVisibleText("Friday");

		// multiple dropdown
		WebElement muldrop = driver.findElement(By.id("multi-select"));
		Select slct1 = new Select(muldrop);
		boolean sinormul = slct1.isMultiple();
		if (sinormul) {
			System.out.println("multiple dropdown");
		} else {
			System.out.println("single dropdown");
		}

		slct1.selectByVisibleText("Florida");
		Thread.sleep(1000);
		slct1.selectByVisibleText("Texas");
		Thread.sleep(3000);
		driver.close();
	}

}
