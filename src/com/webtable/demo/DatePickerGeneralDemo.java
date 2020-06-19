package com.webtable.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerGeneralDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/home");
		Thread.sleep(2000);
		WebElement chekhin = driver.findElement(By.xpath("//*[@id=\"checkin\"]"));
		String inval = "20-05-2020";
		SelectDateByJs(driver, chekhin, inval);
		Thread.sleep(2000);
		WebElement chekhout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		String outval = "05-01-2020";
		SelectDateByJs(driver, chekhout, outval);
		Thread.sleep(5000);
		System.out.println("okay");
		driver.close();
	}

	public static void SelectDateByJs(WebDriver driver, WebElement ele, String dvalue) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dvalue + "');", ele);
	}
}
