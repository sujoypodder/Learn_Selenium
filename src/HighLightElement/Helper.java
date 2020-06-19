package HighLightElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

	public static void highlightelement(WebDriver driver, WebElement ele) {

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red');", ele);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		je.executeScript("arguments[0].setAttribute('style','border:solid 2px red');", ele);
	}

}
