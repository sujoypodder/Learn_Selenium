package com.javascript.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/javascript_alerts";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// okay
		WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		button.click();
		Thread.sleep(3000);
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		String inputtext = "QA Automation testing";
		driver.switchTo().alert().sendKeys(inputtext);
		driver.switchTo().alert().accept();
		String expectText = "You entered: " + inputtext; // .concat(inputtext);
		System.out.println("expect text is: " + expectText);
		String outputText = driver.findElement(By.id("result")).getText();
		System.out.println("output text is: " + outputText);
		if (expectText.equals(outputText)) {
			System.out.println("test successfull");
		} else {
			System.out.println("test fail");
		}
	}
}