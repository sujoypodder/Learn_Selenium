package com.webpage.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/?firstname=&submit=&photo=&continents=AS");
		driver.manage().window().maximize();
//		WebElement flink = driver.findElement(By.linkText("Partial Link Test"));
//		flink.click();
//		WebElement slink = driver.findElement(By.linkText("Link Test"));
//		slink.click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("king");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.sendKeys("robert");
		Thread.sleep(2000);
//		WebElement fbtn = driver.findElement(By.id("buttonwithclass"));
//		fbtn.click();
//		Thread.sleep(2000);
		WebElement sexrbtn = driver.findElement(By.id("sex-0"));
		sexrbtn.click();
		Thread.sleep(2000);
		WebElement jerbtn = driver.findElement(By.id("exp-0"));
		jerbtn.click();
		Thread.sleep(2000);
		WebElement datetext = driver.findElement(By.id("datepicker"));
		datetext.sendKeys("19/05/2020");
		Thread.sleep(2000);
		WebElement pcbox = driver.findElement(By.id("profession-1"));
		pcbox.click();
		Thread.sleep(2000);
		WebElement fileup = driver.findElement(By.id("photo"));
		fileup.sendKeys("C:\\Users\\88016\\Documents\\cp.jpg");
		Thread.sleep(2000);
//		WebElement tlink = driver.findElement(By.linkText("Selenium Automation Hybrid Framework"));
//		tlink.click();
//		WebElement frlink = driver.findElement(By.linkText("Test File to Download"));
//		frlink.click();
		WebElement acbox = driver.findElement(By.id("tool-2"));
		acbox.click();
		Thread.sleep(2000);
		WebElement cdd = driver.findElement(By.id("continents"));
		Select sel = new Select(cdd);
		sel.selectByValue("AUS");
		Thread.sleep(2000);
		WebElement cmdd1 = driver.findElement(By.id("continentsmultiple"));
		Select sel1 = new Select(cmdd1);
		boolean sinormul = sel1.isMultiple();
		if (sinormul) {
			System.out.println("multiple dropdown");
		} else {
			System.out.println("single dropdown");
		}
		sel1.selectByValue("AS");
		sel1.selectByValue("AUS");
		Thread.sleep(2000);
		WebElement cmdd2 = driver.findElement(By.id("selenium_commands"));
		Select sel2 = new Select(cmdd2);
		boolean sinormul2 = sel2.isMultiple();
		if (sinormul2) {
			System.out.println("multiple dropdown");
		} else {
			System.out.println("single dropdown");
		}
		sel2.selectByVisibleText("Switch Commands");
		sel2.selectByVisibleText("Wait Commands");
		Thread.sleep(2000);
		WebElement fsbtn = driver.findElement(By.id("submit"));
		fsbtn.click();
		Thread.sleep(5000);
//		WebElement ssbtn = driver.findElement(By.id("submit1"));
//		ssbtn.click();
//		WebElement tbtn = driver.findElement(By.id("submit2"));
//		tbtn.click();
//		WebElement fobtn = driver.findElement(By.id("submit3"));
//		fobtn.click();
		System.out.println("good job");
		driver.quit();
	}
}
