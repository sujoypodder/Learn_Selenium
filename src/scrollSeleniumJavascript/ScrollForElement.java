package scrollSeleniumJavascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollForElement {

	public static void main(String args[]) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbars-synchronization-demo.html");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//div[@id='mCSB_3_container']/p[10]"));
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		System.out.println(ele.getText());

	}
}