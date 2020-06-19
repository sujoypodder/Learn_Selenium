package com.mouse.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuToSubMenu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/menu/");// --http://demoqa.com/slider/
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		// Instantiate Action Class
		Actions act = new Actions(driver);

		WebElement menu = driver.findElement(By.id("ui-id-9"));
		act.moveToElement(menu).perform();
		//
		WebElement submenu = driver.findElement(By.xpath("//*[@id='ui-id-10']"));
		act.moveToElement(submenu).perform();
		//
		WebElement selectmenu = driver.findElement(By.id("ui-id-12"));
		selectmenu.click();

		/*
		 * driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); //
		 * Instantiate Action Class Actions actions = new Actions(driver); // Retrieve
		 * WebElemnt 'slider' to perform mouse hover WebElement slider =
		 * driver.findElement(By.id("slider")); // Move mouse to x offset 50 i.e. in
		 * horizontal direction actions.moveToElement(slider, 50, 0).perform();
		 * slider.click(); System.out.println("Moved slider in horizontal directions");
		 */
		// Close the main window
		driver.close();
	}

}
