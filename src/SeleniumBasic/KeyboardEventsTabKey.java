package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsTabKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		act.sendKeys(Keys.TAB).sendKeys("webdriver").sendKeys(Keys.TAB).sendKeys("0147852").sendKeys(Keys.TAB)
				.sendKeys("sfvggx").build().perform();
	}
}
