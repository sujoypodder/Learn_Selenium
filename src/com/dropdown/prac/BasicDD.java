package com.dropdown.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDD {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu1\"]"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1 = driver
				.findElement(By.xpath("//*[@id=\"post-body-4615304122771162527\"]/div[1]/div/ul/li[3]/a"));
		ele1.click();
		Thread.sleep(5000);
//		Select sel = new Select(ele);
//		sel.selectByVisibleText("About Us");

		System.out.println("success");
		driver.quit();
	}
}
