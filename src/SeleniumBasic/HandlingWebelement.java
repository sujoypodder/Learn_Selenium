package SeleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWebelement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(2000);
		List<WebElement> emailids = driver
				.findElements(By.cssSelector(".ui-grid-canvas>div>div>div:nth-child(1) >div"));
		List<String> allemails = new ArrayList<String>();
		for (WebElement emailId : emailids) {
			allemails.add(emailId.getText());
		}
		for (String email : allemails) {
			System.out.println(email);
		}
		if (allemails.contains("Maheshraj@gmail.com")) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}

		/*
		 * int position = 0; for (WebElement email : emailids) { position++; if
		 * (email.getText().equals("priti1@xyz.com")) { break; } }
		 */

		/*
		 * String desiredPencilIcon =
		 * ".ui-grid-canvas >div:nth-child(1) >div >div:nth-child(6) .fa-pencil";
		 * WebElement pencilsymbol =
		 * driver.findElement(By.cssSelector(desiredPencilIcon)); // double click
		 * Actions action = new Actions(driver);
		 * action.moveToElement(pencilsymbol).doubleClick().build().perform();
		 * 
		 * driver.switchTo().defaultContent();
		 * driver.findElement(By.xpath("//style[@class='btn btn-danger btn-xs']")).click
		 * ();
		 */

		/*
		 * String desireddeleteicon =
		 * ".ui-grid-canvas >div:nth-child(1) >div >div:nth-child(6) .fa-trash-o ";
		 * WebElement deletesymbol =
		 * driver.findElement(By.cssSelector(desireddeleteicon)); // right click *
		 * Actions action1 = new Actions(driver); //
		 * action1.moveToElement(pencilsymbol).contextClick().build().perform();
		 * action1.contextClick(deletesymbol).build().perform();
		 */
		edittableRowusingEmail("priti1@xyz.com");
		deletetableRowusingEmail("qazie@gmail.com");

	}

	public static void edittableRowusingEmail(String email) {

		List<WebElement> emailids = driver
				.findElements(By.cssSelector(".ui-grid-canvas>div>div>div:nth-child(1) >div"));
		int position = 0;
		for (WebElement email1 : emailids) {
			position++;
			if (email1.getText().equals(email)) {
				break;
			}
		}

		String desiredPencilIcon = ".ui-grid-canvas >div:nth-child(" + position + ") >div >div:nth-child(6) .fa-pencil";
		WebElement pencilsymbol = driver.findElement(By.cssSelector(desiredPencilIcon)); // double click
		Actions action = new Actions(driver);
		action.moveToElement(pencilsymbol).doubleClick().build().perform();

	}

	public static void deletetableRowusingEmail(String email) {

		List<WebElement> emailids = driver
				.findElements(By.cssSelector(".ui-grid-canvas>div>div>div:nth-child(1) >div"));
		int position = 0;
		for (WebElement email1 : emailids) {
			position++;
			if (email1.getText().equals(email)) {
				break;
			}
		}
		String desireddeleteicon = ".ui-grid-canvas >div:nth-child(" + position
				+ ") >div >div:nth-child(6) .fa-trash-o ";
		WebElement deletesymbol = driver.findElement(By.cssSelector(desireddeleteicon));
		// right click
		Actions action1 = new Actions(driver); //
		action1.contextClick(deletesymbol).build().perform();

	}

}
//*[@id="1585348913393-2-uiGrid-0005-cell"]
