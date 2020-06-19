package com.chekhboxndradiobutton.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBoxandRadiobEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);

//		WebElement maleradio = driver.findElement(By.xpath("//*[@id=\"male\"]"));
//		maleradio.click();
//		Thread.sleep(2000);
		WebElement langradio = driver.findElement(By.xpath("//*[@id=\"java\"]"));
		langradio.click();
		Thread.sleep(2000);
		WebElement hobbycbox = driver.findElement(By.xpath("//*[@id=\"code\"]"));
		hobbycbox.click();
		if (!hobbycbox.isSelected()) {
			hobbycbox.click();
		}
		Thread.sleep(2000);
		System.out.println("success");
		driver.close();
	}
}
