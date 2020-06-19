package com.javascript.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/javascript_alerts";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		button.click();
		Thread.sleep(3000);
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		System.out.println("test successfull");
	}
}