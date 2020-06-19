package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\SeleniumProTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstnametextbox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstnametextbox.sendKeys("first name");
		WebElement lastnametextbox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastnametextbox.sendKeys("last name");
		WebElement addresstextbox = driver.findElement(By.tagName("textarea"));
		addresstextbox.sendKeys("address");
		WebElement emailtextbox = driver.findElement(By.xpath("//input[@type='email']"));
		emailtextbox.sendKeys("email");
		WebElement phonetextbox = driver.findElement(By.xpath("//input[@type='tel']"));
		phonetextbox.sendKeys("1234567890");

		/*
		 * WebElement maleradiobutton =
		 * driver.findElement(By.xpath("//input[@value='Male']"));
		 * maleradiobutton.click(); Thread.sleep(2000); maleradiobutton.click();
		 */

		WebElement femaleradiobutton = driver.findElement(By.xpath("//input[@value='FeMale']"));
		femaleradiobutton.click();

		/*
		 * WebElement cricketchekhbox = driver.findElement(By.id("checkbox1"));
		 * cricketchekhbox.click(); // Thread.sleep(3000); // cricketchekhbox.click();
		 * if (!cricketchekhbox.isSelected()) { cricketchekhbox.click(); }
		 * 
		 * WebElement movieschekhbox = driver.findElement(By.id("checkbox2"));
		 * movieschekhbox.click(); // Thread.sleep(3000); // movieschekhbox.click(); if
		 * (!movieschekhbox.isSelected()) { movieschekhbox.click(); }
		 */
		WebElement hockeychekhbox = driver.findElement(By.id("checkbox3"));
		hockeychekhbox.click(); // Thread.sleep(3000); // hockeychekhbox.click();
		if (!hockeychekhbox.isSelected()) {
			hockeychekhbox.click();
		}

		WebElement languagedrop = driver.findElement(By.id("msdd"));
		Select slct = new Select(languagedrop);
		List<WebElement> dropdowns = slct.getOptions();
		for (WebElement dropdown : dropdowns) {
			System.out.println("complete");
		}
		slct.selectByVisibleText("Czech");

		WebElement skillsdropdown = driver.findElement(By.id("Skills"));
		Select skills = new Select(skillsdropdown);
		skills.selectByIndex(2);
		/*
		 * Thread.sleep(2000); skills.selectByVisibleText("APIs"); Thread.sleep(2000);
		 * skills.selectByValue("CSS");
		 */

		WebElement countrydropdown = driver.findElement(By.id("countries"));
		Select countries = new Select(countrydropdown);
		/*
		 * countries.selectByIndex(4); Thread.sleep(2000);
		 * countries.selectByValue("Bangladesh"); Thread.sleep(2000);
		 */
		countries.selectByVisibleText("Canada");

		WebElement selectcountrycombo = driver.findElement(By.id("Skills"));
		selectcountrycombo.click();

		List<WebElement> comboboxes = driver.findElements(By.cssSelector("select#Skills"));
		for (WebElement cobobox : comboboxes) {
			if (cobobox.getText().equals("India")) {
				cobobox.click();
				break;
			}
			// System.out.println("complete");
		}

		WebElement yeardropdown = driver.findElement(By.id("yearbox"));
		Select years = new Select(yeardropdown);
		years.selectByVisibleText("1995");

		WebElement monthdropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select months = new Select(monthdropdown);
		months.selectByVisibleText("November");

		WebElement daydropdown = driver.findElement(By.id("daybox"));
		Select days = new Select(daydropdown);
		days.selectByVisibleText("19");

		WebElement passwordtextbox = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		passwordtextbox.sendKeys("password123");

		WebElement confirmpasswordtextbox = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpasswordtextbox.sendKeys("password123");

		WebElement submitbutton = driver.findElement(By.id("submitbtn"));
		submitbutton.click();

		/*
		 * WebElement refreshbutton = driver.findElement(By.id("Button1"));
		 * refreshbutton.click();
		 */

		System.out.println("testing successfully complete");

	}

}
