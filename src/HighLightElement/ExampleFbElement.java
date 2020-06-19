package HighLightElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import HighLightElement.Helper;

public class ExampleFbElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Helper.highlightelement(driver, email);
		email.sendKeys("podder");
		WebElement pass = driver.findElement(By.id("pass"));
		Helper.highlightelement(driver, pass);
		pass.sendKeys("podder");
		WebElement login = driver.findElement(By.id("u_0_b"));
		Helper.highlightelement(driver, login);
		login.click();
		System.out.println("test case okay");
		driver.close();
	}
}