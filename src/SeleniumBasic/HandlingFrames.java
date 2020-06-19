package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("SingleFrame");
		
		//using webelement
		WebElement drive = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(drive);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		//change the frame button 
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("a[href='#Multiple']")).click();
		
		//from one frame to another
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("webdriver");
		System.out.println("complete");
		
	}
	
}
