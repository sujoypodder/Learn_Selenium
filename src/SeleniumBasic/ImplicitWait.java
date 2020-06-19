package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();

		boolean status = driver.findElement(By.xpath("//p[@id='demo']")).isDisplayed();
		if (status) {
			System.out.println("test case passes");
		} else {
			System.out.println("test case passes");
		}

	}
}
//implicitly only working for showing or only visible elements.
