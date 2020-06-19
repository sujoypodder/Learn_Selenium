 package com.online.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfScreenshotHw3 {

	public static void main(String[] args)
			throws DocumentException, MalformedURLException, IOException, InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.youtube.com/"; // http://the-internet.herokuapp.com/windows
		String Url1 = "https://www.imdb.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		/*
		 * String parentGUID = driver.getWindowHandle(); System.out.println(parentGUID);
		 */
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// take screenshot byte array type
		HomeWork3Page.pdfScreenshot(driver, "youtubebrowser");
		Thread.sleep(2000);
		driver.get(Url1);
		/*
		 * WebElement clkbtn = driver.findElement(By.linkText("Click Here"));
		 * clkbtn.click(); // get all session id of browser Set<String> allGUID =
		 * driver.getWindowHandles(); // child for (String childGUID : allGUID) { if
		 * (!childGUID.equals(parentGUID)) { driver.switchTo().window(childGUID);
		 * driver.navigate().to("https://www.google.co.in/"); Thread.sleep(2000);
		 * System.out.println(driver.getTitle()); break; } }
		 */
		HomeWork3Page.pdfScreenshot(driver, "imdbbrowser");
		System.out.println("success");
		driver.quit();
	}
}
