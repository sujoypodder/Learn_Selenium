package com.frames.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-left");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-middle");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-right");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-bottom");
		Thread.sleep(2000);
		System.out.println("all element traversy");
		driver.close();
	}
}
