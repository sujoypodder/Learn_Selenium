package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement daydropdown = driver.findElement(By.id("day"));
		Select day = new Select(daydropdown);
		day.selectByValue("10");

		Thread.sleep(2000);
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select month = new Select(monthdropdown);
		month.selectByIndex(4);

		Thread.sleep(2000);
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select year = new Select(yeardropdown);
		year.selectByVisibleText("1996");

		System.out.println("test case passes");

	}

}
