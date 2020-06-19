package SeleniumBasic;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("http://demo.automationtesting.in/Index.html"); WebElement
		 * skipsignbutton = driver.findElement(By.id("btn2")); skipsignbutton.click();
		 */
		driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement skillsdropdown=driver.findElement(By.id("Skills"));
	    skillsdropdown.click();
		
		List <WebElement> skills= driver.findElements(By.cssSelector("select#Skills"));
		for(WebElement skill:skills) {
			if(skill.getText().equals("Java")) {
				skill.click();
				break;
			}
			System.out.println("complete");
		}
		driver.quit();
         
	}

}
