package scrollSeleniumJavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPageEx1 {

	public static void main(String args[]) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		driver.quit();
	}
}
