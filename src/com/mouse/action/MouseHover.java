package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement menu = driver
				.findElement(By.xpath("//*[@id=\"post-body-4229879368008023176\"]/div[1]/div[2]/button"));
		act.moveToElement(menu).perform();
		WebElement smenu = driver
				.findElement(By.xpath("//*[@id=\"post-body-4229879368008023176\"]/div[1]/div[2]/div/a[1]"));
		smenu.click();
		Thread.sleep(3000); 
		System.out.println("okay");
		driver.quit();
	}

}
