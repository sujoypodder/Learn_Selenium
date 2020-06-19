package com.windows.handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulChildParentMoveWindow {

	public static void main(String[] args) throws InterruptedException {

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
		// child
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(childGUID);
				driver.navigate().to("https://www.youtube.com/");
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
		}
		// back to parent
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(parentGUID);
				driver.navigate().to("https://www.imdb.com/");
				// driver.get("https://www.google.co.in/");
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
		}
		// again switch to child
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(childGUID);
				driver.close();
			}
		}

		// driver.quit();
	}
}
