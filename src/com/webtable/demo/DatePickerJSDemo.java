package com.webtable.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerJSDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		WebElement Ddate = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateval = "20-05-2020";
		SelectDateByJs(driver, Ddate, dateval);
		Thread.sleep(2000);
		WebElement Rdate = driver.findElement(By.id("ctl00_mainContent_txt_Todate"));
		String dateval1 = "05-01-2021";
		SelectDateByJs(driver, Rdate, dateval1);
		System.out.println("good job");
		Thread.sleep(5000);
		driver.close();
	}

	public static void SelectDateByJs(WebDriver driver, WebElement ele, String dvalue) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dvalue + "');", ele);
	}
}
