package com.dropdown.prac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSMP {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://demo.automationtesting.in/Register.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);

		// first Example
//		WebElement customdd = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[4]/a"));
//		customdd.click();

		// 2nd Example custom dropdown
		WebElement customdd = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		customdd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[4]/a"))
				.click();
		Thread.sleep(2000);
		// Search select dropdown
		WebElement dropdownElement = driver.findElement(By.xpath("//span[@role='combobox']"));
		String singleOrMulti = dropdownElement.getAttribute("multiple");
		if (singleOrMulti != null) {
			System.out.println("Dropdown is Multi value dropdown");
		} else {
			System.out.println("Dropdown is Single value dropdown");
		}
		dropdownElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bangladesh");

	}

}
