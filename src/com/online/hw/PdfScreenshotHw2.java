package com.online.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfScreenshotHw2 {

	public static void main(String[] args)
			throws InterruptedException, DocumentException, MalformedURLException, IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\webdrive\\chromedriver.exe";
		String Url = "https://www.facebook.com/";
		String Url1 = "https://www.google.co.in/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// take screenshot byte array type
		byte[] input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Thread.sleep(2000);
		driver.get(Url1);
		byte[] input1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document doc = new Document();
		String output = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\ResultPDF\\secondonlinehw.pdf";
		FileOutputStream fos = new FileOutputStream(output);
		// instantiate the pdf writer
		PdfWriter writer = PdfWriter.getInstance(doc, fos);
		// open the pdf for writing
		writer.open();
		doc.open();
		// process content into and image
		Image img = Image.getInstance(input);
		Image img1 = Image.getInstance(input1);
		// set the size of the image
		img.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight() / 2);
		img1.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight() / 2);
		// add image to pdf
		doc.add(img);
		doc.add(new Paragraph(" "));
		doc.add(img1);
		doc.add(new Paragraph(" "));
		// close the files and save to local drive
		doc.close();
		writer.close();
		System.out.println("success");
		driver.close();
	}
}
