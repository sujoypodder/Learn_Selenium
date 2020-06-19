package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingjavascriptAlert {
	static Alert alert;
	static String text;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		// alert with ok
		driver.findElement(By.id("OKTab")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		// alert with ok and cancel
		driver.findElement(By.xpath("//a[@href = '#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		text = driver.findElement(By.id("demo")).getText();
		System.out.println("afer click button " + text);

		driver.findElement(By.id("CancelTab")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		text = driver.findElement(By.id("demo")).getText();
		System.out.println("afer click button " + text);
		//alter with nextbox
		driver.findElement(By.xpath("//a[@href = '#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text1=alert.getText();
		System.out.println("the alert text is "+text1);
		alert.sendKeys("selenium tester");
		alert.accept();
		text= driver.findElement(By.id("demo1")).getText();
		System.out.println("after entering your name "+text1);

	}

}
