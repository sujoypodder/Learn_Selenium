package com.screenshot.demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/checkboxes";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
		// take screenshot file type
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// find x and y coordinate using selenium point
		Point point = element.getLocation();
		int Xcoordinate = point.getX();
		int Ycoordinate = point.getY();
		// find height and width using selenium size method
		int imgHeight = element.getSize().getHeight();
		int imgWidth = element.getSize().getWidth();
		// read full image
		BufferedImage img = ImageIO.read(srcFile);
		// cut image using height.,width,x,y
		BufferedImage finalimg = img.getSubimage(Xcoordinate, Ycoordinate, imgWidth, imgHeight);
		ImageIO.write(finalimg, "png", srcFile);
		// save file
		FileUtils.copyFile(srcFile,
				new File("C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\Screenshots\\elementss.png"), true);
		System.out.println("taken appropriately");
		driver.close();
	}
}
