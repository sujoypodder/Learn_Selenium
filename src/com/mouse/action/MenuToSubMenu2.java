package com.mouse.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuToSubMenu2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		// Instantiate Action Class
		Actions act = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		act.moveToElement(menu).perform();
		WebElement submenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
		// act.moveToElement(menu).build().perform();
		submenu.click();
		System.out.println("okay build");
		// Close the main window
		driver.close();
	}
}
