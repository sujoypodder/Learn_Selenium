package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");

		WebElement assenddrop = driver.findElement(By.id("tools"));
		assenddrop.click();

		List<WebElement> dropdowns = driver.findElements(By.cssSelector("toolsselect#tools"));
		for (WebElement dropdown : dropdowns) {
			if (dropdown.getText().equals("Cucumber")) {
				dropdown.click();
				break;
			}
			System.out.println("complete");
		}
	}

}
