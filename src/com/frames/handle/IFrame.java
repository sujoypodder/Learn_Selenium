package com.frames.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		WebElement iframe = driver.findElement(By.id("tinymce"));
		iframe.clear();
		iframe.sendKeys("Selenium autimation testing");
		Thread.sleep(3000);
		driver.close();
	}
}
