package com.dropdown.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		// Language | click | id=msdd |
				driver.findElement(By.id("msdd")).click();
				Thread.sleep(2000);

				// Select language | click | linkText=English |
				driver.findElement(By.linkText("English")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();
				
				//----------------------
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
				Thread.sleep(2000);
				// Select country | click | xpath=Japan |
				driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[7]")).click();
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,1000)");
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();


	}

}
