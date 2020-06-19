package com.online.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HomeWork3Page {

	public static void pdfScreenshot(WebDriver driver, String pdfname)
			throws DocumentException, MalformedURLException, IOException {

		byte[] input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document doc = new Document();
		String output = "C:\\Users\\88016\\eclipse-workspace\\OnlineHomeWork\\ResultPDF\\" + pdfname + ".pdf";
		FileOutputStream fos = new FileOutputStream(output);
		// instantiate the pdf writer
		PdfWriter writer = PdfWriter.getInstance(doc, fos);
		// open the pdf for writing
		writer.open();
		doc.open();
		// process content into and image
		Image img = Image.getInstance(input);
		// set the size of the image
		img.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight() / 2);
		// add image to pdf
		doc.add(img);
		doc.add(new Paragraph(" "));
		// close the files and save to local drive
		doc.close();
		writer.close();
	}
}
