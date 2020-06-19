package com.windows.handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		System.out.println(parentGUID);

		WebElement clkbtn = driver.findElement(By.linkText("Click Here"));
		clkbtn.click();
		// get all session id of browser
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		System.out.println("total size: " + allGUID.size());
		System.out.println("title before act: " + driver.getTitle());
		driver.quit();
	}
}
