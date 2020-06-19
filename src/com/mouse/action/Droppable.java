package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.id("droppable")));
		act.dragAndDropBy(driver.findElement(By.id("draggable")), 145, 45).perform();
		System.out.println("okay");
		driver.close();
	}
}
