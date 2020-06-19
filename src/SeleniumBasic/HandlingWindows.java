package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		String title = driver.getTitle();
		System.out.println("the title of the main window is " + title);
		// open new tabbed windows
		WebElement tabbedWindow = driver.findElement(By.xpath("//a[@href='http://www.sakinalium.in']"));
		tabbedWindow.click();
		Thread.sleep(2000);

		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		String mainWindow = iter.next();
		String tabWindow = iter.next();
		driver.switchTo().window(tabWindow);
		title = driver.getTitle();
		System.out.println("the title of the tabbed window is " + title);

		driver.switchTo().window(mainWindow);
		title = driver.getTitle();
		System.out.println("the title of the main window is from tabbed " + title);

		// open new separate windows
		WebElement separateWindow = driver.findElement(By.xpath("//a[@href='#Seperate']"));
		separateWindow.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		Set<String> windowIds1 = driver.getWindowHandles();
		Iterator<String> iter1 = windowIds1.iterator();
		String mainWindow1 = iter1.next();
		String tabWindow1 = iter1.next();
		driver.switchTo().window(tabWindow1);
		title = driver.getTitle();
		System.out.println("the title of the tabbed window is " + title);

		driver.switchTo().window(mainWindow1);
		title = driver.getTitle();
		System.out.println("the title of the main window is from tabbed " + title);

		// open new separate multiple windows
		WebElement separatemulWindow = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		separateWindow.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		Set<String> windowIds2 = driver.getWindowHandles();
		Iterator<String> iter2 = windowIds2.iterator();
		String mainWindow2 = iter2.next();
		String tabWindow2 = iter2.next();
		driver.switchTo().window(tabWindow2);
		title = driver.getTitle();
		System.out.println("the title of the tabbed window is " + title);

		driver.switchTo().window(mainWindow2);
		title = driver.getTitle();
		System.out.println("the title of the main window is from tabbed " + title);

	}

}
